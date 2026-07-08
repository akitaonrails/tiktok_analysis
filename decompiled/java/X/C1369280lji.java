package X;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0lji, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1369280lji {
    public final IntRange LIZ;
    public final double LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1369280lji)) {
            return false;
        }
        C1369280lji c1369280lji = (C1369280lji) obj;
        return Intrinsics.LJFF(this.LIZ, c1369280lji.LIZ) && Double.compare(this.LIZIZ, c1369280lji.LIZIZ) == 0 && Intrinsics.LJFF(this.LIZJ, c1369280lji.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.X2(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SharePanelTextMatch(range=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", score=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", matchType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1369280lji(IntRange intRange, double d, String str) {
        this.LIZ = intRange;
        this.LIZIZ = d;
        this.LIZJ = str;
    }
}
