package X;

import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0b6s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public interface InterfaceC960800b6s {
    public static final C20337914i1<Boolean> LLJJJJLIIL;
    public static final C20337914i1<Boolean> LLJJL;
    public static final C20337914i1<Boolean> LLJJLIIIJLLLLLLLZ;
    public static final C20337914i1<Boolean> LLJL;
    public static final C20337914i1<Integer> LLJLIL;
    public static final C20337914i1<Long> LLJLILLLLZIIL;
    public static final C20337914i1<Integer> LLJLL;
    public static final C20337914i1<Long> LLJLLIL;
    public static final C20337914i1<Integer> LLJLLL;
    public static final C20337914i1<Integer> LLJZ;
    public static final C20337914i1<Integer> LLJZIJLIL;
    public static final C20337914i1<Integer> LLL;
    public static final C20337914i1<Integer> LLLF;
    public static final C20337914i1<Integer> LLLFF;
    public static final C20337914i1<Integer> LLLFFI;
    public static final C20337914i1<Boolean> LLLFZ;
    public static final C20337914i1<Boolean> LLLI;
    public static final C20337914i1<Integer> LLLII;
    public static final C20337914i1<Integer> LLLIIII;
    public static final C20337914i1<Integer> LLLIIIIL;
    public static final C20337914i1<Integer> LLLIIIL;
    public static final C20337914i1<Long> LLLIIL;
    public static final C20337914i1<Long> LLLIILIL;
    public static final C20337914i1<Integer> LLLIL;
    public static final C20337914i1<Long> LLLILZ;
    public static final C20337914i1<Integer> LLLILZJ;
    public static final C20337914i1<Long> LLLILZLLLI;
    public static final C20337914i1<Integer> LLLIZZ;
    public static final C20337914i1<Long> LLLJ;
    public static final C20337914i1<Boolean> LLLJIL;
    public static final C20337914i1<Integer> LLLJL;
    public static final C20337914i1<Long> LLLL;
    public static final C20337914i1<Boolean> LLLLII;
    public static final C20337914i1<Boolean> LLLLIIIILLL;
    public static final C20337914i1<Boolean> LLLLIIL;
    public static final C20337914i1<Boolean> LLLLIILL;
    public static final C20337914i1<Boolean> LLLLIILLL;
    public static final C20337914i1<Set<String>> LLLLIL;
    public static final C20337914i1<Boolean> LLLLILI;
    public static final C20337914i1<Long> LLLLJ;
    public static final C20337914i1<List<String>> LLLLJI;
    public static final C20337914i1<Boolean> LLLLL;
    public static final C20337914i1<Boolean> LLLLLIL;
    public static final C20337914i1<Boolean> LLLLLILLIL;
    public static final C20337914i1<Boolean> LLLLLJIL;
    public static final C20337914i1<Integer> LLLLLJLJLL;
    public static final C20337914i1<Boolean> LLLLLL;
    public static final C20337914i1<Boolean> LLLLLLIL;

    static {
        Boolean bool = Boolean.TRUE;
        LLJJJJLIIL = new C20337914i1<>("show_cohost_interact_guide_bubble", Boolean.class, bool);
        Boolean bool2 = Boolean.FALSE;
        LLJJL = new C20337914i1<>("had_showed_be_invited_screenshare_education", Boolean.class, bool2);
        LLJJLIIIJLLLLLLLZ = new C20337914i1<>("link_multi_co_host_had_show_tips", Boolean.class, bool2);
        LLJL = new C20337914i1<>("link_multi_co_host_network_exception_handler_switch", Boolean.class, bool2);
        LLJLIL = new C20337914i1<>("link_multi_co_host_unpolished_tips_times_shown", Integer.class, 0);
        LLJLILLLLZIIL = new C20337914i1<>("link_multi_co_host_unpolished_tips_last_room_id", Long.class, 0L);
        LLJLL = new C20337914i1<>("link_multi_co_host_show_large_random_linkmic", Integer.class, -1);
        LLJLLIL = new C20337914i1<>("link_multi_mode_guide_show_room_id", Long.class, -1L);
        LLJLLL = new C20337914i1<>("link_cohost_choose_panel_selected_plaza", Integer.class, 0);
        LLJZ = new C20337914i1<>("take_stage_mode_guide_show_count", Integer.class, 0);
        LLJZIJLIL = new C20337914i1<>("take_stage_mode_guide_v2_show_count", Integer.class, 0);
        LLL = new C20337914i1<>("link_cohost_take_the_stage_new_mode_v2_promot_shown_new_patch", Integer.class, 0);
        LLLF = new C20337914i1<>("link_cohost_take_the_stage_rotate_promot_shown", Integer.class, 0);
        LLLFF = new C20337914i1<>("link_cohost_take_the_stage_new_mode_guide_dialog_shown_invitee", Integer.class, 0);
        LLLFFI = new C20337914i1<>("link_cohost_take_the_stage_playing_dialog_tips", Integer.class, 0);
        LLLFZ = new C20337914i1<>("link_cohost_take_the_stage_v3_final_call_guide_shown_anchor", Boolean.class, bool2);
        LLLI = new C20337914i1<>("link_cohost_take_the_stage_v3_final_call_guide_shown_audience", Boolean.class, bool2);
        new C20337914i1("link_cohost_take_the_stage_gift_close_guide_not_show_again", Boolean.class, bool2);
        LLLII = new C20337914i1<>("link_cohost_take_the_stage_choose_mode_new_tag_count", Integer.class, 0);
        LLLIIII = new C20337914i1<>("link_cohost_take_the_stage_choose_mode_new_tag_v2_count", Integer.class, 0);
        LLLIIIIL = new C20337914i1<>("live_match_1vn_choose_mode_new_tag_count", Integer.class, 0);
        LLLIIIL = new C20337914i1<>("live_match_solo_match_choose_mode_new_tag_count", Integer.class, 0);
        LLLIIL = new C20337914i1<>("multi_co_host_show_feedback", Long.class, 0L);
        LLLIILIL = new C20337914i1<>("multi_co_host_submit_feedback", Long.class, 0L);
        LLLIL = new C20337914i1<>("multi_co_host_feedback_skip_count", Integer.class, 0);
        LLLILZ = new C20337914i1<>("multi_co_host_admit_feedback_timestamp", Long.class, 0L);
        LLLILZJ = new C20337914i1<>("multi_co_host_feedback_submit_version", Integer.class, 4510);
        LLLILZLLLI = new C20337914i1<>("multi_co_host_general_feedback_timestamp", Long.class, 0L);
        LLLIZZ = new C20337914i1<>("multi_co_host_recap_guide_display_cnt", Integer.class, 0);
        LLLJ = new C20337914i1<>("multi_co_host_recap_guide_display_timestamp", Long.class, 0L);
        LLLJIL = new C20337914i1<>("multi_co_host_recap_guide_connected", Boolean.class, bool2);
        LLLJL = new C20337914i1<>("multi_co_host_recap_guide_close_btn_click_cnt", Integer.class, 0);
        LLLL = new C20337914i1<>("multi_co_host_recap_guide_close_btn_click_timestamp", Long.class, 0L);
        LLLLII = new C20337914i1<>("multi_co_host_recap_guide_display_in_live", Boolean.class, bool2);
        LLLLIIIILLL = new C20337914i1<>("multi_co_host_in_share_screen", Boolean.class, bool2);
        LLLLIIL = new C20337914i1<>("multi_co_host_guide_frequency_control_skip", Boolean.class, bool2);
        LLLLIILL = new C20337914i1<>("had_co_host_invite_preview_prompt_dialog_click_continue", Boolean.class, bool2);
        LLLLIILLL = new C20337914i1<>("has_new_multi_guest_hint_animation_shown", Boolean.class, bool2);
        LLLLIL = new C20337914i1<>("live_gift_gallery_lit_up_badge_records", new TypeToken<Set<String>>() { // from class: X.0b6t
        }.getType(), new HashSet());
        LLLLILI = new C20337914i1<>("live_cohost_use_offlive_invite_styles", Boolean.class, bool2);
        LLLLJ = new C20337914i1<>("live_cohost_preview_offlive_banner_hide_count", Long.class, 0L);
        LLLLJI = new C20337914i1<>("live_cohost_search_record", new TypeToken<ArrayList<String>>() { // from class: X.0b6u
        }.getType(), new ArrayList());
        LLLLL = new C20337914i1<>("co_host_suggestion_share_dialog_button_click_first", Boolean.class, bool);
        LLLLLIL = new C20337914i1<>("co_host_suggestion_tooltip_shown", Boolean.class, bool2);
        LLLLLILLIL = new C20337914i1<>("had_showed_apply_screenshare_education_screenshare", Boolean.class, bool2);
        LLLLLJIL = new C20337914i1<>("had_showed_apply_screenshare_education_camera_only", Boolean.class, bool2);
        LLLLLJLJLL = new C20337914i1<>("cohost_setting_guide_show_time", Integer.class, 0);
        LLLLLL = new C20337914i1<>("cohost_subtitle_guide_panel_shown", Boolean.class, bool2);
        LLLLLLIL = new C20337914i1<>("cohost_subtitle_setting_updated_by_user", Boolean.class, bool2);
    }
}
