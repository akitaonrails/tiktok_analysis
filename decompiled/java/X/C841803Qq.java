package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSale;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.GlobalWaistBanner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaist;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;

/* JADX INFO: renamed from: X.03Qq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C841803Qq extends C1002203vw<PdpViewModel> implements C03M7 {
    @Override // X.C03M7
    public final void Da1(ProductPackStruct productPackStruct) {
        Long l;
        Integer num;
        PdpViewModel pdpViewModelLIZ = LIZ();
        PromotionWaist promotionWaist = productPackStruct.promotionWaist;
        if (promotionWaist != null && productPackStruct.productId != null) {
            FlashSale flashSaleLIZJ = C1025103zd.LIZJ(promotionWaist);
            if (flashSaleLIZJ != null) {
                pdpViewModelLIZ.tS2(productPackStruct.productId, flashSaleLIZJ);
                return;
            }
            return;
        }
        GlobalWaistBanner globalWaistBanner = productPackStruct.globalWaistBanner;
        if (globalWaistBanner == null || productPackStruct.productId == null || (l = globalWaistBanner.countDown) == null || l.longValue() <= 0 || (num = productPackStruct.globalWaistBanner.tailComponentType) == null || num.intValue() != 1) {
            return;
        }
        pdpViewModelLIZ.tS2(productPackStruct.productId, C1025103zd.LIZ(productPackStruct.globalWaistBanner));
    }
}
