package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CombinedSalesVolume;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.MarketingConfig;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPaymentModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PickTag;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLabelVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLogo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SEACCIPaymentModule;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03wg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1006803wg {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLogo>] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.ArrayList] */
    public static C1008503wx LIZ(ProductPackStruct productPackStruct, boolean z, PreOrderInfo preOrderInfo, Boolean bool, boolean z2, PdpPaymentModule pdpPaymentModule, C10380044c c10380044c, SEACCIPaymentModule sEACCIPaymentModule) {
        boolean z3;
        String str;
        CombinedSalesVolume combinedSalesVolume;
        boolean z4;
        PromotionLabelVO promotionLabelVO;
        ProductPackStruct productPackStruct2;
        ?? arrayList = 0;
        if (!C077D.LIZ() ? productPackStruct.promotionWaist != null : !(c10380044c == null ? productPackStruct.promotionWaist == null : (productPackStruct2 = c10380044c.LJII) == null || productPackStruct2.promotionWaist == null)) {
            z3 = true;
        } else {
            z3 = false;
        }
        ProductBase productBase = productPackStruct.baseInfo;
        if (productBase == null || (str = productBase.title) == null) {
            str = "";
        }
        if (productBase != null) {
            combinedSalesVolume = productBase.combinedSalesVolume;
        } else {
            combinedSalesVolume = null;
        }
        ProductDetailReview productDetailReview = productPackStruct.review;
        PickTag pickTag = productPackStruct.activityInfo;
        if (preOrderInfo == null && productBase != null && productBase.preOrderType != null) {
            List<PromotionLogo> list = productPackStruct.promotionLogos;
            if (list != null) {
                arrayList = new ArrayList();
                for (PromotionLogo promotionLogo : list) {
                    Integer num = promotionLogo.promotionLogoType;
                    if (num == null || num.intValue() != 1) {
                        arrayList.add(promotionLogo);
                    }
                }
            }
        } else {
            arrayList = productPackStruct.promotionLogos;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        MarketingConfig marketingConfig = productPackStruct.marketingConfig;
        if ((marketingConfig == null || !Intrinsics.LJFF(marketingConfig.removePriceStr, Boolean.TRUE)) && !z3) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (C077D.LIZ() && c10380044c != null) {
            promotionLabelVO = c10380044c.LJFF;
        } else {
            promotionLabelVO = productPackStruct.promotionLabels;
        }
        return new C1008503wx(str, combinedSalesVolume, productDetailReview, pickTag, arrayList, boolValueOf, bool, z2, z4, pdpPaymentModule, sEACCIPaymentModule, promotionLabelVO);
    }
}
