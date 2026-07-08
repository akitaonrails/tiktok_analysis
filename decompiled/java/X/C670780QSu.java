package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QSu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C670780QSu {
    public final int LIZ;
    public final int LIZIZ;
    public Long LIZJ = null;
    public Long LIZLLL = null;
    public Long LJ = null;
    public boolean LJFF = false;
    public boolean LJI = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C670780QSu)) {
            return false;
        }
        C670780QSu c670780QSu = (C670780QSu) obj;
        return this.LIZ == c670780QSu.LIZ && this.LIZIZ == c670780QSu.LIZIZ && Intrinsics.LJFF(this.LIZJ, c670780QSu.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c670780QSu.LIZLLL) && Intrinsics.LJFF(this.LJ, c670780QSu.LJ) && this.LJFF == c670780QSu.LJFF && this.LJI == c670780QSu.LJI;
    }

    public final int hashCode() {
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        Long l = this.LIZJ;
        int iHashCode = (i + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.LIZLLL;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.LJ;
        return ((((iHashCode2 + (l3 != null ? l3.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcSearchSugOptimizedPerfContext(maxParallelCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", maxQueueSize=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enqueueTimeMillis=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", requestStartTimeMillis=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", responseTimeMillis=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", pendingQueueTrimmed=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", responseFilteredByOrder=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C670780QSu(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
