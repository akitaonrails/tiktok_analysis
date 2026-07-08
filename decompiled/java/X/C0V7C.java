package X;

/* JADX INFO: renamed from: X.0V7C, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V7C {
    public final long LIZ;
    public final long LIZIZ;
    public final boolean LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FdConfig{fdCountThreshold=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", collectIntervalMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isSampled=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0V7C(long j, long j2, boolean z) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = z;
    }
}
