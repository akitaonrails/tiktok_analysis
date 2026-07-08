package X;

import Y.AComparatorS24S0000000_5;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.creative.model.CreativeDurationExtra;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.HashtagsModel;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.creative.model.UgcTemplateData;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.defaultcontent.DefaultPostContentModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditEffectModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateAsset;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProDraftModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardVideo;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.creative.model.photomode.PhotoModePostContentModel;
import com.ss.android.ugc.aweme.creative.model.publish.CaptionModel;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.model.UploadCustomizeCoverInfo;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.mvtheme.MvSourceItemInfo;
import com.ss.android.ugc.aweme.offline.socialavatar.debug.ISocialAvatarDebugService;
import com.ss.android.ugc.aweme.services.editeffect.EditEffectAnchorManager;
import com.ss.android.ugc.aweme.services.editeffect.EffectAnchorServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.model.TransAnchorData;
import com.ss.android.ugc.aweme.socialavatar.api.ISocialAvatarStoryPostService;
import com.ss.android.ugc.aweme.socialavatar.api.SocialAvatarStoryPostStickerSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0nHG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1428520nHG {
    public static final boolean LJJLIIIJLLLLLLLZ() {
        if (C365790EVt.LIZ()) {
            return (C0CHQ.LIZ().getAccountService().isLogin() && C1651050t4B.LIZ()) ? false : true;
        }
        return false;
    }

    public static final boolean LJI(VideoPublishEditModel videoPublishEditModel) {
        if (C295820Bie.LIZIZ() == 3 && C1428470nHB.LJJJJLL(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    public static final boolean LJII(VideoPublishEditModel videoPublishEditModel) {
        ISocialAvatarStoryPostService iSocialAvatarStoryPostService = (ISocialAvatarStoryPostService) PluggableExtentionKt.pluggableSpi$default(ISocialAvatarStoryPostService.class, false, false, false, 14, null);
        if (iSocialAvatarStoryPostService == null || !iSocialAvatarStoryPostService.enable() || IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().LJIILJJIL(null, null).LIZ() == null) {
            return false;
        }
        ISocialAvatarDebugService iSocialAvatarDebugService = (ISocialAvatarDebugService) PluggableExtentionKt.pluggableSpi$default(ISocialAvatarDebugService.class, false, false, false, 14, null);
        if (iSocialAvatarDebugService != null) {
            iSocialAvatarDebugService.LJFF();
        }
        if (videoPublishEditModel.creativeModel.changeAvatarModel.isFromChangeAvatar) {
            return false;
        }
        if (!Intrinsics.LJFF(videoPublishEditModel.getEnterFrom(), "post_social_avatar_anchor_page") || !u4.LJIIZILJ(videoPublishEditModel)) {
            CanvasVideoData canvasVideoData = videoPublishEditModel.getCanvasVideoData();
            if (canvasVideoData == null || !C1444940nhk.LJFF(canvasVideoData)) {
                return false;
            }
            C0HYP.LIZ.getClass();
            String[] stringArray = C0HYP.LJ().getStringArray("story_sticker_tray_show_timestamp", new String[0]);
            long jCurrentTimeMillis = System.currentTimeMillis();
            List<Integer> list = SocialAvatarStoryPostStickerSettings.LIZ().stickerTrayIntervals;
            try {
                if (stringArray.length != 0) {
                    if (stringArray.length > list.size()) {
                        return false;
                    }
                    if (jCurrentTimeMillis - CastLongProtector.parseLong((String) C13LQ.LJJJIL(stringArray)) <= TimeUnit.DAYS.toMillis(((Number) ListProtector.get(list, stringArray.length - 1)).intValue())) {
                        return false;
                    }
                }
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        return true;
    }

    public static final boolean LJIIIIZZ(VideoPublishEditModel videoPublishEditModel) {
        if (LJIIJJI(videoPublishEditModel)) {
            if (LJJL(videoPublishEditModel) || LJJLIIIIJ(videoPublishEditModel) || videoPublishEditModel.getEditMusicSyncMode()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJIIIZ(Bundle bundle) {
        String string;
        EditEffectAnchorManager data;
        if (bundle == null || (string = bundle.getString("extra_edit_effect_uid")) == null || (data = EffectAnchorServiceImpl.createIEffectAnchorServicebyMonsterPlugin(false).getData(string)) == null) {
            return false;
        }
        return data.hasOverlayEffects();
    }

    public static final boolean LJIIJ(VideoPublishEditModel videoPublishEditModel) {
        if (LJJJJZ(videoPublishEditModel)) {
            return false;
        }
        if (videoPublishEditModel.creativeModel.nowsShootModel != null) {
            return C1428540nHI.LIZ();
        }
        if (!C1428540nHI.LIZ()) {
            return false;
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_add_save_local_layout_type", true) == 1) {
            C1428640nHS.LIZ.getClass();
            if (C1428640nHS.LIZJ(videoPublishEditModel)) {
                return false;
            }
        }
        if (videoPublishEditModel.isEnterFromDM() || C1428470nHB.LLIIIJ(videoPublishEditModel) || C1444940nhk.LJIIIIZZ(videoPublishEditModel.getCanvasVideoData())) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIJJI(VideoPublishEditModel videoPublishEditModel) {
        if ((C0CHQ.LIZ().getAccountService().LIZ() || ((Boolean) C0APX.LIZ.getValue()).booleanValue()) && ((((Boolean) C272340Als.LIZ.getValue()).booleanValue() || (videoPublishEditModel.getOrigin() == 0 || videoPublishEditModel.getOrigin() == 2 || videoPublishEditModel.getEditorProModel().isPipUsed() ? !C0CLW.LIZIZ.LIZ.getForbidVoiceChangeOnEditPage().booleanValue() : (!LJJL(videoPublishEditModel) && !videoPublishEditModel.isStickPointMode()) || !C0CLW.LIZIZ.LIZ.getForbidVoiceChangeOnEditPage().booleanValue())) && !videoPublishEditModel.isStickPointMode() && ((((Boolean) C272370Alv.LIZ.getValue()).booleanValue() || videoPublishEditModel.getStitchParams() == null) && ((((Boolean) C272350Alt.LIZ.getValue()).booleanValue() || !videoPublishEditModel.isDuet()) && ((((Boolean) C272360Alu.LIZ.getValue()).booleanValue() || !videoPublishEditModel.getEditMusicSyncMode()) && !C1444940nhk.LJIIJ(videoPublishEditModel.getCanvasVideoData()) && (((!LJJL(videoPublishEditModel) || videoPublishEditModel.isCurrentAutoCutMode()) && !LJJLIIIIJ(videoPublishEditModel) && !videoPublishEditModel.isStickPointMode()) || u4.LJI(videoPublishEditModel))))))) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIL(VideoPublishEditModel videoPublishEditModel) {
        if (u4.LJLIIIL(videoPublishEditModel) == 1 || u4.LJLIIIL(videoPublishEditModel) == 2 || u4.LJLIIIL(videoPublishEditModel) == 3) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILIIL(VideoPublishEditModel videoPublishEditModel) {
        if (!LJIILJJIL(videoPublishEditModel) || ((Number) C0BWD.LIZ.getValue()).intValue() != 1 || !LJJZ(videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIILJJIL(VideoPublishEditModel videoPublishEditModel) {
        if (((Number) C0BWD.LIZ.getValue()).intValue() > 0) {
            IMSharePanelApi.LIZ.getClass();
            if ((C1599690rjL.LIZ().LIZ().LJFF() || (C1599690rjL.LIZ().LIZ().LIZLLL() && videoPublishEditModel.creativeModel.nowsShootModel != null)) && LJIIJ(videoPublishEditModel)) {
                C1428640nHS.LIZ.getClass();
                if (C1428640nHS.LIZJ(videoPublishEditModel) && (!u4.LJIIZILJ(videoPublishEditModel) || !C20622315mn.LIZJ())) {
                    C548590LfN.LIZ.getClass();
                    if (C548590LfN.LIZIZ().LJ(videoPublishEditModel.creativeModel)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean LJIILLIIL(VideoPublishEditModel videoPublishEditModel) {
        if (!LJIIZILJ(videoPublishEditModel) || C1416310mxZ.LJJJLZIJ(videoPublishEditModel, C1428550nHJ.LIZ())) {
            if (LJIILIIL(videoPublishEditModel) && !C1416310mxZ.LJJJLZIJ(videoPublishEditModel, C300650BqR.LIZIZ)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean LJIIZILJ(VideoPublishEditModel videoPublishEditModel) {
        if (((Boolean) C1428570nHL.LIZ.getValue()).booleanValue() && LJIIJ(videoPublishEditModel) && LJJZ(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    public static final boolean LJIJ(VideoPublishEditModel videoPublishEditModel) {
        if (u4.LJIIZILJ(videoPublishEditModel) || videoPublishEditModel.creativeModel.changeAvatarModel.isFromChangeAvatar) {
            return false;
        }
        C1428640nHS.LIZ.getClass();
        if (!C1428640nHS.LIZLLL(videoPublishEditModel)) {
            return false;
        }
        return C376670Epl.LIZ();
    }

    public static final boolean LJIJI(VideoPublishEditModel videoPublishEditModel) {
        if (((Boolean) C1428590nHN.LIZ.getValue()).booleanValue() && C1428580nHM.LIZ(videoPublishEditModel.isEnterFromDM()) && LJIIZILJ(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    public static final boolean LJIJJLI(VideoPublishEditModel videoPublishEditModel) {
        if (((Boolean) C1428600nHO.LIZ.getValue()).booleanValue() && C1428580nHM.LIZ(videoPublishEditModel.isEnterFromDM())) {
            if (LJIILJJIL(videoPublishEditModel) || LJIIZILJ(videoPublishEditModel)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJIL(VideoPublishEditModel videoPublishEditModel) {
        if ((u4.LJLL(videoPublishEditModel) || ((videoPublishEditModel.isEnterFromDM() && C290580BaC.LIZ()) || (((Number) C272970Amt.LIZ.getValue()).intValue() == 1 && C1444940nhk.LJFF(videoPublishEditModel.getCanvasVideoData())))) && !C1434160nQM.LIZ(videoPublishEditModel.creativeModel) && !C1453840nw6.LIZLLL(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    public static final boolean LJJ(VideoPublishEditModel videoPublishEditModel) {
        if (!C565160MEo.LIZIZ(videoPublishEditModel) || !videoPublishEditModel.getAILivePhotoModel().LJII() || C0C64.LJIILLIIL().LJIJ(31744, 0, "creation_ai_live_photo_save_local_add_watermark", true) != 1) {
            return false;
        }
        return true;
    }

    public static final void LJJI(VideoPublishEditModel videoPublishEditModel) {
        ArrayList<TransAnchorData> arrayList;
        CreativeInitialModel creativeInitialModel = videoPublishEditModel.creativeModel.initialModel;
        PhotoModePostContentModel photoModePostContentModel = creativeInitialModel.photoModePostContentModel;
        if (photoModePostContentModel != null && (arrayList = photoModePostContentModel.anchors) != null) {
            creativeInitialModel.defaultPostContentModel = new DefaultPostContentModel(null, null, arrayList, 3, null);
        }
    }

    public static final void LJJIFFI(VideoPublishEditModel videoPublishEditModel) {
        ArrayList<String> arrayList;
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        PhotoModePostContentModel photoModePostContentModel = creativeModel.initialModel.photoModePostContentModel;
        if (photoModePostContentModel != null && (arrayList = photoModePostContentModel.hashtags) != null && (!arrayList.isEmpty())) {
            CaptionModel captionModel = creativeModel.postPageModel.captionModel;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            String str = captionModel.markupText;
            if (str == null) {
                str = "";
            }
            sbLIZ.append(a0.LJJJLL("\n\n", str));
            sbLIZ.append("\n\n");
            captionModel.markupText = C2188811AlT.LIZIZ(sbLIZ);
            videoPublishEditModel.creativeModel.initialModel.hashtagsModel = new HashtagsModel(arrayList, 2);
        }
    }

    public static final Integer LJJIII(VideoPublishEditModel videoPublishEditModel) {
        int celebrationType = videoPublishEditModel.creativeModel.onThisDayData.getCelebrationType();
        if (celebrationType != 0) {
            return Integer.valueOf(celebrationType);
        }
        return Integer.valueOf(videoPublishEditModel.creativeModel.storyEventStickerData.getCelebrationType());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [T, java.lang.String] */
    public static final String LJJIIJ(VideoPublishEditModel videoPublishEditModel) {
        List<EditVideoSegment> videoList;
        EditVideoSegment editVideoSegment;
        C259800zU c259800zU = new C259800zU();
        String str = "";
        c259800zU.element = "";
        if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
            ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
            T t = str;
            if (imageAlbumData != null) {
                List<SingleImageData> imageList = imageAlbumData.getImageList();
                t = str;
                if (imageList != null) {
                    String strLJJLIIIJ = C13LP.LJJLIIIJ(imageList, ",", null, null, 0, null, AFwS239S0000000_8.get$arr$(70), 30);
                    t = str;
                    if (strLJJLIIIJ != null) {
                        t = strLJJLIIIJ;
                    }
                }
            }
            c259800zU.element = t;
        } else if (!videoPublishEditModel.isCurrentAutoCutMode() && !videoPublishEditModel.isTemplateMv() && !videoPublishEditModel.isPhotoMvMode() && !videoPublishEditModel.isCutSameVideoType()) {
            if (videoPublishEditModel.isLivePhotoEdit()) {
                EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
                if (previewInfo != null && (videoList = previewInfo.getVideoList()) != null && (editVideoSegment = (EditVideoSegment) C13LP.LJJJLL(videoList)) != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(editVideoSegment.getVideoFileInfo().getWidth());
                    sbLIZ.append('*');
                    sbLIZ.append(editVideoSegment.getVideoFileInfo().getHeight());
                    c259800zU.element = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    new AwS566S0100000_22(c259800zU, (C259800zU<String>) 294);
                }
            } else {
                EditPreviewInfo previewInfo2 = videoPublishEditModel.getPreviewInfo();
                T t2 = str;
                if (previewInfo2 != null) {
                    List<EditVideoSegment> videoList2 = previewInfo2.getVideoList();
                    t2 = str;
                    if (videoList2 != null) {
                        String strLJJLIIIJ2 = C13LP.LJJLIIIJ(videoList2, ",", null, null, 0, null, AFwS239S0000000_8.get$arr$(71), 30);
                        t2 = str;
                        if (strLJJLIIIJ2 != null) {
                            t2 = strLJJLIIIJ2;
                        }
                    }
                }
                c259800zU.element = t2;
            }
        } else {
            ArrayList<ImportVideoInfo> importInfoList = videoPublishEditModel.getImportInfoList();
            T t3 = str;
            if (importInfoList != null) {
                String strLJJLIIIJ3 = C13LP.LJJLIIIJ(importInfoList, ",", null, null, 0, null, AFwS261S0000000_22.get$arr$(117), 30);
                t3 = str;
                if (strLJJLIIIJ3 != null) {
                    t3 = strLJJLIIIJ3;
                }
            }
            c259800zU.element = t3;
        }
        return (String) c259800zU.element;
    }

    public static final boolean LJJIIZI(VideoPublishEditModel videoPublishEditModel) {
        boolean zLJII = C1403850mdT.LJII(videoPublishEditModel);
        if (zLJII && C349930Dnj.LIZ(videoPublishEditModel, null, false) && videoPublishEditModel.hasExtendMusic()) {
            return false;
        }
        return zLJII;
    }

    public static final boolean LJJIJ(VideoPublishEditModel videoPublishEditModel) {
        return C1466090oFr.LJIIIZ(videoPublishEditModel.creativeModel.stickerModel);
    }

    public static final String LJJIJIIJI(VideoPublishEditModel videoPublishEditModel) {
        if ((!C1403850mdT.LJIIJJI(videoPublishEditModel) || videoPublishEditModel.getVoiceVolume() == 0.0f) && !videoPublishEditModel.hasRecord()) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return "1";
    }

    public static final boolean LJJIJIIJIL(VideoPublishEditModel videoPublishEditModel) {
        EffectPointModel timeEffect = videoPublishEditModel.getTimeEffect();
        if (timeEffect == null) {
            return false;
        }
        if (!Intrinsics.LJFF(timeEffect.getKey(), "2") && !Intrinsics.LJFF(timeEffect.getKey(), "3")) {
            return false;
        }
        return true;
    }

    public static final int LJJIJIL(VideoPublishEditModel videoPublishEditModel) {
        VideoFileInfo videoFileInfoLJJIJLIJ = LJJIJLIJ(videoPublishEditModel);
        if (videoFileInfoLJJIJLIJ != null) {
            return videoFileInfoLJJIJLIJ.getCodecType();
        }
        return -1;
    }

    public static final String LJJIJL(VideoPublishEditModel videoPublishEditModel) {
        String resolution;
        VideoFileInfo videoFileInfoLJJIJLIJ = LJJIJLIJ(videoPublishEditModel);
        if (videoFileInfoLJJIJLIJ == null || (resolution = videoFileInfoLJJIJLIJ.getResolution()) == null) {
            return "";
        }
        return resolution;
    }

    public static final VideoFileInfo LJJIJLIJ(VideoPublishEditModel videoPublishEditModel) {
        String strVideoPath;
        int[] iArrLIZIZ;
        if (!videoPublishEditModel.isUploadVideo()) {
            if (videoPublishEditModel.getOriginalVideoInfo() == null && (strVideoPath = videoPublishEditModel.videoPath()) != null && strVideoPath.length() != 0 && (iArrLIZIZ = C1404710mer.LIZIZ(videoPublishEditModel.videoPath())) != null) {
                videoPublishEditModel.setOriginalVideoInfo(new VideoFileInfo(iArrLIZIZ[0], iArrLIZIZ[1], iArrLIZIZ[3], iArrLIZIZ[7], iArrLIZIZ[6], iArrLIZIZ[8], 0, 0, 0.0f, 448, null));
            }
            return videoPublishEditModel.getOriginalVideoInfo();
        }
        ArrayList<ImportVideoInfo> importInfoList = videoPublishEditModel.getImportInfoList();
        if (importInfoList != null && !importInfoList.isEmpty()) {
            List<ImportVideoInfo> importInfoList2 = videoPublishEditModel.getImportInfoList();
            if (importInfoList2 == null) {
                importInfoList2 = C13BV.INSTANCE;
            }
            for (ImportVideoInfo importVideoInfo : importInfoList2) {
                if (importVideoInfo.getBitRate() != 0 && importVideoInfo.getEncodeId() != 0 && importVideoInfo.getOriginFps() != 0) {
                    return new VideoFileInfo(importVideoInfo.getVideoWidth(), importVideoInfo.getVideoHeight(), importVideoInfo.getDuration(), importVideoInfo.getOriginFps(), importVideoInfo.getBitRate(), importVideoInfo.getEncodeId(), 0, 0, 0.0f, 448, null);
                }
            }
            return null;
        }
        return null;
    }

    public static final List<PhotoTemplateAsset> LJJIL(VideoPublishEditModel videoPublishEditModel) {
        List<Pair<PhotoTemplateAsset, Boolean>> listLJJIZ = LJJIZ(videoPublishEditModel);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJIZ, 10));
        Iterator<Pair<PhotoTemplateAsset, Boolean>> it2 = listLJJIZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getFirst());
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[LOOP:1: B:87:0x0135->B:120:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<kotlin.Pair<com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateAsset, java.lang.Boolean>> LJJIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r14) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1428520nHG.LJJIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):java.util.List");
    }

    public static final String LJJJ(VideoPublishEditModel videoPublishEditModel) {
        List<PhotoTemplateAsset> listLJJIL = LJJIL(videoPublishEditModel);
        if (((ArrayList) listLJJIL).isEmpty()) {
            return null;
        }
        return C13LP.LJJLIIIJ(listLJJIL, ",", null, null, 0, null, AFwS261S0000000_22.get$arr$(118), 30);
    }

    public static final boolean LJJJI(VideoPublishEditModel videoPublishEditModel) {
        List<CanvasFilterParam> transformList;
        CanvasExtra canvasExtra;
        ForwardCanvasExtra forwardCanvasExtra;
        ForwardVideo forwardVideo;
        String sourceVID;
        CanvasVideoData canvasVideoData = videoPublishEditModel.getCanvasVideoData();
        if (canvasVideoData != null && C1444940nhk.LJFF(canvasVideoData) && (transformList = canvasVideoData.getTransformList()) != null && !transformList.isEmpty() && (canvasExtra = canvasVideoData.extra) != null && (forwardCanvasExtra = canvasExtra.forwardCanvasExtra) != null && (forwardVideo = forwardCanvasExtra.video) != null && (sourceVID = forwardVideo.getSourceVID()) != null && sourceVID.length() != 0 && C0C64.LJIILLIIL().LJIIIZ(31744, "enable_normal_share_story_publish_cloud_merge", true, false) && !videoPublishEditModel.mIsFromDraft && !LJJJJI(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    public static final int LJJJIL(InterfaceC1455860nzM interfaceC1455860nzM) {
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1452170ntP value;
        if (interfaceC1455860nzM != null && (liveDataG = interfaceC1455860nzM.g()) != null && (value = liveDataG.getValue()) != null) {
            return value.getDuration();
        }
        return 0;
    }

    public static final boolean LJJJJ(VideoPublishEditModel videoPublishEditModel) {
        AudioRecorderParam veAudioRecorderParam = videoPublishEditModel.getVeAudioRecorderParam();
        if (veAudioRecorderParam == null) {
            return false;
        }
        if (!veAudioRecorderParam.hasRecord() && veAudioRecorderParam.getNeedOriginalSound()) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJI(VideoPublishEditModel videoPublishEditModel) {
        if (!LJJJJIZL(videoPublishEditModel) && !LJJJJ(videoPublishEditModel) && videoPublishEditModel.getVeAudioRecorderParam() == null) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJIZL(VideoPublishEditModel videoPublishEditModel) {
        ArrayList arrayList;
        if (videoPublishEditModel.getTimeEffect() == null || !(!Intrinsics.LJFF(r0.getKey(), CardStruct.IStatusCode.DEFAULT))) {
            ArrayList<EffectPointModel> effectList = videoPublishEditModel.getEffectList();
            if (effectList != null) {
                arrayList = new ArrayList();
                for (EffectPointModel effectPointModel : effectList) {
                    if (!Intrinsics.LJFF(effectPointModel.getKey(), CardStruct.IStatusCode.DEFAULT)) {
                        arrayList.add(effectPointModel);
                    }
                }
            } else {
                arrayList = null;
            }
            if (!C0IKQ.LIZIZ(arrayList) && !videoPublishEditModel.hasInfoStickers() && !videoPublishEditModel.hasInfoStickers() && videoPublishEditModel.getSelectedId() == 0 && videoPublishEditModel.getVeAudioEffectParam() == null && (!videoPublishEditModel.isAutoEnhanceEnable() || !videoPublishEditModel.getAutoEnhanceOn())) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LJJJJJ(VideoPublishEditModel videoPublishEditModel) {
        EditorProDraftModel editorProDraftModel;
        String str;
        if (!C301790BsH.LIZ() || videoPublishEditModel == null || (editorProDraftModel = videoPublishEditModel.getEditorProDraftModel()) == null || (str = editorProDraftModel.nleData) == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJJL(VideoPublishEditModel videoPublishEditModel) {
        MusicObject musicObject = videoPublishEditModel.creativeModel.musicBuzModel.music;
        if (musicObject != null && musicObject.memeSong != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJJL(VideoPublishEditModel videoPublishEditModel) {
        AudioRecorderParam veAudioRecorderParam = videoPublishEditModel.getVeAudioRecorderParam();
        if (veAudioRecorderParam == null || !veAudioRecorderParam.hasRecord()) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJLI(VideoPublishEditModel videoPublishEditModel) {
        return videoPublishEditModel.creativeModel.voiceConversionModel.hasStyleConversion;
    }

    public static final boolean LJJJJZ(VideoPublishEditModel videoPublishEditModel) {
        if (!C565160MEo.LIZIZ(videoPublishEditModel) || C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_story_ai_live_photo_disable_save_local", true) != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJZI(VideoPublishEditModel videoPublishEditModel) {
        ArrayList<String> arrayList = new ArrayList();
        String recordFilterLabels = videoPublishEditModel.getRecordFilterLabels();
        if (recordFilterLabels != null) {
            arrayList.addAll(a0.LJJLIIIJILLIZJL(recordFilterLabels, new String[]{","}, 0, 6));
        }
        String selectedFilterLabel = videoPublishEditModel.getSelectedFilterLabel();
        if (selectedFilterLabel != null) {
            arrayList.add(selectedFilterLabel);
        }
        for (String str : arrayList) {
            if (str.length() > 0 && !Intrinsics.LJFF(str, "normal")) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LJJJLIIL(VideoPublishEditModel videoPublishEditModel) {
        EditorProDraftModel editorProDraftModel;
        String str;
        EditorProModel editorProModel;
        if (!C301790BsH.LIZ()) {
            return false;
        }
        if (C295990Biv.LIZ()) {
            if (videoPublishEditModel == null || (editorProModel = videoPublishEditModel.getEditorProModel()) == null || !editorProModel.isAdvancedEditDraft()) {
                if (!C301790BsH.LIZ() || videoPublishEditModel == null) {
                    return false;
                }
                EditorProDraftModel editorProDraftModel2 = videoPublishEditModel.getEditorProDraftModel();
                if (editorProDraftModel2 != null) {
                    String str2 = editorProDraftModel2.nleData;
                    if (str2 == null || str2.length() == 0) {
                        if (videoPublishEditModel == null) {
                            return false;
                        }
                        editorProDraftModel = videoPublishEditModel.getEditorProDraftModel();
                        return editorProDraftModel != null ? false : false;
                    }
                } else {
                    editorProDraftModel = videoPublishEditModel.getEditorProDraftModel();
                    if (editorProDraftModel != null || (str = editorProDraftModel.nleDataPath) == null || str.length() == 0 || !C2354709Kn.LIZIZ(str)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return LJJJJJ(videoPublishEditModel);
    }

    public static final boolean LJJJLL(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.creativeModel.editorProDraftModel.isEnterFromRecordTab && Intrinsics.LJFF(videoPublishEditModel.getEditorProModel().getOpenEditToolType(), "autocut")) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJLZIJ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.getOriginal() == 1 && videoPublishEditModel.getShootMode() == 16) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJZ(VideoPublishEditModel videoPublishEditModel) {
        if ((videoPublishEditModel.getOriginal() != 1 && videoPublishEditModel.getOriginal() != 2) || C13LQ.LJJIJIIJI(Integer.valueOf(videoPublishEditModel.getShootMode()), new Integer[]{15, 24, 20, 23, 29, 16, 17}) < 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJJL(VideoPublishEditModel videoPublishEditModel) {
        if (!videoPublishEditModel.isMvThemeVideoType() && !videoPublishEditModel.isCutSameVideoType()) {
            return false;
        }
        return true;
    }

    public static final int LJJLI(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.isMuted()) {
            return 0;
        }
        return 1;
    }

    public static final boolean LJJLIIIIJ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.isCurrentAutoCutMode()) {
            return true;
        }
        if ((!videoPublishEditModel.isFastImport() && !videoPublishEditModel.hasOriginalSound()) || videoPublishEditModel.isMuted()) {
            return true;
        }
        return false;
    }

    public static final boolean LJJLIIIJ(VideoPublishEditModel videoPublishEditModel) {
        if (!videoPublishEditModel.isUploadVideo()) {
            if (C1444940nhk.LJII(videoPublishEditModel.getCanvasVideoData()) || videoPublishEditModel.isPhotoMvMode()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJJLIIIJILLIZJL(VideoPublishEditModel videoPublishEditModel) {
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "stick_point_new_alg_rule", true) != 3 || videoPublishEditModel.creativeModel.musicBuzModel.disableAudioDrive || videoPublishEditModel.getEditorProModel().isAdvancedEdit()) {
            return false;
        }
        return true;
    }

    public static final boolean LJJLIIIJJI(VideoPublishEditModel videoPublishEditModel) {
        if (!LJIIJ(videoPublishEditModel)) {
            return false;
        }
        C1428640nHS.LIZ.getClass();
        if (!C1428640nHS.LIZJ(videoPublishEditModel) || C1441980ncy.LIZIZ(videoPublishEditModel) || u4.LJIIZILJ(videoPublishEditModel) || videoPublishEditModel.creativeModel.changeAvatarModel.isFromChangeAvatar || C0C64.LJIILLIIL().LJIJ(31744, 0, "edit_save_local_entrance_bottom", true) != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJJLIIIJJIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.getOriginal() == 0 && !videoPublishEditModel.isTemplateMv() && !LJLIIL(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    public static final boolean LJJLIIIJL(VideoPublishEditModel videoPublishEditModel) {
        MultiEditVideoRecordData multiEditVideoRecordData;
        List<MultiEditVideoSegmentRecordData> list;
        MultiEditVideoStatusRecordData multiEditVideoRecordData2 = videoPublishEditModel.getMultiEditVideoRecordData();
        if (multiEditVideoRecordData2 != null && (multiEditVideoRecordData = multiEditVideoRecordData2.curMultiEditVideoRecordData) != null && (list = multiEditVideoRecordData.segmentDataList) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<MultiEditVideoSegmentRecordData> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().audioSpeed != 1.0f) {
                    return true;
                }
                arrayList.add(Unit.LIZ);
            }
        }
        return false;
    }

    public static final boolean LJJLIIIJLJLI(VideoPublishEditModel videoPublishEditModel) {
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        AutoCutModel autoCutModel = creativeModel.autoCutModel;
        AutoCutThemeData autoCutThemeDataLIZJ = C1403130mcJ.LIZJ(creativeModel);
        if (autoCutModel.curSource == C0MJ9.MIX_EDITING.ordinal() || autoCutThemeDataLIZJ == null || !C13LQ.LJLIIL(new Integer[]{Integer.valueOf(EnumC1412640mre.DESIGNER_FIXED_TEMPLATE.getValue()), Integer.valueOf(EnumC1412640mre.ALGORITHM_TEMPLATE.getValue()), Integer.valueOf(EnumC1412640mre.CUT_SAME.getValue()), Integer.valueOf(EnumC1412640mre.PUGC_TEMPLATE.getValue())}).contains(Integer.valueOf(autoCutModel.curTemplateType))) {
            return false;
        }
        return true;
    }

    public static final boolean LJJLIIJ(VideoPublishEditModel videoPublishEditModel) {
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_story_ai_live_save_local_revert_v1", true) != 1 || !C565160MEo.LIZIZ(videoPublishEditModel)) {
            return false;
        }
        if (!videoPublishEditModel.getAILivePhotoModel().LJIIIZ() && !videoPublishEditModel.getAILivePhotoModel().LJII()) {
            return false;
        }
        return true;
    }

    public static final boolean LJJLIL(VideoPublishEditModel videoPublishEditModel) {
        if (C364100EPg.LIZ() && !videoPublishEditModel.getEditEffectModel().forceEnterMultiTrack) {
            EditEffectModel editEffectModel = videoPublishEditModel.getEditEffectModel();
            ArrayList<EffectPointModel> effectList = videoPublishEditModel.getEffectList();
            boolean z = false;
            if (!effectList.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (EffectPointModel effectPointModel : effectList) {
                    if (true ^ Intrinsics.LJFF(effectPointModel.getCategory(), "time")) {
                        arrayList.add(effectPointModel);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    EffectPointModel effectPointModel2 = (EffectPointModel) obj;
                    String extra = effectPointModel2.getExtra();
                    if (extra == null) {
                        extra = "";
                    }
                    if (!effectPointModel2.isMagic() && !a0.LJJIIZI(extra, EnumC1429610nJ1.EDIT_EFFECT_SERVER.getType(), false) && !a0.LJJIIZI(extra, EnumC1429610nJ1.EDIT_EFFECT_CLIENT.getType(), false) && !a0.LJJIIZI(extra, EnumC1429610nJ1.EDIT_EFFECT_COMBINED.getType(), false) && !a0.LJJIIZI(extra, EnumC1429610nJ1.EDIT_EFFECT_VIDEO_TYPE.getType(), false)) {
                        arrayList2.add(obj);
                    }
                }
                List<EffectPointModel> listLJLLLL = C13LP.LJLLLL(new AComparatorS24S0000000_5(137), arrayList2);
                z = false;
                for (EffectPointModel effectPointModel3 : listLJLLLL) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : listLJLLLL) {
                        if (!Intrinsics.LJFF(((EffectPointModel) obj2).getUuid(), effectPointModel3.getUuid())) {
                            arrayList3.add(obj2);
                        }
                    }
                    Iterator it2 = arrayList3.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            EffectPointModel effectPointModel4 = (EffectPointModel) it2.next();
                            if (effectPointModel4.getEndPoint() > effectPointModel3.getStartPoint() && effectPointModel4.getStartPoint() < effectPointModel3.getEndPoint()) {
                                z = true;
                                break;
                            }
                        }
                    }
                }
            }
            editEffectModel.forceEnterMultiTrack = z;
        }
        return videoPublishEditModel.getEditEffectModel().forceEnterMultiTrack;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJJLJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3) {
        /*
            boolean r0 = X.C301790BsH.LIZ()
            r2 = 0
            if (r0 != 0) goto L8
            return r2
        L8:
            boolean r0 = X.C295990Biv.LIZ()
            if (r0 == 0) goto L32
            r1 = 1
            if (r3 == 0) goto L2e
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r3.creativeModel
            com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel r0 = r0.draftInfoModel
            boolean r0 = r0.isDraft
            if (r0 != r1) goto L1e
            boolean r0 = r3.mIsFromDraft
            if (r0 == 0) goto L1e
            return r2
        L1e:
            com.ss.android.ugc.aweme.creative.model.editorpro.EditorProDraftModel r0 = r3.getEditorProDraftModel()
            if (r0 == 0) goto L2e
            java.lang.String r0 = r0.nleData
            if (r0 == 0) goto L2e
            int r0 = r0.length()
            if (r0 != 0) goto L2f
        L2e:
            r2 = 1
        L2f:
            r0 = r2 ^ 1
            return r0
        L32:
            boolean r0 = LJJJJJ(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1428520nHG.LJJLJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):boolean");
    }

    public static final boolean LJJLL(VideoPublishEditModel videoPublishEditModel) {
        if (u4.LJJIII(videoPublishEditModel) && C299950BpJ.LIZIZ() && u4.LJIJI(videoPublishEditModel) && u4.LJLJJL(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    public static final boolean LJJZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.isEnterFromDM() || videoPublishEditModel.isEnterFromBulletin() || C1428470nHB.LLIIIJ(videoPublishEditModel)) {
            return false;
        }
        C1428640nHS.LIZ.getClass();
        if (!C1428640nHS.LIZJ(videoPublishEditModel) || LJJLIIJ(videoPublishEditModel)) {
            return false;
        }
        if (videoPublishEditModel.isCommentReply()) {
            return true;
        }
        if (C0CHB.LIZ()) {
            if (C855610XhP.LIZ()) {
                return true;
            }
            if (videoPublishEditModel.creativeModel.commerceModel.getMission() != null || Intrinsics.LJFF(videoPublishEditModel.mShootWay, "tcm_upload") || u4.LJJJJ(videoPublishEditModel)) {
                return false;
            }
        } else if (!u4.LJLJJLL(videoPublishEditModel)) {
            return false;
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_quick_post_use_black_list", true) == 1) {
            return true;
        }
        if (((u4.LJJIJL(videoPublishEditModel) || videoPublishEditModel.getShootMode() == 0) && (u4.LJLJL(videoPublishEditModel) || Intrinsics.LJFF(videoPublishEditModel.mShootWay, "draft_again"))) || u4.LJLL(videoPublishEditModel) || videoPublishEditModel.isStitchMode() || videoPublishEditModel.isDuet()) {
            return true;
        }
        if (!C1428470nHB.LJJJJJL(videoPublishEditModel.creativeModel) || !C0C64.LJIILLIIL().LJIIIZ(31744, "studio_save_local_image_with_aiself_watermark", true, false)) {
            return false;
        }
        return true;
    }

    public static final EnumC1441860ncm LJJZZI(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.getOrigin() == 1) {
            return EnumC1441860ncm.RECORD;
        }
        Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(videoPublishEditModel);
        int iIntValue = pairLJIIJJI.getFirst().intValue();
        int iIntValue2 = pairLJIIJJI.getSecond().intValue();
        if (iIntValue == 0) {
            if (iIntValue2 == 1) {
                return EnumC1441860ncm.UPLOAD_ONE_IMAGE;
            }
            if (iIntValue2 > 1) {
                return EnumC1441860ncm.UPLOAD_ONLY_IMAGE;
            }
        }
        return EnumC1441860ncm.UPLOAD_OTHER;
    }

    public static final EnumC1441790ncf LJJZZIII(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.isMvThemeVideoType()) {
            if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
                return EnumC1441790ncf.DEFAULT;
            }
            return EnumC1441790ncf.MV_THEME;
        }
        if (videoPublishEditModel.isDuet()) {
            return EnumC1441790ncf.DUET;
        }
        if (videoPublishEditModel.isCutSameVideoType()) {
            return EnumC1441790ncf.CUT_SAME;
        }
        if (videoPublishEditModel.isCurrentAutoCutMode()) {
            return EnumC1441790ncf.AUTO_CUT;
        }
        UgcTemplateData ugcTemplateData = videoPublishEditModel.creativeModel.ugcTemplateData;
        if (!ugcTemplateData.isUgcTemplateFromAnchor && !ugcTemplateData.isPUgcTemplateFromAnchor) {
            return EnumC1441790ncf.DEFAULT;
        }
        return EnumC1441790ncf.UGC_TEMPLATE;
    }

    public static final void LJL(VideoPublishEditModel videoPublishEditModel) {
        String str;
        CommonMobParamModel commonMobParamModel = videoPublishEditModel.creativeModel.commonMobModel;
        if (!C1428470nHB.LLIIIJ(videoPublishEditModel) && !C1428470nHB.LLIIIL(videoPublishEditModel)) {
            if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
                str = "photo";
            } else {
                str = "video";
            }
        } else {
            str = "text";
        }
        commonMobParamModel.editPageType = str;
    }

    public static final void LJLI(VideoPublishEditModel videoPublishEditModel) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        CreativeDurationExtra creativeDurationExtra = videoPublishEditModel.getCreativeFlowData().getCreativeDurationExtra();
        if ((videoPublishEditModel.mIsFromDraft || videoPublishEditModel.getDraftFromShoot()) && creativeDurationExtra.getStartEditDraftTime() != 0) {
            creativeDurationExtra.setShootPublishDuration(creativeDurationExtra.getShootPublishDuration() + (jCurrentTimeMillis - creativeDurationExtra.getStartEditDraftTime()));
            creativeDurationExtra.setStartEditDraftTime(jCurrentTimeMillis);
        } else {
            if (creativeDurationExtra.getStartTime() <= 0) {
                return;
            }
            creativeDurationExtra.setShootPublishDuration(jCurrentTimeMillis - creativeDurationExtra.getStartTime());
        }
    }

    public static final void LJLIIIL(VideoPublishEditModel videoPublishEditModel) {
        int size;
        List<SingleImageData> imageList;
        int i = 0;
        if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
            CommonMobParamModel commonMobParamModel = videoPublishEditModel.creativeModel.commonMobModel;
            ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
            if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
                size = imageList.size();
            } else {
                size = 0;
            }
            commonMobParamModel.originPhotoCount = size;
            videoPublishEditModel.creativeModel.commonMobModel.originVideoCount = 0;
            return;
        }
        if (videoPublishEditModel.isLivePhotoEdit()) {
            CommonMobParamModel commonMobParamModel2 = videoPublishEditModel.creativeModel.commonMobModel;
            commonMobParamModel2.originPhotoCount = 1;
            commonMobParamModel2.originVideoCount = 0;
            return;
        }
        CommonMobParamModel commonMobParamModel3 = videoPublishEditModel.creativeModel.commonMobModel;
        if (commonMobParamModel3.originVideoCount >= 0 && commonMobParamModel3.originPhotoCount >= 0 && !videoPublishEditModel.isFromCrash()) {
            return;
        }
        if (videoPublishEditModel.isUploadVideo()) {
            ArrayList<ImportVideoInfo> importInfoList = videoPublishEditModel.getImportInfoList();
            if (importInfoList != null) {
                for (ImportVideoInfo importVideoInfo : new ArrayList(importInfoList)) {
                    C533730KwV c533730KwV = C533730KwV.LIZ;
                    String realImportPath = importVideoInfo.getRealImportPath();
                    c533730KwV.getClass();
                    if (C533730KwV.LJIIJ(realImportPath)) {
                        i++;
                    }
                }
                CommonMobParamModel commonMobParamModel4 = videoPublishEditModel.creativeModel.commonMobModel;
                commonMobParamModel4.originPhotoCount = i;
                commonMobParamModel4.originVideoCount = importInfoList.size() - i;
                return;
            }
            return;
        }
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        NowsShootModel nowsShootModel = creativeModel.nowsShootModel;
        if (nowsShootModel != null && nowsShootModel.type == 0) {
            CommonMobParamModel commonMobParamModel5 = creativeModel.commonMobModel;
            commonMobParamModel5.originPhotoCount = 1;
            commonMobParamModel5.originVideoCount = 0;
        } else {
            CommonMobParamModel commonMobParamModel6 = creativeModel.commonMobModel;
            commonMobParamModel6.originPhotoCount = 0;
            commonMobParamModel6.originVideoCount = videoPublishEditModel.deepCopyFinalVideoList().size();
        }
    }

    public static final boolean LJLIIL(VideoPublishEditModel videoPublishEditModel) {
        List<SingleImageData> imageList;
        List<String> list;
        ArrayList<MvSourceItemInfo> arrayList;
        if (videoPublishEditModel.getOriginal() != 0) {
            return false;
        }
        if (videoPublishEditModel.isPhotoMvMode()) {
            MvCreateVideoData mvCreateVideoData = videoPublishEditModel.getMvCreateVideoData();
            if (mvCreateVideoData == null || (arrayList = mvCreateVideoData.sourceItemList) == null || arrayList.size() != 1) {
                return false;
            }
            return true;
        }
        if (videoPublishEditModel.getCanvasVideoData() != null) {
            CanvasVideoData canvasVideoData = videoPublishEditModel.getCanvasVideoData();
            if (canvasVideoData == null || (list = canvasVideoData.sourceInfo) == null || list.size() != 1) {
                return false;
            }
            return true;
        }
        if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
            ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
            if (imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null || imageList.size() != 1) {
                return false;
            }
            return true;
        }
        if (videoPublishEditModel.getPreviewInfo().getVideoList().size() != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJLIL(VideoPublishEditModel videoPublishEditModel) {
        if (u4.LJLL(videoPublishEditModel) && C1428560nHK.LIZ()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00f5 A[PHI: r4
      0x00f5: PHI (r4v8 java.lang.String) = (r4v7 java.lang.String), (r4v10 java.lang.String) binds: [B:25:0x00f2, B:16:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C0LAB LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r26, X.C1403560md0 r27) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1428520nHG.LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.0md0):X.0LAB");
    }

    public static final void LIZIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        Float fValueOf;
        String selectedFilterId = videoPublishEditModel.getSelectedFilterId();
        String str = "";
        if (selectedFilterId == null) {
            selectedFilterId = "";
        }
        c0lab.LJ("edit_filter_id", selectedFilterId);
        String selectedFilterLabel = videoPublishEditModel.getSelectedFilterLabel();
        if (selectedFilterLabel == null) {
            selectedFilterLabel = "";
        }
        c0lab.LJ("edit_filter_name", selectedFilterLabel);
        if (videoPublishEditModel.getSelectedFilterIntensity() < 0.0f) {
            fValueOf = "";
        } else {
            fValueOf = Float.valueOf(videoPublishEditModel.getSelectedFilterIntensity());
        }
        c0lab.LIZLLL(fValueOf, "edit_filter_value");
        String selectedFilterCategoryKey = videoPublishEditModel.getSelectedFilterCategoryKey();
        if (selectedFilterCategoryKey != null) {
            str = selectedFilterCategoryKey;
        }
        c0lab.LJ("edit_filter_tab", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[PHI: r0
      0x008a: PHI (r0v26 java.lang.String) = (r0v18 java.lang.String), (r0v28 java.lang.String) binds: [B:30:0x0087, B:10:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10, X.C0LAB r11) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1428520nHG.LJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.0LAB):void");
    }

    public static final boolean LJIILL(C1DRG c1drg, VideoPublishEditModel videoPublishEditModel) {
        if (((!C1416310mxZ.LJJJLIIL(videoPublishEditModel) && !C1428470nHB.LLIIIZ(videoPublishEditModel)) || (videoPublishEditModel.creativeModel.draftInfoModel.isDraft && videoPublishEditModel.mDraftToEditFrom != 8)) && !C1417160myw.LJIJJ(c1drg, videoPublishEditModel)) {
            if (videoPublishEditModel.isCurrentAutoCutMode() && !videoPublishEditModel.creativeModel.draftInfoModel.isDraft) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final int LJJLJLI(VideoPublishEditModel videoPublishEditModel, Boolean bool) {
        List<StickerItemModel> list;
        InfoStickerModel infoStickerModel = videoPublishEditModel.getInfoStickerModel();
        int size = 0;
        if (infoStickerModel != null && (list = infoStickerModel.stickers) != null) {
            ArrayList arrayList = new ArrayList();
            for (StickerItemModel stickerItemModel : list) {
                StickerItemModel stickerItemModel2 = stickerItemModel;
                if (Intrinsics.LJFF(stickerItemModel2.stickerSource, "2") || Intrinsics.LJFF(stickerItemModel2.stickerSource, "1")) {
                    if (bool == null || bool.booleanValue() == stickerItemModel2.isFromEditorPro()) {
                        if (!stickerItemModel2.isTextSticker()) {
                            arrayList.add(stickerItemModel);
                        }
                    }
                }
            }
            size = arrayList.size();
        }
        return size + C1466090oFr.LJIILIIL(videoPublishEditModel.creativeModel.stickerModel, bool);
    }

    public static final void LIZJ(NLEModel nLEModel, VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        List<NLETrack> listLIZ;
        if (nLEModel == null) {
            nLEModel = videoPublishEditModel.getNleModel();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (nLEModel != null && (listLIZ = C348520DlS.LIZ(nLEModel)) != null) {
            Iterator<NLETrack> it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                for (NLETrackSlot nLETrackSlot : it2.next().getSlots()) {
                    String extra = nLETrackSlot.getMainSegment().getExtra("nleExtraEffectKey");
                    if (extra != null) {
                        String extra2 = nLETrackSlot.getMainSegment().getExtra("nle_extra_effect_recommend_reason");
                        String str = "";
                        if (extra2 == null) {
                            extra2 = "";
                        }
                        linkedHashMap.put(extra, extra2);
                        String extra3 = nLETrackSlot.getMainSegment().getExtra("nle_extra_effect_recommend_rule_tags");
                        if (extra3 != null) {
                            str = extra3;
                        }
                        linkedHashMap2.put(extra, str);
                    }
                }
            }
        }
        c0lab.LIZLLL(linkedHashMap, "effect_panel_model_recall_type");
        c0lab.LIZLLL(linkedHashMap2, "effect_panel_model_recommend_tags");
    }

    public static final void LJFF(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab, boolean z) {
        String str;
        c0lab.LJ("tt_template_type", C1416310mxZ.LJJIJIIJI(videoPublishEditModel, null, z));
        c0lab.LJ("mv_id", C1416310mxZ.LJJIJ(videoPublishEditModel, z));
        c0lab.LJ("tt_template_id", C1416310mxZ.LJJIJ(videoPublishEditModel, z));
        if (!C1428470nHB.LLIIIZ(videoPublishEditModel) && !videoPublishEditModel.isCutSameVideoType() && !videoPublishEditModel.isMvThemeVideoType()) {
            str = "";
        } else {
            str = videoPublishEditModel.creativeModel.mvModel.templateName;
        }
        c0lab.LJ("mv_name", str);
        c0lab.LJ("ai_template_func_list", videoPublishEditModel.creativeModel.pugcTemplateData.aiTemplateFuncList);
    }

    public static final boolean LJIJJ(VideoPublishEditModel videoPublishEditModel, InterfaceC1444170ngV interfaceC1444170ngV, InterfaceC1455860nzM interfaceC1455860nzM) {
        if (!LJJZ(videoPublishEditModel) || !C306680C0k.LIZ()) {
            return false;
        }
        C1431780nMW.LIZ.getClass();
        if (((!C1431780nMW.LJI(videoPublishEditModel, interfaceC1444170ngV, interfaceC1455860nzM) && (!C573570MeZ.LIZ() || !C1428470nHB.LIZIZ(videoPublishEditModel))) || !videoPublishEditModel.hasMusic()) && ((!C1428470nHB.LJLIIL(videoPublishEditModel) || (C573570MeZ.LIZ() && C1428470nHB.LIZIZ(videoPublishEditModel))) && (!C1428470nHB.LJJJJJL(videoPublishEditModel.creativeModel) || !C0C64.LJIILLIIL().LJIIIZ(31744, "studio_save_local_image_with_aiself_watermark", true, false)))) {
            return false;
        }
        return true;
    }

    public static final String LJJII(VideoPublishEditModel videoPublishEditModel, C0MJ9 c0mj9, AutoCutThemeData autoCutThemeData) {
        int i;
        if (autoCutThemeData != null && autoCutThemeData.templateType == EnumC1412640mre.AUTO_PICK_TEMPLATE.getValue()) {
            String str = videoPublishEditModel.creativeModel.autoCutModel.clickFrom;
            if (str == null) {
                return "";
            }
            return str;
        }
        if (c0mj9 == null || ((i = C560220Ly8.LIZ[c0mj9.ordinal()]) != 1 && i != 2)) {
            String str2 = videoPublishEditModel.creativeModel.autoCutModel.clickFrom;
            if (str2 == null) {
                return "";
            }
            return str2;
        }
        return "edit_page_mix_material";
    }

    public static final Pair<String, Integer> LJJIIJZLJL(VideoPublishEditModel videoPublishEditModel, boolean z, Float f, boolean z2, int i) {
        boolean z3;
        String str;
        MultiEditVideoRecordData multiEditVideoRecordData;
        int i2;
        long j;
        MultiEditVideoRecordData multiEditVideoRecordData2;
        String str2;
        UploadCustomizeCoverInfo coverInfo;
        UploadCustomizeCoverInfo coverInfo2;
        boolean z4;
        String selectedFilterId;
        String str3;
        String str4;
        boolean zLIZ = C493401w4.LIZ();
        boolean z5 = true;
        int i3 = 0;
        if (zLIZ && z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        C0MH8.LIZ.getClass();
        String strLJI = C0MH8.LJI(videoPublishEditModel, i);
        String str5 = "";
        if (!videoPublishEditModel.creativeModel.streaksData.isStreaksPost() && !C1428470nHB.LLD(videoPublishEditModel.creativeModel)) {
            if (!videoPublishEditModel.isCurrentAutoCutMode() && videoPublishEditModel.creativeModel.editPostModel == null) {
                String str6 = null;
                if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
                    if (!C1428470nHB.LJJJJLL(videoPublishEditModel) || videoPublishEditModel.getTtStoryUploadModel() != null) {
                        return null;
                    }
                    videoPublishEditModel.generateVideoCoverPath(z3, i);
                    String videoCoverPath = videoPublishEditModel.getVideoCoverPath();
                    if (videoCoverPath == null) {
                        return null;
                    }
                    return new Pair<>(videoCoverPath, 0);
                }
                if (videoPublishEditModel.isMvThemeVideoType()) {
                    if (videoPublishEditModel.getMvCreateVideoData() != null) {
                        MvCreateVideoData mvCreateVideoData = videoPublishEditModel.getMvCreateVideoData();
                        if (mvCreateVideoData != null) {
                            str4 = mvCreateVideoData.videoCoverImgPath;
                        } else {
                            str4 = null;
                        }
                        if (TextUtils.isEmpty(str4) || z3) {
                            MvCreateVideoData mvCreateVideoData2 = videoPublishEditModel.getMvCreateVideoData();
                            if (mvCreateVideoData2 != null) {
                                if (!zLIZ) {
                                    strLJI = C1403010mc7.LIZ.LJIIIIZZ().LIZ().LJIIIIZZ(videoPublishEditModel.getCreativeInfo());
                                }
                                mvCreateVideoData2.videoCoverImgPath = strLJI;
                            }
                            MvCreateVideoData mvCreateVideoData3 = videoPublishEditModel.getMvCreateVideoData();
                            if (mvCreateVideoData3 != null) {
                                str6 = mvCreateVideoData3.videoCoverImgPath;
                            }
                            if (C295820Bie.LIZ()) {
                                videoPublishEditModel.setVideoCoverPath(str6);
                            }
                        }
                    }
                    MvCreateVideoData mvCreateVideoData4 = videoPublishEditModel.getMvCreateVideoData();
                    if (mvCreateVideoData4 != null && (str3 = mvCreateVideoData4.videoCoverImgPath) != null) {
                        str5 = str3;
                    }
                    MvCreateVideoData mvCreateVideoData5 = videoPublishEditModel.getMvCreateVideoData();
                    if (mvCreateVideoData5 != null) {
                        i3 = mvCreateVideoData5.videoCoverStartTime;
                    }
                    return new Pair<>(str5, Integer.valueOf(i3));
                }
                if (C1428470nHB.LLFF(videoPublishEditModel)) {
                    videoPublishEditModel.generateVideoCoverPath();
                    String videoCoverPath2 = videoPublishEditModel.getVideoCoverPath();
                    if (videoCoverPath2 == null) {
                        return null;
                    }
                    return new Pair<>(videoCoverPath2, Integer.valueOf((int) ((videoPublishEditModel.getVideoCoverStartTm() * LSPassThroughRecordSizeConfig.DEFAULT) + 500)));
                }
                if (videoPublishEditModel.isMultiVideoEdit()) {
                    if (!C0A1B.LIZ()) {
                        if (C295820Bie.LIZ() && !z && (((selectedFilterId = videoPublishEditModel.getSelectedFilterId()) != null && selectedFilterId.length() != 0 && !Intrinsics.LJFF(videoPublishEditModel.getSelectedFilterId(), CardStruct.IStatusCode.DEFAULT)) || videoPublishEditModel.hasStickers() || (!videoPublishEditModel.getEffectList().isEmpty()))) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("enableAsyncCover:");
                        sbLIZ.append(z4);
                        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
                        if (!z4 && !videoPublishEditModel.creativeModel.draftInfoModel.fromDraftPopup && !C1428470nHB.LJLIIIL(videoPublishEditModel) && videoPublishEditModel.getOriginal() != 2 && !videoPublishEditModel.getEditorProModel().isAdvancedEditDraft() && !videoPublishEditModel.getSoundSyncFromAnchor() && !C1428470nHB.LLIIJI(videoPublishEditModel) && !C1428470nHB.LLIIIZ(videoPublishEditModel) && !C1428470nHB.LJJL(videoPublishEditModel) && !C537970L7z.LJI(videoPublishEditModel.creativeModel.editorProSchemeModel) && !videoPublishEditModel.getAILivePhotoModel().LJII()) {
                            C548590LfN.LIZ.getClass();
                            if (!C548590LfN.LIZIZ().LJIIIIZZ(videoPublishEditModel.creativeModel) && videoPublishEditModel.creativeModel.videoImageSeparateSwitchModel == null) {
                                return null;
                            }
                        }
                    }
                    float videoCoverStartTm = videoPublishEditModel.getVideoCoverStartTm();
                    if (C298990Bnl.LIZ() && f != null) {
                        float fFloatValue = f.floatValue();
                        CoverPublishModel coverPublishModel = videoPublishEditModel.creativeModel.coverPublishModel;
                        if ((coverPublishModel == null || (coverInfo2 = coverPublishModel.getCoverInfo()) == null || coverInfo2.getCoverType() != 2) && f.floatValue() > 0.0f) {
                            CoverPublishModel coverPublishModel2 = videoPublishEditModel.creativeModel.coverPublishModel;
                            if (coverPublishModel2 != null && (coverInfo = coverPublishModel2.getCoverInfo()) != null) {
                                coverInfo.setCoverType(2);
                            }
                            videoPublishEditModel.creativeModel.postPageModel.videoCoverStartTm = fFloatValue;
                            videoCoverStartTm = fFloatValue;
                        }
                    }
                    MultiEditVideoStatusRecordData multiEditVideoRecordData3 = videoPublishEditModel.getMultiEditVideoRecordData();
                    if (multiEditVideoRecordData3 != null && ((str2 = multiEditVideoRecordData3.coverImagePath) == null || str2.length() == 0 || z3)) {
                        if (!zLIZ) {
                            strLJI = C383300F1c.LIZJ(videoPublishEditModel.getCreativeInfo());
                        }
                        multiEditVideoRecordData3.coverImagePath = strLJI;
                        if (C295820Bie.LIZ()) {
                            videoPublishEditModel.setVideoCoverPath(strLJI);
                        }
                    }
                    MultiEditVideoStatusRecordData multiEditVideoRecordData4 = videoPublishEditModel.getMultiEditVideoRecordData();
                    if (multiEditVideoRecordData4 != null && (multiEditVideoRecordData = multiEditVideoRecordData4.curMultiEditVideoRecordData) != null && (i2 = (int) multiEditVideoRecordData.endTime) > 0 && i2 < ((int) (LSPassThroughRecordSizeConfig.DEFAULT * videoCoverStartTm))) {
                        MultiEditVideoStatusRecordData multiEditVideoRecordData5 = videoPublishEditModel.getMultiEditVideoRecordData();
                        if (multiEditVideoRecordData5 != null && (multiEditVideoRecordData2 = multiEditVideoRecordData5.curMultiEditVideoRecordData) != null) {
                            j = multiEditVideoRecordData2.endTime;
                        } else {
                            j = 0;
                        }
                        videoPublishEditModel.setVideoCoverStartTm(j / 1000.0f);
                    }
                    MultiEditVideoStatusRecordData multiEditVideoRecordData6 = videoPublishEditModel.getMultiEditVideoRecordData();
                    if (multiEditVideoRecordData6 != null && (str = multiEditVideoRecordData6.coverImagePath) != null) {
                        str5 = str;
                    }
                    return new Pair<>(str5, Integer.valueOf((int) (videoCoverStartTm * LSPassThroughRecordSizeConfig.DEFAULT)));
                }
                if (videoPublishEditModel.getCanvasVideoData() == null) {
                    z5 = false;
                }
                if (z5 && !C1428470nHB.LJZ(videoPublishEditModel)) {
                    videoPublishEditModel.generateVideoCoverPath(z3, i);
                    String videoCoverPath3 = videoPublishEditModel.getVideoCoverPath();
                    if (videoCoverPath3 != null) {
                        return new Pair<>(videoCoverPath3, Integer.valueOf((int) (videoPublishEditModel.getVideoCoverStartTm() * LSPassThroughRecordSizeConfig.DEFAULT)));
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (videoPublishEditModel.isCutSameVideoType()) {
                    videoPublishEditModel.generateVideoCoverPath(z3, i);
                    String videoCoverPath4 = videoPublishEditModel.getVideoCoverPath();
                    if (videoCoverPath4 == null) {
                        return null;
                    }
                    return new Pair<>(videoCoverPath4, Integer.valueOf((int) (videoPublishEditModel.getVideoCoverStartTm() * LSPassThroughRecordSizeConfig.DEFAULT)));
                }
                C0CHQ.LIZ().getPublishService().LJIIJ();
                boolean zLIZLLL = C856570Xix.LIZLLL(videoPublishEditModel);
                if ((!C0A1B.LIZ() && !zLIZLLL && !C295820Bie.LIZ()) || z) {
                    return null;
                }
                videoPublishEditModel.generateVideoCoverPath(z3, i);
                String videoCoverPath5 = videoPublishEditModel.getVideoCoverPath();
                if (videoCoverPath5 != null) {
                    return new Pair<>(videoCoverPath5, Integer.valueOf((int) (videoPublishEditModel.getVideoCoverStartTm() * LSPassThroughRecordSizeConfig.DEFAULT)));
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            videoPublishEditModel.generateVideoCoverPath(z3, i);
            String videoCoverPath6 = videoPublishEditModel.getVideoCoverPath();
            if (videoCoverPath6 != null) {
                str5 = videoCoverPath6;
            }
            return new Pair<>(str5, Integer.valueOf((int) (videoPublishEditModel.getVideoCoverStartTm() * LSPassThroughRecordSizeConfig.DEFAULT)));
        }
        videoPublishEditModel.generateVideoCoverPath(z3, i);
        String videoCoverPath7 = videoPublishEditModel.getVideoCoverPath();
        if (videoCoverPath7 != null) {
            str5 = videoCoverPath7;
        }
        return new Pair<>(str5, Integer.valueOf((int) ((videoPublishEditModel.getVideoCoverStartTm() * LSPassThroughRecordSizeConfig.DEFAULT) + 500)));
    }
}
