package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.model.UpdateStatusReqMessage;
import com.bytedance.android.livesdk.livesetting.broadcast.PingAnchorReportStreamInfoSettings;
import com.bytedance.android.livesdk.livesetting.broadcast.PushParamsStoreInvalidOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.CameraModeFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTLHGLVersionReportSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.model.ModelInfo;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS208S0000000_20;
import kotlin.jvm.internal.AFwS301S0000000_17;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jKc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1276840jKc {
    public static final C1276840jKc LIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;
    public static int LIZJ;
    public static int LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static final List<Long> LJI;
    public static final List<String> LJII;
    public static final CopyOnWriteArrayList<Double> LJIIIIZZ;
    public static final C1277250jLH LJIIIZ;
    public static final Map<String, String> LJIIJ;
    public static C1282250jTL LJIIJJI;
    public static final Map<String, String> LJIIL;
    public static final Map<String, String> LJIILIIL;
    public static final List<String> LJIILJJIL;
    public static final ArrayList<String> LJIILL;
    public static final ArrayList<String> LJIILLIIL;
    public static int LJIIZILJ;
    public static boolean LJIJ;
    public static C474500IjA LJIJI;
    public static final List<Double> LJIJJ;
    public static final List<Double> LJIJJLI;
    public static final List<Integer> LJIL;
    public static final List<Integer> LJJ;
    public static final List<String> LJJI;
    public static final List<Integer> LJJIFFI;
    public static final List<Integer> LJJII;
    public static final C1276850jKd LJJIII;
    public static final RunnableC473680Ihq LJJIIJ;
    public static final AFwS208S0000000_20 LJJIIJZLJL;
    public static final HashMap<String, Integer> LJJIIZ;
    public static final HashMap<String, Integer> LJJIIZI;
    public static boolean LJJIJ;
    public static long LJJIJIIJI;
    public static long LJJIJIIJIL;
    public static int LJJIJIL;
    public static Function0<Integer> LJJIJL;
    public static Function0<Long> LJJIJLIJ;
    public static Function0<Integer> LJJIL;
    public static Function0<Long> LJJIZ;
    public static Function0<Long> LJJJ;
    public static Function0<Long> LJJJI;
    public static Function0<Long> LJJJIL;
    public static final AFwS208S0000000_20 LJJJJ;
    public static Function0<Long> LJJJJI;
    public static Function0<Long> LJJJJIZL;
    public static Function0<Integer> LJJJJJ;
    public static Function0<Integer> LJJJJJL;
    public static Function0<Float> LJJJJL;
    public static Function0<String> LJJJJLI;
    public static Function0<? extends JSONArray> LJJJJLL;
    public static Function0<? extends JSONArray> LJJJJZ;
    public static Function0<? extends JSONObject> LJJJJZI;
    public static Function0<? extends Map<String, String>> LJJJLIIL;
    public static boolean LJJJLL;
    public static int LJJJLZIJ;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C1276840jKc.class, "settingFpsMax", "getSettingFpsMax()I", 0);
        C13LE.LIZ.getClass();
        LIZIZ = new InterfaceC2217461Bqa[]{c2217371BqR};
        LIZ = new C1276840jKc();
        LJI = new ArrayList();
        LJII = new ArrayList();
        LJIIIIZZ = new CopyOnWriteArrayList<>();
        LJIIIZ = new C1277250jLH(30, AFwS301S0000000_17.get$arr$(13));
        LJIIJ = new LinkedHashMap();
        LJIIL = new LinkedHashMap();
        LJIILIIL = new LinkedHashMap();
        LJIILJJIL = new ArrayList();
        LJIILL = C1697810uHb.LJ("device_score", "use_background_music", "use_draw_and_guess", "use_like", "live_state", "camera_mode", "broadcast_scene", "gift_cnt", "time_elapsed_in_room", "sticker_use_time", "effect_use_time", "voice_use_time", "filter_level", "filter_use_time", "channel_id", "linkmic_id", "layout_id", "role", "push_param_invalid", "beauty_effect_list", "filter_effect_id", "voice_effect_id", "effect_effect_id", "sticker_resource_id", "effect_resource_id", "voice_resource_id", "filter_resource_id", "beauty_resource_list", "video_gift_id", "background_effect_id", "background_resource_id", "background_use_time", "beauty_level");
        LJIILLIIL = C1697810uHb.LJ("event_key", "effectKey", "bitrate", "resolution_width", "resolution_height", "pusher_type", "is_pusher_fallback", "super_resolution_effect", "can_enable_effect_downsampling", "effect_downsampling_scale", "probe_engine", "ttlh_video_quality_strategy_version", "frame_adjustment_message", "video_capture_width", "video_capture_height", "camera_capture_width", "camera_capture_height", "camera_size", "push_fps", "preview_fps", "in_cap_fps", "out_cap_fps", "encode_fps", "audio_codec", "video_codec", "push_protocol", "native_render_enabled", "is_hw", "codec_type", "push_protocol", "camera_origin_fps", "streamhd_setting", "streamhd_lastcode", "streamhd_denoise_level", "streamhd_running_type", "source_abnormal", "effect_abnormal", "remote_abnormal", "remote_black_count", "remote_green_count", "remote_frame_error_count", "remote_frame_error_code", "remote_black_detect_count", "source_black_count", "source_black_detect_count", "effect_black_count", "effect_black_detect_count", "is_blackout", "blackout_type", "remote_green_detect_count", "source_green_count", "source_green_detect_count", "effect_green_count", "effect_green_detect_count", "is_greenout", "greenout_type", "camera_capture_time", "camera_to_processor_latency", "update_tex_image_time", "oes_to_2d_time", "effect_process_time", "after_effect_gl_finish_time", "post_process_algorithm_time", "process_to_render_latency", "render_time", "process_to_encoder_latency", "encoder_draw_surface_time", "effect_process_time", "audio_enc_bitrate", "audio_device_error", "audio_level", "audio_layer", "audio_route", "audio_mode", "audio_record_fr", "audio_pre_rtf", "audio_effect_rtf", "audio_mic_after_3a_level", "audio_ns_enabled", "audio_play_fr", "audio_play_level", "audio_device_status", "camera_exposure_time", "camera_iso_value", "adapted_resolution_width", "adapted_resolution_height", "upstream_network_speed", "downstream_network_speed", "packet_loss_rate", "jitter", "latency", "encode_fps", "bitrate", "remote_user_info", "linkmic_uv", "remote_decode_fps", "remote_render_fps", "remote_resolution_width", "remote_resolution_height", "remote_linkmic_id", "remote_is_hw", "remote_codec_type", "multi_stream_model_type", "multi_stream_type", "multi_stream_reason_perf", "multi_stream_reason_network", "multi_stream_resolution_width", "multi_stream_resolution_height", "multi_stream_encode_fps", "multi_stream_push_fps", "recv_total_user_num", "recv_vd2_big_user_num", "recv_vd2_normal_user_num", "recv_vd2_small_user_num", "recv_vd1_equal_user_num", "recv_vd1_less_user_num", "recv_stream_subscribe_status", "camera_type", "camera_avg_result_fps", "camera_capture_width", "camera_capture_height", "setting_fps_min", "setting_fps_max", "camera_mode", "video_profile", "mic_start_error_code", "meta_audio_bitrate", "audio_config", "meta_video_bitrate", "meta_video_fps", "video_enc_bitrate", "encode_drop_cnt", "rtc_connect", "linkmic_biz_id", "layout_config_id", "effect_real_process_time", "encode_error_code", "bach_face_execute_time", "effect_alg_time_avg", "effect_nodes_render_time_avg", "effect_render_time_avg", "effect_scene_render_time_avg", "effect_scene_update_time_avg", "bach_scene_age_level", "bach_scene_gender", "bach_scene_face_position", "bach_scene_face_brightness", "bach_scene_type", "environment_avg_brightness", "environment_strong_luminance", "bach_scene_face_count", "device_motion_status", "scene_detect_process_ms", "scene_detect_avg_interval_ms");
        LJIJ = true;
        LJIJJ = new ArrayList();
        LJIJJLI = new ArrayList();
        LJIL = new ArrayList();
        LJJ = new ArrayList();
        LJJI = new ArrayList();
        LJJIFFI = new ArrayList();
        LJJII = new ArrayList();
        LJJIII = new C1276850jKd();
        LJJIIJ = RunnableC473680Ihq.LL;
        LJJIIJZLJL = AFwS208S0000000_20.get$arr$(9);
        LJJIIZ = new HashMap<>();
        LJJIIZI = new HashMap<>();
        LJJIJIL = -1;
        LJJIJL = AFwS208S0000000_20.get$arr$(11);
        LJJIJLIJ = AFwS208S0000000_20.get$arr$(14);
        LJJIL = AFwS208S0000000_20.get$arr$(15);
        LJJIZ = AFwS208S0000000_20.get$arr$(13);
        LJJJ = AFwS208S0000000_20.get$arr$(10);
        LJJJI = AFwS208S0000000_20.get$arr$(17);
        LJJJIL = AFwS208S0000000_20.get$arr$(12);
        LJJJJ = AFwS208S0000000_20.get$arr$(16);
        LJJJLZIJ = 2;
    }

    public static void LJI() {
        Map<String, String> map = LJIIL;
        map.put("linkmic_uv", "1");
        map.put("remote_decode_fps", "[]");
        map.put("remote_render_fps", "[]");
        map.put("remote_resolution_width", "[]");
        map.put("remote_resolution_height", "[]");
        map.put("remote_linkmic_id", "[]");
        map.put("remote_video_frozen", "[]");
        map.put("remote_is_hw", "[]");
        map.put("remote_codec_type", "[]");
        map.put("remote_video_e2e_delay", "[]");
    }

    public static Map LJIJI() {
        HashMap map = new HashMap();
        ArrayList arrayList = (ArrayList) LJI;
        if (!arrayList.isEmpty()) {
            map.put("influenced_item_effect_id_list", GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, arrayList));
        }
        ArrayList arrayList2 = (ArrayList) LJII;
        if (!arrayList2.isEmpty()) {
            map.put("influenced_item_resource_id_list", GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, arrayList2));
        }
        return map;
    }

    public static String LJIJJ() {
        String str = (String) ((LinkedHashMap) LJIIL).get("effect_effect_id");
        return str == null ? "" : str;
    }

    public static void LJIJJLI() {
        try {
            Function0<String> function0 = LJJJJLI;
            String strValueOf = String.valueOf(function0 != null ? function0.invoke() : null);
            if (!TextUtils.isEmpty(strValueOf)) {
                JSONObject jSONObject = new JSONObject(strValueOf);
                Map<String, String> map = LJIIL;
                map.put("bach_face_execute_time", String.valueOf(jSONObject.optDouble("bach_face_execute_time", -1.0d)));
                map.put("effect_alg_time_avg", String.valueOf(jSONObject.optDouble("effect_alg_time_avg", -1.0d)));
                map.put("effect_nodes_render_time_avg", String.valueOf(jSONObject.optDouble("effect_nodes_render_time_avg", -1.0d)));
                map.put("effect_render_time_avg", String.valueOf(jSONObject.optDouble("effect_render_time_avg", -1.0d)));
                map.put("effect_scene_render_time_avg", String.valueOf(jSONObject.optDouble("effect_scene_render_time_avg", -1.0d)));
                map.put("effect_scene_update_time_avg", String.valueOf(jSONObject.optDouble("effect_scene_update_time_avg", -1.0d)));
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static String LJIL() {
        String str = (String) ((LinkedHashMap) LJIIL).get("effect_resource_id");
        return str == null ? "" : str;
    }

    public static Map LJJI() {
        LinkedHashMap linkedHashMap;
        Map<String, String> map = LJIIL;
        synchronized (map) {
            try {
                map.put("push_param_invalid", String.valueOf(LJIJ));
                if (LJIJ) {
                    for (String str : ((LinkedHashMap) map).keySet()) {
                        if (PushParamsStoreInvalidOptSetting.INSTANCE.getValue()) {
                            if (LJIILLIIL.contains(str)) {
                                LJIIL.put(str, "-2");
                            }
                        } else if (!LJIILL.contains(str)) {
                            LJIIL.put(str, "-2");
                        }
                    }
                }
                linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(LJIIL);
                LJIJ = true;
                try {
                    Iterator it2 = ((ArrayList) LJIILJJIL).iterator();
                    while (it2.hasNext()) {
                        LJIIL.remove((String) it2.next());
                    }
                    ((ArrayList) LJIILJJIL).clear();
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        return linkedHashMap;
    }

    public static String LJJII() {
        return "camera_origin_fps：" + LJJIFFI("camera_origin_fps") + "\r\nsetting_fps_max：" + LJJIFFI("setting_fps_max") + "\r\nsetting_fps_min：" + LJJIFFI("setting_fps_min") + "\r\ncamera_exposure_time：" + LJJIFFI("camera_exposure_time") + "\r\ncamera_iso_value：" + LJJIFFI("camera_iso_value") + "\r\ncamera_to_processor_latency：" + LJJIFFI("camera_to_processor_latency") + "\r\ncamera_capture_time：" + LJJIFFI("camera_capture_time") + "\r\npush_protocol：" + LJJIFFI("push_protocol") + "\r\noes_to_2d_time：" + LJJIFFI("oes_to_2d_time") + "\r\npost_process_algorithm_time：" + LJJIFFI("post_process_algorithm_time") + "\r\nprocess_to_render_latency：" + LJJIFFI("process_to_render_latency") + "\r\n\n";
    }

    public static void LJJIIJ() {
        Map<String, String> map = LJIIL;
        map.put("device_score", String.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
        map.put("use_background_music", "false");
        map.put("use_draw_and_guess", "false");
        map.put("use_like", "false");
        LJJJLL = false;
    }

    public static void LJJIIZI() {
        ((LinkedHashMap) LJIIL).clear();
        ((LinkedHashMap) LJIILIIL).clear();
        ((LinkedHashMap) LJIIJ).clear();
        C1276850jKd c1276850jKd = LJJIII;
        c1276850jKd.getClass();
        if (PingAnchorReportStreamInfoSettings.INSTANCE.enable()) {
            c1276850jKd.LIZ = -1;
            c1276850jKd.LIZIZ = null;
        }
        LJJIJ = false;
        LJJIJIIJI = 0L;
        LJIIZILJ = 0;
        LJIJI = null;
        LJIIIIZZ.clear();
    }

    public static void LJJIJIIJI() {
        Map<String, String> map = LJIIL;
        map.remove("multi_stream_model_type");
        map.remove("multi_stream_type");
        map.remove("multi_stream_reason_perf");
        map.remove("multi_stream_reason_network");
        map.remove("multi_stream_resolution_width");
        map.remove("multi_stream_resolution_height");
        map.remove("multi_stream_encode_fps");
        map.remove("multi_stream_push_fps");
    }

    public static void LJJIJIIJIL() {
        Map<String, String> map = LJIIL;
        map.remove("linkmic_uv");
        map.remove("remote_decode_fps");
        map.remove("remote_render_fps");
        map.remove("remote_resolution_width");
        map.remove("remote_resolution_height");
        map.remove("remote_linkmic_id");
        map.remove("remote_video_frozen");
        map.remove("remote_is_hw");
        map.remove("remote_codec_type");
        map.remove("remote_video_e2e_delay");
        map.remove("local_audio_diagnosis_score");
    }

    public static String LJIIJJI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bach_face_execute_time：");
        sbLIZ.append(LJJIFFI("bach_face_execute_time"));
        sbLIZ.append(" ms\r\neffect_process_time：");
        sbLIZ.append(LJJIFFI("effect_process_time"));
        sbLIZ.append(" ms\r\neffect_alg_time_avg：");
        sbLIZ.append(LJJIFFI("effect_alg_time_avg"));
        sbLIZ.append(" ms\r\neffect_nodes_render_time_avg：");
        sbLIZ.append(LJJIFFI("effect_nodes_render_time_avg"));
        sbLIZ.append(" ms\r\neffect_render_time_avg：");
        sbLIZ.append(LJJIFFI("effect_render_time_avg"));
        sbLIZ.append(" ms\r\neffect_scene_render_time_avg：");
        sbLIZ.append(LJJIFFI("effect_scene_render_time_avg"));
        sbLIZ.append(" ms\r\neffect_scene_update_time_avg：");
        sbLIZ.append(LJJIFFI("effect_scene_update_time_avg"));
        sbLIZ.append(" ms\r\nencoder_draw_surface_time：");
        sbLIZ.append(LJJIFFI("encoder_draw_surface_time"));
        sbLIZ.append(" ms\r\n\n");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJIJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("in cap fps：");
        Object[] objArr = new Object[1];
        LinkedHashMap linkedHashMap = (LinkedHashMap) LJIIL;
        String str = (String) linkedHashMap.get("in_cap_fps");
        objArr[0] = str != null ? Float.valueOf(CastFloatProtector.parseFloat(str)) : null;
        sbLIZ.append(C786410Ut5.j4("%.3f", Arrays.copyOf(objArr, 1)));
        sbLIZ.append("fps\r\nout cap fps：");
        Object[] objArr2 = new Object[1];
        String str2 = (String) linkedHashMap.get("out_cap_fps");
        objArr2[0] = str2 != null ? Float.valueOf(CastFloatProtector.parseFloat(str2)) : null;
        sbLIZ.append(C786410Ut5.j4("%.3f", Arrays.copyOf(objArr2, 1)));
        sbLIZ.append("fps\r\nencode fps：");
        Object[] objArr3 = new Object[1];
        String str3 = (String) linkedHashMap.get("encode_fps");
        objArr3[0] = str3 != null ? Float.valueOf(CastFloatProtector.parseFloat(str3)) : null;
        sbLIZ.append(C786410Ut5.j4("%.3f", Arrays.copyOf(objArr3, 1)));
        sbLIZ.append("fps\r\nreal video frame rate：");
        Object[] objArr4 = new Object[1];
        String str4 = (String) linkedHashMap.get("push_fps");
        objArr4[0] = str4 != null ? Float.valueOf(CastFloatProtector.parseFloat(str4)) : null;
        sbLIZ.append(C786410Ut5.j4("%.3f", Arrays.copyOf(objArr4, 1)));
        sbLIZ.append("fps\r\n\n");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJJIII() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("push resolution：");
        sbLIZ.append(LJJIFFI("resolution_width"));
        sbLIZ.append(" x ");
        sbLIZ.append(LJJIFFI("resolution_height"));
        sbLIZ.append("\n\n");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJJIJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("remote_resolution_height: ");
        sbLIZ.append(LJJIFFI("remote_resolution_height"));
        sbLIZ.append("\r\nremote_resolution_width: ");
        sbLIZ.append(LJJIFFI("remote_resolution_width"));
        sbLIZ.append("\r\nremote_decode_fps: ");
        sbLIZ.append(LJJIFFI("remote_decode_fps"));
        sbLIZ.append("\r\nremote_render_fps: ");
        sbLIZ.append(LJJIFFI("remote_render_fps"));
        sbLIZ.append("\r\n\n");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJJIJL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("camera resolution: ");
        sbLIZ.append(LJJIFFI("camera_capture_width"));
        sbLIZ.append(" x ");
        sbLIZ.append(LJJIFFI("camera_capture_height"));
        sbLIZ.append("\neffect resolution: ");
        sbLIZ.append(LJJIFFI("adapted_resolution_width"));
        sbLIZ.append(" x ");
        sbLIZ.append(LJJIFFI("adapted_resolution_height"));
        sbLIZ.append('\n');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static Map LJJ() {
        return LJIIJ;
    }

    public static void LIZ(int i) {
        if (LJJIJIL != -1) {
            return;
        }
        LJJIJIL = i;
        LJJIJIIJIL = LJJJ.invoke().longValue() * 1000;
    }

    public static void LIZIZ(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LJIIL.remove("background_effect_id");
        } else {
            LJIIL.put("background_effect_id", str);
            LJFF = System.currentTimeMillis();
        }
    }

    public static void LIZJ(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LJIIL.remove("background_resource_id");
        } else {
            LJIIL.put("background_resource_id", str);
        }
    }

    public static void LIZLLL(List list) {
        if (!((ArrayList) list).isEmpty()) {
            LJIIL.put("beauty_level", list.toString());
        } else {
            LJIIL.put("beauty_level", "");
        }
    }

    public static void LJ(List list) {
        if (!((ArrayList) list).isEmpty()) {
            LJIIL.put("beauty_effect_list", list.toString());
        } else {
            LJIIL.remove("beauty_effect_list");
        }
    }

    public static void LJFF(List list) {
        if (!((ArrayList) list).isEmpty()) {
            LJIIL.put("beauty_resource_list", list.toString());
        } else {
            LJIIL.remove("beauty_resource_list");
        }
    }

    public static void LJII(UpdateStatusReqMessage updateStatusReqMessage) {
        JSONObject jSONObject;
        C1276850jKd c1276850jKd = LJJIII;
        c1276850jKd.getClass();
        if (PingAnchorReportStreamInfoSettings.INSTANCE.enable() && (jSONObject = c1276850jKd.LIZIZ) != null) {
            if (Intrinsics.LJFF("push_stream", jSONObject.optString("event_key"))) {
                if (jSONObject.has("transport_send_video_stall_time")) {
                    updateStatusReqMessage.transportSendVideoStallTime = jSONObject.optLong("transport_send_video_stall_time", -1L);
                }
                if (jSONObject.has("transport_send_video_stall_count")) {
                    updateStatusReqMessage.transportSendVideoStallCount = jSONObject.optInt("transport_send_video_stall_count", -1);
                }
                if (jSONObject.has("drop_count")) {
                    updateStatusReqMessage.dropCount = jSONObject.optInt("drop_count", -1);
                }
                int i = c1276850jKd.LIZ;
                if (i != -1) {
                    updateStatusReqMessage.reconnectCount = i;
                }
            }
            c1276850jKd.LIZ = -1;
            updateStatusReqMessage.pusherType = jSONObject.optString("pusher_type");
        }
    }

    public static void LJIIIIZZ(Map map) {
        JSONObject jSONObject;
        C1276850jKd c1276850jKd = LJJIII;
        c1276850jKd.getClass();
        if (PingAnchorReportStreamInfoSettings.INSTANCE.enable() && (jSONObject = c1276850jKd.LIZIZ) != null) {
            if (Intrinsics.LJFF("push_stream", jSONObject.optString("event_key"))) {
                if (jSONObject.has("transport_send_video_stall_time")) {
                    ((HashMap) map).put("transport_send_video_stall_time", Long.valueOf(jSONObject.optLong("transport_send_video_stall_time", -1L)));
                }
                if (jSONObject.has("transport_send_video_stall_count")) {
                    ((HashMap) map).put("transport_send_video_stall_count", Integer.valueOf(jSONObject.optInt("transport_send_video_stall_count", -1)));
                }
                if (jSONObject.has("drop_count")) {
                    ((HashMap) map).put("drop_count", Integer.valueOf(jSONObject.optInt("drop_count", -1)));
                }
                int i = c1276850jKd.LIZ;
                if (i != -1) {
                    ((HashMap) map).put("reconnect_count", Integer.valueOf(i));
                }
            }
            c1276850jKd.LIZ = -1;
            ((HashMap) map).put("pusher_type", jSONObject.optString("pusher_type"));
        }
    }

    public static void LJIIL(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LJIIL.remove("effect_effect_id");
        } else {
            LJIIL.put("effect_effect_id", str);
            LJ = System.currentTimeMillis();
        }
    }

    public static void LJIILL(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LJIIJ.remove("effect_resource_id");
            LJIIL.remove("effect_resource_id");
        } else {
            LJIIJ.put("effect_resource_id", str);
            LJIIL.put("effect_resource_id", str);
            LJ = System.currentTimeMillis();
        }
    }

    public static void LJIILLIIL(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LJIIL.remove("filter_effect_id");
        } else {
            LJIIL.put("filter_effect_id", str);
        }
    }

    public static void LJIIZILJ(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LJIIL.remove("filter_resource_id");
        } else {
            LJIIL.put("filter_resource_id", str);
        }
    }

    public static String LJJIFFI(String str) {
        try {
            String str2 = (String) ((LinkedHashMap) LJIIL).get(str);
            if (str2 == null) {
                str2 = "-";
            }
            int iHashCode = str2.hashCode();
            if (iHashCode != 1444) {
                if (iHashCode != 1445) {
                    if (iHashCode != 1389158) {
                        if (iHashCode != 1390119) {
                            if (iHashCode != 1334982374 || !str2.equals("-1.000")) {
                                return str2;
                            }
                        } else if (!str2.equals("-2.0")) {
                            return str2;
                        }
                    } else if (!str2.equals("-1.0")) {
                        return str2;
                    }
                    return "-";
                }
                if (str2.equals("-2")) {
                    return "-";
                }
                return str2;
            }
            if (str2.equals("-1")) {
                return "-";
            }
            return str2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                return "-";
            }
            throw new C2197108jB();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00bb -> B:38:0x00bd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJJIIJZLJL(android.content.Context r4) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1276840jKc.LJJIIJZLJL(android.content.Context):java.lang.String");
    }

    public static void LJJIL(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LJIIL.remove("sticker_gift_id");
        } else {
            LJIIL.put("sticker_gift_id", str);
            LJ = System.currentTimeMillis();
        }
    }

    public static void LJJIZ(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LJIIL.remove("sticker_resource_id");
        } else {
            LJIIL.put("sticker_resource_id", str);
        }
    }

    public static void LJJJ(boolean z) {
        boolean z2;
        String strValueOf;
        Long lInvoke;
        Float fInvoke;
        Long lInvoke2;
        Integer numInvoke;
        String str;
        String strInvoke;
        Map<String, String> map = LJIIL;
        map.put("gift_cnt", String.valueOf(LJJIJL.invoke().intValue()));
        Long lInvoke3 = LJJIJLIJ.invoke();
        if (lInvoke3.longValue() != -2) {
            z2 = true;
        } else {
            z2 = false;
        }
        Integer numInvoke2 = null;
        if (!z2) {
            lInvoke3 = null;
        }
        Long l = lInvoke3;
        if (l != null) {
            map.put("latest_gift_id", String.valueOf(l.longValue()));
        }
        Long lInvoke4 = LJJIZ.invoke();
        if (lInvoke4.longValue() == -2) {
            lInvoke4 = null;
        }
        Long l2 = lInvoke4;
        if (l2 != null) {
            map.put("latest_gift_effect_id", String.valueOf(l2.longValue()));
        }
        Integer numInvoke3 = LJJIL.invoke();
        if (numInvoke3.intValue() == -2) {
            numInvoke3 = null;
        }
        Integer num = numInvoke3;
        if (num != null) {
            map.put("latest_gift_type", String.valueOf(num.intValue()));
        }
        map.put("time_elapsed_in_room", String.valueOf(LJJJ.invoke().longValue()));
        map.put("sticker_use_time", String.valueOf(LJJJI.invoke().longValue()));
        if (z) {
            strValueOf = String.valueOf(((Number) LJJJJ.invoke()).floatValue());
        } else {
            strValueOf = String.valueOf(LJJJIL.invoke().longValue());
        }
        map.put("effect_use_time", strValueOf);
        Function0<Long> function0 = LJJJJI;
        if (function0 != null) {
            lInvoke = function0.invoke();
        } else {
            lInvoke = null;
        }
        map.put("voice_use_time", String.valueOf(lInvoke));
        Function0<Float> function02 = LJJJJL;
        if (function02 != null) {
            fInvoke = function02.invoke();
        } else {
            fInvoke = null;
        }
        map.put("filter_level", String.valueOf(fInvoke));
        try {
            Function0<String> function03 = LJJJJLI;
            if (function03 != null) {
                strInvoke = function03.invoke();
            } else {
                strInvoke = null;
            }
            String strValueOf2 = String.valueOf(strInvoke);
            if (!TextUtils.isEmpty(strValueOf2)) {
                JSONObject jSONObject = new JSONObject(strValueOf2);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    ((ArrayList) LJIILJJIL).add(next);
                    LJIIL.put(next, jSONObject.get(next).toString());
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Map<String, String> map2 = LJIIL;
        Function0<Long> function04 = LJJJJIZL;
        if (function04 != null) {
            lInvoke2 = function04.invoke();
        } else {
            lInvoke2 = null;
        }
        map2.put("filter_use_time", String.valueOf(lInvoke2));
        map2.put("background_use_time", String.valueOf(((Number) LJJIIJZLJL.invoke()).longValue()));
        Function0<Integer> function05 = LJJJJJ;
        if (function05 != null) {
            numInvoke = function05.invoke();
        } else {
            numInvoke = null;
        }
        map2.put("ttnet_network_status", String.valueOf(numInvoke));
        Function0<Integer> function06 = LJJJJJL;
        if (function06 != null) {
            numInvoke2 = function06.invoke();
        }
        map2.put("ttls_network_status", String.valueOf(numInvoke2));
        if (LJJJLL) {
            str = "Paused";
        } else {
            str = "Normal";
        }
        map2.put("live_state", str);
        if (!CameraModeFixSetting.INSTANCE.getValue()) {
            map2.put("camera_mode", String.valueOf(LJJJLZIJ));
        }
        if (TTLHGLVersionReportSettings.INSTANCE.value()) {
            map2.put("gl_version", String.valueOf(GLThreadManager.getConfigGLVersion()));
        }
    }

    public static void LJJJI(boolean z) {
        String str;
        Map<String, String> map = LJIIL;
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        map.put("use_background_music", str);
    }

    public static void LJJJIL(boolean z) {
        String str;
        Map<String, String> map = LJIIL;
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        map.put("use_draw_and_guess", str);
    }

    public static void LJJJJ(long j) {
        if (j == 0) {
            LJIIL.remove("video_gift_id");
            LJIIJ.remove("video_gift_id");
        } else {
            LJIIL.put("video_gift_id", String.valueOf(j));
            LJIIJ.put("video_gift_id", String.valueOf(j));
        }
    }

    public final void LJJIJLIJ(int i) {
        LJIIIZ.setValue(this, LIZIZ[0], Integer.valueOf(i));
    }

    public static void LJIIIZ(String str, JSONObject jSONObject) {
        String strOptString = jSONObject.optString(str, "-1");
        if (!Intrinsics.LJFF("-1", strOptString)) {
            LJIIL.put(str, strOptString);
        } else {
            LJIIL.remove(str);
        }
    }

    public static void LJIIJ(LiveEffect liveEffect, boolean z) {
        if (z) {
            Map<String, String> map = LJIIL;
            map.remove("effect_resource_grade");
            map.remove("effect_resource_relative_downgrade");
            ((ArrayList) LJI).remove(Long.valueOf(liveEffect.getEffectId()));
            ((ArrayList) LJII).remove(liveEffect.getResourceId());
            return;
        }
        Map<String, String> map2 = LJIIL;
        map2.put("effect_resource_grade", liveEffect.Wp());
        map2.put("effect_resource_relative_downgrade", String.valueOf(liveEffect.LJJJJ()));
        if (liveEffect.LJJJJ() >= 0) {
            return;
        }
        ((ArrayList) LJI).add(Long.valueOf(liveEffect.getEffectId()));
        ((ArrayList) LJII).add(liveEffect.getResourceId());
    }

    public static void LJIILIIL(List list, boolean z) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ModelInfo modelInfo = (ModelInfo) it2.next();
            arrayList.add(new Pair(modelInfo.getName(), Integer.valueOf(modelInfo.getType())));
        }
        LJIILJJIL(arrayList, z);
    }

    public static void LJIILJJIL(List list, boolean z) {
        if (z) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Pair pair = (Pair) it2.next();
                LJJIIZI.put((String) pair.getFirst(), (Integer) pair.getSecond());
            }
            return;
        }
        LJJIIZ.clear();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Pair pair2 = (Pair) it3.next();
            LJJIIZ.put((String) pair2.getFirst(), (Integer) pair2.getSecond());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0c57 A[Catch: all -> 0x0dff, TryCatch #18 {all -> 0x0dff, blocks: (B:15:0x0021, B:18:0x021d, B:20:0x0280, B:21:0x029f, B:23:0x02ad, B:24:0x02bc, B:26:0x02c6, B:38:0x0358, B:44:0x03d7, B:37:0x034e, B:45:0x03e1, B:47:0x03e9, B:50:0x040c, B:51:0x0416, B:53:0x041e, B:57:0x0484, B:58:0x048e, B:60:0x0496, B:61:0x04a5, B:63:0x04ad, B:64:0x04bc, B:66:0x04c4, B:67:0x04d3, B:69:0x04db, B:70:0x04ea, B:72:0x04f2, B:73:0x0501, B:75:0x0509, B:76:0x0518, B:78:0x0520, B:79:0x052f, B:81:0x0537, B:82:0x0546, B:84:0x054e, B:85:0x055d, B:86:0x0579, B:88:0x057f, B:90:0x058b, B:112:0x060a, B:116:0x06eb, B:118:0x06f1, B:119:0x06f6, B:191:0x0b8a, B:193:0x0bac, B:194:0x0bbb, B:209:0x0c45, B:210:0x0c4f, B:212:0x0c57, B:216:0x0c63, B:218:0x0c77, B:217:0x0c6d, B:219:0x0c80, B:221:0x0c88, B:241:0x0dbc, B:243:0x0dc9, B:245:0x0dd7, B:246:0x0de8, B:248:0x0df6, B:240:0x0db2, B:237:0x0d8e, B:234:0x0d4c, B:190:0x0b87, B:182:0x0b1b, B:176:0x0aad, B:154:0x095c, B:148:0x0921, B:115:0x06e1, B:91:0x0595, B:93:0x059f, B:94:0x05a5, B:96:0x05af, B:97:0x05b5, B:99:0x05bf, B:100:0x05c6, B:102:0x05d0, B:103:0x05d7, B:105:0x05e1, B:106:0x05e8, B:108:0x05f2, B:109:0x05f9, B:111:0x0603, B:27:0x02d2, B:120:0x06f8, B:122:0x0706, B:123:0x07ab, B:125:0x07b3, B:127:0x07bb, B:128:0x07c4, B:130:0x07f0, B:132:0x0803, B:134:0x080f, B:136:0x0828, B:141:0x0833, B:142:0x08d1, B:144:0x08dd, B:145:0x0911, B:146:0x091a, B:113:0x06d7, B:55:0x0426, B:183:0x0b25, B:185:0x0b6a, B:186:0x0b74, B:188:0x0b7c, B:222:0x0d1a, B:224:0x0d26, B:226:0x0d33, B:227:0x0d3a, B:229:0x0d3e, B:230:0x0d41, B:231:0x0d43, B:48:0x03f4, B:155:0x0966, B:157:0x0994, B:159:0x09a2, B:167:0x0a44, B:160:0x09ea, B:162:0x09f8, B:164:0x0a29, B:166:0x0a34, B:170:0x0a80, B:174:0x0aa6, B:173:0x0a9e, B:171:0x0a89, B:172:0x0a92, B:235:0x0d56, B:28:0x02fe, B:35:0x0349, B:34:0x033f, B:29:0x0309, B:31:0x031a, B:32:0x0338, B:238:0x0d98, B:39:0x0363, B:41:0x0386, B:42:0x03d0, B:177:0x0ab7, B:179:0x0abf, B:180:0x0aec, B:149:0x092b, B:151:0x0937, B:152:0x093b), top: B:292:0x0021, inners: #0, #1, #4, #7, #8, #9, #10, #11, #12, #13, #14, #15, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0c88 A[Catch: all -> 0x0dff, TRY_LEAVE, TryCatch #18 {all -> 0x0dff, blocks: (B:15:0x0021, B:18:0x021d, B:20:0x0280, B:21:0x029f, B:23:0x02ad, B:24:0x02bc, B:26:0x02c6, B:38:0x0358, B:44:0x03d7, B:37:0x034e, B:45:0x03e1, B:47:0x03e9, B:50:0x040c, B:51:0x0416, B:53:0x041e, B:57:0x0484, B:58:0x048e, B:60:0x0496, B:61:0x04a5, B:63:0x04ad, B:64:0x04bc, B:66:0x04c4, B:67:0x04d3, B:69:0x04db, B:70:0x04ea, B:72:0x04f2, B:73:0x0501, B:75:0x0509, B:76:0x0518, B:78:0x0520, B:79:0x052f, B:81:0x0537, B:82:0x0546, B:84:0x054e, B:85:0x055d, B:86:0x0579, B:88:0x057f, B:90:0x058b, B:112:0x060a, B:116:0x06eb, B:118:0x06f1, B:119:0x06f6, B:191:0x0b8a, B:193:0x0bac, B:194:0x0bbb, B:209:0x0c45, B:210:0x0c4f, B:212:0x0c57, B:216:0x0c63, B:218:0x0c77, B:217:0x0c6d, B:219:0x0c80, B:221:0x0c88, B:241:0x0dbc, B:243:0x0dc9, B:245:0x0dd7, B:246:0x0de8, B:248:0x0df6, B:240:0x0db2, B:237:0x0d8e, B:234:0x0d4c, B:190:0x0b87, B:182:0x0b1b, B:176:0x0aad, B:154:0x095c, B:148:0x0921, B:115:0x06e1, B:91:0x0595, B:93:0x059f, B:94:0x05a5, B:96:0x05af, B:97:0x05b5, B:99:0x05bf, B:100:0x05c6, B:102:0x05d0, B:103:0x05d7, B:105:0x05e1, B:106:0x05e8, B:108:0x05f2, B:109:0x05f9, B:111:0x0603, B:27:0x02d2, B:120:0x06f8, B:122:0x0706, B:123:0x07ab, B:125:0x07b3, B:127:0x07bb, B:128:0x07c4, B:130:0x07f0, B:132:0x0803, B:134:0x080f, B:136:0x0828, B:141:0x0833, B:142:0x08d1, B:144:0x08dd, B:145:0x0911, B:146:0x091a, B:113:0x06d7, B:55:0x0426, B:183:0x0b25, B:185:0x0b6a, B:186:0x0b74, B:188:0x0b7c, B:222:0x0d1a, B:224:0x0d26, B:226:0x0d33, B:227:0x0d3a, B:229:0x0d3e, B:230:0x0d41, B:231:0x0d43, B:48:0x03f4, B:155:0x0966, B:157:0x0994, B:159:0x09a2, B:167:0x0a44, B:160:0x09ea, B:162:0x09f8, B:164:0x0a29, B:166:0x0a34, B:170:0x0a80, B:174:0x0aa6, B:173:0x0a9e, B:171:0x0a89, B:172:0x0a92, B:235:0x0d56, B:28:0x02fe, B:35:0x0349, B:34:0x033f, B:29:0x0309, B:31:0x031a, B:32:0x0338, B:238:0x0d98, B:39:0x0363, B:41:0x0386, B:42:0x03d0, B:177:0x0ab7, B:179:0x0abf, B:180:0x0aec, B:149:0x092b, B:151:0x0937, B:152:0x093b), top: B:292:0x0021, inners: #0, #1, #4, #7, #8, #9, #10, #11, #12, #13, #14, #15, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0d26 A[Catch: all -> 0x0d4b, TryCatch #8 {all -> 0x0d4b, blocks: (B:222:0x0d1a, B:224:0x0d26, B:226:0x0d33, B:227:0x0d3a, B:229:0x0d3e, B:230:0x0d41, B:231:0x0d43), top: B:272:0x0d1a, outer: #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0df6 A[Catch: all -> 0x0dff, TRY_LEAVE, TryCatch #18 {all -> 0x0dff, blocks: (B:15:0x0021, B:18:0x021d, B:20:0x0280, B:21:0x029f, B:23:0x02ad, B:24:0x02bc, B:26:0x02c6, B:38:0x0358, B:44:0x03d7, B:37:0x034e, B:45:0x03e1, B:47:0x03e9, B:50:0x040c, B:51:0x0416, B:53:0x041e, B:57:0x0484, B:58:0x048e, B:60:0x0496, B:61:0x04a5, B:63:0x04ad, B:64:0x04bc, B:66:0x04c4, B:67:0x04d3, B:69:0x04db, B:70:0x04ea, B:72:0x04f2, B:73:0x0501, B:75:0x0509, B:76:0x0518, B:78:0x0520, B:79:0x052f, B:81:0x0537, B:82:0x0546, B:84:0x054e, B:85:0x055d, B:86:0x0579, B:88:0x057f, B:90:0x058b, B:112:0x060a, B:116:0x06eb, B:118:0x06f1, B:119:0x06f6, B:191:0x0b8a, B:193:0x0bac, B:194:0x0bbb, B:209:0x0c45, B:210:0x0c4f, B:212:0x0c57, B:216:0x0c63, B:218:0x0c77, B:217:0x0c6d, B:219:0x0c80, B:221:0x0c88, B:241:0x0dbc, B:243:0x0dc9, B:245:0x0dd7, B:246:0x0de8, B:248:0x0df6, B:240:0x0db2, B:237:0x0d8e, B:234:0x0d4c, B:190:0x0b87, B:182:0x0b1b, B:176:0x0aad, B:154:0x095c, B:148:0x0921, B:115:0x06e1, B:91:0x0595, B:93:0x059f, B:94:0x05a5, B:96:0x05af, B:97:0x05b5, B:99:0x05bf, B:100:0x05c6, B:102:0x05d0, B:103:0x05d7, B:105:0x05e1, B:106:0x05e8, B:108:0x05f2, B:109:0x05f9, B:111:0x0603, B:27:0x02d2, B:120:0x06f8, B:122:0x0706, B:123:0x07ab, B:125:0x07b3, B:127:0x07bb, B:128:0x07c4, B:130:0x07f0, B:132:0x0803, B:134:0x080f, B:136:0x0828, B:141:0x0833, B:142:0x08d1, B:144:0x08dd, B:145:0x0911, B:146:0x091a, B:113:0x06d7, B:55:0x0426, B:183:0x0b25, B:185:0x0b6a, B:186:0x0b74, B:188:0x0b7c, B:222:0x0d1a, B:224:0x0d26, B:226:0x0d33, B:227:0x0d3a, B:229:0x0d3e, B:230:0x0d41, B:231:0x0d43, B:48:0x03f4, B:155:0x0966, B:157:0x0994, B:159:0x09a2, B:167:0x0a44, B:160:0x09ea, B:162:0x09f8, B:164:0x0a29, B:166:0x0a34, B:170:0x0a80, B:174:0x0aa6, B:173:0x0a9e, B:171:0x0a89, B:172:0x0a92, B:235:0x0d56, B:28:0x02fe, B:35:0x0349, B:34:0x033f, B:29:0x0309, B:31:0x031a, B:32:0x0338, B:238:0x0d98, B:39:0x0363, B:41:0x0386, B:42:0x03d0, B:177:0x0ab7, B:179:0x0abf, B:180:0x0aec, B:149:0x092b, B:151:0x0937, B:152:0x093b), top: B:292:0x0021, inners: #0, #1, #4, #7, #8, #9, #10, #11, #12, #13, #14, #15, #16 }] */
    /* JADX WARN: Type inference failed for: r3v290, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIIZ(org.json.JSONObject r15, X.InterfaceC1276870jKf r16) {
        /*
            Method dump skipped, instruction units count: 3595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1276840jKc.LJJIIZ(org.json.JSONObject, X.0jKf):void");
    }

    public static void LJJIJIL(JSONArray jSONArray, InterfaceC1276870jKf interfaceC1276870jKf, Map map) {
        ((ArrayList) LJIJJ).clear();
        ((ArrayList) LJIJJLI).clear();
        ((ArrayList) LJJIFFI).clear();
        ((ArrayList) LJJII).clear();
        ((ArrayList) LJIL).clear();
        ((ArrayList) LJJ).clear();
        ((ArrayList) LJJI).clear();
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        for (int i = 0; i < length; i++) {
            arrayList.add(null);
        }
        for (int i2 = 0; i2 < length; i2++) {
            int iLIZ = interfaceC1276870jKf.LIZ(JSONArrayProtectorUtils.getJSONObject(jSONArray, i2).optString("user_id", ""));
            if (iLIZ == -1) {
                ListProtector.set(arrayList, i2, JSONArrayProtectorUtils.getJSONObject(jSONArray, i2));
            } else if (iLIZ < arrayList.size()) {
                ListProtector.set(arrayList, iLIZ, JSONArrayProtectorUtils.getJSONObject(jSONArray, i2));
            }
        }
        int i3 = length + 1;
        for (int i4 = 0; i4 < i3; i4++) {
            JSONObject jSONObject = (JSONObject) ListProtector.get(arrayList, i4);
            if (jSONObject != null) {
                ((ArrayList) LJIJJ).add(Double.valueOf(jSONObject.optDouble("recv_vdecode_fps", -1.0d)));
                ((ArrayList) LJIJJLI).add(Double.valueOf(jSONObject.optDouble("recv_vrender_fps", -1.0d)));
                ((ArrayList) LJIL).add(Integer.valueOf(jSONObject.optInt("recv_video_width", -1)));
                ((ArrayList) LJJ).add(Integer.valueOf(jSONObject.optInt("recv_video_height", -1)));
                ((ArrayList) LJJIFFI).add(Integer.valueOf(jSONObject.optInt("remote_is_hw", -1)));
                ((ArrayList) LJJII).add(Integer.valueOf(jSONObject.optInt("remote_codec_type", -1)));
                ((ArrayList) LJJI).add(jSONObject.optString("user_id", "-1"));
            }
        }
        map.put("remote_decode_fps", LJIJJ.toString());
        map.put("remote_render_fps", LJIJJLI.toString());
        map.put("remote_resolution_width", LJIL.toString());
        map.put("remote_resolution_height", LJJ.toString());
        map.put("remote_linkmic_id", LJJI.toString());
        map.put("remote_is_hw", LJJIFFI.toString());
        map.put("remote_codec_type", LJJII.toString());
    }
}
