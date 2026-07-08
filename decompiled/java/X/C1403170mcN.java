package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* JADX INFO: renamed from: X.0mcN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403170mcN {
    public static final C1403170mcN LIZ = new C1403170mcN();

    public static void LIZ(ShortVideoContext shortVideoContext) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJFF("is_draft", shortVideoContext.mIsFromDraft);
        c0lab.LJ("shoot_tab_name", shortVideoContext.LJIJJLI());
        C20684815ws.LJIILLIIL("camera_zoom", c0lab.LIZ);
    }

    public static final void LIZIZ(int i, String str, String str2, String str3) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", str);
        c0lab.LJ("shoot_way", str2);
        c0lab.LJ("zoom_method", str3);
        c0lab.LIZ(i, "in_recording");
        C20684815ws.LJIILLIIL("shoot_zoom", c0lab.LIZ);
    }
}
