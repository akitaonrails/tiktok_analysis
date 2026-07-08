package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* JADX INFO: renamed from: X.0t3N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1650550t3N {
    public static final C1650550t3N LIZ = new C1650550t3N();

    public static void LIZ(ShortVideoContext shortVideoContext, boolean z, int i, boolean z2) {
        String str;
        String str2;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        if (i == 0) {
            str = "off";
        } else {
            str = "on";
        }
        c0lab.LJ("to_status", str);
        if (z2) {
            str2 = "front";
        } else {
            str2 = "back";
        }
        c0lab.LJ("camera_status", str2);
        int i2 = shortVideoContext.draftId;
        if (i2 != 0) {
            c0lab.LIZ(i2, "draft_id");
        }
        if (shortVideoContext.newDraftId.length() > 0) {
            c0lab.LJ("new_draft_id", shortVideoContext.newDraftId);
        }
        if (z) {
            c0lab.LJ("is_after_low_light_hint", "true");
        }
        c0lab.LJ("shoot_page", "video_shoot_page");
        c0lab.LJ("shoot_tab_name", shortVideoContext.LJIJJLI());
        C20684815ws.LJIILLIIL("light", c0lab.LIZ);
    }

    public static void LIZIZ(ShortVideoContext shortVideoContext, EnumC1448590nnd enumC1448590nnd, EnumC1448590nnd enumC1448590nnd2, boolean z) {
        String str;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("shoot_page", "video_shoot_page");
        c0lab.LJ("shoot_tab_name", shortVideoContext.LJIJJLI());
        if (z) {
            str = "front";
        } else {
            str = "back";
        }
        c0lab.LJ("camera", str);
        c0lab.LJ("from_status", enumC1448590nnd.getDesc());
        c0lab.LJ("to_status", enumC1448590nnd2.getDesc());
        C20684815ws.LJIILLIIL("click_ratio", c0lab.LIZ);
    }
}
