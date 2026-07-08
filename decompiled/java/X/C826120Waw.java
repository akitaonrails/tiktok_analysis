package X;

import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Waw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C826120Waw {
    public final Object LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final Map<String, String> LJI;
    public final Map<String, String> LJII;
    public final Map<String, String> LJIIIIZZ;
    public final String[] LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C826120Waw)) {
            return false;
        }
        C826120Waw c826120Waw = (C826120Waw) obj;
        return Intrinsics.LJFF(this.LIZ, c826120Waw.LIZ) && Intrinsics.LJFF(this.LIZIZ, c826120Waw.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c826120Waw.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c826120Waw.LIZLLL) && Intrinsics.LJFF(this.LJ, c826120Waw.LJ) && Intrinsics.LJFF(this.LJFF, c826120Waw.LJFF) && Intrinsics.LJFF(this.LJI, c826120Waw.LJI) && Intrinsics.LJFF(this.LJII, c826120Waw.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c826120Waw.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c826120Waw.LJIIIZ);
    }

    public final int hashCode() {
        Object obj = this.LIZ;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJ;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJFF;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map<String, String> map = this.LJI;
        int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.LJII;
        int iHashCode8 = (iHashCode7 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, String> map3 = this.LJIIIIZZ;
        int iHashCode9 = (iHashCode8 + (map3 == null ? 0 : map3.hashCode())) * 31;
        String[] strArr = this.LJIIIZ;
        return iHashCode9 + (strArr != null ? Arrays.hashCode(strArr) : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ThirdPartyNetworkContext(target=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", triggerId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", url=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", host=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", scheme=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", method=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", headers=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", queryParams=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", cookies=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", codePointTags=");
        sbLIZ.append(Arrays.toString(this.LJIIIZ));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C826120Waw(Object obj, String str, String str2, String str3, String str4, String str5, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, String[] strArr) {
        this.LIZ = obj;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = map;
        this.LJII = map2;
        this.LJIIIIZZ = map3;
        this.LJIIIZ = strArr;
    }
}
