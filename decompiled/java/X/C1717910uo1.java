package X;

import com.ss.android.ugc.aweme.biz.wallet.network.model.RegionMobileCodeItem;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uo1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1717910uo1 implements InterfaceC111300bX {
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
    public final boolean LLJILJIL;
    public final HashMap<String, String> LLJILJILJ;
    public final String LLJILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1717910uo1)) {
            return false;
        }
        C1717910uo1 c1717910uo1 = (C1717910uo1) obj;
        return Intrinsics.LJFF(this.LL, c1717910uo1.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1717910uo1.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1717910uo1.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1717910uo1.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1717910uo1.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1717910uo1.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1717910uo1.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1717910uo1.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1717910uo1.LLJ) && Intrinsics.LJFF(this.LLJI, c1717910uo1.LLJI) && this.LLJIJIL == c1717910uo1.LLJIJIL && this.LLJILJIL == c1717910uo1.LLJILJIL && Intrinsics.LJFF(this.LLJILJILJ, c1717910uo1.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c1717910uo1.LLJILLL);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31) + this.LLJI.hashCode()) * 31) + C786410Ut5.Z2(this.LLJIJIL)) * 31) + C786410Ut5.Z2(this.LLJILJIL)) * 31) + this.LLJILJILJ.hashCode()) * 31) + this.LLJILLL.hashCode();
    }

    public final String toString() {
        return "PhoneNumberData(previousPageId=" + this.LL + ", regionCountryCode=" + this.LLILLJJLI + ", scene=" + this.LLILLL + ", title=" + this.LLILZ + ", agreement=" + this.LLILZIL + ", eventParam=" + this.LLILZLL + ", mode=" + this.LLIZ + ", desc=" + this.LLIZLLLIL + ", continueText=" + this.LLJ + ", footer=" + this.LLJI + ", selfVerify=" + this.LLJIJIL + ", autoCloseSelfOtp=" + this.LLJILJIL + ", experimentsMap=" + this.LLJILJILJ + ", customerServiceUrl=" + this.LLJILLL + ')';
    }

    public C1717910uo1(String str, ArrayList<RegionMobileCodeItem> arrayList, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, HashMap<String, String> map, String str10) {
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
        this.LLJILJIL = z2;
        this.LLJILJILJ = map;
        this.LLJILLL = str10;
    }
}
