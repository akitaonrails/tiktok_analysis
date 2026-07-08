package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0umZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1717010umZ implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1717010umZ)) {
            return false;
        }
        C1717010umZ c1717010umZ = (C1717010umZ) obj;
        return Intrinsics.LJFF(this.LL, c1717010umZ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1717010umZ.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1717010umZ.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1717010umZ.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1717010umZ.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1717010umZ.LLILZLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LLILZLL;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResultPageData(scene=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", homePageUrl=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", previousPageId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", userStatus=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", activateResult=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1717010umZ(String str, String str2, String str3, String str4, String str5, String str6) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = str6;
    }
}
