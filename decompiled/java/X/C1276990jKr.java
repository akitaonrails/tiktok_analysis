package X;

/* JADX INFO: renamed from: X.0jKr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1276990jKr {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final long LJI;
    public final String LJII;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkMicResolutionModel(effectWidth=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", effectHeight=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", w=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", h=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", fps=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", bits=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", bits12=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", businessId=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C2229431CNp LIZ() {
        return new C2229431CNp(Long.valueOf(this.LIZ), Long.valueOf(this.LIZIZ), Long.valueOf(this.LIZJ), Long.valueOf(this.LIZLLL), Long.valueOf(this.LJ), Long.valueOf(this.LJFF), Long.valueOf(this.LJI), this.LJII);
    }

    public C1276990jKr(long j, long j2, long j3, long j4, long j5, long j6, long j7, String str) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
        this.LJ = j5;
        this.LJFF = j6;
        this.LJI = j7;
        this.LJII = str;
    }
}
