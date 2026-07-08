package X;

import com.ss.android.ugc.aweme.biz.wallet.network.model.RegionMobileCodeItem;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uqI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1719320uqI implements InterfaceC111300bX {
    public final String LL;
    public final ArrayList<RegionMobileCodeItem> LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public final boolean LLJIJIL;
    public final String LLJILJIL;
    public final String LLJILJILJ;
    public final boolean LLJILLL;
    public final String LLJJ;
    public final String LLJJI;
    public final String LLJJIII;
    public final String LLJJIJI;
    public final boolean LLJJIJIIJIL;
    public final HashMap<String, String> LLJJIJIL;
    public final String LLJJJ;
    public final String LLJJJIL;
    public final String LLJJJJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1719320uqI)) {
            return false;
        }
        C1719320uqI c1719320uqI = (C1719320uqI) obj;
        return Intrinsics.LJFF(this.LL, c1719320uqI.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1719320uqI.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1719320uqI.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1719320uqI.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1719320uqI.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1719320uqI.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1719320uqI.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1719320uqI.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1719320uqI.LLJ) && Intrinsics.LJFF(this.LLJI, c1719320uqI.LLJI) && this.LLJIJIL == c1719320uqI.LLJIJIL && Intrinsics.LJFF(this.LLJILJIL, c1719320uqI.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1719320uqI.LLJILJILJ) && this.LLJILLL == c1719320uqI.LLJILLL && Intrinsics.LJFF(this.LLJJ, c1719320uqI.LLJJ) && Intrinsics.LJFF(this.LLJJI, c1719320uqI.LLJJI) && Intrinsics.LJFF(this.LLJJIII, c1719320uqI.LLJJIII) && Intrinsics.LJFF(this.LLJJIJI, c1719320uqI.LLJJIJI) && this.LLJJIJIIJIL == c1719320uqI.LLJJIJIIJIL && Intrinsics.LJFF(this.LLJJIJIL, c1719320uqI.LLJJIJIL) && Intrinsics.LJFF(this.LLJJJ, c1719320uqI.LLJJJ) && Intrinsics.LJFF(this.LLJJJIL, c1719320uqI.LLJJJIL) && Intrinsics.LJFF(this.LLJJJJ, c1719320uqI.LLJJJJ);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31) + this.LLJI.hashCode()) * 31) + C786410Ut5.Z2(this.LLJIJIL)) * 31) + this.LLJILJIL.hashCode()) * 31) + this.LLJILJILJ.hashCode()) * 31) + C786410Ut5.Z2(this.LLJILLL)) * 31) + this.LLJJ.hashCode()) * 31) + this.LLJJI.hashCode()) * 31) + this.LLJJIII.hashCode()) * 31) + this.LLJJIJI.hashCode()) * 31) + C786410Ut5.Z2(this.LLJJIJIIJIL)) * 31) + this.LLJJIJIL.hashCode()) * 31) + this.LLJJJ.hashCode()) * 31) + this.LLJJJIL.hashCode()) * 31) + this.LLJJJJ.hashCode();
    }

    public final String toString() {
        return "CollectMobileFromTTData(previousPageId=" + this.LL + ", regionCountryCode=" + this.LLILLJJLI + ", scene=" + this.LLILLL + ", title=" + this.LLILZ + ", agreement=" + this.LLILZIL + ", eventParam=" + this.LLILZLL + ", desc=" + this.LLIZ + ", mobileDesc=" + this.LLIZLLLIL + ", mobileMask=" + this.LLJ + ", ttMobileAgreement=" + this.LLJI + ", supportAnotherPhone=" + this.LLJIJIL + ", continueButtonText=" + this.LLJILJIL + ", anotherButtonText=" + this.LLJILJILJ + ", selfVerify=" + this.LLJILLL + ", phonePageTitle=" + this.LLJJ + ", phonePageDesc=" + this.LLJJI + ", phonePageContinue=" + this.LLJJIII + ", phonePageFooter=" + this.LLJJIJI + ", autoCloseSelfOtp=" + this.LLJJIJIIJIL + ", experimentsMap=" + this.LLJJIJIL + ", mode=" + this.LLJJJ + ", customerServiceUrl=" + this.LLJJJIL + ", sourceBtmToken=" + this.LLJJJJ + ')';
    }

    public C1719320uqI(String str, ArrayList<RegionMobileCodeItem> arrayList, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10, String str11, boolean z2, String str12, String str13, String str14, String str15, boolean z3, HashMap<String, String> map, String str16, String str17, String str18) {
        this.LL = str;
        this.LLILLJJLI = arrayList;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = str6;
        this.LLIZLLLIL = str7;
        this.LLJ = str8;
        this.LLJI = str9;
        this.LLJIJIL = z;
        this.LLJILJIL = str10;
        this.LLJILJILJ = str11;
        this.LLJILLL = z2;
        this.LLJJ = str12;
        this.LLJJI = str13;
        this.LLJJIII = str14;
        this.LLJJIJI = str15;
        this.LLJJIJIIJIL = z3;
        this.LLJJIJIL = map;
        this.LLJJJ = str16;
        this.LLJJJIL = str17;
        this.LLJJJJ = str18;
    }
}
