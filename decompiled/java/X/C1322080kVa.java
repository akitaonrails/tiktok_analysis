package X;

/* JADX INFO: renamed from: X.0kVa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1322080kVa implements InterfaceC1322070kVZ {
    public C1325700kbQ LIZ;
    public AbstractC1320720kTO LIZIZ;
    public C1322090kVb LIZJ;

    /* JADX WARN: Type inference failed for: r0v1, types: [REQUEST, X.0kbR] */
    @Override // X.InterfaceC1322070kVZ
    public final void LIZ(int i, int i2) {
        C1325700kbQ c1325700kbQ = this.LIZ;
        AbstractC1320720kTO abstractC1320720kTO = this.LIZIZ;
        if (c1325700kbQ == null) {
            return;
        }
        c1325700kbQ.LIZJ = new C1324630kZh(i, i2);
        abstractC1320720kTO.LIZLLL = c1325700kbQ.LIZ();
        this.LIZJ.setController(abstractC1320720kTO.LIZ());
    }

    public C1322080kVa(C1325700kbQ c1325700kbQ, AbstractC1320720kTO abstractC1320720kTO, C1322090kVb c1322090kVb) {
        c1322090kVb.getClass();
        this.LIZ = c1325700kbQ;
        this.LIZIZ = abstractC1320720kTO;
        this.LIZJ = c1322090kVb;
    }
}
