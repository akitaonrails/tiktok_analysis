package X;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.14Vz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20277714Vz {
    public DialogC1389620mGW LIZ;
    public WeakReference<InterfaceC20277514Vx> LIZIZ;

    public final void LIZ() {
        DialogC1389620mGW dialogC1389620mGW = this.LIZ;
        if (dialogC1389620mGW == null) {
            return;
        }
        C786410Ut5.LJIIJ(dialogC1389620mGW);
        this.LIZ = null;
        WeakReference<InterfaceC20277514Vx> weakReference = this.LIZIZ;
        if (weakReference != null) {
            weakReference.clear();
            this.LIZIZ = null;
        }
    }

    public final void LIZIZ(Context context) {
        DialogC1389620mGW dialogC1389620mGW = this.LIZ;
        if (dialogC1389620mGW != null && dialogC1389620mGW.isShowing()) {
            return;
        }
        DialogC1389620mGW dialogC1389620mGW2 = new DialogC1389620mGW(context);
        this.LIZ = dialogC1389620mGW2;
        dialogC1389620mGW2.LJJLJ(2131857960);
        C786410Ut5.J4(this.LIZ);
    }

    public final void LIZJ(Context context, InterfaceC20277514Vx interfaceC20277514Vx) {
        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(context);
        this.LIZ = dialogC1389620mGW;
        dialogC1389620mGW.LJJLJ(2131857960);
        this.LIZIZ = new WeakReference<>(interfaceC20277514Vx);
        this.LIZ.setOnCancelListener(new DialogInterfaceOnCancelListenerC20307114d3(this, 2));
        C786410Ut5.J4(this.LIZ);
    }
}
