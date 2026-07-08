package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pw2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1530680pw2 {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("success", "duration_ms", "response_mode");
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("hit_status", "prefetch_count_raw", "preconnect_count_raw", "subpage_preconnect_count_raw", "match_type", "mode");
    public static final List<String> LIZJ = C1697810uHb.LJIIJJI("preconnect_count_raw", "preconnect_attempt_count", "preconnect_failure_count", "preconnect_success_count", "importance_threshold");

    public static void LIZIZ(C1725370v03 c1725370v03, C1530700pw4 c1530700pw4) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("hit_status", c1530700pw4.LIZ);
        C1530720pw6.LIZ("miss_reason", c1530700pw4.LIZIZ, jSONObject);
        jSONObject.put("apply_timing", "psp_prewarm");
        Integer num = c1530700pw4.LIZJ;
        if (num != null) {
            jSONObject.put("prefetch_count_raw", num.intValue());
        }
        Integer num2 = c1530700pw4.LIZLLL;
        if (num2 != null) {
            jSONObject.put("preconnect_count_raw", num2.intValue());
        }
        Integer num3 = c1530700pw4.LJ;
        if (num3 != null) {
            jSONObject.put("subpage_preconnect_count_raw", num3.intValue());
        }
        Integer num4 = c1530700pw4.LJFF;
        if (num4 != null && num4.intValue() >= 0) {
            jSONObject.put("match_type", num4.intValue());
        }
        Integer num5 = c1530700pw4.LJI;
        if (num5 != null && num5.intValue() >= 0) {
            jSONObject.put("mode", num5.intValue());
        }
        LIZ("rd_pipo_ssp_feature_apply", c1725370v03, jSONObject, LIZIZ);
    }

    public static void LIZ(String str, C1725370v03 c1725370v03, JSONObject jSONObject, List list) {
        try {
            JSONObject jSONObjectLIZ = c1725370v03.LIZ();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObjectLIZ.put(next, jSONObject.opt(next));
            }
            C1725270uzt.LJ(C1725270uzt.LIZ, str, jSONObjectLIZ, list, 4);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
    }

    public static void LIZJ(C1725370v03 c1725370v03, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (str == null) {
            str = "";
        }
        jSONObject.put("origin_ssp_config", str);
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("origin_use_forest", str2);
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put("origin_disable_gecko", str3);
        if (str4 == null) {
            str4 = "";
        }
        jSONObject.put("origin_bid", str4);
        if (str5 == null) {
            str5 = "";
        }
        jSONObject.put("ssp_config", str5);
        if (str6 == null) {
            str6 = "";
        }
        jSONObject.put("use_forest", str6);
        if (str7 == null) {
            str7 = "";
        }
        jSONObject.put("disable_gecko", str7);
        if (str8 == null) {
            str8 = "";
        }
        jSONObject.put("bid", str8);
        LIZ("rd_pipo_ssp_schema_config", c1725370v03, jSONObject, C13BV.INSTANCE);
    }
}
