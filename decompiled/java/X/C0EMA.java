package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0EMA, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EMA {
    public static final C0EMA LIZ = new C0EMA();

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, boolean z, String str, String str2, Integer num, Pair pair) {
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
        if (C294060Bfo.LIZ()) {
            if (z) {
                if (u.LJIJI(str2, "original", false)) {
                    str2 = "sync_page_recommend";
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
        c0lab.LIZ(((Number) pair.getFirst()).intValue(), "video_cnt");
        c0lab.LIZ(videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate ? 1 : 0, "is_from_create_template");
        c0lab.LIZ(((Number) pair.getSecond()).intValue(), "pic_cnt");
        c0lab.LIZ(C1403850mdT.LJIIIIZZ(videoPublishEditModel), "is_multi_content");
        c0lab.LJ("mix_type", C1403470mcr.LJ(videoPublishEditModel));
        c0lab.LIZ(0, "is_editor_pro");
        c0lab.LJ("music_id", str);
        c0lab.LJ("music_selected_from", str2);
        c0lab.LIZ(videoPublishEditModel.getPreviewInfo().getPreviewVideoLength(), "creation_duration");
        c0lab.LJ("icon_page", "video_edit_page");
        C1414930mvL.LIZ.getClass();
        c0lab.LIZ(C1414930mvL.LIZJ(videoPublishEditModel), "is_edit_carousel_show");
        c0lab.LIZLLL(num, "sync_mode_rank");
        c0lab.LJ("sync_click_from", strLJIIJ);
        c0lab.LIZ(Intrinsics.LJFF(videoPublishEditModel.creativeModel.musicBuzModel.stickPointStrategy, Boolean.TRUE) ? 1 : 0, "is_audio_drive_strategy");
        C20684815ws.LJIILLIIL("change_sync_mode", c0lab.LIZ);
    }
}
