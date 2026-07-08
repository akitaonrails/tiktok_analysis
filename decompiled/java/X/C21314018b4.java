package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughInitTechTrackRateConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRDMobConfig;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18b4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21314018b4 {
    public static final C21314018b4 LIZ = new C21314018b4();

    public static boolean LIZIZ(String str) {
        return C1196170hEV.LIZIZ(str, "default", null);
    }

    public static void LIZJ(String str, String str2) {
        if (!C1697810uHb.LJIILJJIL("video_play", "stay_time", "video_play_finish", "search_result_show", "multi_anchor_entrance_show", "screen_shot").contains(str) && C1196170hEV.LIZIZ("local_service_pass_through_exception", "default", null)) {
            JSONObject jSONObject = new JSONObject();
            C2365509Or.LIZLLL(jSONObject, "error_type", str2);
            C2365509Or.LIZLLL(jSONObject, "event_name", str);
            C21313818b2.LIZ.getClass();
            C2365509Or.LIZLLL(jSONObject, "config_version", Integer.valueOf(C21313818b2.LIZLLL()));
            C20684815ws.LJIJ("local_service_pass_through_exception", jSONObject);
        }
    }

    public static void LJI(String str, String str2) {
        if (C1196170hEV.LIZIZ("ttls_rd_pass_through_param_rejected", "default", null)) {
            JSONObject jSONObject = new JSONObject();
            C2365509Or.LIZLLL(jSONObject, "rejected_key", str);
            C2365509Or.LIZLLL(jSONObject, "rejected_scene", str2);
            C21313818b2.LIZ.getClass();
            C2365509Or.LIZLLL(jSONObject, "config_version", Integer.valueOf(C21313818b2.LIZLLL()));
            C20684815ws.LJIJ("ttls_rd_pass_through_param_rejected", jSONObject);
        }
    }

    public static void LIZ(C21314018b4 c21314018b4, EnumC21315318bH enumC21315318bH, Throwable th) {
        c21314018b4.getClass();
        C1205490hTX.LIZ.getClass();
        C1205490hTX.LIZLLL(enumC21315318bH, "ls_pass_through", null, th);
    }

    public static void LIZLLL(int i, long j, String str, String str2, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        LSPassThroughRDMobConfig lSPassThroughRDMobConfig = LSPassThroughRDMobConfig.INSTANCE;
        if (!lSPassThroughRDMobConfig.enable() || !LIZIZ("local_service_pass_through_experience") || !lSPassThroughRDMobConfig.isReportEvent() || C13LP.LJJJJ(str2, C1697810uHb.LJIILJJIL("video_play", "stay_time", "multi_anchor_entrance_show", "video_play_finish", "local_service_slash_track", "location_performance_track", "search_result_show", "ttls_rd_show_product_shelf_item", "poi_fe_perf_event", "btm_page_show_bd")) || lSPassThroughRDMobConfig.isBlocked(str2)) {
            return;
        }
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        C2365509Or.LIZLLL(jSONObject2, Scene.SCENE_SERVICE, str);
        C2365509Or.LIZLLL(jSONObject2, "duration", Long.valueOf(j));
        C2365509Or.LIZLLL(jSONObject2, "bcm_chain_size", Integer.valueOf(i));
        C2365509Or.LIZLLL(jSONObject2, "event_name", str2);
        C21313818b2.LIZ.getClass();
        C2365509Or.LIZLLL(jSONObject2, "config_version", Integer.valueOf(C21313818b2.LIZLLL()));
        C20684815ws.LJIJ("local_service_pass_through_experience", jSONObject2);
    }

    public static void LJFF(boolean z, String str, Integer num, Long l, boolean z2, boolean z3) {
        long jLongValue;
        if (C1087660ePU.LIZ(LSPassThroughInitTechTrackRateConfig.INSTANCE.rate())) {
            JSONObject jSONObject = new JSONObject();
            C2365509Or.LIZLLL(jSONObject, "has_config", Boolean.valueOf(z));
            C2365509Or.LIZLLL(jSONObject, "name", str);
            C2365509Or.LIZLLL(jSONObject, "config_version", num);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            C2365509Or.LIZLLL(jSONObject, "duration", Long.valueOf(jCurrentTimeMillis - jLongValue));
            C2365509Or.LIZLLL(jSONObject, "has_valid_local_config", Boolean.valueOf(z2));
            C2365509Or.LIZLLL(jSONObject, "is_main_thread", Boolean.valueOf(z3));
            C20684815ws.LJIJ("local_service_pass_through_init_track", jSONObject);
        }
    }
}
