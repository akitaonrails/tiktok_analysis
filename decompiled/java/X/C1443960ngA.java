package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.DuetContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ngA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1443960ngA {
    public static final void LIZ(ShortVideoContext shortVideoContext) {
        long jMin;
        long maxDuration;
        if (shortVideoContext == null) {
            return;
        }
        int i = shortVideoContext.shootMode;
        boolean z = true;
        if (i != 10) {
            if (i != 11 && i != 14 && i != 18) {
                jMin = shortVideoContext.cameraComponentModel.mMaxDuration;
            } else {
                jMin = Math.min(shortVideoContext.cameraComponentModel.mMaxDuration, C0CHQ.LIZ().LJJJJJ().getMaxDurationResolver().getMaxShootingDuration(false, shortVideoContext));
            }
        } else {
            jMin = Math.min(shortVideoContext.cameraComponentModel.mMaxDuration, C0CHQ.LIZ().LJJJJJ().getMaxDurationResolver().getMaxShootingDuration(true, shortVideoContext));
        }
        shortVideoContext.LJJLIIIJJI(jMin);
        BackgroundVideo backgroundVideo = shortVideoContext.cameraComponentModel.curBackgroundVideo;
        if (backgroundVideo != null) {
            maxDuration = backgroundVideo.getMaxDuration();
        } else {
            maxDuration = 0;
        }
        BackgroundVideo backgroundVideo2 = shortVideoContext.cameraComponentModel.curBackgroundVideo;
        if (backgroundVideo2 == null || backgroundVideo2.isMultiBgVideo()) {
            z = false;
        }
        if (maxDuration > 0 && z && !shortVideoContext.LJJJJZ()) {
            shortVideoContext.LJJLIIIJJI(Math.min(shortVideoContext.cameraComponentModel.mMaxDuration, maxDuration));
        }
    }

    public static final void LIZIZ(ShortVideoContext shortVideoContext) {
        String str = null;
        shortVideoContext.LJJLIIIJILLIZJL(null);
        if (shortVideoContext.LJJLL()) {
            str = shortVideoContext.cameraComponentModel.duetContext.duetAudioPath;
        }
        shortVideoContext.cameraComponentModel.mMusicPath = str;
        if (C123100dR.LIZ(str)) {
            CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
            Workspace workspace = cameraComponentModel.mWorkspace;
            if (workspace != null) {
                workspace.MC(cameraComponentModel.mMusicPath);
            }
        } else {
            Workspace workspace2 = shortVideoContext.cameraComponentModel.mWorkspace;
            if (workspace2 != null) {
                workspace2.wQ();
            }
        }
        LJFF(shortVideoContext);
        shortVideoContext.LJJLIIIJ((int) shortVideoContext.cameraComponentModel.mMaxDuration);
    }

    public static final boolean LIZJ(ShortVideoContext shortVideoContext) {
        CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
        if (cameraComponentModel.isEditorProRecordMode && !cameraComponentModel.editorProRecordEnableMusic && !cameraComponentModel.isRetakeMode) {
            return true;
        }
        return false;
    }

    public static final boolean LIZLLL(ShortVideoContext shortVideoContext) {
        if (Intrinsics.LJFF(shortVideoContext.creativeModel.stickerModel.isQADraft, Boolean.TRUE) || C0CHQ.LIZ().getAccountService().LIZ()) {
            return false;
        }
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if ((currentUser != null && currentUser.LIZLLL() == 3) || shortVideoContext.LJJJJZ()) {
            return false;
        }
        if (C1466090oFr.LJIIJ(shortVideoContext.creativeModel.stickerModel)) {
            return true;
        }
        return C1403940mdc.LIZ();
    }

    public static final boolean LJ(ShortVideoContext shortVideoContext) {
        AVChallenge recordChallenge;
        String str;
        AVChallenge recordChallenge2;
        if (shortVideoContext.isBusinessFirstSticker.booleanValue() || (((recordChallenge = shortVideoContext.creativeModel.commerceModel.getRecordChallenge()) != null && (str = recordChallenge.challengeName) != null && str.length() > 0 && (recordChallenge2 = shortVideoContext.creativeModel.commerceModel.getRecordChallenge()) != null && recordChallenge2.isCommerce) || Intrinsics.LJFF(shortVideoContext.shootWay, "tcm_upload") || shortVideoContext.creativeModel.commerceModel.getMission() != null)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJFF(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r9) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1443960ngA.LJFF(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext):void");
    }

    public static final boolean LJI(ShortVideoContext shortVideoContext) {
        Iterator<AddYoursStickerModel> it2 = shortVideoContext.creativeModel.stickerModel.addYoursStickerModels.iterator();
        while (it2.hasNext()) {
            if (it2.next().getTopicType() == 2) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJII(ShortVideoContext shortVideoContext) {
        boolean z;
        DuetContext duetContext = shortVideoContext.cameraComponentModel.duetContext;
        String str = duetContext.duetVideoPath;
        String str2 = duetContext.duetAudioPath;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            z = true;
        } else {
            z = false;
        }
        if (Intrinsics.LJFF(shortVideoContext.shootWay, "duet") || z) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIIIZZ(ShortVideoContext shortVideoContext) {
        return shortVideoContext.cameraComponentModel.isEditorProRecordMode;
    }

    public static final boolean LJIIIZ(ShortVideoContext shortVideoContext) {
        return shortVideoContext.creativeModel.aiSelfScanFaceModel.hideCameraUIOnStartRecord;
    }

    public static final boolean LJIIJ(ShortVideoContext shortVideoContext) {
        return C1697810uHb.LJIIJJI(15, 17).contains(Integer.valueOf(shortVideoContext.shootMode));
    }

    public static final boolean LJIIJJI(StitchParams stitchParams) {
        if (stitchParams == null || stitchParams.getMusic() == null || !stitchParams.isPGCMusic() || stitchParams.getMusicStart() < 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIL(ShortVideoContext shortVideoContext) {
        if (shortVideoContext.shootMode == 16) {
            return true;
        }
        return false;
    }

    public static final void LJIILIIL(ShortVideoContext shortVideoContext) {
        shortVideoContext.creativeModel.editorProAIGCInfoModel.aiPlaygroundCameraModel.fromAiPlayground = true;
    }

    public static final void LJIILJJIL(ShortVideoContext shortVideoContext) {
        shortVideoContext.cameraComponentModel.isEditorProRecordMode = true;
    }

    public static final void LJIILLIIL(ShortVideoContext shortVideoContext) {
        shortVideoContext.cameraComponentModel.isEditorTabAICreateRecordMode = true;
    }

    public static final boolean LJIIZILJ(ShortVideoContext shortVideoContext) {
        if (!C123100dR.LIZ(shortVideoContext.LJIIIZ()) && !C123100dR.LIZ(shortVideoContext.presetEffectId)) {
            return false;
        }
        return true;
    }

    public static final void LJIILL(boolean z, ShortVideoContext shortVideoContext) {
        shortVideoContext.cameraComponentModel.editorProRecordUsedForPip = z;
    }
}
