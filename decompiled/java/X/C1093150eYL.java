package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eYL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1093150eYL {
    public final boolean LIZ;
    public final C1093140eYK LIZIZ;
    public final String LIZJ;
    public final Map<String, Object> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1093150eYL)) {
            return false;
        }
        C1093150eYL c1093150eYL = (C1093150eYL) obj;
        return this.LIZ == c1093150eYL.LIZ && Intrinsics.LJFF(this.LIZIZ, c1093150eYL.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1093150eYL.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1093150eYL.LIZLLL);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        C1093140eYK c1093140eYK = this.LIZIZ;
        int iHashCode = (iZ2 + (c1093140eYK == null ? 0 : c1093140eYK.hashCode())) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Object> map = this.LIZLLL;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveTTMStrategyResult(success=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", error=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", eventParams=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1093150eYL(boolean z, C1093140eYK c1093140eYK, String str, Map<String, Object> map) {
        this.LIZ = z;
        this.LIZIZ = c1093140eYK;
        this.LIZJ = str;
        this.LIZLLL = map;
    }

    public /* synthetic */ C1093150eYL(boolean z, C1093140eYK c1093140eYK, String str, Map map, int i) {
        this(z, (i & 2) != 0 ? null : c1093140eYK, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : map);
    }
}
