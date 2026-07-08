package X;

/* JADX INFO: renamed from: X.0VWr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C799190VWr {
    public final long LIZ;
    public final int LIZIZ;
    public final float LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final float LJFF;
    public final int LJI;
    public final long LJII;
    public final long LJIIIIZZ;
    public final int LJIIIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CpuDiagnoseConfig(periodInterval=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(",\npreMeasureCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", exceptionRatio=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(",\nmeasureCpuTime=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", minMeasureCpuTime=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(",\ndiffDumpRatio=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", dumpInterval=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(",\ndumpCpuTime=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", minDumpCpuTime=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(",\ntopDumpCount=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C799190VWr(long j, int i, float f, long j2, long j3, float f2, int i2, long j4, long j5, int i3) {
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = f;
        this.LIZLLL = j2;
        this.LJ = j3;
        this.LJFF = f2;
        this.LJI = i2;
        this.LJII = j4;
        this.LJIIIIZZ = j5;
        this.LJIIIZ = i3;
    }
}
