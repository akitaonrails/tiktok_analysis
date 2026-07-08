package X;

/* JADX INFO: renamed from: X.1BPi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2204401BPi implements InterfaceC1530550pvp {
    public final /* synthetic */ C1BP4 LIZ;
    public final /* synthetic */ InterfaceC1530550pvp LIZIZ;

    public /* synthetic */ C2204401BPi(InterfaceC1530550pvp interfaceC1530550pvp, C1BP4 c1bp4) {
        this.LIZ = c1bp4;
        this.LIZIZ = interfaceC1530550pvp;
    }

    @Override // X.InterfaceC1530550pvp
    public final void accept(Object obj) {
        C1BP4 c1bp4 = this.LIZ;
        InterfaceC1530550pvp interfaceC1530550pvp = this.LIZIZ;
        String str = (String) obj;
        c1bp4.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c1bp4.LJII);
        sbLIZ.append("Handle error from worker(Error: ");
        sbLIZ.append(str);
        sbLIZ.append(")");
        C1BPP.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        interfaceC1530550pvp.accept(str);
    }
}
