package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0umv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1717230umv implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1717230umv)) {
            return false;
        }
        C1717230umv c1717230umv = (C1717230umv) obj;
        return Intrinsics.LJFF(this.LL, c1717230umv.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1717230umv.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1717230umv.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1717230umv.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1717230umv.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1717230umv.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1717230umv.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1717230umv.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1717230umv.LLJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31;
        String str = this.LLILZLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLIZ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLIZLLLIL;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLJ;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhoneSettingData(scene=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", merchantId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", merchantUserId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", token=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", apiHost=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", previousPageId=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", theme=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1717230umv(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = str6;
        this.LLIZ = str7;
        this.LLIZLLLIL = str8;
        this.LLJ = str9;
    }
}
