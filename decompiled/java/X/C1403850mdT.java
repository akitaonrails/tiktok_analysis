package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.ChangeAvatarModel;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfoNewEngine;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.lyric.ILyricSettings;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.music.MusicStickerModel;
import java.util.List;

/* JADX INFO: renamed from: X.0mdT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403850mdT {
    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        NowsShootModel nowsShootModel;
        boolean z;
        Cut2EditTransferModel cut2EditTransferModel;
        if ((videoPublishEditModel == null || !C1416310mxZ.LJIILLIIL(videoPublishEditModel) || ((cut2EditTransferModel = videoPublishEditModel.creativeModel.cut2EditTransferModel) != null && cut2EditTransferModel.getMusicSyncMode())) && (nowsShootModel = videoPublishEditModel.creativeModel.nowsShootModel) != null && nowsShootModel.type != 0) {
            z = true;
        } else {
            z = false;
        }
        if (C0CHF.LIZ() && !z) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000f A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZLLL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2) {
        /*
            com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel r0 = r2.getEditorProModel()
            java.lang.String r2 = r0.getOpenEditToolType()
            int r0 = r2.hashCode()
            switch(r0) {
                case -1417443468: goto L12;
                case -1349063220: goto L1b;
                case -1215511132: goto L24;
                case -646311373: goto L2d;
                case -50093235: goto L36;
                case 1376878921: goto L3f;
                case 1402594330: goto L48;
                default: goto Lf;
            }
        Lf:
            java.lang.String r1 = ""
        L11:
            return r1
        L12:
            java.lang.String r1 = "aiself"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L11
            goto Lf
        L1b:
            java.lang.String r1 = "cutout"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L11
            goto Lf
        L24:
            java.lang.String r1 = "ai_video"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L11
            goto Lf
        L2d:
            java.lang.String r1 = "autocut"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L11
            goto Lf
        L36:
            java.lang.String r1 = "captions"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L11
            goto Lf
        L3f:
            java.lang.String r1 = "new_edit"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L11
            goto Lf
        L48:
            java.lang.String r0 = "photo_editor"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lf
            java.lang.String r1 = "photo_edit"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1403850mdT.LIZLLL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):java.lang.String");
    }

    public static final String LJ(VideoPublishEditModel videoPublishEditModel) {
        return videoPublishEditModel.getEditorProModel().getClickFrom();
    }

    public static final boolean LJFF(VideoPublishEditModel videoPublishEditModel) {
        Object c098200Yq;
        if (C1428470nHB.LJJZZI(videoPublishEditModel) || C1428470nHB.LLIIIJ(videoPublishEditModel) || videoPublishEditModel.isEnterFromDM() || videoPublishEditModel.isStitchMode() || videoPublishEditModel.isDuet() || videoPublishEditModel.creativeModel.onThisDayData.isFromOnThisDay()) {
            return false;
        }
        CanvasVideoData canvasVideoData = videoPublishEditModel.getCanvasVideoData();
        if ((canvasVideoData != null && C1444940nhk.LJI(canvasVideoData)) || C1444940nhk.LJIIJ(videoPublishEditModel.getCanvasVideoData()) || C1444940nhk.LJIIIIZZ(videoPublishEditModel.getCanvasVideoData())) {
            return false;
        }
        ChangeAvatarModel changeAvatarModel = videoPublishEditModel.creativeModel.changeAvatarModel;
        if (changeAvatarModel.isFromChangeAvatar || changeAvatarModel.isFromAiVatar || changeAvatarModel.isFromSocialAvatar || C1416310mxZ.LJJJJZI(videoPublishEditModel) || videoPublishEditModel.isTemplateMv() || videoPublishEditModel.isEnterFromLinkShare() || !C0CHQ.LIZ().getAccountService().isLogin() || C0CHQ.LIZ().getAccountService().LIZ()) {
            return false;
        }
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser != null && currentUser.LIZLLL() == 3) {
            return false;
        }
        try {
            c098200Yq = (ILyricSettings) PluggableExtentionKt.pluggableSpi$default(ILyricSettings.class, false, false, false, 14, null);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        ILyricSettings iLyricSettings = (ILyricSettings) c098200Yq;
        if (iLyricSettings == null || !iLyricSettings.LIZ(videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    public static final boolean LJI(VideoPublishEditModel videoPublishEditModel) {
        boolean zLJII = LJII(videoPublishEditModel);
        if (zLJII && C349930Dnj.LIZ(videoPublishEditModel, null, false) && videoPublishEditModel.hasExtendMusic()) {
            return false;
        }
        return zLJII;
    }

    public static final boolean LJII(VideoPublishEditModel videoPublishEditModel) {
        ImageAlbumData imageAlbumData;
        ImageStickerInfoNewEngine stickerInfoNewEngine;
        List<MusicStickerModel> musicStickerModels;
        if (C1428470nHB.LLIIIJ(videoPublishEditModel)) {
            return false;
        }
        if (C1428470nHB.LJJZZI(videoPublishEditModel) && !C573120Mdq.LIZ()) {
            return false;
        }
        if (videoPublishEditModel.getImageAlbumData() != null && (imageAlbumData = videoPublishEditModel.getImageAlbumData()) != null && (stickerInfoNewEngine = imageAlbumData.getStickerInfoNewEngine()) != null && (musicStickerModels = stickerInfoNewEngine.getMusicStickerModels()) != null && (!musicStickerModels.isEmpty()) && !C573120Mdq.LIZ()) {
            return false;
        }
        if ((videoPublishEditModel.creativeModel.nowsShootModel != null && !C573120Mdq.LIZ()) || videoPublishEditModel.isTemplateMv() || C0CHQ.LIZ().getAccountService().LIZ()) {
            return false;
        }
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if ((currentUser != null && currentUser.LIZLLL() == 3) || videoPublishEditModel.isEnterFromDM() || videoPublishEditModel.isStitchMode() || videoPublishEditModel.isDuet() || videoPublishEditModel.creativeModel.onThisDayData.isFromOnThisDay()) {
            return false;
        }
        CanvasVideoData canvasVideoData = videoPublishEditModel.getCanvasVideoData();
        if ((canvasVideoData != null && C1444940nhk.LJI(canvasVideoData)) || C1444940nhk.LJIIJ(videoPublishEditModel.getCanvasVideoData()) || C1444940nhk.LJIIIIZZ(videoPublishEditModel.getCanvasVideoData())) {
            return false;
        }
        ChangeAvatarModel changeAvatarModel = videoPublishEditModel.creativeModel.changeAvatarModel;
        if (changeAvatarModel.isFromChangeAvatar || changeAvatarModel.isFromAiVatar || changeAvatarModel.isFromSocialAvatar || C1416310mxZ.LJJJJZI(videoPublishEditModel) || videoPublishEditModel.isEnterFromLinkShare()) {
            return false;
        }
        if (C1466090oFr.LJIIJ(videoPublishEditModel.creativeModel.stickerModel)) {
            return true;
        }
        return C1403940mdc.LIZ();
    }

    public static final int LJIIIIZZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return 0;
        }
        if ((!videoPublishEditModel.getFromCut() && !videoPublishEditModel.getFromMultiCut() && !(!videoPublishEditModel.isTemplateMv())) || videoPublishEditModel.getVideoCount() + videoPublishEditModel.getPhotoCount() <= 1) {
            return 0;
        }
        return 1;
    }

    public static final String LJIIIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.getEditorProModel().getClickFrom().equals("shoot_page_edit_tab")) {
            return "editor_pro_panel_create";
        }
        return "editor_pro_panel_edit";
    }

    public static final String LJIIJ(VideoPublishEditModel videoPublishEditModel) {
        String str = videoPublishEditModel.creativeModel.musicBuzModel.syncClickFrom;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1858631351) {
                if (iHashCode != -846368061) {
                    if (iHashCode == 517204091 && str.equals("editor_pro_panel_create")) {
                        return str;
                    }
                } else if (str.equals("album_next")) {
                    return str;
                }
            } else if (str.equals("editor_pro_panel_edit")) {
                return str;
            }
        }
        return LJIIIZ(videoPublishEditModel);
    }

    public static final boolean LJIIJJI(VideoPublishEditModel videoPublishEditModel) {
        return videoPublishEditModel.hasOriginalAudio(false);
    }

    public static final boolean LJIIL(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.getStitchParams() != null) {
            return true;
        }
        return false;
    }

    public static final C0LAB LJIILIIL(VideoPublishEditModel videoPublishEditModel) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_page", "video_shoot_page");
        c0lab.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(videoPublishEditModel));
        return c0lab;
    }
}
