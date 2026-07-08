package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0mlT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1408810mlT {
    public static final C1408810mlT LIZ = new C1408810mlT();

    public static void LIZ(int i, int i2, int i3, String str, String str2, String str3) {
        C0LAB c0lab = new C0LAB();
        if (str != null) {
            c0lab.LJ("effect_id", str);
        }
        c0lab.LJ("stage", str2);
        c0lab.LIZ(i, "duration");
        c0lab.LIZ(i2, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LJ("error_msg", str3);
        c0lab.LIZ(i3, "error_code");
        C20684815ws.LJIILLIIL("capture_green_screen_download", c0lab.LIZ);
    }
}
