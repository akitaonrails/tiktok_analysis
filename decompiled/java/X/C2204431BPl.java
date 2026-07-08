package X;

/* JADX INFO: renamed from: X.1BPl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2204431BPl implements InterfaceC1530550pvp {
    public final /* synthetic */ C1BP6 LIZ;
    public final /* synthetic */ Object LIZIZ;
    public final /* synthetic */ InterfaceC1530550pvp LIZJ;

    public /* synthetic */ C2204431BPl(C1BP6 c1bp6, String str, Object obj, InterfaceC1530550pvp interfaceC1530550pvp) {
        this.LIZ = c1bp6;
        this.LIZIZ = obj;
        this.LIZJ = interfaceC1530550pvp;
    }

    @Override // X.InterfaceC1530550pvp
    public final void accept(Object obj) {
        C1BP6 c1bp6 = this.LIZ;
        InterfaceC1530550pvp interfaceC1530550pvp = this.LIZJ;
        c1bp6.getClass();
        C2204191BOn c2204191BOn = (C2204191BOn) obj;
        c1bp6.LIZJ(c2204191BOn.getCode(), null, c2204191BOn.getMessage(), c2204191BOn.getCause());
        C1BP6.LIZLLL(interfaceC1530550pvp, c2204191BOn);
    }
}
