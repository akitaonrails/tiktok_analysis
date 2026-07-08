package X;

/* JADX INFO: renamed from: X.13p2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20126613p2 extends AbstractC20128613pM {
    public String LIZ;
    public EnumC20127313p9 LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public Long LJ;
    public Long LJFF;
    public String LJI;

    public final C20126713p3 LIZ() {
        String strLIZIZ = "";
        if (this.LIZIZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append(" registrationStatus");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (this.LJ == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(" expiresInSecs");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (this.LJFF == null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(" tokenCreationEpochInSecs");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        if (strLIZIZ.isEmpty()) {
            return new C20126713p3(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ.longValue(), this.LJFF.longValue(), this.LJI);
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("Missing required properties:");
        sbLIZ4.append(strLIZIZ);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ4));
    }

    public C20126613p2() {
    }

    public C20126613p2(AbstractC20126913p5 abstractC20126913p5) {
        this.LIZ = abstractC20126913p5.LIZJ();
        this.LIZIZ = abstractC20126913p5.LJFF();
        this.LIZJ = abstractC20126913p5.LIZ();
        this.LIZLLL = abstractC20126913p5.LJ();
        this.LJ = Long.valueOf(abstractC20126913p5.LIZIZ());
        this.LJFF = Long.valueOf(abstractC20126913p5.LJI());
        this.LJI = abstractC20126913p5.LIZLLL();
    }

    public final C20126613p2 LIZIZ(EnumC20127313p9 enumC20127313p9) {
        if (enumC20127313p9 != null) {
            this.LIZIZ = enumC20127313p9;
            return this;
        }
        throw new NullPointerException("Null registrationStatus");
    }
}
