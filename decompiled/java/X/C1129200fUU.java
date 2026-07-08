package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fUU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129200fUU {
    public final List<Long> LIZ;
    public final List<Long> LIZIZ;
    public final List<Long> LIZJ;
    public final List<Long> LIZLLL;
    public final long LJ;
    public final boolean LJFF;

    public C1129200fUU() {
        this(null, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1129200fUU)) {
            return false;
        }
        C1129200fUU c1129200fUU = (C1129200fUU) obj;
        return Intrinsics.LJFF(this.LIZ, c1129200fUU.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1129200fUU.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1129200fUU.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1129200fUU.LIZLLL) && this.LJ == c1129200fUU.LJ && this.LJFF == c1129200fUU.LJFF;
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TabRenderMetadata(frequentlyUsedGiftIds=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", favGiftIds=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", favGiftAutoFillIds=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", matchGameGiftIds=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", liveGoalGiftId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", needUgPointsDecoration=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1129200fUU(List list, List list2, int i) {
        C13BV c13bv;
        long j;
        List list3 = list2;
        List list4 = list;
        if ((i & 1) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        list4 = (i & 2) != 0 ? C13BV.INSTANCE : list4;
        list3 = (i & 4) != 0 ? C13BV.INSTANCE : list3;
        C13BV c13bv2 = (i & 8) != 0 ? C13BV.INSTANCE : null;
        if ((i & 16) != 0) {
            j = -1;
        } else {
            j = 0;
        }
        this(false, j, c13bv, list4, list3, c13bv2);
    }

    public C1129200fUU(boolean z, long j, List list, List list2, List list3, List list4) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = list3;
        this.LIZLLL = list4;
        this.LJ = j;
        this.LJFF = z;
    }
}
