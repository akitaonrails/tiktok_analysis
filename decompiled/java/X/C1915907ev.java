package X;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07ev, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1915907ev {
    public final List<Long> LIZ;
    public final List<Long> LIZIZ;
    public final List<Long> LIZJ;
    public final List<Pair<String, String>> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1915907ev)) {
            return false;
        }
        C1915907ev c1915907ev = (C1915907ev) obj;
        return Intrinsics.LJFF(this.LIZ, c1915907ev.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1915907ev.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1915907ev.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1915907ev.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectVisibleScopeDataItem(allSelectedUids=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", selectedUids=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", selectedGroups=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", preItemInfo=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1915907ev(List<Long> list, List<Long> list2, List<Long> list3, List<Pair<String, String>> list4) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = list3;
        this.LIZLLL = list4;
    }
}
