package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.LandingModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.gamora.recorder.sticker.abtest.EnableHCInDuetExperiment;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mo3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C579450Mo3 {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("direct_shoot", "single_song", "prop_page", "draft_again", "anchor_combine_prop", "collection_music", "vc_page", "anchor_combine_voice_conversion", "anchor_combine_tts", "comment_reply", "add_yours", "sub_only_video_page", "aime_hub", "camera_shortcut", "green_screen_anchor", "reuse_layout", "filter_anchor", "views_panel", "schema");
    public static final List<String> LIZIZ = Collections.singletonList("creator_center");
    public static final List<String> LIZJ = Collections.singletonList("draft_box");
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(413));

    public static boolean LIZ(ShortVideoContext shortVideoContext) {
        if (C297940Bm4.LIZ() && !((Boolean) LIZLLL.getValue()).booleanValue()) {
            CreativeModel creativeModel = shortVideoContext.creativeModel;
            if (!creativeModel.aiSelfScanFaceModel.aiSelfScanFaceEntry && !Intrinsics.LJFF(creativeModel.recordEffectModel.stickerFrom, C0MJE.START_SCAN_FACE_EXTERNAL.toString()) && !shortVideoContext.LJJIIZ() && !shortVideoContext.cameraComponentModel.isEditorProRecordMode && !shortVideoContext.LJJJJIZL() && !shortVideoContext.LJJJIL() && !shortVideoContext.cameraComponentModel.editorProRecordUsedForPip) {
                if (EnableHCInDuetExperiment.isDuetInFWHC(shortVideoContext)) {
                    return true;
                }
                if (shortVideoContext.LJJJJLL() || shortVideoContext.LJJLL() || ((C1443960ngA.LJ(shortVideoContext) && !shortVideoContext.isBusinessFirstSticker.booleanValue()) || shortVideoContext.LJJJ() || shortVideoContext.LJJJJZ() || shortVideoContext.creativeModel.editorProAIGCInfoModel.aiPlaygroundCameraModel.fromAiPlayground || shortVideoContext.LJJIJ())) {
                    return false;
                }
                if (Intrinsics.LJFF(shortVideoContext.shootWay, "chat_shoot")) {
                    return C0A1C.LIZ();
                }
                if (C13LP.LJJJJ(shortVideoContext.shootWay, LIZ) || C1443960ngA.LJIIZILJ(shortVideoContext) || C123100dR.LIZ(shortVideoContext.mUnpublishedEffectId) || C123100dR.LIZ(shortVideoContext.mSavedDraftId) || shortVideoContext.cameraComponentModel.LJI()) {
                    return true;
                }
                if (C13LP.LJJJJ(shortVideoContext.enterFrom, LIZIZ)) {
                    return true;
                }
                LandingModel landingModel = shortVideoContext.creativeModel.landingModel;
                if (Intrinsics.LJFF(landingModel.landingTab, "editor_tab")) {
                    if (C13LP.LJJJJ(landingModel.dataComeFrom, LIZJ)) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    public static boolean LIZIZ(ShortVideoContext shortVideoContext) {
        if (C297940Bm4.LIZ() && LIZ(shortVideoContext)) {
            return true;
        }
        return false;
    }
}
