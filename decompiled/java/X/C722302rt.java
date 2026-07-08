package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BonusInfoForBillSummary;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CheckoutBottomBarInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MemberShipModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderSummarySetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PriceSubText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02rt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C722302rt extends AbstractC756202xM {
    public final List<C714302qb> LLILZLL;
    public final Price LLIZ;
    public final Price LLIZLLLIL;
    public final Map<String, Object> LLJ;
    public final Boolean LLJI;
    public final Boolean LLJIJIL;
    public final String LLJILJIL;
    public final C714302qb LLJILJILJ;
    public final CheckoutBottomBarInfo LLJILLL;
    public final String LLJJ;
    public final OrderSummarySetting LLJJI;
    public final PriceSubText LLJJIII;
    public final Integer LLJJIJI;
    public final Integer LLJJIJIIJIL;
    public final String LLJJIJIL;
    public final String LLJJJ;
    public final String LLJJJIL;
    public final boolean LLJJJJ;
    public final BonusInfoForBillSummary LLJJJJJIL;
    public final MemberShipModule LLJJJJLIIL;
    public final boolean LLJJL;
    public final Summary LLJJLIIIJLLLLLLLZ;
    public final String LLJL;
    public final String LLJLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C722302rt)) {
            return false;
        }
        C722302rt c722302rt = (C722302rt) obj;
        return Intrinsics.LJFF(this.LLILZLL, c722302rt.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c722302rt.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c722302rt.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c722302rt.LLJ) && Intrinsics.LJFF(this.LLJI, c722302rt.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c722302rt.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c722302rt.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c722302rt.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c722302rt.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c722302rt.LLJJ) && Intrinsics.LJFF(this.LLJJI, c722302rt.LLJJI) && Intrinsics.LJFF(this.LLJJIII, c722302rt.LLJJIII) && Intrinsics.LJFF(this.LLJJIJI, c722302rt.LLJJIJI) && Intrinsics.LJFF(this.LLJJIJIIJIL, c722302rt.LLJJIJIIJIL) && Intrinsics.LJFF(this.LLJJIJIL, c722302rt.LLJJIJIL) && Intrinsics.LJFF(this.LLJJJ, c722302rt.LLJJJ) && Intrinsics.LJFF(this.LLJJJIL, c722302rt.LLJJJIL) && this.LLJJJJ == c722302rt.LLJJJJ && Intrinsics.LJFF(this.LLJJJJJIL, c722302rt.LLJJJJJIL) && Intrinsics.LJFF(this.LLJJJJLIIL, c722302rt.LLJJJJLIIL) && this.LLJJL == c722302rt.LLJJL && Intrinsics.LJFF(this.LLJJLIIIJLLLLLLLZ, c722302rt.LLJJLIIIJLLLLLLLZ);
    }

    public final int hashCode() {
        int iHashCode = this.LLILZLL.hashCode() * 31;
        Price price = this.LLIZ;
        int iHashCode2 = (iHashCode + (price == null ? 0 : price.hashCode())) * 31;
        Price price2 = this.LLIZLLLIL;
        int iHashCode3 = (iHashCode2 + (price2 == null ? 0 : price2.hashCode())) * 31;
        Map<String, Object> map = this.LLJ;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.LLJI;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LLJIJIL;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.LLJILJIL;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        C714302qb c714302qb = this.LLJILJILJ;
        int iHashCode8 = (iHashCode7 + (c714302qb == null ? 0 : c714302qb.hashCode())) * 31;
        CheckoutBottomBarInfo checkoutBottomBarInfo = this.LLJILLL;
        int iHashCode9 = (iHashCode8 + (checkoutBottomBarInfo == null ? 0 : checkoutBottomBarInfo.hashCode())) * 31;
        String str2 = this.LLJJ;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        OrderSummarySetting orderSummarySetting = this.LLJJI;
        int iHashCode11 = (iHashCode10 + (orderSummarySetting == null ? 0 : orderSummarySetting.hashCode())) * 31;
        PriceSubText priceSubText = this.LLJJIII;
        int iHashCode12 = (iHashCode11 + (priceSubText == null ? 0 : priceSubText.hashCode())) * 31;
        Integer num = this.LLJJIJI;
        int iHashCode13 = (iHashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LLJJIJIIJIL;
        int iHashCode14 = (iHashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.LLJJIJIL;
        int iHashCode15 = (iHashCode14 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLJJJ;
        int iHashCode16 = (iHashCode15 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LLJJJIL;
        int iHashCode17 = (((iHashCode16 + (str5 == null ? 0 : str5.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJJJ)) * 31;
        BonusInfoForBillSummary bonusInfoForBillSummary = this.LLJJJJJIL;
        int iHashCode18 = (iHashCode17 + (bonusInfoForBillSummary == null ? 0 : bonusInfoForBillSummary.hashCode())) * 31;
        MemberShipModule memberShipModule = this.LLJJJJLIIL;
        int iHashCode19 = (((iHashCode18 + (memberShipModule == null ? 0 : memberShipModule.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJL)) * 31;
        Summary summary = this.LLJJLIIIJLLLLLLLZ;
        return iHashCode19 + (summary != null ? summary.hashCode() : 0);
    }

    public final String toString() {
        return "SummaryVO(billItems=" + this.LLILZLL + ", total=" + this.LLIZ + ", totalDiscount=" + this.LLIZLLLIL + ", daInfo=" + this.LLJ + ", isUseSkeleton=" + this.LLJI + ", isPreHandle=" + this.LLJIJIL + ", productTaxDesc=" + this.LLJILJIL + ", totalBillItem=" + this.LLJILJILJ + ", checkoutBottomBarInfo=" + this.LLJILLL + ", totalIconInfo=" + this.LLJJ + ", orderSummarySetting=" + this.LLJJI + ", totalPriceSubText=" + this.LLJJIII + ", style=" + this.LLJJIJI + ", descType=" + this.LLJJIJIIJIL + ", title=" + this.LLJJIJIL + ", summaryDaInfo=" + this.LLJJJ + ", totalDiscountBenefitText=" + this.LLJJJIL + ", simpleMode=" + this.LLJJJJ + ", bonusInfoForBillSummary=" + this.LLJJJJJIL + ", memberShipModule=" + this.LLJJJJLIIL + ", hideMainTitle=" + this.LLJJL + ", summary=" + this.LLJJLIIIJLLLLLLLZ + ')';
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getGroupId() {
        return this.LLJL;
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getItemId() {
        return this.LLJLIL;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(C722302rt.class, interfaceC1891350zJl.getClass());
    }

    public static C722302rt LIZIZ(C722302rt c722302rt, Boolean bool, boolean z, boolean z2, int i) {
        List<C714302qb> list;
        Price price;
        Price price2;
        Map<String, Object> map;
        Boolean bool2;
        String str;
        C714302qb c714302qb;
        CheckoutBottomBarInfo checkoutBottomBarInfo;
        String str2;
        OrderSummarySetting orderSummarySetting;
        PriceSubText priceSubText;
        Integer num;
        Integer num2;
        String str3;
        String str4;
        String str5;
        BonusInfoForBillSummary bonusInfoForBillSummary;
        MemberShipModule memberShipModule;
        boolean z3 = z2;
        boolean z4 = z;
        Boolean bool3 = bool;
        Summary summary = null;
        if ((i & 1) != 0) {
            list = c722302rt.LLILZLL;
        } else {
            list = null;
        }
        if ((i & 2) != 0) {
            price = c722302rt.LLIZ;
        } else {
            price = null;
        }
        if ((i & 4) != 0) {
            price2 = c722302rt.LLIZLLLIL;
        } else {
            price2 = null;
        }
        if ((i & 8) != 0) {
            map = c722302rt.LLJ;
        } else {
            map = null;
        }
        if ((i & 16) != 0) {
            bool3 = c722302rt.LLJI;
        }
        if ((i & 32) != 0) {
            bool2 = c722302rt.LLJIJIL;
        } else {
            bool2 = null;
        }
        if ((i & 64) != 0) {
            str = c722302rt.LLJILJIL;
        } else {
            str = null;
        }
        if ((i & 128) != 0) {
            c714302qb = c722302rt.LLJILJILJ;
        } else {
            c714302qb = null;
        }
        if ((i & 256) != 0) {
            checkoutBottomBarInfo = c722302rt.LLJILLL;
        } else {
            checkoutBottomBarInfo = null;
        }
        if ((i & 512) != 0) {
            str2 = c722302rt.LLJJ;
        } else {
            str2 = null;
        }
        if ((i & 1024) != 0) {
            orderSummarySetting = c722302rt.LLJJI;
        } else {
            orderSummarySetting = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            priceSubText = c722302rt.LLJJIII;
        } else {
            priceSubText = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            num = c722302rt.LLJJIJI;
        } else {
            num = null;
        }
        if ((i & 8192) != 0) {
            num2 = c722302rt.LLJJIJIIJIL;
        } else {
            num2 = null;
        }
        if ((i & 16384) != 0) {
            str3 = c722302rt.LLJJIJIL;
        } else {
            str3 = null;
        }
        if ((32768 & i) != 0) {
            str4 = c722302rt.LLJJJ;
        } else {
            str4 = null;
        }
        if ((65536 & i) != 0) {
            str5 = c722302rt.LLJJJIL;
        } else {
            str5 = null;
        }
        if ((131072 & i) != 0) {
            z4 = c722302rt.LLJJJJ;
        }
        if ((262144 & i) != 0) {
            bonusInfoForBillSummary = c722302rt.LLJJJJJIL;
        } else {
            bonusInfoForBillSummary = null;
        }
        if ((524288 & i) != 0) {
            memberShipModule = c722302rt.LLJJJJLIIL;
        } else {
            memberShipModule = null;
        }
        if ((1048576 & i) != 0) {
            z3 = c722302rt.LLJJL;
        }
        if ((i & 2097152) != 0) {
            summary = c722302rt.LLJJLIIIJLLLLLLLZ;
        }
        c722302rt.getClass();
        return new C722302rt(list, price, price2, map, bool3, bool2, str, c714302qb, checkoutBottomBarInfo, str2, orderSummarySetting, priceSubText, num, num2, str3, str4, str5, z4, bonusInfoForBillSummary, memberShipModule, z3, summary);
    }

    public /* synthetic */ C722302rt(List list, Price price, Price price2, Map map, Boolean bool, Boolean bool2, String str, C714302qb c714302qb, CheckoutBottomBarInfo checkoutBottomBarInfo, String str2, OrderSummarySetting orderSummarySetting, PriceSubText priceSubText, Integer num, Integer num2, String str3, String str4, String str5, BonusInfoForBillSummary bonusInfoForBillSummary, MemberShipModule memberShipModule, Summary summary, int i) {
        this(list, (i & 2) != 0 ? null : price, (i & 4) != 0 ? null : price2, (i & 8) != 0 ? null : map, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : str, (i & 128) != 0 ? null : c714302qb, (i & 256) != 0 ? null : checkoutBottomBarInfo, (i & 512) != 0 ? null : str2, (i & 1024) != 0 ? null : orderSummarySetting, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : priceSubText, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : num, (i & 8192) != 0 ? null : num2, (i & 16384) != 0 ? null : str3, (32768 & i) != 0 ? null : str4, (65536 & i) != 0 ? null : str5, false, (262144 & i) != 0 ? null : bonusInfoForBillSummary, (524288 & i) != 0 ? null : memberShipModule, false, (i & 2097152) == 0 ? summary : null);
    }

    public C722302rt(List<C714302qb> list, Price price, Price price2, Map<String, ? extends Object> map, Boolean bool, Boolean bool2, String str, C714302qb c714302qb, CheckoutBottomBarInfo checkoutBottomBarInfo, String str2, OrderSummarySetting orderSummarySetting, PriceSubText priceSubText, Integer num, Integer num2, String str3, String str4, String str5, boolean z, BonusInfoForBillSummary bonusInfoForBillSummary, MemberShipModule memberShipModule, boolean z2, Summary summary) {
        this.LLILZLL = list;
        this.LLIZ = price;
        this.LLIZLLLIL = price2;
        this.LLJ = map;
        this.LLJI = bool;
        this.LLJIJIL = bool2;
        this.LLJILJIL = str;
        this.LLJILJILJ = c714302qb;
        this.LLJILLL = checkoutBottomBarInfo;
        this.LLJJ = str2;
        this.LLJJI = orderSummarySetting;
        this.LLJJIII = priceSubText;
        this.LLJJIJI = num;
        this.LLJJIJIIJIL = num2;
        this.LLJJIJIL = str3;
        this.LLJJJ = str4;
        this.LLJJJIL = str5;
        this.LLJJJJ = z;
        this.LLJJJJJIL = bonusInfoForBillSummary;
        this.LLJJJJLIIL = memberShipModule;
        this.LLJJL = z2;
        this.LLJJLIIIJLLLLLLLZ = summary;
        this.LLJL = "order_summary";
        this.LLJLIL = "order_summary_item";
    }
}
