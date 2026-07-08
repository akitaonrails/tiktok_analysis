package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00tu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C225200tu {
    public final List<C1369250ljf> LIZ;
    public final double LIZIZ;
    public final double LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C225200tu)) {
            return false;
        }
        C225200tu c225200tu = (C225200tu) obj;
        return Intrinsics.LJFF(this.LIZ, c225200tu.LIZ) && Double.compare(this.LIZIZ, c225200tu.LIZIZ) == 0 && Double.compare(this.LIZJ, c225200tu.LIZJ) == 0;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.X2(this.LIZIZ)) * 31) + C786410Ut5.X2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SharePanelTimedSearchResult(matches=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", matchingDurationMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", rankingDurationMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C225200tu(List<C1369250ljf> list, double d, double d2) {
        this.LIZ = list;
        this.LIZIZ = d;
        this.LIZJ = d2;
    }
}
