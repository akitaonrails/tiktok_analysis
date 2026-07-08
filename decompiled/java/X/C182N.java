package X;

import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionProductPrice;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommercelive.audience.sea.feed.popcard.data.SeaFeedProduct;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveVoucher;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LynxCardInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopupCardBffData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PriceInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.VoucherTask;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.182N, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C182N {
    public final SeaFeedProduct LIZ;
    public final Product LIZIZ;
    public final LiveVoucher LIZJ;
    public final FlashSaleAtmosphereInfo LIZLLL;
    public final Integer LJ;
    public final PopupCardBffData LJFF;
    public final LynxCardInfo LJI;
    public final String LJII;

    public final String LIZIZ() {
        PromotionInfo promotionInfo;
        PromotionProductPrice promotionProductPrice;
        SinglePriceItem singlePriceItem;
        PriceInfo priceInfo;
        String str;
        SeaFeedProduct seaFeedProduct = this.LIZ;
        if (seaFeedProduct != null && (priceInfo = seaFeedProduct.priceInfo) != null && (str = priceInfo.originPrice) != null) {
            return str;
        }
        Product product = this.LIZIZ;
        if (product == null || (promotionInfo = product.promotionInfo) == null || (promotionProductPrice = promotionInfo.productPrice) == null || (singlePriceItem = promotionProductPrice.minPrice) == null) {
            return null;
        }
        return singlePriceItem.originPriceFormat;
    }

    public final String LIZJ() {
        String str;
        SeaFeedProduct seaFeedProduct = this.LIZ;
        if (seaFeedProduct != null && (str = seaFeedProduct.productId) != null) {
            return str;
        }
        Product product = this.LIZIZ;
        if (product != null) {
            return product.productId;
        }
        return null;
    }

    public final String LIZLLL() {
        PromotionInfo promotionInfo;
        PromotionProductPrice promotionProductPrice;
        SinglePriceItem singlePriceItem;
        PriceInfo priceInfo;
        String str;
        SeaFeedProduct seaFeedProduct = this.LIZ;
        if (seaFeedProduct != null && (priceInfo = seaFeedProduct.priceInfo) != null && (str = priceInfo.availablePrice) != null) {
            return str;
        }
        Product product = this.LIZIZ;
        if (product == null || (promotionInfo = product.promotionInfo) == null || (promotionProductPrice = promotionInfo.productPrice) == null || (singlePriceItem = promotionProductPrice.minPrice) == null) {
            return null;
        }
        return singlePriceItem.salePriceFormat;
    }

    public static JSONObject LJ(LiveVoucher liveVoucher) throws JSONException {
        String str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("render_type", 1);
        jSONObject.put("is_filter", true);
        jSONObject.put("disable_top_render", false);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("voucher_type_id", liveVoucher.voucherTypeId);
        VoucherTask voucherTask = liveVoucher.task;
        if (voucherTask != null) {
            str = voucherTask.id;
        } else {
            str = null;
        }
        jSONObject2.put("voucher_id", str);
        jSONObject2.put("da_info", liveVoucher.daInfo);
        jSONObject.put("render_params", jSONObject2);
        jSONObject.put("hide_navbar_back", 1);
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bb, code lost:
    
        if (r5 != null) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack LIZ(java.lang.Integer r9) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C182N.LIZ(java.lang.Integer):com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack");
    }

    public C182N(SeaFeedProduct seaFeedProduct, Product product, LiveVoucher liveVoucher, FlashSaleAtmosphereInfo flashSaleAtmosphereInfo, Integer num, PopupCardBffData popupCardBffData, LynxCardInfo lynxCardInfo, String str, int i) {
        seaFeedProduct = (i & 1) != 0 ? null : seaFeedProduct;
        product = (i & 2) != 0 ? null : product;
        liveVoucher = (i & 4) != 0 ? null : liveVoucher;
        flashSaleAtmosphereInfo = (i & 8) != 0 ? null : flashSaleAtmosphereInfo;
        num = (i & 16) != 0 ? null : num;
        popupCardBffData = (i & 32) != 0 ? null : popupCardBffData;
        lynxCardInfo = (i & 64) != 0 ? null : lynxCardInfo;
        str = (i & 128) != 0 ? null : str;
        this.LIZ = seaFeedProduct;
        this.LIZIZ = product;
        this.LIZJ = liveVoucher;
        this.LIZLLL = flashSaleAtmosphereInfo;
        this.LJ = num;
        this.LJFF = popupCardBffData;
        this.LJI = lynxCardInfo;
        this.LJII = str;
    }
}
