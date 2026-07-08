package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CwA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C329680CwA implements InterfaceC0148002o {
    public static final C01GW<C329680CwA> LLJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1846));
    public final C329660Cw8 LL;
    public final List<C331070CyP> LLILLJJLI;
    public final List<C329910CwX> LLILLL;
    public final C329660Cw8 LLILZ;
    public final boolean LLILZIL;
    public final Map<String, String> LLILZLL;
    public final Map<String, String> LLIZ;
    public final boolean LLIZLLLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C329680CwA)) {
            return false;
        }
        C329680CwA c329680CwA = (C329680CwA) obj;
        return Intrinsics.LJFF(this.LL, c329680CwA.LL) && Intrinsics.LJFF(this.LLILLJJLI, c329680CwA.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c329680CwA.LLILLL) && Intrinsics.LJFF(this.LLILZ, c329680CwA.LLILZ) && this.LLILZIL == c329680CwA.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c329680CwA.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c329680CwA.LLIZ) && this.LLIZLLLIL == c329680CwA.LLIZLLLIL;
    }

    public final int hashCode() {
        return (((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLIZLLLIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchProsConsTabState(voidTagLoadMoreMeta=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", tagItemList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", reviewItemList=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", currentSelectedTagLoadMoreMeta=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isTabShowing=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", logParams=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", takoMediaParams=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", isSingleSelectionMode=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C329680CwA(C329660Cw8 c329660Cw8, List<C331070CyP> list, List<C329910CwX> list2, C329660Cw8 c329660Cw82, boolean z, Map<String, String> map, Map<String, String> map2, boolean z2) {
        this.LL = c329660Cw8;
        this.LLILLJJLI = list;
        this.LLILLL = list2;
        this.LLILZ = c329660Cw82;
        this.LLILZIL = z;
        this.LLILZLL = map;
        this.LLIZ = map2;
        this.LLIZLLLIL = z2;
    }

    public static C329680CwA LIZ(C329680CwA c329680CwA, C329660Cw8 c329660Cw8, List list, List list2, C329660Cw8 c329660Cw82, boolean z, Map map, Map map2, boolean z2, int i) {
        boolean z3 = z2;
        Map map3 = map2;
        Map map4 = map;
        boolean z4 = z;
        C329660Cw8 c329660Cw83 = c329660Cw82;
        List list3 = list2;
        List list4 = list;
        C329660Cw8 c329660Cw84 = c329660Cw8;
        if ((i & 1) != 0) {
            c329660Cw84 = c329680CwA.LL;
        }
        if ((i & 2) != 0) {
            list4 = c329680CwA.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            list3 = c329680CwA.LLILLL;
        }
        if ((i & 8) != 0) {
            c329660Cw83 = c329680CwA.LLILZ;
        }
        if ((i & 16) != 0) {
            z4 = c329680CwA.LLILZIL;
        }
        if ((i & 32) != 0) {
            map4 = c329680CwA.LLILZLL;
        }
        if ((i & 64) != 0) {
            map3 = c329680CwA.LLIZ;
        }
        if ((i & 128) != 0) {
            z3 = c329680CwA.LLIZLLLIL;
        }
        c329680CwA.getClass();
        return new C329680CwA(c329660Cw84, list4, list3, c329660Cw83, z4, map4, map3, z3);
    }
}
