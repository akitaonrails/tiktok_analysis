package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uvt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1722790uvt implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public final String LLJIJIL;
    public final Boolean LLJILJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1722790uvt)) {
            return false;
        }
        C1722790uvt c1722790uvt = (C1722790uvt) obj;
        return Intrinsics.LJFF(this.LL, c1722790uvt.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1722790uvt.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1722790uvt.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1722790uvt.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1722790uvt.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1722790uvt.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1722790uvt.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1722790uvt.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1722790uvt.LLJ) && Intrinsics.LJFF(this.LLJI, c1722790uvt.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1722790uvt.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1722790uvt.LLJILJIL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LLIZ;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LLIZLLLIL;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.LLJ;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.LLJI;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.LLJIJIL;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool = this.LLJILJIL;
        return iHashCode11 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "WalletHomeHierarchyData(piListUrl=" + this.LL + ", sessionId=" + this.LLILLJJLI + ", bizSessionId=" + this.LLILLL + ", host=" + this.LLILZ + ", welcomePopupUrl=" + this.LLILZIL + ", merchantId=" + this.LLILZLL + ", merchantUserId=" + this.LLIZ + ", bizMerchantUserId=" + this.LLIZLLLIL + ", bizMerchantId=" + this.LLJ + ", oecMerchantId=" + this.LLJI + ", enterFrom=" + this.LLJIJIL + ", offlineDebug=" + this.LLJILJIL + ')';
    }

    public final boolean LIZ() {
        return C123100dR.LIZ(this.LL) && C123100dR.LIZ(this.LLILLJJLI) && C123100dR.LIZ(this.LLILZ);
    }

    public C1722790uvt(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = str6;
        this.LLIZ = str7;
        this.LLIZLLLIL = str8;
        this.LLJ = str9;
        this.LLJI = str10;
        this.LLJIJIL = str11;
        this.LLJILJIL = bool;
    }
}
