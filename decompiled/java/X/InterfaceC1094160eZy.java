package X;

import com.bytedance.android.livesdkapi.host.IHostUser;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0eZy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public interface InterfaceC1094160eZy {
    public static final C20337914i1<Map<Long, Integer>> A1;
    public static final C20337914i1<Map<Long, Long>> B1;
    public static final C20337914i1<Boolean> C1;
    public static final C20337914i1<Boolean> D0;
    public static final C0JT6<Boolean> D1;
    public static final C20337914i1<Set<String>> E0;
    public static final C20337914i1<Boolean> E1;
    public static final C20337914i1<String> F0;
    public static final C0JT6<Double> F1;
    public static final C20337914i1<String> G0;
    public static final C0JT6<Boolean> G1;
    public static final C20337914i1<String> H0;
    public static final C20337914i1<Map<String, String>> H1;
    public static final C20337914i1<Long> I0;
    public static final C0JT6<Boolean> I1;
    public static final C20337914i1<Boolean> J0;
    public static final C0JT6<Boolean> J1;
    public static final C20337914i1<Integer> K0;
    public static final C0JT6<Boolean> K1;
    public static final C20337914i1<Integer> L0;
    public static final C0JT6<Boolean> L1;
    public static final C20337914i1<Boolean> M0;
    public static final C0JT6<Double> M1;
    public static final C20337914i1<Integer> N0;
    public static final C20337914i1<Boolean> N1;
    public static final C20337914i1<Boolean> O0;
    public static final C0JT6<List<Long>> O1;
    public static final C20337914i1<Integer> P0;
    public static final C0JT6<List<Long>> P1;
    public static final C20337914i1<Integer> Q0;
    public static final C20337914i1<Boolean> Q1;
    public static final C20337914i1<Boolean> R0;
    public static final C20337914i1<Long> R1;
    public static final C20337914i1<Integer> S0;
    public static final C20337914i1<Boolean> S1;
    public static final C20337914i1<Boolean> T0;
    public static final C20337914i1<Boolean> T1;
    public static final C20337914i1<Boolean> U0;
    public static final C0JT6<List<String>> U1;
    public static final C20337914i1<Boolean> V0;
    public static final C20337914i1<Long> V1;
    public static final C20337914i1<Set<String>> W0;
    public static final C20337914i1<Long> W1;
    public static final C20337914i1<Boolean> X0;
    public static final C0JT6<Map<Long, Pair<Long, Long>>> X1;
    public static final C20337914i1<Long> Y0;
    public static final C0JT6<Map<Long, Long>> Y1;
    public static final C20337914i1<Map<String, String>> Z0;
    public static final C0JT6<LinkedList<Integer>> Z1;
    public static final C20337914i1<Map<String, String>> a1;
    public static final C0JT6<LinkedList<Integer>> a2;
    public static final C20337914i1<Boolean> b1;
    public static final C0JT6<String> b2;
    public static final C20337914i1<Boolean> c1;
    public static final C0JT6<String> c2;
    public static final C20337914i1<Long> d1;
    public static final C0JT6<String> d2;
    public static final C20337914i1<Integer> e1;
    public static final C20337914i1<Long> e2;
    public static final C20337914i1<Integer> f1;
    public static final C0JT6<String> f2;
    public static final C20337914i1<Map<Integer, Boolean>> g1;
    public static final C0JT6<String> g2;
    public static final C20337914i1<Integer> h1;
    public static final C0JT6<String> h2;
    public static final C20337914i1<Set<Long>> i1;
    public static final C0JT6<String> i2;
    public static final C20337914i1<Map<String, String>> j1;
    public static final C20337914i1<Boolean> j2;
    public static final C20337914i1<Boolean> k1;
    public static final C20337914i1<Long> k2;
    public static final C20337914i1<Boolean> l1;
    public static final C20337914i1<Long> l2;
    public static final C20337914i1<Boolean> m1;
    public static final C20337914i1<List<Double>> m2;
    public static final C20337914i1<Boolean> n1;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public static final C20337914i1<Boolean> f140n2;
    public static final C20337914i1<Boolean> o1;
    public static final C20337914i1<Integer> o2;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final C20337914i1<List<Long>> f141p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final C20337914i1<Long> f142p2;
    public static final C20337914i1<Boolean> q1;
    public static final C20337914i1<Boolean> q2;
    public static final C20337914i1<Long> r1;
    public static final C20337914i1<Boolean> r2;
    public static final C20337914i1<CopyOnWriteArraySet<Double>> s1;
    public static final C20337914i1<String> s2;
    public static final C20337914i1<CopyOnWriteArraySet<Long>> t1;
    public static final C20337914i1<Boolean> u1;
    public static final C20337914i1<CopyOnWriteArraySet<String>> v1;
    public static final C20337914i1<Map<String, ArrayList<Double>>> w1;
    public static final C20337914i1<HashMap<String, String>> x1;
    public static final C20337914i1<HashMap<String, String>> y1;
    public static final C0JT6<Double> z1;

    static {
        new C20337914i1("hwg_fc_debug_timestamp", Long.class, -1L);
        Boolean bool = Boolean.TRUE;
        D0 = new C20337914i1<>("gift_poll_warn_dialog_show", Boolean.class, bool);
        E0 = new C20337914i1<>("gift_list_type", new TypeToken<Set<String>>() { // from class: X.0eZm
        }.getType(), new HashSet());
        F0 = new C20337914i1<>("assets_cache_data", String.class, "");
        G0 = new C20337914i1<>("disk_present_assets_cache_data", String.class, "");
        H0 = new C20337914i1<>("assets_cache_data_last_download_time", String.class, "");
        I0 = new C20337914i1<>("assets_cache_last_check_time", Long.class, 0L);
        J0 = new C20337914i1<>("live_show_exchange_red_dot", Boolean.class, bool);
        K0 = new C20337914i1<>("live_ug_exchange_click_cancel_count", Integer.class, 0);
        L0 = new C20337914i1<>("live_gifts_exchange_click_cancel_count", Integer.class, 0);
        M0 = new C20337914i1<>("live_gifts_guide_exchange_click_cancel_exp", Boolean.class, bool);
        N0 = new C20337914i1<>("live_task_exchange_click_cancel_count", Integer.class, 0);
        O0 = new C20337914i1<>("live_task_guide_exchange_click_cancel_exp", Boolean.class, bool);
        P0 = new C20337914i1<>("live_gifts_guide_exchange_click_cancel_count", Integer.class, -1);
        Q0 = new C20337914i1<>("live_has_exchange_gift_success", Integer.class, 0);
        R0 = new C20337914i1<>("live_show_turn_on_auto_exchange_dialog", Boolean.class, bool);
        S0 = new C20337914i1<>("live_has_exchange_gift_success_for_live_income", Integer.class, 0);
        T0 = new C20337914i1<>("live_show_turn_on_auto_exchange_dialog_for_live_income", Boolean.class, bool);
        Boolean bool2 = Boolean.FALSE;
        U0 = new C20337914i1<>("link_mic_battle_open_gift_guide_not_show_again", Boolean.class, bool2);
        V0 = new C20337914i1<>("link_mic_battle_task_open_gift_toast", Boolean.class, bool2);
        W0 = new C20337914i1<>("mt_fast_gift_hide_confirm_gift", new TypeToken<Set<String>>() { // from class: X.0eZu
        }.getType(), new HashSet());
        X0 = new C20337914i1<>("room_auto_gift_thanks", Boolean.class, bool2);
        Y0 = new C20337914i1<>("live_current_user_id", Long.class, 0L);
        Z0 = new C20337914i1<>("live_mt_gift_color_anim_hist", new TypeToken<HashMap<String, String>>() { // from class: X.0eZw
        }.getType(), new HashMap());
        a1 = new C20337914i1<>("live_mt_gift_color_bubble_hist", new TypeToken<HashMap<String, String>>() { // from class: X.0eZx
        }.getType(), new HashMap());
        b1 = new C20337914i1<>("live_mt_gift_color_entered", Boolean.class, bool2);
        c1 = new C20337914i1<>("live_mt_gift_color_red_point_shown", Boolean.class, bool2);
        d1 = new C20337914i1<>("live_mt_gift_color_gift_id", Long.class, 0L);
        e1 = new C20337914i1<>("live_mt_gift_random_tips_count", Integer.class, 0);
        f1 = new C20337914i1<>("live_gift_random_last_day", Integer.class, 0);
        g1 = new C20337914i1<>("live_gift_random_count_map", new TypeToken<HashMap<Integer, Boolean>>() { // from class: X.012b
        }.getType(), new HashMap());
        h1 = new C20337914i1<>("random_fireworks_gift_hint_seen", Integer.class, -1);
        i1 = new C20337914i1<>("gift_exclusive_tab_anim_timestamps", new TypeToken<HashSet<Long>>() { // from class: X.0eZd
        }.getType(), new HashSet());
        j1 = new C20337914i1<>("gift_group_live_last_selected_receiver", new TypeToken<HashMap<String, String>>() { // from class: X.0eZe
        }.getType(), new HashMap());
        k1 = new C20337914i1<>("gift_group_live_show_member_selection_guide_did_show", Boolean.class, bool2);
        l1 = new C20337914i1<>("music_gift_education_guide_shown", Boolean.class, bool2);
        m1 = new C20337914i1<>("music_gift_detail_page_entered", Boolean.class, bool2);
        n1 = new C20337914i1<>("gift_viewer_wishes_guide_page_opended", Boolean.class, bool2);
        o1 = new C20337914i1<>("gift_viewer_wishes_new_user", Boolean.class, bool);
        f141p1 = new C20337914i1<>("viewer_wishes_component_last_3_scroll_times", new TypeToken<List<Long>>() { // from class: X.0eZf
        }.getType(), new ArrayList());
        q1 = new C20337914i1<>("viewer_wishes_first_enter_queue_page", Boolean.class, bool);
        r1 = new C20337914i1<>("live_last_user_level_will_sleep_text_show_time", Long.class, 0L);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId());
        sbLIZ.append("_user_level_new_unlock_gift_id_set");
        s1 = new C20337914i1<>(C2188811AlT.LIZIZ(sbLIZ), new TypeToken<CopyOnWriteArraySet<Double>>() { // from class: X.0ea1
        }.getType(), new CopyOnWriteArraySet());
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId());
        sbLIZ2.append("_event_new_unlock_gift_id_set");
        t1 = new C20337914i1<>(C2188811AlT.LIZIZ(sbLIZ2), new TypeToken<CopyOnWriteArraySet<Long>>() { // from class: X.0eZz
        }.getType(), new CopyOnWriteArraySet());
        u1 = new C20337914i1<>("user_level_new_unlock_tab_show_red_dot", Boolean.class, bool2);
        v1 = new C20337914i1<>("fans_club_new_unlock_tab_show_red_dot_set", new TypeToken<CopyOnWriteArraySet<String>>() { // from class: X.0ea0
        }.getType(), new CopyOnWriteArraySet());
        w1 = new C20337914i1<>("fans_club_new_unlock_gift_set", new TypeToken<HashMap<String, ArrayList<Double>>>() { // from class: X.012T
        }.getType(), new HashMap());
        x1 = new C20337914i1<>("live_limit_gift_remind_times", new TypeToken<HashMap<String, String>>() { // from class: X.0eZg
        }.getType(), new HashMap());
        y1 = new C20337914i1<>("live_gift_refresh_time", new TypeToken<HashMap<String, String>>() { // from class: X.0eZh
        }.getType(), new HashMap());
        z1 = new C0JT6<>("live_user_level_fe_from", Double.class);
        A1 = new C20337914i1<>("live_gift_real_time_motivation_show_count", new TypeToken<HashMap<Long, Integer>>() { // from class: X.012Z
        }.getType(), new HashMap());
        B1 = new C20337914i1<>("live_gift_real_time_motivation_show_timestamp", new TypeToken<HashMap<Long, Long>>() { // from class: X.0eZi
        }.getType(), new HashMap());
        new C0JT6("show_creator_level_gift_gallery", new TypeToken<List<String>>() { // from class: X.0eZj
        }.getType());
        new C0JT6("played_privilege_center_animation", new TypeToken<List<String>>() { // from class: X.0eZk
        }.getType());
        new C0JT6("live_gift_gallery_profile_period_gift_id_scan", new TypeToken<List<String>>() { // from class: X.0eZl
        }.getType());
        new C0JT6("live_gift_gallery_profile_guide_anim", Double.class);
        new C20337914i1("live_gift_gallery_first_popup_shown_low_price", Boolean.class, bool2);
        new C20337914i1("live_gift_gallery_first_popup_shown_high_price", Boolean.class, bool2);
        new C20337914i1("live_gift_panel_interactive_tab_seen", Boolean.class, bool2);
        new C20337914i1("live_gift_icon_guide_magic_gift_shown", Boolean.class, bool2);
        new C20337914i1("live_gift_panel_backpack_tab_auto_scroll_to_reddot_shown", Boolean.class, bool2);
        C1 = new C20337914i1<>("live_gift_panel_local_currency_message_seen", Boolean.class, bool2);
        D1 = new C0JT6<>("live_gift_user_is_first_gift", Boolean.class);
        E1 = new C20337914i1<>("live_gift_foldscreen_show_guide_bubble", Boolean.class, bool2);
        F1 = new C0JT6<>("live_gift_panel_show_times", Double.class);
        G1 = new C0JT6<>("live_first_recharge_package_exchange_page_entered", Boolean.class);
        H1 = new C20337914i1<>("live_gift_rank_tip_cant_on", new TypeToken<HashMap<String, String>>() { // from class: X.0eZn
        }.getType(), new HashMap());
        I1 = new C0JT6<>("live_gift_fav_entrance_empty_anime_shown", Boolean.class);
        J1 = new C0JT6<>("live_gift_fav_back_fill_region_tip_shown", Boolean.class);
        K1 = new C0JT6<>("live_gift_freq_to_fav_tip_holder_ever_settle", Boolean.class);
        L1 = new C0JT6<>("live_gift_freq_to_fav_tip_shown", Boolean.class);
        M1 = new C0JT6<>("live_gift_anchor_panel_record_tip_shown_times", Double.class);
        N1 = new C20337914i1<>("increase_gift_guide_duration", Boolean.class, bool2);
        O1 = new C0JT6<>("live_gameplay_gift_bubble_showed", new TypeToken<List<Long>>() { // from class: X.0eZo
        }.getType());
        P1 = new C0JT6<>("live_gameplay_upgrade_bubble_showed", new TypeToken<List<Long>>() { // from class: X.0eZp
        }.getType());
        Q1 = new C20337914i1<>("has_send_ug_points_gift", Boolean.class, bool2);
        R1 = new C20337914i1<>("anchor_ug_points_gift_times", Long.class, 0L);
        S1 = new C20337914i1<>("ug_gift_confirm_dialog_displayed", Boolean.class, bool2);
        T1 = new C20337914i1<>("backpack_gift_sent_toast_shown", Boolean.class, bool2);
        U1 = new C0JT6<>("live_cutomized_level_gift_anchor_list", new TypeToken<List<String>>() { // from class: X.0eZq
        }.getType());
        V1 = new C20337914i1<>("upgrade_gift_force_insert_time", Long.class, 0L);
        W1 = new C20337914i1<>("user_level_last_grade_info_user_id", Long.class, 0L);
        X1 = new C0JT6<>("live_gift_sticker_effect_show_guidance", new TypeToken<Map<Long, Pair<Long, Long>>>() { // from class: X.012a
        }.getType());
        Y1 = new C0JT6<>("live_gift_sticker_arena_guide_show_count", new TypeToken<Map<Long, Long>>() { // from class: X.0eZr
        }.getType());
        Z1 = new C0JT6<>("live_gift_shiny_card_uncounted_card_ids", new TypeToken<LinkedList<Integer>>() { // from class: X.0eZs
        }.getType());
        a2 = new C0JT6<>("live_gift_shiny_card_counted_card_ids", new TypeToken<LinkedList<Integer>>() { // from class: X.0eZt
        }.getType());
        b2 = new C0JT6<>("live_gift_shiny_card_unlock_result", String.class);
        c2 = new C0JT6<>("live_gift_shiny_card_last_interaction_request", String.class);
        d2 = new C0JT6<>("live_gift_user_first_time_sent_shiny_card_unique_id", String.class);
        e2 = new C20337914i1<>("live_strategy_params_cache_timing", Long.class, 0L);
        f2 = new C0JT6<>("live_premium_shop_guide_bubble_show_ids", String.class);
        g2 = new C0JT6<>("live_unlock_premium_shop_guide_bubble_show_ids", String.class);
        h2 = new C0JT6<>("live_vault_campaign_guide_bubble_show_ids", String.class);
        i2 = new C0JT6<>("live_vault_invitation_guide_bubble_show_ids", String.class);
        j2 = new C20337914i1<>("live_strategy_seven_days_task_big_animation", Boolean.class, bool);
        k2 = new C20337914i1<>("live_strategy_seven_days_task_big_animation_expire_time", new TypeToken<Long>() { // from class: X.0ea2
        }.getType(), 0L);
        l2 = new C20337914i1<>("live_strategy_seven_days_task_normal_animation_expire_time", new TypeToken<Long>() { // from class: X.0ea3
        }.getType(), 0L);
        m2 = new C20337914i1<>("live_strategy_seven_days_task_big_animation_every_day_limit_time", new TypeToken<List<Double>>() { // from class: X.0eZv
        }.getType(), new ArrayList());
        f140n2 = new C20337914i1<>("backpack_panel_insufficient_open_toast_shown", Boolean.class, bool2);
        o2 = new C20337914i1<>("live_goal_capsule_show_count", Integer.class, 0);
        f142p2 = new C20337914i1<>("live_audience_gift_poll_id", Long.class, 0L);
        q2 = new C20337914i1<>("live_goal_private_account_bubble_shown", Boolean.class, bool2);
        r2 = new C20337914i1<>("live_gifts_disabled_highlight_private_account_shown", Boolean.class, bool2);
        s2 = new C20337914i1<>("live_gifts_collab_gifting_last_display_fuel_gift_recommend_ui_session", String.class, "");
    }
}
