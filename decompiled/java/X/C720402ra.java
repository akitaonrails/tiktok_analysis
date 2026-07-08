package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OSPPageModuleConfig;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.QuantityControlInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuCardExtendInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLogo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02ra, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C720402ra extends AbstractC756202xM {
    public final Image LLILZLL;
    public final Boolean LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;
    public final C719102rN LLJI;
    public final List<PromotionSellingPoint> LLJIJIL;
    public final List<PromotionLogo> LLJILJIL;
    public final Integer LLJILJILJ;
    public final QuantityControlInfo LLJILLL;
    public final SkuCardExtendInfo LLJJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C720402ra)) {
            return false;
        }
        C720402ra c720402ra = (C720402ra) obj;
        return Intrinsics.LJFF(this.LLILZLL, c720402ra.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c720402ra.LLIZ) && this.LLIZLLLIL == c720402ra.LLIZLLLIL && this.LLJ == c720402ra.LLJ && Intrinsics.LJFF(this.LLJI, c720402ra.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c720402ra.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c720402ra.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c720402ra.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c720402ra.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c720402ra.LLJJ);
    }

    public final int hashCode() {
        Image image = this.LLILZLL;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        Boolean bool = this.LLIZ;
        int iHashCode2 = (((((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + C786410Ut5.Z2(this.LLJ)) * 31;
        C719102rN c719102rN = this.LLJI;
        int iHashCode3 = (iHashCode2 + (c719102rN == null ? 0 : c719102rN.hashCode())) * 31;
        List<PromotionSellingPoint> list = this.LLJIJIL;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<PromotionLogo> list2 = this.LLJILJIL;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.LLJILJILJ;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        QuantityControlInfo quantityControlInfo = this.LLJILLL;
        int iHashCode7 = (iHashCode6 + (quantityControlInfo == null ? 0 : quantityControlInfo.hashCode())) * 31;
        SkuCardExtendInfo skuCardExtendInfo = this.LLJJ;
        return iHashCode7 + (skuCardExtendInfo != null ? skuCardExtendInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CombinedSkuMainOrderInfoVO(productImg=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", isUseSkeleton=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", hasAddress=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", available=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", skuInfo=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(", promotionSellingPoints=");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(", promotionLogos=");
        sbLIZ.append(this.LLJILJIL);
        sbLIZ.append(", skuCardLayoutType=");
        sbLIZ.append(this.LLJILJILJ);
        sbLIZ.append(", quantityControlInfo=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(", skuCardExtInfo=");
        sbLIZ.append(this.LLJJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getGroupId() {
        String str;
        OSPPageModuleConfig oSPPageModuleConfig = this.LLILLL;
        return (oSPPageModuleConfig == null || (str = oSPPageModuleConfig.name) == null) ? "shop_orders_new" : str;
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getItemId() {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("combined_sku_main_order_item_");
        C719102rN c719102rN = this.LLJI;
        if (c719102rN == null || (str = c719102rN.LLILZLL) == null) {
            str = "";
        }
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C720402ra;
    }

    public C720402ra(Image image, Boolean bool, boolean z, boolean z2, C719102rN c719102rN, List<PromotionSellingPoint> list, List<PromotionLogo> list2, Integer num, QuantityControlInfo quantityControlInfo, SkuCardExtendInfo skuCardExtendInfo) {
        this.LLILZLL = image;
        this.LLIZ = bool;
        this.LLIZLLLIL = z;
        this.LLJ = z2;
        this.LLJI = c719102rN;
        this.LLJIJIL = list;
        this.LLJILJIL = list2;
        this.LLJILJILJ = num;
        this.LLJILLL = quantityControlInfo;
        this.LLJJ = skuCardExtendInfo;
    }
}
