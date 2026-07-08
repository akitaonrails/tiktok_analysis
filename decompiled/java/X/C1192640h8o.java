package X;

import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.osp.repo.model.PriceItem;
import com.ss.android.ugc.aweme.poi.osp.repo.model.SkuPrice;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0h8o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1192640h8o {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(PageFinder pageFinder, String str, JSONObject jSONObject) throws JSONException {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        jSONObject.put("click_position", str);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZJ("reconfirm_popup_click", jSONObject, c1185050gwZ);
    }

    public static void LIZJ(PageFinder pageFinder, String str, String str2, String str3, String str4, String str5, String str6, Map map, Map map2) {
        Map mapLIZ = C308370C6x.LIZ(3);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((LinkedHashMap) mapLIZ).entrySet()) {
            C1189060h32.LJJI((String) entry.getKey(), (String) entry.getValue(), jSONObject);
        }
        for (Map.Entry entry2 : map.entrySet()) {
            C1189060h32.LJJI((String) entry2.getKey(), String.valueOf(entry2.getValue()), jSONObject);
        }
        jSONObject.put("poi_id", str);
        jSONObject.put("enter_from", "order_submit_page");
        jSONObject.put("poi_detail_enter_from", str2);
        jSONObject.put("poi_detail_enter_method", str3);
        jSONObject.put("order_submit_enter_from", str4);
        jSONObject.put("order_submit_enter_method", str5);
        C1189060h32.LIZIZ(str6, jSONObject);
        jSONObject.put("prompt_content", "limit_purchase");
        for (Map.Entry entry3 : map2.entrySet()) {
            C1189060h32.LJJI((String) entry3.getKey(), String.valueOf(entry3.getValue()), jSONObject);
        }
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZJ("show_remind_prompt", jSONObject, c1185050gwZ);
    }

    public static void LIZ(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, Map map, Map map2, String str9, PageFinder pageFinder) throws JSONException {
        String string;
        Map mapLIZ = C308370C6x.LIZ(3);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((LinkedHashMap) mapLIZ).entrySet()) {
            C1189060h32.LJJI((String) entry.getKey(), (String) entry.getValue(), jSONObject);
        }
        for (Map.Entry entry2 : map.entrySet()) {
            String str10 = (String) entry2.getKey();
            Object value = entry2.getValue();
            if (value != null) {
                string = value.toString();
            } else {
                string = null;
            }
            C1189060h32.LJJI(str10, string, jSONObject);
        }
        jSONObject.put("poi_id", str);
        jSONObject.put("enter_from", "order_submit_page");
        jSONObject.put("poi_detail_enter_from", str2);
        jSONObject.put("poi_detail_enter_method", str3);
        jSONObject.put("pdp_enter_from", str4);
        jSONObject.put("pdp_enter_method", str5);
        jSONObject.put("order_submit_enter_from", str6);
        jSONObject.put("order_submit_enter_method", str7);
        C1189060h32.LIZIZ(str8, jSONObject);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                PriceItem priceItem = (PriceItem) it2.next();
                C1189060h32.LJJI(priceItem.key, priceItem.priceAmount, jSONObject);
            }
        }
        for (Map.Entry entry3 : map2.entrySet()) {
            C1189060h32.LJJI((String) entry3.getKey(), String.valueOf(entry3.getValue()), jSONObject);
        }
        C1189060h32.LJJI("coupon_info", str9, jSONObject);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZJ("coupon_entry_click", jSONObject, c1185050gwZ);
    }

    public static void LIZLLL(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, PriceItem priceItem, JSONObject jSONObject, String str9, String str10, String str11, boolean z, boolean z2, String str12, Map map, Map map2, String str13, String str14, Boolean bool, SkuPrice skuPrice, String str15, String str16, String str17, String str18, Boolean bool2, PageFinder pageFinder, String str19, String str20) throws JSONException {
        String str21;
        Iterator<String> itKeys;
        String string;
        Map mapLIZ = C308370C6x.LIZ(3);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : ((LinkedHashMap) mapLIZ).entrySet()) {
            C1189060h32.LJJI((String) entry.getKey(), (String) entry.getValue(), jSONObject2);
        }
        Iterator it2 = map.entrySet().iterator();
        while (true) {
            String string2 = null;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry2 = (Map.Entry) it2.next();
            String str22 = (String) entry2.getKey();
            Object value = entry2.getValue();
            if (value != null) {
                string2 = value.toString();
            }
            C1189060h32.LJJI(str22, string2, jSONObject2);
        }
        jSONObject2.put("poi_id", str);
        jSONObject2.put("enter_from", "order_submit_page");
        jSONObject2.put("poi_detail_enter_from", str2);
        jSONObject2.put("poi_detail_enter_method", str3);
        jSONObject2.put("pdp_enter_from", str4);
        jSONObject2.put("pdp_enter_method", str5);
        jSONObject2.put("order_submit_enter_from", str6);
        jSONObject2.put("order_submit_enter_method", str7);
        jSONObject2.put("one_click_booking_type_able", str19);
        jSONObject2.put("one_click_booking_type_actual", str20);
        C1189060h32.LIZIZ(str8, jSONObject2);
        if (jSONObject != null && (itKeys = jSONObject.keys()) != null) {
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                if (objOpt != null) {
                    string = objOpt.toString();
                } else {
                    string = null;
                }
                C1189060h32.LJJI(next, string, jSONObject2);
            }
        }
        if (list != null) {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                PriceItem priceItem2 = (PriceItem) it3.next();
                C1189060h32.LJJI(priceItem2.key, priceItem2.priceAmount, jSONObject2);
            }
        }
        if (priceItem != null) {
            C1189060h32.LJJI(priceItem.key, priceItem.priceAmount, jSONObject2);
        }
        jSONObject2.put("order_id", str10);
        jSONObject2.put("order_status", str11);
        jSONObject2.put("is_payment_finish", C1189060h32.LJJIIZ(Boolean.valueOf(z)));
        jSONObject2.put("is_report_error", C1189060h32.LJJIIZ(Boolean.valueOf(z2)));
        if (str12 != null) {
            jSONObject2.put("error_code", str12);
        }
        jSONObject2.put("quantity", str9);
        C1189060h32.LJJI("bcm_chain", str13, jSONObject2);
        C1189060h32.LJJI("gec_id", str14, jSONObject2);
        if (bool != null) {
            jSONObject2.put("is_new_user", C1189060h32.LJJIIZ(Boolean.valueOf(bool.booleanValue())));
        }
        for (Map.Entry entry3 : map2.entrySet()) {
            C1189060h32.LJJI((String) entry3.getKey(), String.valueOf(entry3.getValue()), jSONObject2);
        }
        if (skuPrice != null) {
            C1189060h32.LJJI("discount", String.valueOf(skuPrice.discountNum), jSONObject2);
            C1189060h32.LJJI("discount_type", skuPrice.discountType, jSONObject2);
            C1189060h32.LJJI("currency", skuPrice.currency, jSONObject2);
            C1189060h32.LJJI("save_amount", skuPrice.saveAmount, jSONObject2);
        }
        C1189060h32.LJJI("coupon_info", str15, jSONObject2);
        jSONObject2.put("pay_request_id", str16);
        C1189060h32.LJJI("pdp_atmosphere_tag_ids", str17, jSONObject2);
        C1189060h32.LJJI("osp_atmosphere_tag_ids", str18, jSONObject2);
        if (Intrinsics.LJFF(bool2, Boolean.TRUE)) {
            str21 = "1";
        } else {
            str21 = CardStruct.IStatusCode.DEFAULT;
        }
        C1189060h32.LJJI("is_out_of_stock", str21, jSONObject2);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZJ("submit_order_result", jSONObject2, c1185050gwZ);
    }
}
