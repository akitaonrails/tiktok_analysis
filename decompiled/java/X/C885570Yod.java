package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yod, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C885570Yod implements InterfaceC0148002o {
    public final EnumC871430YGn LL;
    public final List<C878960Ydy> LLILLJJLI;
    public final C876610YaB LLILLL;
    public final Map<EnumC880520YgU, Integer> LLILZ;
    public final C291001Au<Boolean> LLILZIL;
    public final C291001Au<Boolean> LLILZLL;
    public final C291001Au<Boolean> LLIZ;

    public C885570Yod() {
        this(null, null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C885570Yod)) {
            return false;
        }
        C885570Yod c885570Yod = (C885570Yod) obj;
        return this.LL == c885570Yod.LL && Intrinsics.LJFF(this.LLILLJJLI, c885570Yod.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c885570Yod.LLILLL) && Intrinsics.LJFF(this.LLILZ, c885570Yod.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c885570Yod.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c885570Yod.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c885570Yod.LLIZ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        C876610YaB c876610YaB = this.LLILLL;
        return ((((((((iHashCode + (c876610YaB == null ? 0 : c876610YaB.hashCode())) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageRequestPageState(requestType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", pageKeyList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", messageRequestData=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", secondaryPageUnreadMap=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", enablePriority=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", closePage=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", backPressEvent=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C885570Yod(EnumC871430YGn enumC871430YGn, List list, int i) {
        Map mapLJ;
        C291001Au c291001Au;
        C291001Au c291001Au2;
        C291001Au c291001Au3;
        List list2 = list;
        EnumC871430YGn enumC871430YGn2 = (i & 1) != 0 ? EnumC871430YGn.ALL_STRANGER : enumC871430YGn;
        list2 = (i & 2) != 0 ? C13BV.INSTANCE : list2;
        if ((i & 8) != 0) {
            mapLJ = C2097608Jq.LJ();
        } else {
            mapLJ = null;
        }
        if ((i & 16) != 0) {
            c291001Au = new C291001Au(Boolean.FALSE);
        } else {
            c291001Au = null;
        }
        if ((i & 32) != 0) {
            c291001Au2 = new C291001Au(Boolean.FALSE);
        } else {
            c291001Au2 = null;
        }
        if ((i & 64) != 0) {
            c291001Au3 = new C291001Au(Boolean.FALSE);
        } else {
            c291001Au3 = null;
        }
        this(enumC871430YGn2, list2, null, mapLJ, c291001Au, c291001Au2, c291001Au3);
    }

    public C885570Yod(EnumC871430YGn enumC871430YGn, List<C878960Ydy> list, C876610YaB c876610YaB, Map<EnumC880520YgU, Integer> map, C291001Au<Boolean> c291001Au, C291001Au<Boolean> c291001Au2, C291001Au<Boolean> c291001Au3) {
        this.LL = enumC871430YGn;
        this.LLILLJJLI = list;
        this.LLILLL = c876610YaB;
        this.LLILZ = map;
        this.LLILZIL = c291001Au;
        this.LLILZLL = c291001Au2;
        this.LLIZ = c291001Au3;
    }

    public static C885570Yod LIZ(C885570Yod c885570Yod, EnumC871430YGn enumC871430YGn, List list, C876610YaB c876610YaB, Map map, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, int i) {
        C291001Au c291001Au4 = c291001Au3;
        C291001Au c291001Au5 = c291001Au2;
        C291001Au c291001Au6 = c291001Au;
        Map map2 = map;
        C876610YaB c876610YaB2 = c876610YaB;
        List list2 = list;
        EnumC871430YGn enumC871430YGn2 = enumC871430YGn;
        if ((i & 1) != 0) {
            enumC871430YGn2 = c885570Yod.LL;
        }
        if ((i & 2) != 0) {
            list2 = c885570Yod.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c876610YaB2 = c885570Yod.LLILLL;
        }
        if ((i & 8) != 0) {
            map2 = c885570Yod.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au6 = c885570Yod.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au5 = c885570Yod.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au4 = c885570Yod.LLIZ;
        }
        c885570Yod.getClass();
        return new C885570Yod(enumC871430YGn2, list2, c876610YaB2, map2, c291001Au6, c291001Au5, c291001Au4);
    }
}
