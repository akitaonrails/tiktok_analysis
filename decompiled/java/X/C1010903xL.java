package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03xL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1010903xL {
    public final Map<String, Object> LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL = false;
    public final String LJ;
    public final Map<String, Object> LJFF;
    public final Map<String, Object> LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1010903xL)) {
            return false;
        }
        C1010903xL c1010903xL = (C1010903xL) obj;
        return Intrinsics.LJFF(this.LIZ, c1010903xL.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1010903xL.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1010903xL.LIZJ) && this.LIZLLL == c1010903xL.LIZLLL && Intrinsics.LJFF(this.LJ, c1010903xL.LJ) && Intrinsics.LJFF(this.LJFF, c1010903xL.LJFF) && Intrinsics.LJFF(this.LJI, c1010903xL.LJI);
    }

    public final int hashCode() {
        Map<String, Object> map = this.LIZ;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        String str3 = this.LJ;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.LJFF.hashCode()) * 31;
        Map<String, Object> map2 = this.LJI;
        return iHashCode4 + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OSPEnterParams(trackParams=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", btmToken=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", chainKey=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isFromPdpAddCartAfterToastEntrance=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", sourceInfo=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", requestParams=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", orderRequestParams=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1010903xL(Map map, String str, String str2, String str3, Map map2, Map map3) {
        this.LIZ = map;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LJ = str3;
        this.LJFF = map2;
        this.LJI = map3;
    }
}
