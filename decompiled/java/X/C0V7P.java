package X;

/* JADX INFO: renamed from: X.0V7P, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V7P {
    public final long LIZ;
    public final double LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MemoryConfig{memoryCollectionInterval=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", memoryTopCheckThreshold=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isStopWhenBackground=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isRealTimeMemEnable=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isUploadEnable=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isApm6SampleEnable=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0V7P(long j, double d, boolean z, boolean z2) {
        if (j <= 0) {
            this.LIZ = 120L;
        } else {
            this.LIZ = j;
        }
        this.LIZIZ = d;
        this.LJFF = z2;
        this.LIZJ = false;
        this.LIZLLL = false;
        this.LJ = z;
    }
}
