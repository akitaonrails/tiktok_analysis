package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Announcement;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomActionConfig;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomArea;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductUnavailableInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.047j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10465047j {
    public static final C1063304Dv LIZ(ProductPackStruct productPackStruct, Integer num, ProductUnavailableInfo productUnavailableInfo, String str, BuyButton buyButton, String str2, Map<String, String> map, boolean z) {
        int iIntValue;
        int iLIZ;
        Boolean bool;
        BuyButton buyButton2;
        Announcement announcement;
        List<Announcement> list;
        Map<String, PdpBottomActionConfig> map2;
        String str3;
        Integer num2;
        ProductPrice productPrice;
        ProductUnavailableInfo productUnavailableInfo2 = productUnavailableInfo;
        BuyButton buyButton3 = buyButton;
        Integer num3 = productPackStruct.status;
        if (num3 != null) {
            iIntValue = num3.intValue();
        } else {
            iIntValue = 1;
        }
        Integer num4 = productPackStruct.bottomNavBarStyle;
        if (num4 != null) {
            iLIZ = num4.intValue();
        } else {
            iLIZ = C04CU.LIZ();
        }
        SellerInfo sellerInfo = productPackStruct.sellerInfo;
        ProductBase productBase = productPackStruct.baseInfo;
        Integer num5 = null;
        if (productBase != null && (productPrice = productBase.priceInfo) != null) {
            bool = productPrice.needIcon;
        } else {
            bool = null;
        }
        if (buyButton3 == null) {
            buyButton2 = productPackStruct.buyButton;
        } else {
            buyButton2 = buyButton3;
        }
        PdpBottomArea pdpBottomArea = productPackStruct.bottomArea;
        boolean z2 = false;
        if (pdpBottomArea != null && (map2 = pdpBottomArea.actionMap) != null) {
            if (buyButton3 == null && (buyButton3 = productPackStruct.buyButton) == null) {
                str3 = null;
            } else {
                str3 = buyButton3.actionId;
            }
            PdpBottomActionConfig pdpBottomActionConfig = map2.get(str3);
            if (pdpBottomActionConfig != null && (num2 = pdpBottomActionConfig.type) != null && num2.intValue() > 0) {
                z2 = true;
            }
        }
        BuyButton buyButton4 = productPackStruct.buyButton;
        AddToCartButton addToCartButton = productPackStruct.addToCartButton;
        if (productUnavailableInfo2 == null) {
            productUnavailableInfo2 = productPackStruct.unavailableInfo;
        }
        if (z && (list = productPackStruct.announcements) != null) {
            announcement = (Announcement) C13LP.LJJJLL(list);
        } else {
            announcement = null;
        }
        SellerInfo sellerInfo2 = productPackStruct.sellerInfo;
        if (sellerInfo2 != null) {
            num5 = sellerInfo2.unreadMsgCount;
        }
        return new C1063304Dv(iIntValue, iLIZ, sellerInfo, bool, buyButton2, z2, str2, map, buyButton4, addToCartButton, productUnavailableInfo2, announcement, num, str, num5);
    }
}
