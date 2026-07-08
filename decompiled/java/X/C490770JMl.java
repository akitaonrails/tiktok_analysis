package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0JMl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C490770JMl {
    public static final Map<String, Object> LIZ = new LinkedHashMap();

    public static Map LIZIZ() {
        C13DA c13da = new C13DA();
        c13da.put("course_video_type", "paid");
        return c13da.build();
    }

    public static Object LIZ(String str) {
        return ((LinkedHashMap) LIZ).get(str);
    }

    public static Map LIZJ(long j) {
        C13DA c13da = new C13DA();
        c13da.put("video_id", Long.valueOf(j));
        c13da.put("course_id", LIZ("course_id"));
        c13da.put("course_video_type", "paid");
        c13da.put("start_mode", "cold_start");
        c13da.put("enter_from", c13da.get("enter_from"));
        return c13da.build();
    }

    public static void LIZLLL(Long l, String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_course_play_page");
        c474500IjALIZ.LJJII(LIZ("anchor_id"), "anchor_id");
        c474500IjALIZ.LJJII(LIZ("user_id"), "user_id");
        c474500IjALIZ.LJJII(LIZ("enter_from"), "enter_from");
        c474500IjALIZ.LJJII(LIZ("course_id"), "course_id");
        c474500IjALIZ.LJJII(l, "video_id");
        c474500IjALIZ.LJJII(str2, "click_position");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(0, "mute_status");
        c474500IjALIZ.LIZ();
    }

    public static void LJ(Long l, String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_course_play_report_panel");
        c474500IjALIZ.LJJII(LIZ("anchor_id"), "anchor_id");
        c474500IjALIZ.LJJII(LIZ("enter_from"), "enter_from");
        c474500IjALIZ.LJJII(str2, "click_position");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(LIZ("course_id"), "course_id");
        c474500IjALIZ.LJJII(l, "video_id");
        c474500IjALIZ.LIZ();
    }
}
