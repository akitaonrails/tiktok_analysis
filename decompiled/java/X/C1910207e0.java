package X;

/* JADX INFO: renamed from: X.07e0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1910207e0 {
    public final long LIZ;
    public final long LIZIZ;
    public final double LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DataStat{availFreeSpace=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", totalSpace=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", availPercent=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1910207e0(double d, long j, long j2) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = d;
    }
}
