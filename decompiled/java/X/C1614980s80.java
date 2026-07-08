package X;

import com.ss.android.ugc.aweme.iap.component.api.Discount;
import com.ss.android.ugc.aweme.iap.component.api.UnifiedPricePacket;
import com.ss.android.ugc.aweme.iap.component.api.UnifiedPurchaseOption;
import com.ss.android.ugc.aweme.model.PriceInfo;
import com.ss.android.ugc.aweme.model.PurchaseCategory;
import com.ss.android.ugc.aweme.model.PurchaseOption;

/* JADX INFO: renamed from: X.0s80, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1614980s80 {
    public static final PurchaseOption LIZ(UnifiedPurchaseOption unifiedPurchaseOption) {
        Discount discount;
        int iIntValue;
        PriceInfo priceInfo;
        int iIntValue2;
        PriceInfo priceInfo2;
        Float f;
        UnifiedPricePacket unifiedPricePacket = unifiedPurchaseOption.price;
        Long l = null;
        if (unifiedPricePacket != null) {
            discount = unifiedPricePacket.discount;
        } else {
            discount = null;
        }
        Integer num = unifiedPurchaseOption.itemCount;
        int iFloatValue = 0;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        UnifiedPricePacket unifiedPricePacket2 = unifiedPurchaseOption.price;
        String str = "";
        if (unifiedPricePacket2 != null) {
            String str2 = unifiedPricePacket2.iapId;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = unifiedPricePacket2.priceInUsd;
            if (str3 == null) {
                str3 = "";
            }
            priceInfo = new PriceInfo(0L, str2, str3, "", "");
        } else {
            priceInfo = null;
        }
        String str4 = unifiedPurchaseOption.title;
        if (str4 == null) {
            str4 = "";
        }
        C1614370s71 c1614370s71 = PurchaseCategory.Companion;
        Integer num2 = unifiedPurchaseOption.purchaseCategory;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = 0;
        }
        c1614370s71.getClass();
        PurchaseCategory purchaseCategory = PurchaseCategory.map.get(Integer.valueOf(iIntValue2));
        if (purchaseCategory == null) {
            purchaseCategory = PurchaseCategory.UNKNOWN;
        }
        if (discount != null) {
            String str5 = discount.discountIapId;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = discount.priceInUsd;
            if (str6 != null) {
                str = str6;
            }
            priceInfo2 = new PriceInfo(0L, str5, str, "", "");
        } else {
            priceInfo2 = null;
        }
        if (discount != null) {
            l = discount.promotionId;
        }
        if (discount != null && (f = discount.value) != null) {
            iFloatValue = (int) f.floatValue();
        }
        return new PurchaseOption(iIntValue, priceInfo, str4, purchaseCategory, priceInfo2, null, l, null, iFloatValue, null);
    }
}
