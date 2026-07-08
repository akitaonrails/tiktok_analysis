package X;

/* JADX INFO: renamed from: X.1D8X, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public abstract class C1D8X extends C1D8Z {
    public C1D8X(InterfaceC2250961D8k interfaceC2250961D8k) {
        super(interfaceC2250961D8k, true);
    }

    @Override // X.C1D8Z, X.C1D86
    public final void LJII(final AbstractC1404540mea abstractC1404540mea) {
        final InterfaceC2250961D8k<C1D8Z> interfaceC2250961D8k = this.LIZ;
        interfaceC2250961D8k.LJIILIIL(new C1D8S(interfaceC2250961D8k, abstractC1404540mea) { // from class: X.1D8U
            public final AbstractC1404540mea LIZLLL;

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Finish-Canceled cause:");
                sbLIZ.append(this.LIZLLL);
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.C1D8Z, X.C1D86
            public final void LIZJ(Object obj) {
                InterfaceC2250961D8k<C1D8Z> interfaceC2250961D8k2 = this.LIZ;
                interfaceC2250961D8k2.LJIILIIL(new C1D8Q(interfaceC2250961D8k2, obj) { // from class: X.1D8P
                    public final Object LIZLLL;

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Finish-CancelFinish info:");
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
                this.LIZLLL = abstractC1404540mea;
            }
        });
        this.LIZ.LJIIIZ(abstractC1404540mea);
    }
}
