package X;

import X.C1D86;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1D88, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D88<T extends C1D86> implements C1D86, InterfaceC2250781D7s<T>, C1D89, InterfaceC2250961D8k<T> {
    public final Object LIZ;
    public final boolean LIZIZ;
    public final C1D84 LIZJ;
    public final C1D89 LIZLLL;
    public final C1D87<T> LJ;

    @Override // X.C1D89
    public final void LIZ(Object obj) {
        this.LIZLLL.LIZ(obj);
    }

    @Override // X.C1D86
    public final void LIZIZ(Object obj) {
        this.LJ.LIZIZ(obj);
    }

    @Override // X.C1D86
    public final void LIZJ(Object obj) {
        this.LJ.LIZJ(obj);
    }

    @Override // X.C1D86
    public final void LIZLLL() {
        this.LJ.LIZLLL();
    }

    @Override // X.C1D89
    public final void LJ(Object obj, boolean z, boolean z2, boolean z3, C556300Lro c556300Lro) {
        this.LIZLLL.LJ(obj, z, z2, z3, c556300Lro);
    }

    @Override // X.C1D89
    public final void LJFF(C1435220nS4 c1435220nS4, boolean z, boolean z2, C556300Lro c556300Lro) {
        this.LIZLLL.LJFF(c1435220nS4, z, z2, c556300Lro);
    }

    @Override // X.C1D89
    public final void LJI(Function1 function1, Object obj) {
        this.LIZLLL.LJI(function1, obj);
    }

    @Override // X.C1D86
    public final void LJII(AbstractC1404540mea abstractC1404540mea) {
        this.LJ.LJII(abstractC1404540mea);
    }

    @Override // X.C1D86
    public final void LJIIIIZZ(Object obj) {
        this.LJ.LJIIIIZZ(obj);
    }

    @Override // X.C1D89
    public final void LJIIIZ(AbstractC1404540mea abstractC1404540mea) {
        this.LIZLLL.LJIIIZ(abstractC1404540mea);
    }

    @Override // X.C1D86
    public final void LJIIJ(Object obj, boolean z, C556300Lro c556300Lro) {
        this.LJ.LJIIJ(obj, z, c556300Lro);
    }

    @Override // X.C1D89
    public final void LJIIJJI(Object obj) {
        this.LIZLLL.LJIIJJI(obj);
    }

    @Override // X.C1D89
    public final void LJIILJJIL() {
        this.LIZLLL.LJIILJJIL();
    }

    @Override // X.C1D86
    public final void LJIILL(Object obj) {
        this.LJ.LJIILL(obj);
    }

    @Override // X.C1D86
    public final void LJIILLIIL(C1435220nS4 c1435220nS4, C556300Lro c556300Lro) {
        this.LJ.LJIILLIIL(c1435220nS4, c556300Lro);
    }

    @Override // X.C1D89
    public final void LJIJ(Object obj) {
        this.LIZLLL.LJIJ(obj);
    }

    @Override // X.C1D89
    public final void onStart() {
        this.LIZLLL.onStart();
    }

    @Override // X.C1D86
    public final void start() {
        this.LJ.start();
    }

    @Override // X.InterfaceC2250791D7t
    public final C1D86 getState() {
        return this.LJ.LIZ;
    }

    @Override // X.InterfaceC2250961D8k
    public final C1D84 LJIIL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC2250961D8k
    public final boolean LJIIZILJ() {
        return this.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC2250981D8m
    public final void LJIILIIL(C1D86 c1d86) {
        C1D84 c1d84 = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Node:");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" ChangeState from:");
        sbLIZ.append(this.LJ.LIZ);
        sbLIZ.append(" to ");
        sbLIZ.append(c1d86);
        c1d84.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        this.LJ.LIZ = c1d86;
    }

    public C1D88(Object obj, boolean z, Function1 function1, C1D84 c1d84, C1D89 c1d89) {
        C1D87<T> c1d87 = new C1D87<>();
        this.LIZ = obj;
        this.LIZIZ = z;
        this.LIZJ = c1d84;
        this.LIZLLL = c1d89;
        this.LJ = c1d87;
        c1d87.LIZ = (T) function1.invoke(this);
    }
}
