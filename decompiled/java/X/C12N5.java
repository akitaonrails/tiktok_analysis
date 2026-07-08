package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.12N5, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12N5 {
    public static final C12N5 LIZ = new C12N5();

    public static C0LAB LIZ(VideoPublishEditModel videoPublishEditModel) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.creativeModel.creativeInfo.getCreationId());
        c0lab.LJ("shoot_way", "story");
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("shoot_enter_from", C1428470nHB.LJJIIJ(videoPublishEditModel, true));
        c0lab.LJ("shoot_enter_method", videoPublishEditModel.getShootEnterMethod());
        return c0lab;
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, String str, String str2) {
        if (videoPublishEditModel == null) {
            return;
        }
        C0LAB c0labLIZ = LIZ(videoPublishEditModel);
        c0labLIZ.LJ("message_button_show_way", "story_edit_page_share_panel");
        c0labLIZ.LJ("click_result", str);
        c0labLIZ.LJ("audience_footer_type", str2);
        C2341909Fp.LIZ("story_edit_page_post_to_story_panel_click", c0labLIZ.LIZ);
    }
}
