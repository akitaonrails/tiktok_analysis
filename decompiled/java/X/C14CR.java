package X;

import android.os.Bundle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.model.ShopifySkuCheckoutProductDetailData;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.14CR, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14CR {
    public static final LinkedHashMap<String, TuxSheet> LIZ = new LinkedHashMap<>();
    public static final LinkedHashMap<String, Map<String, Object>> LIZIZ = new LinkedHashMap<>();

    public static void LIZIZ(String str) {
        LinkedHashMap<String, Map<String, Object>> linkedHashMap = LIZIZ;
        Map<String, Object> mapLJ = linkedHashMap.get(str);
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapLJ);
        linkedHashMap2.remove("into_time");
        linkedHashMap.put(str, linkedHashMap2);
    }

    public static void LIZJ(String str) {
        LinkedHashMap<String, Map<String, Object>> linkedHashMap = LIZIZ;
        Map<String, Object> mapLJ = linkedHashMap.get(str);
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapLJ);
        linkedHashMap2.put("into_time", Long.valueOf(System.currentTimeMillis()));
        linkedHashMap.put(str, linkedHashMap2);
    }

    public static void LIZ(String str, String str2) {
        TuxSheet tuxSheet = LIZ.get(str);
        if (tuxSheet != null) {
            Bundle arguments = tuxSheet.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            C786410Ut5.LJJJI("commerce_agent_checkout_url", str2, arguments);
            tuxSheet.setArguments(arguments);
        }
    }

    public static void LIZLLL(String str, String str2) {
        LinkedHashMap<String, Map<String, Object>> linkedHashMap = LIZIZ;
        Map<String, Object> mapLJ = linkedHashMap.get(str);
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapLJ);
        if (str2 == null) {
            linkedHashMap2.remove("pdpUrl");
        } else {
            linkedHashMap2.put("pdpUrl", str2);
        }
        linkedHashMap.put(str, linkedHashMap2);
    }

    public static void LJ(String str, ShopifySkuCheckoutProductDetailData shopifySkuCheckoutProductDetailData) {
        LinkedHashMap<String, Map<String, Object>> linkedHashMap = LIZIZ;
        Map<String, Object> mapLJ = linkedHashMap.get(str);
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapLJ);
        if (shopifySkuCheckoutProductDetailData == null) {
            linkedHashMap2.remove("product");
        } else {
            linkedHashMap2.put("product", shopifySkuCheckoutProductDetailData);
        }
        linkedHashMap.put(str, linkedHashMap2);
    }
}
