package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03Vz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C855703Vz {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(C737802uO c737802uO, Map map) {
        String str = c737802uO.LIZJ;
        if (str != null) {
            map.put("currency", str);
        }
        Float f = c737802uO.LIZ;
        if (f != null) {
            map.put("sale_price_value", Float.valueOf(f.floatValue()));
        }
        Float f2 = c737802uO.LIZIZ;
        if (f2 != null) {
            map.put("original_price_value", Float.valueOf(f2.floatValue()));
        }
    }

    public static void LIZJ(C03P2 c03p2, Map map) {
        Float f = c03p2.LIZ;
        if (f != null) {
            map.put("total_payment", Float.valueOf(f.floatValue()));
        }
        Float f2 = c03p2.LIZIZ;
        if (f2 != null) {
            map.put("discounted_amount", Float.valueOf(f2.floatValue()));
        }
        Float f3 = c03p2.LIZJ;
        if (f3 != null) {
            map.put("total_tax", Float.valueOf(f3.floatValue()));
        }
        String str = c03p2.LIZLLL;
        if (str != null) {
            map.put("summary_info", str);
            map.put("order_summary_info", str);
        }
        Float f4 = c03p2.LJ;
        if (f4 != null) {
            map.put("shipping_price", Float.valueOf(f4.floatValue()));
        }
        Float f5 = c03p2.LJFF;
        if (f5 != null) {
            map.put("shipping_price_after_coupon", Float.valueOf(f5.floatValue()));
        }
        Float f6 = c03p2.LJI;
        if (f6 != null) {
            map.put("discounted_shipping_price", Float.valueOf(f6.floatValue()));
        }
    }

    public static void LIZLLL(C03W1 c03w1, C957403oi c957403oi) {
        Float f = c03w1.LIZIZ;
        if (f != null) {
            c957403oi.LIZLLL("shipping_price", Float.valueOf(f.floatValue()));
        }
        Float f2 = c03w1.LIZJ;
        if (f2 != null) {
            c957403oi.LIZLLL("shipping_price_after_coupon", Float.valueOf(f2.floatValue()));
        }
        String str = c03w1.LIZ;
        if (str != null) {
            c957403oi.LIZLLL("delivery_info", str);
        }
    }

    public static void LJ(C03W0 c03w0, C957403oi c957403oi) {
        String str = c03w0.LIZIZ;
        if (str != null) {
            c957403oi.LIZLLL("original_price", str);
        }
        Float f = c03w0.LIZ;
        if (f != null) {
            c957403oi.LIZLLL("original_price_value", Float.valueOf(f.floatValue()));
        }
        String str2 = c03w0.LIZLLL;
        if (str2 != null) {
            c957403oi.LIZLLL("sale_price", str2);
        }
        Float f2 = c03w0.LIZJ;
        if (f2 != null) {
            c957403oi.LIZLLL("sale_price_value", Float.valueOf(f2.floatValue()));
        }
        String str3 = c03w0.LJ;
        if (str3 != null) {
            c957403oi.LIZLLL("currency", str3);
        }
    }

    public static void LIZ(C957403oi c957403oi, Map map, ProductPackStruct productPackStruct, SkuPrice skuPrice, int i, String str) {
        String str2;
        String str3;
        String str4;
        float fFloatValue;
        Object currency;
        SellerInfo sellerInfo;
        Object obj;
        Price price;
        Price price2;
        String priceVal;
        Float fLJIIIIZZ;
        Price price3;
        String priceVal2;
        Float fLJIIIIZZ2;
        ProductBase productBase;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("author_id", map.get("author_id"));
        Object obj2 = map.get("source_page_type");
        if (Intrinsics.LJFF(obj2, "video")) {
            str2 = "ShortVideo";
        } else if (Intrinsics.LJFF(obj2, "live")) {
            str2 = "Live";
        } else if (Intrinsics.LJFF(obj2, "show_window")) {
            str2 = "ShowCase";
        } else {
            str2 = "Else";
        }
        jSONObject.put("screen_refer", str2);
        Object obj3 = map.get("source_page_type");
        if (Intrinsics.LJFF(obj3, "video")) {
            jSONObject.put("feed_id", map.get("source_content_id"));
        } else if (Intrinsics.LJFF(obj3, "live")) {
            if (map.get("room_id") != null) {
                jSONObject.put("room_id", map.get("room_id"));
            } else {
                jSONObject.put("room_id", map.get("source_content_id"));
            }
        } else {
            jSONObject.put("source_page_type", map.get("source_content_id"));
        }
        Object obj4 = "";
        if (productPackStruct == null || (str3 = productPackStruct.productId) == null) {
            str3 = "";
        }
        jSONObject.put("content_id", str3);
        if (productPackStruct == null || (productBase = productPackStruct.baseInfo) == null || (str4 = productBase.title) == null) {
            str4 = "";
        }
        jSONObject.put("content_name", str4);
        jSONObject.put("quantity", i);
        float fFloatValue2 = 0.0f;
        if (skuPrice != null && (price3 = skuPrice.realPrice) != null && (priceVal2 = price3.getPriceVal()) != null && (fLJIIIIZZ2 = C2327809Ae.LJIIIIZZ(priceVal2)) != null) {
            fFloatValue = fLJIIIIZZ2.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        jSONObject.put("discount_price", Float.valueOf(fFloatValue));
        jSONObject.put("content_type", "product");
        jSONObject.put("page_type", str);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject);
        c957403oi.LIZJ("contents", jSONArray);
        if (skuPrice != null && (price2 = skuPrice.realPrice) != null && (priceVal = price2.getPriceVal()) != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(priceVal)) != null) {
            fFloatValue2 = fLJIIIIZZ.floatValue();
        }
        c957403oi.LIZJ("value", Float.valueOf(fFloatValue2 * i));
        c957403oi.LIZJ("quantity", Integer.valueOf(i));
        if (skuPrice == null || (price = skuPrice.realPrice) == null || (currency = price.getCurrency()) == null) {
            currency = "";
        }
        c957403oi.LIZJ("currency", currency);
        c957403oi.LIZJ("is_ad_signal", 1);
        if (productPackStruct != null && (sellerInfo = productPackStruct.sellerInfo) != null && (obj = sellerInfo.sellerId) != null) {
            obj4 = obj;
        }
        c957403oi.LIZJ("shop_id", obj4);
    }
}
