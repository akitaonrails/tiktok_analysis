package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vUD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1744070vUD {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C14GR c14gr, String str, String str2) {
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("step", c14gr.name().toLowerCase(Locale.ROOT)), new Pair("author_id", str2), new Pair("room_id", str));
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("rd_tiktokec_quick_product_step", mapLJIIIIZZ);
    }

    public static final void LIZIZ(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        try {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            jSONObject.put("author_id", str);
            jSONObject.put("room_id", str2);
            jSONObject.put("live_status", "during_live");
            jSONObject.put("product_id", str3);
            jSONObject.put("product_source", str4);
            jSONObject.put("source_from", str5);
            jSONObject.put("source", str6);
            jSONObject.put("is_fans_price", str7);
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("livesdk_tiktokec_pin_product_click", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void LIZJ(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7) {
        try {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            jSONObject.put("author_id", str);
            jSONObject.put("room_id", str2);
            jSONObject.put("live_status", "during_live");
            jSONObject.put("product_id", str3);
            jSONObject.put("product_source", str4);
            jSONObject.put("source_from", str5);
            jSONObject.put("source", str6);
            jSONObject.put("is_fans_price", str7);
            jSONObject.put("has_live_helper", num);
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("livesdk_tiktokec_pin_product_show", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
