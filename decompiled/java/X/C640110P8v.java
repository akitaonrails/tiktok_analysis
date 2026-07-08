package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P8v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C640110P8v implements InterfaceC1618170sD9<C640110P8v> {
    public final Map<String, String> LL;
    public final Map<String, String> LLILLJJLI;
    public final Map<String, Object> LLILLL;

    public C640110P8v() {
        this(null, null, null);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C640110P8v)) {
            return false;
        }
        C640110P8v c640110P8v = (C640110P8v) obj;
        return Intrinsics.LJFF(this.LL, c640110P8v.LL) && Intrinsics.LJFF(this.LLILLJJLI, c640110P8v.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c640110P8v.LLILLL);
    }

    public final int hashCode() {
        Map<String, String> map = this.LL;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, String> map2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, Object> map3 = this.LLILLL;
        return iHashCode2 + (map3 != null ? map3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchResultParamBindingState(searchExtraRequestParamMap=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", refineExtraRequestParamMap=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", logParamsForSearchMobEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        return keyParams();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        return C2097608Jq.LJ();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        return C2097608Jq.LJ();
    }

    public C640110P8v(Map<String, String> map, Map<String, String> map2, Map<String, ? extends Object> map3) {
        this.LL = map;
        this.LLILLJJLI = map2;
        this.LLILLL = map3;
        C0P8T.LIZ();
    }

    public static C640110P8v LIZ(C640110P8v c640110P8v, Map map, Map map2, Map map3, int i) {
        if ((i & 1) != 0) {
            map = c640110P8v.LL;
        }
        if ((i & 2) != 0) {
            map2 = c640110P8v.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            map3 = c640110P8v.LLILLL;
        }
        c640110P8v.getClass();
        return new C640110P8v(map, map2, map3);
    }
}
