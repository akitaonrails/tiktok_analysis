package X;

import android.view.View;

/* JADX INFO: renamed from: X.0ecA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1095520ecA {
    public final View LIZ;
    public final View LIZIZ;
    public final InterfaceC1095550ecD LIZJ;
    public final View LIZLLL;

    public final void LIZ(float f) {
        View view = this.LIZ;
        if (view != null) {
            C786410Ut5.T4(view, f);
        }
        View view2 = this.LIZLLL;
        if (view2 != null) {
            C786410Ut5.T4(view2, f);
        }
        View view3 = this.LIZIZ;
        if (view3 != null) {
            C786410Ut5.T4(view3, f);
        }
        if (f == 0.0f) {
            View view4 = this.LIZIZ;
            if (view4 != null) {
                C500260Jjc.LJIILIIL(view4);
                return;
            }
            return;
        }
        View view5 = this.LIZIZ;
        if (view5 == null) {
            return;
        }
        C500260Jjc.LLFFF(view5);
    }

    public C1095520ecA(View view, View view2, InterfaceC1095550ecD interfaceC1095550ecD, View view3) {
        this.LIZ = view;
        this.LIZIZ = view2;
        this.LIZJ = interfaceC1095550ecD;
        this.LIZLLL = view3;
    }
}
