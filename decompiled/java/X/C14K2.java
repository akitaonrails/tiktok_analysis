package X;

import android.view.WindowInsets;

/* JADX INFO: renamed from: X.14K2, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C14K2 extends C20244714Jh {
    public C20244814Ji LJIILJJIL;

    @Override // X.C20244514Jf
    public final C20244614Jg LIZIZ() {
        return C20244614Jg.LIZLLL(null, this.LIZLLL.consumeStableInsets());
    }

    @Override // X.C20244514Jf
    public final C20244614Jg LIZJ() {
        return C20244614Jg.LIZLLL(null, this.LIZLLL.consumeSystemWindowInsets());
    }

    @Override // X.C20244514Jf
    public final C20244814Ji LJII() {
        if (this.LJIILJJIL == null) {
            this.LJIILJJIL = C20244814Ji.LIZIZ(this.LIZLLL.getStableInsetLeft(), this.LIZLLL.getStableInsetTop(), this.LIZLLL.getStableInsetRight(), this.LIZLLL.getStableInsetBottom());
        }
        return this.LJIILJJIL;
    }

    @Override // X.C20244514Jf
    public final boolean LJIIJJI() {
        return this.LIZLLL.isConsumed();
    }

    @Override // X.C20244514Jf
    public void LJIILLIIL(C20244814Ji c20244814Ji) {
        this.LJIILJJIL = c20244814Ji;
    }

    public C14K2(C20244614Jg c20244614Jg, WindowInsets windowInsets) {
        super(c20244614Jg, windowInsets);
    }
}
