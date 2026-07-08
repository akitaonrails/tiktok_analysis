package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressPromotionSku;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopDigest;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.03Qe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C840603Qe {
    public static final List<AddressPromotionSku> LIZ(List<OrderShopDigest> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (OrderShopDigest orderShopDigest : list) {
                List<OrderSKUDTO> list2 = orderShopDigest.orderSKUs;
                if (list2 != null) {
                    for (OrderSKUDTO orderSKUDTO : list2) {
                        arrayList.add(new AddressPromotionSku(orderSKUDTO.productId, orderSKUDTO.skuId, orderShopDigest.sellerId, orderSKUDTO.sourceInfo));
                    }
                }
            }
        }
        return arrayList;
    }
}
