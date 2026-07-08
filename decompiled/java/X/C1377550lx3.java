package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lx3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1377550lx3 implements InterfaceC1377580lx6 {
    public final Activity LIZ;
    public DialogC1389620mGW LIZIZ;

    @Override // X.InterfaceC1377580lx6
    public final void LIZ() {
    }

    public final void LIZIZ() {
        C1389890mGx c1389890mGx = new C1389890mGx(this.LIZ);
        c1389890mGx.LJIIIZ(R.string.shz);
        c1389890mGx.LJIIJJI();
        DialogC1389620mGW dialogC1389620mGW = this.LIZIZ;
        if (dialogC1389620mGW == null || !dialogC1389620mGW.isShowing()) {
            return;
        }
        DialogC1389620mGW dialogC1389620mGW2 = this.LIZIZ;
        dialogC1389620mGW2.dismiss();
        C785410UrT.LIZ(dialogC1389620mGW2);
    }

    public final void LIZJ() {
        Activity activity = this.LIZ;
        if (this.LIZIZ == null && activity != null) {
            DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(activity);
            this.LIZIZ = dialogC1389620mGW;
            dialogC1389620mGW.LJJLJ(2131846487);
            C0FNV.LIZJ(this.LIZIZ);
        }
        DialogC1389620mGW dialogC1389620mGW2 = this.LIZIZ;
        if (dialogC1389620mGW2 == null || dialogC1389620mGW2.isShowing()) {
            return;
        }
        C786410Ut5.J4(this.LIZIZ);
    }

    public C1377550lx3(Activity activity) {
        this.LIZ = activity;
    }

    @Override // X.InterfaceC1377580lx6
    public void onSuccess(String str) {
        DialogC1389620mGW dialogC1389620mGW = this.LIZIZ;
        if (dialogC1389620mGW != null && dialogC1389620mGW.isShowing()) {
            DialogC1389620mGW dialogC1389620mGW2 = this.LIZIZ;
            dialogC1389620mGW2.dismiss();
            C785410UrT.LIZ(dialogC1389620mGW2);
        }
    }
}
