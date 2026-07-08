package X;

import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0eZE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public interface InterfaceC1093700eZE {
    public static final C0JT6<Double> Jf = new C0JT6<>("live_user_level_from_level_map_tag", Double.class);
    public static final C0JT6<String> Kf = new C0JT6<>("live_user_level_model_state_cache", String.class);
    public static final C0JT6<Map<String, List<String>>> Lf = new C0JT6<>("live_user_level_show_privilege_map", new TypeToken<Map<String, List<String>>>() { // from class: X.0eZD
    }.getType());
    public static final C0JT6<List<String>> Mf = new C0JT6<>("live_upgrade_member_level_red_dot_anchor_list", new TypeToken<List<String>>() { // from class: X.0eZF
    }.getType());
    public static final C0JT6<Boolean> Nf = new C0JT6<>("live_upgrade_member_level_guide_bubble_shown", Boolean.class);
    public static final C0JT6<List<String>> Of = new C0JT6<>("live_fans_club_community_gameplay_guide_anim_cache", new TypeToken<List<String>>() { // from class: X.0eZG
    }.getType());
    public static final C0JT6<String> Pf = new C0JT6<>("live_user_level_will_sleep_timestamp", String.class);
    public static final C0JT6<Boolean> Qf = new C0JT6<>("live_user_level_last_time_is_upgrade", Boolean.class);
    public static final C0JT6<String> Rf = new C0JT6<>("live_enter_room_grade_info_request_timestamp", String.class);
    public static final C0JT6<Map<String, String>> Sf = new C0JT6<>("live_fans_club_entrance_guide_trigger_cache", new TypeToken<Map<String, String>>() { // from class: X.0eZH
    }.getType());
    public static final C0JT6<Map<String, String>> Tf = new C0JT6<>("live_fans_club_entrance_guide_trigger_cache_capsule", new TypeToken<Map<String, String>>() { // from class: X.0eZI
    }.getType());
    public static final C0JT6<Map<String, String>> Uf = new C0JT6<>("live_fans_club_entrance_guide_trigger_cache_publish_screen", new TypeToken<Map<String, String>>() { // from class: X.0eZJ
    }.getType());
    public static final C0JT6<Map<String, String>> Vf;
    public static final C0JT6<Map<String, String>> Wf;

    static {
        new C0JT6("live_fans_club_entrance_guide_trigger_cache_fan_club_entrance", new TypeToken<Map<String, String>>() { // from class: X.0eZK
        }.getType());
        Vf = new C0JT6<>("live_fans_club_entrance_guide_trigger_cache_guide_bubble", new TypeToken<Map<String, String>>() { // from class: X.0eZL
        }.getType());
        Wf = new C0JT6<>("live_fans_club_entrance_guide_trigger_cache_guide_room_info", new TypeToken<Map<String, String>>() { // from class: X.0eZM
        }.getType());
    }
}
