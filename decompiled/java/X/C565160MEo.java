package X;

import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoConsumptionModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MEo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C565160MEo {
    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (!LIZJ(videoPublishEditModel) || C0C64.LJIILLIIL().LJIJ(31744, 1, "studio_mix_editing_request_ai_alive_template", true) <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        if (!LIZLLL(videoPublishEditModel) && !LIZJ(videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        CanvasVideoData canvasVideoData;
        LivePhotoModel livePhotoModel;
        List<? extends MediaModel> list;
        if (!u4.LJLL(videoPublishEditModel) && !C1428470nHB.LLIIIJ(videoPublishEditModel) && !C729510SjV.LJIILL(videoPublishEditModel.getCanvasVideoData()) && !Intrinsics.LJFF(videoPublishEditModel.mShootWay, "share_live_to_story") && ((!videoPublishEditModel.isLivePhotoEdit() || !C1416310mxZ.LJJJI(videoPublishEditModel)) && !videoPublishEditModel.creativeModel.photoModeEnterEditingStage.photoModeEnterAutoCut && !C1428470nHB.LJJLIL(videoPublishEditModel))) {
            CreativeModel creativeModel = videoPublishEditModel.creativeModel;
            if (creativeModel.instantCloneConsumption.speakerInfo == null && !C1874810yt5.LIZ(creativeModel.autoPickModel)) {
                if (videoPublishEditModel.getAILivePhotoModel().pageDataCache.hasShowEntrance || videoPublishEditModel.getAILivePhotoModel().LIZ()) {
                    return true;
                }
                C0MDM.LIZ.getClass();
                if (!C0MDM.LIZ()) {
                    return false;
                }
                if (videoPublishEditModel.isLivePhotoEdit() && !C1416310mxZ.LJJJI(videoPublishEditModel) && (livePhotoModel = videoPublishEditModel.creativeModel.livePhotoModel) != null && (list = livePhotoModel.importedLivePhotoList) != null && list.size() == 1) {
                    return true;
                }
                if (!C1444940nhk.LJII(videoPublishEditModel.getCanvasVideoData()) || (canvasVideoData = videoPublishEditModel.getCanvasVideoData()) == null || C1444940nhk.LIZJ(canvasVideoData) != 1) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        CanvasVideoData canvasVideoData;
        if (!u4.LJLL(videoPublishEditModel) || C729510SjV.LJIILL(videoPublishEditModel.getCanvasVideoData()) || Intrinsics.LJFF(videoPublishEditModel.mShootWay, "share_live_to_story") || C729510SjV.LJIILL(videoPublishEditModel.getCanvasVideoData()) || Intrinsics.LJFF(videoPublishEditModel.mShootWay, "share_live_to_story")) {
            return false;
        }
        if (videoPublishEditModel.getAILivePhotoModel().LIZ()) {
            return true;
        }
        C0M97.LIZ.getClass();
        if (!C0M97.LIZ() || !C1444940nhk.LJII(videoPublishEditModel.getCanvasVideoData()) || (canvasVideoData = videoPublishEditModel.getCanvasVideoData()) == null || C1444940nhk.LIZJ(canvasVideoData) != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJ(VideoPublishEditModel videoPublishEditModel) {
        AILivePhotoConsumptionModel aILivePhotoConsumptionModel;
        if (!Intrinsics.LJFF(videoPublishEditModel.mShootWay, "ai_livephoto_anchor") || (aILivePhotoConsumptionModel = videoPublishEditModel.creativeModel.aiLivePhotoModel.consumptionModel) == null || !aILivePhotoConsumptionModel.getEnterToPost()) {
            return false;
        }
        return true;
    }

    public static final boolean LJFF(VideoPublishEditModel videoPublishEditModel) {
        AILivePhotoConsumptionModel aILivePhotoConsumptionModel;
        if (!Intrinsics.LJFF(videoPublishEditModel.mShootWay, "ai_livephoto_anchor") || (aILivePhotoConsumptionModel = videoPublishEditModel.creativeModel.aiLivePhotoModel.consumptionModel) == null || aILivePhotoConsumptionModel.getEnterToPost()) {
            return false;
        }
        return true;
    }

    public static final boolean LJI(VideoPublishEditModel videoPublishEditModel) {
        if (LJFF(videoPublishEditModel) || (Intrinsics.LJFF(videoPublishEditModel.mShootWay, "general_search") && Intrinsics.LJFF(videoPublishEditModel.getShootEnterMethod(), "ai_livephoto_search_card"))) {
            return true;
        }
        if (Intrinsics.LJFF(videoPublishEditModel.mShootWay, "notification_page") && Intrinsics.LJFF(videoPublishEditModel.getShootEnterMethod(), "ai_livephoto_inbox_banner")) {
            return true;
        }
        return false;
    }

    public static final boolean LJII(VideoPublishEditModel videoPublishEditModel) {
        LivePhotoModel livePhotoModel = videoPublishEditModel.getAILivePhotoModel().restoreData.livePhotoModel;
        C578570Mmd.LIZ.getClass();
        if (C578570Mmd.LIZ() && LIZJ(videoPublishEditModel) && livePhotoModel != null && livePhotoModel.enableLiveMode && (!livePhotoModel.importedLivePhotoList.isEmpty())) {
            return true;
        }
        return false;
    }
}
