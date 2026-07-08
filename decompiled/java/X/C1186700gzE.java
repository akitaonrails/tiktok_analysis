package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gzE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1186700gzE implements InterfaceC111300bX {
    public final C1185490gxH LL;
    public final C1188440h22 LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1186700gzE)) {
            return false;
        }
        C1186700gzE c1186700gzE = (C1186700gzE) obj;
        return Intrinsics.LJFF(this.LL, c1186700gzE.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1186700gzE.LLILLJJLI);
    }

    public final int hashCode() {
        C1185490gxH c1185490gxH = this.LL;
        int iHashCode = (c1185490gxH == null ? 0 : c1185490gxH.hashCode()) * 31;
        C1188440h22 c1188440h22 = this.LLILLJJLI;
        return iHashCode + (c1188440h22 != null ? c1188440h22.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiAnchorHierarchyData(poiAnchorMobData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", poiAnchorData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1186700gzE(C1185490gxH c1185490gxH, C1188440h22 c1188440h22) {
        this.LL = c1185490gxH;
        this.LLILLJJLI = c1188440h22;
    }
}
