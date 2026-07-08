package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.05eV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1403705eV {
    public static final C1403705eV LIZ = new C1403705eV();

    public static void LIZ(long j, String str, int i, String str2, Integer num) {
        C0LAB c0lab = new C0LAB();
        LIZ.getClass();
        c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZIZ(j, "duration");
        if (num != null) {
            c0lab.LIZ(num.intValue(), "error_code");
        }
        if (str != null && str.length() != 0) {
            c0lab.LJ("error_message", str);
        }
        if (str2 != null && str2.length() != 0) {
            c0lab.LJ(Scene.SCENE_SERVICE, str2);
        }
        C20684815ws.LJIILLIIL("ai_portrait_template_request_result", c0lab.LIZ);
    }
}
