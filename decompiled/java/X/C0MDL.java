package X;

import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoConsumptionModel;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptType;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.feed.model.AIAliveInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MDL, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MDL {
    public static final boolean LIZ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "studio_story_ai_live_photo_editor_toolbar_optimize", true, false) || C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_ai_alive_main_camera_banner_config", true) > 0 || C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_ai_alive_story_banner_config", true) > 0;
    }

    public static final boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        int i;
        int i2;
        if (LIZJ(videoPublishEditModel) && C1441980ncy.LIZIZ(videoPublishEditModel)) {
            return false;
        }
        if (C565160MEo.LIZLLL(videoPublishEditModel)) {
            int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_ai_alive_story_banner_config", true);
            if (C23229098h.LIZ()) {
                C0M8O.LIZ.getClass();
                i2 = C0M8O.LIZIZ.getInt("STORY_EDIT_BANNER_SHOW_TIMES_NEW_MODEL", 0);
            } else {
                C0M8O.LIZ.getClass();
                i2 = C0M8O.LIZIZ.getInt("STORY_EDIT_BANNER_SHOW_TIMES", 0);
            }
            if (iLJIJ == 0) {
                return false;
            }
            if (iLJIJ > 0 && i2 >= iLJIJ) {
                return false;
            }
        } else if (C565160MEo.LIZJ(videoPublishEditModel) || (LIZJ(videoPublishEditModel) && !C1441980ncy.LIZIZ(videoPublishEditModel))) {
            int iLJIJ2 = C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_ai_alive_main_camera_banner_config", true);
            if (C23229098h.LIZ()) {
                C0M8O.LIZ.getClass();
                i = C0M8O.LIZIZ.getInt("MAIN_EDIT_BANNER_SHOW_TIMES_NEW_MODEL", 0);
            } else {
                C0M8O.LIZ.getClass();
                i = C0M8O.LIZIZ.getInt("MAIN_EDIT_BANNER_SHOW_TIMES", 0);
            }
            if (iLJIJ2 == 0) {
                return false;
            }
            if (iLJIJ2 > 0 && i >= iLJIJ2) {
                return false;
            }
        }
        if (videoPublishEditModel.getAILivePhotoModel().pageDataCache.hasShowBanner || LJIIIIZZ(videoPublishEditModel) || LJIIIZ(videoPublishEditModel) || LJ(videoPublishEditModel) || videoPublishEditModel.getAILivePhotoModel().LJI() || C1428470nHB.LLILLIZIL(videoPublishEditModel) || C1428470nHB.LLILL(videoPublishEditModel) || videoPublishEditModel.creativeModel.aiSelfModel.isUltraFastStyleGeneration) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        C0MDM.LIZ.getClass();
        if (!C0MDM.LIZ() || !C1428470nHB.LJJZZI(videoPublishEditModel) || C1428470nHB.LJJLIL(videoPublishEditModel)) {
            return false;
        }
        if (!C573570MeZ.LIZ() && (imageAlbumData = videoPublishEditModel.getImageAlbumData()) != null && (imageList = imageAlbumData.getImageList()) != null && imageList.size() > 1) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        if (LIZJ(videoPublishEditModel) && C1441980ncy.LIZIZ(videoPublishEditModel)) {
            return false;
        }
        C0M8O.LIZ.getClass();
        if ((!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_story_ai_live_photo_icon_anim_always_show", true, false) && !(!C0M8O.LJ)) || LJIIIIZZ(videoPublishEditModel) || LJIIIZ(videoPublishEditModel) || LIZIZ(videoPublishEditModel) || videoPublishEditModel.getAILivePhotoModel().pageDataCache.hasShowBanner || LJ(videoPublishEditModel) || videoPublishEditModel.getAILivePhotoModel().LJI() || C1428470nHB.LLILLIZIL(videoPublishEditModel) || C1428470nHB.LLILL(videoPublishEditModel) || videoPublishEditModel.creativeModel.aiSelfModel.isUltraFastStyleGeneration) {
            return false;
        }
        return true;
    }

    public static final boolean LJ(VideoPublishEditModel videoPublishEditModel) {
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        if (!videoPublishEditModel.getAILivePhotoModel().LJII() && !videoPublishEditModel.getAILivePhotoModel().LJIIIZ()) {
            if (LIZJ(videoPublishEditModel) && (imageAlbumData = videoPublishEditModel.creativeModel.imageAlbumModel) != null && (imageList = imageAlbumData.getImageList()) != null && imageList.size() > 1) {
                return true;
            }
            if (!C1414940mvM.LIZJ(videoPublishEditModel) && videoPublishEditModel.isCurrentAutoCutMode()) {
                return true;
            }
            if (C299100Bnw.LIZ() && ((Boolean) C0BOE.LIZ.getValue()).booleanValue() && C1428520nHG.LJJLIIIJLJLI(videoPublishEditModel)) {
                return true;
            }
            PhotoTemplateInfo photoTemplateInfo = videoPublishEditModel.creativeModel.photoTemplateInfo;
            if ((photoTemplateInfo != null && photoTemplateInfo.getPhotoTemplateAsset() != null) || videoPublishEditModel.getEditorProModel().isAdvancedEdit()) {
                return true;
            }
            if (C528260Kng.LIZ() && C0LXU.LIZ(Source.EDIT_AI_LIVE_PHOTO.getSource(), true).quotaRemain <= 0 && !videoPublishEditModel.getAILivePhotoModel().LJFF() && !videoPublishEditModel.getAILivePhotoModel().LJIIIZ()) {
                return true;
            }
        }
        return false;
    }

    public static final Pair<String, String> LJFF(AILivePhotoModel aILivePhotoModel) {
        PromptModel promptModelLIZJ = aILivePhotoModel.LIZJ();
        if (!promptModelLIZJ.LIZLLL()) {
            return new Pair<>(promptModelLIZJ.promptForAlgorithm, promptModelLIZJ.LIZJ());
        }
        AIAliveInfo aiAliveInfo = aILivePhotoModel.consumptionModel.getAiAliveInfo();
        String str = "";
        if (aiAliveInfo != null) {
            String modelPrompt = aiAliveInfo.getModelPrompt();
            if (modelPrompt == null) {
                modelPrompt = "";
            }
            String promptType = aiAliveInfo.getPromptType();
            if (promptType != null) {
                str = promptType;
            }
            return new Pair<>(modelPrompt, str);
        }
        return new Pair<>("", "");
    }

    public static final PromptModel LJII(VideoPublishEditModel videoPublishEditModel) {
        String text;
        PromptType next;
        PromptType promptType;
        if (!videoPublishEditModel.getAILivePhotoModel().LIZJ().LIZLLL()) {
            return videoPublishEditModel.getAILivePhotoModel().LIZJ();
        }
        if (!videoPublishEditModel.getAILivePhotoModel().pageDataCache.curPrompt.LIZLLL()) {
            return videoPublishEditModel.getAILivePhotoModel().pageDataCache.curPrompt;
        }
        AIAliveInfo aiAliveInfo = videoPublishEditModel.getAILivePhotoModel().consumptionModel.getAiAliveInfo();
        if (aiAliveInfo != null) {
            String text2 = aiAliveInfo.getText();
            String str = "";
            if (text2 == null) {
                text2 = "";
            }
            if (C123100dR.LIZ(aiAliveInfo.getModelPrompt())) {
                text = aiAliveInfo.getModelPrompt();
            } else {
                text = aiAliveInfo.getText();
            }
            if (text == null) {
                text = "";
            }
            if (Intrinsics.LJFF(aiAliveInfo.getPromptType(), "gpt_recommend")) {
                promptType = PromptType.RECOMMEND_FROM_GPT;
            } else {
                Iterator<PromptType> it2 = PromptType.getEntries().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.getMobTag(), aiAliveInfo.getPromptType())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                promptType = next;
                if (promptType == null) {
                    promptType = PromptType.RECOMMEND_FROM_GPT;
                }
            }
            String promptType2 = aiAliveInfo.getPromptType();
            if (promptType2 != null) {
                str = promptType2;
            }
            String modelKey = aiAliveInfo.getModelKey();
            if (!C123100dR.LIZ(modelKey) || modelKey == null) {
                modelKey = C274160Aoo.LIZ();
            }
            return new PromptModel(text2, text, promptType, str, modelKey, "", true);
        }
        return C0MD9.LIZ(null, PromptType.NONE, false, 29);
    }

    public static final boolean LJIIIIZZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.getAILivePhotoModel().newPromptPageModel.getAutoApplyAiAlive()) {
            return true;
        }
        if (!videoPublishEditModel.getAILivePhotoModel().consumptionModel.getHasAutoApply() && C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_ai_alive_follow_creation_sheet", true) == 1 && videoPublishEditModel.getAILivePhotoModel().consumptionModel.getAiAliveInfo() != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIIZ(VideoPublishEditModel videoPublishEditModel) {
        AILivePhotoConsumptionModel aILivePhotoConsumptionModel;
        if (!C565160MEo.LIZIZ(videoPublishEditModel) || videoPublishEditModel.getAILivePhotoModel().hasAutoShow || LJIIIIZZ(videoPublishEditModel)) {
            return false;
        }
        if (C565160MEo.LIZLLL(videoPublishEditModel)) {
            C563910M9t.LIZ.getClass();
            if (C563910M9t.LIZ() && videoPublishEditModel.getAILivePhotoModel().needAutoShow) {
                C718010SEl.LIZ.getClass();
                C718010SEl.LIZ();
                if (C0M9T.LIZ().enableAILiveEducationSuppression && C718010SEl.LJIIIZ()) {
                    return false;
                }
                return true;
            }
        }
        if ((C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_ai_alive_follow_creation_sheet", true) != 2 || (!C565160MEo.LJ(videoPublishEditModel) && !C565160MEo.LJFF(videoPublishEditModel))) && ((!Intrinsics.LJFF(videoPublishEditModel.mShootWay, "single_song") || !Intrinsics.LJFF(videoPublishEditModel.getShootEnterMethod(), "ai_livephoto_single_song")) && videoPublishEditModel.getAILivePhotoModel().consumptionModel.getAiAliveInfo() == null && !C565160MEo.LJI(videoPublishEditModel) && !C565160MEo.LJ(videoPublishEditModel) && ((!Intrinsics.LJFF(videoPublishEditModel.mShootWay, "notification_page") || (aILivePhotoConsumptionModel = videoPublishEditModel.creativeModel.aiLivePhotoModel.consumptionModel) == null || !aILivePhotoConsumptionModel.getEnterToPost()) && ((!Intrinsics.LJFF(videoPublishEditModel.mShootWay, "single_song") || !Intrinsics.LJFF(videoPublishEditModel.getShootEnterMethod(), "ai_livephoto_single_song")) && videoPublishEditModel.creativeModel.aiLivePhotoModel.mobParam.generateSidebarType != 2)))) {
            return false;
        }
        return true;
    }

    public static final String LJI(PromptModel promptModel, AILivePhotoModel aILivePhotoModel) {
        AILivePhotoConsumptionModel aILivePhotoConsumptionModel = aILivePhotoModel.consumptionModel;
        AIAliveInfo originAIAliveInfo = aILivePhotoConsumptionModel.getOriginAIAliveInfo();
        AIAliveInfo aiAliveInfo = aILivePhotoConsumptionModel.getAiAliveInfo();
        String modelPrompt = null;
        if (aiAliveInfo == null || aiAliveInfo.getModelPrompt() == null) {
            return null;
        }
        if (originAIAliveInfo != null && originAIAliveInfo.getModelPrompt() != null) {
            if (promptModel.LIZLLL()) {
                return aILivePhotoModel.consumptionModel.getFollowPromptTypeSafelyBeforeEdit();
            }
            String str = promptModel.promptForAlgorithm;
            if (originAIAliveInfo != null) {
                modelPrompt = originAIAliveInfo.getModelPrompt();
            }
            if (!Intrinsics.LJFF(str, modelPrompt)) {
                return promptModel.LIZJ();
            }
            return PromptType.DEFAULT.getMobTag();
        }
        return promptModel.LIZJ();
    }
}
