package component;

import javax.swing.JComponent;
import javax.swing.JProgressBar;
import javax.swing.plaf.ComponentUI;

public class ProgressBar extends JProgressBar {

	public static ComponentUI createUI(JComponent c) {
		return new ProgressBarUI();
	}
	
	public void installUI(JComponent c){
		
	}
	
	public void uninstallUI (JComponent c){
		
	}
}
