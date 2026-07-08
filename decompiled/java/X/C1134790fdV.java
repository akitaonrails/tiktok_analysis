package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fdV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1134790fdV {
    public final String LIZ;
    public long LIZIZ;
    public long LIZJ;
    public boolean LIZLLL = false;
    public long LJ = 0;
    public int LJFF = 0;
    public long LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1134790fdV)) {
            return false;
        }
        C1134790fdV c1134790fdV = (C1134790fdV) obj;
        return Intrinsics.LJFF(this.LIZ, c1134790fdV.LIZ) && this.LIZIZ == c1134790fdV.LIZIZ && this.LIZJ == c1134790fdV.LIZJ && this.LIZLLL == c1134790fdV.LIZLLL && this.LJ == c1134790fdV.LJ && this.LJFF == c1134790fdV.LJFF && this.LJI == c1134790fdV.LJI;
    }

    public final int hashCode() {
        return (((((((((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + this.LJFF) * 31) + C786410Ut5.Y2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TaskProgress(taskId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", targetWatchDurationMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", totalWatchDurationMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isReporting=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", nextReportTimeMs=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", reportRetryCount=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", reportIntervalMs=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1134790fdV(long j, long j2, long j3, String str) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LJI = j3;
    }
}
