package X;

import kotlin.jvm.internal.AwS614S0100000_35;

/* JADX INFO: renamed from: X.1D8e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2250901D8e extends AbstractC2250931D8h {
    public final Object LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Runnable-Paused info:");
        sbLIZ.append(this.LIZLLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC2250861D8a, X.C1D86
    public final void LJIILL(Object obj) {
        if (this.LIZ.LJIIZILJ()) {
            InterfaceC2250961D8k<AbstractC2250861D8a> interfaceC2250961D8k = this.LIZ;
            interfaceC2250961D8k.LJIILIIL(new C2250891D8d(interfaceC2250961D8k, this));
            this.LIZ.LJIILJJIL();
        } else {
            InterfaceC2250961D8k<AbstractC2250861D8a> interfaceC2250961D8k2 = this.LIZ;
            interfaceC2250961D8k2.LJIILIIL(new C2250881D8c(interfaceC2250961D8k2));
            this.LIZ.LJI(new AwS614S0100000_35(this, 7), obj);
        }
    }

    public C2250901D8e(InterfaceC2250961D8k<AbstractC2250861D8a> interfaceC2250961D8k, Object obj) {
        super(interfaceC2250961D8k);
        this.LIZLLL = obj;
    }

    @Override // X.AbstractC2250861D8a, X.C1D86
    public final void LJIILLIIL(C1435220nS4 c1435220nS4, C556300Lro c556300Lro) {
        this.LIZ.LJFF(c1435220nS4, false, true, c556300Lro);
    }

    @Override // X.AbstractC2250861D8a, X.C1D86
    public final void LJIIJ(Object obj, boolean z, C556300Lro c556300Lro) {
        this.LIZ.LJ(obj, z, false, true, c556300Lro);
    }
}
