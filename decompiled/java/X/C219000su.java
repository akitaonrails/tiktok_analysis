package X;

import com.bytedance.android.livesdk.userservice.UserService;

/* JADX INFO: renamed from: X.00su, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C219000su {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_gallery_opt_out_popup_close");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII("user", "user_type");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII(str, "close_reason");
        c474500IjALIZ.LIZ();
    }
}
