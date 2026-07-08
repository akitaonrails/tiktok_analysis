package X;

/* JADX INFO: renamed from: X.0iyp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1263330iyp {
    public final boolean LIZ;
    public C1263190iyb LIZIZ;
    public final EnumC1263380iyu LIZJ;
    public final AbstractC1263470iz3 LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LoadContext(isRefresh: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", params: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", origin: ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", merge:");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C1263330iyp LIZ(C1263330iyp c1263330iyp, EnumC1263380iyu enumC1263380iyu) {
        boolean z = c1263330iyp.LIZ;
        C1263190iyb c1263190iyb = c1263330iyp.LIZIZ;
        AbstractC1263470iz3 abstractC1263470iz3 = c1263330iyp.LIZLLL;
        c1263330iyp.getClass();
        return new C1263330iyp(z, c1263190iyb, enumC1263380iyu, abstractC1263470iz3);
    }

    public C1263330iyp(boolean z, C1263190iyb c1263190iyb, EnumC1263380iyu enumC1263380iyu, AbstractC1263470iz3 abstractC1263470iz3) {
        this.LIZ = z;
        this.LIZIZ = c1263190iyb;
        this.LIZJ = enumC1263380iyu;
        this.LIZLLL = abstractC1263470iz3;
    }
}
