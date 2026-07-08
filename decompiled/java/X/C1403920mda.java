package X;

import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mda, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403920mda {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        boolean z2;
        CanvasVideoData canvasVideoData;
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "tt_photo_template_enable_show_entrance", true, false) || Intrinsics.LJFF(videoPublishEditModel.mShootWay, "share_to_story") || !C0CHQ.LIZ().getAccountService().isLogin() || videoPublishEditModel.creativeModel.changeAvatarModel.isFromChangeAvatar || videoPublishEditModel.isEnterFromBulletin() || u4.LJJJJLI(videoPublishEditModel)) {
            return false;
        }
        if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
            return true;
        }
        if (!videoPublishEditModel.isUploadVideo()) {
            return false;
        }
        CanvasVideoData canvasVideoData2 = videoPublishEditModel.getCanvasVideoData();
        if (canvasVideoData2 != null && C1444940nhk.LJII(canvasVideoData2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && (canvasVideoData = videoPublishEditModel.getCanvasVideoData()) != null && C1444940nhk.LIZJ(canvasVideoData) == 1) {
            return C0C64.LJIILLIIL().LJIIIZ(31744, "tt_canvas_photo_template_enable_show_entrance", true, true);
        }
        if (!z || !videoPublishEditModel.creativeModel.imagePublishModel.isCanvasVideoRemoved) {
            return false;
        }
        return C0C64.LJIILLIIL().LJIIIZ(31744, "tt_canvas_photo_template_enable_show_entrance", true, true);
    }
}
