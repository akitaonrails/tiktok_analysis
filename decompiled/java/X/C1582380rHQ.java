package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rHQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1582380rHQ {
    public final long LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final Integer LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1582380rHQ)) {
            return false;
        }
        C1582380rHQ c1582380rHQ = (C1582380rHQ) obj;
        return this.LIZ == c1582380rHQ.LIZ && this.LIZIZ == c1582380rHQ.LIZIZ && this.LIZJ == c1582380rHQ.LIZJ && this.LIZLLL == c1582380rHQ.LIZLLL && this.LJ == c1582380rHQ.LJ && this.LJFF == c1582380rHQ.LJFF && Intrinsics.LJFF(this.LJI, c1582380rHQ.LJI);
    }

    public final int hashCode() {
        int iY2 = ((((((((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + this.LJ) * 31) + this.LJFF) * 31;
        Integer num = this.LJI;
        return iY2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShownSnapshot(elapsedAtShown=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", prfCnt=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", durationFromLast=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", sessionId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", itemCountBefore=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", scrollLevelAtTrigger=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1582380rHQ(long j, long j2, int i, int i2, int i3, long j3, Integer num) {
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = j2;
        this.LIZLLL = j3;
        this.LJ = i2;
        this.LJFF = i3;
        this.LJI = num;
    }
}
