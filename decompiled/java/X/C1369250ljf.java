package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ljf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1369250ljf {
    public final C1369290ljj LIZ;
    public final C1369260ljg LIZIZ;
    public final Map<Integer, C1369260ljg> LIZJ;
    public final double LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1369250ljf)) {
            return false;
        }
        C1369250ljf c1369250ljf = (C1369250ljf) obj;
        return Intrinsics.LJFF(this.LIZ, c1369250ljf.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1369250ljf.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1369250ljf.LIZJ) && Double.compare(this.LIZLLL, c1369250ljf.LIZLLL) == 0;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.X2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SharePanelCandidateMatch(candidate=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", primaryMatch=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", allMatches=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", score=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1369250ljf(C1369290ljj c1369290ljj, C1369260ljg c1369260ljg, Map<Integer, C1369260ljg> map, double d) {
        this.LIZ = c1369290ljj;
        this.LIZIZ = c1369260ljg;
        this.LIZJ = map;
        this.LIZLLL = d;
    }
}
