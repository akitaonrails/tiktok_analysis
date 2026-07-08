package X;

import com.ss.android.ugc.aweme.anchor.service.IAnchorListService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0XjJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C856790XjJ {
    public static final C856790XjJ LIZ = new C856790XjJ();

    public static int LJI() {
        return (((IAnchorListService) ServiceManager.get().getService(IAnchorListService.class)).containAnchors(((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJIL()) && ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJZZIII()) ? 1 : 0;
    }

    public static void LJFF(int i, C2344009Gk c2344009Gk) {
        if (i == EnumC856780XjI.POSSIBLE_SUBSCRIBE_LONG_VIDEO_CHECK_TYPE.getCheckType()) {
            c2344009Gk.LIZJ(0, "is_ecommerce_video");
            c2344009Gk.LIZJ(0, "is_long_video");
            c2344009Gk.LIZJ(1, "is_sub_only_video");
        } else {
            if (i == EnumC856780XjI.SUBSCRIBE_VIDEO_CHECK_TYPE.getCheckType()) {
                c2344009Gk.LIZJ(0, "is_long_video");
                c2344009Gk.LIZJ(1, "is_sub_only_video");
                c2344009Gk.LIZJ(LJI(), "is_ecommerce_video");
                return;
            }
            c2344009Gk.LIZJ(0, "is_sub_only_video");
        }
    }

    public static void LIZ(int i, int i2, C2344009Gk c2344009Gk) {
        if (i == C0FPS.ECOMMERCE.getScene()) {
            c2344009Gk.LIZJ(LJI(), "is_ecommerce_video");
            c2344009Gk.LIZJ(0, "is_long_video");
            c2344009Gk.LIZJ(i2, "is_sub_only_video");
            c2344009Gk.LIZJ(0, "is_short_video");
            return;
        }
        if (i == C0FPS.LONG_VIDEO.getScene()) {
            c2344009Gk.LIZJ(0, "is_ecommerce_video");
            c2344009Gk.LIZJ(1, "is_long_video");
            c2344009Gk.LIZJ(0, "is_sub_only_video");
            c2344009Gk.LIZJ(0, "is_short_video");
            return;
        }
        if (i != C0FPS.SHORT_VIDEO.getScene()) {
            return;
        }
        c2344009Gk.LIZJ(0, "is_ecommerce_video");
        c2344009Gk.LIZJ(0, "is_long_video");
        c2344009Gk.LIZJ(0, "is_sub_only_video");
        c2344009Gk.LIZJ(1, "is_short_video");
    }

    public static void LIZLLL(VideoPublishEditModel videoPublishEditModel, String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", videoPublishEditModel.getCreationId());
        c2344009Gk.LJIIIIZZ("shoot_way", videoPublishEditModel.mShootWay);
        c2344009Gk.LJIIIIZZ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c2344009Gk.LJIIIIZZ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c2344009Gk.LIZJ(videoPublishEditModel.getVideoLength(), "creation_duration");
        if (str2 != null) {
            c2344009Gk.LJFF("enter_from", str2);
        }
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    public static void LIZIZ(String str, String str2, String str3, String str4, int i, int i2, int i3, String str5) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", str);
        c2344009Gk.LJIIIIZZ("shoot_way", str2);
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        c2344009Gk.LJIIIIZZ("content_type", str4);
        c2344009Gk.LJIIIIZZ("content_source", str5);
        c2344009Gk.LIZJ(i2, "creation_duration");
        LIZ(i, i3, c2344009Gk);
        C20684815ws.LJIILLIIL("sound_copyright_issue_page_close", c2344009Gk.LIZ);
    }

    public static void LIZJ(String str, String str2, String str3, String str4, int i, int i2, int i3, String str5) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", str);
        c2344009Gk.LJIIIIZZ("shoot_way", str2);
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        c2344009Gk.LJIIIIZZ("content_type", str4);
        c2344009Gk.LJIIIIZZ("content_source", str5);
        c2344009Gk.LIZJ(i2, "creation_duration");
        LIZ(i, i3, c2344009Gk);
        C20684815ws.LJIILLIIL("sound_copyright_learn_more_click", c2344009Gk.LIZ);
    }

    public static void LJ(String str, String str2, String str3, String str4, int i, int i2, int i3, String str5) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", str);
        c2344009Gk.LJIIIIZZ("shoot_way", str2);
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        c2344009Gk.LJIIIIZZ("content_type", str4);
        c2344009Gk.LJIIIIZZ("content_source", str5);
        c2344009Gk.LIZJ(i2, "creation_duration");
        LIZ(i, i3, c2344009Gk);
        C20684815ws.LJIILLIIL("sound_copyright_post_anyway_click", c2344009Gk.LIZ);
    }

    public static void LJIIIIZZ(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", str);
        c2344009Gk.LJIIIIZZ("shoot_way", str2);
        c2344009Gk.LJIIIIZZ("draft_id", str3);
        c2344009Gk.LJIIIIZZ("enter_from", "video_edit_page");
        c2344009Gk.LJIIIIZZ("content_type", str4);
        c2344009Gk.LJIIIIZZ("content_source", str5);
        c2344009Gk.LJIIIIZZ("music_id", str6);
        LIZ(i, i3, c2344009Gk);
        LJFF(i2, c2344009Gk);
        C20684815ws.LJIILLIIL("sound_copyright_check_page_show", c2344009Gk.LIZ);
    }

    public static void LJIIJJI(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, String str6) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", str);
        c2344009Gk.LJIIIIZZ("shoot_way", str2);
        c2344009Gk.LJIIIIZZ("draft_id", str3);
        c2344009Gk.LJIIIIZZ("enter_from", str4);
        c2344009Gk.LJIIIIZZ("content_type", str5);
        c2344009Gk.LJIIIIZZ("content_source", str6);
        c2344009Gk.LIZJ(i2, "creation_duration");
        LIZ(i, i3, c2344009Gk);
        C20684815ws.LJIILLIIL("mute_original_sound_click", c2344009Gk.LIZ);
    }

    public static void LJII(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", str);
        c2344009Gk.LJIIIIZZ("shoot_way", str2);
        c2344009Gk.LJIIIIZZ("draft_id", str3);
        c2344009Gk.LJIIIIZZ("enter_from", str4);
        c2344009Gk.LJIIIIZZ("content_type", str5);
        c2344009Gk.LJIIIIZZ("content_source", str6);
        c2344009Gk.LJIIIIZZ("music_id", str7);
        c2344009Gk.LIZJ(i2, "creation_duration");
        LIZ(i, i3, c2344009Gk);
        C20684815ws.LJIILLIIL("sound_copyright_change_sound_click", c2344009Gk.LIZ);
    }

    public static void LJIIJ(int i, int i2, String str, String str2, int i3, String str3, String str4, String str5, String str6, String str7, String str8) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", str);
        c2344009Gk.LJIIIIZZ("shoot_way", str2);
        c2344009Gk.LJIIIIZZ("draft_id", str3);
        c2344009Gk.LJIIIIZZ("enter_from", str4);
        c2344009Gk.LJIIIIZZ("content_type", str6);
        c2344009Gk.LJIIIIZZ("content_source", str7);
        c2344009Gk.LJIIIIZZ("music_id", str8);
        c2344009Gk.LIZJ(i2, "creation_duration");
        if (str5.length() > 0) {
            c2344009Gk.LJFF("enter_method", str5);
        }
        LIZ(i, i3, c2344009Gk);
        C20684815ws.LJIILLIIL("sound_copyright_issue_page_show", c2344009Gk.LIZ);
    }

    public static void LJIIIZ(String str, String str2, int i, String str3, int i2, String str4, String str5, String str6, String str7, int i3, int i4, long j) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", str);
        c2344009Gk.LJIIIIZZ("shoot_way", str2);
        c2344009Gk.LJIIIIZZ("draft_id", str3);
        c2344009Gk.LJIIIIZZ("enter_from", str4);
        c2344009Gk.LJIIIIZZ("content_type", str5);
        c2344009Gk.LJIIIIZZ("content_source", str6);
        c2344009Gk.LJIIIIZZ("music_id", str7);
        c2344009Gk.LIZJ(i2, "sound_copyright_check_result");
        c2344009Gk.LIZLLL(j, "duration");
        c2344009Gk.LIZJ(i3, "creation_duration");
        LIZ(i, i4, c2344009Gk);
        C20684815ws.LJIILLIIL("sound_copyright_check_result", c2344009Gk.LIZ);
    }
}
