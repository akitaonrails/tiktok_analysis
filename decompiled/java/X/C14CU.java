package X;

import com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.model.ShopifySkuCheckoutProductDetailData;
import com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.model.ShopifySkuCheckoutProductOption;
import com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.model.ShopifySkuCheckoutProductVariant;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14CU, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14CU {
    public static void LIZIZ(ShopifySkuCheckoutProductDetailData shopifySkuCheckoutProductDetailData, AwemeRawAd awemeRawAd, Long l, String str, String str2, String str3) {
        boolean z;
        String str4;
        Long l2;
        String variantId;
        String str5;
        String price;
        String currency;
        Boolean available;
        String imageUrl;
        List<ShopifySkuCheckoutProductOption> list;
        List<ShopifySkuCheckoutProductOption> list2;
        ShopifySkuCheckoutProductVariant shopifySkuCheckoutProductVariant;
        ShopifySkuCheckoutProductVariant shopifySkuCheckoutProductVariant2;
        ShopifySkuCheckoutProductVariant shopifySkuCheckoutProductVariant3;
        ShopifySkuCheckoutProductVariant shopifySkuCheckoutProductVariant4;
        ShopifySkuCheckoutProductVariant shopifySkuCheckoutProductVariant5;
        String str6;
        int i = 1;
        if (shopifySkuCheckoutProductDetailData != null && (str6 = shopifySkuCheckoutProductDetailData.errorMessage) != null && C123100dR.LIZ(str6)) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !z;
        if (shopifySkuCheckoutProductDetailData == null || !C14CS.LIZ.LIZ(shopifySkuCheckoutProductDetailData)) {
            i = 2;
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "sku_checkout_sku_detail_data", awemeRawAd);
        c1022820ciuLIZLLL.LIZIZ(str, "sku_enter_from");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i), "skuType");
        c1022820ciuLIZLLL.LIZIZ(Boolean.valueOf(z2), "success");
        Integer numValueOf = null;
        if (shopifySkuCheckoutProductDetailData != null) {
            str4 = shopifySkuCheckoutProductDetailData.errorMessage;
        } else {
            str4 = null;
        }
        c1022820ciuLIZLLL.LIZIZ(str4, "error_reason");
        if (shopifySkuCheckoutProductDetailData != null) {
            l2 = shopifySkuCheckoutProductDetailData.errorCode;
        } else {
            l2 = null;
        }
        c1022820ciuLIZLLL.LIZIZ(l2, "error_code");
        c1022820ciuLIZLLL.LIZIZ(str2, "product_id");
        c1022820ciuLIZLLL.LIZIZ(str3, "pdp_url");
        if (shopifySkuCheckoutProductDetailData != null && (shopifySkuCheckoutProductVariant5 = shopifySkuCheckoutProductDetailData.selectedOrFirstAvailableVariant) != null) {
            variantId = shopifySkuCheckoutProductVariant5.getVariantId();
        } else {
            variantId = null;
        }
        c1022820ciuLIZLLL.LIZIZ(variantId, "variant_id");
        if (shopifySkuCheckoutProductDetailData != null) {
            str5 = shopifySkuCheckoutProductDetailData.title;
        } else {
            str5 = null;
        }
        c1022820ciuLIZLLL.LIZIZ(str5, "product_name");
        if (shopifySkuCheckoutProductDetailData != null && (shopifySkuCheckoutProductVariant4 = shopifySkuCheckoutProductDetailData.selectedOrFirstAvailableVariant) != null) {
            price = shopifySkuCheckoutProductVariant4.getPrice();
        } else {
            price = null;
        }
        c1022820ciuLIZLLL.LIZIZ(price, "price");
        if (shopifySkuCheckoutProductDetailData != null && (shopifySkuCheckoutProductVariant3 = shopifySkuCheckoutProductDetailData.selectedOrFirstAvailableVariant) != null) {
            currency = shopifySkuCheckoutProductVariant3.getCurrency();
        } else {
            currency = null;
        }
        c1022820ciuLIZLLL.LIZIZ(currency, "currency");
        if (shopifySkuCheckoutProductDetailData != null && (shopifySkuCheckoutProductVariant2 = shopifySkuCheckoutProductDetailData.selectedOrFirstAvailableVariant) != null) {
            available = shopifySkuCheckoutProductVariant2.getAvailable();
        } else {
            available = null;
        }
        c1022820ciuLIZLLL.LIZIZ(available, "available");
        if (shopifySkuCheckoutProductDetailData != null && (shopifySkuCheckoutProductVariant = shopifySkuCheckoutProductDetailData.selectedOrFirstAvailableVariant) != null) {
            imageUrl = shopifySkuCheckoutProductVariant.getImageUrl();
        } else {
            imageUrl = null;
        }
        c1022820ciuLIZLLL.LIZIZ(imageUrl, "icon_url");
        C1227904rF c1227904rF = C1227904rF.LIZ;
        if (shopifySkuCheckoutProductDetailData != null) {
            list = shopifySkuCheckoutProductDetailData.options;
        } else {
            list = null;
        }
        c1227904rF.getClass();
        c1022820ciuLIZLLL.LIZIZ(C1227904rF.LJI(list), "options");
        if (shopifySkuCheckoutProductDetailData != null && (list2 = shopifySkuCheckoutProductDetailData.options) != null) {
            numValueOf = Integer.valueOf(list2.size());
        }
        c1022820ciuLIZLLL.LIZIZ(numValueOf, "options_size");
        c1022820ciuLIZLLL.LIZIZ(l, "duration");
        c1022820ciuLIZLLL.LJII();
    }

    public static void LIZ(AwemeRawAd awemeRawAd, String str, String str2, String str3, String str4, Map map, Function1 function1) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1316505Df(awemeRawAd, str, str2, str3, str4, map, function1, null), 3);
    }
}
