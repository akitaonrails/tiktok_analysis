package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Window;

/* JADX INFO: renamed from: X.0bA7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractDialogC962810bA7 extends AbstractDialogC972150bPB {
    @Override // android.app.Dialog
    @InterfaceC1294060jmO
    public final void onBackPressed() {
    }

    @Override // X.AbstractDialogC972150bPB
    public final LayoutInflater LJJZZI() {
        return C972080bP4.LIZ(super.LJJZZI());
    }

    public AbstractDialogC962810bA7(Context context) {
        super(context);
    }

    @Override // X.AbstractDialogC972150bPB, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(48);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, (int) (C497740JfY.LJIILLIIL() * 0.7f));
        }
        setCanceledOnTouchOutside(true);
    }
}
