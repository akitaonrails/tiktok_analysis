package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.13YJ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13YJ extends C13YF {
    public final C13YF LJIILL;
    public final boolean LJIILLIIL;
    public final boolean LJIIZILJ;
    public Function1<Object, Unit> LJIJ;
    public Function1<Object, Unit> LJIJI;
    public final long LJIJJ;

    @Override // X.C13YF, X.C13YG
    public final void LIZJ() {
        C13YF c13yf;
        this.LIZJ = true;
        if (!this.LJIIZILJ || (c13yf = this.LJIILL) == null) {
            return;
        }
        c13yf.LIZJ();
    }

    public final C13YF LJJIIZ() {
        C13YF c13yf = this.LJIILL;
        return c13yf == null ? C13YE.LJIIIZ : c13yf;
    }

    @Override // X.C13YG
    public final C13BZ LIZLLL() {
        return LJJIIZ().LIZLLL();
    }

    @Override // X.C13YF, X.C13YG
    public final boolean LJFF() {
        return LJJIIZ().LJFF();
    }

    @Override // X.C13YG
    public final long LJI() {
        return LJJIIZ().LJI();
    }

    @Override // X.C13YF, X.C13YG
    public final int LJII() {
        return LJJIIZ().LJII();
    }

    @Override // X.C13YF, X.C13YG
    public final void LJIIJ() {
        C19977013Ei.LIZ();
        throw null;
    }

    @Override // X.C13YF, X.C13YG
    public final void LJIIJJI() {
        C19977013Ei.LIZ();
        throw null;
    }

    @Override // X.C13YF, X.C13YG
    public final void LJIIL() {
        LJJIIZ().LJIIL();
    }

    @Override // X.C13YF
    public final C13YQ LJIL() {
        return LJJIIZ().LJIL();
    }

    @Override // X.C13YF
    public final C19994113Kx<C13YP> LJJ() {
        return LJJIIZ().LJJ();
    }

    @Override // X.C13YF, X.C13YG
    public final Function1 LJ() {
        return this.LJIJ;
    }

    @Override // X.C13YF, X.C13YG
    public final Function1<Object, Unit> LJIIIIZZ() {
        return this.LJIJI;
    }

    @Override // X.C13YF
    /* JADX INFO: renamed from: LJJI */
    public final Function1<Object, Unit> LJ() {
        return this.LJIJ;
    }

    @Override // X.C13YF, X.C13YG
    public final void LJIILIIL(C13YP c13yp) {
        LJJIIZ().LJIILIIL(c13yp);
    }

    @Override // X.C13YG
    public final void LJIIZILJ(C13BZ c13bz) {
        C19977013Ei.LIZ();
        throw null;
    }

    @Override // X.C13YG
    public final void LJIJ(long j) {
        C19977013Ei.LIZ();
        throw null;
    }

    @Override // X.C13YF, X.C13YG
    public final void LJIJI(int i) {
        LJJIIZ().LJIJI(i);
    }

    @Override // X.C13YF, X.C13YG
    public final C13YG LJIJJ(Function1<Object, Unit> function1) {
        Function1<Object, Unit> function1LJIIJ = C13YE.LJIIJ(function1, this.LJIJ, true);
        if (!this.LJIILLIIL) {
            return C13YE.LJI(LJJIIZ().LJIJJ(null), function1LJIIJ, true);
        }
        return LJJIIZ().LJIJJ(function1LJIIJ);
    }

    @Override // X.C13YF
    public final void LJJIIJ(C19994113Kx<C13YP> c19994113Kx) {
        C19977013Ei.LIZ();
        throw null;
    }

    @Override // X.C13YF
    public final C13YF LJJIIJZLJL(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        Function1<Object, Unit> function1LJIIJ = C13YE.LJIIJ(function1, this.LJIJ, true);
        Function1<Object, Unit> function1LIZ = C13YE.LIZ(function12, this.LJIJI);
        if (!this.LJIILLIIL) {
            return new C13YJ(LJJIIZ().LJJIIJZLJL(null, function1LIZ), function1LJIIJ, function1LIZ, false, true);
        }
        return LJJIIZ().LJJIIJZLJL(function1LJIIJ, function1LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C13YJ(C13YF c13yf, Function1<Object, Unit> function1, Function1<Object, Unit> function12, boolean z, boolean z2) {
        Function1<Object, Unit> function1LJIIIIZZ;
        Function1<Object, Unit> function1LJ;
        C13YC c13yc = C13YE.LIZ;
        super(0L, C13BZ.LLILZIL, C13YE.LJIIJ(function1, (c13yf == null || (function1LJ = c13yf.LJ()) == null) ? C13YE.LJIIIZ.LJFF : function1LJ, z), C13YE.LIZ(function12, (c13yf == null || (function1LJIIIIZZ = c13yf.LJIIIIZZ()) == null) ? C13YE.LJIIIZ.LJI : function1LJIIIIZZ));
        this.LJIILL = c13yf;
        this.LJIILLIIL = z;
        this.LJIIZILJ = z2;
        this.LJIJ = this.LJFF;
        this.LJIJI = this.LJI;
        this.LJIJJ = C13YX.LIZ();
    }
}
