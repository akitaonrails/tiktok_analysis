package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QUv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C671310QUv implements InterfaceC0148002o {
    public final String LL;
    public final Boolean LLILLJJLI;
    public final Boolean LLILLL;
    public final Map<C0QOE, C0QLM> LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;

    public C671310QUv() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C671310QUv)) {
            return false;
        }
        C671310QUv c671310QUv = (C671310QUv) obj;
        return Intrinsics.LJFF(this.LL, c671310QUv.LL) && Intrinsics.LJFF(this.LLILLJJLI, c671310QUv.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c671310QUv.LLILLL) && Intrinsics.LJFF(this.LLILZ, c671310QUv.LLILZ) && this.LLILZIL == c671310QUv.LLILZIL && this.LLILZLL == c671310QUv.LLILZLL;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LLILLL;
        return ((((((iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31) + this.LLILZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + C786410Ut5.Z2(this.LLILZLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchSkinFactorState(currentTab=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isInResult=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isMiddleAIMode=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", skinInfo=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isAddressCardShow=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", hasVerticalContentShow=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C671310QUv(int i) {
        this("", null, null, new LinkedHashMap(), false, false);
    }

    public C671310QUv(String str, Boolean bool, Boolean bool2, Map<C0QOE, C0QLM> map, boolean z, boolean z2) {
        this.LL = str;
        this.LLILLJJLI = bool;
        this.LLILLL = bool2;
        this.LLILZ = map;
        this.LLILZIL = z;
        this.LLILZLL = z2;
    }

    public static C671310QUv LIZ(C671310QUv c671310QUv, String str, Boolean bool, Boolean bool2, Map map, boolean z, boolean z2, int i) {
        boolean z3 = z2;
        boolean z4 = z;
        Map map2 = map;
        Boolean bool3 = bool2;
        Boolean bool4 = bool;
        String str2 = str;
        if ((i & 1) != 0) {
            str2 = c671310QUv.LL;
        }
        if ((i & 2) != 0) {
            bool4 = c671310QUv.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            bool3 = c671310QUv.LLILLL;
        }
        if ((i & 8) != 0) {
            map2 = c671310QUv.LLILZ;
        }
        if ((i & 16) != 0) {
            z4 = c671310QUv.LLILZIL;
        }
        if ((i & 32) != 0) {
            z3 = c671310QUv.LLILZLL;
        }
        c671310QUv.getClass();
        return new C671310QUv(str2, bool4, bool3, map2, z4, z3);
    }
}
