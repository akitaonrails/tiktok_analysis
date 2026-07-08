package X;

/* JADX INFO: renamed from: X.0jFR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1273630jFR {
    public final String LIZ;
    public int LJ;
    public int LJFF;
    public int LJIIIIZZ;
    public long LIZIZ = -1;
    public long LIZJ = -1;
    public long LIZLLL = -1;
    public long LJI = -1;
    public long LJII = -1;

    public final boolean LIZ() {
        return this.LIZIZ > 0 && this.LIZLLL > 0 && this.LJIIIIZZ > 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PipelineCost(name='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("', latestTimestamp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", cost=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", totalCost=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", normalJankCountForPackReport=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", seriousJankCountForPackReport=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", interval=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", totalInterval=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", count=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1273630jFR(String str) {
        this.LIZ = str;
    }
}
