package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EMB, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EMB {
    public static final void LIZJ(VideoPublishEditModel videoPublishEditModel, String str) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("icon_page", str);
        C20684815ws.LJIILLIIL("sync_mode_show", c0lab.LIZ);
    }

    public static final void LIZ(VideoPublishEditModel videoPublishEditModel, boolean z, String str, String str2, Long l, Long l2) {
        String strLJIIJ;
        String str3;
        String str4;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        if (C123100dR.LIZ(C537970L7z.LIZ(videoPublishEditModel.creativeModel.editorProSchemeModel))) {
            c0lab.LJ("ep_anchor_type", C537970L7z.LIZ(videoPublishEditModel.creativeModel.editorProSchemeModel));
        }
        if (!z && ((str4 = videoPublishEditModel.creativeModel.musicBuzModel.syncClickFrom) == null || str4.length() == 0)) {
            strLJIIJ = "editor_pro_panel_edit";
        } else {
            strLJIIJ = C1403850mdT.LJIIJ(videoPublishEditModel);
        }
        String strLIZIZ = C1412490mrP.LIZIZ(videoPublishEditModel);
        if (C294060Bfo.LIZ()) {
            if (z) {
                if (strLIZIZ.equals("original")) {
                    strLIZIZ = "sync_page_recommend";
                }
                str3 = "sync_on";
            }
            str3 = "sync_off";
        } else if (z) {
            str3 = "sync_on";
        } else {
            str3 = "sync_off";
        }
        c0lab.LJ("to_status", str3);
        c0lab.LIZ(videoPublishEditModel.getVideoCount(), "video_cnt");
        c0lab.LIZ(videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate ? 1 : 0, "is_from_create_template");
        c0lab.LIZ(videoPublishEditModel.getPhotoCount(), "pic_cnt");
        c0lab.LIZ(C1403850mdT.LJIIIIZZ(videoPublishEditModel), "is_multi_content");
        c0lab.LJ("mix_type", C1403470mcr.LJ(videoPublishEditModel));
        c0lab.LIZ(0, "is_editor_pro");
        c0lab.LJ("music_id", str);
        c0lab.LJ("music_selected_from", strLIZIZ);
        c0lab.LIZ(videoPublishEditModel.getPreviewInfo().getPreviewVideoLength(), "creation_duration");
        c0lab.LJ("icon_page", "video_edit_page");
        c0lab.LJ("sync_click_from", strLJIIJ);
        c0lab.LJ("stage", str2);
        c0lab.LIZ(Intrinsics.LJFF(videoPublishEditModel.creativeModel.musicBuzModel.stickPointStrategy, Boolean.TRUE) ? 1 : 0, "is_audio_drive_strategy");
        C1414930mvL.LIZ.getClass();
        c0lab.LIZ(C1414930mvL.LIZJ(videoPublishEditModel), "is_edit_carousel_show");
        if (l != null) {
            c0lab.LIZIZ(l.longValue(), "sync_duration");
        }
        if (l2 != null) {
            c0lab.LIZIZ(l2.longValue(), "music_duration");
        }
        C20684815ws.LJIILLIIL("change_sync_mode", c0lab.LIZ);
    }
}
