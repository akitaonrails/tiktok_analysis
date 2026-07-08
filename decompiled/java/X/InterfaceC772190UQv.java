package X;

import com.bytedance.android.livesdk.model.LiveBroadcastBlackScreenModel;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0UQv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC772190UQv {
    public static final C20337914i1<Boolean> A3;
    public static final C20337914i1<Boolean> B3;
    public static final C0JT6<String> C3;
    public static final C0JT6<String> D3;
    public static final C0JT6<Boolean> E3;
    public static final C0JT6<Boolean> F3;
    public static final C0JT6<Boolean> G3;
    public static final C0JT6<Double> H3;
    public static final C0JT6<String> I3;
    public static final C0JT6<String> J3;
    public static final C0JT6<String> K3;
    public static final C20337914i1<Long> L3;
    public static final C20337914i1<Map<Long, Integer>> M3;
    public static final C20337914i1<Boolean> N3;
    public static final C0JT6<Boolean> O3;
    public static final C20337914i1<Long> P3;
    public static final C20337914i1<Long> Q3;
    public static final C20337914i1<String> R3;
    public static final C20337914i1<Integer> S3;
    public static final C20337914i1<String> T3;
    public static final C20337914i1<Long> U3;
    public static final C20337914i1<n> V3;
    public static final C20337914i1<n> W3;
    public static final C20337914i1<Integer> X3;
    public static final C20337914i1<Integer> Y3;
    public static final C20337914i1<Boolean> Z2;
    public static final C20337914i1<Set<String>> Z3;

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    public static final C20337914i1<String> f125a3;
    public static final C20337914i1<Long> a4;
    public static final C20337914i1<String> b3;
    public static final C20337914i1<Boolean> b4;
    public static final C20337914i1<Integer> c3;
    public static final C20337914i1<List<Integer>> c4;
    public static final C20337914i1<String> d3;
    public static final C20337914i1<List<String>> d4;
    public static final C20337914i1<Long> e3;
    public static final C20337914i1<Boolean> e4;
    public static final C20337914i1<Long> f3;
    public static final C20337914i1<Boolean> f4;
    public static final C20337914i1<Long> g3;
    public static final C20337914i1<Integer> g4;
    public static final C20337914i1<Long> h3;
    public static final C20337914i1<Boolean> h4;
    public static final C20337914i1<Map<String, String>> i3;
    public static final C0JT6<Long> i4;
    public static final C20337914i1<LiveBroadcastBlackScreenModel> j3;
    public static final C20337914i1<Integer> j4;
    public static final C20337914i1<Boolean> k3;
    public static final C20337914i1<String> k4;
    public static final C20337914i1<Boolean> l3;
    public static final C20337914i1<Long> l4;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public static final C20337914i1<Boolean> f126m3;
    public static final C20337914i1<Integer> m4;
    public static final C20337914i1<Boolean> n3;
    public static final C20337914i1<String> n4;
    public static final C20337914i1<Boolean> o3;
    public static final C0JT6<Integer> o4;
    public static final C20337914i1<Integer> p3;
    public static final C20337914i1<Boolean> q3;
    public static final C20337914i1<Boolean> r3;
    public static final C20337914i1<Boolean> s3;
    public static final C20337914i1<Boolean> t3;
    public static final C20337914i1<Boolean> u3;
    public static final C20337914i1<Integer> v3;
    public static final C20337914i1<String> w3;
    public static final C20337914i1<Boolean> x3;
    public static final C20337914i1<Long> y3;
    public static final C20337914i1<long[]> z3;
    public static final C20337914i1<String> W2 = new C20337914i1<>("live_host_multi_tab_page_default_tab_tag", String.class, "");
    public static final C0JT6<Boolean> X2 = new C0JT6<>("live_host_professional_tag", Boolean.class);
    public static final C0JT6<Float> Y2 = new C0JT6<>("live_host_adapt_ttlh_resolution_ratio", Float.class);

    static {
        Boolean bool = Boolean.FALSE;
        Z2 = new C20337914i1<>("live_host_need_locate_live_center", Boolean.class, bool);
        f125a3 = new C20337914i1<>("live_host_mock_room_id", String.class, "");
        b3 = new C20337914i1<>("live_host_mock_anchor_id", String.class, "");
        c3 = new C20337914i1<>("live_camera_type", Integer.class, 1);
        d3 = new C20337914i1<>("live_resource_current_version", String.class, "");
        e3 = new C20337914i1<>("current_room_id", Long.class, 0L);
        f3 = new C20337914i1<>("current_room_start_time", Long.class, 0L);
        g3 = new C20337914i1<>("recent_go_live_start_time", Long.class, 0L);
        h3 = new C20337914i1<>("live_stream_video_capture_last_time", Long.class, 0L);
        i3 = new C20337914i1<>("live_start_live_tag", new TypeToken<Map<String, String>>() { // from class: X.0UQx
        }.getType(), new HashMap());
        j3 = new C20337914i1<>("live_broadcast_black_screen_model", LiveBroadcastBlackScreenModel.class, new LiveBroadcastBlackScreenModel());
        Boolean bool2 = Boolean.TRUE;
        k3 = new C20337914i1<>("show_preview_live_center_bubble", Boolean.class, bool2);
        l3 = new C20337914i1<>("show_pause_live_tip", Boolean.class, bool2);
        f126m3 = new C20337914i1<>("live_center_lottie_guide_animation", Boolean.class, bool2);
        n3 = new C20337914i1<>("live_center_lottie_guide_right_animation", Boolean.class, bool2);
        o3 = new C20337914i1<>("live_extended_screen_close_guide", Boolean.class, bool2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId());
        sbLIZ.append("_extend_public_screen_guide_time");
        p3 = new C20337914i1<>(C2188811AlT.LIZIZ(sbLIZ), Integer.class, 0);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId());
        sbLIZ2.append("_extended_marked_viewer_guide");
        q3 = new C20337914i1<>(C2188811AlT.LIZIZ(sbLIZ2), Boolean.class, bool2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId());
        sbLIZ3.append("live_extended_screen_companion_ability_guide");
        r3 = new C20337914i1<>(C2188811AlT.LIZIZ(sbLIZ3), Boolean.class, bool2);
        s3 = new C20337914i1<>("live_intro_broadcast_setting_entrance", Boolean.class, bool2);
        t3 = new C20337914i1<>("live_reverse_camera_red_dot", Boolean.class, bool2);
        u3 = new C20337914i1<>("live_reverse_mirror_red_dot", Boolean.class, bool2);
        v3 = new C20337914i1<>("live_center_has_violation", Integer.class, -1);
        new C20337914i1("live_hashtag_region", String.class, "");
        new C20337914i1("live_hashtag_language", String.class, "");
        w3 = new C20337914i1<>("live_hashtag_last_request_time", String.class, "");
        x3 = new C20337914i1<>("live_center_promote_on_preview", Boolean.class, bool);
        y3 = new C20337914i1<>("live_center_promote_on_preview_time_point", Long.class, 0L);
        z3 = new C20337914i1<>("live_center_promote_show_time_array", new TypeToken<long[]>() { // from class: X.0UR1
        }.getType(), new long[]{0, 0, 0});
        A3 = new C20337914i1<>("live_preview_focus_guide_anim", Boolean.class, bool);
        B3 = new C20337914i1<>("live_center_red_dot_show", Boolean.class, bool);
        C3 = new C0JT6<>("last_show_banner_timestamp", String.class);
        D3 = new C0JT6<>("show_banner_number", String.class);
        E3 = new C0JT6<>("growth_mvp_first_banner_clicked", Boolean.class);
        F3 = new C0JT6<>("growth_mvp_instance_banner_showed", Boolean.class);
        G3 = new C0JT6<>("growth_mvp_special_banner_showed", Boolean.class);
        H3 = new C0JT6<>("growth_mvp_banner_show_count", Double.class);
        I3 = new C0JT6<>("growth_mvp_first_banner_key", String.class);
        J3 = new C0JT6<>("growth_mvp_instance_banner_key", String.class);
        K3 = new C0JT6<>("growth_mvp_special_banner_key", String.class);
        L3 = new C20337914i1<>("access_recall_mute_end_time", Long.class, -1L);
        M3 = new C20337914i1<>("live_center_daily_challenges_season_cnt", new TypeToken<HashMap<Long, Integer>>() { // from class: X.0164
        }.getType(), new HashMap());
        N3 = new C20337914i1<>("show_room_debug_info", Boolean.class, bool);
        O3 = new C0JT6<>("live_host_ai_generated_toggle_status", Boolean.class);
        P3 = new C20337914i1<>("last_go_live_duration", Long.class, 0L);
        Q3 = new C20337914i1<>("last_go_live_room_id", Long.class, 0L);
        R3 = new C20337914i1<>("last_go_live_room_type", String.class, "");
        S3 = new C20337914i1<>("last_go_live_pid", Integer.class, 0);
        T3 = new C20337914i1<>("bg_governor_last_stage", String.class, "");
        U3 = new C20337914i1<>("bg_governor_duration_ms", Long.class, 0L);
        V3 = new C20337914i1<>("live_goal_info", n.class, new n());
        W3 = new C20337914i1<>("live_goal_log_params", n.class, new n());
        X3 = new C20337914i1<>("live_goal_effect_position", Integer.class, 0);
        Y3 = new C20337914i1<>("live_goal_effect_first_use", Integer.class, 0);
        Z3 = new C20337914i1<>("live_goal_highlight_effect_shown", new TypeToken<HashSet<String>>() { // from class: X.0UQy
        }.getType(), new HashSet());
        a4 = new C20337914i1<>("live_goal_highlight_effect_shown_timestamp", Long.class, 0L);
        b4 = new C20337914i1<>("live_broadcast_board_ai_summary_tooltips_show", Boolean.class, bool);
        c4 = new C20337914i1<>("live_broadcast_multi_guest_setting_show", new TypeToken<ArrayList<Integer>>() { // from class: X.0UQz
        }.getType(), new ArrayList());
        d4 = new C20337914i1<>("live_ai_summary_used_cell_item_id_list", new TypeToken<ArrayList<String>>() { // from class: X.0UR0
        }.getType(), new ArrayList());
        e4 = new C20337914i1<>("live_ai_beauty_permission_granted", Boolean.class, bool);
        f4 = new C20337914i1<>("live_ai_beauty_setting_cache", Boolean.class, bool);
        new C20337914i1("live_center_mock_punish", Boolean.class, bool);
        g4 = new C20337914i1<>("live_center_top_notice_snap_position", Integer.class, -1);
        h4 = new C20337914i1<>("live_center_top_notice_tips", Boolean.class, bool);
        i4 = new C0JT6<>("live_podcast_permissions_get_timestamp", Long.class);
        j4 = new C20337914i1<>("live_stable_mode_switch_status", Integer.class, -1);
        k4 = new C20337914i1<>("live_stable_mode_toast_date", String.class, "");
        l4 = new C20337914i1<>("live_stable_mode_toast_time", Long.class, 0L);
        m4 = new C20337914i1<>("live_stable_mode_toast_count", Integer.class, 0);
        n4 = new C20337914i1<>("live_center_schema_cache", String.class, "");
        o4 = new C0JT6<>("live_host_final_anchor_type", Integer.class);
    }
}
