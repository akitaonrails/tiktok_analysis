package X;

import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionProductPrice;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.api.BFFData;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.data.FeedProduct;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.RegularAuctionData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PriceInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import java.util.Map;

/* JADX INFO: renamed from: X.182T, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C182T {
    public final FeedProduct LIZ;
    public final Product LIZIZ;
    public final AuctionData LIZJ;
    public final BFFData LIZLLL;
    public final String LJ;

    public final AuctionData LIZ() {
        AuctionData auctionData;
        AuctionData auctionData2 = this.LIZJ;
        if (auctionData2 != null) {
            return auctionData2;
        }
        FeedProduct feedProduct = this.LIZ;
        if (feedProduct != null && (auctionData = feedProduct.auctionData) != null) {
            return auctionData;
        }
        Product product = this.LIZIZ;
        if (product != null) {
            return product.auctionData;
        }
        return null;
    }

    public final String LIZIZ() {
        PromotionInfo promotionInfo;
        PromotionProductPrice promotionProductPrice;
        SinglePriceItem singlePriceItem;
        PriceInfo priceInfo;
        String str;
        FeedProduct feedProduct = this.LIZ;
        if (feedProduct != null && (priceInfo = feedProduct.priceInfo) != null && (str = priceInfo.originPrice) != null) {
            return str;
        }
        Product product = this.LIZIZ;
        if (product == null || (promotionInfo = product.promotionInfo) == null || (promotionProductPrice = promotionInfo.productPrice) == null || (singlePriceItem = promotionProductPrice.minPrice) == null) {
            return null;
        }
        return singlePriceItem.originPriceFormat;
    }

    public final Integer LIZJ() {
        RegularAuctionData regularAuctionData;
        Integer num;
        FeedProduct feedProduct = this.LIZ;
        if (feedProduct != null && (num = feedProduct.platform) != null) {
            return num;
        }
        Product product = this.LIZIZ;
        if (product != null) {
            return Integer.valueOf(product.platform);
        }
        AuctionData auctionData = this.LIZJ;
        if (auctionData == null || (regularAuctionData = auctionData.regularAuctionData) == null) {
            return null;
        }
        return regularAuctionData.platform;
    }

    public final String LIZLLL() {
        Map<String, Object> map;
        Object obj;
        String str;
        FeedProduct feedProduct = this.LIZ;
        if (feedProduct != null && (str = feedProduct.productId) != null) {
            return str;
        }
        Product product = this.LIZIZ;
        if (product != null) {
            return product.productId;
        }
        AuctionData auctionData = this.LIZJ;
        if (auctionData == null || (map = auctionData.auctionDaInfo) == null || (obj = map.get("product_id")) == null) {
            return null;
        }
        return obj.toString();
    }

    public final String LJ() {
        PromotionInfo promotionInfo;
        PromotionProductPrice promotionProductPrice;
        SinglePriceItem singlePriceItem;
        PriceInfo priceInfo;
        String str;
        FeedProduct feedProduct = this.LIZ;
        if (feedProduct != null && (priceInfo = feedProduct.priceInfo) != null && (str = priceInfo.availablePrice) != null) {
            return str;
        }
        Product product = this.LIZIZ;
        if (product == null || (promotionInfo = product.promotionInfo) == null || (promotionProductPrice = promotionInfo.productPrice) == null || (singlePriceItem = promotionProductPrice.minPrice) == null) {
            return null;
        }
        return singlePriceItem.salePriceFormat;
    }

    public final String LJFF() {
        PriceInfo priceInfo;
        FeedProduct feedProduct = this.LIZ;
        if (feedProduct == null || (priceInfo = feedProduct.priceInfo) == null) {
            return null;
        }
        return priceInfo.afterCouponPrice;
    }

    public C182T(FeedProduct feedProduct, Product product, AuctionData auctionData, BFFData bFFData, String str) {
        this.LIZ = feedProduct;
        this.LIZIZ = product;
        this.LIZJ = auctionData;
        this.LIZLLL = bFFData;
        this.LJ = str;
    }
}
