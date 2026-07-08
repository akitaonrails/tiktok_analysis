package X;

import com.bytedance.android.livesdk.model.AnchorLiveManagerEntranceInfo;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import webcast.data.BottomContainerComponent;

/* JADX INFO: renamed from: X.0UKZ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public interface C0UKZ {
    public static final C20337914i1<Boolean> LJLJJLL;
    public static final C20337914i1<Boolean> LJLJL;
    public static final C20337914i1<Boolean> LJLJLJ;
    public static final C20337914i1<Boolean> LJLJLLL;
    public static final C20337914i1<String> LJLL;
    public static final C20337914i1<Boolean> LJLLI;
    public static final C0JT6<Boolean> LJLLILLLL;
    public static final C0JT6<Boolean> LJLLJ;
    public static final C0JT6<Boolean> LJLLL;
    public static final C20337914i1<Boolean> LJLLLL;
    public static final C20337914i1<Long> LJLLLLLL;
    public static final C20337914i1<Long> LJLZ;
    public static final C20337914i1<Boolean> LJZ;
    public static final C20337914i1<Boolean> LJZI;
    public static final C0JT6<Boolean> LJZL;
    public static final C0JT6<Double> LL;
    public static final C0JT6<Boolean> LLD;
    public static final C0JT6<Double> LLF;
    public static final C20337914i1<Boolean> LLFF;
    public static final C20337914i1<Integer> LLFFF;
    public static final C0JT6<Boolean> LLFII;
    public static final C0JT6<Boolean> LLFZ;
    public static final C20337914i1<Long> LLI;
    public static final C20337914i1<Long> LLIFFJFJJ;
    public static final C0JT6<Boolean> LLII;
    public static final C20337914i1<List<String>> LLIIII;
    public static final C0JT6<Boolean> LLIIIILZ;
    public static final C0JT6<Boolean> LLIIIJ;
    public static final C0JT6<Integer> LLIIIL;
    public static final C0JT6<Boolean> LLIIIZ;
    public static final C20337914i1<Integer> LLIIJI;
    public static final C20337914i1<Long> LLIIJLIL;
    public static final C20337914i1<Boolean> LLIIL;
    public static final C20337914i1<HashSet<String>> LLIILII;
    public static final C20337914i1<Map<Long, Boolean>> LLIILZL;
    public static final C0JT6<Boolean> LLIIZ;
    public static final C20337914i1<AnchorLiveManagerEntranceInfo> LLIL;
    public static final C20337914i1<Map<String, List<BottomContainerComponent>>> LLILII;
    public static final C20337914i1<Map<String, List<BottomContainerComponent>>> LLILIL;
    public static final C20337914i1<Map<String, Boolean>> LLILL;
    public static final C20337914i1<Map<String, Boolean>> LLILLIZIL;
    public static final C20337914i1<Map<String, Boolean>> LLILLJJLI;
    public static final C20337914i1<Map<String, Boolean>> LLILLL;
    public static final C20337914i1<Map<String, Boolean>> LLILZ;
    public static final C20337914i1<Integer> LLILZIL;
    public static final C0JT6<Boolean> LLILZLL;
    public static final C20337914i1<Map<String, Integer>> LLIZ;
    public static final C20337914i1<Map<String, Integer>> LLIZLLLIL;
    public static final C0JT6<Boolean> LLJ;
    public static final C0JT6<Boolean> LLJI;
    public static final C20337914i1<Long> LLJIJIL;
    public static final C20337914i1<Boolean> LLJILJIL;
    public static final C20337914i1<Boolean> LLJILJILJ;
    public static final C20337914i1<Boolean> LLJILLL;
    public static final C20337914i1<Boolean> LLJJ;
    public static final C20337914i1<Boolean> LLJJI;
    public static final C20337914i1<Boolean> LLJJIII;
    public static final C20337914i1<Long> LLJJIJI;
    public static final C20337914i1<String> LLJJIJIIJIL;
    public static final C20337914i1<Boolean> LLJJIJIL;
    public static final C20337914i1<String> LLJJJ;
    public static final C20337914i1<Boolean> LLJJJIL;
    public static final C20337914i1<Boolean> LLJJJJ;
    public static final C20337914i1<Boolean> LLJJJJJIL;

    static {
        Boolean bool = Boolean.FALSE;
        LJLJJLL = new C20337914i1<>("preview_viewer_wishes_clicked", Boolean.class, bool);
        Boolean bool2 = Boolean.TRUE;
        LJLJL = new C20337914i1<>("live_practice_mode_setting_tooltip", Boolean.class, bool2);
        LJLJLJ = new C20337914i1<>("live_show_preview_setting_red_dot", Boolean.class, bool2);
        LJLJLLL = new C20337914i1<>("server_enable_highlight_button", Boolean.class, bool);
        LJLL = new C20337914i1<>("last_show_highlight_fragment_id", String.class, "");
        LJLLI = new C20337914i1<>("live_show_growth_mvp_tooltip", Boolean.class, bool);
        LJLLILLLL = new C0JT6<>("live_l0_enter_preview_is_first_time", Boolean.class);
        LJLLJ = new C0JT6<>("live_l1_enter_preview_is_first_time", Boolean.class);
        LJLLL = new C0JT6<>("live_l2_enter_preview_is_first_time", Boolean.class);
        LJLLLL = new C20337914i1<>("live_l1_first_enter_preview_v2", Boolean.class, bool2);
        LJLLLLLL = new C20337914i1<>("dark_scene_toast_show_time", Long.class, 0L);
        LJLZ = new C20337914i1<>("dark_detect_guide_exposure_animation_show_time", Long.class, 0L);
        LJZ = new C20337914i1<>("preview_page_brightness_detect", Boolean.class, bool2);
        LJZI = new C20337914i1<>("live_goal_confirm_dialog_show", Boolean.class, bool);
        LJZL = new C0JT6<>("live_pro_banner_clicked", Boolean.class);
        LL = new C0JT6<>("live_pro_banner_show_count", Double.class);
        LLD = new C0JT6<>("game_pro_banner_clicked", Boolean.class);
        LLF = new C0JT6<>("game_pro_banner_show_count", Double.class);
        LLFF = new C20337914i1<>("live_preivew_livegoal_guide_shown", Boolean.class, bool);
        LLFFF = new C20337914i1<>("preview_more_widget_fold_state", Integer.class, 1);
        LLFII = new C0JT6<>("preview_more_widget_recent_streamed_v2", Boolean.class);
        LLFZ = new C0JT6<>("preview_live_mode_guide_animation_showed", Boolean.class);
        LLI = new C20337914i1<>("last_enter_preview_page_time", Long.class, -1L);
        LLIFFJFJJ = new C20337914i1<>("last_enter_video_broadcast_preview_timestamp", Long.class, 0L);
        LLII = new C0JT6<>("live_need_continue_live_request", Boolean.class);
        LLIIII = new C20337914i1<>("live_go_live_resolution_record", new TypeToken<List<String>>() { // from class: X.0UKc
        }.getType(), new ArrayList());
        LLIIIILZ = new C0JT6<>("has_shown_golive_allinone_tooltip", Boolean.class);
        LLIIIJ = new C0JT6<>("has_shown_golive_personal_link_service_plus_tooltip", Boolean.class);
        LLIIIL = new C0JT6<>("last_seen_live_scripts_version", Integer.class);
        LLIIIZ = new C0JT6<>("live_preview_push_guide_showed", Boolean.class);
        LLIIJI = new C20337914i1<>("game_decoupling_banner_show_times", Integer.class, 0);
        LLIIJLIL = new C20337914i1<>("game_decoupling_banner_last_time", Long.class, 0L);
        LLIIL = new C20337914i1<>("has_show_decoupling_auto_popup", Boolean.class, bool);
        LLIILII = new C20337914i1<>("has_show_decoupling_auto_popup_set", new TypeToken<Set<String>>() { // from class: X.0UKd
        }.getType(), new HashSet());
        LLIILZL = new C20337914i1<>("live_new_anchor_incentive_banner_show", new TypeToken<HashMap<Long, Boolean>>() { // from class: X.012u
        }.getType(), new HashMap());
        LLIIZ = new C0JT6<>("live_no_permission_guide_shown", Boolean.class);
        LLIL = new C20337914i1<>("live_manager_entrance_info", AnchorLiveManagerEntranceInfo.class, new AnchorLiveManagerEntranceInfo());
        LLILII = new C20337914i1<>("live_preview_revision_bottom_record", new TypeToken<HashMap<String, List<BottomContainerComponent>>>() { // from class: X.0UKa
        }.getType(), new HashMap());
        LLILIL = new C20337914i1<>("live_preview_revision_bottom_record_voice", new TypeToken<HashMap<String, List<BottomContainerComponent>>>() { // from class: X.0UKb
        }.getType(), new HashMap());
        LLILL = new C20337914i1<>("preview_revision_board_bubble_show_record", new TypeToken<HashMap<String, Boolean>>() { // from class: X.012v
        }.getType(), new HashMap());
        LLILLIZIL = new C20337914i1<>("preview_revision_subscription_bubble_show_record", new TypeToken<HashMap<String, Boolean>>() { // from class: X.012w
        }.getType(), new HashMap());
        LLILLJJLI = new C20337914i1<>("preview_revision_goal_in_title_bubble_show_record", new TypeToken<HashMap<String, Boolean>>() { // from class: X.012x
        }.getType(), new HashMap());
        LLILLL = new C20337914i1<>("preview_revision_goal_in_bottom_bubble_show_record", new TypeToken<HashMap<String, Boolean>>() { // from class: X.012y
        }.getType(), new HashMap());
        LLILZ = new C20337914i1<>("preview_revision_more_guide_record", new TypeToken<HashMap<String, Boolean>>() { // from class: X.012r
        }.getType(), new HashMap());
        LLILZIL = new C20337914i1<>("preview_decoupling_center_marquee_times", Integer.class, 0);
        LLILZLL = new C0JT6<>("live_anchor_ai_reply_assistant_tip", Boolean.class);
        LLIZ = new C20337914i1<>("ecom_growth_line_banner_show_times", new TypeToken<HashMap<String, Integer>>() { // from class: X.012s
        }.getType(), new HashMap(8));
        LLIZLLLIL = new C20337914i1<>("ecom_growth_line_banner_click_times", new TypeToken<HashMap<String, Integer>>() { // from class: X.012t
        }.getType(), new HashMap(2));
        LLJ = new C0JT6<>("show_live_replay_prompt_uid", Boolean.class);
        LLJI = new C0JT6<>("show_live_replay_prompt_private_account_uid", Boolean.class);
        LLJIJIL = new C20337914i1<>("live_partnership_info_update_click", Long.class, 0L);
        LLJILJIL = new C20337914i1<>("live_show_preview_moderator_setting_red_dot", Boolean.class, bool2);
        LLJILJILJ = new C20337914i1<>("live_show_preview_comments_setting_red_dot", Boolean.class, bool2);
        LLJILLL = new C20337914i1<>("live_show_mature_setting_red_dot", Boolean.class, bool2);
        LLJJ = new C20337914i1<>("live_show_preview_mature_setting_red_dot", Boolean.class, bool2);
        LLJJI = new C20337914i1<>("live_show_moderator_setting_red_dot", Boolean.class, bool2);
        LLJJIII = new C20337914i1<>("live_show_bc_toggle_setting_red_dot", Boolean.class, bool2);
        LLJJIJI = new C20337914i1<>("live_hashtag_id", Long.class, 0L);
        LLJJIJIIJIL = new C20337914i1<>("live_hashtag_name", String.class, "none");
        LLJJIJIL = new C20337914i1<>("live_has_ever_use_hashtag", Boolean.class, bool);
        LLJJJ = new C20337914i1<>("live_hashtag_gs", String.class, "");
        LLJJJIL = new C20337914i1<>("live_intro_preview_setting_entrance", Boolean.class, bool2);
        LLJJJJ = new C20337914i1<>("show_location_bubble_in_preview", Boolean.class, bool);
        LLJJJJJIL = new C20337914i1<>("first_enter_location_setting_sheet", Boolean.class, bool2);
    }
}
