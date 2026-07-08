package X;

import com.bytedance.android.livesdk.userservice.UserService;

/* JADX INFO: renamed from: X.0TDL, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TDL {
    public static final /* synthetic */ int LIZ = 0;

    public static long LIZ() {
        if (UserService.getInstance().user() != null) {
            return UserService.getInstance().user().getCurrentUserId();
        }
        return 0L;
    }

    public static void LIZIZ(String str, String str2, String str3, String str4) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dual_device_connec_failed_click");
        c474500IjALIZ.LJJII(Long.valueOf(LIZ()), "anchor_id");
        c474500IjALIZ.LJJII(str3, "position_type");
        c474500IjALIZ.LJJII(str4, "btn_name");
        if (str2 != null) {
            c474500IjALIZ.LJJII(str2, "source_page");
        }
        if (str != null) {
            c474500IjALIZ.LJJII(str, "room_id");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(String str, String str2, String str3, String str4) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dual_device_connected_click");
        c474500IjALIZ.LJJII(Long.valueOf(LIZ()), "anchor_id");
        c474500IjALIZ.LJJII(str, "room_id");
        c474500IjALIZ.LJJII(str4, "btn_name");
        if (str2 != null) {
            c474500IjALIZ.LJJII(str2, "source_page");
        }
        c474500IjALIZ.LJJII(str3, "position_type");
        c474500IjALIZ.LIZ();
    }

    public static void LIZLLL(String str, String str2, String str3, String str4) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dual_device_inviting_show");
        c474500IjALIZ.LJJII(Long.valueOf(LIZ()), "anchor_id");
        c474500IjALIZ.LJJII(str2, "device_type");
        if (str3 != null) {
            c474500IjALIZ.LJJII(str3, "source_page");
        }
        if (str != null) {
            c474500IjALIZ.LJJII(str, "room_id");
        }
        if (str4 != null) {
            c474500IjALIZ.LJJII(str4, "position_type");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJ(String str, String str2, String str3, String str4, String str5) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dual_device_searching_click");
        c474500IjALIZ.LJJII(Long.valueOf(LIZ()), "anchor_id");
        c474500IjALIZ.LJJII(str2, "device_type");
        c474500IjALIZ.LJJII(str5, "btn_name");
        if (str3 != null) {
            c474500IjALIZ.LJJII(str3, "source_page");
        }
        if (str != null) {
            c474500IjALIZ.LJJII(str, "room_id");
        }
        if (str4 != null) {
            c474500IjALIZ.LJJII(str4, "position_type");
        }
        c474500IjALIZ.LIZ();
    }
}
