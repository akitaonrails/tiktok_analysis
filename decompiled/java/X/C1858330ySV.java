package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ySV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1858330ySV {
    public final int LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final Long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1858330ySV)) {
            return false;
        }
        C1858330ySV c1858330ySV = (C1858330ySV) obj;
        return this.LIZ == c1858330ySV.LIZ && this.LIZIZ == c1858330ySV.LIZIZ && this.LIZJ == c1858330ySV.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1858330ySV.LIZLLL);
    }

    public final int hashCode() {
        int iY2 = ((((this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31;
        Long l = this.LIZLLL;
        return iY2 + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SwitchAnswerState(currentSelectedIndex=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", startTimestamp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", contentPauseDuration=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", contentPauseStartTime=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1858330ySV(int i, long j, long j2, Long l) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = l;
    }

    public static C1858330ySV LIZ(C1858330ySV c1858330ySV, long j, Long l, int i) {
        int i2;
        long j2;
        Long l2 = l;
        long j3 = j;
        if ((i & 1) != 0) {
            i2 = c1858330ySV.LIZ;
        } else {
            i2 = 0;
        }
        if ((i & 2) != 0) {
            j2 = c1858330ySV.LIZIZ;
        } else {
            j2 = 0;
        }
        if ((i & 4) != 0) {
            j3 = c1858330ySV.LIZJ;
        }
        if ((i & 8) != 0) {
            l2 = c1858330ySV.LIZLLL;
        }
        return new C1858330ySV(i2, j2, j3, l2);
    }
}
