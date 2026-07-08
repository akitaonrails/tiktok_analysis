package X;

import Y.ACListenerS124S0200000_21;
import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import u4.q0;

/* JADX INFO: renamed from: X.0ll9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1370170ll9 implements InterfaceC1370040lkw {
    public boolean LIZ = true;
    public boolean LIZIZ = true;

    @Override // X.InterfaceC1370040lkw
    public final void LIZ(Dialog dialog) {
    }

    @Override // X.InterfaceC1370040lkw
    public void LIZIZ(Dialog dialog) {
    }

    @Override // X.InterfaceC1370040lkw
    public void LJFF(Dialog dialog) {
    }

    @Override // X.InterfaceC1370040lkw
    public final void LIZJ(boolean z) {
        if (this.LIZ != z) {
            this.LIZ = z;
        }
    }

    @Override // X.InterfaceC1370040lkw
    public final void LJ(boolean z) {
        if (z && !this.LIZ) {
            this.LIZ = true;
        }
        this.LIZIZ = z;
    }

    @Override // X.InterfaceC1370040lkw
    public View LIZLLL(Dialog dialog, int i, View view, ViewGroup.LayoutParams layoutParams, C1361400lX0 c1361400lX0) {
        LayoutInflater layoutInflater = dialog.getLayoutInflater();
        if (c1361400lX0 != null) {
            layoutInflater = C786410Ut5.ne(c1361400lX0);
        }
        View viewSd = C786410Ut5.Sd(i, layoutInflater, null);
        View viewFindViewById = viewSd.findViewById(R.id.ijs);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS124S0200000_21(dialog, this, 53), viewFindViewById);
        }
        View viewFindViewById2 = viewSd.findViewById(R.id.nhw);
        if (viewFindViewById2 != null) {
            q0.LJIJ(viewFindViewById2, new C1402420mbA(this, 8));
        }
        return viewSd;
    }
}
