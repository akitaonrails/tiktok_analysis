package X;

import com.ss.android.ugc.aweme.search.ecom.data.BcmStandardTrackEvent;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS608S0100000_29;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.11yY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19676011yY {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(PhotoSearchEnterParams photoSearchEnterParams, Map map) {
        C675940QfI.LIZJ("photo_search_recom_module_click", photoSearchEnterParams, new AwS608S0100000_29(map, (Map<String, String>) 514));
    }

    public static void LIZIZ(PhotoSearchEnterParams photoSearchEnterParams, Map map, BcmStandardTrackEvent bcmStandardTrackEvent) {
        String str;
        String str2;
        Map<String, String> map2;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams2;
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        Object obj = ((LinkedHashMap) map).get("page_name");
        if (obj == null) {
            obj = "";
        }
        jSONObject.put("page_name", obj);
        if (photoSearchEnterParams == null || (photoSearchBusinessEnterParams2 = photoSearchEnterParams.businessParams) == null || (str = photoSearchBusinessEnterParams2.photoSearchPreviousPage) == null) {
            str = "";
        }
        jSONObject.put("previous_page", str);
        if (photoSearchEnterParams != null && (photoSearchBusinessEnterParams = photoSearchEnterParams.businessParams) != null) {
            str2 = photoSearchBusinessEnterParams.enterFrom;
        } else {
            str2 = null;
        }
        jSONObject.put("enter_from", str2);
        jSONObject.put("card_name", "click_recom_search_card");
        Object obj2 = ((LinkedHashMap) map).get("source_page_type");
        if (obj2 == null) {
            obj2 = "";
        }
        jSONObject.put("source_page_type", obj2);
        Object obj3 = ((LinkedHashMap) map).get("source_module");
        if (obj3 == null) {
            obj3 = "";
        }
        jSONObject.put("source_module", obj3);
        Object obj4 = ((LinkedHashMap) map).get("item_order");
        if (obj4 == null) {
            obj4 = "";
        }
        jSONObject.put("item_order", obj4);
        Object obj5 = ((LinkedHashMap) map).get("product_id");
        if (obj5 == null) {
            obj5 = "";
        }
        jSONObject.put("product_id", obj5);
        Object obj6 = ((LinkedHashMap) map).get("track_id");
        if (obj6 == null) {
            obj6 = "";
        }
        jSONObject.put("track_id", obj6);
        Object obj7 = ((LinkedHashMap) map).get("rec_params");
        if (obj7 == null) {
            obj7 = "";
        }
        jSONObject.put("rec_params", obj7);
        Object obj8 = ((LinkedHashMap) map).get("request_id");
        if (obj8 == null) {
            obj8 = "";
        }
        jSONObject.put("request_id", obj8);
        jSONObject.put("click_area", "click_recom_search");
        jSONObject.put("volume", "");
        jSONObject.put("rate", "");
        jSONObject.put("author_id", "");
        jSONObject.put("original_price", "");
        jSONObject.put("sales_price", "");
        jSONObject.put("coupon_id", "");
        jSONObject.put("coupon_type_id", "");
        jSONObject.put("coupon_name", "");
        jSONObject.put("campaign_id", "");
        jSONObject.put("campaign_type", "");
        jSONObject.put("campaign_user_tag", "");
        jSONObject.put("campaign_channel", "");
        if (bcmStandardTrackEvent != null && (map2 = bcmStandardTrackEvent.trackParamMap) != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL("tiktokec_card_click", jSONObject);
    }

    public static void LIZJ(PhotoSearchEnterParams photoSearchEnterParams, Map map, BcmStandardTrackEvent bcmStandardTrackEvent) {
        String str;
        String str2;
        Map<String, String> map2;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams2;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams3;
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        Object obj = ((LinkedHashMap) map).get("page_name");
        if (obj == null) {
            obj = "";
        }
        jSONObject.put("page_name", obj);
        if (photoSearchEnterParams == null || (photoSearchBusinessEnterParams3 = photoSearchEnterParams.businessParams) == null || (str = photoSearchBusinessEnterParams3.photoSearchPreviousPage) == null) {
            str = "";
        }
        jSONObject.put("previous_page", str);
        if (photoSearchEnterParams != null && (photoSearchBusinessEnterParams2 = photoSearchEnterParams.businessParams) != null) {
            str2 = photoSearchBusinessEnterParams2.enterFrom;
        } else {
            str2 = null;
        }
        jSONObject.put("enter_from", str2);
        jSONObject.put("card_name", "click_recom_search_card");
        Object obj2 = ((LinkedHashMap) map).get("source_page_type");
        if (obj2 == null) {
            obj2 = "";
        }
        jSONObject.put("source_page_type", obj2);
        Object obj3 = ((LinkedHashMap) map).get("source_module");
        if (obj3 == null) {
            obj3 = "";
        }
        jSONObject.put("source_module", obj3);
        Object obj4 = ((LinkedHashMap) map).get("item_order");
        if (obj4 == null) {
            obj4 = "";
        }
        jSONObject.put("item_order", obj4);
        Object obj5 = ((LinkedHashMap) map).get("product_id");
        if (obj5 == null) {
            obj5 = "";
        }
        jSONObject.put("product_id", obj5);
        Object obj6 = ((LinkedHashMap) map).get("track_id");
        if (obj6 == null) {
            obj6 = "";
        }
        jSONObject.put("track_id", obj6);
        Object obj7 = ((LinkedHashMap) map).get("rec_params");
        if (obj7 == null) {
            obj7 = "";
        }
        jSONObject.put("rec_params", obj7);
        Object obj8 = ((LinkedHashMap) map).get("request_id");
        if (obj8 == null) {
            obj8 = "";
        }
        jSONObject.put("request_id", obj8);
        jSONObject.put("volume", "");
        jSONObject.put("rate", "");
        jSONObject.put("author_id", "");
        jSONObject.put("original_price", "");
        jSONObject.put("sales_price", "");
        jSONObject.put("coupon_id", "");
        jSONObject.put("coupon_type_id", "");
        jSONObject.put("coupon_name", "");
        jSONObject.put("campaign_id", "");
        jSONObject.put("campaign_type", "");
        jSONObject.put("campaign_user_tag", "");
        jSONObject.put("campaign_channel", "");
        if (photoSearchEnterParams != null && (photoSearchBusinessEnterParams = photoSearchEnterParams.businessParams) != null) {
            jSONObject.put("root_enter_from_type", photoSearchBusinessEnterParams.rootEnterFromType);
        }
        if (bcmStandardTrackEvent != null && (map2 = bcmStandardTrackEvent.trackParamMap) != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL("tiktokec_card_show", jSONObject);
    }
}
