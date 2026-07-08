package X;

import com.bytedance.android.livesdk.model.LastUsedLiveBoardsModel;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0KPJ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public interface C0KPJ {
    public static final C0JT6<String> Ae;
    public static final C20337914i1<Boolean> Be;
    public static final C20337914i1<Boolean> Ce;
    public static final C20337914i1<Integer> De;
    public static final C20337914i1<Boolean> Ee;
    public static final C20337914i1<Boolean> Fe;
    public static final C20337914i1<Boolean> Ge;
    public static final C20337914i1<List<String>> He;
    public static final C0JT6<Boolean> Ie;
    public static final C0JT6<Boolean> Je;
    public static final C0JT6<Boolean> Ke;
    public static final C20337914i1<Long> Le;
    public static final C20337914i1<Boolean> Me;
    public static final C0JT6<Map<String, List<String>>> Ne;
    public static final C0JT6<List<Long>> Oe;
    public static final C20337914i1<Long> Pe;
    public static final C20337914i1<Long> Qe;
    public static final C20337914i1<Map<String, Boolean>> Re;
    public static final C20337914i1<Boolean> Se;
    public static final C20337914i1<Boolean> Te;
    public static final C20337914i1<String> Ue;
    public static final C0JT6<Boolean> Ve;
    public static final C0JT6<Boolean> We;
    public static final C0JT6<Boolean> Xe;
    public static final C20337914i1<Boolean> Ye;
    public static final C20337914i1<Map<String, Boolean>> Ze;
    public static final C20337914i1<Map<String, Boolean>> af;
    public static final C0JT6<Boolean> bf;
    public static final C0JT6<Boolean> cf;
    public static final C0JT6<Map<String, String>> df;
    public static final C20337914i1<Integer> ef;
    public static final C20337914i1<Boolean> fe;
    public static final C20337914i1<Long> ff;

    /* JADX INFO: renamed from: ge, reason: collision with root package name */
    public static final C20337914i1<Map<String, Boolean>> f120ge;
    public static final C20337914i1<Boolean> gf;
    public static final C20337914i1<Boolean> he;
    public static final C20337914i1<Boolean> hf;
    public static final C20337914i1<Boolean> ie;

    /* JADX INFO: renamed from: if, reason: not valid java name */
    public static final C20337914i1<Long> f1if;
    public static final C0JT6<Boolean> je;
    public static final C20337914i1<Integer> jf;
    public static final C0JT6<String> ke;

    /* JADX INFO: renamed from: kf, reason: collision with root package name */
    public static final C20337914i1<Map<String, String>> f121kf;
    public static final C0JT6<Map<String, Boolean>> le;
    public static final C20337914i1<Boolean> lf;

    /* JADX INFO: renamed from: me, reason: collision with root package name */
    public static final C0JT6<Boolean> f122me;

    /* JADX INFO: renamed from: mf, reason: collision with root package name */
    public static final C20337914i1<Long> f123mf;
    public static final C0JT6<String> ne;
    public static final C20337914i1<Long> nf;
    public static final C0JT6<Boolean> oe;
    public static final C20337914i1<Boolean> of;
    public static final C0JT6<Boolean> pe;
    public static final C20337914i1<LastUsedLiveBoardsModel> pf;
    public static final C0JT6<Double> qe;
    public static final C20337914i1<Long> qf;
    public static final C0JT6<Double> re;
    public static final C20337914i1<Long> rf;
    public static final C0JT6<Boolean> se;
    public static final C20337914i1<Long> sf;
    public static final C20337914i1<Map<String, String>> te;
    public static final C20337914i1<Long> tf;
    public static final C20337914i1<Map<String, String>> ue;
    public static final C20337914i1<Boolean> uf;
    public static final C20337914i1<Boolean> ve;
    public static final C0JT6<Map<String, Boolean>> vf;
    public static final C0JT6<String> we;
    public static final C0JT6<Boolean> wf;
    public static final C0JT6<Boolean> xe;
    public static final C0JT6<Long> xf;
    public static final C20337914i1<Boolean> ye;
    public static final C0JT6<HashMap<String, String>> yf;
    public static final C0JT6<Boolean> ze;

    static {
        Boolean bool = Boolean.TRUE;
        fe = new C20337914i1<>("multi_guest_board_created_first_time", Boolean.class, bool);
        f120ge = new C20337914i1<>("live_subscribe_chat_only_switch_new", new TypeToken<Map<String, Boolean>>() { // from class: X.0KPP
        }.getType(), new HashMap());
        he = new C20337914i1<>("live_subscribe_show_preview_reddot", Boolean.class, bool);
        ie = new C20337914i1<>("live_subscribe_gaming_perks_show_preview_reddot", Boolean.class, bool);
        je = new C0JT6<>("live_sucscribe_finished_guide", Boolean.class);
        ke = new C0JT6<>("live_subscribe_shown_sub_only_live_guide_for_sub_goal", String.class);
        new C0JT6("live_subscribe_setting_page_tips_show_times_map", new TypeToken<Map<String, String>>() { // from class: X.0KPX
        }.getType());
        le = new C0JT6<>("live_subscribe_dsa_appeal_success_shown", new TypeToken<Map<String, Boolean>>() { // from class: X.0KPQ
        }.getType());
        f122me = new C0JT6<>("live_room_subscribe_has_shown_sub_only_live_guide_for_sub_goal", Boolean.class);
        ne = new C0JT6<>("live_room_subscribe_shown_sub_only_live_guide_for_sub_goal", String.class);
        oe = new C0JT6<>("live_subscribe_item_email_bind_banner", Boolean.class);
        pe = new C0JT6<>("live_subscribe_subathon_faq", Boolean.class);
        qe = new C0JT6<>("live_subscribe_payment_last_show_questionnaire_timestamp", Double.class);
        re = new C0JT6<>("live_subscribe_payment_total_show_questionnaire_times", Double.class);
        se = new C0JT6<>("live_sub_wave_guide_shown", Boolean.class);
        te = new C20337914i1<>("live_subscribe_link_share_inner", new TypeToken<HashMap<String, String>>() { // from class: X.0KPY
        }.getType(), new HashMap());
        ue = new C20337914i1<>("live_subscribe_link_share_outer", new TypeToken<HashMap<String, String>>() { // from class: X.0KPZ
        }.getType(), new HashMap());
        Boolean bool2 = Boolean.FALSE;
        ve = new C20337914i1<>("anchor_subscribe_goal_guide_has_shown", Boolean.class, bool2);
        we = new C0JT6<>("live_sucscribe_badge_icon", String.class);
        xe = new C0JT6<>("live_subscribe_status_fail_tip_closed", Boolean.class);
        new C0JT6("live_subscribe_preview_on_boarding_bubble_showed", Boolean.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId());
        sbLIZ.append("_live_subscribe_first_show_inviation_page");
        ye = new C20337914i1<>(C2188811AlT.LIZIZ(sbLIZ), Boolean.class, bool);
        ze = new C0JT6<>("live_subscribe_first_show_invitation_activity", Boolean.class);
        Ae = new C0JT6<>("live_subscribe_active_subs_new_updates_last_entered", String.class);
        Be = new C20337914i1<>("subscription_spotlight_red_dot_enable", Boolean.class, bool);
        new C20337914i1("subscription_bubble_controller", new TypeToken<HashMap<String, List<String>>>() { // from class: X.0KPR
        }.getType(), new HashMap());
        Ce = new C20337914i1<>("has_shown_sub_space_comment_legal_notice", Boolean.class, bool2);
        De = new C20337914i1<>("sub_space_guide_show_times", Integer.class, 0);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId());
        sbLIZ2.append("_live_subscribe_show_update_paypal");
        Ee = new C20337914i1<>(C2188811AlT.LIZIZ(sbLIZ2), Boolean.class, bool);
        Fe = new C20337914i1<>("live_sub_space_privilege_tab_click", Boolean.class, bool2);
        Ge = new C20337914i1<>("game_subscribe_emote_is_located", Boolean.class, bool2);
        new C0JT6("has_show_subs_c2c_transform_guide", new TypeToken<List<String>>() { // from class: X.0KPa
        }.getType());
        He = new C20337914i1<>("has_show_guide_subscription_bubble", new TypeToken<ArrayList<String>>() { // from class: X.0KPb
        }.getType(), new ArrayList());
        new C0JT6("subscription_gift_hint_dialog_shown", Boolean.class);
        Ie = new C0JT6<>("subscription_has_click_badge_setting_entrance", Boolean.class);
        Je = new C0JT6<>("live_subscription_sub_only_long_duration_preview", Boolean.class);
        Ke = new C0JT6<>("live_subscription_sub_only_long_duration_preview_shown", Boolean.class);
        Le = new C20337914i1<>("subscription_price_change_shown", Long.class, -1L);
        Me = new C20337914i1<>("subscription_guidance_testing_using_minutes", Boolean.class, bool2);
        Ne = new C0JT6<>("sub_guidance_sub_only_chat_scene_show_record", new TypeToken<Map<String, List<String>>>() { // from class: X.0KPS
        }.getType());
        Oe = new C0JT6<>("sub_guidance_sub_only_chat_card_room_id_record", new TypeToken<List<Long>>() { // from class: X.0KPT
        }.getType());
        Pe = new C20337914i1<>("smb_one_stop_shop_entrance_bubble_seen_timestamp", Long.class, 0L);
        Qe = new C20337914i1<>("smb_one_stop_shop_settings_red_dot_seen_timestamp", Long.class, 0L);
        Re = new C20337914i1<>("pcs_oss_has_seen_daily_challenges", new TypeToken<C08II<String, String>>() { // from class: X.0KPc
        }.getType(), new C08II(20));
        Se = new C20337914i1<>("anchor_interact_playbook_bubble_has_seen", Boolean.class, bool2);
        Te = new C20337914i1<>("anchor_playbook_has_seen_smb_tab", Boolean.class, bool2);
        Ue = new C20337914i1<>("pre_download_game_intro_card", String.class, "");
        Ve = new C0JT6<>("live_subscription_sub_only_allow_music_confirmation_shown", Boolean.class);
        We = new C0JT6<>("live_subscription_sub_only_allow_music_dialog_shown", Boolean.class);
        Xe = new C0JT6<>("live_subscription_sub_only_vip_intro_dialog_shown", Boolean.class);
        Ye = new C20337914i1<>("live_sub_wave_rewards_clicked_in_setting_page", Boolean.class, bool2);
        Ze = new C20337914i1<>("live_sub_wave_emote_green_circle", new TypeToken<HashMap<String, Boolean>>() { // from class: X.0KPK
        }.getType(), new HashMap());
        af = new C20337914i1<>("live_suggest_user_emote_green_circle", new TypeToken<HashMap<String, Boolean>>() { // from class: X.0KPL
        }.getType(), new HashMap());
        new C20337914i1("live_sub_approved_emote_latest_create_time", new TypeToken<HashMap<String, Double>>() { // from class: X.0KPM
        }.getType(), new HashMap());
        bf = new C0JT6<>("live_sub_only_video_list_reach_3_shown", Boolean.class);
        cf = new C0JT6<>("live_sub_only_video_list_reach_3_perk_guide_closed", Boolean.class);
        df = new C0JT6<>("live_sub_only_live_vip_choice", new TypeToken<Map<String, String>>() { // from class: X.0KPU
        }.getType());
        new C0JT6("live_subscribe_item_preview_creation_banner", Boolean.class);
        new C0JT6("sub_emote_guidance_tip_show_timestamp", String.class);
        ef = new C20337914i1<>("live_ai_summary_board_intro_times", Integer.class, 0);
        ff = new C20337914i1<>("live_ai_summary_board_text_intro_id", Long.class, 0L);
        gf = new C20337914i1<>("live_broadcast_boards_guide_lynx_page_show", Boolean.class, bool);
        hf = new C20337914i1<>("live_broadcast_board_intelligent_tooltips_show", Boolean.class, bool2);
        new C20337914i1("live_broadcast_multi_guest_with_general_boards_guide_page_show", Boolean.class, bool);
        f1if = new C20337914i1<>("live_multi_guest_last_used_multi_guest_time", Long.class, 0L);
        jf = new C20337914i1<>("live_board_last_selected_tab", Integer.class, 0);
        f121kf = new C20337914i1<>("live_broadcast_board_approved_green_circle", new TypeToken<HashMap<String, String>>() { // from class: X.0KPV
        }.getType(), new HashMap());
        new C20337914i1("live_broadcast_board_upsert_first_time", Boolean.class, bool);
        new C20337914i1("live_broadcast_intelligent_board_use_first_time", Boolean.class, bool);
        lf = new C20337914i1<>("live_broadcast_decoration_board_cc_use_first_time", Boolean.class, bool);
        f123mf = new C20337914i1<>("live_broadcast_board_intelligent_update_time", Long.class, 0L);
        nf = new C20337914i1<>("live_broadcast_board_intelligent_for_u_index", Long.class, 0L);
        of = new C20337914i1<>("live_broadcast_decoration_entrance_bubble_shown", Boolean.class, bool2);
        new C20337914i1("live_broadcast_decoration_entrance_reddot_shown", Boolean.class, bool2);
        new C20337914i1("live_broadcast_preview_decoration_entrance_reddot_shown", Boolean.class, bool2);
        pf = new C20337914i1<>("last_used_live_boards", LastUsedLiveBoardsModel.class, new LastUsedLiveBoardsModel());
        qf = new C20337914i1<>("live_board_request_effect_time_record", Long.class, 0L);
        rf = new C20337914i1<>("live_boards_aigc_last_shown_timestamp", Long.class, 0L);
        sf = new C20337914i1<>("live_boards_aigc_claimer_last_shown_timestamp", Long.class, 0L);
        tf = new C20337914i1<>("live_boards_aigc_claimer_shows_times", Long.class, 0L);
        uf = new C20337914i1<>("live_boards_aigc_claimer_last_result", Boolean.class, bool2);
        vf = new C0JT6<>("live_pcs_calendar_has_been_inserted_map", new TypeToken<Map<String, Boolean>>() { // from class: X.0KPN
        }.getType());
        wf = new C0JT6<>("live_kyc_kyb_guidance_go_live_preview", Boolean.class);
        new C20337914i1("leads_ads_pin_card_dismiss_record", new TypeToken<HashMap<String, Boolean>>() { // from class: X.0KPO
        }.getType(), new HashMap());
        xf = new C0JT6<>("pcs_form_local_prefill_opt_in", Long.class);
        yf = new C0JT6<>("pcs_form_prefill_values", new TypeToken<HashMap<String, String>>() { // from class: X.0KPW
        }.getType());
    }
}
