package X;

/* JADX INFO: renamed from: X.0rVi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1591240rVi {
    public final long LIZ;
    public final int LIZIZ;
    public final double LIZJ;
    public final double LIZLLL;
    public final double LJ;
    public final double LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("(period=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", windowSize=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", alpha=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", ewmaRate=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", lowValue=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", extremeValue=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1591240rVi(long j, int i, double d, double d2, double d3, double d4) {
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = d;
        this.LIZLLL = d2;
        this.LJ = d3;
        this.LJFF = d4;
    }
}
