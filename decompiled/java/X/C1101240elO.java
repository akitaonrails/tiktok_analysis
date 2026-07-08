package X;

/* JADX INFO: renamed from: X.0elO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1101240elO {
    public int LIZ = -1;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public float LJ;
    public float LJFF;

    public C1101240elO() {
        Float f = C1101250elP.LIZ;
        this.LIZIZ = f.floatValue();
        this.LIZJ = f.floatValue();
        this.LIZLLL = f.floatValue();
        this.LJ = f.floatValue();
        this.LJFF = f.floatValue();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdaptiveGearPerfFeature{perfScore=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", thermalScore=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", singleCoresAppCpuSpeed=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", gamePerformanceScoreHost=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", deviceScore=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", recordScore=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
