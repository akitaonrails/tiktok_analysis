package X;

import com.bytedance.android.livesdk.gift.model.CpcPromptResponse;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveNearbyLabelExperimentVersionSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TiktokLiveLocationBubbleSetting;
import com.bytedance.android.livesdk.model.DateFrequencyModel;
import com.bytedance.android.livesdk.model.LiveRedDotDebugConfig;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyRecord;
import com.bytedance.android.livesdkapi.depend.model.live.NotifyRecord;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import webcast.data.MultiGuestPlayInfo;

/* JADX INFO: renamed from: X.0et7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public interface InterfaceC1106030et7 extends InterfaceC772190UQv, InterfaceC766480U4w, InterfaceC465660INw, InterfaceC772390URp, C0UKZ, InterfaceC1833600xoc, C0JGR, InterfaceC960800b6s, InterfaceC934710aQn, InterfaceC1104970erP, InterfaceC980390bcT, InterfaceC1094160eZy, C0KPJ, InterfaceC1094280eaA, InterfaceC465670INx, InterfaceC772600USk, InterfaceC1093910eZZ, InterfaceC1093700eZE, C0U53 {
    public static final C20337914i1<Boolean> A4;
    public static final C20337914i1<Map<String, Double>> A5;
    public static final C0JT6<Boolean> A6;
    public static final C20337914i1<Integer> A7;
    public static final C20337914i1<Boolean> A8;
    public static final C20337914i1<Long> A9;
    public static final C20337914i1<Boolean> B4;
    public static final C20337914i1<Map<String, Double>> B5;
    public static final C0JT6<Boolean> B6;
    public static final C20337914i1<Integer> B7;
    public static final C0JT6<String> B8;
    public static final C20337914i1<Boolean> B9;
    public static final C20337914i1<Boolean> C4;
    public static final C0JT6<Map<String, Double>> C5;
    public static final C0JT6<Boolean> C6;
    public static final C20337914i1<Map<String, String>> C7;
    public static final C20337914i1<Boolean> C8;
    public static final C20337914i1<Boolean> C9;
    public static final C20337914i1<Map<String, Boolean>> D4;
    public static final C20337914i1<Map<Integer, MultiGuestPlayInfo.MultiGuestPlayConfig>> D5;
    public static final C20337914i1<Integer> D6;
    public static final C20337914i1<C08II<String, String>> D7;
    public static final C0JT6<Double> D8;
    public static final C20337914i1<Boolean> D9;
    public static final C20337914i1<Boolean> E4;
    public static final C0JT6<Map<String, Boolean>> E5;
    public static final C20337914i1<Integer> E6;
    public static final C20337914i1<Map<String, List<String>>> E7;
    public static final C0JT6<Double> E8;
    public static final C20337914i1<Boolean> E9;
    public static final C20337914i1<Boolean> F4;
    public static final C20337914i1<Boolean> F5;
    public static final C0JT6<List<String>> F6;
    public static final C0JT6<Boolean> F7;
    public static final C0JT6<Double> F8;
    public static final C20337914i1<Integer> F9;
    public static final C20337914i1<Integer> G4;
    public static final C20337914i1<Boolean> G5;
    public static final C0JT6<List<String>> G6;
    public static final C20337914i1<Long> G7;
    public static final C20337914i1<Boolean> G8;
    public static final C0JT6<Boolean> G9;
    public static final C20337914i1<Integer> H4;
    public static final C20337914i1<Boolean> H5;
    public static final C0JT6<List<String>> H6;
    public static final C0JT6<String> H7;
    public static final C20337914i1<Boolean> H8;
    public static final C0JT6<Boolean> H9;
    public static final C20337914i1<Integer> I4;
    public static final C20337914i1<Boolean> I5;
    public static final C0JT6<List<String>> I6;
    public static final C0JT6<Boolean> I7;
    public static final C20337914i1<Boolean> I8;
    public static final C20337914i1<Boolean> I9;
    public static final C20337914i1<Long> J4;
    public static final C20337914i1<Boolean> J5;
    public static final C0JT6<Double> J6;
    public static final C0JT6<Boolean> J7;
    public static final C20337914i1<Map<Long, Integer>> J8;
    public static final C20337914i1<Integer> J9;
    public static final C20337914i1<Integer> K4;
    public static final C20337914i1<Boolean> K5;
    public static final C20337914i1<Boolean> K6;
    public static final C0JT6<String> K7;
    public static final C0JT6<Boolean> K8;
    public static final C0JT6<List<String>> K9;
    public static final C20337914i1<Integer> L4;
    public static final C20337914i1<Boolean> L5;
    public static final C20337914i1<Boolean> L6;
    public static final C0JT6<String> L7;
    public static final C0JT6<Boolean> L8;
    public static final C0JT6<List<Long>> L9;
    public static final C20337914i1<Integer> M4;
    public static final C20337914i1<Boolean> M5;
    public static final C20337914i1<Boolean> M6;
    public static final C20337914i1<List<String>> M7;
    public static final C20337914i1<Boolean> M8;
    public static final C0JT6<Boolean> M9;
    public static final C20337914i1<Integer> N4;
    public static final C20337914i1<Boolean> N5;
    public static final C20337914i1<Boolean> N6;
    public static final C20337914i1<List<String>> N7;
    public static final C20337914i1<Boolean> N8;
    public static final C0JT6<Boolean> N9;
    public static final C20337914i1<LinkedHashMap<String, C973980bS8>> O4;
    public static final C20337914i1<Map<String, Map<String, Double>>> O5;
    public static final C20337914i1<Boolean> O6;
    public static final C20337914i1<Integer> O7;
    public static final C20337914i1<Map<String, Boolean>> O8;
    public static final C0JT6<Boolean> O9;
    public static final C20337914i1<Integer> P4;
    public static final C0JT6<Map<String, Long>> P5;
    public static final C20337914i1<Boolean> P6;
    public static final C0JT6<Boolean> P7;
    public static final C20337914i1<Map<String, Boolean>> P8;
    public static final C20337914i1<List<Long>> P9;
    public static final C20337914i1<Integer> Q4;
    public static final C20337914i1<Map<String, String>> Q5;
    public static final C20337914i1<ArrayList<String>> Q6;
    public static final C20337914i1<Boolean> Q7;
    public static final C20337914i1<Map<String, Integer>> Q8;
    public static final C20337914i1<Integer> Q9;
    public static final C20337914i1<Integer> R4;
    public static final C20337914i1<Long> R5;
    public static final C20337914i1<Boolean> R6;
    public static final C20337914i1<Integer> R7;
    public static final C0JT6<String> R8;
    public static final C20337914i1<Integer> R9;
    public static final C20337914i1<Integer> S4;
    public static final C0JT6<Boolean> S5;
    public static final C20337914i1<Boolean> S6;
    public static final C20337914i1<Integer> S7;
    public static final C0JT6<Boolean> S8;
    public static final C20337914i1<Boolean> S9;
    public static final C20337914i1<Integer> T4;
    public static final C0JT6<Double> T5;
    public static final C20337914i1<Map<String, String>> T6;
    public static final C20337914i1<Map<String, String>> T7;
    public static final C20337914i1<Boolean> T8;
    public static final C20337914i1<Boolean> T9;
    public static final C20337914i1<Integer> U4;
    public static final C0JT6<Double> U5;
    public static final C20337914i1<Set<String>> U6;
    public static final C20337914i1<Map<String, String>> U7;
    public static final C0JT6<String> U8;
    public static final C20337914i1<Map<Long, String>> U9;
    public static final C20337914i1<Boolean> V4;
    public static final C0JT6<Boolean> V5;
    public static final C20337914i1<Set<String>> V6;
    public static final C20337914i1<Map<String, String>> V7;
    public static final C0JT6<String> V8;
    public static final C20337914i1<List<String>> V9;
    public static final C0JT6<Boolean> W4;
    public static final C0JT6<Integer> W5;
    public static final C20337914i1<Map<String, String>> W6;
    public static final C20337914i1<DateFrequencyModel> W7;
    public static final C0JT6<Boolean> W8;
    public static final C20337914i1<Long> W9;
    public static final C20337914i1<Map<String, Boolean>> X4;
    public static final C0JT6<Integer> X5;
    public static final C20337914i1<Map<String, String>> X6;
    public static final C20337914i1<Map<String, Long>> X7;
    public static final C0JT6<Boolean> X8;
    public static final C20337914i1<Map<Long, Long>> X9;
    public static final C0JT6<Boolean> Y4;
    public static final C0JT6<Long> Y5;
    public static final C20337914i1<LiveRedDotDebugConfig> Y6;
    public static final C20337914i1<DateFrequencyModel> Y7;
    public static final C0JT6<Boolean> Y8;
    public static final C0JT6<Long> Y9;
    public static final C20337914i1<Boolean> Z4;
    public static final C0JT6<Boolean> Z5;
    public static final C20337914i1<String> Z6;
    public static final C0JT6<Map<String, String>> Z7;
    public static final C20337914i1<Boolean> Z8;
    public static final C0JT6<List<String>> Z9;
    public static final C20337914i1<Boolean> a5;
    public static final C0JT6<Long> a6;
    public static final C20337914i1<List<MsgNotifyRecord>> a7;
    public static final C0JT6<Boolean> a8;
    public static final C20337914i1<Boolean> a9;
    public static final C0JT6<Integer> aa;
    public static final C20337914i1<Long> b5;
    public static final C0JT6<Long> b6;
    public static final C20337914i1<List<NotifyRecord>> b7;
    public static final C0JT6<String> b8;
    public static final C20337914i1<Boolean> b9;
    public static final C0JT6<Integer> ba;
    public static final C20337914i1<Boolean> c5;
    public static final C0JT6<Long> c6;
    public static final C0JT6<Double> c7;
    public static final C0JT6<Boolean> c8;
    public static final C0JT6<Map<String, String>> c9;
    public static final C0JT6<Map<String, DateFrequencyModel>> ca;
    public static final C20337914i1<Boolean> d5;
    public static final C20337914i1<String> d6;
    public static final C0JT6<Boolean> d7;
    public static final C0JT6<Boolean> d8;
    public static final C0JT6<ArrayList<String>> d9;
    public static final C0JT6<Map<String, Long>> da;
    public static final C20337914i1<Boolean> e5;
    public static final C20337914i1<CpcPromptResponse> e6;
    public static final C20337914i1<Map<String, String>> e7;
    public static final C0JT6<Double> e8;
    public static final C0JT6<Map<String, String>> e9;
    public static final C0JT6<Map<String, DateFrequencyModel>> ea;
    public static final C20337914i1<Boolean> f5;
    public static final C0JT6<Boolean> f6;
    public static final C20337914i1<Long> f7;
    public static final C0JT6<Boolean> f8;
    public static final C0JT6<Map<String, String>> f9;
    public static final C0JT6<Map<String, Long>> fa;
    public static final C0JT6<Double> g5;
    public static final C20337914i1<Integer> g6;
    public static final C20337914i1<Boolean> g7;
    public static final C0JT6<Boolean> g8;
    public static final C20337914i1<Map<String, Boolean>> g9;
    public static final C0JT6<String> ga;
    public static final C0JT6<Double> h5;
    public static final C20337914i1<Boolean> h6;
    public static final C20337914i1<Boolean> h7;
    public static final C0JT6<Boolean> h8;
    public static final C20337914i1<Map<String, Boolean>> h9;
    public static final C0JT6<String> ha;
    public static final C0JT6<Double> i5;
    public static final C20337914i1<Boolean> i6;
    public static final C20337914i1<Boolean> i7;
    public static final C0JT6<Boolean> i8;
    public static final C20337914i1<Map<String, Boolean>> i9;
    public static final C0JT6<Integer> j5;
    public static final C20337914i1<Boolean> j6;
    public static final C20337914i1<Boolean> j7;
    public static final C0JT6<Boolean> j8;
    public static final C20337914i1<Map<String, Boolean>> j9;
    public static final C0JT6<Double> k5;
    public static final C20337914i1<Boolean> k6;
    public static final C20337914i1<Boolean> k7;
    public static final C0JT6<Boolean> k8;
    public static final C20337914i1<Map<String, Boolean>> k9;
    public static final C0JT6<Integer> l5;
    public static final C20337914i1<Boolean> l6;
    public static final C20337914i1<Boolean> l7;
    public static final C0JT6<Boolean> l8;
    public static final C0JT6<Boolean> l9;
    public static final C0JT6<Boolean> m5;
    public static final C20337914i1<Boolean> m6;
    public static final C20337914i1<Boolean> m7;
    public static final C0JT6<Boolean> m8;
    public static final C0JT6<Long> m9;
    public static final C20337914i1<Boolean> n5;
    public static final C20337914i1<Long> n6;
    public static final C20337914i1<String> n7;
    public static final C0JT6<Boolean> n8;
    public static final C20337914i1<String> n9;
    public static final C20337914i1<Boolean> o5;
    public static final C20337914i1<Long> o6;
    public static final C20337914i1<Integer> o7;
    public static final C0JT6<String> o8;
    public static final C20337914i1<Long> o9;
    public static final C20337914i1<Boolean> p4;
    public static final C20337914i1<Boolean> p5;
    public static final C20337914i1<Integer> p6;
    public static final C20337914i1<Float> p7;
    public static final C0JT6<List<String>> p8;
    public static final C0JT6<Boolean> p9;
    public static final C20337914i1<Integer> q4;
    public static final C20337914i1<String> q5;
    public static final C20337914i1<Long> q6;
    public static final C0JT6<String> q7;
    public static final C20337914i1<String> q8;
    public static final C0JT6<Integer> q9;
    public static final C20337914i1<Long> r4;
    public static final C20337914i1<String> r5;
    public static final C20337914i1<Boolean> r6;
    public static final C20337914i1<Map<String, String>> r7;
    public static final C20337914i1<HashMap<String, HashSet<String>>> r8;
    public static final C0JT6<Long> r9;
    public static final C0JT6<Boolean> s4;
    public static final C20337914i1<Boolean> s5;
    public static final C20337914i1<Boolean> s6;
    public static final C20337914i1<Map<String, String>> s7;
    public static final C20337914i1<Boolean> s8;
    public static final C20337914i1<Map<String, Boolean>> s9;
    public static final C0JT6<Boolean> t4;

    /* JADX INFO: renamed from: t5, reason: collision with root package name */
    public static final C20337914i1<Boolean> f144t5;
    public static final C20337914i1<Boolean> t6;
    public static final C20337914i1<Integer> t7;
    public static final C20337914i1<Boolean> t8;
    public static final C20337914i1<Boolean> t9;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    public static final C20337914i1<Boolean> f145u4;
    public static final C20337914i1<Boolean> u5;
    public static final C20337914i1<Boolean> u6;
    public static final C20337914i1<Long> u7;
    public static final C0JT6<Boolean> u8;
    public static final C20337914i1<Boolean> u9;
    public static final C20337914i1<Boolean> v4;
    public static final C20337914i1<Boolean> v5;
    public static final C20337914i1<Boolean> v6;

    /* JADX INFO: renamed from: v7, reason: collision with root package name */
    public static final C20337914i1<Boolean> f146v7;
    public static final C20337914i1<Boolean> v8;
    public static final C0JT6<Boolean> v9;
    public static final C0JT6<Boolean> w4;
    public static final C20337914i1<Integer> w5;
    public static final C20337914i1<Boolean> w6;
    public static final C20337914i1<Integer> w7;
    public static final C20337914i1<Boolean> w8;
    public static final C20337914i1<Boolean> w9;
    public static final C20337914i1<Integer> x4;
    public static final C20337914i1<Boolean> x5;
    public static final C20337914i1<Boolean> x6;
    public static final C20337914i1<Long> x7;
    public static final C0JT6<ArrayList<String>> x8;
    public static final C20337914i1<Boolean> x9;
    public static final C0JT6<Boolean> y4;
    public static final C20337914i1<Long> y5;
    public static final C20337914i1<Integer> y6;
    public static final C20337914i1<Boolean> y7;
    public static final C20337914i1<Boolean> y8;
    public static final C20337914i1<Long> y9;
    public static final C0JT6<Boolean> z4;
    public static final C20337914i1<Integer> z5;
    public static final C0JT6<Boolean> z6;
    public static final C20337914i1<HashSet<String>> z7;
    public static final C20337914i1<Boolean> z8;
    public static final C0JT6<Boolean> z9;

    static {
        Boolean bool = Boolean.TRUE;
        p4 = new C20337914i1<>("toplive_skylight_draw_guide", Boolean.class, bool);
        q4 = new C20337914i1<>("skylight_nearby_reject_location_times", Integer.class, 0);
        r4 = new C20337914i1<>("last_show_flare_animation_room_id", Long.class, 0L);
        s4 = new C0JT6<>("ecom_top_buyer_entrance_effect_shown", Boolean.class);
        t4 = new C0JT6<>("live_fixed_tag_guide_shown", Boolean.class);
        Boolean bool2 = Boolean.FALSE;
        new C20337914i1("has_slide_to_exit_room", Boolean.class, bool2);
        f145u4 = new C20337914i1<>("live_show_bc_toggle_dialog_before", Boolean.class, bool2);
        v4 = new C20337914i1<>("live_partnership_video_auto_play_mute", Boolean.class, bool);
        w4 = new C0JT6<>("live_partnership_drops_anchor_sign", Boolean.class);
        x4 = new C20337914i1<>("ttlive_game_drops_red_dot_update", Integer.class, -1);
        y4 = new C0JT6<>("live_multi_tier_shown", Boolean.class);
        z4 = new C0JT6<>("live_spotlight_guide_shown", Boolean.class);
        A4 = new C20337914i1<>("live_show_admin_setting_red_dot", Boolean.class, bool);
        B4 = new C20337914i1<>("live_show_comment_setting_red_dot", Boolean.class, bool);
        C4 = new C20337914i1<>("live_show_manage_temporary_mute_setting_red_dot", Boolean.class, bool);
        D4 = new C20337914i1<>("live_show_star_comment_setting_red_dot", new TypeToken<Map<String, Boolean>>() { // from class: X.00VC
        }.getType(), new HashMap());
        E4 = new C20337914i1<>("anchor_comments_enable", Boolean.class, bool);
        F4 = new C20337914i1<>("anchor_enigma_enable", Boolean.class, bool);
        G4 = new C20337914i1<>("match_icy_clash_guide_setting_show_count", Integer.class, 0);
        H4 = new C20337914i1<>("match_league_icy_guide_setting_show_count", Integer.class, 0);
        I4 = new C20337914i1<>("live_rank_entrance_split_guide_show_count", Integer.class, 0);
        J4 = new C20337914i1<>("live_rank_entrance_split_guide_show_timestamp", Long.class, 0L);
        K4 = new C20337914i1<>("match_icy_clash_guide_show_count", Integer.class, 0);
        L4 = new C20337914i1<>("match_ai_commentary_match_start_toast_show_count", Integer.class, 0);
        M4 = new C20337914i1<>("match_ai_commentary_share_data_off_alert_show_count", Integer.class, 0);
        N4 = new C20337914i1<>("match_ai_commentary_guide_show_count", Integer.class, 0);
        O4 = new C20337914i1<>("match_previous_mode_cache", new TypeToken<LinkedHashMap<String, C973980bS8>>() { // from class: X.0etA
        }.getType(), new LinkedHashMap());
        P4 = new C20337914i1<>("combined_match_panel_guide_show_count", Integer.class, 0);
        Q4 = new C20337914i1<>("live_catch_beans_mode_guide_show_count", Integer.class, 0);
        R4 = new C20337914i1<>("live_catch_beans_new_mode_bubble_shown", Integer.class, 0);
        S4 = new C20337914i1<>("live_catch_beans_choose_mode_new_tag_count", Integer.class, 0);
        T4 = new C20337914i1<>("live_catch_beans_new_mode_guide_show_count_invitee", Integer.class, 0);
        U4 = new C20337914i1<>("live_catch_beans_hand_guide_count", Integer.class, 0);
        V4 = new C20337914i1<>("link_catch_beans_open_gift_guide_not_show_again", Boolean.class, bool2);
        W4 = new C0JT6<>("pin_card_moderator_tool_tip_has_shown", Boolean.class);
        X4 = new C20337914i1<>("viewer_side_pin_card_moderator_tool_tip_has_shown", new TypeToken<HashMap<String, Boolean>>() { // from class: X.00VA
        }.getType(), new HashMap());
        Y4 = new C0JT6<>("pin_card_tool_tip_has_shown", Boolean.class);
        new C20337914i1("anchor_first_pin_question", Boolean.class, bool);
        Z4 = new C20337914i1<>("anchor_is_receive_linkmic_invitation_this_live", Boolean.class, bool);
        a5 = new C20337914i1<>("should_show_battle_rule_guide_message", Boolean.class, bool);
        b5 = new C20337914i1<>("mocked_live_show_id", Long.class, 0L);
        c5 = new C20337914i1<>("live_pip_switcher_open", Boolean.class, bool2);
        d5 = new C20337914i1<>("live_pip_guide_dialog_has_shown", Boolean.class, bool2);
        e5 = new C20337914i1<>("live_bg_audio_play_open", Boolean.class, bool);
        f5 = new C20337914i1<>("live_pip_ab_group_reported", Boolean.class, bool2);
        g5 = new C0JT6<>("live_pip_web_charge_guide_dialog_shown_times", Double.class);
        h5 = new C0JT6<>("live_pip_web_charge_guide_dialog_shown_time", Double.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("live_location_sub_switch_bubble_show_time_");
        sbLIZ.append(TiktokLiveLocationBubbleSetting.getValue().version);
        i5 = new C0JT6<>(C2188811AlT.LIZIZ(sbLIZ), Double.class);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("live_location_sub_switch_bubble_show_times_");
        sbLIZ2.append(TiktokLiveLocationBubbleSetting.getValue().version);
        j5 = new C0JT6<>(C2188811AlT.LIZIZ(sbLIZ2), Integer.class);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("live_location_sub_switch_red_dot_show_time_");
        sbLIZ3.append(TiktokLiveLocationBubbleSetting.getValue().version);
        k5 = new C0JT6<>(C2188811AlT.LIZIZ(sbLIZ3), Double.class);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("live_location_sub_switch_red_dot_show_times_");
        sbLIZ4.append(TiktokLiveLocationBubbleSetting.getValue().version);
        l5 = new C0JT6<>(C2188811AlT.LIZIZ(sbLIZ4), Integer.class);
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("live_location_sub_switch_can_show_");
        sbLIZ5.append(TiktokLiveLocationBubbleSetting.getValue().version);
        m5 = new C0JT6<>(C2188811AlT.LIZIZ(sbLIZ5), Boolean.class);
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId());
        sbLIZ6.append("live_mark_viewer_highlight");
        n5 = new C20337914i1<>(C2188811AlT.LIZIZ(sbLIZ6), Boolean.class, bool);
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId());
        sbLIZ7.append("live_mark_viewer_show_nation");
        o5 = new C20337914i1<>(C2188811AlT.LIZIZ(sbLIZ7), Boolean.class, bool);
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId());
        sbLIZ8.append("live_remove_marked_viewer_confirm");
        p5 = new C20337914i1<>(C2188811AlT.LIZIZ(sbLIZ8), Boolean.class, bool);
        q5 = new C20337914i1<>("voice_chat_hashtag_gs", String.class, "");
        r5 = new C20337914i1<>("voice_chat_game_tag_gs", String.class, "");
        s5 = new C20337914i1<>("live_show_preview_warning_tip", Boolean.class, bool);
        f144t5 = new C20337914i1<>("first_time_show_max_moderator_num_change_dialog", Boolean.class, bool);
        u5 = new C20337914i1<>("first_time_add_moderator_exceed_limitation_dialog", Boolean.class, bool);
        v5 = new C20337914i1<>("first_time_apply_bluetooth_permission_in_interceptor", Boolean.class, bool);
        w5 = new C20337914i1<>("bluetooth_permission_hint_dialog_shown_times_in_interceptor", Integer.class, 0);
        x5 = new C20337914i1<>("first_time_show_age_16_to_18_live_dialog", Boolean.class, bool);
        y5 = new C20337914i1<>("tool_tips_show_management_time", Long.class, 0L);
        z5 = new C20337914i1<>("tool_tips_show_management_count", Integer.class, 0);
        A5 = new C20337914i1<>("tool_tips_show_version_code_map", new TypeToken<HashMap<String, Double>>() { // from class: X.00VK
        }.getType(), new HashMap());
        B5 = new C20337914i1<>("tool_tips_show_position_time_map", new TypeToken<HashMap<String, Double>>() { // from class: X.00V7
        }.getType(), new HashMap());
        C5 = new C0JT6<>("tool_tips_business_show_count_map", new TypeToken<Map<String, Double>>() { // from class: X.00VE
        }.getType());
        D5 = new C20337914i1<>("live_setting_distribute_from_server_map", new TypeToken<HashMap<Integer, MultiGuestPlayInfo.MultiGuestPlayConfig>>() { // from class: X.00Tv
        }.getType(), new HashMap());
        E5 = new C0JT6<>("live_sub_anchor_popup", new TypeToken<Map<String, Boolean>>() { // from class: X.00VL
        }.getType());
        F5 = new C20337914i1<>("live_show_share_setting_gift_limit_red_dot", Boolean.class, bool);
        G5 = new C20337914i1<>("live_publicscreen_auto_translate_audience", Boolean.class, bool2);
        H5 = new C20337914i1<>("live_publicscreen_auto_translate_guide_audience", Boolean.class, bool);
        I5 = new C20337914i1<>("live_publicscreen_auto_translate_audience_change", Boolean.class, bool2);
        J5 = new C20337914i1<>("live_publicscreen_auto_translate_anchor", Boolean.class, bool2);
        K5 = new C20337914i1<>("live_publicscreen_auto_translate_guide_anchor", Boolean.class, bool);
        L5 = new C20337914i1<>("live_publicscreen_auto_translate_anchor_change", Boolean.class, bool2);
        M5 = new C20337914i1<>("live_showed_confirm_before_send_apply_in_multi_guest", Boolean.class, bool2);
        N5 = new C20337914i1<>("live_landscape_slide_guide", Boolean.class, bool);
        O5 = new C20337914i1<>("live_wallet_notice_show_time", new TypeToken<HashMap<String, Map<String, Double>>>() { // from class: X.00UU
        }.getType(), new HashMap());
        P5 = new C0JT6<>("live_wallet_notice_show_timestamp", new TypeToken<HashMap<String, Long>>() { // from class: X.00V5
        }.getType());
        Q5 = new C20337914i1<>("live_wallet_order_start_time", new TypeToken<C08II<String, String>>() { // from class: X.0KWI
        }.getType(), new C08II());
        R5 = new C20337914i1<>("live_wallet_last_query_diamond_time", Long.class, 0L);
        new C20337914i1("live_battle_bonus_task_tip_show_count", Long.class, 0L);
        S5 = new C0JT6<>("email_voucher_distributed", Boolean.class);
        T5 = new C0JT6<>("email_prompt_shown_times", Double.class);
        U5 = new C0JT6<>("email_prompt_last_seen", Double.class);
        V5 = new C0JT6<>("live_wallet_vip_update_2025q3_click", Boolean.class);
        W5 = new C0JT6<>("live_wallet_webapp_profile_banner_show_count", Integer.class);
        X5 = new C0JT6<>("live_wallet_webapp_profile_banner_no_action_count", Integer.class);
        Y5 = new C0JT6<>("live_wallet_webapp_profile_banner_show_timestamp", Long.class);
        Z5 = new C0JT6<>("live_wallet_webapp_profile_banner_show_ctr_model", Boolean.class);
        a6 = new C0JT6<>("live_wallet_pay_success_time", Long.class);
        b6 = new C0JT6<>("live_wallet_result_page_quick_charge_banner_show_time", Long.class);
        c6 = new C0JT6<>("live_wallet_result_page_quick_charge_banner_show_count", Long.class);
        d6 = new C20337914i1<>("cpc_time", String.class, "");
        e6 = new C20337914i1<>("live_cpc_server_data", CpcPromptResponse.class, new CpcPromptResponse(null, null, 0L, 0L, 0L, false));
        f6 = new C0JT6<>("shown_live_studio_tips_widget", Boolean.class);
        g6 = new C20337914i1<>("shown_game_help_widget_times", Integer.class, 0);
        h6 = new C20337914i1<>("broadcast_vote_template_op_guide_show", Boolean.class, bool2);
        i6 = new C20337914i1<>("live_comment_filter_switch_spam_filter", Boolean.class, bool);
        j6 = new C20337914i1<>("live_comment_filter_switch_l2_filter", Boolean.class, bool);
        k6 = new C20337914i1<>("live_comment_filter_switch_community_flagged", Boolean.class, bool2);
        l6 = new C20337914i1<>("live_comment_filter_switch_community_flagged_review", Boolean.class, bool2);
        m6 = new C20337914i1<>("live_comment_filter_dialog_notify", Boolean.class, bool2);
        n6 = new C20337914i1<>("follow_live_bubble_show_time", Long.class, 0L);
        o6 = new C20337914i1<>("live_closing_stay_dialog_show_timestamp", Long.class, 0L);
        p6 = new C20337914i1<>("live_closing_stay_dialog_show_count", Integer.class, 0);
        q6 = new C20337914i1<>("live_sliding_stay_dialog_show_timestamp", Long.class, 0L);
        r6 = new C20337914i1<>("live_show_caption_audience_swith", Boolean.class, bool);
        s6 = new C20337914i1<>("live_show_caption_audience_drag", Boolean.class, bool2);
        t6 = new C20337914i1<>("live_show_caption_audience_show_share_gudience", Boolean.class, bool2);
        u6 = new C20337914i1<>("live_show_caption_audience_server_close", Boolean.class, bool2);
        v6 = new C20337914i1<>("live_show_caption_anchor_swith", Boolean.class, bool);
        w6 = new C20337914i1<>("live_show_caption_anchor_pre_switch_dialog_gudience", Boolean.class, bool2);
        x6 = new C20337914i1<>("live_show_caption_anchor_pre_switch_tooltip_gudience", Boolean.class, bool2);
        y6 = new C20337914i1<>("live_sliding_stay_dialog_show_count", Integer.class, 0);
        z6 = new C0JT6<>("live_ranking_entrance_show_prompt", Boolean.class);
        A6 = new C0JT6<>("live_multi_guest_anchor_video_enable", Boolean.class);
        B6 = new C0JT6<>("live_profile_report_play_animator", Boolean.class);
        C6 = new C0JT6<>("live_profile_privilege_play_animator", Boolean.class);
        D6 = new C20337914i1<>("live_pro_animation_count_anchor", Integer.class, 0);
        E6 = new C20337914i1<>("live_pro_animation_count_audience", Integer.class, 0);
        F6 = new C0JT6<>("live_team_challenge_room_list", new TypeToken<List<String>>() { // from class: X.00e9
        }.getType());
        G6 = new C0JT6<>("show_creator_level_gift_gallery", new TypeToken<List<String>>() { // from class: X.00eB
        }.getType());
        H6 = new C0JT6<>("played_privilege_center_animation", new TypeToken<List<String>>() { // from class: X.00eD
        }.getType());
        I6 = new C0JT6<>("live_gift_gallery_profile_period_gift_id_scan", new TypeToken<List<String>>() { // from class: X.00eF
        }.getType());
        J6 = new C0JT6<>("live_gift_gallery_profile_guide_anim", Double.class);
        K6 = new C20337914i1<>("live_gift_gallery_first_popup_shown_low_price", Boolean.class, bool2);
        L6 = new C20337914i1<>("live_gift_gallery_first_popup_shown_high_price", Boolean.class, bool2);
        M6 = new C20337914i1<>("live_gift_panel_interactive_tab_seen", Boolean.class, bool2);
        N6 = new C20337914i1<>("live_gift_icon_guide_magic_gift_shown", Boolean.class, bool2);
        O6 = new C20337914i1<>("live_gift_icon_guide_outfit_gift_shown", Boolean.class, bool2);
        P6 = new C20337914i1<>("live_gift_icon_guide_interactive_gameplay_shown", Boolean.class, bool2);
        Q6 = new C20337914i1<>("live_gift_new_bubble_guide_shown_ids", new TypeToken<ArrayList<String>>() { // from class: X.00eH
        }.getType(), new ArrayList());
        R6 = new C20337914i1<>("live_gift_panel_backpack_tab_auto_scroll_to_reddot_shown", Boolean.class, bool2);
        S6 = new C20337914i1<>("live_gift_panel_enigma_match_banner_shown", Boolean.class, bool2);
        T6 = new C20337914i1<>("live_red_dot_shown_version_record", new TypeToken<HashMap<String, String>>() { // from class: X.00eJ
        }.getType(), new HashMap());
        U6 = new C20337914i1<>("live_red_dot_finish_record", new TypeToken<HashSet<String>>() { // from class: X.0TVc
        }.getType(), new HashSet());
        V6 = new C20337914i1<>("live_assets_red_dot_finish_record", new TypeToken<HashSet<String>>() { // from class: X.0TVd
        }.getType(), new HashSet());
        W6 = new C20337914i1<>("live_red_dot_last_show_time", new TypeToken<HashMap<String, String>>() { // from class: X.00eR
        }.getType(), new HashMap());
        X6 = new C20337914i1<>("live_condition_red_dot_last_show_time", new TypeToken<HashMap<String, String>>() { // from class: X.00eT
        }.getType(), new HashMap());
        Y6 = new C20337914i1<>("live_red_dot_debug_config", LiveRedDotDebugConfig.class, new LiveRedDotDebugConfig());
        Z6 = new C20337914i1<>("live_message_notify_config", String.class, "");
        a7 = new C20337914i1<>("live_message_notify_fluency_record", new TypeToken<ArrayList<MsgNotifyRecord>>() { // from class: X.0Im0
        }.getType(), new ArrayList());
        b7 = new C20337914i1<>("live_message_effect_notify_frequency_record", new TypeToken<ArrayList<NotifyRecord>>() { // from class: X.0Im1
        }.getType(), new ArrayList());
        c7 = new C0JT6<>("live_welcome_pack_click_times", Double.class);
        d7 = new C0JT6<>("live_welcome_pack_has_status", Boolean.class);
        e7 = new C20337914i1<>("live_red_dot_function_version", new TypeToken<HashMap<String, String>>() { // from class: X.00eU
        }.getType(), new HashMap());
        f7 = new C20337914i1<>("following_widget_first_show_time", Long.class, 0L);
        g7 = new C20337914i1<>("following_widget_is_showed", Boolean.class, bool2);
        h7 = new C20337914i1<>("following_widget_is_added", Boolean.class, bool2);
        i7 = new C20337914i1<>("live_first_show_camera_second_confirm", Boolean.class, bool);
        j7 = new C20337914i1<>("live_share_to_more_guide", Boolean.class, bool2);
        k7 = new C20337914i1<>("live_repost_bubble_guide", Boolean.class, bool2);
        l7 = new C20337914i1<>("live_repost_anim_guide", Boolean.class, bool2);
        m7 = new C20337914i1<>("live_add_live_to_story_bubble_guide_shown", Boolean.class, bool2);
        n7 = new C20337914i1<>("last_input_schema", String.class, "");
        o7 = new C20337914i1<>("live_gift_announcement_shown_count", Integer.class, 0);
        p7 = new C20337914i1<>("live_gift_announcement_close_ratio", Float.class, Float.valueOf(0.0f));
        q7 = new C0JT6<>("live_privilege_center_entrance_config", String.class);
        r7 = new C20337914i1<>("live_only_gift_new_gift_state", new TypeToken<HashMap<String, String>>() { // from class: X.00eV
        }.getType(), new HashMap());
        s7 = new C20337914i1<>("live_only_gift_new_gift_version", new TypeToken<HashMap<String, String>>() { // from class: X.00eW
        }.getType(), new HashMap());
        new C20337914i1("live_star_comment_guidance_showed", Boolean.class, bool2);
        t7 = new C20337914i1<>("live_star_comment_purchase", Integer.class, 0);
        u7 = new C20337914i1<>("live_star_comment_baseline_price", Long.class, 0L);
        f146v7 = new C20337914i1<>("host_ever_opened_sub_only_live", Boolean.class, bool2);
        w7 = new C20337914i1<>("host_ignore_sub_only_guide_times", Integer.class, 0);
        x7 = new C20337914i1<>("host_sub_only_live_guide_silent_ts", Long.class, 0L);
        y7 = new C20337914i1<>("crash_in_watch_live", Boolean.class, bool2);
        z7 = new C20337914i1<>("live_guide_inbox_to_follow_uid", new TypeToken<HashSet<String>>() { // from class: X.0TVe
        }.getType(), new HashSet());
        A7 = new C20337914i1<>("anchor_active_level", Integer.class, 1);
        B7 = new C20337914i1<>("live_creator_growth_center_banner_show_times", Integer.class, 0);
        C7 = new C20337914i1<>("live_creator_journey_2_banner_show_times", new TypeToken<HashMap<String, String>>() { // from class: X.00eZ
        }.getType(), new HashMap());
        D7 = new C20337914i1<>("live_pl_custom_message_record", new TypeToken<C08II<String, String>>() { // from class: X.0KWJ
        }.getType(), new C08II(20));
        E7 = new C20337914i1<>("live_show_welcome_message_room_ids_map", new TypeToken<HashMap<String, List<String>>>() { // from class: X.00VM
        }.getType(), new HashMap());
        F7 = new C0JT6<>("live_multi_guest_anchor_audio_mute", Boolean.class);
        G7 = new C20337914i1<>("live_broadcast_storage_monitor_time", Long.class, 0L);
        H7 = new C0JT6<>("live_anchor_overheating_notice", String.class);
        I7 = new C0JT6<>("live_comment_tray_switch", Boolean.class);
        J7 = new C0JT6<>("live_ai_reply_switch", Boolean.class);
        K7 = new C0JT6<>("live_recommend_room_avatar_click_times", String.class);
        L7 = new C0JT6<>("live_recommend_room_request_click_times", String.class);
        M7 = new C20337914i1<>("live_notice_board_pure_color", new TypeToken<List<String>>() { // from class: X.00ed
        }.getType(), new ArrayList());
        N7 = new C20337914i1<>("live_notice_board_draft", new TypeToken<List<String>>() { // from class: X.00ee
        }.getType(), new ArrayList());
        O7 = new C20337914i1<>("live_notice_board_top_tips_show_times", Integer.class, 0);
        P7 = new C0JT6<>("live_record_toast_message_showed", Boolean.class);
        Q7 = new C20337914i1<>("live_moderator_poll_tooltips_shown", Boolean.class, bool2);
        R7 = new C20337914i1<>("live_comment_keyboard_height", new TypeToken<Integer>() { // from class: X.0etC
        }.getType(), 0);
        S7 = new C20337914i1<>("live_comment_keyboard_land_height", new TypeToken<Integer>() { // from class: X.0etB
        }.getType(), 0);
        T7 = new C20337914i1<>("live_storage_cleaner_common_records", new TypeToken<Map<String, String>>() { // from class: X.00e7
        }.getType(), new HashMap());
        U7 = new C20337914i1<>("live_storage_cleaner_karaoke_records", new TypeToken<Map<String, String>>() { // from class: X.00e8
        }.getType(), new HashMap());
        V7 = new C20337914i1<>("live_storage_cleaner_effect_records", new TypeToken<Map<String, String>>() { // from class: X.00eA
        }.getType(), new HashMap());
        W7 = new C20337914i1<>("has_shown_golive_high_intent_dm_tooltip_date_count", DateFrequencyModel.class, new DateFrequencyModel());
        X7 = new C20337914i1<>("high_intent_dm_tooltip_show_room_record_v2", new TypeToken<HashMap<String, Long>>() { // from class: X.00V9
        }.getType(), new HashMap());
        Y7 = new C20337914i1<>("sku_routing_bubble_daily_show_count", DateFrequencyModel.class, new DateFrequencyModel());
        new C20337914i1("sku_routing_interaction_ignore_timestamps", new TypeToken<HashMap<String, List<Long>>>() { // from class: X.00UT
        }.getType(), new HashMap());
        Z7 = new C0JT6<>("sub_pin_card_shown_record", new TypeToken<Map<String, String>>() { // from class: X.00eI
        }.getType());
        a8 = new C0JT6<>("has_shown_anchor_title_understanding_tooltip", Boolean.class);
        b8 = new C0JT6<>("pcs_anchor_intro_storage", String.class);
        c8 = new C0JT6<>("pcs_run_title_understanding", Boolean.class);
        d8 = new C0JT6<>("pcs_run_title_intro_understanding", Boolean.class);
        e8 = new C0JT6<>("pcs_run_title_understanding_model_accumulative_times", Double.class);
        f8 = new C0JT6<>("has_shown_golive_smb_deactivated_tooltip", Boolean.class);
        g8 = new C0JT6<>("has_shown_golive_smb_in_grace_period_tooltip", Boolean.class);
        h8 = new C0JT6<>("has_shown_golive_smb_revoked_tooltip", Boolean.class);
        i8 = new C0JT6<>("has_shown_creator_revocation_restored_tooltip", Boolean.class);
        j8 = new C0JT6<>("has_shown_unlock_business_suite_tooltip", Boolean.class);
        new C0JT6("has_shown_anchor_live_full_lop_access_tooltip", Boolean.class);
        k8 = new C0JT6<>("has_shown_service_plus_verification_warning_reminder", Boolean.class);
        l8 = new C0JT6<>("has_shown_service_plus_verification_warning_revoked", Boolean.class);
        m8 = new C0JT6<>("has_shown_service_plus_aigc_chat_builder", Boolean.class);
        n8 = new C0JT6<>("has_shown_industry_badge_tips_bubble", Boolean.class);
        o8 = new C0JT6<>("pcs_onboarding_revamp_intro", String.class);
        p8 = new C0JT6<>("pcs_onboarding_revamp_suggested_questions", new TypeToken<List<String>>() { // from class: X.00eK
        }.getType());
        new C0JT6("pcs_onboarding_revamp_suggested_answers", new TypeToken<List<String>>() { // from class: X.00eM
        }.getType());
        new C0JT6("pcs_onboarding_revamp_welcome_message", String.class);
        new C0JT6("pcs_onboarding_revamp_form_questions", new TypeToken<List<String>>() { // from class: X.00eO
        }.getType());
        q8 = new C20337914i1<>("viewer_limit_host", String.class, "");
        r8 = new C20337914i1<>("live_storage_live_event_sticker_manual_close_ids", new TypeToken<HashMap<String, HashSet<String>>>() { // from class: X.011m
        }.getType(), new HashMap());
        s8 = new C20337914i1<>("live_storage_live_event_sticker_guidance_showed", Boolean.class, bool2);
        t8 = new C20337914i1<>("live_pad_auto_rotate_screen_guide_showed", Boolean.class, bool2);
        u8 = new C0JT6<>("live_setting_comment_block_words_guide_shown", Boolean.class);
        v8 = new C20337914i1<>("live_anchor_cue_hint_shwon", Boolean.class, bool2);
        w8 = new C20337914i1<>("live_start_network_record", Boolean.class, bool2);
        x8 = new C0JT6<>("live_eoy_25_bubble_showed_record", new TypeToken<ArrayList<String>>() { // from class: X.00eS
        }.getType());
        y8 = new C20337914i1<>("multi_live_has_shown_multi_icon_voice_wave_tooltip", Boolean.class, bool2);
        z8 = new C20337914i1<>("multi_live_has_shown_multi_icon_auto_approval_tooltip", Boolean.class, bool2);
        A8 = new C20337914i1<>("multi_live_has_shown_multi_icon_quick_connect_tooltip", Boolean.class, bool2);
        B8 = new C0JT6<>("live_gameplay_hint_showed", String.class);
        C8 = new C20337914i1<>("live_bottombar_video_auto_play_mute", Boolean.class, bool);
        D8 = new C0JT6<>("live_back_to_event_next_show_timestamp", Double.class);
        E8 = new C0JT6<>("live_back_to_event_number_of_consecutive_cancellations", Double.class);
        F8 = new C0JT6<>("live_back_to_event_total_number_of_cancellations", Double.class);
        G8 = new C20337914i1<>("live_new_user_or_moderator_filter_comment_pop_up_show", Boolean.class, bool2);
        H8 = new C20337914i1<>("live_new_user_or_moderator_block_keywords_pop_up_show", Boolean.class, bool2);
        I8 = new C20337914i1<>("live_new_user_or_moderator_capsule_show", Boolean.class, bool2);
        J8 = new C20337914i1<>("follow_user_prompt_room_show_times", new TypeToken<HashMap<Long, Integer>>() { // from class: X.00VD
        }.getType(), new HashMap());
        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
        sbLIZ9.append("live_location_service_showed_audience");
        LiveNearbyLabelExperimentVersionSetting liveNearbyLabelExperimentVersionSetting = LiveNearbyLabelExperimentVersionSetting.INSTANCE;
        sbLIZ9.append(liveNearbyLabelExperimentVersionSetting.getValue());
        K8 = new C0JT6<>(C2188811AlT.LIZIZ(sbLIZ9), Boolean.class);
        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
        sbLIZ10.append("live_location_service_showed_anchor");
        sbLIZ10.append(liveNearbyLabelExperimentVersionSetting.getValue());
        L8 = new C0JT6<>(C2188811AlT.LIZIZ(sbLIZ10), Boolean.class);
        M8 = new C20337914i1<>("show_multi_guest_interact_guide_bubble", Boolean.class, bool);
        N8 = new C20337914i1<>("show_multi_guest_playbook_moved_guide_bubble", Boolean.class, bool);
        O8 = new C20337914i1<>("live_float_window_switch_record", new TypeToken<HashMap<String, Boolean>>() { // from class: X.00VF
        }.getType(), new HashMap());
        P8 = new C20337914i1<>("live_float_window_bubble_show_record", new TypeToken<HashMap<String, Boolean>>() { // from class: X.00VH
        }.getType(), new HashMap());
        Q8 = new C20337914i1<>("live_float_window_end_dialog_show_num_record", new TypeToken<HashMap<String, Integer>>() { // from class: X.00VI
        }.getType(), new HashMap());
        new C20337914i1("live_debug_tool_history_mail", new TypeToken<ArrayList<String>>() { // from class: X.00eX
        }.getType(), new ArrayList());
        R8 = new C0JT6<>("live_playbook_ugc_draft", String.class);
        S8 = new C0JT6<>("live_playbook_ugc_first_create", Boolean.class);
        T8 = new C20337914i1<>("live_layout_first_track", Boolean.class, bool);
        U8 = new C0JT6<>("live_anchor_fan_club_customize_capsule_times", String.class);
        V8 = new C0JT6<>("live_anchor_super_fan_club_upload_emote_capsule_times", String.class);
        W8 = new C0JT6<>("live_anchor_fan_club_customize_badge", Boolean.class);
        X8 = new C0JT6<>("live_anchor_fan_club_customize_emote", Boolean.class);
        Y8 = new C0JT6<>("live_anchor_upload_super_fan_emote", Boolean.class);
        Z8 = new C20337914i1<>("show_multi_guest_cohost_with_guest_guide_bubble", Boolean.class, bool);
        a9 = new C20337914i1<>("show_multi_guest_when_is_able_to_cohost_guide_bubble", Boolean.class, bool);
        b9 = new C20337914i1<>("multi_guest_has_show_text_header_guide", Boolean.class, bool2);
        c9 = new C0JT6<>("live_fans_club_milestone_celebration_page_showed", new TypeToken<Map<String, String>>() { // from class: X.00eY
        }.getType());
        d9 = new C0JT6<>("live_super_fans_guide_anchor_anim_times", new TypeToken<ArrayList<String>>() { // from class: X.00ea
        }.getType());
        e9 = new C0JT6<>("live_super_fans_guide_user_anim_time", new TypeToken<Map<String, String>>() { // from class: X.00eb
        }.getType());
        f9 = new C0JT6<>("live_anchor_new_super_fans_anim_time", new TypeToken<Map<String, String>>() { // from class: X.00ec
        }.getType());
        g9 = new C20337914i1<>("live_pcs_course_name_approve_need_show_map", new TypeToken<HashMap<String, Boolean>>() { // from class: X.00VN
        }.getType(), new HashMap());
        h9 = new C20337914i1<>("live_pcs_course_description_approve_need_show_map", new TypeToken<HashMap<String, Boolean>>() { // from class: X.00VO
        }.getType(), new HashMap());
        i9 = new C20337914i1<>("live_pcs_course_pin_notice_approve_need_show_map", new TypeToken<HashMap<String, Boolean>>() { // from class: X.00VP
        }.getType(), new HashMap());
        j9 = new C20337914i1<>("live_pcs_course_video_approve_need_show_map", new TypeToken<HashMap<String, Boolean>>() { // from class: X.00V4
        }.getType(), new HashMap());
        k9 = new C20337914i1<>("live_pcs_course_video_reedit_not_approved_need_show_map", new TypeToken<HashMap<String, Boolean>>() { // from class: X.00V6
        }.getType(), new HashMap());
        l9 = new C0JT6<>("live_pcs_calendly_user_has_accepted_agreement", Boolean.class);
        m9 = new C0JT6<>("live_pcs_third_party_link_disclaimer_shown_ts", Long.class);
        n9 = new C20337914i1<>("pcs_gp_billing_country_code", String.class, "");
        o9 = new C20337914i1<>("live_take_the_stage_last_selected_duration", Long.class, 90L);
        p9 = new C0JT6<>("live_anchor_noise_suppression_enable", Boolean.class);
        q9 = new C0JT6<>("live_anchor_noise_capsule_consecutive_show_count", Integer.class);
        r9 = new C0JT6<>("live_anchor_noise_detect_time", Long.class);
        new C0JT6("exit_room_guide", Integer.class);
        s9 = new C20337914i1<>("preview_visible_scope_bubble_show_record", new TypeToken<HashMap<String, Boolean>>() { // from class: X.00V8
        }.getType(), new HashMap());
        t9 = new C20337914i1<>("preview_visible_scope_first_show", Boolean.class, bool);
        u9 = new C20337914i1<>("can_show_nr_guide", Boolean.class, bool);
        v9 = new C0JT6<>("live_anchor_enigma_comment_has_show", Boolean.class);
        w9 = new C20337914i1<>("live_audience_enigma_comment_tooltip_has_shown", Boolean.class, bool2);
        x9 = new C20337914i1<>("live_audience_enigma_comment_intro_popup_has_shown", Boolean.class, bool2);
        y9 = new C20337914i1<>("live_audience_enigma_can_sen_whisper_time", Long.class, 0L);
        z9 = new C0JT6<>("live_anchor_enable_guardian", Boolean.class);
        A9 = new C20337914i1<>("live_pcs_decoration_bullets_bubble_state", Long.class, 0L);
        B9 = new C20337914i1<>("class_rank_sticker_auto_switch", Boolean.class, bool2);
        C9 = new C20337914i1<>("rank_sticker_auto_switch_alert", Boolean.class, bool2);
        D9 = new C20337914i1<>("rank_sticker_show_conflict_alert", Boolean.class, bool2);
        E9 = new C20337914i1<>("live_mixlayout_show_debug_panel", Boolean.class, bool2);
        F9 = new C20337914i1<>("live_mixlayout_debug_entrance_location", Integer.class, 0);
        new C20337914i1("live_bottom_tab_show_first_frame", Boolean.class, bool2);
        G9 = new C0JT6<>("live_preview_bottom_fold", Boolean.class);
        H9 = new C0JT6<>("live_preview_bottom_fold_game", Boolean.class);
        I9 = new C20337914i1<>("live_super_fan_treasure_box_guide", Boolean.class, bool);
        J9 = new C20337914i1<>("live_top_guest_conflict_education_popup_count", Integer.class, 3);
        K9 = new C0JT6<>("active_watch_guide_bubble_show_record", new TypeToken<List<String>>() { // from class: X.00eC
        }.getType());
        L9 = new C0JT6<>("active_watch_guide_bubble_dismiss_no_click_timestamps", new TypeToken<List<Long>>() { // from class: X.00eE
        }.getType());
        M9 = new C0JT6<>("live_watch_later_first_do_add", Boolean.class);
        N9 = new C0JT6<>("live_watch_later_inner_bubble_shown", Boolean.class);
        O9 = new C0JT6<>("live_watch_event_space_entry_tip_shown", Boolean.class);
        P9 = new C20337914i1<>("live_super_fan_emote_hint", new TypeToken<List<Long>>() { // from class: X.00eG
        }.getType(), new ArrayList());
        Q9 = new C20337914i1<>("playbook_auto_run_guide", Integer.class, 0);
        R9 = new C20337914i1<>("playbook_auto_run_dialog_close_count", Integer.class, 0);
        S9 = new C20337914i1<>("has_shown_random_match_switch_guide", Boolean.class, bool2);
        T9 = new C20337914i1<>("has_shown_random_match_switch_bubble_guide", Boolean.class, bool2);
        U9 = new C20337914i1<>("live_go_live_tooltip_records", new TypeToken<HashMap<Long, String>>() { // from class: X.00VB
        }.getType(), new HashMap());
        V9 = new C20337914i1<>("live_short_touch_business_shown_list", new TypeToken<ArrayList<String>>() { // from class: X.00eL
        }.getType(), new ArrayList());
        W9 = new C20337914i1<>("live_short_touch_update_time", Long.class, 0L);
        X9 = new C20337914i1<>("live_go_live_tooltip_next_can_show_time", new TypeToken<HashMap<Long, Long>>() { // from class: X.00eN
        }.getType(), new HashMap());
        Y9 = new C0JT6<>("live_preview_card_repost_guidance_next_can_show_time", Long.class);
        Z9 = new C0JT6<>("live_preview_card_repost_guide_records", new TypeToken<List<String>>() { // from class: X.00eP
        }.getType());
        new C0JT6("live_preview_card_repost_guide_no_interest_room", new TypeToken<List<String>>() { // from class: X.00eQ
        }.getType());
        aa = new C0JT6<>("live_viewer_wishes_campaign_bubble_display_count", Integer.class);
        ba = new C0JT6<>("live_fans_club_custom_benefits_capsule_display_count", Integer.class);
        ca = new C0JT6<>("interaction_guide_daily_frequency_by_type", new TypeToken<Map<String, DateFrequencyModel>>() { // from class: X.0et8
        }.getType());
        da = new C0JT6<>("interaction_guide_shown_room_records_by_type", new TypeToken<Map<String, Long>>() { // from class: X.00VG
        }.getType());
        ea = new C0JT6<>("interaction_guide_daily_frequency_total", new TypeToken<Map<String, DateFrequencyModel>>() { // from class: X.0et9
        }.getType());
        fa = new C0JT6<>("interaction_guide_shown_room_records_total", new TypeToken<Map<String, Long>>() { // from class: X.00VJ
        }.getType());
        ga = new C0JT6<>("live_wallet_storage_param_is_first_recharge", String.class);
        ha = new C0JT6<>("live_wallet_storage_param_is_first_cash_recharge", String.class);
    }
}
