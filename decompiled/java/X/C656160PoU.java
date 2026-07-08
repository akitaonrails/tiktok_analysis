package X;

import com.ss.android.ugc.aweme.search.ecom.data.Product;

/* JADX INFO: renamed from: X.0PoU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C656160PoU {
    public static final String LIZ(Product product) {
        Product.PromotionLabel promotionLabel;
        Integer num;
        if (product != null && (promotionLabel = (Product.PromotionLabel) C13LP.LJJJLL(product.promotionLabels)) != null && (num = promotionLabel.type) != null) {
            int iIntValue = num.intValue();
            if (iIntValue != 6) {
                if (iIntValue == 8) {
                    return "shipping";
                }
            } else {
                return "discount";
            }
        }
        return null;
    }
}
