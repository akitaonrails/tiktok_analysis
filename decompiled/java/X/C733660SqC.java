package X;

import com.ss.android.ugc.aweme.feed.ab.FeedDiggNoNetExp;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0SqC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C733660SqC {
    public static final C733660SqC LIZ = new C733660SqC();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public static boolean LIZ() {
        FeedDiggNoNetExp.DiggNoNetConfig diggNoNetConfigLIZ;
        ?? r3 = (C0XF5.LIZIZ() && C036E.LIZ.LIZJ == C0O0L.AVAILABLE) ? 1 : 0;
        boolean zIsLogin = ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(r3, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c2344009Gk.LIZJ(zIsLogin ? 1 : 0, "is_login");
        C20684815ws.LJIILLIIL("digg_net_status", c2344009Gk.LIZ);
        if (zIsLogin && (diggNoNetConfigLIZ = FeedDiggNoNetExp.LIZ()) != null && diggNoNetConfigLIZ.enable == 1) {
            return true;
        }
        return r3;
    }

    public static void LIZIZ(int i, Integer num, String str, String str2, boolean z) {
        int i2;
        if (str != null && num != null) {
            num.intValue();
            C2344009Gk c2344009Gk = new C2344009Gk();
            if (z) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            c2344009Gk.LIZJ(i2, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            c2344009Gk.LJFF("type", str);
            c2344009Gk.LJFF("enter_from", str2);
            c2344009Gk.LIZJ(num.intValue(), "elapsed_hours");
            c2344009Gk.LIZJ(i, "error_code");
            C20684815ws.LJIILLIIL("digg_sync_status", c2344009Gk.LIZ);
        }
    }
}
