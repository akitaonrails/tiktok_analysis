package X;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: X.14Jl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20245114Jl extends C20245314Jn {
    public static final C20244614Jg LJIJ = C20244614Jg.LIZLLL(null, WindowInsets.CONSUMED);

    @Override // X.C20244714Jh, X.C20244514Jf
    public final void LIZLLL(View view) {
    }

    @Override // X.C20244714Jh, X.C20244514Jf
    public final boolean LJIILIIL() {
        return this.LIZLLL.isVisible(C14KT.LIZ(8));
    }

    @Override // X.C20244714Jh, X.C20244514Jf
    public final C20244814Ji LJFF(int i) {
        return C20244814Ji.LIZLLL(this.LIZLLL.getInsets(C14KT.LIZ(i)));
    }

    public C20245114Jl(C20244614Jg c20244614Jg, WindowInsets windowInsets) {
        super(c20244614Jg, windowInsets);
    }
}
