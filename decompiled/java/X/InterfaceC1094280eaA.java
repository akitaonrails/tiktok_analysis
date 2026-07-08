package X;

import com.bytedance.android.livesdkapi.host.IHostUser;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0eaA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public interface InterfaceC1094280eaA {
    public static final C0JT6<Map<String, String>> Ad;
    public static final C0JT6<Map<String, String>> Bd;
    public static final C0JT6<Map<String, String>> Cd;
    public static final C0JT6<Boolean> Dd;
    public static final C0JT6<Boolean> Ed;
    public static final C0JT6<Boolean> Fd;
    public static final C0JT6<Boolean> Gd;
    public static final C0JT6<Map<String, String>> Hd;
    public static final C0JT6<Map<String, String>> Id;
    public static final C0JT6<String> Jd;
    public static final C0JT6<Boolean> Kd;
    public static final C0JT6<String> Ld;
    public static final C20337914i1<Boolean> Md;
    public static final C20337914i1<Boolean> Nd;
    public static final C20337914i1<Boolean> Od;
    public static final C20337914i1<Boolean> Pd;
    public static final C20337914i1<Boolean> Qd;
    public static final C20337914i1<Long> ad = new C20337914i1<>("rookie_rank_tip_show_time", Long.class, 0L);
    public static final C20337914i1<Long> bd;
    public static final C20337914i1<Long> cd;
    public static final C20337914i1<Long> dd;
    public static final C0JT6<Boolean> ed;
    public static final C0JT6<Boolean> fd;
    public static final C0JT6<Boolean> gd;
    public static final C20337914i1<Long> hd;
    public static final C20337914i1<Long> id;
    public static final C20337914i1<Long> jd;
    public static final C0JT6<Boolean> kd;
    public static final C0JT6<Boolean> ld;
    public static final C0JT6<Boolean> md;
    public static final C0JT6<List<String>> nd;
    public static final C0JT6<Boolean> od;
    public static final C0JT6<Boolean> pd;
    public static final C0JT6<Map<String, String>> qd;
    public static final C0JT6<Map<String, Boolean>> rd;
    public static final C0JT6<Map<String, Boolean>> sd;
    public static final C0JT6<Map<String, Boolean>> td;
    public static final C0JT6<String> ud;
    public static final C0JT6<Map<String, String>> vd;
    public static final C0JT6<Boolean> wd;
    public static final C0JT6<String> xd;

    /* JADX INFO: renamed from: yd, reason: collision with root package name */
    public static final C0JT6<String> f143yd;
    public static final C0JT6<Map<String, String>> zd;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId());
        sbLIZ.append("live_rank_league_primilinary_rule_period");
        bd = new C20337914i1<>(C2188811AlT.LIZIZ(sbLIZ), Long.class, 0L);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId());
        sbLIZ2.append("live_rank_league_semifinal_rule_period");
        cd = new C20337914i1<>(C2188811AlT.LIZIZ(sbLIZ2), Long.class, 0L);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId());
        sbLIZ3.append("live_rank_league_final_rule_period");
        dd = new C20337914i1<>(C2188811AlT.LIZIZ(sbLIZ3), Long.class, 0L);
        ed = new C0JT6<>("live_rank_league_preliminary_rule_is_shown", Boolean.class);
        fd = new C0JT6<>("live_rank_league_semifinal_rule_is_shown", Boolean.class);
        gd = new C0JT6<>("live_rank_league_final_rule_is_shown", Boolean.class);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId());
        sbLIZ4.append("live_rank_league_primilinary_promotion_period");
        hd = new C20337914i1<>(C2188811AlT.LIZIZ(sbLIZ4), Long.class, 0L);
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId());
        sbLIZ5.append("live_rank_league_semifinal_promotion_period");
        id = new C20337914i1<>(C2188811AlT.LIZIZ(sbLIZ5), Long.class, 0L);
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId());
        sbLIZ6.append("live_rank_league_final_promotion_period");
        jd = new C20337914i1<>(C2188811AlT.LIZIZ(sbLIZ6), Long.class, 0L);
        kd = new C0JT6<>("live_rank_league_preliminary_promotion_is_shown", Boolean.class);
        ld = new C0JT6<>("live_rank_league_semifinal_promotion_is_shown", Boolean.class);
        md = new C0JT6<>("live_rank_league_final_promotion_is_shown", Boolean.class);
        nd = new C0JT6<>("live_creator_class_ranking_rest_card_id_list", new TypeToken<List<String>>() { // from class: X.0ea7
        }.getType());
        od = new C0JT6<>("live_creator_class_ranking_bottom_bar_red_dot_indicator", Boolean.class);
        pd = new C0JT6<>("live_popularity_ranking_education_dialog_shown", Boolean.class);
        qd = new C0JT6<>("live_popularity_ranking_first_period_to_reach_top_twenty_end_time", new TypeToken<Map<String, String>>() { // from class: X.0ea8
        }.getType());
        rd = new C0JT6<>("live_popularity_ranking_first_period_to_reach_top_twenty_indicator", new TypeToken<Map<String, Boolean>>() { // from class: X.0eZN
        }.getType());
        sd = new C0JT6<>("live_popularity_ranking_historical_sharing_page_is_displayed", new TypeToken<Map<String, Boolean>>() { // from class: X.0eZO
        }.getType());
        td = new C0JT6<>("live_popularity_ranking_historical_ranking_entrance_animation_is_displayed_in_current_period", new TypeToken<Map<String, Boolean>>() { // from class: X.0eZP
        }.getType());
        ud = new C0JT6<>("live_popularity_ranking_bonus_time_notice_first_display_time", String.class);
        vd = new C0JT6<>("live_popularity_ranking_entrance_bonus_time_animation_last_display_info", new TypeToken<Map<String, String>>() { // from class: X.0ea9
        }.getType());
        wd = new C0JT6<>("live_creator_league_match_campaign_ranking_is_opt_out", Boolean.class);
        xd = new C0JT6<>("live_creator_league_match_campaign_ranking_stage", String.class);
        f143yd = new C0JT6<>("live_creator_league_match_campaign_ranking_end_time", String.class);
        zd = new C0JT6<>("live_creator_ranking_page_notice_close_count", new TypeToken<Map<String, String>>() { // from class: X.0eaC
        }.getType());
        Ad = new C0JT6<>("live_creator_ranking_page_notice_last_close_timestamp", new TypeToken<Map<String, String>>() { // from class: X.0eaD
        }.getType());
        Bd = new C0JT6<>("live_creator_ranking_page_notice_end_timestamp", new TypeToken<Map<String, String>>() { // from class: X.0eaE
        }.getType());
        Cd = new C0JT6<>("live_friends_ranking_suggest_match_capsule_freq", new TypeToken<Map<String, String>>() { // from class: X.0ea4
        }.getType());
        Dd = new C0JT6<>("live_creator_ranking_friend_guide_panel_shown", Boolean.class);
        Ed = new C0JT6<>("live_creator_ranking_friend_guide_tooltip_shown", Boolean.class);
        Fd = new C0JT6<>("live_creator_ranking_match_recommend_privacy_confirm_skipped", Boolean.class);
        Gd = new C0JT6<>("live_creator_ranking_match_recommend_notification_confirm_shown", Boolean.class);
        Hd = new C0JT6<>("live_creator_ranking_last_tiles_threshold", new TypeToken<Map<String, String>>() { // from class: X.0ea5
        }.getType());
        Id = new C0JT6<>("live_creator_ranking_period_end_timestamp", new TypeToken<Map<String, String>>() { // from class: X.0ea6
        }.getType());
        Jd = new C0JT6<>("creator_class_rank_bottom_loop_times", String.class);
        Kd = new C0JT6<>("live_music_spotlight_first_launch_animation_displayed", Boolean.class);
        Ld = new C0JT6<>("live_ranking_public_screen_message_last_display_timestamp", String.class);
        Boolean bool = Boolean.FALSE;
        Md = new C20337914i1<>("daily_rank_sticker_auto_switch", Boolean.class, bool);
        Nd = new C20337914i1<>("game_daily_rank_sticker_auto_switch", Boolean.class, bool);
        Od = new C20337914i1<>("team_rank_sticker_auto_switch", Boolean.class, bool);
        Pd = new C20337914i1<>("team_rank_sticker_delay_set", Boolean.class, bool);
        Qd = new C20337914i1<>("hourly_rank_sticker_auto_switch", Boolean.class, bool);
    }
}
