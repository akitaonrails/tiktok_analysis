package X;

import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0bcT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public interface InterfaceC980390bcT {
    public static final C20337914i1<Boolean> La;
    public static final C20337914i1<Boolean> Ma;
    public static final C20337914i1<Boolean> Na;
    public static final C20337914i1<Boolean> Oa;
    public static final C20337914i1<Boolean> Pa;
    public static final C20337914i1<Boolean> Qa;
    public static final C20337914i1<Boolean> Ra;
    public static final C20337914i1<Long> Sa;
    public static final C0JT6<Integer> Ta;
    public static final C0JT6<Boolean> Ua;
    public static final C20337914i1<Long> Va;
    public static final C20337914i1<Boolean> Wa;
    public static final C20337914i1<Boolean> Xa;
    public static final C20337914i1<Boolean> Ya;
    public static final C20337914i1<Long> za = new C20337914i1<>("individual_match_guide_show_timestamp", Long.class, 0L);
    public static final C20337914i1<Integer> Aa = new C20337914i1<>("individual_match_guide_show_count", Integer.class, 0);
    public static final C20337914i1<Integer> Ba = new C20337914i1<>("link_mic_battle_match_item_show_time", Integer.class, 0);
    public static final C20337914i1<Integer> Ca = new C20337914i1<>("link_mic_battle_match_item_show_time_extra_time", Integer.class, 0);
    public static final C20337914i1<Integer> Da = new C20337914i1<>("link_mic_battle_match_item_show_time_special_effect", Integer.class, 0);
    public static final C20337914i1<Integer> Ea = new C20337914i1<>("link_mic_battle_match_item_show_time_fan_hammer", Integer.class, 0);
    public static final C0JT6<ArrayList<String>> Fa = new C0JT6<>("link_mic_battle_match_item_show_time_top2_effect", new TypeToken<ArrayList<String>>() { // from class: X.0bch
    }.getType());
    public static final C20337914i1<Integer> Ga = new C20337914i1<>("individual_match_mode_guide_show_count", Integer.class, 0);
    public static final C20337914i1<Integer> Ha = new C20337914i1<>("individual_match_invite_mode_guide_show_count", Integer.class, 0);
    public static final C20337914i1<Integer> Ia = new C20337914i1<>("match_1vn_mode_guide_show_count", Integer.class, 0);
    public static final C20337914i1<String> Ja = new C20337914i1<>("match_1vn_last_selected_members_str", String.class, "");
    public static final C20337914i1<Long> Ka = new C20337914i1<>("match_1vn_last_selected_channel_id", Long.class, 0L);

    static {
        Boolean bool = Boolean.FALSE;
        La = new C20337914i1<>("link_mic_battle_match_item_award_critical_dialog_shown", Boolean.class, bool);
        Ma = new C20337914i1<>("link_mic_battle_match_item_award_smoke_dialog_shown", Boolean.class, bool);
        Na = new C20337914i1<>("link_mic_battle_match_item_award_extra_time_dialog_shown", Boolean.class, bool);
        Oa = new C20337914i1<>("link_mic_battle_match_item_award_special_effect_dialog_shown", Boolean.class, bool);
        Pa = new C20337914i1<>("link_mic_battle_match_item_award_top2_dialog_shown", Boolean.class, bool);
        Qa = new C20337914i1<>("link_mic_battle_match_item_award_top3_dialog_shown", Boolean.class, bool);
        Ra = new C20337914i1<>("link_mic_battle_match_item_vault_gloves_dialog_shown", Boolean.class, bool);
        Sa = new C20337914i1<>("live_record_room_message_time", Long.class, 0L);
        Ta = new C0JT6<>("match_playbook_guide_tooltip_shown_times", Integer.class);
        Ua = new C0JT6<>("match_playbook_pre_guide_not_clicked", Boolean.class);
        Va = new C20337914i1<>("match_community_gift_reddot_match_panel_first_shown_ms", Long.class, 0L);
        Wa = new C20337914i1<>("match_community_gift_reddot_dismissed", Boolean.class, bool);
        Xa = new C20337914i1<>("match_community_gift_settings_tooltip_shown", Boolean.class, bool);
        Ya = new C20337914i1<>("match_community_gift_specific_icon_dot_shown", Boolean.class, bool);
    }
}
