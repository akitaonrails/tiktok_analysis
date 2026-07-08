package X;

import com.bytedance.android.livesdk.userservice.UserService;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.01DX, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01DX {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(String str, String str2, String str3, String str4, String str5, boolean z) {
        String str6;
        if (z) {
            str6 = "livesdk_decoration_image_version_editing_page";
        } else {
            str6 = "livesdk_decoration_dsl_version_editing_page";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str6);
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(str2, "decoration_entrance");
        c474500IjALIZ.LJJII(str, "action_type");
        if (str3 != null && !a0.LJJJIL(str3)) {
            c474500IjALIZ.LJJII(str3, "rec_template_id");
        }
        if (str4 != null && !a0.LJJJIL(str4)) {
            c474500IjALIZ.LJJII(str4, "decoration_set_id");
        }
        if (str5 != null && !a0.LJJJIL(str5)) {
            c474500IjALIZ.LJJII(str5, "click_position");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LIZ(String str, String str2, long j, Long l, String str3, String str4, String str5, String str6, String str7) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_decoration_item_manipulate");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(str2, "decoration_entrance");
        c474500IjALIZ.LJJII(str4, "board_source");
        c474500IjALIZ.LJJII(str6, "rec_template_id");
        c474500IjALIZ.LJJII(l, "item_id");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(str3, "board_type");
        c474500IjALIZ.LJJII(Long.valueOf(j), "board_set_id");
        c474500IjALIZ.LJJII(str5, "item_type");
        c474500IjALIZ.LJJII(str7, "generate_version");
        c474500IjALIZ.LIZ();
    }
}
