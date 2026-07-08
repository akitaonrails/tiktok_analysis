package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.region.service.IECommerceRegionService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.182s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212208182s {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public final C183B LJII = new C183B();
    public long LJIIIIZZ;
    public Map<String, String> LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;

    public final JSONObject LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        jSONObject.put("enter_from_merge", this.LJIIJ);
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
        jSONObject.put("entrance_form", "live_preview_card");
        String str5 = this.LJ;
        if (str5 == null) {
            str5 = "";
        }
        jSONObject.put("original_price_value", str5);
        String str6 = this.LJFF;
        if (str6 == null) {
            str6 = "";
        }
        jSONObject.put("sale_price_value", str6);
        String str7 = this.LJI;
        jSONObject.put("follow_status", str7 != null ? str7 : "");
        Map<String, String> map = this.LJIIIZ;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        String str8 = this.LJIIJJI;
        if (str8 != null) {
            jSONObject.put("ecom_live_rcmd_info", str8);
        }
        return jSONObject;
    }

    public final void LIZLLL(Map map) throws JSONException {
        Set<Map.Entry> setEntrySet;
        JSONObject jSONObjectLIZ = LIZ();
        if (map != null && (setEntrySet = map.entrySet()) != null) {
            for (Map.Entry entry : setEntrySet) {
                jSONObjectLIZ.put((String) entry.getKey(), entry.getValue());
            }
        }
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZLLL("livesdk_tiktokec_card_close", jSONObjectLIZ);
        jSONObjectLIZ.put("stay_time", System.currentTimeMillis() - this.LJIIIIZZ);
        C1507790pL7.LIZLLL("livesdk_tiktokec_product_entrance_stay_time", jSONObjectLIZ);
        if (map != null && map.get("task_id") != null) {
            jSONObjectLIZ.put("click_for", "close");
            jSONObjectLIZ.put("page_name", "live_preview_page");
            jSONObjectLIZ.put("page_type", "module");
            jSONObjectLIZ.put("module_name", "mission_card");
            C1507790pL7.LIZLLL("button_click", jSONObjectLIZ);
            C1507790pL7.LIZLLL("tiktokec_live_preview_seller_mission_card_click", jSONObjectLIZ);
        }
        LJ("user_close", map);
    }

    public final void LIZIZ(int i, Map map) throws JSONException {
        Set<Map.Entry> setEntrySet;
        JSONObject jSONObjectLIZ = LIZ();
        if (map != null && (setEntrySet = map.entrySet()) != null) {
            for (Map.Entry entry : setEntrySet) {
                jSONObjectLIZ.put((String) entry.getKey(), entry.getValue());
            }
        }
        if (i == 2) {
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LIZLLL("livesdk_tiktokec_card_click", jSONObjectLIZ);
            C1507790pL7.LIZLLL("livesdk_tiktokec_coupon_click", jSONObjectLIZ);
        } else {
            if (i != 1 || map == null || map.get("task_id") == null) {
                return;
            }
            jSONObjectLIZ.put("click_for", "cta");
            jSONObjectLIZ.put("page_name", "live_preview_page");
            jSONObjectLIZ.put("page_type", "module");
            jSONObjectLIZ.put("module_name", "mission_card");
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LIZLLL("button_click", jSONObjectLIZ);
            C1507790pL7.LIZLLL("tiktokec_live_preview_seller_mission_card_click", jSONObjectLIZ);
        }
    }

    public final void LIZJ(int i, Map map) throws JSONException {
        Set<Map.Entry> setEntrySet;
        JSONObject jSONObjectLIZ = LIZ();
        if (map != null && (setEntrySet = map.entrySet()) != null) {
            for (Map.Entry entry : setEntrySet) {
                jSONObjectLIZ.put((String) entry.getKey(), entry.getValue());
            }
        }
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZLLL("livesdk_tiktokec_card_click", jSONObjectLIZ);
        if (i == 2) {
            C1507790pL7.LIZLLL("livesdk_tiktokec_coupon_click", jSONObjectLIZ);
            return;
        }
        if (i != 1) {
            return;
        }
        C1507790pL7.LIZLLL("livesdk_tiktokec_product_click", jSONObjectLIZ);
        C1507790pL7.LIZLLL("tiktokec_product_entrance_click", jSONObjectLIZ);
        if (map == null || map.get("task_id") == null) {
            return;
        }
        jSONObjectLIZ.put("click_for", "card");
        jSONObjectLIZ.put("page_name", "live_preview_page");
        jSONObjectLIZ.put("page_type", "module");
        jSONObjectLIZ.put("module_name", "mission_card");
        C1507790pL7.LIZLLL("button_click", jSONObjectLIZ);
        C1507790pL7.LIZLLL("tiktokec_live_preview_seller_mission_card_click", jSONObjectLIZ);
    }

    public final void LJ(String str, Map map) throws JSONException {
        Set<Map.Entry> setEntrySet;
        if (this.LJIIIIZZ <= 0) {
            return;
        }
        JSONObject jSONObjectLIZ = LIZ();
        if (map != null && (setEntrySet = map.entrySet()) != null) {
            for (Map.Entry entry : setEntrySet) {
                jSONObjectLIZ.put((String) entry.getKey(), entry.getValue());
            }
        }
        jSONObjectLIZ.put("quit_type", str);
        jSONObjectLIZ.put("stay_time", System.currentTimeMillis() - this.LJIIIIZZ);
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZLLL("tiktokec_rd_preview_card_stay_time", jSONObjectLIZ);
        this.LJIIIIZZ = 0L;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void LJFF(int i, String str) throws JSONException {
        long j;
        long j2;
        Map<String, Object> mapLJ;
        switch (str.hashCode()) {
            case -245071156:
                if (!str.equals("card_show")) {
                    return;
                }
                this.LJII.LIZJ = SystemClock.elapsedRealtime();
                C183B c183b = this.LJII;
                j2 = c183b.LIZIZ;
                j = c183b.LIZJ;
                break;
                break;
            case 3482191:
                if (!str.equals("quit")) {
                    return;
                }
                this.LJII.LIZLLL = SystemClock.elapsedRealtime();
                C183B c183b2 = this.LJII;
                j2 = c183b2.LIZ;
                j = c183b2.LIZLLL;
                break;
                break;
            case 1196588850:
                if (!str.equals("network_response")) {
                    return;
                }
                this.LJII.LIZIZ = SystemClock.elapsedRealtime();
                C183B c183b3 = this.LJII;
                j2 = c183b3.LIZ;
                j = c183b3.LIZIZ;
                break;
                break;
            case 2115102078:
                if (!str.equals("network_request")) {
                    return;
                }
                this.LJII.LIZ = SystemClock.elapsedRealtime();
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
        jSONObject.put("card_type", i);
        jSONObject.put("code_region", EnumC21186317vZ.SEA.getValue());
        IECommerceRegionService iECommerceRegionService = (IECommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IECommerceRegionService.class, false, false, false, 14, null);
        if (iECommerceRegionService != null && (mapLJ = iECommerceRegionService.LJ(Boolean.FALSE)) != null) {
            for (Map.Entry<String, Object> entry : mapLJ.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL("rd_tiktokec_live_preview_card_event", jSONObject);
    }
}
