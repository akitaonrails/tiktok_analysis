package X;

import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPanelModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonDescInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonPanelInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OSPPageModuleConfig;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopBill;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02rQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C719402rQ extends AbstractC756202xM {
    public final String LLILZLL;
    public final List<C719202rO> LLIZ;
    public final List<LogisticDTO> LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public final String LLJIJIL;
    public final LogisticPanelModule LLJILJIL;
    public final AddonPanelInfo LLJILJILJ;
    public final AddonDescInfo LLJILLL;
    public final Map<String, String> LLJJ;
    public final ShopBill LLJJI;
    public final int LLJJIII;
    public final String LLJJIJI;
    public final String LLJJIJIIJIL;
    public int LLJJIJIL = -1;
    public boolean LLJJJ;
    public boolean LLJJJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C719402rQ)) {
            return false;
        }
        C719402rQ c719402rQ = (C719402rQ) obj;
        return Intrinsics.LJFF(this.LLILZLL, c719402rQ.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c719402rQ.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c719402rQ.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c719402rQ.LLJ) && Intrinsics.LJFF(this.LLJI, c719402rQ.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c719402rQ.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c719402rQ.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c719402rQ.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c719402rQ.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c719402rQ.LLJJ) && Intrinsics.LJFF(this.LLJJI, c719402rQ.LLJJI) && this.LLJJIII == c719402rQ.LLJJIII && Intrinsics.LJFF(this.LLJJIJI, c719402rQ.LLJJIJI) && Intrinsics.LJFF(this.LLJJIJIIJIL, c719402rQ.LLJJIJIIJIL);
    }

    public final int hashCode() {
        String str = this.LLILZLL;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.LLIZ.hashCode()) * 31;
        List<LogisticDTO> list = this.LLIZLLLIL;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.LLJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLJI;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLJIJIL;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        LogisticPanelModule logisticPanelModule = this.LLJILJIL;
        int iHashCode6 = (iHashCode5 + (logisticPanelModule == null ? 0 : logisticPanelModule.hashCode())) * 31;
        AddonPanelInfo addonPanelInfo = this.LLJILJILJ;
        int iHashCode7 = (iHashCode6 + (addonPanelInfo == null ? 0 : addonPanelInfo.hashCode())) * 31;
        AddonDescInfo addonDescInfo = this.LLJILLL;
        int iHashCode8 = (iHashCode7 + (addonDescInfo == null ? 0 : addonDescInfo.hashCode())) * 31;
        Map<String, String> map = this.LLJJ;
        int iHashCode9 = (iHashCode8 + (map == null ? 0 : map.hashCode())) * 31;
        ShopBill shopBill = this.LLJJI;
        int iHashCode10 = (((iHashCode9 + (shopBill == null ? 0 : shopBill.hashCode())) * 31) + this.LLJJIII) * 31;
        String str5 = this.LLJJIJI;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LLJJIJIIJIL;
        return iHashCode11 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        return "MXAggregationOrderVO(aggregationOrderTitle=" + this.LLILZLL + ", shopInfoList=" + this.LLIZ + ", logistics=" + this.LLIZLLLIL + ", shippingTitle=" + this.LLJ + ", itemQuantityDesc=" + this.LLJI + ", productPanelTitle=" + this.LLJIJIL + ", logisticsExpressionModule=" + this.LLJILJIL + ", freeShippingAddonPanel=" + this.LLJILJILJ + ", addonDescInfo=" + this.LLJILLL + ", daInfo=" + this.LLJJ + ", groupShopBill=" + this.LLJJI + ", skuNum=" + this.LLJJIII + ", shipmentTypeTitle=" + this.LLJJIJI + ", fulfillTitle=" + this.LLJJIJIIJIL + ')';
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getGroupId() {
        String str;
        OSPPageModuleConfig oSPPageModuleConfig = this.LLILLL;
        return (oSPPageModuleConfig == null || (str = oSPPageModuleConfig.name) == null) ? "shop_orders_new" : str;
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getItemId() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mx_aggregation_order_item_");
        sbLIZ.append(this.LLJJIJIL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C719402rQ) {
            return true;
        }
        return super.areItemTheSame(interfaceC1891350zJl);
    }

    public C719402rQ(String str, List<C719202rO> list, List<LogisticDTO> list2, String str2, String str3, String str4, LogisticPanelModule logisticPanelModule, AddonPanelInfo addonPanelInfo, AddonDescInfo addonDescInfo, Map<String, String> map, ShopBill shopBill, int i, String str5, String str6) {
        this.LLILZLL = str;
        this.LLIZ = list;
        this.LLIZLLLIL = list2;
        this.LLJ = str2;
        this.LLJI = str3;
        this.LLJIJIL = str4;
        this.LLJILJIL = logisticPanelModule;
        this.LLJILJILJ = addonPanelInfo;
        this.LLJILLL = addonDescInfo;
        this.LLJJ = map;
        this.LLJJI = shopBill;
        this.LLJJIII = i;
        this.LLJJIJI = str5;
        this.LLJJIJIIJIL = str6;
    }
}
