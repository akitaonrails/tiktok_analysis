package X;

import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.012O, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C012O {
    public static final /* synthetic */ int LJ = 0;
    public final HashMap<String, Object> LIZ;
    public final HashMap<String, String> LIZIZ;
    public final HashMap<String, Object> LIZJ;
    public final List<HashMap<String, Object>> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C012O)) {
            return false;
        }
        C012O c012o = (C012O) obj;
        return Intrinsics.LJFF(this.LIZ, c012o.LIZ) && Intrinsics.LJFF(this.LIZIZ, c012o.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c012o.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c012o.LIZLLL);
    }

    public final int hashCode() {
        HashMap<String, Object> map = this.LIZ;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        HashMap<String, String> map2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        HashMap<String, Object> map3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (map3 == null ? 0 : map3.hashCode())) * 31;
        List<HashMap<String, Object>> list = this.LIZLLL;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RewardOpenPayload(commonParams=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", extraRequestParams=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", extraLogParams=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", prefetchParams=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C012O(HashMap<String, Object> map, HashMap<String, String> map2, HashMap<String, Object> map3, List<? extends HashMap<String, Object>> list) {
        this.LIZ = map;
        this.LIZIZ = map2;
        this.LIZJ = map3;
        this.LIZLLL = list;
    }
}
