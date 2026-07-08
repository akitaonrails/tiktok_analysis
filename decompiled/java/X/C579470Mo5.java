package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.csi.ISearchCSIService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.d4;
import com.ss.android.ugc.gamora.recorder.bottom.o0;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import rlf.a;

/* JADX INFO: renamed from: X.0Mo5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C579470Mo5 {
    public static final C579470Mo5 LIZ = new C579470Mo5();

    public static boolean LIZ(ShortVideoContext shortVideoContext) {
        if (C13LQ.LJJIJIIJI(shortVideoContext.shootWay, new String[]{"prop_page"}) >= 0 && d4.LJIILL(shortVideoContext)) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(ShortVideoContext shortVideoContext) {
        if (C13LQ.LJJIJIIJI(shortVideoContext.shootWay, new String[]{"single_song", "followup_square"}) >= 0 && d4.LJIILL(shortVideoContext)) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(ShortVideoContext shortVideoContext) {
        String str;
        String strLJIIIZ;
        ISearchCSIService iSearchCSIService;
        if (!shortVideoContext.mIsFromDraft && !shortVideoContext.isRestoreFromSaveInstance) {
            if (a.LIZ.LIZIZ(shortVideoContext, new AwS552S0100000_8(shortVideoContext, 1078)) == 16 || Intrinsics.LJFF(shortVideoContext.enterFrom, "homepage_explore")) {
                return true;
            }
            if (C1443960ngA.LJ(shortVideoContext) || TextUtils.equals(shortVideoContext.enterFrom, "super_entrance") || ((shortVideoContext.creativeModel.recordEffectModel.hasAutoApplyEffect && !LIZ(shortVideoContext) && !LIZIZ(shortVideoContext)) || shortVideoContext.creativeModel.draftInfoModel.isDraft)) {
                return false;
            }
            if ((C13LQ.LJJIJIIJI(shortVideoContext.shootWay, new String[]{"reuse_layout", "filter_anchor"}) >= 0 && d4.LJIILL(shortVideoContext)) || C1443960ngA.LJI(shortVideoContext)) {
                return true;
            }
            o0 o0Var = o0.LIZ;
            String str2 = shortVideoContext.shootWay;
            o0Var.getClass();
            if ((C13LP.LJJJJ(str2, o0.LIZJ) && !com.ss.android.ugc.aweme.story.a.LIZ()) || LIZIZ(shortVideoContext) || LIZ(shortVideoContext)) {
                return true;
            }
            if (d4.LJIJI(shortVideoContext) && ((iSearchCSIService = (ISearchCSIService) PluggableExtentionKt.pluggableSpi$default(ISearchCSIService.class, false, false, false, 14, null)) == null || !iSearchCSIService.LIZJ(shortVideoContext))) {
                return true;
            }
            if ((C539900LFk.LJIIIIZZ(shortVideoContext) || shortVideoContext.mIsFromDraft || C123100dR.LIZ(shortVideoContext.newDraftId) || Intrinsics.LJFF(shortVideoContext.enterFrom, "super_entrance") || shortVideoContext.LJJJJI() || (((str = shortVideoContext.presetEffectId) != null && str.length() != 0) || shortVideoContext.putPresetStickerAtFirst || (((strLJIIIZ = shortVideoContext.LJIIIZ()) != null && strLJIIIZ.length() != 0) || shortVideoContext.isSpecialPlusIcon != 0 || !"direct_shoot".equals(shortVideoContext.shootWay) || shortVideoContext.cameraComponentModel.isEditorProRecordMode || shortVideoContext.creativeModel.editorProAIGCInfoModel.aiPlaygroundCameraModel.fromAiPlayground))) && !Intrinsics.LJFF("camera_shortcut", shortVideoContext.shootWay)) {
                return false;
            }
            return true;
        }
        if (shortVideoContext.shootMode != 16) {
            return false;
        }
        return true;
    }
}
