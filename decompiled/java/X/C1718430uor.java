package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uor, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1718430uor implements InterfaceC111300bX {
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
    public final Boolean LLJIJIL;
    public final String LLJILJIL;
    public final int LLJILJILJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1718430uor)) {
            return false;
        }
        C1718430uor c1718430uor = (C1718430uor) obj;
        return Intrinsics.LJFF(this.LL, c1718430uor.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1718430uor.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1718430uor.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1718430uor.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1718430uor.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1718430uor.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1718430uor.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1718430uor.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1718430uor.LLJ) && Intrinsics.LJFF(this.LLJI, c1718430uor.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1718430uor.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1718430uor.LLJILJIL) && this.LLJILJILJ == c1718430uor.LLJILJILJ;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31) + this.LLJI.hashCode()) * 31;
        Boolean bool = this.LLJIJIL;
        return ((((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.LLJILJIL.hashCode()) * 31) + this.LLJILJILJ;
    }

    public final String toString() {
        return "PinForgotData(previousPageId=" + this.LL + ", host=" + this.LLILLJJLI + ", sessionId=" + this.LLILLL + ", productCode=" + this.LLILZ + ", eventParam=" + this.LLILZIL + ", merchantId=" + this.LLILZLL + ", merchantUserId=" + this.LLIZ + ", verifyId=" + this.LLIZLLLIL + ", verifyType=" + this.LLJ + ", enterFrom=" + this.LLJI + ", disableHintMsg=" + this.LLJIJIL + ", theme=" + this.LLJILJIL + ", enterSeq=" + this.LLJILJILJ + ')';
    }

    public C1718430uor(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, int i) {
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
        this.LLJIJIL = bool;
        this.LLJILJIL = str11;
        this.LLJILJILJ = i;
    }
}
