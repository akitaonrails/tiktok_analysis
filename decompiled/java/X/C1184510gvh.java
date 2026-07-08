package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gvh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1184510gvh implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final C1188440h22 LLILZ;
    public final C1185490gxH LLILZIL;
    public final Boolean LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1184510gvh)) {
            return false;
        }
        C1184510gvh c1184510gvh = (C1184510gvh) obj;
        return Intrinsics.LJFF(this.LL, c1184510gvh.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1184510gvh.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1184510gvh.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1184510gvh.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1184510gvh.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1184510gvh.LLILZLL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C1188440h22 c1188440h22 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (c1188440h22 == null ? 0 : c1188440h22.hashCode())) * 31;
        C1185490gxH c1185490gxH = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (c1185490gxH == null ? 0 : c1185490gxH.hashCode())) * 31;
        Boolean bool = this.LLILZLL;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiDetailShareHierarchyData(entranceEnterMethod=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", entranceEnterPage=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", poiId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", poiAnchorData=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", poiAnchorMobData=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", inSheetMode=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1184510gvh(String str, String str2, String str3, C1188440h22 c1188440h22, C1185490gxH c1185490gxH, Boolean bool) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = c1188440h22;
        this.LLILZIL = c1185490gxH;
        this.LLILZLL = bool;
    }
}
