package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.002F, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C002F {
    public final String LIZ;
    public final List<Object> LIZIZ;
    public final List<C00A6> LIZJ;
    public final long LIZLLL;
    public final long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C002F)) {
            return false;
        }
        C002F c002f = (C002F) obj;
        return Intrinsics.LJFF(this.LIZ, c002f.LIZ) && Intrinsics.LJFF(this.LIZIZ, c002f.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c002f.LIZJ) && this.LIZLLL == c002f.LIZLLL && this.LJ == c002f.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StrategyPipelineSummary(strategyName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", windowScans=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", clusterTraces=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", firstCandidateReadyMs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", totalDurationMs=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C002F(String str, List list, long j, long j2) {
        C13BV c13bv = C13BV.INSTANCE;
        this.LIZ = str;
        this.LIZIZ = c13bv;
        this.LIZJ = list;
        this.LIZLLL = j;
        this.LJ = j2;
    }
}
