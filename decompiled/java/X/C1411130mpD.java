package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* JADX INFO: renamed from: X.0mpD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411130mpD {
    public static final C1411130mpD LIZ = new C1411130mpD();

    public static void LIZ(ShortVideoContext shortVideoContext) {
        String str;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("content_source", shortVideoContext.LJ().getContentSource());
        c0lab.LJ("content_type", shortVideoContext.LJ().getContentType());
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("shoot_page", "video_shoot_page");
        c0lab.LJ("shoot_tab_name", shortVideoContext.LJIJJLI());
        if (shortVideoContext.cameraComponentModel.mUseBeautyFace) {
            str = "on";
        } else {
            str = "off";
        }
        c0lab.LJ("to_status", str);
        C20684815ws.LJIILLIIL("click_beautify_entrance", c0lab.LIZ);
    }
}
