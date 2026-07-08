package X;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ycc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C878120Ycc {
    public final Set<String> LIZ;
    public final Map<C0Y8T, Double> LIZIZ;
    public final List<C0Y8T> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C878120Ycc)) {
            return false;
        }
        C878120Ycc c878120Ycc = (C878120Ycc) obj;
        return Intrinsics.LJFF(this.LIZ, c878120Ycc.LIZ) && Intrinsics.LJFF(this.LIZIZ, c878120Ycc.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c878120Ycc.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PriorityScoreInitGroups(alreadyInitConvIds=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", needInitBasedOnServerScoreConvs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", needClientAiInitConvs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C878120Ycc(List list, Map map, Set set) {
        this.LIZ = set;
        this.LIZIZ = map;
        this.LIZJ = list;
    }
}
