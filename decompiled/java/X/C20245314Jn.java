package X;

import android.view.WindowInsets;

/* JADX INFO: renamed from: X.14Jn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20245314Jn extends C20245014Jk {
    public C20244814Ji LJIILL;
    public C20244814Ji LJIILLIIL;
    public C20244814Ji LJIIZILJ;

    @Override // X.C14K2, X.C20244514Jf
    public final void LJIILLIIL(C20244814Ji c20244814Ji) {
    }

    @Override // X.C20244514Jf
    public final C20244814Ji LJI() {
        if (this.LJIILLIIL == null) {
            this.LJIILLIIL = C20244814Ji.LIZLLL(this.LIZLLL.getMandatorySystemGestureInsets());
        }
        return this.LJIILLIIL;
    }

    @Override // X.C20244514Jf
    public final C20244814Ji LJIIIIZZ() {
        if (this.LJIILL == null) {
            this.LJIILL = C20244814Ji.LIZLLL(this.LIZLLL.getSystemGestureInsets());
        }
        return this.LJIILL;
    }

    @Override // X.C20244514Jf
    public final C20244814Ji LJIIJ() {
        if (this.LJIIZILJ == null) {
            this.LJIIZILJ = C20244814Ji.LIZLLL(this.LIZLLL.getTappableElementInsets());
        }
        return this.LJIIZILJ;
    }

    public C20245314Jn(C20244614Jg c20244614Jg, WindowInsets windowInsets) {
        super(c20244614Jg, windowInsets);
    }
}
