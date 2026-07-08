package X;

import android.text.TextUtils;
import com.bytedance.scene.Scene;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0j4s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1267080j4s extends C1267090j4t {
    public final Map<String, Object> LIZJ() {
        Object obj;
        HashMap map = new HashMap();
        map.put("timestamp", Long.valueOf(System.currentTimeMillis()));
        C1266470j3t c1266470j3t = this.LIZ;
        if (c1266470j3t != null) {
            map.put("os", c1266470j3t.LIZIZ);
            int i = c1266470j3t.LIZ;
            if (i != -1) {
                map.put("app_version", Integer.valueOf(i));
            }
            if (!TextUtils.isEmpty(c1266470j3t.LIZJ)) {
                map.put("priority_region", c1266470j3t.LIZJ.toLowerCase());
            }
            map.put("ab_params", c1266470j3t.LIZLLL);
            map.put("gear_info_table", c1266470j3t.LJ);
            map.put("live_adaptive_resolution_list", c1266470j3t.LJFF);
            map.put("probe_max_level", Integer.valueOf(c1266470j3t.LJI));
            map.put("probe_min_level", Integer.valueOf(c1266470j3t.LJII));
            map.put("portraits_group", c1266470j3t.LJIIIIZZ);
        }
        C1266550j41 c1266550j41 = this.LIZIZ;
        if (c1266550j41 != null) {
            map.put("device_score", Float.valueOf(c1266550j41.LIZ));
            map.put("video_record_score", Float.valueOf(c1266550j41.LIZIZ));
            map.put("device_overall_score", Float.valueOf(c1266550j41.LIZ));
        }
        C1266450j3r c1266450j3r = this.LIZJ;
        if (c1266450j3r != null) {
            map.put("initial_effect_face_model_name", c1266450j3r.LIZ);
            map.put("initial_effect_matting_model_name", c1266450j3r.LIZIZ);
            map.put("effect_face_model_name", c1266450j3r.LIZJ);
            map.put("effect_matting_model_name", c1266450j3r.LIZLLL);
            map.put("single_cores_cpu_speed", Float.valueOf(c1266450j3r.LJ));
            map.put("perf_score", Float.valueOf(c1266450j3r.LJFF));
            map.put("game_performance_score_host", Float.valueOf(c1266450j3r.LJI));
            map.put("thermal_score", Float.valueOf(c1266450j3r.LJII));
            int i2 = c1266450j3r.LJIIIIZZ;
            if (i2 != -1) {
                map.put("is_charging", Integer.valueOf(i2));
            }
            if (c1266450j3r.LJIIIZ != C1101250elP.LIZ.floatValue()) {
                map.put("battery_value", Float.valueOf(c1266450j3r.LJIIIZ));
            }
            int i3 = c1266450j3r.LJIIJ;
            if (i3 != -1) {
                map.put("device_motion_status", Integer.valueOf(i3));
            }
            int i4 = c1266450j3r.LJIIL;
            if (i4 != -1) {
                map.put("anchor_stable_mode", Integer.valueOf(i4));
            }
            int i5 = c1266450j3r.LJIILIIL;
            if (i5 != -1) {
                map.put("anchor_stable_perf_state", Integer.valueOf(i5));
            }
            int i6 = c1266450j3r.LJIILJJIL;
            if (i6 != -1) {
                map.put("down_perf_score_threshold", Integer.valueOf(i6));
            }
        }
        C1267180j52 c1267180j52 = this.LIZLLL;
        if (c1267180j52 != null) {
            map.put("anchor_income_level", Integer.valueOf(c1267180j52.LIZJ));
            EnumC1268000j6M enumC1268000j6M = c1267180j52.LIZ;
            if (enumC1268000j6M != null) {
                map.put(Scene.SCENE_SERVICE, enumC1268000j6M.getName());
            } else {
                map.put(Scene.SCENE_SERVICE, "");
            }
            EnumC1268010j6N enumC1268010j6N = c1267180j52.LIZIZ;
            if (enumC1268010j6N != null) {
                map.put("role", enumC1268010j6N.getName());
            } else {
                map.put("role", "");
            }
            map.put("short_long_ratio_tolerance_threshold", Float.valueOf(c1267180j52.LIZLLL));
        }
        C1266380j3k c1266380j3k = this.LJ;
        if (c1266380j3k != null) {
            map.put("camera_capture_width", Integer.valueOf(c1266380j3k.LIZ));
            map.put("camera_capture_height", Integer.valueOf(c1266380j3k.LIZIZ));
            map.put("adapted_resolution_width", Integer.valueOf(c1266380j3k.LIZJ));
            map.put("adapted_resolution_height", Integer.valueOf(c1266380j3k.LIZLLL));
            map.put("initial_encode_width", Integer.valueOf(c1266380j3k.LJI));
            map.put("initial_encode_height", Integer.valueOf(c1266380j3k.LJII));
            map.put("encode_width", Integer.valueOf(c1266380j3k.LJ));
            map.put("encode_height", Integer.valueOf(c1266380j3k.LJFF));
            map.put("initial_camera_width", Integer.valueOf(c1266380j3k.LJIIIIZZ));
            map.put("initial_camera_height", Integer.valueOf(c1266380j3k.LJIIIZ));
            map.put("initial_effect_width", Integer.valueOf(c1266380j3k.LJIIJ));
            map.put("initial_effect_height", Integer.valueOf(c1266380j3k.LJIIJJI));
            float f = c1266380j3k.LJIIL;
            if (f != -1.0f) {
                map.put("in_cap_fps", Float.valueOf(f));
            }
            map.put("target_fps", Integer.valueOf(c1266380j3k.LJIILIIL));
            map.put("encode_fps", Integer.valueOf(c1266380j3k.LJIILJJIL));
            map.put("initial_fps", Integer.valueOf(c1266380j3k.LJIILL));
            map.put("encoder_change_reason", c1266380j3k.LJIILLIIL);
            map.put("game_capture_width", Integer.valueOf(c1266380j3k.LJIIZILJ));
            map.put("game_capture_height", Integer.valueOf(c1266380j3k.LJIJ));
            map.put("game_resolution_width", Integer.valueOf(c1266380j3k.LJIJI));
            map.put("game_resolution_height", Integer.valueOf(c1266380j3k.LJIJJ));
            map.put("game_capture_landscape", Integer.valueOf(c1266380j3k.LJIJJLI));
            map.put("initial_game_resolution_width", Integer.valueOf(c1266380j3k.LJIL));
            map.put("initial_game_resolution_height", Integer.valueOf(c1266380j3k.LJJ));
        }
        C1267130j4x c1267130j4x = this.LJFF;
        if (c1267130j4x != null) {
            float f2 = c1267130j4x.LIZ;
            Float f3 = C1101250elP.LIZ;
            if (f2 != f3.floatValue()) {
                map.put("golive_speed_wifi_7d", Float.valueOf(c1267130j4x.LIZ));
            }
            if (c1267130j4x.LIZIZ != f3.floatValue()) {
                map.put("golive_speed_wifi_7d", Float.valueOf(c1267130j4x.LIZIZ));
            }
            map.put("golive_speedtest_low_prob_wifi", Float.valueOf(c1267130j4x.LIZJ));
            map.put("golive_speedtest_low_prob_mobile", Float.valueOf(c1267130j4x.LIZLLL));
            map.put("golive_speedtest_high_prob_wifi", Float.valueOf(c1267130j4x.LJ));
            map.put("golive_speedtest_high_prob_mobile", Float.valueOf(c1267130j4x.LJFF));
        }
        C1267100j4u c1267100j4u = this.LJI;
        if (c1267100j4u != null) {
            map.put("probe_origin", Integer.valueOf(c1267100j4u.LIZIZ));
            map.put("is_pusher_succeed", Integer.valueOf(c1267100j4u.LIZJ));
            int i7 = c1267100j4u.LIZLLL;
            if (i7 != -1) {
                map.put("is_running_success", Integer.valueOf(i7));
            }
            map.put("is_anchor_net", Integer.valueOf(c1267100j4u.LIZ));
            map.put("is_anchor_net_probe", Integer.valueOf(c1267100j4u.LJ));
            map.put("probe_protocol", Integer.valueOf(c1267100j4u.LJFF));
            map.put("probe_bandwidth", Integer.valueOf(c1267100j4u.LJI));
            map.put("probe_rtt", Integer.valueOf(c1267100j4u.LJII));
            map.put("probe_loss_rate", Float.valueOf(c1267100j4u.LJIIIIZZ));
            map.put("probe_final_speed", Integer.valueOf(c1267100j4u.LJIIIZ));
            map.put("probe_duration", Integer.valueOf(c1267100j4u.LJIIJ));
            map.put("t6_liveCore_dns_resolution", Integer.valueOf(c1267100j4u.LJIIJJI));
            map.put("t7_liveCore_socket_connect", Integer.valueOf(c1267100j4u.LJIIL));
            map.put("t8_liveCore_rtmp_connect", Integer.valueOf(c1267100j4u.LJIILIIL));
            map.put("t9_liveCore_start_sending_package", Integer.valueOf(c1267100j4u.LJIILJJIL));
            map.put("t10_client_receive_liveCore_info", Integer.valueOf(c1267100j4u.LJIILL));
            map.put("network_type", c1267100j4u.LJIILLIIL);
            map.put("recommend_level", Integer.valueOf(c1267100j4u.LJIIZILJ));
            map.put("recommend_bottom_line", Long.valueOf(c1267100j4u.LJIJ));
            map.put("cached_bandwidth", Integer.valueOf(c1267100j4u.LJIJJ));
            map.put("cached_final_bandwidth", Integer.valueOf(c1267100j4u.LJIJJLI));
            map.put("cached_protocol", Integer.valueOf(c1267100j4u.LJIJI));
            map.put("cached_rtt", Integer.valueOf(c1267100j4u.LJIL));
            map.put("cached_loss_rate", Float.valueOf(c1267100j4u.LJJ));
            int i8 = c1267100j4u.LJJI;
            if (i8 != -1) {
                map.put("rtt", Integer.valueOf(i8));
            }
            if (c1267100j4u.LJJIFFI != C1101250elP.LIZ.floatValue()) {
                map.put("loss_rate", Float.valueOf(c1267100j4u.LJJIFFI));
            }
            int i9 = c1267100j4u.LJJII;
            if (i9 != -1) {
                map.put("network_quality", Integer.valueOf(i9));
            }
            map.put("strategy_flow_mode", Integer.valueOf(c1267100j4u.LJJIII));
        }
        C1267110j4v c1267110j4v = this.LJII;
        if (c1267110j4v != null) {
            map.put("enable_linkmic_simulcast", Integer.valueOf(c1267110j4v.LIZ));
            map.put("linkmic_layout_config_id", c1267110j4v.LIZIZ);
            map.put("linkmic_layout_config", c1267110j4v.LJ);
            map.put("prev_multi_stream_stats", c1267110j4v.LIZLLL);
            map.put("simulcast_type", c1267110j4v.LIZJ);
            map.put("simulcast_stream_name", c1267110j4v.LJFF);
        }
        C1266540j40 c1266540j40 = this.LJIIIZ;
        if (c1266540j40 != null) {
            map.put("min_denoise_adapted_resolution_width", Integer.valueOf(c1266540j40.LIZJ));
            map.put("min_denoise_adapted_resolution_height", Integer.valueOf(c1266540j40.LIZLLL));
            map.put("bmf_denoise_mask", Integer.valueOf(c1266540j40.LIZ));
            map.put("bmf_denoise_enable", Integer.valueOf(c1266540j40.LIZIZ));
            map.put("min_streamhd_adapted_resolution_width", Integer.valueOf(c1266540j40.LJI));
            map.put("min_streamhd_adapted_resolution_height", Integer.valueOf(c1266540j40.LJII));
            map.put("bmf_streamhd_mask", Integer.valueOf(c1266540j40.LJ));
            map.put("bmf_streamhd_adaptive_enable", Integer.valueOf(c1266540j40.LJFF));
        }
        C1267220j56 c1267220j56 = this.LJIIJ;
        if (c1267220j56 != null) {
            map.put("event_type", c1267220j56.LIZ);
            map.put("force_downgrade_status", Integer.valueOf(c1267220j56.LIZIZ));
        }
        C1267160j50 c1267160j50 = this.LJIIJJI;
        if (c1267160j50 != null) {
            map.put("can_enable_gputurbo", Integer.valueOf(c1267160j50.LIZ));
            map.put("gputurbo_enable_status", Integer.valueOf(c1267160j50.LIZIZ));
        }
        C1267210j55 c1267210j55 = this.LJIIIIZZ;
        if (c1267210j55 != null) {
            map.put("subscribe_simulcast_enable", Integer.valueOf(c1267210j55.LIZ));
            map.put("subscribe_remote_stream_width", Integer.valueOf(c1267210j55.LIZIZ));
            map.put("subscribe_remote_stream_height", Integer.valueOf(c1267210j55.LIZJ));
        }
        C1267230j57 c1267230j57 = this.LJIIL;
        if (c1267230j57 != null) {
            map.put("force_downgrade_status", Integer.valueOf(c1267230j57.LIZ));
        }
        C1267200j54 c1267200j54 = this.LJIILIIL;
        if (c1267200j54 != null) {
            Map<String, ? extends Object> map2 = c1267200j54.LIZ;
            if (map2 != null) {
                for (String str : map2.keySet()) {
                    if (str.length() > 0 && (obj = map2.get(str)) != null) {
                        map.put(str, obj);
                    }
                }
            }
            Map<String, ? extends Object> map3 = c1267200j54.LIZIZ;
            if (map3 != null) {
                map.put("business_custom_group", map3);
            }
        }
        C1267170j51 c1267170j51 = this.LJIILJJIL;
        if (c1267170j51 != null) {
            c1267170j51.getClass();
            JSONArray jSONArray = new JSONArray();
            for (C1267240j58 c1267240j58 : ((HashMap) c1267170j51.LIZJ).values()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("channel_index", c1267240j58.LIZ);
                jSONObject.put("subscriber_max_downlink_bps", c1267240j58.LIZIZ);
                jSONObject.put("subscriber_count", c1267240j58.LIZJ);
                jSONObject.put("cfg_max_enc_width", c1267240j58.LIZLLL);
                jSONObject.put("cfg_max_enc_height", c1267240j58.LJ);
                jSONObject.put("cfg_max_enc_fps", c1267240j58.LJFF);
                jSONObject.put("cfg_min_enc_bps", c1267240j58.LJI);
                jSONObject.put("cfg_max_enc_bps", c1267240j58.LJII);
                jSONObject.put("current_enc_width", c1267240j58.LJIIIIZZ);
                jSONObject.put("current_enc_height", c1267240j58.LJIIIZ);
                jSONObject.put("current_enc_target_fps", c1267240j58.LJIIJ);
                jSONObject.put("current_enc_target_bps", c1267240j58.LJIIJJI);
                jSONArray.put(jSONObject);
            }
            map.put("channel_enc_info_table", jSONArray);
            map.put("media_target_bps", Integer.valueOf(c1267170j51.LIZ));
            map.put("scene_type", Integer.valueOf(c1267170j51.LIZIZ));
        }
        C1267120j4w c1267120j4w = this.LJIILL;
        if (c1267120j4w != null) {
            map.put("linkmic_canvas_width", Integer.valueOf(c1267120j4w.LIZ));
            map.put("linkmic_canvas_height", Integer.valueOf(c1267120j4w.LIZIZ));
            map.put("linkmic_window_width_ratio", Float.valueOf(c1267120j4w.LIZJ));
            map.put("linkmic_window_height_ratio", Float.valueOf(c1267120j4w.LIZLLL));
            map.put("linkmic_enable_simulcast", Integer.valueOf(c1267120j4w.LJ));
            map.put("linkmic_enable_high_bitrate", Integer.valueOf(c1267120j4w.LJI));
            map.put("linkmic_high_bitrate_ratio", Float.valueOf(c1267120j4w.LJII));
            map.put("linkmic_enable_dual_channel", Integer.valueOf(c1267120j4w.LJFF));
            map.put("linkmic_layout_config_id_for_generate_strategy", c1267120j4w.LJIIIIZZ);
        }
        C1267190j53 c1267190j53 = this.LJIILLIIL;
        if (c1267190j53 != null) {
            map.put("linkmic_enable_performance_strategy", Integer.valueOf(c1267190j53.LJ));
            map.put("linkmic_current_performance_level", Integer.valueOf(c1267190j53.LIZ));
            map.put("linkmic_performance_levels", c1267190j53.LIZJ);
            map.put("linkmic_performance_mode", Integer.valueOf(c1267190j53.LIZIZ));
            map.put("linkmic_encode_configs", c1267190j53.LIZLLL);
        }
        return map;
    }
}
