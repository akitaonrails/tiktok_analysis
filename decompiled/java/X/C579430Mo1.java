package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.LandingModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.d4;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mo1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C579430Mo1 {
    public static final C579430Mo1 LIZ = new C579430Mo1();
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("direct_shoot", "single_song", "prop_page", "draft_again", "anchor_combine_prop", "collection_music", "vc_page", "anchor_combine_voice_conversion", "anchor_combine_tts", "comment_reply", "add_yours", "sub_only_video_page", "aime_hub", "camera_shortcut", "green_screen_anchor", "reuse_layout", "filter_anchor", "views_panel");
    public static final List<String> LIZJ = Collections.singletonList("creator_center");
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C530810Krn());
    public static final List<String> LJ = Collections.singletonList("draft_box");

    public static boolean LIZ(ShortVideoContext shortVideoContext) {
        if (((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService().LJI() && !((Boolean) LIZLLL.getValue()).booleanValue() && !shortVideoContext.LJJIIZ() && !shortVideoContext.cameraComponentModel.isEditorProRecordMode && !shortVideoContext.LJJJJIZL() && !shortVideoContext.LJJJIL() && !shortVideoContext.cameraComponentModel.editorProRecordUsedForPip && !shortVideoContext.LJJJJLL() && !shortVideoContext.isDuetMode && !shortVideoContext.LJJLL() && ((!C1443960ngA.LJ(shortVideoContext) || shortVideoContext.isBusinessFirstSticker.booleanValue()) && !shortVideoContext.LJJJ() && !shortVideoContext.LJJJJZ())) {
            CreativeModel creativeModel = shortVideoContext.creativeModel;
            if (creativeModel.editorProAIGCInfoModel.aiPlaygroundCameraModel.fromAiPlayground || creativeModel.initialModel.dmCameraModel.enterFromDM || d4.LJIIJ(shortVideoContext) || Intrinsics.LJFF(shortVideoContext.shootWay, "anchor_combine_tts")) {
                return false;
            }
            if (C13LQ.LJJIJIIJI(shortVideoContext.shootWay, new String[]{"add_yours", "trend_button"}) < 0) {
                if (shortVideoContext.creativeModel.stickerModel.isFromFollowAddYours || (!r1.addYoursStickerExtras.isEmpty()) || shortVideoContext.creativeModel.pugcTemplateData.isFromCreateTemplate || shortVideoContext.LJJIJ()) {
                    return false;
                }
                if (C13LP.LJJJJ(shortVideoContext.shootWay, LIZIZ) || C1443960ngA.LJIIZILJ(shortVideoContext) || C123100dR.LIZ(shortVideoContext.mUnpublishedEffectId) || C123100dR.LIZ(shortVideoContext.mSavedDraftId) || shortVideoContext.cameraComponentModel.LJI()) {
                    return true;
                }
                if (C13LP.LJJJJ(shortVideoContext.enterFrom, LIZJ)) {
                    return true;
                }
                LandingModel landingModel = shortVideoContext.creativeModel.landingModel;
                if (Intrinsics.LJFF(landingModel.landingTab, "editor_tab")) {
                    if (C13LP.LJJJJ(landingModel.dataComeFrom, LJ)) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    public static boolean LIZIZ(boolean z) {
        if ((((Boolean) C1866650yfv.LIZ.getValue()).booleanValue() || z) && ((Boolean) C0BXM.LIZ.getValue()).booleanValue()) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(ShortVideoContext shortVideoContext) {
        if (!((Boolean) C266960AdC.LIZ.getValue()).booleanValue()) {
            return false;
        }
        return LIZ(shortVideoContext);
    }
}
