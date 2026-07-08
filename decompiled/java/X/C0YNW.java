package X;

/* JADX INFO: renamed from: X.0YNW, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YNW implements C0YNR {
    public final C0YHX LIZ;
    public final InterfaceC876950Yaj LIZIZ;
    public final InterfaceC878180Yci LIZJ;
    public final InterfaceC874680YTa LIZLLL;
    public final AbstractC880230Yg1 LJ;
    public final InterfaceC873120YNa LJFF;
    public final InterfaceC874840YTq LJI;
    public final InterfaceC907380Zii LJII;
    public final C0YVS LJIIIIZZ;
    public final InterfaceC876320YZi LJIIIZ;
    public final C01GW LJIIJ = C452501pT.LIZIZ(new C0YNX());

    public static final String LIZ(int i, String str) {
        long jLIZLLL = C866950Xzh.LIZLLL(str);
        if (jLIZLLL <= 0) {
            C882400YjW.LIZ.getClass();
            C882400YjW.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getConversationIdByUid toUid invalid: ");
            sbLIZ.append(str);
            C882690Yjz.LJFF("InternalService", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZ();
        C883250Ykt c883250Ykt = C883250Ykt.LL;
        long jLIZJ = C461720I8s.LIZJ();
        if (jLIZJ <= 0) {
            C882400YjW.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getConversationIdByUid self uid invalid: ");
            sbLIZ2.append(jLIZJ);
            sbLIZ2.append(", ");
            C882400YjW.LIZ();
            sbLIZ2.append(C461720I8s.LJ());
            C882690Yjz.LJFF("InternalService", C2188811AlT.LIZIZ(sbLIZ2));
            return null;
        }
        return C2124408Ty.LIZ(i, jLIZLLL, jLIZJ);
    }

    public C0YNW(C0YHX c0yhx, InterfaceC876950Yaj interfaceC876950Yaj, InterfaceC878180Yci interfaceC878180Yci, InterfaceC874680YTa interfaceC874680YTa, AbstractC880230Yg1 abstractC880230Yg1, InterfaceC873120YNa interfaceC873120YNa, InterfaceC874840YTq interfaceC874840YTq, InterfaceC907380Zii interfaceC907380Zii, C0YVS c0yvs, C0YMN c0ymn, InterfaceC876320YZi interfaceC876320YZi) {
        this.LIZ = c0yhx;
        this.LIZIZ = interfaceC876950Yaj;
        this.LIZJ = interfaceC878180Yci;
        this.LIZLLL = interfaceC874680YTa;
        this.LJ = abstractC880230Yg1;
        this.LJFF = interfaceC873120YNa;
        this.LJI = interfaceC874840YTq;
        this.LJII = interfaceC907380Zii;
        this.LJIIIIZZ = c0yvs;
        this.LJIIIZ = interfaceC876320YZi;
    }
}
