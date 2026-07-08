package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wSi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1781580wSi implements InterfaceC111300bX {
    public final String LL;
    public final boolean LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1781580wSi)) {
            return false;
        }
        C1781580wSi c1781580wSi = (C1781580wSi) obj;
        return Intrinsics.LJFF(this.LL, c1781580wSi.LL) && this.LLILLJJLI == c1781580wSi.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1781580wSi.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1781580wSi.LLILZ) && this.LLILZIL == c1781580wSi.LLILZIL && this.LLILZLL == c1781580wSi.LLILZLL;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        String str2 = this.LLILLL;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZ;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + C786410Ut5.Z2(this.LLILZLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveBoardPageHierarchyData(showEntrance=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isPreview=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", anchorId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", hasGeneralBoardPermission=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", hasFullCustomizationBoardPermission=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1781580wSi(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = z2;
        this.LLILZLL = z3;
    }
}
