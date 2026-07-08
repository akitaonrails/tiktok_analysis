package X;

import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPanelModule;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticsExpressionPanel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonDescInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonPanelInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PurchaseRewardInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopBill;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02rP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C719302rP extends AbstractC756202xM {
    public final String LLILZLL;
    public final ECRichText LLIZ;
    public final List<C719202rO> LLIZLLLIL;
    public final List<LogisticDTO> LLJ;
    public final String LLJI;
    public final String LLJIJIL;
    public final String LLJILJIL;
    public final LogisticPanelModule LLJILJILJ;
    public final Boolean LLJILLL;
    public final LogisticsExpressionPanel LLJJ;
    public final String LLJJI;
    public final AddonPanelInfo LLJJIII;
    public final AddonDescInfo LLJJIJI;
    public final PurchaseRewardInfo LLJJIJIIJIL;
    public final Map<String, String> LLJJIJIL;
    public final ShopBill LLJJJ;
    public final int LLJJJIL;
    public final String LLJJJJ;
    public final String LLJJJJJIL;
    public final String LLJJJJLIIL = "shop_orders_new";
    public final String LLJJL = "shop_orders_new_aggregation_item";
    public int LLJJLIIIJLLLLLLLZ = -1;
    public int LLJL = -1;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C719302rP)) {
            return false;
        }
        C719302rP c719302rP = (C719302rP) obj;
        return Intrinsics.LJFF(this.LLILZLL, c719302rP.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c719302rP.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c719302rP.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c719302rP.LLJ) && Intrinsics.LJFF(this.LLJI, c719302rP.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c719302rP.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c719302rP.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c719302rP.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c719302rP.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c719302rP.LLJJ) && Intrinsics.LJFF(this.LLJJI, c719302rP.LLJJI) && Intrinsics.LJFF(this.LLJJIII, c719302rP.LLJJIII) && Intrinsics.LJFF(this.LLJJIJI, c719302rP.LLJJIJI) && Intrinsics.LJFF(this.LLJJIJIIJIL, c719302rP.LLJJIJIIJIL) && Intrinsics.LJFF(this.LLJJIJIL, c719302rP.LLJJIJIL) && Intrinsics.LJFF(this.LLJJJ, c719302rP.LLJJJ) && this.LLJJJIL == c719302rP.LLJJJIL && Intrinsics.LJFF(this.LLJJJJ, c719302rP.LLJJJJ) && Intrinsics.LJFF(this.LLJJJJJIL, c719302rP.LLJJJJJIL);
    }

    public final int hashCode() {
        String str = this.LLILZLL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ECRichText eCRichText = this.LLIZ;
        int iHashCode2 = (((iHashCode + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31) + this.LLIZLLLIL.hashCode()) * 31;
        List<LogisticDTO> list = this.LLJ;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.LLJI;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLJIJIL;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLJILJIL;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        LogisticPanelModule logisticPanelModule = this.LLJILJILJ;
        int iHashCode7 = (iHashCode6 + (logisticPanelModule == null ? 0 : logisticPanelModule.hashCode())) * 31;
        Boolean bool = this.LLJILLL;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        LogisticsExpressionPanel logisticsExpressionPanel = this.LLJJ;
        int iHashCode9 = (iHashCode8 + (logisticsExpressionPanel == null ? 0 : logisticsExpressionPanel.hashCode())) * 31;
        String str5 = this.LLJJI;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        AddonPanelInfo addonPanelInfo = this.LLJJIII;
        int iHashCode11 = (iHashCode10 + (addonPanelInfo == null ? 0 : addonPanelInfo.hashCode())) * 31;
        AddonDescInfo addonDescInfo = this.LLJJIJI;
        int iHashCode12 = (iHashCode11 + (addonDescInfo == null ? 0 : addonDescInfo.hashCode())) * 31;
        PurchaseRewardInfo purchaseRewardInfo = this.LLJJIJIIJIL;
        int iHashCode13 = (iHashCode12 + (purchaseRewardInfo == null ? 0 : purchaseRewardInfo.hashCode())) * 31;
        Map<String, String> map = this.LLJJIJIL;
        int iHashCode14 = (iHashCode13 + (map == null ? 0 : map.hashCode())) * 31;
        ShopBill shopBill = this.LLJJJ;
        int iHashCode15 = (((iHashCode14 + (shopBill == null ? 0 : shopBill.hashCode())) * 31) + this.LLJJJIL) * 31;
        String str6 = this.LLJJJJ;
        int iHashCode16 = (iHashCode15 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LLJJJJJIL;
        return iHashCode16 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        return "AggregationOrderVO(aggregationOrderTitle=" + this.LLILZLL + ", aggregationOrderRichTitle=" + this.LLIZ + ", shopInfoList=" + this.LLIZLLLIL + ", logistics=" + this.LLJ + ", shippingTitle=" + this.LLJI + ", itemQuantityDesc=" + this.LLJIJIL + ", productPanelTitle=" + this.LLJILJIL + ", logisticsExpressionModule=" + this.LLJILJILJ + ", disableLogisticAreaPage=" + this.LLJILLL + ", mainOrderAggregateLogistic=" + this.LLJJ + ", fulfillTitle=" + this.LLJJI + ", freeShippingAddonPanel=" + this.LLJJIII + ", addonDescInfo=" + this.LLJJIJI + ", purchaseRewardBanner=" + this.LLJJIJIIJIL + ", daInfo=" + this.LLJJIJIL + ", groupShopBill=" + this.LLJJJ + ", skuNum=" + this.LLJJJIL + ", shipmentTypeTitle=" + this.LLJJJJ + ", groupSubTitle=" + this.LLJJJJJIL + ')';
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getGroupId() {
        return this.LLJJJJLIIL;
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getItemId() {
        return this.LLJJL;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C719302rP) {
            return true;
        }
        return super.areItemTheSame(interfaceC1891350zJl);
    }

    public C719302rP(String str, ECRichText eCRichText, List<C719202rO> list, List<LogisticDTO> list2, String str2, String str3, String str4, LogisticPanelModule logisticPanelModule, Boolean bool, LogisticsExpressionPanel logisticsExpressionPanel, String str5, AddonPanelInfo addonPanelInfo, AddonDescInfo addonDescInfo, PurchaseRewardInfo purchaseRewardInfo, Map<String, String> map, ShopBill shopBill, int i, String str6, String str7) {
        this.LLILZLL = str;
        this.LLIZ = eCRichText;
        this.LLIZLLLIL = list;
        this.LLJ = list2;
        this.LLJI = str2;
        this.LLJIJIL = str3;
        this.LLJILJIL = str4;
        this.LLJILJILJ = logisticPanelModule;
        this.LLJILLL = bool;
        this.LLJJ = logisticsExpressionPanel;
        this.LLJJI = str5;
        this.LLJJIII = addonPanelInfo;
        this.LLJJIJI = addonDescInfo;
        this.LLJJIJIIJIL = purchaseRewardInfo;
        this.LLJJIJIL = map;
        this.LLJJJ = shopBill;
        this.LLJJJIL = i;
        this.LLJJJJ = str6;
        this.LLJJJJJIL = str7;
    }
}
