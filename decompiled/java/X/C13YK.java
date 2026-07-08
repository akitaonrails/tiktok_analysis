package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.13YK, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13YK extends C13YG {
    public final C13YG LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public Function1<Object, Unit> LJIIIIZZ;
    public final long LJIIIZ;

    @Override // X.C13YG
    public final void LIZJ() {
        C13YG c13yg;
        this.LIZJ = true;
        if (!this.LJII || (c13yg = this.LJFF) == null) {
            return;
        }
        c13yg.LIZJ();
    }

    @Override // X.C13YG
    public final Function1<Object, Unit> LJIIIIZZ() {
        return null;
    }

    public final C13YG LJIJJLI() {
        C13YG c13yg = this.LJFF;
        return c13yg == null ? C13YE.LJIIIZ : c13yg;
    }

    @Override // X.C13YG
    public final C13BZ LIZLLL() {
        return LJIJJLI().LIZLLL();
    }

    @Override // X.C13YG
    public final boolean LJFF() {
        return LJIJJLI().LJFF();
    }

    @Override // X.C13YG
    public final long LJI() {
        return LJIJJLI().LJI();
    }

    @Override // X.C13YG
    public final void LJIIJ() {
        C19977013Ei.LIZ();
        throw null;
    }

    @Override // X.C13YG
    public final void LJIIJJI() {
        C19977013Ei.LIZ();
        throw null;
    }

    @Override // X.C13YG
    public final void LJIIL() {
        LJIJJLI().LJIIL();
    }

    @Override // X.C13YG
    public final /* bridge */ /* synthetic */ Function1 LJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.C13YG
    public final void LJIILIIL(C13YP c13yp) {
        LJIJJLI().LJIILIIL(c13yp);
    }

    @Override // X.C13YG
    public final C13YG LJIJJ(Function1<Object, Unit> function1) {
        Function1<Object, Unit> function1LJIIJ = C13YE.LJIIJ(function1, this.LJIIIIZZ, true);
        if (!this.LJI) {
            return C13YE.LJI(LJIJJLI().LJIJJ(null), function1LJIIJ, true);
        }
        return LJIJJLI().LJIJJ(function1LJIIJ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13YK(C13YG c13yg, Function1 function1, boolean z) {
        Function1<Object, Unit> function1LJ;
        super(0L, C13BZ.LLILZIL);
        C13YC c13yc = C13YE.LIZ;
        this.LJFF = c13yg;
        this.LJI = false;
        this.LJII = z;
        this.LJIIIIZZ = C13YE.LJIIJ(function1, (c13yg == null || (function1LJ = c13yg.LJ()) == null) ? C13YE.LJIIIZ.LJFF : function1LJ, false);
        this.LJIIIZ = C13YX.LIZ();
    }
}
