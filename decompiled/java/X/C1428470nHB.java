package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEKeyframe;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLEKeyframe;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.canvas.CanvasBackground;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.AISelfModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.EditPageFunctionTracking;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.creative.model.NowsExtra;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.creative.model.PhotoEditData;
import com.ss.android.ugc.aweme.creative.model.StoryNoteInfoModel;
import com.ss.android.ugc.aweme.creative.model.StoryShootModel;
import com.ss.android.ugc.aweme.creative.model.TemplateConsumeData;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenChatRoomModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenModel;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoSwitchFromImageModel;
import com.ss.android.ugc.aweme.creative.model.ailive.EditSwitchStyle;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfoNewEngine;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcLiveVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.SelectedMaterialItem;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AiPlaygroundCameraModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCInfoModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.TaskInfoInCreativeModel;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.creative.model.publish.PostPageModel;
import com.ss.android.ugc.aweme.creative.model.record.CameraLayoutModel;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.poi.PoiReTagInfo;
import com.ss.android.ugc.aweme.poi.RecPoiItemModel;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.publish.MobParam;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.InteractStickerTracksContext;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.liveshare.LiveShareStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.socialavatar.SocialAvatarStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0nHB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1428470nHB {
    public static final boolean LJJJJL() {
        return C19422210yi.LIZIZ() || C19422210yi.LIZJ() || C19422210yi.LIZ();
    }

    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        ArrayList<TimeSpeedModelExtension> arrayList;
        boolean z = true;
        if (LJJZZI(videoPublishEditModel)) {
            StickerInfo stickerInfo = videoPublishEditModel.stickerInfo;
            if (stickerInfo == null || !stickerInfo.isMobileEffect()) {
                return false;
            }
        } else {
            MultiEditVideoStatusRecordData multiEditVideoRecordData = videoPublishEditModel.getMultiEditVideoRecordData();
            if (multiEditVideoRecordData != null && (arrayList = multiEditVideoRecordData.originalSegments) != null) {
                z = false;
                for (TimeSpeedModelExtension timeSpeedModelExtension : arrayList) {
                    if (timeSpeedModelExtension.getStickerInfo() != null && timeSpeedModelExtension.getStickerInfo().isMobileEffect()) {
                        z = true;
                    }
                }
            } else {
                return false;
            }
        }
        return z;
    }

    public static final boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        ImageAlbumData imageAlbumData;
        ImageAlbumData imageAlbumData2;
        List<SingleImageData> imageList;
        if (videoPublishEditModel.getImageAlbumData() == null || (imageAlbumData = videoPublishEditModel.getImageAlbumData()) == null || imageAlbumData.getImageList() == null || (imageAlbumData2 = videoPublishEditModel.getImageAlbumData()) == null || (imageList = imageAlbumData2.getImageList()) == null || imageList.size() != 1) {
            return false;
        }
        return true;
    }

    public static final void LIZJ(DraftInfoModel draftInfoModel) {
        if (draftInfoModel.isPublishedDraft) {
            draftInfoModel.isPublishedDraft = false;
            draftInfoModel.publishedTime = 0L;
            draftInfoModel.publishedAwemeId = "";
            draftInfoModel.isConvertToNormalDraft = true;
        }
    }

    public static final boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.getVideoCanvasWidth() > 0 && videoPublishEditModel.getVideoCanvasHeight() > 0) {
            if (videoPublishEditModel.getVideoCanvasWidth() >= videoPublishEditModel.videoWidth() || videoPublishEditModel.getVideoCanvasHeight() >= videoPublishEditModel.videoHeight()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJFF(VideoPublishEditModel videoPublishEditModel) {
        CreativeModel creativeModel;
        EditorProAIGCInfoModel editorProAIGCInfoModel;
        AiPlaygroundCameraModel aiPlaygroundCameraModel;
        if (videoPublishEditModel == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (editorProAIGCInfoModel = creativeModel.editorProAIGCInfoModel) == null || (aiPlaygroundCameraModel = editorProAIGCInfoModel.aiPlaygroundCameraModel) == null || !aiPlaygroundCameraModel.fromAiPlayground) {
            return false;
        }
        return true;
    }

    public static final boolean LJI(VideoPublishEditModel videoPublishEditModel) {
        if (!videoPublishEditModel.isStitchMode() && !videoPublishEditModel.isDuet()) {
            if (!C13LP.LJJJJ(videoPublishEditModel.mShootWay, C1697810uHb.LJIIJJI("single_song", "prop_page", "mv_page", "click_internal_entrance", "prop_reuse", "mv_reuse", "ugc_template", "pugc_template", "autocut_anchor", "add_yours"))) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final List<TextStickerModel> LJIIIZ(VideoPublishEditModel videoPublishEditModel) {
        Iterable textStickerModels;
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (LJJZZI(videoPublishEditModel) && imageAlbumData != null && !LJJJJLL(videoPublishEditModel)) {
            List<SingleImageData> imageList = imageAlbumData.getImageList();
            ArrayList arrayList = new ArrayList();
            Iterator<SingleImageData> it2 = imageList.iterator();
            while (it2.hasNext()) {
                ImageStickerInfoNewEngine stickerInfoNewEngine = it2.next().getStickerInfoNewEngine();
                if (stickerInfoNewEngine == null || (textStickerModels = stickerInfoNewEngine.getTextStickerModels()) == null) {
                    textStickerModels = C13BV.INSTANCE;
                }
                C19719612Di.LJJI(textStickerModels, arrayList);
            }
            return arrayList;
        }
        return videoPublishEditModel.creativeModel.stickerModel.textStickerModels;
    }

    public static final boolean LJIIJ(VideoPublishEditModel videoPublishEditModel) {
        if (LJJZZI(videoPublishEditModel)) {
            ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
            if (imageAlbumData != null) {
                return imageAlbumData.getAutoEnhanceOn();
            }
            return false;
        }
        return videoPublishEditModel.getAutoEnhanceOn();
    }

    public static final int LJIIJJI(VideoPublishEditModel videoPublishEditModel) {
        InteractStickerTracksContext interactStickerTracksContext;
        if (videoPublishEditModel != null) {
            C1429890nJT mainBusinessContext = videoPublishEditModel.getMainBusinessContext();
            EnumC1428480nHC[] enumC1428480nHCArr = {EnumC1428480nHC.TRACK_PAGE_RECORD};
            LinkedList linkedList = new LinkedList();
            if (mainBusinessContext != null && (interactStickerTracksContext = mainBusinessContext.mInteractStickerContext) != null && !interactStickerTracksContext.isEmpty(enumC1428480nHCArr)) {
                linkedList.addAll(interactStickerTracksContext.getStickerStructsByPage(enumC1428480nHCArr));
            } else {
                linkedList = null;
            }
            if (!C086I.LIZIZ(linkedList)) {
                return 54;
            }
        }
        List<LiveShareStickerModel> list = videoPublishEditModel.creativeModel.stickerModel.liveShareStickerModels;
        if (list != null && !list.isEmpty()) {
            return 190;
        }
        if (videoPublishEditModel.getTextPublishUploadModel() != null) {
            return 230;
        }
        if (videoPublishEditModel.getTtStoryUploadModel() != null && LJJZZI(videoPublishEditModel)) {
            return 152;
        }
        if (LJJZZI(videoPublishEditModel)) {
            return 150;
        }
        if (LLIIIJ(videoPublishEditModel)) {
            return 160;
        }
        if (!videoPublishEditModel.isPhotoMvMode()) {
            if (!videoPublishEditModel.isMvThemeVideoType() && !videoPublishEditModel.isCutSameVideoType() && !LLIIIZ(videoPublishEditModel)) {
                if (videoPublishEditModel.isStitchMode()) {
                    return 58;
                }
                if (videoPublishEditModel.isDuet()) {
                    return 51;
                }
                if (!videoPublishEditModel.isStickPointMode() && !videoPublishEditModel.getEditMusicSyncMode()) {
                    if (!C1444940nhk.LJII(videoPublishEditModel.getCanvasVideoData())) {
                        if (videoPublishEditModel.isEnterFromBulletin()) {
                            return 220;
                        }
                        return -1;
                    }
                    return 61;
                }
                return 55;
            }
            return 53;
        }
        return 61;
    }

    public static final String LJIIL(VideoPublishEditModel videoPublishEditModel) {
        CanvasBackground canvasBackground;
        String filePath;
        String strLJJLJLI;
        CanvasVideoData canvasVideoData = videoPublishEditModel.getCanvasVideoData();
        if (canvasVideoData == null || (canvasBackground = canvasVideoData.background) == null || (filePath = canvasBackground.getFilePath()) == null || (strLJJLJLI = a0.LJJLJLI(filePath, "/", filePath)) == null) {
            return "";
        }
        return strLJJLJLI;
    }

    public static final String LJIILIIL(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        int iLIZ;
        List<SingleImageData> imageList;
        List<SingleImageData> imageList2;
        int iLIZ2;
        int iLJ;
        int size;
        List<SingleImageData> imageList3;
        List<SingleImageData> imageList4;
        List<MultiEditVideoSegmentRecordData> list;
        List<MultiEditVideoSegmentRecordData> list2;
        if (videoPublishEditModel == null) {
            return "";
        }
        C548590LfN.LIZ.getClass();
        int iLJ2 = 0;
        if (C548590LfN.LIZJ().LJFF(videoPublishEditModel.creativeModel) != null && (!r0.isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "ai_generate";
        }
        if (videoPublishEditModel.creativeModel.aigcOfflineModel.isOfflineAIGCEffectGenerated) {
            return "shoot";
        }
        if (LLFII(videoPublishEditModel)) {
            return "upload";
        }
        if (videoPublishEditModel.creativeModel.aiCreateModel != null) {
            return "ai_generate";
        }
        if (videoPublishEditModel.isCurrentAutoCutMode() && !Intrinsics.LJFF(videoPublishEditModel.mShootWay, "autocut_anchor")) {
            if (videoPublishEditModel.getOrigin() != 0) {
                return "shoot";
            }
            return "upload";
        }
        if ((!videoPublishEditModel.isCurrentAutoCutMode() || !Intrinsics.LJFF(videoPublishEditModel.mShootWay, "autocut_anchor")) && !LLIIJI(videoPublishEditModel) && !LJJJJLI(videoPublishEditModel) && !LJLJL(videoPublishEditModel) && !LJJJJJ(videoPublishEditModel) && !LJLLLL(videoPublishEditModel) && !C1416310mxZ.LJJJIL(videoPublishEditModel) && !Intrinsics.LJFF(videoPublishEditModel.mShootWay, "mv_page")) {
            if (videoPublishEditModel.getEditorProModel().isAdvancedEditDraft() && videoPublishEditModel.getCanvasVideoData() == null && !LJJJJLL(videoPublishEditModel)) {
                if (videoPublishEditModel.getEditorProModel().getAlbumUploadVideoSegments().size() == 0) {
                    return "shoot";
                }
                MultiEditVideoRecordData curMultiEditVideoRecordData = videoPublishEditModel.getCurMultiEditVideoRecordData();
                if (curMultiEditVideoRecordData != null && (list = curMultiEditVideoRecordData.segmentDataList) != null && videoPublishEditModel.getEditorProModel().getAlbumUploadVideoSegments().size() == list.size()) {
                    return "upload";
                }
                return "shoot_and_upload";
            }
            if (C1444940nhk.LJI(videoPublishEditModel.getCanvasVideoData()) || videoPublishEditModel.creativeModel.onThisDayData.isFromOnThisDay()) {
                return "upload";
            }
            if (LJJLIIIJJIZ(videoPublishEditModel)) {
                if (C1416310mxZ.LJJJI(videoPublishEditModel)) {
                    CameraLayoutModel cameraLayoutModel = videoPublishEditModel.creativeModel.cameraLayoutModel;
                    if (cameraLayoutModel != null) {
                        iLIZ2 = C0L5H.LIZ(cameraLayoutModel);
                    } else {
                        iLIZ2 = 0;
                    }
                    CameraLayoutModel cameraLayoutModel2 = videoPublishEditModel.creativeModel.cameraLayoutModel;
                    if (cameraLayoutModel2 != null) {
                        iLJ = C0L5H.LJ(cameraLayoutModel2);
                    } else {
                        iLJ = 0;
                    }
                    ImageAlbumData imageAlbumData = videoPublishEditModel.creativeModel.imageAlbumModel;
                    if (imageAlbumData != null && (imageList4 = imageAlbumData.getImageList()) != null) {
                        ArrayList arrayList = new ArrayList();
                        for (SingleImageData singleImageData : imageList4) {
                            if (!singleImageData.isCameraPhoto()) {
                                arrayList.add(singleImageData);
                            }
                        }
                        size = arrayList.size();
                    } else {
                        size = 0;
                    }
                    int i = iLJ + size;
                    ImageAlbumData imageAlbumData2 = videoPublishEditModel.creativeModel.imageAlbumModel;
                    if (imageAlbumData2 != null && (imageList3 = imageAlbumData2.getImageList()) != null) {
                        if (!imageList3.isEmpty()) {
                            Iterator<SingleImageData> it2 = imageList3.iterator();
                            while (it2.hasNext()) {
                                if (!(!it2.next().isCameraPhoto())) {
                                }
                            }
                        }
                        return "upload";
                    }
                    if (iLIZ2 <= 0) {
                        return "upload";
                    }
                    if (i <= 0) {
                        return "shoot";
                    }
                    return "shoot_and_upload";
                }
                ImageAlbumData imageAlbumData3 = videoPublishEditModel.creativeModel.imageAlbumModel;
                if (imageAlbumData3 != null && (imageList2 = imageAlbumData3.getImageList()) != null) {
                    if (!imageList2.isEmpty()) {
                        Iterator<SingleImageData> it3 = imageList2.iterator();
                        while (it3.hasNext()) {
                            if (!it3.next().isCameraPhoto()) {
                            }
                        }
                    }
                    return "shoot";
                }
                ImageAlbumData imageAlbumData4 = videoPublishEditModel.creativeModel.imageAlbumModel;
                if (imageAlbumData4 != null && (imageList = imageAlbumData4.getImageList()) != null) {
                    if (!imageList.isEmpty()) {
                        Iterator<SingleImageData> it4 = imageList.iterator();
                        while (it4.hasNext()) {
                            if (!(!it4.next().isCameraPhoto())) {
                            }
                        }
                    }
                    return "upload";
                }
                return "shoot_and_upload";
            }
            if (C1416310mxZ.LJJJI(videoPublishEditModel)) {
                CameraLayoutModel cameraLayoutModel3 = videoPublishEditModel.creativeModel.cameraLayoutModel;
                if (cameraLayoutModel3 != null) {
                    iLIZ = C0L5H.LIZ(cameraLayoutModel3);
                } else {
                    iLIZ = 0;
                }
                CameraLayoutModel cameraLayoutModel4 = videoPublishEditModel.creativeModel.cameraLayoutModel;
                if (cameraLayoutModel4 != null) {
                    iLJ2 = C0L5H.LJ(cameraLayoutModel4);
                }
                if (iLIZ > 0) {
                    if (iLJ2 <= 0) {
                        return "shoot";
                    }
                    return "shoot_and_upload";
                }
                if (iLJ2 > 0) {
                    return "upload";
                }
            }
            if (videoPublishEditModel.getOrigin() != 0) {
                return "shoot";
            }
            return "upload";
        }
        if (videoPublishEditModel.getEditorProModel().isAdvancedEdit()) {
            if (videoPublishEditModel.getEditorProModel().getAlbumUploadVideoSegments().isEmpty()) {
                return "shoot";
            }
            MultiEditVideoRecordData curMultiEditVideoRecordData2 = videoPublishEditModel.getCurMultiEditVideoRecordData();
            if (curMultiEditVideoRecordData2 != null && (list2 = curMultiEditVideoRecordData2.segmentDataList) != null && videoPublishEditModel.getEditorProModel().getAlbumUploadVideoSegments().size() == list2.size()) {
                return LJIILJJIL(videoPublishEditModel);
            }
            if (Intrinsics.LJFF(LJIILJJIL(videoPublishEditModel), "shoot")) {
                return "shoot";
            }
            return "shoot_and_upload";
        }
        return LJIILJJIL(videoPublishEditModel);
    }

    public static final String LJIILJJIL(VideoPublishEditModel videoPublishEditModel) {
        Integer numValueOf;
        String originImportPath;
        ArrayList<ImportVideoInfo> arrayList = videoPublishEditModel.creativeModel.albumModel.importInfoList;
        Integer numValueOf2 = null;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (ImportVideoInfo importVideoInfo : arrayList) {
                if (C123100dR.LIZ(importVideoInfo.getOriginImportPath())) {
                    arrayList2.add(importVideoInfo);
                }
            }
            numValueOf = Integer.valueOf(arrayList2.size());
        } else {
            numValueOf = null;
        }
        ArrayList<ImportVideoInfo> arrayList3 = videoPublishEditModel.creativeModel.albumModel.importInfoList;
        if (arrayList3 != null) {
            int i = 0;
            if (!arrayList3.isEmpty()) {
                int i2 = 0;
                for (ImportVideoInfo importVideoInfo2 : arrayList3) {
                    String originImportPath2 = importVideoInfo2.getOriginImportPath();
                    if ((originImportPath2 != null && a0.LJJIIZI(originImportPath2, EnumC20228214Cy.UGC_TEMPLATE.getNameSpace(), false)) || ((originImportPath = importVideoInfo2.getOriginImportPath()) != null && a0.LJJIIZI(originImportPath, "/record/editor_pro", false))) {
                        i2++;
                        if (i2 < 0) {
                            C1697810uHb.LJIJ();
                            throw null;
                        }
                    }
                }
                i = i2;
            }
            numValueOf2 = Integer.valueOf(i);
            if (numValueOf2 != null && numValueOf2.intValue() == 0) {
                return "upload";
            }
        }
        if (Intrinsics.LJFF(numValueOf, numValueOf2)) {
            return "shoot";
        }
        return "shoot_and_upload";
    }

    public static final String LJIILL(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        String str;
        if (videoPublishEditModel == null) {
            return "";
        }
        if (u.LJIJI(videoPublishEditModel.creativeModel.templateSchemaData.schemaTag, "template_schema", false)) {
            if (videoPublishEditModel.creativeModel.templateSchemaData.throughTemplateSquareH5) {
                return "mv";
            }
            z = false;
        } else {
            z = true;
        }
        if (videoPublishEditModel.creativeModel.photoModeEnterEditingStage.itemType != EnumC1413160msU.SLIDESHOW) {
            if (LJLI(videoPublishEditModel) && !LJJLI(videoPublishEditModel)) {
                return "autocut";
            }
            if (C1444940nhk.LIZLLL(videoPublishEditModel.getCanvasVideoData())) {
                return "comment_repost";
            }
            if (videoPublishEditModel.isCurrentAutoCutMode() || LJLJJLL(videoPublishEditModel)) {
                return "autocut";
            }
            if (LJJZZI(videoPublishEditModel)) {
                if (videoPublishEditModel.getTtStoryUploadModel() != null) {
                    if (videoPublishEditModel.creativeModel.miniGameData == null) {
                        return "story_photo";
                    }
                    return "photo_canvas";
                }
                return "multi_photo";
            }
            if (videoPublishEditModel.getTextPublishUploadModel() != null) {
                return "text_post";
            }
            if (LLIIIJ(videoPublishEditModel)) {
                return "text";
            }
            if (LLFZ(videoPublishEditModel)) {
                StoryNoteInfoModel storyNoteInfoModel = videoPublishEditModel.creativeModel.storyModel.getStoryNoteInfoModel();
                if (storyNoteInfoModel == null || (str = storyNoteInfoModel.textContent) == null) {
                    return "";
                }
                if (!((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().onlyEmoji(str)) {
                    return "text";
                }
                return "emoji";
            }
            if (videoPublishEditModel.isPhotoMvMode()) {
                return "slideshow";
            }
            if (videoPublishEditModel.isMvThemeVideoType() && z) {
                return "mv";
            }
            if (videoPublishEditModel.isCutSameVideoType() && z) {
                return "mv";
            }
            if (LLIIIZ(videoPublishEditModel) && z) {
                return "mv";
            }
            LivePhotoModel livePhotoModel = videoPublishEditModel.creativeModel.livePhotoModel;
            if (livePhotoModel != null && livePhotoModel.enableLiveMode) {
                return "live";
            }
            if (!videoPublishEditModel.isStickPointMode() && !videoPublishEditModel.getEditMusicSyncMode()) {
                if (videoPublishEditModel.creativeModel.onThisDayData.isFromOnThisDay()) {
                    if (!C1444940nhk.LJII(videoPublishEditModel.getCanvasVideoData())) {
                        if (LJJZZI(videoPublishEditModel)) {
                            return "multi_photo";
                        }
                        return "video";
                    }
                    return "photo_canvas";
                }
                if (!C1444940nhk.LJIIJ(videoPublishEditModel.getCanvasVideoData()) && !C1444940nhk.LJFF(videoPublishEditModel.getCanvasVideoData())) {
                    if (!C1444940nhk.LJII(videoPublishEditModel.getCanvasVideoData())) {
                        if (videoPublishEditModel.getAvetParameter() != null) {
                            return videoPublishEditModel.getAvetParameter().getContentType();
                        }
                        return "video";
                    }
                    return "photo_canvas";
                }
                return "share";
            }
            return "sound_sync";
        }
        return "autocut";
    }

    public static final VideoPublishEditModel LJIILLIIL(Intent intent) {
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) intent.getSerializableExtra("args");
        videoPublishEditModel.creativeModel = C0MUK.LIZIZ(intent);
        videoPublishEditModel.refreshOldFieldIfNeeded();
        return videoPublishEditModel;
    }

    public static final boolean LJIIZILJ(VideoPublishEditModel videoPublishEditModel) {
        Cut2EditTransferModel cut2EditTransferModel;
        if (((!videoPublishEditModel.creativeModel.draftInfoModel.isDraft && !videoPublishEditModel.isRestoreFromSaveInstance()) || !videoPublishEditModel.getEditMusicSyncMode()) && (videoPublishEditModel.creativeModel.draftInfoModel.isDraft || (cut2EditTransferModel = videoPublishEditModel.getCut2EditTransferModel()) == null || !cut2EditTransferModel.getMusicSyncMode() || videoPublishEditModel.isLivePhotoEdit())) {
            return false;
        }
        return true;
    }

    public static final String LJIJ(VideoPublishEditModel videoPublishEditModel) {
        PostPageModel postPageModel;
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        if (creativeModel != null && (postPageModel = creativeModel.postPageModel) != null && postPageModel.isEnterFromEPDirectly) {
            return "editor_pro";
        }
        String enterFrom = videoPublishEditModel.getEnterFrom();
        if (enterFrom != null) {
            return enterFrom;
        }
        return "";
    }

    public static final List<String> LJIJI(List<AVTextExtraStruct> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<AVTextExtraStruct> it2 = list.iterator();
            while (it2.hasNext()) {
                String str = it2.next().hashTagName;
                if (str == null) {
                    str = "";
                }
                arrayList.add(str);
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static final int LJIJJ(VideoPublishEditModel videoPublishEditModel) {
        List<SingleImageData> imageList;
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            return imageList.size();
        }
        return 0;
    }

    public static final String LJIJJLI(VideoPublishEditModel videoPublishEditModel) {
        List<SingleImageData> imageList;
        String strLJJLIIIJ;
        List<SingleImageData> imageList2;
        if (LJJJJLL(videoPublishEditModel)) {
            String selectedFilterId = videoPublishEditModel.getSelectedFilterId();
            if (selectedFilterId == null) {
                return "";
            }
            return selectedFilterId;
        }
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (imageList2 = imageAlbumData.getImageList()) != null) {
            if (!imageList2.isEmpty()) {
                Iterator<SingleImageData> it2 = imageList2.iterator();
                while (it2.hasNext()) {
                    if (it2.next().getFilterInfo().getFilterId().length() == 0) {
                    }
                }
            }
            return "";
        }
        ImageAlbumData imageAlbumData2 = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData2 == null || (imageList = imageAlbumData2.getImageList()) == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(imageList, ",", null, null, 0, null, AFwS261S0000000_22.get$arr$(124), 30)) == null) {
            return "";
        }
        return strLJJLIIIJ;
    }

    public static final String LJIL(VideoPublishEditModel videoPublishEditModel) {
        List<SingleImageData> imageList;
        String strLJJLIIIJ;
        List<SingleImageData> imageList2;
        if (LJJJJLL(videoPublishEditModel)) {
            String selectedFilterLabel = videoPublishEditModel.getSelectedFilterLabel();
            if (selectedFilterLabel == null) {
                return "";
            }
            return selectedFilterLabel;
        }
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (imageList2 = imageAlbumData.getImageList()) != null) {
            if (!imageList2.isEmpty()) {
                Iterator<SingleImageData> it2 = imageList2.iterator();
                while (it2.hasNext()) {
                    if (it2.next().getFilterInfo().getFilterId().length() == 0) {
                    }
                }
            }
            return "";
        }
        ImageAlbumData imageAlbumData2 = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData2 == null || (imageList = imageAlbumData2.getImageList()) == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(imageList, ",", null, null, 0, null, AFwS261S0000000_22.get$arr$(125), 30)) == null) {
            return "";
        }
        return strLJJLIIIJ;
    }

    public static String LJJI(VideoPublishEditModel videoPublishEditModel) {
        return LJJ(videoPublishEditModel, C1443560nfW.LIZIZ);
    }

    public static final String LJJIFFI(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        ImportVideoInfo importVideoInfo;
        NowsExtra nowsExtra;
        if (C1444940nhk.LJII(videoPublishEditModel.getCanvasVideoData())) {
            NowsShootModel nowsShootModel = videoPublishEditModel.creativeModel.nowsShootModel;
            if (nowsShootModel != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (nowsShootModel != null && (nowsExtra = nowsShootModel.nowsExtra) != null && nowsExtra.is9To16Ratio) {
                    return "9:16";
                }
                return "3:4";
            }
            ArrayList<ImportVideoInfo> importInfoList = videoPublishEditModel.getImportInfoList();
            if (importInfoList != null && (importVideoInfo = (ImportVideoInfo) C13LP.LJJJLL(importInfoList)) != null) {
                double videoWidth = ((double) importVideoInfo.getVideoWidth()) / ((double) importVideoInfo.getVideoHeight());
                if (1.56d <= videoWidth && videoWidth <= 100.0d) {
                    return "16:9";
                }
                if (1.165d <= videoWidth && videoWidth <= 1.56d) {
                    return "4:3";
                }
                if (0.875d <= videoWidth && videoWidth <= 1.165d) {
                    return "1:1";
                }
                if (0.65625d > videoWidth || videoWidth > 0.875d) {
                    return "9:16";
                }
                return "3:4";
            }
            return "unknown";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJJII(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3) {
        /*
            boolean r0 = r3.isStitchMode()
            java.lang.String r2 = "-1"
            if (r0 != 0) goto L22
            boolean r0 = r3.isDuet()
            if (r0 != 0) goto L22
            java.lang.String r1 = "single_song"
            java.lang.String r0 = "prop_page"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.util.List r1 = X.C1697810uHb.LJIIJJI(r0)
            java.lang.String r0 = r3.mShootWay
            boolean r0 = X.C13LP.LJJJJ(r0, r1)
            if (r0 == 0) goto L35
        L22:
            java.lang.String r0 = r3.getFromItemId()
            if (r0 == 0) goto L35
            int r0 = r0.length()
            if (r0 == 0) goto L35
            java.lang.String r0 = r3.getFromItemId()
            if (r0 == 0) goto L35
            return r0
        L35:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1428470nHB.LJJII(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):java.lang.String");
    }

    public static final int LJJIII(VideoPublishEditModel videoPublishEditModel) {
        int origin;
        int iLIZ;
        Integer realOrigin = videoPublishEditModel.getEditorProModel().getRealOrigin();
        if (realOrigin != null) {
            origin = realOrigin.intValue();
        } else {
            origin = videoPublishEditModel.getOrigin();
        }
        if (C1416310mxZ.LJJJJJ(videoPublishEditModel)) {
            CameraLayoutModel cameraLayoutModel = videoPublishEditModel.creativeModel.cameraLayoutModel;
            if (cameraLayoutModel != null) {
                iLIZ = C0L5H.LIZ(cameraLayoutModel);
            } else {
                iLIZ = 0;
            }
            CameraLayoutModel cameraLayoutModel2 = videoPublishEditModel.creativeModel.cameraLayoutModel;
            if (cameraLayoutModel2 != null && C0L5H.LJ(cameraLayoutModel2) > 0 && iLIZ > 0) {
                return 2;
            }
            return origin;
        }
        return origin;
    }

    public static final String LJJIIJZLJL(VideoPublishEditModel videoPublishEditModel) {
        PhotoEditData photoEditData;
        NowsExtra nowsExtra;
        if (LLIIIJ(videoPublishEditModel)) {
            return "2";
        }
        NowsShootModel nowsShootModel = videoPublishEditModel.creativeModel.nowsShootModel;
        if (nowsShootModel != null && (photoEditData = nowsShootModel.editData) != null && photoEditData.getEnableRound()) {
            NowsShootModel nowsShootModel2 = videoPublishEditModel.creativeModel.nowsShootModel;
            if (nowsShootModel2 != null && (nowsExtra = nowsShootModel2.nowsExtra) != null && nowsExtra.is9To16Ratio) {
                return "1";
            }
            return "3";
        }
        return "1";
    }

    public static final boolean LJJIIZ(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        MultiEditVideoStatusRecordData multiEditVideoRecordData;
        MultiEditVideoStatusRecordData multiEditVideoRecordData2;
        if (!videoPublishEditModel.isMvThemeVideoType() && !videoPublishEditModel.isStitchMode()) {
            z = true;
        } else {
            z = false;
        }
        if (videoPublishEditModel.getMultiEditVideoRecordData() != null && (multiEditVideoRecordData2 = videoPublishEditModel.getMultiEditVideoRecordData()) != null) {
            multiEditVideoRecordData2.isSupportMultiEdit = z;
        }
        if (z && videoPublishEditModel.getMultiEditVideoRecordData() != null && (multiEditVideoRecordData = videoPublishEditModel.getMultiEditVideoRecordData()) != null && multiEditVideoRecordData.curMultiEditVideoRecordData != null) {
            return true;
        }
        return false;
    }

    public static final String LJJIIZI(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.isTemplateMv()) {
            return "mv";
        }
        if (!C1416310mxZ.LJJJJJL(videoPublishEditModel) && !videoPublishEditModel.isCutSameVideoType() && !LLIIIZ(videoPublishEditModel)) {
            if (!LLIIIL(videoPublishEditModel) && !LLIIIILZ(videoPublishEditModel)) {
                int shootMode = videoPublishEditModel.getShootMode();
                if (shootMode == 2) {
                    return "fast_shoot";
                }
                if (shootMode == 8) {
                    return "video";
                }
                if (shootMode != 20 && shootMode != 23) {
                    if (shootMode != 27) {
                        if (shootMode != 10) {
                            if (shootMode != 11) {
                                if (shootMode != 29) {
                                    if (shootMode != 30) {
                                        switch (shootMode) {
                                            case 14:
                                                return "video_180";
                                            case 15:
                                                return "fast_shoot";
                                            case 16:
                                                return "photo";
                                            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                                return "video";
                                            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                                return "video_600";
                                            default:
                                                return "";
                                        }
                                    }
                                    return "story_reveal";
                                }
                                return "quick_video";
                            }
                            return "video_60";
                        }
                        return "video_15";
                    }
                    return "group_shot";
                }
                return "quick_video";
            }
            return "text";
        }
        return "templates";
    }

    public static final int LJJIJ(VideoPublishEditModel videoPublishEditModel) {
        List<SingleImageData> imageList;
        ImageAlbumData imageAlbumData = videoPublishEditModel.creativeModel.imageAlbumModel;
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            Iterator<SingleImageData> it2 = imageList.iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (it2.next().isText2Image()) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public static final String LJJIJIIJI(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        if (videoPublishEditModel.creativeModel.nowsShootModel != null) {
            z = true;
        } else {
            z = false;
        }
        return C1442260ndQ.LIZ(z);
    }

    public static final boolean LJJIJIL(VideoPublishEditModel videoPublishEditModel) {
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        if (!C0BMN.LIZ() || !LJJZZI(videoPublishEditModel) || (imageAlbumData = videoPublishEditModel.getImageAlbumData()) == null || (imageList = imageAlbumData.getImageList()) == null || imageList.isEmpty()) {
            return false;
        }
        Iterator<SingleImageData> it2 = imageList.iterator();
        while (it2.hasNext()) {
            if (it2.next().isCameraPhoto()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJJIJL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1428470nHB.LJJIJL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):boolean");
    }

    public static final boolean LJJIJLIJ(VideoPublishEditModel videoPublishEditModel) {
        return !videoPublishEditModel.creativeModel.mobileEffectsModel2.exportedEffects.isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int LJJIL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r6) {
        /*
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r0 = r6.getPreviewInfo()
            r3 = -1
            if (r0 == 0) goto L7c
            java.util.List r0 = r0.getVideoList()
            if (r0 == 0) goto L7c
            java.util.Iterator r6 = r0.iterator()
            r2 = -1
        L12:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L7b
            java.lang.Object r5 = r6.next()
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r5 = (com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment) r5
            boolean r0 = X.C297650Blb.LIZ()
            if (r0 == 0) goto L5c
            boolean r0 = X.C298100BmK.LIZ()
            if (r0 == 0) goto L43
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            com.ss.android.ugc.aweme.port.internal.IMediaCacheService r1 = r0.LJIILL()
            java.lang.String r0 = r5.getVideoPath()
            java.lang.Boolean r0 = r1.getMediaTypeCache(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 == 0) goto L43
            goto L12
        L43:
            boolean r1 = r5.isImage()
            r0 = 1
            if (r1 == r0) goto L12
            X.09La r1 = X.C2356009La.LIZ
            java.lang.String r0 = r5.getVideoPath()
            r1.getClass()
            com.ss.android.vesdk.VEUtils$VEVideoFileInfo r0 = X.C2356009La.LIZ(r0)
            if (r0 == 0) goto L12
            int r0 = r0.HDRType
            goto L72
        L5c:
            java.lang.String r0 = r5.getVideoPath()
            com.ss.android.vesdk.VEUtils$VEVideoFileInfo r0 = com.ss.android.vesdk.VEUtils.getVideoFileInfo(r0)
            if (r0 == 0) goto L12
            int r0 = r0.HDRType
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L12
            int r0 = r0.intValue()
        L72:
            if (r0 == 0) goto L77
            if (r0 == r3) goto L12
            return r0
        L77:
            if (r2 != r3) goto L12
            r2 = 0
            goto L12
        L7b:
            return r2
        L7c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1428470nHB.LJJIL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):int");
    }

    public static final boolean LJJIZ(VideoPublishEditModel videoPublishEditModel) {
        String nleData;
        if (videoPublishEditModel == null) {
            return false;
        }
        if (videoPublishEditModel.getNleModel() == null && (nleData = videoPublishEditModel.getNleData()) != null && C123100dR.LIZ(nleData)) {
            C0FGC.LIZ(2);
            NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
            nLEEditorLIZ.restore(videoPublishEditModel.getNleData());
            videoPublishEditModel.setNleModel(nLEEditorLIZ.getModel());
        }
        return LLIIJLIL(videoPublishEditModel.getNleModel());
    }

    public static final boolean LJJJ(VideoPublishEditModel videoPublishEditModel) {
        ArrayList<TimeSpeedModelExtension> arrayList;
        MultiEditVideoStatusRecordData multiEditVideoRecordData = videoPublishEditModel.getMultiEditVideoRecordData();
        if (multiEditVideoRecordData == null || (arrayList = multiEditVideoRecordData.originalSegments) == null || arrayList.isEmpty()) {
            return false;
        }
        Iterator<TimeSpeedModelExtension> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            StickerInfo stickerInfo = it2.next().getStickerInfo();
            if (stickerInfo != null && stickerInfo.isMobileEffect()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJJJI(VideoPublishEditModel videoPublishEditModel) {
        ArrayList<TimeSpeedModelExtension> arrayList;
        MultiEditVideoStatusRecordData multiEditVideoRecordData = videoPublishEditModel.getMultiEditVideoRecordData();
        if (multiEditVideoRecordData == null || (arrayList = multiEditVideoRecordData.originalSegments) == null || arrayList.isEmpty()) {
            return false;
        }
        Iterator<TimeSpeedModelExtension> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            StickerInfo stickerInfo = it2.next().getStickerInfo();
            if (stickerInfo != null && stickerInfo.isStackableEffect()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJJJIL(VideoPublishEditModel videoPublishEditModel) {
        List<SingleImageData> imageList;
        ImageAlbumData imageAlbumData = videoPublishEditModel.creativeModel.imageAlbumModel;
        if (imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null) {
            return false;
        }
        Iterator<SingleImageData> it2 = imageList.iterator();
        while (it2.hasNext()) {
            if (it2.next().isText2Image()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJJJJ(VideoPublishEditModel videoPublishEditModel) {
        NLEModel nLEModelLJJLIIIJILLIZJL;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots;
        if (videoPublishEditModel != null && (nLEModelLJJLIIIJILLIZJL = C1416310mxZ.LJJLIIIJILLIZJL(videoPublishEditModel)) != null && (mainTrack = nLEModelLJJLIIIJILLIZJL.getMainTrack()) != null && (slots = mainTrack.getSlots()) != null && !slots.isEmpty()) {
            Iterator<NLETrackSlot> it2 = slots.iterator();
            while (it2.hasNext()) {
                if (it2.next().hasExtra("ep_transition_cache_duration")) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static final boolean LJJJJI(VideoPublishEditModel videoPublishEditModel) {
        MvCreateVideoData mvCreateVideoData;
        ArrayList<String> arrayList;
        if (!C0CHQ.LIZ().getAccountService().isLogin() || C0CHQ.LIZ().getAccountService().LIZ() || !C295910Bin.LIZ()) {
            return false;
        }
        if (C295910Bin.LIZJ() == 1 && Intrinsics.LJFF(LJIILIIL(videoPublishEditModel), "upload")) {
            return false;
        }
        if ((!LJZL(videoPublishEditModel) && !videoPublishEditModel.isLivePhotoEdit() && (!videoPublishEditModel.isPhotoMvMode() || (mvCreateVideoData = videoPublishEditModel.getMvCreateVideoData()) == null || (arrayList = mvCreateVideoData.selectMediaList) == null || arrayList.size() != 1)) || LLIIIJ(videoPublishEditModel) || LJJZZI(videoPublishEditModel) || videoPublishEditModel.creativeModel.changeAvatarModel.isFromChangeAvatar || videoPublishEditModel.isEnterFromBulletin() || C1444940nhk.LJIIJ(videoPublishEditModel.getCanvasVideoData()) || C1444940nhk.LJIIIIZZ(videoPublishEditModel.getCanvasVideoData()) || C0CHQ.LIZ().LJII().LJ(videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJIZL(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return false;
        }
        TaskInfoInCreativeModel taskInfoInCreativeModel = videoPublishEditModel.creativeModel.editorProAIGCInfoModel.taskInfoInCreativeModel;
        if (!taskInfoInCreativeModel.needBlockLeaveEditorPro || !taskInfoInCreativeModel.isBlockByLoading) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJJ(VideoPublishEditModel videoPublishEditModel) {
        AutoCutThemeData next;
        if (!videoPublishEditModel.isCurrentAutoCutMode()) {
            return false;
        }
        Iterator<AutoCutThemeData> it2 = videoPublishEditModel.creativeModel.autoCutModel.templateList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                AutoCutThemeData autoCutThemeData = next;
                if (autoCutThemeData.LIZIZ() == C1416110mxF.LJIIJJI(videoPublishEditModel.creativeModel.autoCutModel.curSource) && autoCutThemeData.indexFromSource == videoPublishEditModel.creativeModel.autoCutModel.curIndexFromSource) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AutoCutThemeData autoCutThemeData2 = next;
        if (autoCutThemeData2 == null || autoCutThemeData2.templateType != EnumC1412640mre.AIGT.getValue()) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJJL(CreativeModel creativeModel) {
        if (!C123100dR.LIZ(creativeModel.aiSelfModel.styleName)) {
            AISelfModel aISelfModel = creativeModel.aiSelfModel;
            if (!aISelfModel.isUltraFastModelCreation && !aISelfModel.isUltraFastStyleGeneration) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final boolean LJJJJLI(VideoPublishEditModel videoPublishEditModel) {
        AutoCutThemeData next;
        if (!videoPublishEditModel.isCurrentAutoCutMode()) {
            return false;
        }
        Iterator<AutoCutThemeData> it2 = videoPublishEditModel.creativeModel.autoCutModel.templateList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                AutoCutThemeData autoCutThemeData = next;
                if (autoCutThemeData.LIZIZ() == C1416110mxF.LJIIJJI(videoPublishEditModel.creativeModel.autoCutModel.curSource) && autoCutThemeData.indexFromSource == videoPublishEditModel.creativeModel.autoCutModel.curIndexFromSource) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AutoCutThemeData autoCutThemeData2 = next;
        if (autoCutThemeData2 == null || autoCutThemeData2.templateType != EnumC1412640mre.CUT_SAME.getValue()) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJLL(VideoPublishEditModel videoPublishEditModel) {
        if (LJZ(videoPublishEditModel)) {
            if (C1444940nhk.LJII(videoPublishEditModel.getCanvasVideoData()) || videoPublishEditModel.isLivePhotoStaticEdit()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJJJJZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.getCanvasVideoData() != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJJZI(VideoPublishEditModel videoPublishEditModel) {
        return videoPublishEditModel.creativeModel.changeAvatarModel.isFromChangeAvatar;
    }

    public static final boolean LJJJLIIL(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.creativeModel.draftInfoModel.isDraft && !videoPublishEditModel.isFromRestoreRecover()) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJLL(VideoPublishEditModel videoPublishEditModel) {
        return C1444940nhk.LIZLLL(videoPublishEditModel.getCanvasVideoData());
    }

    public static final boolean LJJJLZIJ(VideoPublishEditModel videoPublishEditModel) {
        if (!LJJIIZ(videoPublishEditModel) || videoPublishEditModel.getSharedARModel() != null || videoPublishEditModel.isDuet()) {
            return false;
        }
        if (videoPublishEditModel.getContainBackgroundVideo()) {
            if (!C0CHQ.LIZ().LJII().LJII(videoPublishEditModel)) {
                return false;
            }
            boolean z = false;
            for (TimeSpeedModelExtension timeSpeedModelExtension : videoPublishEditModel.getFinalVideoList()) {
                if (timeSpeedModelExtension.getBackgroundVideo() != null && timeSpeedModelExtension.getmBackgroundVideoTimeInfo() != null) {
                    z = true;
                }
            }
            if (!z || !C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_pro_enable_gsv", true, false)) {
                return false;
            }
        }
        if (!videoPublishEditModel.getSupportRetake() || videoPublishEditModel.isCutSameVideoType() || videoPublishEditModel.isPhotoMvMode()) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJZ(VideoPublishEditModel videoPublishEditModel) {
        return videoPublishEditModel.creativeModel.draftInfoModel.isDraft;
    }

    public static final boolean LJJL(VideoPublishEditModel videoPublishEditModel) {
        if ((Intrinsics.LJFF("editing_effect_page", videoPublishEditModel.mShootWay) || Intrinsics.LJFF("editing_effect_template", videoPublishEditModel.mShootWay)) && videoPublishEditModel.getPhotoCount() > 1 && videoPublishEditModel.getVideoCount() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean LJJLI(VideoPublishEditModel videoPublishEditModel) {
        MixEditingMaterialType mixEditingMaterialType;
        SelectedMaterialItem selectedMaterialItem = videoPublishEditModel.creativeModel.mixEditingModel.selectedMaterialItem;
        if (selectedMaterialItem != null) {
            mixEditingMaterialType = selectedMaterialItem.materialType;
        } else {
            mixEditingMaterialType = null;
        }
        if (mixEditingMaterialType != MixEditingMaterialType.EFFECT_TYPE || selectedMaterialItem == null || selectedMaterialItem.fromMixEditingRecommend) {
            return false;
        }
        return true;
    }

    public static final boolean LJJLIIIIJ(VideoPublishEditModel videoPublishEditModel) {
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        LivePhotoPreviewMode livePhotoPreviewMode;
        if (videoPublishEditModel == null || !LJJZZI(videoPublishEditModel)) {
            return false;
        }
        if (C295670BiP.LIZ() && (imageAlbumData = videoPublishEditModel.getImageAlbumData()) != null && (imageList = imageAlbumData.getImageList()) != null && !imageList.isEmpty()) {
            Iterator<SingleImageData> it2 = imageList.iterator();
            while (it2.hasNext()) {
                SrcLiveVideoInfo srcLiveInfo = it2.next().getSrcLiveInfo();
                if (srcLiveInfo != null) {
                    livePhotoPreviewMode = srcLiveInfo.getLivePhotoPreviewMode();
                } else {
                    livePhotoPreviewMode = null;
                }
                if (livePhotoPreviewMode == LivePhotoPreviewMode.LIVE_PHOTO || livePhotoPreviewMode == LivePhotoPreviewMode.LOOP) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean LJJLIIIJ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.getCut2EditTransferModel() != null) {
            return !r0.isVideoCompressed();
        }
        return videoPublishEditModel.isFastImport();
    }

    public static final boolean LJJLIIIJILLIZJL(VideoPublishEditModel videoPublishEditModel) {
        List<SingleImageData> imageList;
        SingleImageData singleImageData;
        ImageAlbumData imageAlbumData = videoPublishEditModel.creativeModel.imageAlbumModel;
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null && (singleImageData = (SingleImageData) C13LP.LJJJLL(imageList)) != null) {
            return singleImageData.isText2Image();
        }
        return false;
    }

    public static final boolean LJJLIIIJJI(VideoPublishEditModel videoPublishEditModel) {
        IAiChatFeatureService iAiChatFeatureService;
        InterfaceC1429470nIn interfaceC1429470nInLJFF;
        if (videoPublishEditModel == null || (iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null)) == null || (interfaceC1429470nInLJFF = iAiChatFeatureService.LJFF()) == null || !interfaceC1429470nInLJFF.LJIIIIZZ(videoPublishEditModel.creativeModel)) {
            return false;
        }
        return true;
    }

    public static final boolean LJJLIIIJJIZ(VideoPublishEditModel videoPublishEditModel) {
        ImageAlbumData imageAlbumData;
        if (!LJJZZI(videoPublishEditModel) || (imageAlbumData = videoPublishEditModel.getImageAlbumData()) == null || !imageAlbumData.isFromCameraPhoto()) {
            return false;
        }
        return true;
    }

    public static final boolean LJJLIIIJL(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.creativeModel.mvModel.templateTabSearchModel != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJJLIIIJLJLI(VideoPublishEditModel videoPublishEditModel) {
        return videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate;
    }

    public static final boolean LJJLIIIJLLLLLLLZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.creativeModel.nowsShootModel != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJJLIIJ(VideoPublishEditModel videoPublishEditModel) {
        NowsShootModel nowsShootModel = videoPublishEditModel.creativeModel.nowsShootModel;
        if (nowsShootModel != null && nowsShootModel.type == 0) {
            return true;
        }
        return false;
    }

    public static final boolean LJJLIL(VideoPublishEditModel videoPublishEditModel) {
        String openEditToolType;
        EditorProModel editorProModel = videoPublishEditModel.creativeModel.creativeFlowData.getEditorProModel();
        if (editorProModel != null) {
            openEditToolType = editorProModel.getOpenEditToolType();
        } else {
            openEditToolType = null;
        }
        return Intrinsics.LJFF(openEditToolType, "photo_editor");
    }

    public static final boolean LJJLJ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.isTemplateMv()) {
            return false;
        }
        return true;
    }

    public static final boolean LJJLJLI(VideoPublishEditModel videoPublishEditModel) {
        if (Intrinsics.LJFF(videoPublishEditModel.mShootWay, "story") && !LJLJJI(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    public static final boolean LJJLL(VideoPublishEditModel videoPublishEditModel) {
        if (!videoPublishEditModel.hasStickers() && videoPublishEditModel.getTimeEffect() == null && !C0IKQ.LIZIZ(videoPublishEditModel.getEffectList()) && videoPublishEditModel.getSelectedId() == 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJJZ(VideoPublishEditModel videoPublishEditModel) {
        return Intrinsics.LJFF(videoPublishEditModel.creativeModel.initialModel.highLightVideoParametersModel.scene, "send_to_dm");
    }

    public static final boolean LJJZZI(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.getCreationMode() == 2) {
            return true;
        }
        return false;
    }

    public static final boolean LJJZZIII(VideoPublishEditModel videoPublishEditModel) {
        if (LJJZZI(videoPublishEditModel)) {
            if ((!LJJJJLL(videoPublishEditModel) || C0MUK.LJFF(videoPublishEditModel.creativeModel)) && !videoPublishEditModel.isLivePhotoEdit()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJL(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        ArrayList<TimeSpeedModelExtension> arrayList;
        MultiEditVideoStatusRecordData multiEditVideoRecordData = videoPublishEditModel.getMultiEditVideoRecordData();
        if (multiEditVideoRecordData != null && (arrayList = multiEditVideoRecordData.originalSegments) != null) {
            z = false;
            for (TimeSpeedModelExtension timeSpeedModelExtension : arrayList) {
                String stickerId = timeSpeedModelExtension.getStickerId();
                if (stickerId != null && stickerId.length() != 0 && timeSpeedModelExtension.getStickerInfo() != null && timeSpeedModelExtension.getStickerInfo().isMobileEffect()) {
                    z = true;
                }
            }
        } else {
            z = false;
        }
        List<Boolean> list = videoPublishEditModel.creativeModel.effectData.isChildEffect;
        if (list != null && !list.isEmpty()) {
            Iterator<Boolean> it2 = list.iterator();
            while (it2.hasNext()) {
                if (!it2.next().booleanValue()) {
                    if (z) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public static final boolean LJLI(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.creativeModel.mixEditingModel.templateMobParams != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJLIIIL(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.getPhotoCount() > 0 && videoPublishEditModel.getVideoCount() > 0 && videoPublishEditModel.isFastImport()) {
            return true;
        }
        return false;
    }

    public static final boolean LJLIIL(VideoPublishEditModel videoPublishEditModel) {
        if (LJJZZI(videoPublishEditModel) && !LJZ(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    public static final int LJLIL(VideoPublishEditModel videoPublishEditModel) {
        return videoPublishEditModel.creativeModel.musicBuzModel.isMusicFromAutoEdit ? 1 : 0;
    }

    public static final boolean LJLILLLLZI(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.creativeModel.draftInfoModel.isDraft && !videoPublishEditModel.isFromRestoreRecover()) {
            return true;
        }
        return false;
    }

    public static final boolean LJLJI(VideoPublishEditModel videoPublishEditModel) {
        return !LLIIIJ(videoPublishEditModel);
    }

    public static final boolean LJLJJI(VideoPublishEditModel videoPublishEditModel) {
        NowsShootModel nowsShootModel = videoPublishEditModel.creativeModel.nowsShootModel;
        if (nowsShootModel == null || !nowsShootModel.isNormalPublish) {
            return false;
        }
        return true;
    }

    public static final boolean LJLJJL(VideoPublishEditModel videoPublishEditModel) {
        AutoCutThemeData next;
        if (!videoPublishEditModel.isCurrentAutoCutMode()) {
            return false;
        }
        Iterator<AutoCutThemeData> it2 = videoPublishEditModel.creativeModel.autoCutModel.templateList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                AutoCutThemeData autoCutThemeData = next;
                if (autoCutThemeData.LIZIZ() == C1416110mxF.LJIIJJI(videoPublishEditModel.creativeModel.autoCutModel.curSource) && autoCutThemeData.indexFromSource == videoPublishEditModel.creativeModel.autoCutModel.curIndexFromSource) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AutoCutThemeData autoCutThemeData2 = next;
        if (autoCutThemeData2 == null || autoCutThemeData2.templateType != EnumC1412640mre.PUGC_TEMPLATE.getValue()) {
            return false;
        }
        return true;
    }

    public static final boolean LJLJJLL(VideoPublishEditModel videoPublishEditModel) {
        TemplateConsumeData templateConsumeDataLLILLJJLI = LLILLJJLI(videoPublishEditModel.creativeModel);
        if (templateConsumeDataLLILLJJLI != null) {
            C1412390mrF c1412390mrFLLILLL = LLILLL(templateConsumeDataLLILLJJLI);
            if (c1412390mrFLLILLL.LIZ() && c1412390mrFLLILLL.LIZIZ() && LLIIII(templateConsumeDataLLILLJJLI, EnumC1412640mre.PUGC_TEMPLATE)) {
                return true;
            }
            return false;
        }
        return videoPublishEditModel.creativeModel.ugcTemplateData.isPUGCTemplateFromAutoCutAnchor;
    }

    public static final boolean LJLJL(VideoPublishEditModel videoPublishEditModel) {
        TemplateConsumeData templateConsumeDataLLILLJJLI = LLILLJJLI(videoPublishEditModel.creativeModel);
        if (templateConsumeDataLLILLJJLI != null) {
            if (LLILLL(templateConsumeDataLLILLJJLI).LIZIZ() && LLIIII(templateConsumeDataLLILLJJLI, EnumC1412640mre.PUGC_TEMPLATE)) {
                return true;
            }
            return false;
        }
        return videoPublishEditModel.creativeModel.ugcTemplateData.isPUgcTemplateFromAnchor;
    }

    public static final boolean LJLJLJ(VideoPublishEditModel videoPublishEditModel) {
        return C1444940nhk.LJII(videoPublishEditModel.getCanvasVideoData());
    }

    public static final boolean LJLJLLL(VideoPublishEditModel videoPublishEditModel) {
        if (!Intrinsics.LJFF(videoPublishEditModel.mShootWay, "photo_2023_eoy") && !Intrinsics.LJFF(videoPublishEditModel.mShootWay, "evergreen")) {
            return false;
        }
        return true;
    }

    public static final boolean LJLL(VideoPublishEditModel videoPublishEditModel) {
        if (!Intrinsics.LJFF(videoPublishEditModel.mShootWay, "educate_phase_iii") && !Intrinsics.LJFF(videoPublishEditModel.mShootWay, "educate_phase_iii_feedback")) {
            return false;
        }
        return true;
    }

    public static final boolean LJLLI(VideoPublishEditModel videoPublishEditModel) {
        if (!videoPublishEditModel.isPhotoMvMode() && !C1444940nhk.LJII(videoPublishEditModel.getCanvasVideoData())) {
            return false;
        }
        return true;
    }

    public static final boolean LJLLILLLL(VideoPublishEditModel videoPublishEditModel) {
        TemplateConsumeData templateConsumeDataLLILLJJLI = LLILLJJLI(videoPublishEditModel.creativeModel);
        if (templateConsumeDataLLILLJJLI != null) {
            C1412390mrF c1412390mrFLLILLL = LLILLL(templateConsumeDataLLILLJJLI);
            if ((c1412390mrFLLILLL.LIZJ() || Intrinsics.LJFF(c1412390mrFLLILLL, C1412390mrF.LJIILLIIL)) && LLIIII(templateConsumeDataLLILLJJLI, EnumC1412640mre.PUGC_TEMPLATE)) {
                return true;
            }
            return false;
        }
        if (C1412660mrg.LIZJ(videoPublishEditModel.creativeModel.mvModel.templateType) == EnumC1412640mre.PUGC_TEMPLATE) {
            return true;
        }
        return false;
    }

    public static final boolean LJLLJ(VideoPublishEditModel videoPublishEditModel) {
        MultiEditVideoStatusRecordData multiEditVideoRecordData;
        MultiEditVideoRecordData multiEditVideoRecordData2;
        List<MultiEditVideoSegmentRecordData> list;
        MultiEditVideoRecordData multiEditVideoRecordData3;
        List<MultiEditVideoSegmentRecordData> list2;
        if (videoPublishEditModel.getOrigin() != 1) {
            return false;
        }
        MultiEditVideoStatusRecordData multiEditVideoRecordData4 = videoPublishEditModel.getMultiEditVideoRecordData();
        if ((multiEditVideoRecordData4 != null && (multiEditVideoRecordData3 = multiEditVideoRecordData4.curMultiEditVideoRecordData) != null && (list2 = multiEditVideoRecordData3.segmentDataList) != null && list2.isEmpty()) || (multiEditVideoRecordData = videoPublishEditModel.getMultiEditVideoRecordData()) == null || (multiEditVideoRecordData2 = multiEditVideoRecordData.curMultiEditVideoRecordData) == null || (list = multiEditVideoRecordData2.segmentDataList) == null) {
            return false;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
            if (hashSet.add(Integer.valueOf(multiEditVideoSegmentRecordData.rotate))) {
                arrayList.add(multiEditVideoSegmentRecordData);
            }
        }
        if (arrayList.size() <= 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJLLL(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.mDraftToEditFrom != 3) {
            if (videoPublishEditModel.isFromCrash() && videoPublishEditModel.creativeModel.draftInfoModel.isPublishedDraft) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean LJLLLL(VideoPublishEditModel videoPublishEditModel) {
        AutoCutThemeData next;
        if (!videoPublishEditModel.isCurrentAutoCutMode()) {
            return false;
        }
        Iterator<AutoCutThemeData> it2 = videoPublishEditModel.creativeModel.autoCutModel.templateList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                AutoCutThemeData autoCutThemeData = next;
                if (autoCutThemeData.LIZIZ() == C1416110mxF.LJIIJJI(videoPublishEditModel.creativeModel.autoCutModel.curSource) && autoCutThemeData.indexFromSource == videoPublishEditModel.creativeModel.autoCutModel.curIndexFromSource) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AutoCutThemeData autoCutThemeData2 = next;
        if (autoCutThemeData2 == null || autoCutThemeData2.templateType != EnumC1412640mre.SGT.getValue()) {
            return false;
        }
        return true;
    }

    public static final boolean LJLLLLLL(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.creativeModel.videoImageSeparateSwitchModel != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJLZ(VideoPublishEditModel videoPublishEditModel) {
        return videoPublishEditModel.creativeModel.streaksData.isStreaksPost();
    }

    public static final boolean LJZ(VideoPublishEditModel videoPublishEditModel) {
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if ((imageAlbumData != null && imageAlbumData.isSingleWhenInit()) || C0MUK.LJFF(videoPublishEditModel.creativeModel) || videoPublishEditModel.getCreationMode() != 2 || !LIZIZ(videoPublishEditModel)) {
            return false;
        }
        if (C1444940nhk.LJII(videoPublishEditModel.getCanvasVideoData())) {
            return true;
        }
        if (videoPublishEditModel.isLivePhotoEdit() && videoPublishEditModel.getLivePhotoPreviewMode() == LivePhotoPreviewMode.STATIC) {
            return true;
        }
        return false;
    }

    public static final boolean LJZI(VideoPublishEditModel videoPublishEditModel) {
        CanvasVideoData canvasVideoData;
        List<String> list;
        if (!C1444940nhk.LJII(videoPublishEditModel.creativeModel.canvasVideoData) || (canvasVideoData = videoPublishEditModel.creativeModel.canvasVideoData) == null || (list = canvasVideoData.sourceInfo) == null || list.size() != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJZL(VideoPublishEditModel videoPublishEditModel) {
        CanvasVideoData canvasVideoData = videoPublishEditModel.getCanvasVideoData();
        if (canvasVideoData == null || !C1444940nhk.LJII(canvasVideoData) || C1444940nhk.LIZJ(canvasVideoData) != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LL(VideoPublishEditModel videoPublishEditModel) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isSingleSegmentVideo: ");
        sbLIZ.append(videoPublishEditModel.isMultiVideo());
        sbLIZ.append(' ');
        sbLIZ.append(videoPublishEditModel.getFromCut());
        sbLIZ.append(' ');
        sbLIZ.append(videoPublishEditModel.getVideoSegmentsDesc());
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (videoPublishEditModel.isMultiVideo()) {
            return false;
        }
        if (videoPublishEditModel.getFromCut()) {
            return true;
        }
        String videoSegmentsDesc = videoPublishEditModel.getVideoSegmentsDesc();
        if (videoSegmentsDesc == null || videoSegmentsDesc.length() == 0 || CameraComponentModel.LJIIIIZZ(videoPublishEditModel.getVideoSegmentsDesc()).size() != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LLD(CreativeModel creativeModel) {
        return creativeModel.storyEventStickerData.isStoryEventStickerPost();
    }

    public static final boolean LLF(VideoPublishEditModel videoPublishEditModel) {
        Object c098200Yq;
        boolean z;
        try {
            if (videoPublishEditModel.creativeModel.celebrationData != null) {
                z = true;
            } else {
                z = false;
            }
            c098200Yq = Boolean.valueOf(z);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LLFF(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3) {
        /*
            r2 = 0
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r3.creativeModel     // Catch: java.lang.Throwable -> L18
            com.ss.android.ugc.aweme.creative.model.CelebrationData r0 = r0.celebrationData     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L16
            int r1 = r0.getPreviewType()     // Catch: java.lang.Throwable -> L18
            r0 = 1
            if (r1 != r0) goto L16
        Le:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L18
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L18
            goto L24
        L16:
            r0 = 0
            goto Le
        L18:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L24:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 == 0) goto L2b
            r1 = 0
        L2b:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L33
            boolean r2 = r1.booleanValue()
        L33:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1428470nHB.LLFF(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):boolean");
    }

    public static final boolean LLFFF(VideoPublishEditModel videoPublishEditModel) {
        return LLD(videoPublishEditModel.creativeModel);
    }

    public static final boolean LLFII(VideoPublishEditModel videoPublishEditModel) {
        String shootEnterMethod = videoPublishEditModel.getShootEnterMethod();
        if (!Intrinsics.LJFF(shootEnterMethod, "click_publish_card_plus") && !Intrinsics.LJFF(shootEnterMethod, "click_publish_card_create_new_story") && !Intrinsics.LJFF(shootEnterMethod, "click_view_lists_panel_camera_icon") && !Intrinsics.LJFF(shootEnterMethod, "click_view_lists_panel_profile_plus") && !Intrinsics.LJFF(shootEnterMethod, "click_view_lists_panel_camera_button")) {
            return false;
        }
        return true;
    }

    public static final boolean LLFZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.getCreationMode() == 5) {
            return true;
        }
        return false;
    }

    public static final boolean LLI(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.getTtStoryUploadModel() != null) {
            return true;
        }
        return false;
    }

    public static final boolean LLIFFJFJJ(VideoPublishEditModel videoPublishEditModel) {
        if (TextUtils.equals(videoPublishEditModel.mShootWay, "story") && LJZL(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    public static final boolean LLII(VideoPublishEditModel videoPublishEditModel) {
        CanvasVideoData canvasVideoData = videoPublishEditModel.getCanvasVideoData();
        if (canvasVideoData == null || canvasVideoData.canvasType != 1) {
            return false;
        }
        StoryShootModel storyShootModel = videoPublishEditModel.creativeModel.storyModel;
        if (!storyShootModel.isShootFromSocialAlbum() && !storyShootModel.isStoryEntrance()) {
            return false;
        }
        return true;
    }

    public static final boolean LLIIIILZ(VideoPublishEditModel videoPublishEditModel) {
        return C123100dR.LIZ(videoPublishEditModel.creativeModel.text2ImageModel.text);
    }

    public static final boolean LLIIIJ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.getCreationMode() == 3) {
            return true;
        }
        return false;
    }

    public static final boolean LLIIIL(VideoPublishEditModel videoPublishEditModel) {
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if ((imageAlbumData != null && imageAlbumData.isTextModeWhenInit()) || Intrinsics.LJFF(videoPublishEditModel.creativeModel.isTextModeWhenInit, Boolean.TRUE)) {
            return true;
        }
        return false;
    }

    public static final boolean LLIIIZ(VideoPublishEditModel videoPublishEditModel) {
        if (!LJLLILLLL(videoPublishEditModel) && !LLIIL(videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    public static final boolean LLIIJI(VideoPublishEditModel videoPublishEditModel) {
        TemplateConsumeData templateConsumeDataLLILLJJLI = LLILLJJLI(videoPublishEditModel.creativeModel);
        if (templateConsumeDataLLILLJJLI != null) {
            if (LLILLL(templateConsumeDataLLILLJJLI).LIZIZ()) {
                if (LLIIII(templateConsumeDataLLILLJJLI, EnumC1412640mre.PUGC_TEMPLATE) || LLIIII(templateConsumeDataLLILLJJLI, EnumC1412640mre.UGC_TEMPLATE)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return videoPublishEditModel.creativeModel.ugcTemplateData.isUgcTemplateFromAnchor;
    }

    public static final boolean LLIIJLIL(NLEModel nLEModel) {
        VecNLETrackSPtr tracks;
        if (nLEModel == null || (tracks = nLEModel.getTracks()) == null) {
            return false;
        }
        ArrayList<NLETrackSlot> arrayList = new ArrayList();
        Iterator<NLETrack> it2 = tracks.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().getSlots(), arrayList);
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (NLETrackSlot nLETrackSlot : arrayList) {
            if (nLETrackSlot.getKeyframes().size() <= 0) {
                VecNLEKeyframe swingKeyframes = nLETrackSlot.getSwingKeyframes();
                ArrayList arrayList2 = new ArrayList();
                Iterator<NLEKeyframe> it3 = swingKeyframes.iterator();
                while (it3.hasNext()) {
                    C19719612Di.LJJI(it3.next().getSortedCommonKeyframes(), arrayList2);
                }
                if (!arrayList2.isEmpty()) {
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean LLIIL(VideoPublishEditModel videoPublishEditModel) {
        TemplateConsumeData templateConsumeDataLLILLJJLI = LLILLJJLI(videoPublishEditModel.creativeModel);
        if (templateConsumeDataLLILLJJLI != null) {
            if (LLILLL(templateConsumeDataLLILLJJLI).LIZJ() && LLIIII(templateConsumeDataLLILLJJLI, EnumC1412640mre.UGC_TEMPLATE)) {
                return true;
            }
            return false;
        }
        if (C123100dR.LIZ(videoPublishEditModel.creativeModel.mvModel.templateCategoryKey) && videoPublishEditModel.creativeModel.mvModel.templateType == EnumC1412640mre.UGC_TEMPLATE.getValue()) {
            return true;
        }
        return false;
    }

    public static final boolean LLIILII(VideoPublishEditModel videoPublishEditModel) {
        CreativeModel creativeModel;
        EditorProAIGCInfoModel editorProAIGCInfoModel;
        AiPlaygroundCameraModel aiPlaygroundCameraModel;
        if (videoPublishEditModel == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (editorProAIGCInfoModel = creativeModel.editorProAIGCInfoModel) == null || (aiPlaygroundCameraModel = editorProAIGCInfoModel.aiPlaygroundCameraModel) == null || !aiPlaygroundCameraModel.showEditVideoClipGuide) {
            return false;
        }
        return true;
    }

    public static final boolean LLIILZL(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.getVideoCanvasWidth() == videoPublishEditModel.getOutVideoWidth() && videoPublishEditModel.getVideoCanvasHeight() == videoPublishEditModel.getOutVideoHeight()) {
            return false;
        }
        return true;
    }

    public static final String LLILIL(VideoPublishEditModel videoPublishEditModel) {
        List<String> expressions;
        SocialAvatarStickerModel socialAvatarStickerModel = (SocialAvatarStickerModel) C13LP.LJJJLL(videoPublishEditModel.creativeModel.stickerModel.socialAvatarStickerModels);
        if (socialAvatarStickerModel != null && (expressions = socialAvatarStickerModel.getExpressions()) != null) {
            return (String) C13LP.LJJJLL(expressions);
        }
        return null;
    }

    public static final boolean LLILL(VideoPublishEditModel videoPublishEditModel) {
        EditSwitchStyle editSwitchStyle;
        AILivePhotoSwitchFromImageModel aILivePhotoSwitchFromImageModel = videoPublishEditModel.getAILivePhotoModel().switchFromImageModel;
        if (aILivePhotoSwitchFromImageModel != null) {
            editSwitchStyle = aILivePhotoSwitchFromImageModel.switchStyle;
        } else {
            editSwitchStyle = null;
        }
        if (editSwitchStyle == EditSwitchStyle.VIDEO_TO_IMAGE) {
            return true;
        }
        return false;
    }

    public static final boolean LLILLIZIL(VideoPublishEditModel videoPublishEditModel) {
        EditSwitchStyle editSwitchStyle;
        if (videoPublishEditModel.creativeModel.imageEditModel.enterFromImageSwitch) {
            AILivePhotoSwitchFromImageModel aILivePhotoSwitchFromImageModel = videoPublishEditModel.getAILivePhotoModel().switchFromImageModel;
            if (aILivePhotoSwitchFromImageModel != null) {
                editSwitchStyle = aILivePhotoSwitchFromImageModel.switchStyle;
            } else {
                editSwitchStyle = null;
            }
            if (editSwitchStyle == EditSwitchStyle.IMAGE_TO_VIDE && !LJJZZI(videoPublishEditModel)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final TemplateConsumeData LLILLJJLI(CreativeModel creativeModel) {
        TemplateConsumeData templateConsumeData = creativeModel.templateConsumeData;
        if (!templateConsumeData.LIZ()) {
            return null;
        }
        return templateConsumeData;
    }

    public static final C1412390mrF LLILLL(TemplateConsumeData templateConsumeData) {
        String str = templateConsumeData.dispatchType;
        if (str == null) {
            str = "";
        }
        return new C1412390mrF(str);
    }

    public static final void LLILZ(VideoPublishEditModel videoPublishEditModel) {
        videoPublishEditModel.creativeModel.commonMobModel.editPageFuncTracking.isCaptionFuncUsed = true;
    }

    public static final void LLILZIL(VideoPublishEditModel videoPublishEditModel) {
        videoPublishEditModel.creativeModel.commonMobModel.editPageFuncTracking.isEffectFuncUsed = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LLILZLL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1428470nHB.LLILZLL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):void");
    }

    public static final boolean LLIZ(EditPageFunctionTracking editPageFunctionTracking) {
        if (!editPageFunctionTracking.isTextFuncUsed && !editPageFunctionTracking.isEffectFuncUsed && !editPageFunctionTracking.isVoiceEffectFuncUsed && !editPageFunctionTracking.isVoiceoverFuncUsed && !editPageFunctionTracking.isCaptionFuncUsed && !editPageFunctionTracking.isFilterFuncUsed) {
            return false;
        }
        return true;
    }

    public static final FilterBean LJ(VideoPublishEditModel videoPublishEditModel, InterfaceC1639870sm9 interfaceC1639870sm9) {
        String selectedFilterId = videoPublishEditModel.getSelectedFilterId();
        if (selectedFilterId != null) {
            try {
                FilterBean filterBeanLIZIZ = C1453230nv7.LIZIZ(interfaceC1639870sm9.LJJI(), selectedFilterId);
                if (filterBeanLIZIZ != null) {
                    filterBeanLIZIZ.resetCompareKey();
                    return filterBeanLIZIZ;
                }
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        String selectedFilterResId = videoPublishEditModel.getSelectedFilterResId();
        if (selectedFilterResId != null) {
            try {
                FilterBean filterBeanLJ = C1453230nv7.LJ(interfaceC1639870sm9.LJJI(), selectedFilterResId);
                if (filterBeanLJ != null) {
                    filterBeanLJ.resetCompareKey();
                    return filterBeanLJ;
                }
            } catch (NumberFormatException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        FilterBean filterBeanLJIILL = interfaceC1639870sm9.LJIILL(videoPublishEditModel.getSelectedFilterId(), videoPublishEditModel.getSelectedFilterResId());
        if (filterBeanLJIILL != null) {
            filterBeanLJIILL.resetCompareKey();
            return filterBeanLJIILL;
        }
        if (videoPublishEditModel.getSelectedId() < 0) {
            return new FilterBean();
        }
        return C1453230nv7.LIZLLL(interfaceC1639870sm9.LJJI(), videoPublishEditModel.getSelectedId());
    }

    public static final String LJJ(VideoPublishEditModel videoPublishEditModel, String str) {
        if (LJI(videoPublishEditModel) && videoPublishEditModel.creativeModel.followUpPublishTrackerModel.enterRecordFromFeed) {
            if (!C123100dR.LIZ(str)) {
                String str2 = videoPublishEditModel.creativeModel.followUpPublishTrackerModel.followUpItemIdGroups;
                if (str2 != null && str2.length() != 0) {
                    return (String) ListProtector.get(a0.LJJLIIIJILLIZJL(str2, new String[]{","}, 0, 6), 0);
                }
                return "";
            }
            return str;
        }
        return "";
    }

    public static final String LJJIIJ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        String shootEnterFrom;
        CanvasVideoData canvasVideoData = videoPublishEditModel.getCanvasVideoData();
        if (canvasVideoData != null && C1444940nhk.LJIIJ(canvasVideoData)) {
            return "single_song";
        }
        if (Intrinsics.LJFF(videoPublishEditModel.mShootWay, "sub_only_video_page")) {
            return "sub_only_video_page";
        }
        if (!Intrinsics.LJFF(videoPublishEditModel.mShootWay, "photo_h5") && !LJLL(videoPublishEditModel) && !LJLJLLL(videoPublishEditModel)) {
            if (!C13LP.LJJJJ(videoPublishEditModel.mShootWay, C13LQ.LJLIIL(new String[]{"prop_personal_homepage_reviewing", "prop_personal_homepage_reject", "prop_anchor_reviewing"}))) {
                if (Intrinsics.LJFF(videoPublishEditModel.mShootWay, "local_service_h5")) {
                    return videoPublishEditModel.creativeModel.shootEnterFrom;
                }
                if (Intrinsics.LJFF(videoPublishEditModel.mShootWay, "story")) {
                    CommonMobParamModel commonMobParamModel = videoPublishEditModel.creativeModel.commonMobModel;
                    if (commonMobParamModel.isUploadDirectEnter) {
                        return commonMobParamModel.shootEnterFrom;
                    }
                }
                if (z && videoPublishEditModel.getCreativeFlowData().getShootExtraData() != null) {
                    ShootExtraData shootExtraData = videoPublishEditModel.getCreativeFlowData().getShootExtraData();
                    if (shootExtraData == null) {
                        return null;
                    }
                    return shootExtraData.getShootEnterFrom();
                }
                if (Intrinsics.LJFF(videoPublishEditModel.mShootWay, "nearby_post_now_button")) {
                    return "homepage_nearby";
                }
                CreativeModel creativeModel = videoPublishEditModel.creativeModel;
                AIChatGenModel aIChatGenModel = creativeModel.aiChatGenModel;
                if (aIChatGenModel != null) {
                    AIChatGenChatRoomModel aIChatGenChatRoomModel = aIChatGenModel.chatRoomModel;
                    if (aIChatGenChatRoomModel == null) {
                        return null;
                    }
                    return aIChatGenChatRoomModel.enterFrom;
                }
                ShootExtraData shootExtraData2 = creativeModel.creativeFlowData.getShootExtraData();
                if (shootExtraData2 != null && (shootEnterFrom = shootExtraData2.getShootEnterFrom()) != null && ((shootEnterFrom.length() != 0 || (shootEnterFrom = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).enterFromService().getEnterFrom()) != null) && shootEnterFrom.length() != 0 && !Intrinsics.LJFF("", shootEnterFrom))) {
                    return shootEnterFrom;
                }
                return videoPublishEditModel.getEnterFrom();
            }
        }
        return videoPublishEditModel.getEnterFrom();
    }

    public static final boolean LLIIII(TemplateConsumeData templateConsumeData, EnumC1412640mre enumC1412640mre) {
        return Intrinsics.LJFF(templateConsumeData.templateType, C1412630mrd.LIZLLL(enumC1412640mre));
    }

    public static final void LLIIZ(Intent intent, VideoPublishEditModel videoPublishEditModel) {
        intent.putExtra("args", (Serializable) videoPublishEditModel);
        C0MUK.LJIIIZ(intent, videoPublishEditModel.creativeModel);
    }

    public static final void LLIL(Bundle bundle, VideoPublishEditModel videoPublishEditModel) {
        C786410Ut5.LJJIZ(bundle, "args", videoPublishEditModel);
    }

    public static final void LLILII(int i, Activity activity, VideoPublishEditModel videoPublishEditModel) {
        videoPublishEditModel.isPrivate = i;
        C0CHQ.LIZ().getPublishService().LJJLIIIJLJLI().getClass();
        C1444610nhD.LIZ(i);
    }

    public static final MobParam LJII(VideoPublishEditModel videoPublishEditModel, String str, String str2, String str3) {
        boolean z;
        String recPoiIdList;
        String str4;
        CommonMobParamModel commonMobParamModel;
        PoiReTagInfo poiReTagInfo;
        List<RecPoiItemModel> poiReTagRecPoiList;
        Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(videoPublishEditModel);
        if (pairLJIIJJI.getFirst() != null && pairLJIIJJI.getSecond() != null && pairLJIIJJI.getFirst().intValue() + pairLJIIJJI.getSecond().intValue() > 1) {
            z = true;
        } else {
            z = false;
        }
        EditPostModel editPostModel = videoPublishEditModel.creativeModel.editPostModel;
        Integer numValueOf = null;
        if (editPostModel != null && (poiReTagInfo = editPostModel.getPoiReTagInfo()) != null && poiReTagInfo.getEditPostShowRecPoi() == 1 && (poiReTagRecPoiList = poiReTagInfo.getPoiReTagRecPoiList()) != null && (!poiReTagRecPoiList.isEmpty())) {
            recPoiIdList = poiReTagInfo.getRecPoiIdList();
        } else {
            recPoiIdList = null;
        }
        String str5 = videoPublishEditModel.mShootWay;
        if (str5 == null) {
            str5 = str;
        }
        String creationId = videoPublishEditModel.getCreationId();
        String shootEnterMethod = videoPublishEditModel.getShootEnterMethod();
        String strLJIILIIL = LJIILIIL(videoPublishEditModel);
        String strLJIILL = LJIILL(videoPublishEditModel);
        String strLJJIIZI = LJJIIZI(videoPublishEditModel);
        String musicId = videoPublishEditModel.getMusicId();
        String allEffectListStr = videoPublishEditModel.getAllEffectListStr();
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        if (creativeModel != null && (commonMobParamModel = creativeModel.commonMobModel) != null) {
            str4 = commonMobParamModel.hashtagList;
        } else {
            str4 = null;
        }
        EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
        if (previewInfo != null) {
            numValueOf = Integer.valueOf(previewInfo.getPreviewVideoLength());
        }
        return new MobParam(str, str5, creationId, shootEnterMethod, strLJIILIIL, z, strLJIILL, strLJJIIZI, musicId, allEffectListStr, str4, numValueOf, videoPublishEditModel.getStickerID(), str2, str3, recPoiIdList);
    }
}
