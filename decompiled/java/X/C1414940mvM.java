package X;

import com.ss.android.ugc.aweme.creative.model.CelebrationData;
import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.creative.model.NowsExtra;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.mixediting.experiments.MixEditingPathKeys;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mvM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1414940mvM {
    public static final boolean LJI() {
        MixEditingPathKeys mixEditingPathKeys;
        MixEditingPathKeys mixEditingPathKeys2 = (MixEditingPathKeys) C1415000mvS.LIZ.getValue();
        if ((mixEditingPathKeys2 != null && mixEditingPathKeys2.enableMixMaterial) || ((mixEditingPathKeys = (MixEditingPathKeys) C1415010mvT.LIZ.getValue()) != null && mixEditingPathKeys.enableMixMaterial)) {
            return true;
        }
        MixEditingPathKeys mixEditingPathKeys3 = (MixEditingPathKeys) C1414990mvR.LIZ.getValue();
        if (mixEditingPathKeys3 != null && mixEditingPathKeys3.enableMixMaterial) {
            return true;
        }
        MixEditingPathKeys mixEditingPathKeysLIZ = C537790L7h.LIZ();
        if (mixEditingPathKeysLIZ != null && mixEditingPathKeysLIZ.enableMixMaterial) {
            return true;
        }
        MixEditingPathKeys mixEditingPathKeysLIZ2 = C537800L7i.LIZ();
        if (mixEditingPathKeysLIZ2 != null && mixEditingPathKeysLIZ2.enableMixMaterial) {
            return true;
        }
        MixEditingPathKeys mixEditingPathKeys4 = (MixEditingPathKeys) C1414970mvP.LIZ.getValue();
        if (mixEditingPathKeys4 != null && mixEditingPathKeys4.enableMixMaterial) {
            return true;
        }
        MixEditingPathKeys mixEditingPathKeys5 = (MixEditingPathKeys) C1414980mvQ.LIZ.getValue();
        if (mixEditingPathKeys5 != null && mixEditingPathKeys5.enableMixMaterial) {
            return true;
        }
        MixEditingPathKeys mixEditingPathKeys6 = (MixEditingPathKeys) C1414960mvO.LIZ.getValue();
        return (mixEditingPathKeys6 != null && mixEditingPathKeys6.enableMixMaterial) || C0L7Z.LIZ().enableMixMaterial || C1414950mvN.LIZ().enableMixMaterial;
    }

    public static final boolean LIZIZ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "studio_mix_material_enable_aigt_swipe", true, true);
    }

    public static final boolean LJII() {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_mix_editing_force_insert_sound_sync", true, true)) {
            return false;
        }
        if (C537790L7h.LIZ() == null || C537800L7i.LIZ() == null) {
            return C0L7Z.LIZ().enableMixMaterial && C0L7Z.LIZ().enableSoundSyncRecommend;
        }
        MixEditingPathKeys mixEditingPathKeysLIZ = C537790L7h.LIZ();
        if (mixEditingPathKeysLIZ == null) {
            mixEditingPathKeysLIZ = new MixEditingPathKeys(false, false, false, false, false, false, false, false, false, 0, 0, 0, null, 8191, null);
        }
        MixEditingPathKeys mixEditingPathKeysLIZ2 = C537800L7i.LIZ();
        if (mixEditingPathKeysLIZ2 == null) {
            mixEditingPathKeysLIZ2 = new MixEditingPathKeys(false, false, false, false, false, false, false, false, false, 0, 0, 0, null, 8191, null);
        }
        return (mixEditingPathKeysLIZ.enableMixMaterial && mixEditingPathKeysLIZ.enableSoundSyncRecommend) || (mixEditingPathKeysLIZ2.enableMixMaterial && mixEditingPathKeysLIZ2.enableSoundSyncRecommend);
    }

    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (!videoPublishEditModel.isCurrentAutoCutMode() || videoPublishEditModel.creativeModel.draftInfoModel.isDraft || Intrinsics.LJFF(videoPublishEditModel.mShootWay, "autocut_anchor") || C537970L7z.LIZLLL(videoPublishEditModel.creativeModel.editorProSchemeModel) || videoPublishEditModel.creativeModel.videoImageSeparateSwitchModel != null) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        NowsShootModel nowsShootModel;
        NowsExtra nowsExtra;
        if (!C565160MEo.LIZJ(videoPublishEditModel) || C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_ai_alive_enable_mix_editing", true) <= 0 || ((!C565160MEo.LIZ(videoPublishEditModel) && (C565160MEo.LIZ(videoPublishEditModel) || !LJI())) || (C1428470nHB.LJJLIIJ(videoPublishEditModel) && (nowsShootModel = videoPublishEditModel.creativeModel.nowsShootModel) != null && (nowsExtra = nowsShootModel.nowsExtra) != null && !nowsExtra.is9To16Ratio))) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        String str = videoPublishEditModel.creativeModel.autoPickModel.themeName;
        if (str == null || str.length() == 0 || !videoPublishEditModel.creativeModel.autoPickModel.isFromAutoPickPanel) {
            return false;
        }
        return true;
    }

    public static final boolean LJ(VideoPublishEditModel videoPublishEditModel) {
        Integer celebrationType;
        CelebrationData celebrationData = videoPublishEditModel.creativeModel.celebrationData;
        if (celebrationData == null || (celebrationType = celebrationData.getCelebrationType()) == null || celebrationType.intValue() != 2) {
            return false;
        }
        return true;
    }

    public static final boolean LJFF(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.isUploadVideo()) {
            CommonMobParamModel commonMobParamModel = videoPublishEditModel.creativeModel.commonMobModel;
            if (commonMobParamModel.originVideoCount == 0 && commonMobParamModel.originPhotoCount > 1) {
                return true;
            }
            return false;
        }
        return false;
    }
}
