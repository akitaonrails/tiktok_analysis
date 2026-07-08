package X;

import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.model.ShopifySkuCheckoutProductDetailData;
import com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.model.ShopifySkuCheckoutProductOption;
import com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.model.ShopifySkuCheckoutProductVariant;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.14CV, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14CV {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(int i, String str) {
        Object obj;
        Long lValueOf;
        Object obj2;
        ShopifySkuCheckoutProductDetailData shopifySkuCheckoutProductDetailData;
        Object obj3;
        CommonAdData commonAdData;
        Object obj4;
        String str2;
        String variantId;
        String str3;
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
        Long l;
        Map<String, Object> map = C14CR.LIZIZ.get(str);
        Integer numValueOf = null;
        if (map != null) {
            obj = map.get("into_time");
        } else {
            obj = null;
        }
        if ((obj instanceof Long) && (l = (Long) obj) != null) {
            lValueOf = Long.valueOf(System.currentTimeMillis() - l.longValue());
        } else {
            lValueOf = null;
        }
        if (map != null) {
            obj2 = map.get("product");
        } else {
            obj2 = null;
        }
        if (obj2 instanceof ShopifySkuCheckoutProductDetailData) {
            shopifySkuCheckoutProductDetailData = (ShopifySkuCheckoutProductDetailData) obj2;
        } else {
            shopifySkuCheckoutProductDetailData = null;
        }
        if (map != null) {
            obj3 = map.get("awemeRawAd");
        } else {
            obj3 = null;
        }
        if (obj3 instanceof AwemeRawAd) {
            commonAdData = (CommonAdData) obj3;
        } else {
            commonAdData = null;
        }
        if (map != null) {
            obj4 = map.get("pdpUrl");
        } else {
            obj4 = null;
        }
        if (!(obj4 instanceof String)) {
            obj4 = null;
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "sku_page_close", commonAdData);
        c1022820ciuLIZLLL.LIZIZ(lValueOf, "duration");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i), "closeType");
        if (shopifySkuCheckoutProductDetailData != null) {
            str2 = shopifySkuCheckoutProductDetailData.productId;
        } else {
            str2 = null;
        }
        c1022820ciuLIZLLL.LIZIZ(str2, "product_id");
        c1022820ciuLIZLLL.LIZIZ(obj4, "pdp_url");
        if (shopifySkuCheckoutProductDetailData != null && (shopifySkuCheckoutProductVariant5 = shopifySkuCheckoutProductDetailData.selectedOrFirstAvailableVariant) != null) {
            variantId = shopifySkuCheckoutProductVariant5.getVariantId();
        } else {
            variantId = null;
        }
        c1022820ciuLIZLLL.LIZIZ(variantId, "variant_id");
        if (shopifySkuCheckoutProductDetailData != null) {
            str3 = shopifySkuCheckoutProductDetailData.title;
        } else {
            str3 = null;
        }
        c1022820ciuLIZLLL.LIZIZ(str3, "product_name");
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
        c1022820ciuLIZLLL.LJII();
    }

    public static void LIZIZ(int i, Aweme aweme, String str, String str2, String str3) {
        AwemeRawAd awemeRawAd;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "sku_checkout_flow_sku_info", awemeRawAd);
        c1022820ciuLIZLLL.LIZIZ(str, "sku_enter_from");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i), "skuType");
        c1022820ciuLIZLLL.LIZIZ(str2, "pdp_url");
        c1022820ciuLIZLLL.LIZIZ(str3, "checkout_url");
        c1022820ciuLIZLLL.LJII();
    }

    public static void LIZ(String str, AwemeRawAd awemeRawAd, boolean z, String str2, String str3, Long l, String str4, String str5, String str6, Long l2) {
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "commerce_quick_action_shopify_request", awemeRawAd);
        c1022820ciuLIZLLL.LIZIZ(str, "sku_enter_from");
        c1022820ciuLIZLLL.LIZIZ(Boolean.valueOf(z), "success");
        c1022820ciuLIZLLL.LIZIZ(str2, "request_url");
        c1022820ciuLIZLLL.LIZIZ(str3, "request_body");
        c1022820ciuLIZLLL.LIZIZ(l, "error_code");
        c1022820ciuLIZLLL.LIZIZ(str4, "error_reason");
        c1022820ciuLIZLLL.LIZIZ(str5, "error_response");
        c1022820ciuLIZLLL.LIZIZ(str6, "type");
        c1022820ciuLIZLLL.LIZIZ(l2, "duration");
        c1022820ciuLIZLLL.LJII();
    }
}
