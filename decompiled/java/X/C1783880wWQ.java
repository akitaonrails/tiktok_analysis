package X;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wWQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1783880wWQ {
    public final Map<Long, C1780260wQa> LIZ;
    public final Set<Long> LIZIZ;
    public final Set<Long> LIZJ;

    public C1783880wWQ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1783880wWQ)) {
            return false;
        }
        C1783880wWQ c1783880wWQ = (C1783880wWQ) obj;
        return Intrinsics.LJFF(this.LIZ, c1783880wWQ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1783880wWQ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1783880wWQ.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MatchRecommendRuntime(optimisticOverrideByUserId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", inFlightUserIds=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", pendingReleaseUserIds=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1783880wWQ(int i) {
        Map mapLJ = C2097608Jq.LJ();
        C08CX c08cx = C08CX.INSTANCE;
        this(mapLJ, c08cx, c08cx);
    }

    public C1783880wWQ(Map<Long, C1780260wQa> map, Set<Long> set, Set<Long> set2) {
        this.LIZ = map;
        this.LIZIZ = set;
        this.LIZJ = set2;
    }
}
