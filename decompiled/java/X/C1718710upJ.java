package X;

import com.ss.android.ugc.aweme.component.verify.pin.model.HintPageMsg;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0upJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1718710upJ implements InterfaceC111300bX {
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
    public final HintPageMsg LLJIJIL;
    public final String LLJILJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1718710upJ)) {
            return false;
        }
        C1718710upJ c1718710upJ = (C1718710upJ) obj;
        return Intrinsics.LJFF(this.LL, c1718710upJ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1718710upJ.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1718710upJ.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1718710upJ.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1718710upJ.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1718710upJ.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1718710upJ.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1718710upJ.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1718710upJ.LLJ) && Intrinsics.LJFF(this.LLJI, c1718710upJ.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1718710upJ.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1718710upJ.LLJILJIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31) + this.LLJI.hashCode()) * 31;
        HintPageMsg hintPageMsg = this.LLJIJIL;
        return ((iHashCode + (hintPageMsg == null ? 0 : hintPageMsg.hashCode())) * 31) + this.LLJILJIL.hashCode();
    }

    public final String toString() {
        return "PinOfflineData(previousPageId=" + this.LL + ", productCode=" + this.LLILLJJLI + ", eventParam=" + this.LLILLL + ", mode=" + this.LLILZ + ", url=" + this.LLILZIL + ", host=" + this.LLILZLL + ", sessionId=" + this.LLIZ + ", merchantId=" + this.LLIZLLLIL + ", merchantUserId=" + this.LLJ + ", enterFrom=" + this.LLJI + ", hintPageMsg=" + this.LLJIJIL + ", theme=" + this.LLJILJIL + ')';
    }

    public C1718710upJ(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, HintPageMsg hintPageMsg, String str11) {
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
        this.LLJIJIL = hintPageMsg;
        this.LLJILJIL = str11;
    }
}
