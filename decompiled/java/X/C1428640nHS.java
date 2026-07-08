package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.AutoSelectedAnchorInfos;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import x4l.a;

/* JADX INFO: renamed from: X.0nHS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1428640nHS {
    public static final C1428640nHS LIZ = new C1428640nHS();

    public static boolean LIZIZ() {
        return ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService().LJI() && !C0CHQ.LIZ().getAccountService().LIZ();
    }

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (C1428470nHB.LLIIIJ(videoPublishEditModel)) {
            return false;
        }
        if (videoPublishEditModel.getCanvasVideoData() != null) {
            return true;
        }
        if (!LIZIZ()) {
            return false;
        }
        if (!videoPublishEditModel.isLivePhotoEdit() && videoPublishEditModel.getCanvasVideoData() == null && videoPublishEditModel.getAILivePhotoModel().originCanvasVideoData == null) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.creativeModel.nowsShootModel == null && !C1428470nHB.LLIIIJ(videoPublishEditModel) && !videoPublishEditModel.isEnterFromDM() && !videoPublishEditModel.isEnterFromBulletin()) {
            if (!LIZIZ()) {
                return false;
            }
            if (videoPublishEditModel.isLivePhotoEdit()) {
                return true;
            }
            if (Intrinsics.LJFF("effect_qr_scan", videoPublishEditModel.getEnterFrom()) || C1416310mxZ.LJJJJZI(videoPublishEditModel)) {
                return false;
            }
        }
        return true;
    }

    public static boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        AutoSelectedAnchorInfos autoSelectedAnchorInfos;
        String str;
        C548590LfN.LIZ.getClass();
        if (!C548590LfN.LIZIZ().LJIIIZ(videoPublishEditModel.creativeModel)) {
            return false;
        }
        if ((videoPublishEditModel.creativeModel.nowsShootModel != null && !LIZIZ()) || videoPublishEditModel.containsCommentReplyStickers()) {
            return false;
        }
        if (!C1428650nHT.LIZ() && u4.LJJIII(videoPublishEditModel) && !u4.LJIIJ(videoPublishEditModel) && (((!C299950BpJ.LIZIZ() || !u4.LJLJJL(videoPublishEditModel)) && !C299950BpJ.LIZ()) || !u4.LJIJI(videoPublishEditModel))) {
            return false;
        }
        if (C1428470nHB.LLIIIJ(videoPublishEditModel) && !LIZIZ()) {
            return false;
        }
        List listLJIIJJI = C1697810uHb.LJIIJJI(2, 3, 5);
        a.LIZ.getClass();
        if (listLJIIJJI.contains(Integer.valueOf(a.LIZ())) && u4.LJLJJL(videoPublishEditModel)) {
            return false;
        }
        if (C1428470nHB.LLIIIILZ(videoPublishEditModel) && !LIZIZ()) {
            return false;
        }
        if (C1428470nHB.LLIIIILZ(videoPublishEditModel)) {
            return videoPublishEditModel.creativeModel.text2ImageModel.enableStory;
        }
        if (C1428470nHB.LJLIIL(videoPublishEditModel) && Intrinsics.LJFF(videoPublishEditModel.mShootWay, "group_shot")) {
            return false;
        }
        try {
            CreativeFlowData creativeFlowData = videoPublishEditModel.creativeModel.creativeFlowData;
            if (creativeFlowData != null && (autoSelectedAnchorInfos = creativeFlowData.getAutoSelectedAnchorInfos()) != null && (str = autoSelectedAnchorInfos.openPlatFormExtra) != null && str.length() != 0) {
                if (new JSONObject(str).optInt("ttg_post_page_mode", 0) == 1) {
                    return false;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return true;
    }
}
