package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.13YL, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13YL extends C13YG {
    public final Function1<Object, Unit> LJFF;
    public final C13YG LJI;

    @Override // X.C13YG
    public final boolean LJFF() {
        return true;
    }

    @Override // X.C13YG
    public final Function1<Object, Unit> LJIIIIZZ() {
        return null;
    }

    @Override // X.C13YG
    public final void LJIIL() {
    }

    @Override // X.C13YG
    public final void LIZJ() {
        if (this.LIZJ) {
            return;
        }
        if (this.LIZIZ != this.LJI.LJI()) {
            LIZ();
        }
        this.LJI.LJIIJJI();
        super.LIZJ();
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
    public final /* bridge */ /* synthetic */ Function1 LJ() {
        return this.LJFF;
    }

    @Override // X.C13YG
    public final void LJIILIIL(C13YP c13yp) {
        C13YC c13yc = C13YE.LIZ;
        "Cannot modify a state object in a read-only snapshot".toString();
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // X.C13YG
    public final C13YG LJIJJ(Function1 function1) {
        return new C13YL(this.LIZIZ, this.LIZ, C13YE.LJIIJ(function1, this.LJFF, true), this.LJI);
    }

    public C13YL(long j, C13BZ c13bz, Function1<Object, Unit> function1, C13YG c13yg) {
        super(j, c13bz);
        this.LJFF = function1;
        this.LJI = c13yg;
        c13yg.LJIIJ();
    }
}
