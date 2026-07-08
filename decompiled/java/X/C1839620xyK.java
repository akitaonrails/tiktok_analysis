package X;

import com.bytedance.android.livesdk.userservice.UserService;

/* JADX INFO: renamed from: X.0xyK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1839620xyK {
    public static final void LIZ(C1839630xyL c1839630xyL) {
        if (c1839630xyL.LIZ.length() == 0) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_pcs_font_performance");
        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII(c1839630xyL.LIZ, "font_identifier");
        c474500IjALIZ.LJJII(Boolean.valueOf(c1839630xyL.LIZIZ), "is_font_cached");
        c474500IjALIZ.LJJII(Long.valueOf(c1839630xyL.LIZJ), "font_download_duration");
        c474500IjALIZ.LJJII(Integer.valueOf(c1839630xyL.LIZLLL.getCode()), "error_code");
        c474500IjALIZ.LJJII(c1839630xyL.LIZLLL.getMessage(), "error_message");
        c474500IjALIZ.LIZ();
    }
}
