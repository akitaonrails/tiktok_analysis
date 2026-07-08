package X;

/* JADX INFO: renamed from: X.1D8Z, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public abstract class C1D8Z implements C1D86 {
    public final InterfaceC2250961D8k<C1D8Z> LIZ;
    public final boolean LIZIZ;
    public final C1D84 LIZJ;

    public C1D8Z() {
        throw null;
    }

    @Override // X.C1D86
    public final void LIZLLL() {
        LJ("start in schedule");
    }

    @Override // X.C1D86
    public void start() {
        LJ("start");
    }

    public final void LIZ(String str) {
        C1D84 c1d84 = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LibScheduleError Node: call ");
        sbLIZ.append(str);
        sbLIZ.append(" on state:");
        sbLIZ.append(this);
        c1d84.LIZIZ(777001, C2188811AlT.LIZIZ(sbLIZ), null);
    }

    @Override // X.C1D86
    public final void LIZIZ(Object obj) {
        LIZ("restart");
    }

    @Override // X.C1D86
    public void LIZJ(Object obj) {
        LIZ("cancelFinish");
    }

    public final void LJ(String str) {
        C1D84 c1d84 = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NormalInvalidError Node: call ");
        sbLIZ.append(str);
        sbLIZ.append(" on state:");
        sbLIZ.append(this);
        c1d84.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C1D86
    public void LJII(AbstractC1404540mea abstractC1404540mea) {
        LJ("cancel");
    }

    @Override // X.C1D86
    public void LJIIIIZZ(Object obj) {
        LJ("pause");
    }

    @Override // X.C1D86
    public void LJIILL(Object obj) {
        LJ("resume");
    }

    public C1D8Z(InterfaceC2250961D8k interfaceC2250961D8k, boolean z) {
        C1D84 c1d84LJIIL = interfaceC2250961D8k.LJIIL();
        this.LIZ = interfaceC2250961D8k;
        this.LIZIZ = z;
        this.LIZJ = c1d84LJIIL;
    }

    @Override // X.C1D86
    public void LJIILLIIL(C1435220nS4 c1435220nS4, C556300Lro c556300Lro) {
        LIZ("setFailed");
    }

    @Override // X.C1D86
    public void LJIIJ(Object obj, boolean z, C556300Lro c556300Lro) {
        LIZ("setSuccess");
    }
}
