package X;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0ljg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1369260ljg {
    public final int LIZ;
    public final String LIZIZ;
    public final IntRange LIZJ;
    public final double LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1369260ljg)) {
            return false;
        }
        C1369260ljg c1369260ljg = (C1369260ljg) obj;
        return this.LIZ == c1369260ljg.LIZ && Intrinsics.LJFF(this.LIZIZ, c1369260ljg.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1369260ljg.LIZJ) && Double.compare(this.LIZLLL, c1369260ljg.LIZLLL) == 0 && Intrinsics.LJFF(this.LJ, c1369260ljg.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.X2(this.LIZLLL)) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SharePanelDimensionMatch(dimension=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sourceText=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", range=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", score=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", matchType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1369260ljg(int i, String str, IntRange intRange, double d, String str2) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = intRange;
        this.LIZLLL = d;
        this.LJ = str2;
    }
}
