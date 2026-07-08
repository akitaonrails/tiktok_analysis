package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0goA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1179840goA implements InterfaceC0148002o {
    public final List<C1179850goB> LL;
    public final List<C1179830go9> LLILLJJLI;
    public final Map<String, List<C1179830go9>> LLILLL;
    public final boolean LLILZ;

    public C1179840goA() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1179840goA)) {
            return false;
        }
        C1179840goA c1179840goA = (C1179840goA) obj;
        return Intrinsics.LJFF(this.LL, c1179840goA.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1179840goA.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1179840goA.LLILLL) && this.LLILZ == c1179840goA.LLILZ;
    }

    public final int hashCode() {
        List<C1179850goB> list = this.LL;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<C1179830go9> list2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map<String, List<C1179830go9>> map = this.LLILLL;
        return ((iHashCode2 + (map != null ? map.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiMapDetailAreaFilterState(areaList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", areaFilterOptions=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", allFilterOptions=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", filterChangedByUser=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1179840goA(int i) {
        this(false, null, null, null);
    }

    public C1179840goA(boolean z, List list, List list2, Map map) {
        this.LL = list;
        this.LLILLJJLI = list2;
        this.LLILLL = map;
        this.LLILZ = z;
    }

    public static C1179840goA LIZ(C1179840goA c1179840goA, List list, List list2, Map map, int i) {
        boolean z;
        if ((i & 1) != 0) {
            list = c1179840goA.LL;
        }
        if ((i & 2) != 0) {
            list2 = c1179840goA.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            map = c1179840goA.LLILLL;
        }
        if ((i & 8) != 0) {
            z = c1179840goA.LLILZ;
        } else {
            z = false;
        }
        c1179840goA.getClass();
        return new C1179840goA(z, list, list2, map);
    }
}
