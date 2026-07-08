package X;

import kotlin.jvm.internal.AFwS283S0000000_35;

/* JADX INFO: renamed from: X.1D8V, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D8V extends C1D8X {
    public final String toString() {
        return "Runnable-Running";
    }

    public C1D8V(InterfaceC2250961D8k<C1D8Z> interfaceC2250961D8k) {
        super(interfaceC2250961D8k);
    }

    @Override // X.C1D8Z, X.C1D86
    public final void LJIIIIZZ(final Object obj) {
        final InterfaceC2250961D8k<C1D8Z> interfaceC2250961D8k = this.LIZ;
        interfaceC2250961D8k.LJIILIIL(new C1D8X(interfaceC2250961D8k, obj) { // from class: X.1D8W
            public final Object LIZLLL;

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Runnable-Paused info:");
                sbLIZ.append(this.LIZLLL);
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.C1D8Z, X.C1D86
            public final void LJIILL(Object obj2) {
                InterfaceC2250961D8k<C1D8Z> interfaceC2250961D8k2 = this.LIZ;
                interfaceC2250961D8k2.LJIILIIL(new C1D8V(interfaceC2250961D8k2));
                this.LIZ.LJI(AFwS283S0000000_35.get$arr$(1), obj2);
            }

            {
                this.LIZLLL = obj;
            }
        });
        this.LIZ.LJIIJJI(obj);
    }

    @Override // X.C1D8Z, X.C1D86
    public final void LJIILLIIL(final C1435220nS4 c1435220nS4, C556300Lro c556300Lro) {
        final InterfaceC2250961D8k<C1D8Z> interfaceC2250961D8k = this.LIZ;
        interfaceC2250961D8k.LJIILIIL(new C1D8S(interfaceC2250961D8k, c1435220nS4) { // from class: X.1D8T
            public final C1435220nS4 LIZLLL;

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Finish-Failed exception:");
                sbLIZ.append(this.LIZLLL);
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.C1D8Z, X.C1D86
            public final void LIZJ(Object obj) {
                InterfaceC2250961D8k<C1D8Z> interfaceC2250961D8k2 = this.LIZ;
                interfaceC2250961D8k2.LJIILIIL(new C1D8Q(interfaceC2250961D8k2, obj) { // from class: X.1D8O
                    public final Object LIZLLL;

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Finish-FailedFinish info:");
                        sbLIZ.append(this.LIZLLL);
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    {
                        this.LIZLLL = obj;
                    }
                });
                this.LIZ.LIZ(obj);
            }

            {
                this.LIZLLL = c1435220nS4;
            }
        });
        this.LIZ.LJFF(c1435220nS4, false, false, c556300Lro);
    }

    @Override // X.C1D8Z, X.C1D86
    public final void LJIIJ(final Object obj, boolean z, C556300Lro c556300Lro) {
        final InterfaceC2250961D8k<C1D8Z> interfaceC2250961D8k = this.LIZ;
        interfaceC2250961D8k.LJIILIIL(new C1D8Q(interfaceC2250961D8k, obj) { // from class: X.1D8R
            public final Object LIZLLL;

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Finish-Success result:");
                sbLIZ.append(this.LIZLLL);
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZLLL = obj;
            }
        });
        this.LIZ.LJ(obj, z, false, false, c556300Lro);
    }
}
