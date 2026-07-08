package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Iog, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C477920Iog {
    public final long LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final long LJFF;
    public final boolean LJI;

    public C477920Iog() {
        this(0L, 0L, null, null, null, 0L, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C477920Iog)) {
            return false;
        }
        C477920Iog c477920Iog = (C477920Iog) obj;
        return this.LIZ == c477920Iog.LIZ && this.LIZIZ == c477920Iog.LIZIZ && Intrinsics.LJFF(this.LIZJ, c477920Iog.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c477920Iog.LIZLLL) && Intrinsics.LJFF(this.LJ, c477920Iog.LJ) && this.LJFF == c477920Iog.LJFF && this.LJI == c477920Iog.LJI;
    }

    public final int hashCode() {
        return (((((((((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HangoutCellOnTopLogData(onTopAnchorId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onTopRoomId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onTopEnterFromMerge=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onTopEnterMethod=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", onTopActionType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", onTopStartTime=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", hasReportedOnTopDuration=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C477920Iog(long j, long j2, String str, String str2, String str3, long j3, int i) {
        j = (i & 1) != 0 ? -1L : j;
        j2 = (i & 2) != 0 ? -1L : j2;
        str = (i & 4) != 0 ? "" : str;
        str2 = (i & 8) != 0 ? "" : str2;
        str3 = (i & 16) != 0 ? "" : str3;
        j3 = (i & 32) != 0 ? -1L : j3;
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = j3;
        this.LJI = false;
    }
}
