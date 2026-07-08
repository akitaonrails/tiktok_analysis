package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.region.service.IECommerceRegionService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.182r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212207182r {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public final C183D LJIIIIZZ = new C183D();
    public long LJIIIZ;
    public Map<String, String> LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;

    public final JSONObject LIZJ() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        jSONObject.put("enter_from_merge", this.LJIIJJI);
        jSONObject.put("enter_method", "live_cell");
        jSONObject.put("action_type", "click");
        jSONObject.put("source_page_type", "live");
        String str = this.LIZ;
        if (str == null) {
            str = "";
        }
        jSONObject.put("product_id", str);
        String str2 = this.LIZIZ;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("author_id", str2);
        String str3 = this.LIZJ;
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put("room_id", str3);
        String str4 = this.LIZLLL;
        if (str4 == null) {
            str4 = "";
        }
        jSONObject.put("request_id", str4);
        String str5 = this.LJIIL;
        if (str5 == null) {
            str5 = "live_preview_card";
        }
        jSONObject.put("entrance_form", str5);
        String str6 = this.LJ;
        if (str6 == null) {
            str6 = "";
        }
        jSONObject.put("original_price_value", str6);
        String str7 = this.LJFF;
        if (str7 == null) {
            str7 = "";
        }
        jSONObject.put("sale_price_after_coupon", str7);
        String str8 = this.LJI;
        if (str8 == null) {
            str8 = "";
        }
        jSONObject.put("sale_price_value", str8);
        String str9 = this.LJII;
        jSONObject.put("follow_status", str9 != null ? str9 : "");
        Map<String, String> map = this.LJIIJ;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        String str10 = this.LJIILIIL;
        if (str10 != null) {
            jSONObject.put("ecom_live_rcmd_info", str10);
        }
        return jSONObject;
    }

    public final Map<String, Object> LIZLLL() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        String str = this.LJIIJJI;
        if (str != null && (!a0.LJJJIL(str))) {
            linkedHashMap.put("enter_from_merge", str);
        }
        linkedHashMap.put("enter_method", "live_cell");
        linkedHashMap.put("action_type", "click");
        linkedHashMap.put("source_page_type", "live");
        String str2 = this.LIZ;
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("product_id", str2);
        String str3 = this.LIZIZ;
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("author_id", str3);
        String str4 = this.LIZJ;
        if (str4 == null) {
            str4 = "";
        }
        linkedHashMap.put("room_id", str4);
        String str5 = this.LIZLLL;
        if (str5 == null) {
            str5 = "";
        }
        linkedHashMap.put("request_id", str5);
        String str6 = this.LJIIL;
        if (str6 == null) {
            str6 = "live_preview_card";
        }
        linkedHashMap.put("entrance_form", str6);
        String str7 = this.LJ;
        if (str7 == null) {
            str7 = "";
        }
        linkedHashMap.put("original_price_value", str7);
        String str8 = this.LJFF;
        if (str8 == null) {
            str8 = "";
        }
        linkedHashMap.put("sale_price_after_coupon", str8);
        String str9 = this.LJI;
        if (str9 == null) {
            str9 = "";
        }
        linkedHashMap.put("sale_price_value", str9);
        String str10 = this.LJII;
        linkedHashMap.put("follow_status", str10 != null ? str10 : "");
        Map<String, String> map = this.LJIIJ;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        String str11 = this.LJIILIIL;
        if (str11 != null) {
            linkedHashMap.put("ecom_live_rcmd_info", str11);
        }
        return linkedHashMap;
    }

    public final Map<String, String> LJ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.LIZIZ;
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("author_id", str);
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        String str2 = this.LIZ;
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("product_id", str2);
        String str3 = this.LIZJ;
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("room_id", str3);
        String str4 = this.LJIIJJI;
        if (str4 == null) {
            str4 = "";
        }
        linkedHashMap.put("enter_from_merge", str4);
        String str5 = this.LJIIL;
        if (str5 == null) {
            str5 = "live_preview_card";
        }
        linkedHashMap.put("entrance_form", str5);
        String str6 = this.LJII;
        if (str6 == null) {
            str6 = "";
        }
        linkedHashMap.put("follow_status", str6);
        linkedHashMap.put("page_name", "live_preview_page");
        linkedHashMap.put("enter_method", "live_cell");
        linkedHashMap.put("action_type", "click");
        linkedHashMap.put("source_page_type", "live");
        String str7 = this.LIZLLL;
        if (str7 == null) {
            str7 = "";
        }
        linkedHashMap.put("request_id", str7);
        String str8 = this.LIZLLL;
        if (str8 == null) {
            str8 = "";
        }
        String str9 = this.LIZJ;
        if (str9 == null) {
            str9 = "";
        }
        String str10 = this.LIZ;
        linkedHashMap.put("track_id", C03RE.LIZ(str8, str9, str10 != null ? str10 : ""));
        Map<String, String> map = this.LJIIJ;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        String str11 = this.LJIILIIL;
        if (str11 != null) {
            linkedHashMap.put("ecom_live_rcmd_info", str11);
        }
        return linkedHashMap;
    }

    public final void LIZ(String str) {
        Map<String, String> map = null;
        if (this.LJIIJ == null) {
            try {
                map = (Map) C08JS.LIZIZ().LJIIIIZZ(str, new C19406910wF().getType());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            this.LJIIJ = map;
            return;
        }
        try {
            HashMap map2 = (HashMap) C08JS.LIZIZ().LJIIIIZZ(str, new TypeToken<HashMap<String, String>>() { // from class: X.1836
            }.getType());
            if (map2 != null) {
                Map<String, String> map3 = this.LJIIJ;
                if (map3 != null) {
                    map3.putAll(map2);
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                this.LJIIJ = linkedHashMap;
                linkedHashMap.putAll(map2);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public final JSONObject LIZIZ(Map<String, String> map) throws JSONException {
        Set<Map.Entry<String, String>> setEntrySet;
        JSONObject jSONObjectLIZJ = LIZJ();
        if (map != null && (setEntrySet = map.entrySet()) != null) {
            Iterator<T> it2 = setEntrySet.iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                jSONObjectLIZJ.put((String) entry.getKey(), entry.getValue());
            }
        }
        return jSONObjectLIZJ;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void LJII(String str) throws JSONException {
        long j;
        long j2;
        Map<String, Object> mapLJ;
        switch (str.hashCode()) {
            case -245071156:
                if (!str.equals("card_show")) {
                    return;
                }
                this.LJIIIIZZ.LIZJ = SystemClock.elapsedRealtime();
                C183D c183d = this.LJIIIIZZ;
                j2 = c183d.LIZIZ;
                j = c183d.LIZJ;
                break;
                break;
            case 3482191:
                if (!str.equals("quit")) {
                    return;
                }
                this.LJIIIIZZ.LIZLLL = SystemClock.elapsedRealtime();
                C183D c183d2 = this.LJIIIIZZ;
                j2 = c183d2.LIZ;
                j = c183d2.LIZLLL;
                break;
                break;
            case 1196588850:
                if (!str.equals("network_response")) {
                    return;
                }
                this.LJIIIIZZ.LIZIZ = SystemClock.elapsedRealtime();
                C183D c183d3 = this.LJIIIIZZ;
                j2 = c183d3.LIZ;
                j = c183d3.LIZIZ;
                break;
                break;
            case 2115102078:
                if (!str.equals("network_request")) {
                    return;
                }
                this.LJIIIIZZ.LIZ = SystemClock.elapsedRealtime();
                j = 1;
                j2 = 1;
                break;
                break;
            default:
                return;
        }
        long j3 = j - j2;
        if (j2 <= 0 || j3 < 0) {
            return;
        }
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        String str2 = this.LIZ;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("product_id", str2);
        String str4 = this.LIZIZ;
        if (str4 == null) {
            str4 = "";
        }
        jSONObject.put("author_id", str4);
        String str5 = this.LIZJ;
        if (str5 != null) {
            str3 = str5;
        }
        jSONObject.put("room_id", str3);
        jSONObject.put("duration", j3);
        jSONObject.put("step", str);
        jSONObject.put("code_region", EnumC21186317vZ.GLOBAL.getValue());
        IECommerceRegionService iECommerceRegionService = (IECommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IECommerceRegionService.class, false, false, false, 14, null);
        if (iECommerceRegionService != null && (mapLJ = iECommerceRegionService.LJ(Boolean.FALSE)) != null) {
            for (Map.Entry<String, Object> entry : mapLJ.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL("rd_tiktokec_live_preview_card_event", jSONObject);
    }

    public final void LJFF(Map<String, String> map, boolean z) {
        String str;
        Set<Map.Entry<String, String>> setEntrySet;
        JSONObject jSONObjectLIZJ = LIZJ();
        if (map != null && (setEntrySet = map.entrySet()) != null) {
            Iterator<T> it2 = setEntrySet.iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                jSONObjectLIZJ.put((String) entry.getKey(), entry.getValue());
            }
        }
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        if (z) {
            str = "livesdk_tiktokec_livecard_click";
        } else {
            str = "livesdk_tiktokec_card_click";
        }
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL(str, jSONObjectLIZJ);
        C1507790pL7.LIZLLL("livesdk_tiktokec_product_click", jSONObjectLIZJ);
        C1507790pL7.LIZLLL("livesdk_tiktokec_product_entrance_click", jSONObjectLIZJ);
        if (map != null && map.get("task_id") != null) {
            jSONObjectLIZJ.put("click_for", "card");
            jSONObjectLIZJ.put("page_name", "live_preview_page");
            jSONObjectLIZJ.put("page_type", "module");
            jSONObjectLIZJ.put("module_name", "mission_card");
            C1507790pL7.LIZLLL("button_click", jSONObjectLIZJ);
            C1507790pL7.LIZLLL("tiktokec_live_preview_seller_mission_card_click", jSONObjectLIZJ);
        }
    }

    public final void LJI(String str, Map map) throws JSONException {
        Set<Map.Entry> setEntrySet;
        if (this.LJIIIZ <= 0) {
            return;
        }
        JSONObject jSONObjectLIZJ = LIZJ();
        if (map != null && (setEntrySet = map.entrySet()) != null) {
            for (Map.Entry entry : setEntrySet) {
                jSONObjectLIZJ.put((String) entry.getKey(), entry.getValue());
            }
        }
        jSONObjectLIZJ.put("quit_type", str);
        jSONObjectLIZJ.put("stay_time", System.currentTimeMillis() - this.LJIIIZ);
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZLLL("tiktokec_rd_preview_card_stay_time", jSONObjectLIZJ);
        this.LJIIIZ = 0L;
    }
}
