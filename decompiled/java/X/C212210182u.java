package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.region.service.IECommerceRegionService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.182u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212210182u {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public final C183C LIZLLL = new C183C();
    public long LJ;
    public Map<String, String> LJFF;
    public String LJI;

    public final JSONObject LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        jSONObject.put("enter_from_merge", this.LJI);
        jSONObject.put("enter_method", "live_cell");
        jSONObject.put("action_type", "click");
        jSONObject.put("source_page_type", "live");
        jSONObject.put("page_name", "live");
        jSONObject.put("card_name", "live_task");
        jSONObject.put("product_id", "");
        String str = this.LIZ;
        if (str == null) {
            str = "";
        }
        jSONObject.put("author_id", str);
        String str2 = this.LIZIZ;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("room_id", str2);
        String str3 = this.LIZJ;
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put("request_id", str3);
        jSONObject.put("entrance_form", "live_preview_card");
        jSONObject.put("original_price_value", "");
        jSONObject.put("sale_price_value", "");
        jSONObject.put("follow_status", "");
        Map<String, String> map = this.LJFF;
        if (map != null) {
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void LIZJ(String str) throws JSONException {
        long j;
        long j2;
        Map<String, Object> mapLJ;
        switch (str.hashCode()) {
            case -245071156:
                if (!str.equals("card_show")) {
                    return;
                }
                this.LIZLLL.LIZJ = SystemClock.elapsedRealtime();
                C183C c183c = this.LIZLLL;
                j2 = c183c.LIZIZ;
                j = c183c.LIZJ;
                break;
                break;
            case 3482191:
                if (!str.equals("quit")) {
                    return;
                }
                this.LIZLLL.LIZLLL = SystemClock.elapsedRealtime();
                C183C c183c2 = this.LIZLLL;
                j2 = c183c2.LIZ;
                j = c183c2.LIZLLL;
                break;
                break;
            case 1196588850:
                if (!str.equals("network_response")) {
                    return;
                }
                this.LIZLLL.LIZIZ = SystemClock.elapsedRealtime();
                C183C c183c3 = this.LIZLLL;
                j2 = c183c3.LIZ;
                j = c183c3.LIZIZ;
                break;
                break;
            case 2115102078:
                if (!str.equals("network_request")) {
                    return;
                }
                this.LIZLLL.LIZ = SystemClock.elapsedRealtime();
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
        String str2 = "";
        jSONObject.put("product_id", "");
        String str3 = this.LIZ;
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put("author_id", str3);
        String str4 = this.LIZIZ;
        if (str4 != null) {
            str2 = str4;
        }
        jSONObject.put("room_id", str2);
        jSONObject.put("duration", j3);
        jSONObject.put("step", str);
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

    public final void LIZIZ(String str, Map map) throws JSONException {
        if (this.LJ <= 0) {
            return;
        }
        JSONObject jSONObjectLIZ = LIZ();
        Set<Map.Entry> setEntrySet = ((LinkedHashMap) map).entrySet();
        if (setEntrySet != null) {
            for (Map.Entry entry : setEntrySet) {
                jSONObjectLIZ.put((String) entry.getKey(), entry.getValue());
            }
        }
        jSONObjectLIZ.put("quit_type", str);
        jSONObjectLIZ.put("stay_time", System.currentTimeMillis() - this.LJ);
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZLLL("tiktokec_rd_preview_card_stay_time", jSONObjectLIZ);
        this.LJ = 0L;
    }
}
