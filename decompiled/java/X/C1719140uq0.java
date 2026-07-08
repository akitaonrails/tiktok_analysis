package X;

import com.ss.android.ugc.aweme.component.verify.pin.model.PinRule;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uq0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1719140uq0 implements InterfaceC111300bX {
    public final EnumC1717460unI LL;
    public final List<PinRule> LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final long LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public final String LLJIJIL;
    public final String LLJILJIL;
    public final String LLJILJILJ;
    public final String LLJILLL;
    public final String LLJJ;
    public final String LLJJI;
    public final String LLJJIII;
    public final String LLJJIJI;
    public final HashMap<String, String> LLJJIJIIJIL;
    public final String LLJJIJIL;
    public final String LLJJJ;
    public final String LLJJJIL;
    public final String LLJJJJ;
    public final String LLJJJJJIL;
    public final String LLJJJJLIIL;
    public final String LLJJL;
    public final boolean LLJJLIIIJLLLLLLLZ;
    public final String LLJL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1719140uq0)) {
            return false;
        }
        C1719140uq0 c1719140uq0 = (C1719140uq0) obj;
        return this.LL == c1719140uq0.LL && Intrinsics.LJFF(this.LLILLJJLI, c1719140uq0.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1719140uq0.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1719140uq0.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1719140uq0.LLILZIL) && this.LLILZLL == c1719140uq0.LLILZLL && Intrinsics.LJFF(this.LLIZ, c1719140uq0.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1719140uq0.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1719140uq0.LLJ) && Intrinsics.LJFF(this.LLJI, c1719140uq0.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1719140uq0.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1719140uq0.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1719140uq0.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c1719140uq0.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c1719140uq0.LLJJ) && Intrinsics.LJFF(this.LLJJI, c1719140uq0.LLJJI) && Intrinsics.LJFF(this.LLJJIII, c1719140uq0.LLJJIII) && Intrinsics.LJFF(this.LLJJIJI, c1719140uq0.LLJJIJI) && Intrinsics.LJFF(this.LLJJIJIIJIL, c1719140uq0.LLJJIJIIJIL) && Intrinsics.LJFF(this.LLJJIJIL, c1719140uq0.LLJJIJIL) && Intrinsics.LJFF(this.LLJJJ, c1719140uq0.LLJJJ) && Intrinsics.LJFF(this.LLJJJIL, c1719140uq0.LLJJJIL) && Intrinsics.LJFF(this.LLJJJJ, c1719140uq0.LLJJJJ) && Intrinsics.LJFF(this.LLJJJJJIL, c1719140uq0.LLJJJJJIL) && Intrinsics.LJFF(this.LLJJJJLIIL, c1719140uq0.LLJJJJLIIL) && Intrinsics.LJFF(this.LLJJL, c1719140uq0.LLJJL) && this.LLJJLIIIJLLLLLLLZ == c1719140uq0.LLJJLIIIJLLLLLLLZ && Intrinsics.LJFF(this.LLJL, c1719140uq0.LLJL);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + C786410Ut5.Y2(this.LLILZLL)) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31) + this.LLJI.hashCode()) * 31) + this.LLJIJIL.hashCode()) * 31) + this.LLJILJIL.hashCode()) * 31) + this.LLJILJILJ.hashCode()) * 31) + this.LLJILLL.hashCode()) * 31) + this.LLJJ.hashCode()) * 31) + this.LLJJI.hashCode()) * 31) + this.LLJJIII.hashCode()) * 31) + this.LLJJIJI.hashCode()) * 31) + this.LLJJIJIIJIL.hashCode()) * 31) + this.LLJJIJIL.hashCode()) * 31) + this.LLJJJ.hashCode()) * 31) + this.LLJJJIL.hashCode()) * 31) + this.LLJJJJ.hashCode()) * 31) + this.LLJJJJJIL.hashCode()) * 31) + this.LLJJJJLIIL.hashCode()) * 31) + this.LLJJL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJJLIIIJLLLLLLLZ)) * 31) + this.LLJL.hashCode();
    }

    public final String toString() {
        return "PinSetData(pinSetMode=" + this.LL + ", pinRuleList=" + this.LLILLJJLI + ", previousPageId=" + this.LLILLL + ", productCode=" + this.LLILZ + ", eventParam=" + this.LLILZIL + ", enterTime=" + this.LLILZLL + ", host=" + this.LLIZ + ", sessionId=" + this.LLIZLLLIL + ", merchantId=" + this.LLJ + ", merchantUserId=" + this.LLJI + ", enterFrom=" + this.LLJIJIL + ", theme=" + this.LLJILJIL + ", createPinTitle=" + this.LLJILJILJ + ", createPinDesc=" + this.LLJILLL + ", confirmPinTitle=" + this.LLJJ + ", confirmPinDesc=" + this.LLJJI + ", continueText=" + this.LLJJIII + ", footerText=" + this.LLJJIJI + ", experimentsMap=" + this.LLJJIJIIJIL + ", customerServiceUrl=" + this.LLJJIJIL + ", exitPopoutTitle=" + this.LLJJJ + ", exitPopoutDesc=" + this.LLJJJIL + ", exitPopoutBtnMain=" + this.LLJJJJ + ", exitPopoutBtnSub=" + this.LLJJJJJIL + ", exitPopoutImageUrl=" + this.LLJJJJLIIL + ", exitPopoutImageDarkUrl=" + this.LLJJL + ", hitMarketing=" + this.LLJJLIIIJLLLLLLLZ + ", coolingOffNotice=" + this.LLJL + ')';
    }

    public C1719140uq0(EnumC1717460unI enumC1717460unI, List<PinRule> list, String str, String str2, String str3, long j, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, HashMap<String, String> map, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z, String str23) {
        this.LL = enumC1717460unI;
        this.LLILLJJLI = list;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = j;
        this.LLIZ = str4;
        this.LLIZLLLIL = str5;
        this.LLJ = str6;
        this.LLJI = str7;
        this.LLJIJIL = str8;
        this.LLJILJIL = str9;
        this.LLJILJILJ = str10;
        this.LLJILLL = str11;
        this.LLJJ = str12;
        this.LLJJI = str13;
        this.LLJJIII = str14;
        this.LLJJIJI = str15;
        this.LLJJIJIIJIL = map;
        this.LLJJIJIL = str16;
        this.LLJJJ = str17;
        this.LLJJJIL = str18;
        this.LLJJJJ = str19;
        this.LLJJJJJIL = str20;
        this.LLJJJJLIIL = str21;
        this.LLJJL = str22;
        this.LLJJLIIIJLLLLLLLZ = z;
        this.LLJL = str23;
    }
}
