package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* JADX INFO: renamed from: X.0LFN, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LFN {
    public final ShortVideoContext LIZ;

    public C0LFN(ShortVideoContext shortVideoContext) {
        this.LIZ = shortVideoContext;
    }

    public static void LIZ(C0LAB c0lab, ShortVideoContext shortVideoContext) {
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("follow_prompt_type", "");
        c0lab.LJ("content_source", "shoot");
        c0lab.LJ("content_type", "photo");
        c0lab.LJ("shoot_tab_name", shortVideoContext.LJIJJLI());
        String str = shortVideoContext.creativeModel.commonMobModel.shootEnterMethod;
        if (str == null) {
            str = shortVideoContext.enterMethod;
        }
        c0lab.LJ("shoot_enter_method", str);
        c0lab.LIZ(0, "pic_cnt");
        c0lab.LIZ(0, "video_cnt");
        c0lab.LIZ(0, "is_draft");
        c0lab.LIZ(0, "ai_livephoto_status");
    }
}
