/**
 Student id:D210084B
 Name:Cho Yuan Sen
 Batch Number:CS21-B
 Submission Date:10/1/2022
 Title:Book Store Management System
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CS_JP_Project_2021C_D210084B extends Application {

	private TextField tfDefianceSellAmount = new TextField();
	private TextField tfDefianceTotalEarn = new TextField();
	private TextField tfCaptainNobodySellAmount = new TextField();
	private TextField tfCaptainNobodyTotalEarn = new TextField();
	private TextField tfJungleBookSellAmount = new TextField();
	private TextField tfJungleBookTotalEarn = new TextField();
	private TextField tfGrimmFairyTalesSellAmount = new TextField();
	private TextField tfGrimmFairyTalesTotalEarn = new TextField();
	private TextField tfGarfieldSellAmount = new TextField();
	private TextField tfGarfieldTotalEarn = new TextField();
	private TextField tfDuneSellAmount = new TextField();
	private TextField tfDuneTotalEarn = new TextField();
	private TextField tfInfernoSellAmount = new TextField();
	private TextField tfInfernoTotalEarn = new TextField();
	private TextField tfTotalEarn = new TextField();
	private Button btCalculate = new Button("Calculate");

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {

		GridPane gridPane = new GridPane();
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		gridPane.add(new Label("Books"), 0, 0);
		gridPane.add(new Label("Price"), 1, 0);
		gridPane.add(new Label("Sell Amounts"), 2, 0);
		gridPane.add(new Label("Total Earns(each book)"), 3, 0);
		gridPane.add(new Label("Defiance"), 0, 1);
		gridPane.add(new Label("RM20"), 1, 1);		
		gridPane.add(tfDefianceSellAmount, 2, 1);
		gridPane.add(tfDefianceTotalEarn, 3, 1);
		gridPane.add(new Label("Captain Nobody"), 0, 2);
		gridPane.add(new Label("RM18"), 1, 2);
		gridPane.add(tfCaptainNobodySellAmount, 2, 2);
		gridPane.add(tfCaptainNobodyTotalEarn, 3, 2);
		gridPane.add(new Label("Jungle Book"), 0, 3);
		gridPane.add(new Label("RM15"), 1, 3);
		gridPane.add(tfJungleBookSellAmount, 2, 3);
		gridPane.add(tfJungleBookTotalEarn, 3, 3);
		gridPane.add(new Label("Grimm's Fairy Tales"), 0, 4);
		gridPane.add(new Label("RM23"), 1, 4);
		gridPane.add(tfGrimmFairyTalesSellAmount, 2, 4);
		gridPane.add(tfGrimmFairyTalesTotalEarn, 3, 4);
		gridPane.add(new Label("Garfield"), 0, 5);
		gridPane.add(new Label("RM17"), 1, 5);
		gridPane.add(tfGarfieldSellAmount, 2, 5);
		gridPane.add(tfGarfieldTotalEarn, 3, 5);
		gridPane.add(new Label("Dune"), 0, 6);
		gridPane.add(new Label("RM28"), 1, 6);
		gridPane.add(tfDuneSellAmount, 2, 6);
		gridPane.add(tfDuneTotalEarn, 3, 6);
		gridPane.add(new Label("Inferno"), 0, 7);
		gridPane.add(new Label("RM30"), 1, 7);
		gridPane.add(tfInfernoSellAmount, 2, 7);
		gridPane.add(tfInfernoTotalEarn, 3, 7);
		gridPane.add(new Label("Total Earn"), 2, 8);
		gridPane.add(tfTotalEarn, 3, 8);
		gridPane.add(btCalculate, 3, 9);
		
		//Set properties for UI
		gridPane.setAlignment(Pos.CENTER);
		tfDefianceSellAmount.setAlignment(Pos.BOTTOM_LEFT);
		tfDefianceTotalEarn.setAlignment(Pos.BOTTOM_LEFT);
		tfCaptainNobodySellAmount.setAlignment(Pos.BOTTOM_LEFT);
		tfCaptainNobodyTotalEarn.setAlignment(Pos.BOTTOM_LEFT);
		tfJungleBookSellAmount.setAlignment(Pos.BOTTOM_LEFT);
		tfJungleBookTotalEarn.setAlignment(Pos.BOTTOM_LEFT);
		tfGrimmFairyTalesSellAmount.setAlignment(Pos.BOTTOM_LEFT);
		tfGrimmFairyTalesTotalEarn.setAlignment(Pos.BOTTOM_LEFT);
		tfGarfieldSellAmount.setAlignment(Pos.BOTTOM_LEFT);
		tfGarfieldTotalEarn.setAlignment(Pos.BOTTOM_LEFT);
		tfDuneSellAmount.setAlignment(Pos.BOTTOM_LEFT);
		tfDuneTotalEarn.setAlignment(Pos.BOTTOM_LEFT);
		tfInfernoSellAmount.setAlignment(Pos.BOTTOM_LEFT);
		tfInfernoTotalEarn.setAlignment(Pos.BOTTOM_LEFT);
		tfTotalEarn.setAlignment(Pos.BOTTOM_LEFT);
		tfDefianceTotalEarn.setEditable(false);
		tfCaptainNobodyTotalEarn.setEditable(false);
		tfJungleBookTotalEarn.setEditable(false);
		tfGrimmFairyTalesTotalEarn.setEditable(false);
		tfGarfieldTotalEarn.setEditable(false);
		tfDuneTotalEarn.setEditable(false);
		tfInfernoTotalEarn.setEditable(false);
		tfTotalEarn.setEditable(false);
		GridPane.setHalignment(btCalculate, HPos.RIGHT);
		
		//Process events
		btCalculate.setOnAction(e -> calculateTotalEarn());
		
		//Create a scene and place it in the stage
		Scene scene = new Scene(gridPane, 700, 400);
		primaryStage.setTitle("Book Store"); // Set title
    	primaryStage.setScene(scene); // Place the scene in the stage
    	primaryStage.show(); // Display the stage
	}
    
    private void calculateTotalEarn(){
    	double defianceSellAmount = Double.parseDouble(tfDefianceSellAmount.getText());
    	double captainNobodySellAmount = Double.parseDouble(tfCaptainNobodySellAmount.getText());
    	double jungleBookSellAmount = Double.parseDouble(tfJungleBookSellAmount.getText());
    	double grimmFairyTalesSellAmount = Double.parseDouble(tfGrimmFairyTalesSellAmount.getText());
    	double garfieldSellAmount = Double.parseDouble(tfGarfieldSellAmount.getText());
    	double duneSellAmount = Double.parseDouble(tfDuneSellAmount.getText());
    	double infernoSellAmount = Double.parseDouble(tfInfernoSellAmount.getText());
    	
    	//Create a Total object
    	Total total = new Total(defianceSellAmount, captainNobodySellAmount, jungleBookSellAmount, grimmFairyTalesSellAmount, garfieldSellAmount, duneSellAmount, infernoSellAmount);
    	
    	//Display total earn
    	tfDefianceTotalEarn.setText(String.format("$%.2f", total.getDefianceTotalEarn()));
    	tfCaptainNobodyTotalEarn.setText(String.format("$%.2f", total.getCaptainNobodyTotalEarn()));
    	tfJungleBookTotalEarn.setText(String.format("$%.2f", total.getJungleBookTotalEarn()));
    	tfGrimmFairyTalesTotalEarn.setText(String.format("$%.2f", total.getGrimmFairyTalesTotalEarn()));
    	tfGarfieldTotalEarn.setText(String.format("$%.2f", total.getGarfieldTotalEarn()));
    	tfDuneTotalEarn.setText(String.format("$%.2f", total.getDuneTotalEarn()));
    	tfInfernoTotalEarn.setText(String.format("$%.2f", total.getInfernoTotalEarn()));
    	tfTotalEarn.setText(String.format("$%.2f",total.getTotalEarn()));
    }
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}