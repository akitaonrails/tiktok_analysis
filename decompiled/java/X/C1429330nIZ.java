package X;

import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.creative.model.StoryUploadPageEntranceType;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nIZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1429330nIZ {
    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (C1428520nHG.LJJLIIIJJI(videoPublishEditModel)) {
            return false;
        }
        if (C1428520nHG.LJIILJJIL(videoPublishEditModel)) {
            C01GW c01gw = C300650BqR.LIZ;
            if (!C1416310mxZ.LJJJLZIJ(videoPublishEditModel, C300650BqR.LIZIZ)) {
                return false;
            }
        }
        return C1428520nHG.LJIIJ(videoPublishEditModel);
    }

    public static final boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        DMMediaModel dMMediaModel;
        if (!videoPublishEditModel.isEnterFromDM() || (dMMediaModel = videoPublishEditModel.creativeModel.dmMediaModel) == null || dMMediaModel.type != 2) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        if (!videoPublishEditModel.isEnterFromDM() && !videoPublishEditModel.isEnterFromBulletin()) {
            return true;
        }
        return false;
    }

    public static final boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        if (C1428470nHB.LJJZZI(videoPublishEditModel) && !C1428470nHB.LJZ(videoPublishEditModel)) {
            IMSharePanelApi.LIZ.getClass();
            if (!C1599690rjL.LIZ().LIZ().LJII()) {
                return false;
            }
        }
        if (u4.LJIIZILJ(videoPublishEditModel) && C20622315mn.LIZJ()) {
            return false;
        }
        if (C1428520nHG.LJJLIIIJJI(videoPublishEditModel) && C1428520nHG.LJIILJJIL(videoPublishEditModel)) {
            return false;
        }
        C1428640nHS.LIZ.getClass();
        if (!C1428640nHS.LIZJ(videoPublishEditModel) || C1428520nHG.LJJJJZ(videoPublishEditModel)) {
            return false;
        }
        IMSharePanelApi.LIZ.getClass();
        boolean zLJFF = C1599690rjL.LIZ().LIZ().LJFF();
        boolean zLIZLLL = C1599690rjL.LIZ().LIZ().LIZLLL();
        boolean zIsEnterFromDM = videoPublishEditModel.isEnterFromDM();
        if (C1416310mxZ.LJJJLZIJ(videoPublishEditModel, C300650BqR.LIZIZ) || zIsEnterFromDM) {
            return false;
        }
        if (!zLJFF && (!zLIZLLL || videoPublishEditModel.creativeModel.nowsShootModel == null)) {
            return false;
        }
        return true;
    }

    public static final boolean LJ(VideoPublishEditModel videoPublishEditModel) {
        boolean z = true;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "story_auto_music_show_capsule", true) == 2) {
            z = false;
        }
        if (Intrinsics.LJFF(videoPublishEditModel.mShootWay, "share_live_to_story") || C1444940nhk.LJFF(videoPublishEditModel.getCanvasVideoData()) || u4.LJJJJJL(videoPublishEditModel.creativeModel)) {
            return false;
        }
        return z;
    }

    public static final boolean LJFF(VideoPublishEditModel videoPublishEditModel) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "story_edit_tool_bar_new_design", true, false) && u4.LJIILLIIL(videoPublishEditModel) && videoPublishEditModel.creativeModel.storyModel.getUploadPageEntranceType() != StoryUploadPageEntranceType.CAMERA) {
            return true;
        }
        return false;
    }
}
