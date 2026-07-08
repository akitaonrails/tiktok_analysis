package X;

/* JADX INFO: renamed from: X.1D8b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2250871D8b extends AbstractC2250971D8l {
    public final AbstractC1404540mea LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Finish-Canceled cause:");
        sbLIZ.append(this.LIZLLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC2250861D8a, X.C1D86
    public final void LIZJ(Object obj) {
        InterfaceC2250961D8k<AbstractC2250861D8a> interfaceC2250961D8k = this.LIZ;
        interfaceC2250961D8k.LJIILIIL(new C2250921D8g(interfaceC2250961D8k, obj));
        this.LIZ.LIZ(obj);
    }

    public C2250871D8b(InterfaceC2250961D8k<AbstractC2250861D8a> interfaceC2250961D8k, AbstractC1404540mea abstractC1404540mea) {
        super(interfaceC2250961D8k);
        this.LIZLLL = abstractC1404540mea;
    }

    @Override // X.AbstractC2250861D8a, X.C1D86
    public final void LJIILLIIL(C1435220nS4 c1435220nS4, C556300Lro c556300Lro) {
        InterfaceC2250961D8k<AbstractC2250861D8a> interfaceC2250961D8k = this.LIZ;
        interfaceC2250961D8k.LJIILIIL(new C2250921D8g(interfaceC2250961D8k, null));
        this.LIZ.LJFF(c1435220nS4, true, false, c556300Lro);
    }

    @Override // X.AbstractC2250861D8a, X.C1D86
    public final void LJIIJ(Object obj, boolean z, C556300Lro c556300Lro) {
        InterfaceC2250961D8k<AbstractC2250861D8a> interfaceC2250961D8k = this.LIZ;
        interfaceC2250961D8k.LJIILIIL(new C2250921D8g(interfaceC2250961D8k, null));
        this.LIZ.LJ(obj, z, true, false, c556300Lro);
    }
}
