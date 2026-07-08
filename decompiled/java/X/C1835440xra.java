package X;

import com.bytedance.android.livesdk.userservice.UserService;

/* JADX INFO: renamed from: X.0xra, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1835440xra {
    public static final C1835440xra LIZ = new C1835440xra();
    public static String LIZIZ = "anchor";

    public static C2344009Gk LIZ() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("anchor_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        C1833570xoZ.LIZ.getClass();
        c2344009Gk.LJIIIIZZ("enter_from_page", C1833570xoZ.LIZIZ);
        c2344009Gk.LJIIIIZZ("enter_from", C1833570xoZ.LIZJ);
        c2344009Gk.LJIIIIZZ("event_page", "live_replay");
        return c2344009Gk;
    }

    public static void LIZLLL(String str, String str2) {
        C2344009Gk c2344009GkLIZ = LIZ();
        c2344009GkLIZ.LJIIIIZZ("action_type", "click");
        c2344009GkLIZ.LJIIIIZZ("click_type", str2);
        c2344009GkLIZ.LJIIIIZZ("notice_type", str);
        C20684815ws.LJIILLIIL("livesdk_anchor_highlight_notification_bar", c2344009GkLIZ.LIZ);
    }

    public static void LJ(int i, String str, String str2) {
        C2344009Gk c2344009GkLIZ = LIZ();
        c2344009GkLIZ.LJIIIIZZ("tab", "replay");
        c2344009GkLIZ.LJIIIIZZ("action_type", str);
        c2344009GkLIZ.LJIIIIZZ("room_id", str2);
        c2344009GkLIZ.LIZJ(i, "video_status");
        c2344009GkLIZ.LJIIIIZZ("access_identity", LIZIZ);
        C20684815ws.LJIILLIIL("livesdk_two_column_replay_item", c2344009GkLIZ.LIZ);
    }

    public static void LIZIZ(int i, String str, long j, String str2) {
        C2344009Gk c2344009GkLIZ = LIZ();
        c2344009GkLIZ.LJIIIIZZ("tab", "clips");
        c2344009GkLIZ.LJIIIIZZ("action_type", str);
        c2344009GkLIZ.LJIIIIZZ("fragment_id", String.valueOf(j));
        c2344009GkLIZ.LJIIIIZZ("room_id", str2);
        c2344009GkLIZ.LIZJ(i, "video_status");
        c2344009GkLIZ.LJIIIIZZ("access_identity", LIZIZ);
        C20684815ws.LJIILLIIL("livesdk_three_column_clip_item", c2344009GkLIZ.LIZ);
    }

    public static void LIZJ(int i, String str, boolean z, String str2, int i2, long j, int i3) {
        C2344009Gk c2344009GkLIZ = LIZ();
        c2344009GkLIZ.LJIIIIZZ("tab", "highlights");
        c2344009GkLIZ.LJIIIIZZ("action_type", str);
        c2344009GkLIZ.LJIIIIZZ("fragment_id", String.valueOf(j));
        c2344009GkLIZ.LJIIIIZZ("room_id", str2);
        c2344009GkLIZ.LIZJ(i + 1, "highlight_index");
        c2344009GkLIZ.LIZJ(i2, "video_status");
        c2344009GkLIZ.LIZJ(i3, "fragment_type");
        c2344009GkLIZ.LJIIIIZZ("access_identity", LIZIZ);
        c2344009GkLIZ.LIZJ(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0, "ai_label_show");
        C20684815ws.LJIILLIIL("livesdk_two_column_highlight_item", c2344009GkLIZ.LIZ);
    }
}
