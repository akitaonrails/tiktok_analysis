package X;

/* JADX INFO: renamed from: X.1D8a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractC2250861D8a implements C1D86 {
    public final InterfaceC2250961D8k<AbstractC2250861D8a> LIZ;
    public final boolean LIZIZ;
    public final C1D84 LIZJ;

    public AbstractC2250861D8a() {
        throw null;
    }

    @Override // X.C1D86
    public void LIZLLL() {
        LIZ("startInSchedule");
    }

    @Override // X.C1D86
    public void start() {
        LIZ("start");
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
    public void LIZIZ(Object obj) {
        LIZ("restart");
    }

    @Override // X.C1D86
    public void LIZJ(Object obj) {
        LIZ("cancelFinish");
    }

    public final void LJ(String str) {
        C1D84 c1d84 = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TaskRunningError Node: call ");
        sbLIZ.append(str);
        sbLIZ.append(" on state:");
        sbLIZ.append(this);
        c1d84.LIZIZ(777002, C2188811AlT.LIZIZ(sbLIZ), null);
    }

    @Override // X.C1D86
    public void LJII(AbstractC1404540mea abstractC1404540mea) {
        LIZ("cancel");
    }

    @Override // X.C1D86
    public void LJIIIIZZ(Object obj) {
        LIZ("pause");
    }

    @Override // X.C1D86
    public void LJIILL(Object obj) {
        LIZ("resume");
    }

    public AbstractC2250861D8a(InterfaceC2250961D8k interfaceC2250961D8k, boolean z) {
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
