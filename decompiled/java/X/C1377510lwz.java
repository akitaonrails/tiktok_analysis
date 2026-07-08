package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lwz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1377510lwz implements InterfaceC1377560lx4 {
    public final Activity LIZ;
    public DialogC1389620mGW LIZIZ;

    @Override // X.InterfaceC1377560lx4
    public final void LIZ() {
    }

    public final void LIZJ() {
        if (this.LIZIZ == null) {
            DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(this.LIZ);
            dialogC1389620mGW.LJJLJ(2131846487);
            this.LIZIZ = dialogC1389620mGW;
            C0FNV.LIZJ(dialogC1389620mGW);
        }
        DialogC1389620mGW dialogC1389620mGW2 = this.LIZIZ;
        if (dialogC1389620mGW2 == null || dialogC1389620mGW2.isShowing()) {
            return;
        }
        C786410Ut5.J4(dialogC1389620mGW2);
    }

    @Override // X.InterfaceC1377560lx4
    public final void onFailure() {
        C1389890mGx c1389890mGx = new C1389890mGx(this.LIZ);
        c1389890mGx.LJIIIZ(R.string.shz);
        c1389890mGx.LJIIJJI();
        DialogC1389620mGW dialogC1389620mGW = this.LIZIZ;
        if (dialogC1389620mGW == null || !dialogC1389620mGW.isShowing()) {
            return;
        }
        dialogC1389620mGW.dismiss();
        C785410UrT.LIZ(dialogC1389620mGW);
    }

    public C1377510lwz(Activity activity) {
        this.LIZ = activity;
    }
}
