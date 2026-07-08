package X;

import kotlin.jvm.internal.AwS614S0100000_35;

/* JADX INFO: renamed from: X.1D8d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2250891D8d extends AbstractC2250861D8a {
    public final AbstractC2250861D8a LIZLLL;

    @Override // X.AbstractC2250861D8a, X.C1D86
    public final void LIZLLL() {
        if (!(this.LIZLLL instanceof C2250901D8e)) {
            InterfaceC2250961D8k<AbstractC2250861D8a> interfaceC2250961D8k = this.LIZ;
            interfaceC2250961D8k.LJIILIIL(new C2250881D8c(interfaceC2250961D8k));
            this.LIZ.onStart();
        } else {
            InterfaceC2250961D8k<AbstractC2250861D8a> interfaceC2250961D8k2 = this.LIZ;
            interfaceC2250961D8k2.LJIILIIL(new C2250881D8c(interfaceC2250961D8k2));
            this.LIZ.LJI(new AwS614S0100000_35(this, 8), ((C2250901D8e) this.LIZLLL).LIZLLL);
        }
    }

    @Override // X.AbstractC2250861D8a, X.C1D86
    public final void LJII(AbstractC1404540mea abstractC1404540mea) {
        InterfaceC2250961D8k<AbstractC2250861D8a> interfaceC2250961D8k = this.LIZ;
        interfaceC2250961D8k.LJIILIIL(new C2250871D8b(interfaceC2250961D8k, abstractC1404540mea));
        this.LIZ.LJIIIZ(abstractC1404540mea);
    }

    @Override // X.AbstractC2250861D8a, X.C1D86
    public final void LJIIIIZZ(Object obj) {
        InterfaceC2250961D8k<AbstractC2250861D8a> interfaceC2250961D8k = this.LIZ;
        interfaceC2250961D8k.LJIILIIL(new C2250901D8e(interfaceC2250961D8k, obj));
        this.LIZ.LJIIJJI(obj);
    }

    public C2250891D8d(InterfaceC2250961D8k<AbstractC2250861D8a> interfaceC2250961D8k, AbstractC2250861D8a abstractC2250861D8a) {
        super(interfaceC2250961D8k, false);
        this.LIZLLL = abstractC2250861D8a;
    }

    @Override // X.AbstractC2250861D8a, X.C1D86
    public final void LJIILLIIL(C1435220nS4 c1435220nS4, C556300Lro c556300Lro) {
        InterfaceC2250961D8k<AbstractC2250861D8a> interfaceC2250961D8k = this.LIZ;
        interfaceC2250961D8k.LJIILIIL(new C2250941D8i(interfaceC2250961D8k, c1435220nS4));
        this.LIZ.LJFF(c1435220nS4, false, false, c556300Lro);
    }

    @Override // X.AbstractC2250861D8a, X.C1D86
    public final void LJIIJ(Object obj, boolean z, C556300Lro c556300Lro) {
        InterfaceC2250961D8k<AbstractC2250861D8a> interfaceC2250961D8k = this.LIZ;
        interfaceC2250961D8k.LJIILIIL(new C1D8N(interfaceC2250961D8k, obj));
        this.LIZ.LJ(obj, z, false, false, c556300Lro);
    }
}
