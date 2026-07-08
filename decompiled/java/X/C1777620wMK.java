package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wMK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777620wMK {
    public final String LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public int LJ = 0;
    public int LJFF = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777620wMK)) {
            return false;
        }
        C1777620wMK c1777620wMK = (C1777620wMK) obj;
        return Intrinsics.LJFF(this.LIZ, c1777620wMK.LIZ) && this.LIZIZ == c1777620wMK.LIZIZ && this.LIZJ == c1777620wMK.LIZJ && this.LIZLLL == c1777620wMK.LIZLLL && this.LJ == c1777620wMK.LJ && this.LJFF == c1777620wMK.LJFF;
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + this.LJ) * 31) + this.LJFF;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StageInfo(stage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", startCpuTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", startWallTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", startWallTimeNano=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", cpuTimeCost=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", wallTimeCost=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777620wMK(String str, long j, long j2, long j3) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = j3;
    }
}
