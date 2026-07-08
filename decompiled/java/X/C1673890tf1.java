package X;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tf1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1673890tf1 extends AbstractC1673910tf3 {
    public final Map<Pair<String, String>, List<C1673800tes>> LIZ;
    public final Map<String, String> LIZIZ;
    public final List<String> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1673890tf1)) {
            return false;
        }
        C1673890tf1 c1673890tf1 = (C1673890tf1) obj;
        return Intrinsics.LJFF(this.LIZ, c1673890tf1.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1673890tf1.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1673890tf1.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Map<String, String> map = this.LIZIZ;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        List<String> list = this.LIZJ;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreatorListDataUpdate(creatorsMap=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", newMap=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", tags=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1673890tf1(Map<Pair<String, String>, ? extends List<C1673800tes>> map, Map<String, String> map2, List<String> list) {
        this.LIZ = map;
        this.LIZIZ = map2;
        this.LIZJ = list;
    }
}
