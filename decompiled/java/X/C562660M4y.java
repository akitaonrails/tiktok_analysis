package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* JADX INFO: renamed from: X.0M4y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C562660M4y {
    public static final C562660M4y LIZ = new C562660M4y();

    public static void LIZ(ShortVideoContext shortVideoContext, String str) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", shortVideoContext.creativeInfo.getCreationId());
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("from_page", shortVideoContext.enterFrom);
        c0lab.LJ("page_type", "shoot_page");
        c0lab.LJ("type", str);
        C20684815ws.LJIILLIIL("deny_access_page_click_setting", c0lab.LIZ);
    }

    public static void LIZIZ(String str, String str2) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("type", str);
        c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
        C20684815ws.LJIILLIIL("go_to_settings_action", c0lab.LIZ);
    }
}
