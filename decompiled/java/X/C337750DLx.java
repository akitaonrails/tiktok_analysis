package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0DLx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C337750DLx {
    public static final C337750DLx LJ = new C337750DLx();
    public final HashMap<String, String> LIZ;
    public final HashMap<String, String> LIZIZ;
    public final HashMap<String, String> LIZJ;
    public List<C308310C6r> LIZLLL;

    public C337750DLx() {
        HashMap<String, String> map = new HashMap<>();
        this.LIZ = map;
        HashMap<String, String> map2 = new HashMap<>();
        this.LIZIZ = map2;
        HashMap<String, String> map3 = new HashMap<>();
        this.LIZJ = map3;
        this.LIZLLL = new ArrayList();
        map.put("executor_thread_pool_capacity", "1");
        map.put("enable_report_service_v2", "true");
        map.put("remove_redundant_parameters", "true");
        map.put("enable_events_converge", "true");
        map.put("enable_anti_lost_write_last", "true");
        map.put("disable_unlimited_request_response", "true");
        map.put("enable_merge_oneplay", "true");
        map.put("should_use_play_session_id_v2", "true");
        map.put("enable_merge_same_playsessionevents", "false");
        map.put("enable_merge_oneplay_upload_null_session", "true");
        map.put("re_create_session_if_last_not_from_prerender", "true");
        map.put("report_last_oneplay", "true");
        map2.put("enable_precise_async_init", "true");
        map2.put("player_session_manager_clean_current_enable", "true");
        map2.put("player_option_gskey_bury_data_optimize_v2", "1");
        map2.put("bury_data_simplify", "true");
        map2.put("player_option_int_optimize_ex_log", "1");
        map2.put("enable_model_cache", "true");
        map3.put("enable_set_audio_device_type", "true");
        map3.put("audio_effect_type", "7");
        map3.put("audio_effect_type_config_json", "{\"content_type\": 0,\"env_type\": 0,\"large_spl_target_LU\": -16,\"limiter_peak\": -1,\"max_block_size\": 2048,\"max_peak\": 2.8,\"medium_spl_target_LU\": -14,\"norm_peak\": 0,\"small_spl_target_LU\": -12,\"user_preference\": 0}");
        map3.put("enable_prepare_io", "true");
        map3.put("initial_save_url", "true");
        map3.put("golden_video_cache_limit_MB", "100");
        map3.put("fix_cold_playing_media_miss", "100");
        try {
            int i = 0;
            C308310C6r[] c308310C6rArr = {new C308310C6r(1801, 1, 1, 5), new C308310C6r(1802, 1, 1, 20), new C308310C6r(1803, 1, 1, 1), new C308310C6r(1806, 1, 1, 3), new C308310C6r(42112, 1, 3, 1), new C308310C6r(43301, 1, 3, 1), new C308310C6r(43303, 1, 3, 1), new C308310C6r(43304, 1, 3, 1), new C308310C6r(42721, 1, 3, 1), new C308310C6r(42703, 1, 3, 500), new C308310C6r(42126, 1, 3, 1), new C308310C6r(43308, 1, 3, 20), new C308310C6r(43314, 1, 3, 1), new C308310C6r(42131, 1, 3, 1), new C308310C6r(43321, 1, 3, 11), new C308310C6r(42700, 1, 3, 1), new C308310C6r(42702, 1, 3, 1), new C308310C6r(42911, 1, 3, 1), new C308310C6r(42902, 1, 3, -1), new C308310C6r(42903, 1, 3, 1), new C308310C6r(42904, 1, 3, 140), new C308310C6r(42905, 1, 3, 10000), new C308310C6r(42906, 1, 3, 15000), new C308310C6r(42907, 1, 3, 3), new C308310C6r(42908, 1, 3, 25), new C308310C6r(42909, 1, 3, 1), new C308310C6r(42910, 1, 3, 1), new C308310C6r(42912, 1, 3, 1), new C308310C6r(42913, 1, 3, 1), new C308310C6r(42935, 1, 3, 1), new C308310C6r(42962, 1, 3, 1), new C308310C6r(42327, 1, 3, 3), new C308310C6r(42947, 1, 3, -1), new C308310C6r(581, 1, 3, 1), new C308310C6r(42411, 1, 3, 3), new C308310C6r(42941, 1, 3, 26), new C308310C6r(42942, 1, 3, 2), new C308310C6r(42943, 1, 3, 20), new C308310C6r(42944, 1, 3, 4), new C308310C6r(42413, 1, 3, 1), new C308310C6r(591, 1, 3, 1), new C308310C6r(4017, 1, 3, 1), new C308310C6r(4018, 1, 3, 1), new C308310C6r(42033, 1, 3, 1), new C308310C6r(42045, 1, 3, 1), new C308310C6r(42054, 1, 3, 1), new C308310C6r(42070, 1, 3, 10), new C308310C6r(42079, 1, 3, 10), new C308310C6r(1214, 1, 3, 1), new C308310C6r(483, 1, 3, 2), new C308310C6r(42932, 1, 3, 1), new C308310C6r(42933, 1, 3, 8), new C308310C6r(42925, 1, 3, 8), new C308310C6r(42945, 1, 3, -1), new C308310C6r(42957, 1, 3, 1), new C308310C6r(55005, 1, 1, 1), new C308310C6r(43200, 1, 3, 1), new C308310C6r(43201, 1, 3, 100), new C308310C6r(43202, 1, 3, 90), new C308310C6r(43203, 1, 3, 999), new C308310C6r(43019, 1, 3, 1), new C308310C6r(43000, 1, 3, 1), new C308310C6r(43208, 1, 3, 0), new C308310C6r(60003, 1, 1, 1), new C308310C6r(56007, 1, 1, 1), new C308310C6r(60005, 5, 1, new JSONObject("{\"voice_enhance\":[10017,10019,10092,10096],\"quality\":[10001,10003,10080,10035,10036,10033,10011,10020,10021,10044,10050,10037,10027,10090,10074,10087,10082]}")), new C308310C6r(329, 1, 3, 1), new C308310C6r(42043, 1, 3, 10000), new C308310C6r(42124, 1, 3, 1), new C308310C6r(42125, 1, 3, 15), new C308310C6r(42137, 1, 3, 1), new C308310C6r(42967, 1, 3, 1), new C308310C6r(43317, 1, 3, 1), new C308310C6r(43212, 1, 3, 1), new C308310C6r(42924, 1, 3, 1), new C308310C6r(585, 1, 3, 1), new C308310C6r(4023, 1, 3, 1), new C308310C6r(953, 1, 3, 1), new C308310C6r(994, 1, 3, 1), new C308310C6r(1123, 1, 3, 1), new C308310C6r(800, 1, 3, 1), new C308310C6r(1702, 1, 1, 1)};
            ArrayList arrayList = new ArrayList(82);
            do {
                C308310C6r c308310C6r = c308310C6rArr[i];
                Objects.requireNonNull(c308310C6r);
                arrayList.add(c308310C6r);
                i++;
            } while (i < 82);
            this.LIZLLL = Collections.unmodifiableList(arrayList);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }
}
