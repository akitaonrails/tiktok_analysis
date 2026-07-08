package X;

import Y.AkS470S0100000_5;
import android.os.Bundle;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.aime.IAIMEServices;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra;
import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.aweme.creative.model.AISelfModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.InitialMobParams;
import com.ss.android.ugc.aweme.creative.model.RecordEffectModel;
import com.ss.android.ugc.aweme.creative.model.ReuseAwemeTTSAndVCRefIDsModel;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.TtsReuseModel;
import com.ss.android.ugc.aweme.feed.model.TtsVoiceInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mediachoose.helper.AlbumAigc;
import com.ss.android.ugc.aweme.mediachoose.helper.AlbumAigcAnchor;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.nows.experiment.AIGCPhotoGenerationOptimization;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import com.ss.android.ugc.aweme.property.BrightnessManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import com.ss.android.ugc.aweme.tools.ToolsBaseLightSensorUtils;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.gamora.editor.audioservice.service.texttospeach.l;
import com.ss.android.vesdk.LoudnessDetectResult;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEUtils;
import dtj.u7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0mbT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1402610mbT {
    public static final String LJIIL(VideoPublishEditModel videoPublishEditModel) {
        boolean zLJFF;
        CreativeModel creativeModel;
        ReuseAwemeTTSAndVCRefIDsModel reuseAwemeTTSAndVCRefIDsModel;
        CreativeModel creativeModel2;
        TtsVoiceInfo ttsVoiceInfo;
        List<TtsReuseModel> list;
        CreativeModel creativeModel3;
        ReuseAwemeTTSAndVCRefIDsModel reuseAwemeTTSAndVCRefIDsModel2;
        int i = 0;
        if (videoPublishEditModel != null && (creativeModel3 = videoPublishEditModel.creativeModel) != null && (reuseAwemeTTSAndVCRefIDsModel2 = creativeModel3.reuseAwemeTTSAndVCRefIDsModel) != null) {
            zLJFF = Intrinsics.LJFF(reuseAwemeTTSAndVCRefIDsModel2.originMusicRemoveTTS, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        ArrayList<String> arrayList = null;
        if (zLJFF) {
            if (l.LIZIZ()) {
                ArrayList arrayList2 = new ArrayList();
                if (videoPublishEditModel != null && (creativeModel2 = videoPublishEditModel.creativeModel) != null && (ttsVoiceInfo = creativeModel2.ttsVoiceInfo) != null && (list = ttsVoiceInfo.ttsReuseParams) != null) {
                    for (TtsReuseModel ttsReuseModel : list) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            String str = ttsReuseModel.voiceEffectId;
                            if (str != null) {
                                arrayList2.add(str);
                            }
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
                ReuseAwemeTTSAndVCRefIDsModel.Companion.getClass();
                return C1402640mbW.LIZIZ(arrayList2);
            }
            return "";
        }
        C1402640mbW c1402640mbW = ReuseAwemeTTSAndVCRefIDsModel.Companion;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (reuseAwemeTTSAndVCRefIDsModel = creativeModel.reuseAwemeTTSAndVCRefIDsModel) != null) {
            arrayList = reuseAwemeTTSAndVCRefIDsModel.curMusicTTSRedIDs;
        }
        c1402640mbW.getClass();
        return C1402640mbW.LIZIZ(arrayList);
    }

    public static final long LJIILJJIL(VideoPublishEditModel videoPublishEditModel) {
        List<EditVideoSegment> videoList;
        List<EditVideoSegment> videoList2;
        long end;
        long start;
        long duration = 0;
        if (videoPublishEditModel.isFastImport()) {
            EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
            if (previewInfo != null && (videoList2 = previewInfo.getVideoList()) != null) {
                long jMax = 0;
                for (EditVideoSegment editVideoSegment : videoList2) {
                    VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
                    if (videoCutInfo != null) {
                        end = videoCutInfo.getEnd();
                    } else {
                        end = 0;
                    }
                    VideoCutInfo videoCutInfo2 = editVideoSegment.getVideoCutInfo();
                    if (videoCutInfo2 != null) {
                        start = videoCutInfo2.getStart();
                    } else {
                        start = 0;
                    }
                    jMax += Math.max(0L, end - start);
                }
                return jMax;
            }
        } else {
            EditPreviewInfo previewInfo2 = videoPublishEditModel.getPreviewInfo();
            if (previewInfo2 != null && (videoList = previewInfo2.getVideoList()) != null) {
                Iterator<EditVideoSegment> it2 = videoList.iterator();
                while (it2.hasNext()) {
                    duration += it2.next().getVideoFileInfo().getDuration();
                }
            }
        }
        return duration;
    }

    public static final String LJIILL(VideoPublishEditModel videoPublishEditModel) {
        if (Intrinsics.LJFF(videoPublishEditModel.mShootWay, "sub_only_video_page")) {
            return "sub_only_video_page";
        }
        if (Intrinsics.LJFF(videoPublishEditModel.mShootWay, "story") && C1428470nHB.LLFII(videoPublishEditModel)) {
            return videoPublishEditModel.creativeModel.commonMobModel.shootEnterFrom;
        }
        if (Intrinsics.LJFF(videoPublishEditModel.mShootWay, "story")) {
            CommonMobParamModel commonMobParamModel = videoPublishEditModel.creativeModel.commonMobModel;
            if (commonMobParamModel.isUploadDirectEnter) {
                return commonMobParamModel.shootEnterFrom;
            }
        }
        if (videoPublishEditModel.getCreativeFlowData().getShootExtraData() != null) {
            ShootExtraData shootExtraData = videoPublishEditModel.getCreativeFlowData().getShootExtraData();
            if (shootExtraData != null) {
                return shootExtraData.getShootEnterFrom();
            }
            return null;
        }
        return videoPublishEditModel.getEnterFrom();
    }

    public static final boolean LJIILLIIL(VideoPublishEditModel videoPublishEditModel) {
        List<TextStickerModel> list = videoPublishEditModel.creativeModel.stickerModel.textStickerModels;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<TextStickerModel> it2 = list.iterator();
            while (it2.hasNext()) {
                if (C0F8Y.LJIIIIZZ(it2.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void LJIJ(VideoPublishEditModel videoPublishEditModel) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("prop_list", videoPublishEditModel.getStickers());
        c0lab.LJ("from_prop_id", videoPublishEditModel.fromPropId);
        if (videoPublishEditModel.getDraftId() != 0) {
            c0lab.LIZ(videoPublishEditModel.getDraftId(), "draft_id");
        }
        String newDraftId = videoPublishEditModel.getNewDraftId();
        if (newDraftId != null && !a0.LJJJIL(newDraftId)) {
            c0lab.LJ("new_draft_id", videoPublishEditModel.getNewDraftId());
        }
        if (videoPublishEditModel.mDraftToEditFrom == 0) {
            c0lab.LJ("draft_way", "general_draft_list");
        }
        C20684815ws.LJIILLIIL("click_draft_edit_cancel", c0lab.LIZ);
    }

    public static final void LJIL(VideoPublishEditModel videoPublishEditModel) {
        Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(videoPublishEditModel);
        int iIntValue = pairLJIIJJI.getFirst().intValue();
        int iIntValue2 = pairLJIIJJI.getSecond().intValue();
        C0LAB c0labLJIILIIL = C1403850mdT.LJIILIIL(videoPublishEditModel);
        c0labLJIILIIL.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0labLJIILIIL.LJ("enter_from", "video_edit_page");
        c0labLJIILIIL.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0labLJIILIIL.LJ("content_source", C1403060mcC.LIZ(videoPublishEditModel, "content_source"));
        c0labLJIILIIL.LJ("shoot_entrance", C1403060mcC.LIZ(videoPublishEditModel, "shoot_entrance"));
        c0labLJIILIIL.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0labLJIILIIL.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(videoPublishEditModel));
        c0labLJIILIIL.LIZ(iIntValue2, "pic_cnt");
        c0labLJIILIIL.LIZ(iIntValue, "video_cnt");
        c0labLJIILIIL.LIZIZ(System.currentTimeMillis(), "local_time_ms");
        c0labLJIILIIL.LIZ(C1403850mdT.LJIIIIZZ(videoPublishEditModel), "is_multi_content");
        c0labLJIILIIL.LJ("enter_type", u4.LJIJJLI(videoPublishEditModel));
        C20684815ws.LJIILLIIL("click_voice_modify", c0labLJIILIIL.LIZ);
    }

    public static final void LJJIIZ(VideoPublishEditModel videoPublishEditModel) {
        String str;
        C0LAB c0labLJIILIIL = C1403850mdT.LJIILIIL(videoPublishEditModel);
        c0labLJIILIIL.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0labLJIILIIL.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0labLJIILIIL.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0labLJIILIIL.LJ("shoot_way", videoPublishEditModel.mShootWay);
        if (videoPublishEditModel.creativeModel.commerceModel.getMusicContext().getInPromoteReplaceMusicScene()) {
            str = "promote";
        } else {
            str = "video_edit_page";
        }
        c0labLJIILIIL.LJ("enter_from", str);
        C20684815ws.LJIILLIIL("edit_volumn", c0labLJIILIIL.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0308  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJIJIIJIL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10) {
        /*
            Method dump skipped, instruction units count: 785
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1402610mbT.LJJIJIIJIL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):void");
    }

    public static final void LJJJ(VideoPublishEditModel videoPublishEditModel) {
        if (u7.LIZ()) {
            return;
        }
        C0LAB c0labLJIILIIL = C1403850mdT.LJIILIIL(videoPublishEditModel);
        c0labLJIILIIL.LJ(Scene.SCENE_SERVICE, "start_edit");
        c0labLJIILIIL.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0labLJIILIIL.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0labLJIILIIL.LJ("enter_from", "video_edit_page");
        C1699250uJv.LLILLL.getClass();
        c0labLJIILIIL.LIZIZ(0L, "dalvikPss");
        c0labLJIILIIL.LIZIZ(0L, "nativePss");
        c0labLJIILIIL.LIZIZ(0L, "otherPss");
        c0labLJIILIIL.LIZIZ(0L, "totalPss");
        C20684815ws.LJIILLIIL("av_memory_log", c0labLJIILIIL.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJJJIZL(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r13) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1402610mbT.LJJJJIZL(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext):void");
    }

    public static final C1403560md0 LJJJJJL(VideoPublishEditModel videoPublishEditModel) {
        C1403560md0 c1403560md0LIZIZ = C1403570md1.LIZIZ();
        c1403560md0LIZIZ.LJ("shoot_page", "video_shoot_page");
        c1403560md0LIZIZ.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(videoPublishEditModel));
        return c1403560md0LIZIZ;
    }

    public static final void LIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        String str;
        AIGCOfflineModel aIGCOfflineModel = videoPublishEditModel.creativeModel.aigcOfflineModel;
        if (aIGCOfflineModel.isOfflineAIGCEffectGenerated) {
            c0lab.LIZ(aIGCOfflineModel.isOfflineLoading, "is_offline_loading");
            c0lab.LJ("shoot_tab_name", aIGCOfflineModel.shootTabName);
            if (aIGCOfflineModel.isRegenerate) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("is_retry", str);
            c0lab.LJ("is_ai_prop", aIGCOfflineModel.isAiProp);
            c0lab.LJ("ai_prop_type", aIGCOfflineModel.aiPropType);
            c0lab.LJ("is_async", aIGCOfflineModel.isAsync);
            c0lab.LJ("sub_ai_prop_type", aIGCOfflineModel.subAiPropType);
            c0lab.LJ("ai_prop_model_name", aIGCOfflineModel.aiPropModelName);
            c0lab.LJ("is_default_prop", aIGCOfflineModel.isDefaultProp);
            c0lab.LJ("prop_trigger_type", aIGCOfflineModel.aigcInteractionType);
        }
    }

    public static final void LIZIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        List<AlbumAigc> listLIZLLL;
        int i;
        int i2;
        int i3;
        String propId;
        AlbumAigc albumAigc = null;
        if (videoPublishEditModel != null) {
            listLIZLLL = C1403470mcr.LIZLLL(videoPublishEditModel);
        } else {
            listLIZLLL = null;
        }
        int i4 = 1;
        if (listLIZLLL != null) {
            i = 0;
            i2 = 0;
            i3 = 0;
            for (AlbumAigc albumAigc2 : listLIZLLL) {
                Integer aiType = albumAigc2.getAiType();
                if (aiType != null && aiType.intValue() == 1) {
                    i3++;
                }
                Integer aiType2 = albumAigc2.getAiType();
                if (aiType2 != null && aiType2.intValue() == 2) {
                    i++;
                    if (albumAigc == null) {
                        albumAigc = albumAigc2;
                    }
                }
                Integer aiType3 = albumAigc2.getAiType();
                if (aiType3 != null && aiType3.intValue() == 3) {
                    i2++;
                }
            }
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        LIZJ(c0lab, i3, i, i2);
        if (i3 > 0) {
            c0lab.LIZ(2, "ai_livephoto_status");
        }
        if (i2 <= 0) {
            i4 = 0;
        }
        c0lab.LIZ(i4, "is_offline_loading");
        if (albumAigc != null) {
            AlbumAigcAnchor aigcAnchor = albumAigc.getAigcAnchor();
            if (aigcAnchor == null || (propId = aigcAnchor.getPropId()) == null) {
                propId = "";
            }
            c0lab.LJ("style_id", propId);
        }
    }

    public static final void LIZLLL(VideoPublishEditModel videoPublishEditModel, C1403560md0 c1403560md0) {
        String strLJIJ;
        IAIMEServices iAIMEServices;
        String str;
        AISelfModel aISelfModel = videoPublishEditModel.creativeModel.aiSelfModel;
        String str2 = aISelfModel.taskId;
        if (C573910Mf7.LIZ(videoPublishEditModel) || C123100dR.LIZ(str2)) {
            c1403560md0.LJ("enter_from", videoPublishEditModel.getEnterFrom());
        }
        int i = 0;
        if (C123100dR.LIZ(videoPublishEditModel.creativeModel.aiSelfModel.taskId) && ((str = videoPublishEditModel.creativeModel.aiSelfModel.styleId) == null || str.length() == 0)) {
            c1403560md0.LIZ(videoPublishEditModel.creativeModel.aiSelfModel.isUltraFastModelCreation ? 1 : 0, "is_style_loading");
        }
        if (C290460Ba0.LIZ()) {
            c1403560md0.LJ("aime_entrance", aISelfModel.aimeEntrance);
        }
        c1403560md0.LIZ(aISelfModel.isFromMainCover, "is_main_cover");
        c1403560md0.LJ("style_selected_from", aISelfModel.styleSelectedFrom);
        if (C123100dR.LIZ(videoPublishEditModel.creativeModel.aiSelfModel.styleId)) {
            String str3 = videoPublishEditModel.creativeModel.aiSelfModel.styleIconUri;
            if (str3 == null || str3.length() == 0) {
                i = 1;
            }
            c1403560md0.LIZ(i, "is_style_loading");
            if (i != 0) {
                if (C342770DcB.LIZ()) {
                    iAIMEServices = (IAIMEServices) PluggableExtentionKt.pluggableSpi$default(IAIMEServices.class, false, false, false, 14, null);
                } else {
                    iAIMEServices = (IAIMEServices) ServiceManager.get().getService(IAIMEServices.class);
                }
                if (iAIMEServices == null || (strLJIJ = iAIMEServices.LJIJ(aISelfModel.taskId)) == null) {
                    strLJIJ = aISelfModel.styleId;
                }
            } else {
                strLJIJ = aISelfModel.styleId;
            }
            c1403560md0.LJ("style_id", strLJIJ);
            c1403560md0.LJ("root_style_id", aISelfModel.styleParentId);
            c1403560md0.LIZ(aISelfModel.aiSelfIsFromAlbumAiTab, "ai_self_is_from_album_ai_tab");
            c1403560md0.LIZ(!Intrinsics.LJFF(aISelfModel.isChildStyle, Boolean.TRUE) ? 1 : 0, "is_default_prompt");
        } else {
            c1403560md0.LIZ(1, "is_default_prompt");
        }
        if (C123100dR.LIZ(aISelfModel.styleName)) {
            c1403560md0.LJ("enter_from", videoPublishEditModel.getEnterFrom());
            c1403560md0.LJ("aime_task_id", aISelfModel.taskId);
        }
    }

    public static final void LJ(C1403560md0 c1403560md0, AISelfModel aISelfModel) {
        String str;
        String str2 = aISelfModel.styleParentId;
        if (str2 != null) {
            c1403560md0.LJ("root_style_id", str2);
        }
        String str3 = aISelfModel.styleId;
        if (str3 != null) {
            c1403560md0.LJ("style_id", str3);
        }
        c1403560md0.LIZ(aISelfModel.aiSelfIsFromAlbumAiTab, "ai_self_is_from_album_ai_tab");
        if (C290460Ba0.LIZ() && (str = aISelfModel.aimeEntrance) != null) {
            c1403560md0.LJ("aime_entrance", str);
        }
        c1403560md0.LIZ(!Intrinsics.LJFF(aISelfModel.isChildStyle, Boolean.TRUE) ? 1 : 0, "is_default_prompt");
    }

    public static final void LJFF(VideoPublishEditModel videoPublishEditModel, C1403560md0 c1403560md0) {
        if (!videoPublishEditModel.isCurrentAutoCutMode()) {
            return;
        }
        AutoCutModel autoCutModel = videoPublishEditModel.creativeModel.autoCutModel;
        int iLIZLLL = C1403130mcJ.LIZLLL(autoCutModel.templateList, autoCutModel.curIndexFromSource, C1416110mxF.LJIIJJI(autoCutModel.curSource)) + 1;
        c1403560md0.LJ("autocut_click_from", C1428520nHG.LJJII(videoPublishEditModel, C1416110mxF.LJIIJJI(autoCutModel.curSource), null));
        c1403560md0.LIZ(autoCutModel.curGenerateType, "autocut_generate_type");
        c1403560md0.LIZ(autoCutModel.curTemplateType, "autocut_template_type");
        c1403560md0.LJ("autocut_template_id", autoCutModel.curTemplateId);
        c1403560md0.LJ("autocut_template_group_id", autoCutModel.curTemplateGroupId);
        C1412610mrb.LJFF(c1403560md0, Integer.valueOf(autoCutModel.curTemplateType), autoCutModel.curSceneType);
        c1403560md0.LIZ(!Intrinsics.LJFF("other", s.LJJIIJ(autoCutModel, null, null)) ? 1 : 0, "is_reuse_music");
        c1403560md0.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c1403560md0.LIZ(iLIZLLL, "autocut_template_ranks");
        if (videoPublishEditModel.isCurrentAutoCutMode()) {
            c1403560md0.LJ("tt_template_type", C1416310mxZ.LJJIJIIJI(videoPublishEditModel, null, true));
        }
    }

    public static final void LJI(VideoPublishEditModel videoPublishEditModel, C1403560md0 c1403560md0) {
        CanvasVideoData canvasVideoData;
        CanvasExtra canvasExtra;
        ForwardCanvasExtra forwardCanvasExtra;
        if (C1444940nhk.LJFF(videoPublishEditModel.getCanvasVideoData()) && (canvasVideoData = videoPublishEditModel.getCanvasVideoData()) != null && (canvasExtra = canvasVideoData.extra) != null && (forwardCanvasExtra = canvasExtra.forwardCanvasExtra) != null) {
            c1403560md0.LIZ(forwardCanvasExtra.forwardAwemeType, "repost_aweme_type");
            c1403560md0.LIZ(forwardCanvasExtra.isOwnVideo() ? 1 : 0, "is_own_video");
        }
    }

    public static final void LJII(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        boolean z;
        String second;
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        List<LyricStickerModel> list = creativeModel.stickerModel.lyricStickerModels;
        List<MusicBuzModel> listLIZIZ = C1429680nJ8.LIZIZ(creativeModel.musicBuzModel);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) listLIZIZ).iterator();
        while (true) {
            String musicId = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            MusicObject musicObject = ((MusicBuzModel) next).music;
            if (musicObject != null) {
                musicId = MusicBeanUtilKt.getMusicId(musicObject);
            }
            if (C123100dR.LIZ(musicId)) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (C1444810nhX.LIZJ((MusicBuzModel) it3.next())) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        int iLIZ = C308560C7q.LIZ(Boolean.valueOf(z));
        int iLIZ2 = C308560C7q.LIZ(Boolean.valueOf(C1466090oFr.LJIIIIZZ(list, true)));
        ArrayList arrayList2 = new ArrayList();
        Iterator<LyricStickerModel> it4 = list.iterator();
        while (it4.hasNext()) {
            Pair<String, String> pairLIZJ = C0FGD.LIZJ(it4.next().getLyricStyleUrs());
            if (pairLIZJ != null && (second = pairLIZJ.getSecond()) != null) {
                arrayList2.add(second);
            }
        }
        String str = (String) C13LP.LJJJLZIJ(0, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Iterator<LyricStickerModel> it5 = list.iterator();
        while (it5.hasNext()) {
            String selectedFrom = it5.next().getSelectedFrom();
            if (selectedFrom != null) {
                arrayList3.add(selectedFrom);
            }
        }
        String str2 = (String) C13LP.LJJJLZIJ(0, arrayList3);
        c0lab.LIZ(iLIZ, "music_lyrics_status");
        c0lab.LIZ(iLIZ2, "lyrics_sticker_status");
        if (C123100dR.LIZ(str2)) {
            c0lab.LJ("lyrics_sticker_selected_from", str2);
        }
        if (C123100dR.LIZ(str)) {
            c0lab.LJ("lyrics_sticker_resource_id", str);
        }
    }

    public static final void LJIIIIZZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        String str;
        C1402840mbq c1402840mbqLIZLLL = C1B46.LIZLLL(videoPublishEditModel);
        if (c1402840mbqLIZLLL != null) {
            c0lab.LJ("channel", c1402840mbqLIZLLL.mClientKey);
            c0lab.LJ("sdk_name", c1402840mbqLIZLLL.getSdkNameForServer());
            c0lab.LJ("sdk_version", c1402840mbqLIZLLL.mSdkVersion);
            String str2 = c1402840mbqLIZLLL.mClientKey;
            if (str2 != null && str2.length() != 0) {
                str = "sdk";
            } else {
                str = "system_share";
            }
            c0lab.LJ("launch_method", str);
            Map<String, String> map = c1402840mbqLIZLLL.extraET;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    c0lab.LJ(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public static final void LJIIIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        StickerInfo stickerInfo = videoPublishEditModel.stickerInfo;
        if (stickerInfo != null && stickerInfo.getStickerId() != 0) {
            String strValueOf = String.valueOf(stickerInfo.getStickerId());
            String recommendReason = stickerInfo.getRecommendReason();
            if (recommendReason == null) {
                recommendReason = "";
            }
            linkedHashMap.put(strValueOf, recommendReason);
            String strValueOf2 = String.valueOf(stickerInfo.getStickerId());
            String recommendRuleTags = stickerInfo.getRecommendRuleTags();
            if (recommendRuleTags == null) {
                recommendRuleTags = "";
            }
            linkedHashMap2.put(strValueOf2, recommendRuleTags);
        }
        for (TimeSpeedModelExtension timeSpeedModelExtension : videoPublishEditModel.getFinalVideoList()) {
            if (timeSpeedModelExtension != null) {
                StickerInfo stickerInfo2 = timeSpeedModelExtension.getStickerInfo();
                if (stickerInfo2 != null) {
                    String strValueOf3 = String.valueOf(timeSpeedModelExtension.getStickerInfo().getStickerId());
                    String recommendReason2 = stickerInfo2.getRecommendReason();
                    if (recommendReason2 == null) {
                        recommendReason2 = "";
                    }
                    linkedHashMap.put(strValueOf3, recommendReason2);
                }
                StickerInfo stickerInfo3 = timeSpeedModelExtension.getStickerInfo();
                if (stickerInfo3 != null) {
                    String strValueOf4 = String.valueOf(timeSpeedModelExtension.getStickerInfo().getStickerId());
                    String recommendRuleTags2 = stickerInfo3.getRecommendRuleTags();
                    if (recommendRuleTags2 == null) {
                        recommendRuleTags2 = "";
                    }
                    linkedHashMap2.put(strValueOf4, recommendRuleTags2);
                }
            }
        }
        c0lab.LIZLLL(linkedHashMap, "prop_panel_model_recall_type");
        c0lab.LIZLLL(linkedHashMap2, "prop_panel_model_recommend_tags");
    }

    public static final void LJIIJ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        List<String> list = videoPublishEditModel.creativeModel.editEffectModel.editingEffectSearchFrom;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            c0lab.LJ("editing_effect_search_from", C20485080t.LIZIZ(arrayList));
        }
        List<String> list2 = videoPublishEditModel.creativeModel.editEffectModel.searchId;
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : list2) {
            if (str2 != null) {
                arrayList2.add(str2);
            }
        }
        if (!arrayList2.isEmpty()) {
            c0lab.LJ("search_id", C20485080t.LIZIZ(arrayList2));
        }
        List<String> list3 = videoPublishEditModel.creativeModel.editEffectModel.searchKeyword;
        ArrayList arrayList3 = new ArrayList();
        for (String str3 : list3) {
            if (str3 != null) {
                arrayList3.add(str3);
            }
        }
        if (!arrayList3.isEmpty()) {
            c0lab.LJ("search_keyword", C20485080t.LIZIZ(arrayList3));
        }
        List<String> list4 = videoPublishEditModel.creativeModel.editEffectModel.searchResultId;
        ArrayList arrayList4 = new ArrayList();
        for (String str4 : list4) {
            if (str4 != null) {
                arrayList4.add(str4);
            }
        }
        if (!arrayList4.isEmpty()) {
            c0lab.LJ("search_result_id", C20485080t.LIZIZ(arrayList4));
        }
        List<String> list5 = videoPublishEditModel.creativeModel.editEffectModel.searchUniversalRank;
        ArrayList arrayList5 = new ArrayList();
        for (String str5 : list5) {
            if (str5 != null) {
                arrayList5.add(str5);
            }
        }
        if (!arrayList5.isEmpty()) {
            c0lab.LJ("search_universal_rank", C20485080t.LIZIZ(arrayList5));
        }
        List<String> list6 = videoPublishEditModel.creativeModel.editEffectModel.creatorSearchInfo;
        ArrayList arrayList6 = new ArrayList();
        for (String str6 : list6) {
            if (str6 != null) {
                arrayList6.add(str6);
            }
        }
        if (!arrayList6.isEmpty()) {
            c0lab.LJ("creator_search_info", C20485080t.LIZIZ(arrayList6));
        }
        int i = videoPublishEditModel.creativeModel.editEffectModel.countSearchSession;
        if (i > 0) {
            c0lab.LIZ(i, "count_search_session");
        }
    }

    public static final void LJIIJJI(VideoPublishEditModel videoPublishEditModel, String str) {
        if (videoPublishEditModel == null) {
            return;
        }
        C0LAB c0labLJJI = u4.LJJI(videoPublishEditModel, 1, 4);
        c0labLJJI.LJ("action_type", str);
        C20684815ws.LJIILLIIL("click_captions_format_options_on_panel", c0labLJJI.LIZ);
    }

    public static final void LJIJI(VideoPublishEditModel videoPublishEditModel, boolean z) {
        String str;
        String str2;
        if (videoPublishEditModel.mDraftToEditFrom == 0) {
            str = "general_draft_list";
        } else {
            str = "shoot_page";
        }
        Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(videoPublishEditModel);
        int iIntValue = pairLJIIJJI.getFirst().intValue();
        int iIntValue2 = pairLJIIJJI.getSecond().intValue();
        C0LAB c0lab = new C0LAB();
        if (z) {
            str2 = "click";
        } else {
            str2 = "show";
        }
        c0lab.LJ("action", str2);
        c0lab.LJ("app_language", ((ISettingService) ServiceManager.get().getService(ISettingService.class)).getAppLanguage());
        c0lab.LJ("enter_way", "edit_page_subtitle_sidebar");
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LIZ(0, "is_editor_pro");
        c0lab.LJ("asr_model_lang", "auto_language");
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LIZ(videoPublishEditModel.getPreviewInfo().getPreviewVideoLength(), "creation_duration");
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("draft_way", str);
        c0lab.LIZ(iIntValue, "video_cnt");
        c0lab.LIZ(iIntValue2, "pic_cnt");
        C20684815ws.LJIILLIIL("auto_subtitle_entrance_popup", c0lab.LIZ);
    }

    public static final void LJIJJ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        String str;
        String str2;
        if (videoPublishEditModel.mDraftToEditFrom == 0) {
            str = "general_draft_list";
        } else {
            str = "shoot_page";
        }
        Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(videoPublishEditModel);
        int iIntValue = pairLJIIJJI.getFirst().intValue();
        int iIntValue2 = pairLJIIJJI.getSecond().intValue();
        C0LAB c0lab = new C0LAB();
        if (z) {
            str2 = "click";
        } else {
            str2 = "show";
        }
        c0lab.LJ("action", str2);
        c0lab.LJ("app_language", ((ISettingService) ServiceManager.get().getService(ISettingService.class)).getAppLanguage());
        c0lab.LJ("enter_way", "edit_page_subtitle_sidebar");
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LIZ(0, "is_editor_pro");
        c0lab.LJ("asr_model_lang", "auto_language");
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LIZ(videoPublishEditModel.getPreviewInfo().getPreviewVideoLength(), "creation_duration");
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("draft_way", str);
        c0lab.LIZ(iIntValue, "video_cnt");
        c0lab.LIZ(iIntValue2, "pic_cnt");
        C20684815ws.LJIILLIIL("show_captions_popup", c0lab.LIZ);
    }

    public static final void LJIJJLI(VideoPublishEditModel videoPublishEditModel, String str) {
        String str2;
        if (videoPublishEditModel.mDraftToEditFrom == 0) {
            str2 = "general_draft_list";
        } else {
            str2 = "shoot_page";
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LIZ(videoPublishEditModel.getDraftId(), "draft_id");
        c0lab.LJ("new_draft_id", videoPublishEditModel.getNewDraftId());
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("draft_way", str2);
        c0lab.LJ("click_choice", str);
        c0lab.LIZ(videoPublishEditModel.isDefaultProp ? 1 : 0, "is_default_prop");
        c0lab.LJ("prop_list", videoPublishEditModel.getStickers());
        c0lab.LJ("from_prop_id", videoPublishEditModel.fromPropId);
        C20684815ws.LJIILLIIL("click_draft_edit_answer_sheet", c0lab.LIZ);
    }

    public static final void LJJJJJ(long j, boolean z) {
        String str;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(System.currentTimeMillis() - j, "duration");
        if (z) {
            str = "image";
        } else {
            str = "video";
        }
        c0lab.LJ("to_page", str);
        C20684815ws.LJIILLIIL("tool_performance_switch_image_video_first_frame", c0lab.LIZ);
    }

    public static final void LJJI(VideoPublishEditModel videoPublishEditModel, boolean z, boolean z2) {
        String str;
        int i;
        String str2;
        Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(videoPublishEditModel);
        int iIntValue = pairLJIIJJI.getFirst().intValue();
        int iIntValue2 = pairLJIIJJI.getSecond().intValue();
        C0LAB c0labLJIILIIL = C1403850mdT.LJIILIIL(videoPublishEditModel);
        c0labLJIILIIL.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0labLJIILIIL.LJ("shoot_way", videoPublishEditModel.mShootWay);
        if (videoPublishEditModel.getOriginal() == 0) {
            str = "upload";
        } else {
            str = "shoot";
        }
        c0labLJIILIIL.LJ("content_source", str);
        c0labLJIILIIL.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(videoPublishEditModel));
        c0labLJIILIIL.LIZ(iIntValue2, "pic_cnt");
        c0labLJIILIIL.LIZ(iIntValue, "video_cnt");
        c0labLJIILIIL.LIZ(C1403850mdT.LJIIIIZZ(videoPublishEditModel), "is_multi_content");
        c0labLJIILIIL.LJ("from_group_id", C1443560nfW.LJIIIIZZ());
        c0labLJIILIIL.LJ("enter_from", "video_edit_page");
        c0labLJIILIIL.LJ("effect_entrance_position", videoPublishEditModel.creativeModel.effectEntrancePosition);
        c0labLJIILIIL.LIZ(videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate ? 1 : 0, "is_from_create_template");
        if (videoPublishEditModel.getDraftId() != 0) {
            c0labLJIILIIL.LIZ(videoPublishEditModel.getDraftId(), "draft_id");
        }
        String newDraftId = videoPublishEditModel.getNewDraftId();
        if (newDraftId != null && newDraftId.length() != 0) {
            c0labLJIILIIL.LJ("new_draft_id", videoPublishEditModel.getNewDraftId());
        }
        if (z) {
            c0labLJIILIIL.LJ("is_red_dot", "1");
        } else {
            c0labLJIILIIL.LJ("is_red_dot", CardStruct.IStatusCode.DEFAULT);
        }
        c0labLJIILIIL.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0labLJIILIIL.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0labLJIILIIL.LIZ(0, "is_editor_pro");
        c0labLJIILIIL.LIZ(z2 ? 1 : 0, "is_multi_track");
        if (!C573570MeZ.LIZJ(videoPublishEditModel) && !C573570MeZ.LIZIZ(videoPublishEditModel)) {
            i = 0;
        } else {
            i = 1;
        }
        c0labLJIILIIL.LIZ(i, "is_pic_frame_single_pic_edit");
        InitialMobParams initialMobParams = videoPublishEditModel.creativeModel.initialModel.mobParams;
        if (initialMobParams != null && (str2 = initialMobParams.enterType) != null && str2.length() != 0) {
            c0labLJIILIIL.LJ("enter_type", str2);
        }
        String str3 = videoPublishEditModel.creativeModel.initialModel.dmCameraModel.enterDM;
        if (str3 != null && str3.length() != 0 && str3 != null) {
            c0labLJIILIIL.LJ("enter_dm", str3);
        }
        c0labLJIILIIL.LJ("edit_tab_entrance", C1403850mdT.LIZLLL(videoPublishEditModel));
        C0MJO.LIZIZ(videoPublishEditModel.creativeModel, c0labLJIILIIL);
        C1413430msv.LIZLLL(videoPublishEditModel, c0labLJIILIIL);
        c0labLJIILIIL.LJ("editorpro_click_from", videoPublishEditModel.getEditorProModel().getClickFrom());
        if (C573570MeZ.LIZJ(videoPublishEditModel) || C573570MeZ.LIZIZ(videoPublishEditModel)) {
            c0labLJIILIIL.LIZ(1, "pic_cnt");
            c0labLJIILIIL.LJ("content_type", "multi_photo");
        }
        int i2 = videoPublishEditModel.creativeModel.imageEditModel.livePicCnt;
        if (i2 > 0) {
            c0labLJIILIIL.LIZ(i2, "live_pic_cnt");
        }
        C1413430msv.LIZ(videoPublishEditModel, c0labLJIILIIL);
        C20684815ws.LJIILLIIL("click_effect_entrance", c0labLJIILIIL.LIZ);
    }

    public static final void LJJIII(VideoPublishEditModel videoPublishEditModel, String str, String str2) {
        C0LAB c0labLJIILIIL = C1403850mdT.LJIILIIL(videoPublishEditModel);
        c0labLJIILIIL.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0labLJIILIIL.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0labLJIILIIL.LJ("tab_name", str);
        c0labLJIILIIL.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0labLJIILIIL.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0labLJIILIIL.LJ("enter_from", "video_edit_page");
        c0labLJIILIIL.LJ("tab_key", str2);
        C20684815ws.LJIILLIIL("click_filter_tab", c0labLJIILIIL.LIZ);
    }

    public static final void LIZJ(C0LAB c0lab, int i, int i2, int i3) {
        c0lab.LIZ(i, "ai_alive_cnt");
        c0lab.LIZ(i2, "ai_self_cnt");
        if (i2 > 0) {
            c0lab.LIZ(0, "ai_self_is_from_album_ai_tab");
        }
        c0lab.LIZ(i3, "offline_effect_cnt");
        c0lab.LIZ(i + i2 + i3, "ai_image_tab_cnt");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0LAB] */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    public static final void LJIIZILJ(VideoPublishEditModel videoPublishEditModel, String str, String str2, boolean z) {
        String str3;
        boolean z2 = videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate;
        ?? LJIILIIL = C1403850mdT.LJIILIIL(videoPublishEditModel);
        if (videoPublishEditModel.creativeModel.commerceModel.getMusicContext().getInPromoteReplaceMusicScene()) {
            str3 = "promote";
        } else {
            str3 = "video_edit_page";
        }
        LJIILIIL.LJ("enter_from", str3);
        LJIILIIL.LJ("shoot_way", videoPublishEditModel.mShootWay);
        LJIILIIL.LIZ(z2 ? 1 : 0, "is_from_create_template");
        LJIILIIL.LJ("music_id", str);
        LJIILIIL.LIZ(1, "is_editor_pro");
        LJIILIIL.LIZ(videoPublishEditModel.getPreviewInfo().getPreviewVideoLength(), "creation_duration");
        LJIILIIL.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        LJIILIIL.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        LJIILIIL.LJ("creation_id", videoPublishEditModel.getCreationId());
        ?? r7 = z;
        if (C1416310mxZ.LJJJJLI(videoPublishEditModel)) {
            r7 = 0;
        }
        LJIILIIL.LIZ(r7, "is_multi_music");
        if (str2 != null) {
            LJIILIIL.LJ("promo_id", str2);
        }
        C20684815ws.LJIILLIIL("add_music", LJIILIIL.LIZ);
    }

    public static final void LJJIFFI(int i, VideoPublishEditModel videoPublishEditModel, String str, String str2) {
        if (videoPublishEditModel == null) {
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        C0LAB c0labLJJ = u4.LJJ(1, videoPublishEditModel, str2);
        c0labLJJ.LIZ(i, "caption_cnt");
        c0labLJJ.LJ("enter_method", str);
        C20684815ws.LJIILLIIL("click_remove_filler_words", c0labLJJ.LIZ);
    }

    public static void LJJII(VideoPublishEditModel videoPublishEditModel, String str, boolean z, int i) {
        Boolean bool;
        String str2;
        if ((i & 2) != 0) {
            bool = Boolean.FALSE;
        } else {
            bool = null;
        }
        if ((i & 4) != 0) {
            str = "edit_page";
        }
        int i2 = 0;
        if ((i & 8) != 0) {
            z = false;
        }
        C0LAB c0labLJIILIIL = C1403850mdT.LJIILIIL(videoPublishEditModel);
        c0labLJIILIIL.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0labLJIILIIL.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0labLJIILIIL.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0labLJIILIIL.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0labLJIILIIL.LJ("enter_from", "video_edit_page");
        c0labLJIILIIL.LJ("scene_id", "1004");
        c0labLJIILIIL.LIZ(C1403850mdT.LJIIIIZZ(videoPublishEditModel), "is_multi_content");
        c0labLJIILIIL.LJ("enter_dm", videoPublishEditModel.creativeModel.initialModel.dmCameraModel.enterDM);
        c0labLJIILIIL.LJ("enter_type", u4.LJIJJLI(videoPublishEditModel));
        c0labLJIILIIL.LIZ(Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0, "is_photo_editor");
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJIILIIL.LJ("is_editor_pro", str2);
        c0labLJIILIIL.LJ("enter_way", str);
        if (C573570MeZ.LIZJ(videoPublishEditModel) || C573570MeZ.LIZIZ(videoPublishEditModel)) {
            i2 = 1;
        }
        c0labLJIILIIL.LIZ(i2, "is_pic_frame_single_pic_edit");
        if (C573570MeZ.LIZJ(videoPublishEditModel) || C573570MeZ.LIZIZ(videoPublishEditModel)) {
            c0labLJIILIIL.LIZ(1, "pic_cnt");
            c0labLJIILIIL.LJ("content_type", "multi_photo");
        }
        c0labLJIILIIL.LJ("edit_tab_entrance", C1403850mdT.LIZLLL(videoPublishEditModel));
        c0labLJIILIIL.LJ("editorpro_click_from", videoPublishEditModel.getEditorProModel().getClickFrom());
        c0labLJIILIIL.LIZ(videoPublishEditModel.creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
        C0MJO.LIZIZ(videoPublishEditModel.creativeModel, c0labLJIILIIL);
        C1413430msv.LIZLLL(videoPublishEditModel, c0labLJIILIIL);
        C1413430msv.LIZIZ(videoPublishEditModel, c0labLJIILIIL);
        C1413430msv.LIZ(videoPublishEditModel, c0labLJIILIIL);
        C1413430msv.LJFF(videoPublishEditModel, c0labLJIILIIL);
        C580270MpN.LJIILIIL(videoPublishEditModel, c0labLJIILIIL, "click_modify_entrance");
        C572310McX.LJ(videoPublishEditModel, c0labLJIILIIL);
        c0labLJIILIIL.LIZ(videoPublishEditModel.creativeModel.photoModeEnterEditingStage.isFromMultiPhotoSpecialPage ? 1 : 0, "is_from_multi_photo_special_page");
        C20684815ws.LJIILLIIL("click_modify_entrance", c0labLJIILIIL.LIZ);
    }

    public static final void LJJIIZI(VideoPublishEditModel videoPublishEditModel, String str, String str2, String str3) {
        if (videoPublishEditModel == null) {
            return;
        }
        if (str3 == null) {
            str3 = "";
        }
        C0LAB c0labLJJ = u4.LJJ(1, videoPublishEditModel, str3);
        c0labLJJ.LJ("action", str);
        if (str2 != null) {
            c0labLJJ.LJ("click", str2);
        }
        C20684815ws.LJIILLIIL("edit_captions_panel_action", c0labLJJ.LIZ);
    }

    public static final void LJJIJ(final VideoPublishEditModel videoPublishEditModel, final InterfaceC1446740nke interfaceC1446740nke, final InterfaceC1452170ntP interfaceC1452170ntP, final String str) {
        final C1403050mcB value = interfaceC1446740nke.Zu1().getValue();
        final C817403Hg c817403Hg = new C817403Hg();
        if (!C306640C0g.LIZ() && interfaceC1452170ntP != null) {
            c817403Hg.element = interfaceC1452170ntP.getPlayFps();
        }
        C11NZ.LJJJJZ(videoPublishEditModel).LJJJLZIJ(C11S5.LIZ()).LJJJJZI(new AkS470S0100000_5(videoPublishEditModel, 0)).LJJLJLI(new C09JN() { // from class: X.0mcA
            @Override // X.C09JN
            public final void accept(Object obj) {
                boolean z;
                Object objValueOf;
                String str2;
                int i;
                int i2;
                int i3;
                Object objValueOf2;
                int i4;
                Object objValueOf3;
                InterfaceC1452170ntP interfaceC1452170ntP2;
                C1C7U.LIZ("VideoEditPageMobHelper@57c4.mobEditPreview$3");
                AbstractC19852312lt abstractC19852312lt = (AbstractC19852312lt) obj;
                if (C306640C0g.LIZ() && (interfaceC1452170ntP2 = interfaceC1452170ntP) != null) {
                    c817403Hg.element = interfaceC1452170ntP2.getPlayFps();
                }
                VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                InterfaceC1455860nzM interfaceC1455860nzM = interfaceC1446740nke;
                float f = c817403Hg.element;
                String str3 = str;
                VEUtils.VEVideoFileInfo vEVideoFileInfo = (VEUtils.VEVideoFileInfo) abstractC19852312lt.orNull();
                C1403050mcB c1403050mcB = value;
                InterfaceC574340Mfo interfaceC574340MfoQD1 = interfaceC1455860nzM.QD1();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(interfaceC574340MfoQD1.getPreviewWidth());
                sbLIZ.append('*');
                sbLIZ.append(interfaceC574340MfoQD1.getPreviewHeight());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                ArrayList<EffectPointModel> effectList = videoPublishEditModel2.getEffectList();
                int i5 = 1;
                if ((effectList instanceof Collection) && effectList.isEmpty()) {
                    z = false;
                } else {
                    Iterator<EffectPointModel> it2 = effectList.iterator();
                    while (it2.hasNext()) {
                        if (it2.next().getIsNewEngineEffect().booleanValue()) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                }
                ICreativePerformanceMonitorService iCreativePerformanceMonitorServicePerformanceMonitorService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).performanceMonitorService();
                C0LAB c0labLJIILIIL = C1403850mdT.LJIILIIL(videoPublishEditModel2);
                if (vEVideoFileInfo != null) {
                    objValueOf = Float.valueOf(vEVideoFileInfo.floatFPS);
                } else {
                    objValueOf = 0;
                }
                c0labLJIILIIL.LIZLLL(objValueOf, "file_fps");
                c0labLJIILIIL.LJ("creation_id", videoPublishEditModel2.getCreationId());
                c0labLJIILIIL.LJ("shoot_way", videoPublishEditModel2.mShootWay);
                c0labLJIILIIL.LIZJ(Float.valueOf(f), "play_fps");
                c0labLJIILIIL.LJ("next_action", str3);
                c0labLJIILIIL.LIZ(C577760MlK.LIZ(videoPublishEditModel2), "beautify_used");
                c0labLJIILIIL.LIZ(1, "is_composer");
                if (C294160Bfy.LIZ()) {
                    c0labLJIILIIL.LJ("beautify_info", C1409940mnI.LJ(C1409940mnI.LIZIZ));
                }
                c0labLJIILIIL.LIZ(videoPublishEditModel2.isMusic(), "is_use_music");
                c0labLJIILIIL.LJ("preview_resolution", strLIZIZ);
                c0labLJIILIIL.LJ("duration", String.valueOf(C1402610mbT.LJIILJJIL(videoPublishEditModel2)));
                c0labLJIILIIL.LJ("creation_duration", String.valueOf(C1402610mbT.LJIILJJIL(videoPublishEditModel2)));
                c0labLJIILIIL.LJ("filter_id_list", VideoPublishEditModel.translateNullFilter(videoPublishEditModel2.getCurFilterIds()));
                String str4 = "1";
                if (AVSettingsWrapper.enableHardEncodeForRecord()) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                c0labLJIILIIL.LJ("is_hardcode", str2);
                c0labLJIILIIL.LIZ(AVSettingsWrapper.com_ss_android_ugc_aweme_property_AVSettingsWrapper_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getRecordQuality(), "video_quality");
                c0labLJIILIIL.LIZJ(Float.valueOf(AVSettingsWrapper.getRecordBitrate(videoPublishEditModel2)), "bitrate");
                if (vEVideoFileInfo != null) {
                    i = vEVideoFileInfo.bitrate;
                } else {
                    i = 0;
                }
                c0labLJIILIIL.LIZ(i, "file_bitrate");
                c0labLJIILIIL.LJ("resolution", videoPublishEditModel2.getVideoResolution());
                c0labLJIILIIL.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel2));
                c0labLJIILIIL.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel2));
                c0labLJIILIIL.LJ("prop_list", videoPublishEditModel2.getStickerID());
                c0labLJIILIIL.LIZ(videoPublishEditModel2.getEffectList().size(), "edit_effect_num");
                if (!z) {
                    str4 = CardStruct.IStatusCode.DEFAULT;
                }
                c0labLJIILIIL.LJ("is_use_CC_effect", str4);
                c0labLJIILIIL.LJ("cpu_rate", iCreativePerformanceMonitorServicePerformanceMonitorService.getCpuUsedRate());
                c0labLJIILIIL.LJ("memory_rate", iCreativePerformanceMonitorServicePerformanceMonitorService.getMemoryUsedRate());
                c0labLJIILIIL.LJ("prop_selected_from", videoPublishEditModel2.getPropSource());
                c0labLJIILIIL.LIZ(videoPublishEditModel2.getPreviewInfo().getPreviewVideoLength(), "source_duration");
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                if (vEVideoFileInfo != null) {
                    i2 = vEVideoFileInfo.width;
                } else {
                    i2 = 0;
                }
                sbLIZ2.append(i2);
                sbLIZ2.append('*');
                if (vEVideoFileInfo != null) {
                    i3 = vEVideoFileInfo.height;
                } else {
                    i3 = 0;
                }
                sbLIZ2.append(i3);
                c0labLJIILIIL.LJ("original_resolution", C2188811AlT.LIZIZ(sbLIZ2));
                int i6 = -1;
                if (c1403050mcB != null) {
                    objValueOf2 = Float.valueOf(c1403050mcB.LIZ);
                } else {
                    objValueOf2 = -1;
                }
                c0labLJIILIIL.LIZLLL(objValueOf2, "fps");
                if (c1403050mcB != null) {
                    i4 = c1403050mcB.LIZIZ;
                } else {
                    i4 = -1;
                }
                c0labLJIILIIL.LIZ(i4, "lag_count");
                if (c1403050mcB != null) {
                    objValueOf3 = Float.valueOf(c1403050mcB.LIZLLL);
                } else {
                    objValueOf3 = -1;
                }
                c0labLJIILIIL.LIZLLL(objValueOf3, "lag_total_duration");
                if (c1403050mcB != null) {
                    i6 = c1403050mcB.LIZJ;
                }
                c0labLJIILIIL.LIZ(i6, "serious_lag_count");
                c0labLJIILIIL.LIZ(C1428470nHB.LJJIL(videoPublishEditModel2), "source_is_hdr");
                c0labLJIILIIL.LIZJ(Float.valueOf(BrightnessManager.LIZLLL()), "brightness");
                c0labLJIILIIL.LIZJ(Float.valueOf(ToolsBaseLightSensorUtils.INSTANCE.getCurrentLightLevel()), "light_sensor_level");
                Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(videoPublishEditModel2);
                if (pairLJIIJJI.getFirst().intValue() + pairLJIIJJI.getSecond().intValue() <= 1) {
                    i5 = 0;
                }
                c0labLJIILIIL.LIZ(i5, "is_multi_content");
                C303380Buq.LIZ("tool_performance_edit_preview", c0labLJIILIIL.LIZ);
                C1C7U.LIZIZ("VideoEditPageMobHelper@57c4.mobEditPreview$3");
            }
        });
    }

    public static void LJJIZ(int i, VideoPublishEditModel videoPublishEditModel, String str, int i2) {
        VEUtils.VEVideoFileInfo videoFileInfo;
        if ((i2 & 8) != 0) {
            videoFileInfo = VEUtils.getVideoFileInfo(videoPublishEditModel.videoPath());
        } else {
            videoFileInfo = null;
        }
        if ((i2 & 32) != 0) {
            str = null;
        }
        C1403560md0 c1403560md0LJIILIIL = LJIILIIL(i, videoPublishEditModel, null, videoFileInfo, "click_back_button", Boolean.FALSE, "", false, null);
        if (C123100dR.LIZ(str)) {
            c1403560md0LJIILIIL.LJ("close_method", str);
            C20684815ws.LJIILLIIL("editor_pro_intro_closeup", c1403560md0LJIILIIL.LIZ);
        } else {
            C20684815ws.LJIILLIIL("editor_pro_intro_popup", c1403560md0LJIILIIL.LIZ);
        }
    }

    public static final void LJJJI(int i, VideoPublishEditModel videoPublishEditModel, String str, String str2) {
        String strLJL;
        if (videoPublishEditModel != null) {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("enter_from", "video_edit_page");
            c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
            c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
            c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
            c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
            c0lab.LJ("enter_method", str);
            c0lab.LIZ(i, "is_editor_pro");
            c0lab.LJ("app_language", C0CHQ.LIZ().LJJIJIIJIL());
            if (str2.length() == 0) {
                strLJL = C0CHQ.LIZ().LJJIJIIJIL();
            } else {
                strLJL = u4.LJL(str2);
            }
            c0lab.LJ("asr_model_lang", strLJL);
            C20684815ws.LJIILLIIL("preview_subtitle", c0lab.LIZ);
        }
    }

    public static final void LJJIJIIJI(int i, VideoPublishEditModel videoPublishEditModel, String str, String str2, String str3) {
        C0LAB c0labLJJ = u4.LJJ(i, videoPublishEditModel, str2);
        if (str3 == null) {
            str3 = "edit_page_subtitle_sidebar";
        }
        c0labLJJ.LJ("enter_way", str3);
        c0labLJJ.LJ("enter_method", str);
        C20684815ws.LJIILLIIL("enter_edit_subtitle", c0labLJJ.LIZ);
    }

    public static final void LJJJIL(VideoPublishEditModel videoPublishEditModel, boolean z, int i, String str, String str2) {
        C0LAB c0labLJJ = u4.LJJ(i, videoPublishEditModel, str);
        if (str2 == null) {
            str2 = "edit_page_subtitle_sidebar";
        }
        c0labLJJ.LJ("enter_way", str2);
        c0labLJJ.LIZ(z ? 1 : 0, "is_changed");
        C20684815ws.LJIILLIIL("save_edit_subtitle", c0labLJJ.LIZ);
    }

    public static void LJJ(VideoPublishEditModel videoPublishEditModel, int i, String str, String str2, String str3, int i2) {
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        if ((i2 & 16) != 0) {
            str3 = null;
        }
        C0LAB c0labLJJ = u4.LJJ(i, videoPublishEditModel, str);
        if (str2 == null) {
            str2 = "edit_page_subtitle_sidebar";
        }
        c0labLJJ.LJ("enter_way", str2);
        c0labLJJ.LJ("click_from", str3);
        C20684815ws.LJIILLIIL("click_change_create_caption_language", c0labLJJ.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x076f  */
    /* JADX WARN: Type inference failed for: r0v137, types: [com.ss.android.ugc.aweme.aigc.aiplayground.IAIPlaygroundMobService] */
    /* JADX WARN: Type inference failed for: r13v2, types: [com.ss.android.ugc.aweme.aikit.api.camera.ability.MobService] */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51, types: [int] */
    /* JADX WARN: Type inference failed for: r1v70 */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.0LAB, X.0md0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJIIJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r27, boolean r28, java.lang.String r29, java.lang.Integer r30, java.lang.Integer r31, java.lang.String r32) {
        /*
            Method dump skipped, instruction units count: 2530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1402610mbT.LJJIIJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, boolean, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0LAB] */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    public static void LJJIIJZLJL(VideoPublishEditModel videoPublishEditModel, String str, int i, String str2, String str3, boolean z, int i2) {
        String strLJL;
        boolean z2 = false;
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        if ((i2 & 32) != 0) {
            str3 = null;
        }
        ?? r9 = z;
        if ((i2 & 64) != 0) {
            r9 = 0;
        }
        if (i == 0) {
            z2 = videoPublishEditModel.creativeModel.stickerModel.captionItemBarVisible;
        }
        ?? LJIILIIL = C1403850mdT.LJIILIIL(videoPublishEditModel);
        LJIILIIL.LJ("enter_from", "video_edit_page");
        LJIILIIL.LJ("shoot_way", videoPublishEditModel.mShootWay);
        LJIILIIL.LJ("creation_id", videoPublishEditModel.getCreationId());
        LJIILIIL.LJ("enter_method", str);
        LJIILIIL.LJ("click_from", str3);
        LJIILIIL.LJ("is_from_pinned_captions", C0ML9.LJ(z2));
        LJIILIIL.LIZ(videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate ? 1 : 0, "is_from_create_template");
        LJIILIIL.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        LJIILIIL.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        LJIILIIL.LJ("enter_way", "edit_page_subtitle_sidebar");
        LJIILIIL.LIZ(C1403850mdT.LJIIIIZZ(videoPublishEditModel), "is_multi_content");
        LJIILIIL.LIZ(i, "is_editor_pro");
        LJIILIIL.LJ("app_language", C0CHQ.LIZ().LJJIJIIJIL());
        LJIILIIL.LIZ(u4.LJJIL(videoPublishEditModel) ? 1 : 0, "is_from_edit_tab");
        LJIILIIL.LIZ(u4.LJJIZ(videoPublishEditModel) ? 1 : 0, "is_from_edit_tab_captions");
        if (str2 == null) {
            strLJL = C0CHQ.LIZ().LJJIJIIJIL();
        } else {
            strLJL = u4.LJL(str2);
        }
        LJIILIIL.LJ("asr_model_lang", strLJL);
        LJIILIIL.LJ("edit_tab_entrance", C1403850mdT.LIZLLL(videoPublishEditModel));
        LJIILIIL.LJ("editorpro_click_from", videoPublishEditModel.getEditorProModel().getClickFrom());
        LJIILIIL.LJ("enter_type", u4.LJIJJLI(videoPublishEditModel));
        LJIILIIL.LIZ(C294870Bh7.LIZ(videoPublishEditModel) ? 1 : 0, "is_auto_language");
        LJIILIIL.LIZ(u4.LJJJJJ(videoPublishEditModel, i) ? 1 : 0, "is_remove_filler_words");
        LJIILIIL.LIZ(r9, "is_captions_added");
        C0MJO.LIZIZ(videoPublishEditModel.creativeModel, LJIILIIL);
        u4.LIZ(videoPublishEditModel.creativeModel, LJIILIIL);
        C20684815ws.LJIILLIIL("click_auto_subtitle", LJIILIIL.LIZ);
        if (z2) {
            LJIJI(videoPublishEditModel, true);
        }
    }

    public static final void LJJIJLIJ(final int i, final Bundle bundle, final VideoPublishEditModel videoPublishEditModel, final Boolean bool, final String str, final boolean z, final boolean z2) {
        C11NZ.LJJJJZ(videoPublishEditModel).LJJJLZIJ(C11S5.LIZ()).LJJJJZI(new AkS470S0100000_5(videoPublishEditModel, 1)).LJJLJLI(new C09JN() { // from class: X.0mfa
            @Override // X.C09JN
            public final void accept(Object obj) {
                String string;
                MultiEditVideoRecordData multiEditVideoRecordData;
                List<MultiEditVideoSegmentRecordData> list;
                C1C7U.LIZ("VideoEditPageMobHelper@57c4.mobEnterVideoEditPageInChildThread$2");
                AbstractC19852312lt abstractC19852312lt = (AbstractC19852312lt) obj;
                Bundle bundle2 = bundle;
                if (bundle2 == null || (string = bundle2.getString("enter_edit_page_method")) == null) {
                    string = "click_next_button";
                }
                if (AIGCPhotoGenerationOptimization.INSTANCE.isEnabled()) {
                    RecordEffectModel recordEffectModel = videoPublishEditModel.creativeModel.recordEffectModel;
                    String str2 = recordEffectModel.enterMethodFromEffect;
                    if (str2 != null) {
                        string = str2;
                    }
                    recordEffectModel.enterMethodFromEffect = string;
                }
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_enable_mob_loudness_and_bitrate", true, true)) {
                    VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    if (videoPublishEditModel2.isUploadVideo()) {
                        ArrayList<ImportVideoInfo> importInfoList = videoPublishEditModel2.getImportInfoList();
                        if (importInfoList != null) {
                            for (ImportVideoInfo importVideoInfo : importInfoList) {
                                String realImportPath = importVideoInfo.getRealImportPath();
                                if (realImportPath != null) {
                                    arrayList.add(realImportPath);
                                    arrayList2.add(0);
                                    arrayList3.add(Integer.valueOf((int) importVideoInfo.getDuration()));
                                }
                            }
                        }
                    } else {
                        MultiEditVideoStatusRecordData multiEditVideoRecordData2 = videoPublishEditModel2.getMultiEditVideoRecordData();
                        if (multiEditVideoRecordData2 != null && (multiEditVideoRecordData = multiEditVideoRecordData2.originMultiEditRecordData) != null && (list = multiEditVideoRecordData.segmentDataList) != null) {
                            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
                                String str3 = multiEditVideoSegmentRecordData.audioPath;
                                if (str3 != null) {
                                    arrayList.add(str3);
                                    arrayList2.add(0);
                                    arrayList3.add(Integer.valueOf((int) (multiEditVideoSegmentRecordData.audioLength / ((long) LSPassThroughRecordSizeConfig.DEFAULT))));
                                }
                            }
                        }
                    }
                    ArrayList<Integer> arrayList4 = new ArrayList<>();
                    LoudnessDetectResult[] loudnessDetectResultArrLJIILJJIL = VEEditor.LJIILJJIL((String[]) arrayList.toArray(new String[0]), C13LP.LLII(arrayList2), C13LP.LLII(arrayList3));
                    if (loudnessDetectResultArrLJIILJJIL != null) {
                        for (LoudnessDetectResult loudnessDetectResult : loudnessDetectResultArrLJIILJJIL) {
                            arrayList4.add(Integer.valueOf((int) loudnessDetectResult.avgLoudness));
                        }
                    }
                    videoPublishEditModel2.setSegmentLoudness(arrayList4);
                }
                C1402610mbT.LJJIJIL(i, videoPublishEditModel, bundle, (VEUtils.VEVideoFileInfo) abstractC19852312lt.orNull(), string, bool, str, false, z, null, z2, null);
                C1C7U.LIZIZ("VideoEditPageMobHelper@57c4.mobEnterVideoEditPageInChildThread$2");
            }
        });
    }

    public static final void LJJJJ(VideoPublishEditModel videoPublishEditModel, String str, String str2, String str3, String str4, float f, String str5) {
        String str6;
        C0LAB c0labLJIILIIL = C1403850mdT.LJIILIIL(videoPublishEditModel);
        c0labLJIILIIL.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0labLJIILIIL.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0labLJIILIIL.LJ("enter_method", str);
        if (Intrinsics.LJFF(str, "slide")) {
            str6 = "edit_page_slide";
        } else {
            str6 = "edit_page";
        }
        c0labLJIILIIL.LJ("enter_way", str6);
        c0labLJIILIIL.LIZ(0, "is_editor_pro");
        c0labLJIILIIL.LJ("enter_from", "video_edit_page");
        c0labLJIILIIL.LJ("filter_name", str2);
        c0labLJIILIIL.LJ("filter_id", str3);
        c0labLJIILIIL.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0labLJIILIIL.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0labLJIILIIL.LIZJ(Float.valueOf(f), "filter_value");
        c0labLJIILIIL.LIZ(!Intrinsics.LJFF(str, "slide") ? 1 : 0, "is_selected_from_entrance");
        c0labLJIILIIL.LJ("tab_name", str4);
        c0labLJIILIIL.LJ("tab_key", str5);
        if (videoPublishEditModel.getDraftId() != 0) {
            c0labLJIILIIL.LIZ(videoPublishEditModel.getDraftId(), "draft_id");
        }
        String newDraftId = videoPublishEditModel.getNewDraftId();
        if (newDraftId != null && newDraftId.length() != 0) {
            c0labLJIILIIL.LJ("new_draft_id", videoPublishEditModel.getNewDraftId());
        }
        C20684915wt.LJFF("select_filter", c0labLJIILIIL.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:396:0x09fb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1403560md0 LJIILIIL(int r30, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r31, android.os.Bundle r32, com.ss.android.vesdk.VEUtils.VEVideoFileInfo r33, java.lang.String r34, java.lang.Boolean r35, java.lang.String r36, boolean r37, java.lang.String r38) {
        /*
            Method dump skipped, instruction units count: 4023
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1402610mbT.LJIILIIL(int, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, android.os.Bundle, com.ss.android.vesdk.VEUtils$VEVideoFileInfo, java.lang.String, java.lang.Boolean, java.lang.String, boolean, java.lang.String):X.0md0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0446  */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0LAB, X.0md0] */
    /* JADX WARN: Type inference failed for: r10v5, types: [com.ss.android.ugc.aweme.aikit.api.camera.ability.MobService] */
    /* JADX WARN: Type inference failed for: r4v145 */
    /* JADX WARN: Type inference failed for: r4v90 */
    /* JADX WARN: Type inference failed for: r4v91, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJIJIL(int r75, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r76, android.os.Bundle r77, com.ss.android.vesdk.VEUtils.VEVideoFileInfo r78, java.lang.String r79, java.lang.Boolean r80, java.lang.String r81, boolean r82, boolean r83, java.lang.String r84, boolean r85, java.lang.String r86) {
        /*
            Method dump skipped, instruction units count: 2359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1402610mbT.LJJIJIL(int, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, android.os.Bundle, com.ss.android.vesdk.VEUtils$VEVideoFileInfo, java.lang.String, java.lang.Boolean, java.lang.String, boolean, boolean, java.lang.String, boolean, java.lang.String):void");
    }
}
