package X;

/* JADX INFO: renamed from: X.0V9M, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V9M {
    public final C0V9S LIZ;
    public double LIZIZ;
    public double LIZJ;
    public double LIZLLL;
    public double LJ;
    public String LJFF;
    public final long LJI;
    public int LJII;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CpuCacheItem{type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", metricRate=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", metricMaxRate=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", metricCpuStats=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", metricMaxCpuStats=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", sceneString='");
        sbLIZ.append(this.LJFF);
        sbLIZ.append('\'');
        sbLIZ.append(", firstTs=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", times=");
        sbLIZ.append(this.LJII);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0V9M(C0V9S c0v9s, long j) {
        this.LIZ = c0v9s;
        this.LJI = j;
    }
}
