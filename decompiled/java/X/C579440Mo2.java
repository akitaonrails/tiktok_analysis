package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.d4;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0Mo2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C579440Mo2 {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("direct_shoot", "single_song", "prop_page", "draft_again", "anchor_combine_prop", "collection_music", "vc_page", "anchor_combine_voice_conversion", "anchor_combine_tts", "comment_reply", "add_yours", "sub_only_video_page", "aime_hub", "camera_shortcut", "green_screen_anchor", "reuse_layout", "filter_anchor");
    public static final List<String> LIZIZ = Collections.singletonList("creator_center");
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(308));

    public static boolean LIZ(ShortVideoContext shortVideoContext) {
        if (!C296510Bjl.LIZ() || ((Boolean) LIZJ.getValue()).booleanValue() || d4.LJIIJ(shortVideoContext) || shortVideoContext.LJJIIZ() || shortVideoContext.LJJIJ() || shortVideoContext.cameraComponentModel.isEditorProRecordMode || shortVideoContext.LJJJJIZL() || shortVideoContext.LJJJIL() || shortVideoContext.cameraComponentModel.editorProRecordUsedForPip || shortVideoContext.LJJJJLL() || shortVideoContext.isDuetMode || ((C1443960ngA.LJ(shortVideoContext) && !shortVideoContext.isBusinessFirstSticker.booleanValue()) || shortVideoContext.LJJJ() || shortVideoContext.LJJJJZ() || shortVideoContext.creativeModel.initialModel.dmCameraModel.enterFromDM)) {
            return false;
        }
        if (C13LP.LJJJJ(shortVideoContext.shootWay, LIZ) || C1443960ngA.LJIIZILJ(shortVideoContext) || C123100dR.LIZ(shortVideoContext.mUnpublishedEffectId) || C123100dR.LIZ(shortVideoContext.mSavedDraftId) || shortVideoContext.cameraComponentModel.LJI()) {
            return true;
        }
        if (!C13LP.LJJJJ(shortVideoContext.enterFrom, LIZIZ)) {
            return false;
        }
        return true;
    }
}
