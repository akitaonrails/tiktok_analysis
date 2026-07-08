package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mo6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C579480Mo6 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(ShortVideoContext shortVideoContext) {
        String str;
        if (!shortVideoContext.mIsFromDraft && !C123100dR.LIZ(shortVideoContext.newDraftId) && !Intrinsics.LJFF(shortVideoContext.enterFrom, "super_entrance") && shortVideoContext.isSpecialPlusIcon != 1 && (((str = shortVideoContext.presetEffectId) == null || str.length() == 0) && "direct_shoot".equals(shortVideoContext.shootWay) && !shortVideoContext.cameraComponentModel.isEditorProRecordMode && !shortVideoContext.creativeModel.editorProAIGCInfoModel.aiPlaygroundCameraModel.fromAiPlayground)) {
            return true;
        }
        if (!C0CIU.LIZ() || !Intrinsics.LJFF(shortVideoContext.shootWay, "single_song")) {
            return false;
        }
        return !C533930Kwp.LIZIZ(new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"});
    }
}
