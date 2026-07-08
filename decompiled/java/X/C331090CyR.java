package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CyR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C331090CyR implements InterfaceC0148002o {
    public final boolean LL;
    public final List<Object> LLILLJJLI;
    public final Map<String, String> LLILLL;
    public final Map<String, String> LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C331090CyR)) {
            return false;
        }
        C331090CyR c331090CyR = (C331090CyR) obj;
        return this.LL == c331090CyR.LL && Intrinsics.LJFF(this.LLILLJJLI, c331090CyR.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c331090CyR.LLILLL) && Intrinsics.LJFF(this.LLILZ, c331090CyR.LLILZ);
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchProsConsPanelState(isPanelShowing=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", panelItemList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", logParams=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", takoMediaParams=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C331090CyR(boolean z, Map map, List list, Map map2) {
        this.LL = z;
        this.LLILLJJLI = list;
        this.LLILLL = map;
        this.LLILZ = map2;
    }

    public static C331090CyR LIZ(C331090CyR c331090CyR, boolean z, List list, Map map, Map map2, int i) {
        if ((i & 1) != 0) {
            z = c331090CyR.LL;
        }
        if ((i & 2) != 0) {
            list = c331090CyR.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            map = c331090CyR.LLILLL;
        }
        if ((i & 8) != 0) {
            map2 = c331090CyR.LLILZ;
        }
        c331090CyR.getClass();
        return new C331090CyR(z, map, list, map2);
    }
}
