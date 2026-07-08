package X;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uq4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1719180uq4 implements InterfaceC111300bX {
    public final String LL;
    public final EnumC1717460unI LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public final String LLJIJIL;
    public final String LLJILJIL;
    public final String LLJILJILJ;
    public final String LLJILLL;
    public final String LLJJ;
    public final HashMap<String, String> LLJJI;
    public final String LLJJIII;
    public final String LLJJIJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1719180uq4)) {
            return false;
        }
        C1719180uq4 c1719180uq4 = (C1719180uq4) obj;
        return Intrinsics.LJFF(this.LL, c1719180uq4.LL) && this.LLILLJJLI == c1719180uq4.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1719180uq4.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1719180uq4.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1719180uq4.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1719180uq4.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1719180uq4.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1719180uq4.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1719180uq4.LLJ) && Intrinsics.LJFF(this.LLJI, c1719180uq4.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1719180uq4.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1719180uq4.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1719180uq4.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c1719180uq4.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c1719180uq4.LLJJ) && Intrinsics.LJFF(this.LLJJI, c1719180uq4.LLJJI) && Intrinsics.LJFF(this.LLJJIII, c1719180uq4.LLJJIII) && Intrinsics.LJFF(this.LLJJIJI, c1719180uq4.LLJJIJI);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31) + this.LLJI.hashCode()) * 31) + this.LLJIJIL.hashCode()) * 31) + this.LLJILJIL.hashCode()) * 31) + this.LLJILJILJ.hashCode()) * 31) + this.LLJILLL.hashCode()) * 31) + this.LLJJ.hashCode()) * 31) + this.LLJJI.hashCode()) * 31) + this.LLJJIII.hashCode()) * 31) + this.LLJJIJI.hashCode();
    }

    public final String toString() {
        return "PinConfirmData(firstInputPin=" + this.LL + ", pinSetMode=" + this.LLILLJJLI + ", previousPageId=" + this.LLILLL + ", scene=" + this.LLILZ + ", eventParam=" + this.LLILZIL + ", host=" + this.LLILZLL + ", sessionId=" + this.LLIZ + ", merchantId=" + this.LLIZLLLIL + ", merchantUserId=" + this.LLJ + ", enterFrom=" + this.LLJI + ", theme=" + this.LLJIJIL + ", confirmPinTitle=" + this.LLJILJIL + ", confirmPinDesc=" + this.LLJILJILJ + ", continueText=" + this.LLJILLL + ", footerText=" + this.LLJJ + ", experimentsMap=" + this.LLJJI + ", customerServiceUrl=" + this.LLJJIII + ", btmPageId=" + this.LLJJIJI + ')';
    }

    public C1719180uq4(String str, EnumC1717460unI enumC1717460unI, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, HashMap<String, String> map, String str15, String str16) {
        this.LL = str;
        this.LLILLJJLI = enumC1717460unI;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = str6;
        this.LLIZLLLIL = str7;
        this.LLJ = str8;
        this.LLJI = str9;
        this.LLJIJIL = str10;
        this.LLJILJIL = str11;
        this.LLJILJILJ = str12;
        this.LLJILLL = str13;
        this.LLJJ = str14;
        this.LLJJI = map;
        this.LLJJIII = str15;
        this.LLJJIJI = str16;
    }
}
