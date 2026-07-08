package X;

import com.bytedance.android.livesdk.userservice.UserService;
import java.util.Map;

/* JADX INFO: renamed from: X.0IKk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C464760IKk {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, C464740IKi c464740IKi) {
        if (c464740IKi == null) {
            return;
        }
        Map<String, String> map = c464740IKi.LJI;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_toplive_entrance");
        c474500IjALIZ.LJJII(str, "event_action_type");
        c474500IjALIZ.LJJII("guest_end_panel", "panel_page");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII(Long.valueOf(c464740IKi.LIZIZ), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(c464740IKi.LIZ), "room_id");
        String str2 = c464740IKi.LJIIIZ;
        if (str2 == null) {
            str2 = "";
        }
        c474500IjALIZ.LJJII(str2, "link_id");
        c474500IjALIZ.LJJII(map.get("enter_from_merge"), "enter_from_merge");
        c474500IjALIZ.LJJII(map.get("enter_method"), "enter_method");
        c474500IjALIZ.LJJII(map.get("action_type"), "action_type");
        c474500IjALIZ.LIZ();
    }
}
