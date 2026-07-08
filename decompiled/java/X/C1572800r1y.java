package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r1y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1572800r1y {
    public final Integer LIZ;
    public final Integer LIZIZ;
    public final Boolean LIZJ;
    public final Long LIZLLL;
    public final Boolean LJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1572800r1y() {
        Boolean bool = Boolean.FALSE;
        this(0, 0, bool, -1L, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1572800r1y)) {
            return false;
        }
        C1572800r1y c1572800r1y = (C1572800r1y) obj;
        return Intrinsics.LJFF(this.LIZ, c1572800r1y.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1572800r1y.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1572800r1y.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1572800r1y.LIZLLL) && Intrinsics.LJFF(this.LJ, c1572800r1y.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeriesProfileListVideoItem(numWatched=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", seqId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isUnlocked=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", videoId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isLastWatched=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1572800r1y(Integer num, Integer num2, Boolean bool, Long l, Boolean bool2) {
        this.LIZ = num;
        this.LIZIZ = num2;
        this.LIZJ = bool;
        this.LIZLLL = l;
        this.LJ = bool2;
    }
}
