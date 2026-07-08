package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.common.PublishSettings;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.FilterModel;
import com.ss.android.ugc.aweme.creative.model.NLEInfoModel;
import com.ss.android.ugc.aweme.creative.model.common.LogPbBean;
import com.ss.android.ugc.aweme.creative.model.edit.EditEffectModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditStickerModel;
import com.ss.android.ugc.aweme.creative.model.edit.Text2ImageModel;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.live.LiveRecordModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.draft.model.DuetExtraInfo;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.textsticker.TextStickerChallenges;
import com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureExtractionService;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import rlf.a;

/* JADX INFO: renamed from: X.0nXu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1438840nXu extends C0L18 {
    public static final C1438840nXu LIZ = new C1438840nXu();

    public static void LIZ(AbstractC1438910nY1 abstractC1438910nY1) {
        Intent intent;
        Integer numValueOf;
        MultiEditVideoStatusRecordData multiEditVideoRecordData;
        AudioEffectParam veAudioEffectParam;
        List<AVChallenge> challenges;
        AudioEffectParam veAudioEffectParam2;
        List<AVChallenge> challenges2;
        Workspace workspace;
        if (abstractC1438910nY1 instanceof C1438930nY3) {
            C1438930nY3 c1438930nY3 = (C1438930nY3) abstractC1438910nY1;
            boolean z = c1438930nY3.LIZ;
            boolean z2 = c1438930nY3.LIZIZ;
            boolean z3 = c1438930nY3.LIZJ;
            Activity activity = c1438930nY3.LIZLLL;
            Intent intent2 = c1438930nY3.LJ;
            if (z) {
                C1660680tJi.LIZ().LJJI(activity, 1002, intent2);
                return;
            }
            if (z2) {
                C1660680tJi.LIZ().LJJI(activity, 8, intent2);
                return;
            } else {
                if (z3) {
                    C1660680tJi.LIZ().LJJI(activity, 12355, intent2);
                    return;
                }
                if (C2263008to.LIZ()) {
                    ((IMixEditingFeatureExtractionService) ServiceManager.get().getService(IMixEditingFeatureExtractionService.class)).LJIIL();
                }
                C1660680tJi.LIZ().LJIIJ(activity, intent2);
                return;
            }
        }
        if (abstractC1438910nY1 instanceof C1438940nY4) {
            C1438940nY4 c1438940nY4 = (C1438940nY4) abstractC1438910nY1;
            Activity activityRequireActivity = c1438940nY4.LIZ.requireActivity();
            VideoPublishEditModel videoPublishEditModel = c1438940nY4.LIZJ;
            Intent intent3 = c1438940nY4.LIZIZ;
            if (intent3.getIntExtra("restore", 0) == 1) {
                CreativeModel creativeModelLIZIZ = C0MUK.LIZIZ(intent3);
                Iterator it2 = ((ArrayList) C855640XhS.LIZ).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC855650XhT) it2.next()).LIZJ(creativeModelLIZIZ);
                }
                videoPublishEditModel.refreshOldFieldIfNeeded();
            }
            C1660680tJi.LIZ().LJJIFFI(activityRequireActivity, intent3);
            C1443030nef.LJII().LJ();
            if (!C0CHQ.LIZ().getAccountService().LIZ() && videoPublishEditModel.mIsFromDraft) {
                return;
            }
            AbstractC214814194y abstractC214814194yLIZ = C372650EjH.LIZ(c1438940nY4.LIZ);
            if (abstractC214814194yLIZ == null) {
                Activity activity2 = c1438940nY4.LIZ.mActivity;
                if (activity2 == null) {
                    return;
                }
                activity2.finish();
                return;
            }
            abstractC214814194yLIZ.finish();
            return;
        }
        if (abstractC1438910nY1 instanceof C1438980nY8) {
            C0CHQ.LIZ().LJIIJ().LJFF();
            C1438980nY8 c1438980nY8 = (C1438980nY8) abstractC1438910nY1;
            AbstractC214814194y abstractC214814194yLIZ2 = C372650EjH.LIZ(c1438980nY8.LIZ);
            C1402610mbT.LJJIJIIJIL(c1438980nY8.LIZIZ);
            if (abstractC214814194yLIZ2 == null) {
                Activity activity3 = c1438980nY8.LIZ.mActivity;
                if (activity3 == null) {
                    return;
                }
                activity3.finish();
                return;
            }
            VideoPublishEditModel videoPublishEditModel2 = c1438980nY8.LIZIZ;
            if (videoPublishEditModel2 != null && C1428470nHB.LLD(videoPublishEditModel2.creativeModel) && ((Boolean) C263420AUa.LIZ.getValue()).booleanValue()) {
                C0CNO.LIZLLL(0L, AFwS194S0000000_8.get$arr$(290));
                return;
            } else {
                abstractC214814194yLIZ2.finish();
                return;
            }
        }
        if (abstractC1438910nY1 instanceof C1438900nY0) {
            C1438900nY0 c1438900nY0 = (C1438900nY0) abstractC1438910nY1;
            Activity activity4 = c1438900nY0.LIZ;
            RetakeVideoContext retakeVideoContext = c1438900nY0.LIZIZ;
            VideoPublishEditModel videoPublishEditModel3 = c1438900nY0.LIZJ;
            boolean z4 = c1438900nY0.LIZLLL;
            NLEModel nLEModel = c1438900nY0.LJ;
            C19EG c19eg = (C19EG) activity4;
            C1449610npH.LIZ.getClass();
            RecordScene recordScene = new RecordScene();
            recordScene.musicPath(videoPublishEditModel3.getMMusicPath());
            recordScene.musicStart(videoPublishEditModel3.getMMusicStart());
            recordScene.videoSegment(videoPublishEditModel3.getVideoSegmentsDesc());
            recordScene.hardEncode(videoPublishEditModel3.getHardEncode());
            recordScene.mp4Path(videoPublishEditModel3.videoPath());
            recordScene.maxDuration(videoPublishEditModel3.getMaxDuration());
            C1443030nef.LJII().LJIIIIZZ = recordScene;
            if (!recordScene.isSegmentsNotValid() || ((C1428470nHB.LJLLI(videoPublishEditModel3) && videoPublishEditModel3.getOriginal() == 1) || (nLEModel != null && (C0EWZ.LIZ(nLEModel, videoPublishEditModel3.getEditorProModel()) || videoPublishEditModel3.creativeModel.nowsShootModel != null)))) {
                intent = new Intent();
                C1660680tJi.LIZ().LJIIJJI(c19eg, intent);
                CreativeModel creativeModel = videoPublishEditModel3.creativeModel;
                if (creativeModel != null) {
                    creativeModel.editEffectModel = new EditEffectModel(new ArrayList(), null, -1, false, "", false, false, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), 0);
                    creativeModel.nleInfoModel = new NLEInfoModel("", "", 0, null, true, null);
                    creativeModel.autoCutModel = new AutoCutModel(null, null, null, null, 0, 0, false, false, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, 0, null, false, null, 0, 0, null, false, false, null, null, -1, 7, null);
                    creativeModel.filterModel = new FilterModel(false, 0, null, null, null, null, -1.0f, null);
                    creativeModel.editStickerModel = new EditStickerModel(false, null, null, 0.0f, 0.0f, "", "", new TextStickerChallenges(new LinkedList()));
                    creativeModel.recordEffectModel.sharedARModel = null;
                    creativeModel.liveRecordModel = new LiveRecordModel(new ArrayList());
                }
                videoPublishEditModel3.refreshOldFieldIfNeeded();
                int shootMode = videoPublishEditModel3.getShootMode();
                boolean zIsPhotoMvMode = videoPublishEditModel3.isPhotoMvMode();
                CanvasVideoData canvasVideoData = videoPublishEditModel3.getCanvasVideoData();
                if (canvasVideoData != null) {
                    numValueOf = Integer.valueOf(canvasVideoData.canvasType);
                } else {
                    numValueOf = null;
                }
                if (videoPublishEditModel3.getShootMode() == 16 || videoPublishEditModel3.getShootMode() == 17) {
                    long j = retakeVideoContext.duration;
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    if (j <= timeUnit.toMillis(15L)) {
                        videoPublishEditModel3.setShootMode(10);
                    } else if (retakeVideoContext.duration <= timeUnit.toMillis(60L)) {
                        videoPublishEditModel3.setShootMode(11);
                    } else {
                        videoPublishEditModel3.setShootMode(14);
                    }
                    videoPublishEditModel3.setPhotoMvMode(false);
                    CanvasVideoData canvasVideoData2 = videoPublishEditModel3.getCanvasVideoData();
                    if (canvasVideoData2 != null) {
                        canvasVideoData2.setCanvasType(1);
                    }
                }
                C0MUK.LJIIIZ(intent, videoPublishEditModel3.creativeModel);
                videoPublishEditModel3.setShootMode(shootMode);
                videoPublishEditModel3.setPhotoMvMode(zIsPhotoMvMode);
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    CanvasVideoData canvasVideoData3 = videoPublishEditModel3.getCanvasVideoData();
                    if (canvasVideoData3 != null) {
                        canvasVideoData3.setCanvasType(iIntValue);
                    }
                }
                intent.putExtra("shoot_way", videoPublishEditModel3.mShootWay);
                C363500EMy.LIZ.getClass();
                C1438850nXv c1438850nXv = C363500EMy.LIZIZ;
                if (c1438850nXv != null) {
                    intent.putExtra("draft_to_edit_from", c1438850nXv.LIZ);
                }
                if (videoPublishEditModel3.getVeCherEffectParam() != null) {
                    intent.putExtra("extra_ve_cher_effect_param", (Parcelable) videoPublishEditModel3.getVeCherEffectParam());
                }
                if (videoPublishEditModel3.isReuseOriginalSound()) {
                    intent.putExtra("reuse_original_sound_id", videoPublishEditModel3.getReuseOriginalSoundId());
                    intent.putExtra("reuse_original_sound_length", videoPublishEditModel3.getReuseOriginalSoundLength());
                    intent.putExtra("reuse_original_sound_url", videoPublishEditModel3.getReuseOriginalSoundUrls());
                }
                intent.putExtra("restore", 3);
                C1438850nXv c1438850nXv2 = C363500EMy.LIZIZ;
                if (c1438850nXv2 != null && (workspace = c1438850nXv2.LJFF) != null) {
                    intent.putExtra("workspace", workspace);
                }
                intent.putExtra("translation_type", 3);
                intent.putExtra("video_edit_model", (Serializable) videoPublishEditModel3);
                intent.putExtra("path", videoPublishEditModel3.getMMusicPath());
                C1398110mUD.LIZ = "video_post_page";
                C537520L6g.LIZLLL(intent, videoPublishEditModel3.getCreativeInfo());
                intent.putExtra("fromDraft", videoPublishEditModel3.mIsFromDraft);
                videoPublishEditModel3.removeChallengeFromTitleAndStruct(new C1439740nZM(videoPublishEditModel3).LIZ().getStickerToChallenge().values());
                if (videoPublishEditModel3.getVeAudioEffectParam() != null && videoPublishEditModel3.getVeAudioEffectParam().getChallenge() != null) {
                    videoPublishEditModel3.removeAudioEffectChallengeFromTitleAndStruct(videoPublishEditModel3.getVeAudioEffectParam().getChallenge());
                }
                if (videoPublishEditModel3.getVeAudioEffectParam() != null && (veAudioEffectParam = videoPublishEditModel3.getVeAudioEffectParam()) != null && (challenges = veAudioEffectParam.getChallenges()) != null && (!challenges.isEmpty()) && (veAudioEffectParam2 = videoPublishEditModel3.getVeAudioEffectParam()) != null && (challenges2 = veAudioEffectParam2.getChallenges()) != null) {
                    Iterator<AVChallenge> it3 = challenges2.iterator();
                    while (it3.hasNext()) {
                        videoPublishEditModel3.removeAudioEffectChallengeFromTitleAndStruct(it3.next());
                    }
                }
                intent.putExtra("video_title", videoPublishEditModel3.getTitle());
                intent.putExtra("video_title_chain", videoPublishEditModel3.getChain());
                intent.putExtra("disable_delete_title_chain", videoPublishEditModel3.isDisableDeleteChain());
                intent.putExtra("struct_list", (Serializable) videoPublishEditModel3.getStructList());
                intent.putExtra("is_private", videoPublishEditModel3.isPrivate);
                intent.putExtra("comment_setting", videoPublishEditModel3.commentSetting);
                intent.putExtra("download_setting", videoPublishEditModel3.allowDownloadSetting);
                if (videoPublishEditModel3.isStitchMode()) {
                    intent.putExtra("stitch_params", (Parcelable) videoPublishEditModel3.getStitchParams());
                }
                if (videoPublishEditModel3.hasRetake() && (multiEditVideoRecordData = videoPublishEditModel3.getMultiEditVideoRecordData()) != null) {
                    C1449610npH.LIZ.getClass();
                    intent.putParcelableArrayListExtra("original_segments", multiEditVideoRecordData.originalSegments);
                    intent.putExtra("original_music_start", multiEditVideoRecordData.originalMusicStart);
                    intent.putExtra("retake_shoot_mode", 2);
                }
                intent.putExtra(DuetExtraInfo.class.getName(), (Parcelable) videoPublishEditModel3.getDraftDuetExtraInfo());
                intent.putExtra("extra_duet_layout", videoPublishEditModel3.getDuetLayout());
                intent.putExtra("duet_from", videoPublishEditModel3.getDuetFrom());
                intent.putExtra("music_origin", videoPublishEditModel3.getMusicOrigin());
            } else {
                if (C1428470nHB.LJLLI(videoPublishEditModel3)) {
                    C1449610npH.LIZ(2131858176, R.string.fte, c19eg, videoPublishEditModel3);
                } else {
                    C1449610npH.LIZ(2131858175, R.string.jz7, c19eg, videoPublishEditModel3);
                }
                intent = new Intent();
            }
            intent.putExtra("retake_video", retakeVideoContext);
            intent.putExtra("retake_shoot_mode", 1);
            if (z4) {
                intent.putExtra("extra_retake_from_advanced", true);
                intent.putExtra("extra_saa_scene_launch_mode", "STANDARD");
                intent.putExtra("extra_saa_scene_force_disable_translucent", true);
                intent.putExtra("extra_saa_scene_jump_disable_anim", true);
                intent.putExtra("extra_editor_pro_to_record_retake", true);
            }
            if (videoPublishEditModel3.mIsFromDraft && intent.getIntExtra("restore", 0) == 1) {
                CreativeModel creativeModelLIZIZ2 = C0MUK.LIZIZ(intent);
                Iterator it4 = ((ArrayList) C855640XhS.LIZ).iterator();
                while (it4.hasNext()) {
                    ((InterfaceC855650XhT) it4.next()).LIZJ(creativeModelLIZIZ2);
                }
                videoPublishEditModel3.refreshOldFieldIfNeeded();
            }
            if (intent.getLongExtra("extra_start_record_time", 0L) == 0) {
                intent.putExtra("extra_start_record_time", System.currentTimeMillis());
            }
            if (z4) {
                C1660680tJi.LIZ().LJJ(activity4, intent, 21112);
            } else {
                C1660680tJi.LIZ().LJIILLIIL(activity4, intent);
            }
            if (!videoPublishEditModel3.mIsFromDraft) {
                return;
            }
            C1443030nef.LJII().LJ();
            return;
        }
        if (abstractC1438910nY1 instanceof C1438950nY5) {
            C1438950nY5 c1438950nY5 = (C1438950nY5) abstractC1438910nY1;
            Activity activity5 = c1438950nY5.LIZ;
            Intent intent4 = new Intent();
            try {
                Bundle extras = c1438950nY5.LIZIZ.getExtras();
                if (extras != null) {
                    intent4.putExtras(extras);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            intent4.putExtra("extra_saa_scene_launch_mode", "STANDARD");
            intent4.putExtra("extra_saa_scene_force_disable_translucent", true);
            intent4.putExtra("extra_saa_scene_jump_disable_anim", true);
            intent4.putExtra("translation_type", 1);
            if (intent4.getLongExtra("extra_start_record_time", 0L) == 0) {
                intent4.putExtra("extra_start_record_time", System.currentTimeMillis());
            }
            C1660680tJi.LIZ().LJJ(activity5, intent4, c1438950nY5.LIZJ);
            return;
        }
        if (abstractC1438910nY1 instanceof C1438920nY2) {
            InterfaceC1439500nYy interfaceC1439500nYyLIZ = C1439210nYV.LIZ();
            interfaceC1439500nYyLIZ.LJII();
            interfaceC1439500nYyLIZ.LJI("after_click_publish", true);
            interfaceC1439500nYyLIZ.LJ(1);
            C1438920nY2 c1438920nY2 = (C1438920nY2) abstractC1438910nY1;
            VideoPublishEditModel videoPublishEditModel4 = c1438920nY2.LIZ;
            a.LIZ.LIZJ(videoPublishEditModel4, "publish");
            C1403010mc7.LIZ.LIZIZ().getClass();
            if (C1206004ni.LIZ(16) && !C1444940nhk.LIZLLL(videoPublishEditModel4.getCanvasVideoData()) && (LIZJ(videoPublishEditModel4) == 16 || !C1204804nW.LIZIZ)) {
                C1403010mc7.LIZ.LIZIZ();
                C568790MSn.LIZIZ(videoPublishEditModel4);
                c1438920nY2.LIZIZ.invoke(Boolean.TRUE, null, null);
                return;
            }
            C1403010mc7.LIZ.LIZIZ().LIZLLL(LIZJ(videoPublishEditModel4), videoPublishEditModel4, new AwS601S0100000_22(abstractC1438910nY1, (AbstractC1438910nY1<Object>) 326), new AwS601S0100000_22(abstractC1438910nY1, (AbstractC1438910nY1<Object>) 327));
            return;
        }
        if (abstractC1438910nY1 instanceof C1438990nY9) {
            C1438990nY9 c1438990nY9 = (C1438990nY9) abstractC1438910nY1;
            VideoPublishEditModel videoPublishEditModel5 = c1438990nY9.LIZIZ;
            a.LIZ.LIZJ(videoPublishEditModel5, "publish");
            C1403010mc7.LIZ.LIZIZ().getClass();
            C1403010mc7.LIZ.LIZIZ().LIZJ(c1438990nY9.LIZ, videoPublishEditModel5, new AwS601S0100000_22(abstractC1438910nY1, (AbstractC1438910nY1<Object>) 328), new AwS601S0100000_22(abstractC1438910nY1, (AbstractC1438910nY1<Object>) 329));
            return;
        }
        if (abstractC1438910nY1 instanceof C1438960nY6) {
            C0CHQ.LIZ().getPublishService().LJJJJI();
            C1438960nY6 c1438960nY6 = (C1438960nY6) abstractC1438910nY1;
            C0MY9.LIZJ(c1438960nY6.LIZLLL, c1438960nY6.LIZ, c1438960nY6.LIZIZ, c1438960nY6.LIZJ);
            return;
        }
        throw new C1954807lC();
    }

    public static int LIZJ(VideoPublishEditModel videoPublishEditModel) {
        C0MNH forwardTo;
        C0MN4 c0mn4;
        if (C1444940nhk.LIZLLL(videoPublishEditModel.getCanvasVideoData())) {
            C0MND c0mnd = videoPublishEditModel.creativeModel.commentForwardModel;
            if (c0mnd != null && (c0mn4 = c0mnd.LIZJ) != null) {
                forwardTo = c0mn4.getForwardTo();
            } else {
                forwardTo = null;
            }
            if (forwardTo == C0MNH.POST) {
                return 21;
            }
        }
        if (C1428470nHB.LJLJJI(videoPublishEditModel)) {
            return 18;
        }
        if (!videoPublishEditModel.creativeModel.onThisDayData.isPublishNormalFromOnThisDayPage()) {
            if (!videoPublishEditModel.creativeModel.onThisDayData.isPublishStoryFromOnThisDayPage()) {
                if ((u4.LJIIJ(videoPublishEditModel) || C1428520nHG.LJIIZILJ(videoPublishEditModel) || C1428520nHG.LJIILIIL(videoPublishEditModel)) && videoPublishEditModel.creativeModel.quickPostOnEditPageModel.LIZ) {
                    return 17;
                }
                return 16;
            }
            return 16;
        }
        return 17;
    }

    public static C1439820nZU LIZIZ(Bundle bundle, LifecycleOwner lifecycleOwner) {
        AVMusic aVMusicExtractAVMusic;
        String string;
        C1402840mbq c1402840mbq;
        String string2;
        int i;
        String imprId;
        new C1438570nXT("VEVideoPublishEditActivity");
        final VideoPublishEditModel videoPublishEditModelLJII = C1438570nXT.LJII(bundle, null);
        videoPublishEditModelLJII.creativeModel.imageEditModel.isVideoChildPageFromImage = bundle.getBoolean("switch_mode_hide_intermediate");
        videoPublishEditModelLJII.isPrivate = bundle.getInt("is_private", C1416310mxZ.LJJIIZI(videoPublishEditModelLJII));
        C0CHQ.LIZ().LJI().LJ();
        videoPublishEditModelLJII.setNewVersion(3);
        videoPublishEditModelLJII.setStickPointType(bundle.getInt("extra_stick_point_type", 0));
        boolean z = bundle.getBoolean("is_from_sys_share", false);
        int i2 = bundle.getInt("draft_to_edit_from", 0);
        videoPublishEditModelLJII.setDraftMusicIllegal(bundle.getBoolean("draft_music_legal_param", false));
        try {
            aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModelLJII.creativeModel.musicBuzModel);
            if (aVMusicExtractAVMusic == null && (aVMusicExtractAVMusic = new C15KP().apply((MusicModel) bundle.getSerializable("music_model"))) == null) {
                aVMusicExtractAVMusic = (AVMusic) bundle.getSerializable("aweme_music");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            aVMusicExtractAVMusic = null;
        }
        if (aVMusicExtractAVMusic != null) {
            if (aVMusicExtractAVMusic.getLogPb() != null) {
                LogPbBean logPb = aVMusicExtractAVMusic.getLogPb();
                if (logPb != null) {
                    imprId = logPb.getImprId();
                } else {
                    imprId = null;
                }
                videoPublishEditModelLJII.setMusicRequestId(imprId);
            }
            videoPublishEditModelLJII.setOriginalSound(aVMusicExtractAVMusic.isOriginalSound());
            if (C1403010mc7.LIZ.getMusicService().isMusicTypeLocal(aVMusicExtractAVMusic.getMusicType())) {
                i = 1;
            } else {
                i = aVMusicExtractAVMusic.musicType;
            }
            videoPublishEditModelLJII.setMMusicType(i);
            if (aVMusicExtractAVMusic.musicType == 2) {
                videoPublishEditModelLJII.setIsReuseOriginalSound(true);
                videoPublishEditModelLJII.setReuseOriginalSoundId(aVMusicExtractAVMusic.getMusicId());
                videoPublishEditModelLJII.setReuseOriginalSoundLength(aVMusicExtractAVMusic.getShootDuration());
                videoPublishEditModelLJII.setReuseOriginalSoundUrls(aVMusicExtractAVMusic.getReuseAudioPlayUrl());
            }
        }
        if (videoPublishEditModelLJII.getRecordMode() == 1 && !videoPublishEditModelLJII.mIsFromDraft) {
            videoPublishEditModelLJII.setMMusicPath(null);
        }
        videoPublishEditModelLJII.setStickPointType(bundle.getInt("extra_stick_point_type", 0));
        if (C527780Kmu.LIZ && ((string2 = bundle.getString("extra_festival_external_challenge_id")) == null || string2.length() == 0)) {
            string = videoPublishEditModelLJII.creativeModel.aiSelfModel.challengeId;
            if (string == null) {
                string = "";
            }
        } else {
            string = bundle.getString("extra_festival_external_challenge_id");
        }
        if (!TextUtils.isEmpty(string)) {
            new C1645820svk(string, lifecycleOwner).LIZ(new InterfaceC1645830svl() { // from class: X.0nY7
                @Override // X.InterfaceC1645830svl
                public final void LIZ(AVChallenge aVChallenge) {
                    if (aVChallenge != null) {
                        VideoPublishEditModel videoPublishEditModel = videoPublishEditModelLJII;
                        if (videoPublishEditModel.challenges == null) {
                            videoPublishEditModel.challenges = new ArrayList();
                        }
                        videoPublishEditModelLJII.challenges.add(aVChallenge);
                    }
                }
            });
        }
        CreativeModel creativeModel = videoPublishEditModelLJII.creativeModel;
        if (!creativeModel.draftInfoModel.isDraft) {
            creativeModel.mvModel.templateType = bundle.getInt("template_type", -1);
            videoPublishEditModelLJII.creativeModel.mvModel.templateName = bundle.getString("template_name");
            videoPublishEditModelLJII.creativeModel.mvModel.anchorName = bundle.getString("anchor_name");
            videoPublishEditModelLJII.creativeModel.mvModel.templateTags = bundle.getString("template_tags");
        }
        videoPublishEditModelLJII.setAlbumPreviewNextMethod(bundle.getString("upload_next_method", ""));
        AVMusic aVMusic = (AVMusic) bundle.getSerializable("extra_music_use_in_record_page_mv");
        if (aVMusic == null) {
            aVMusic = aVMusicExtractAVMusic;
        }
        Serializable serializable = bundle.getSerializable("extra_share_context");
        if (serializable instanceof C1402840mbq) {
            c1402840mbq = (C1402840mbq) serializable;
        } else {
            c1402840mbq = null;
        }
        if (c1402840mbq != null) {
            PublishSettings publishSettings = c1402840mbq.mPublishSettings;
            if (publishSettings != null) {
                C1416310mxZ.LIZIZ(videoPublishEditModelLJII, publishSettings);
                int iLJJIJLIJ = (C0CHQ.LIZ().getPublishService().LJJIJLIJ(bundle.getInt("creation_mode", 1)) - c1402840mbq.mAppName.length()) - 2;
                String title = videoPublishEditModelLJII.getTitle();
                if (title != null && title.length() > iLJJIJLIJ) {
                    C1416310mxZ.LJIL(videoPublishEditModelLJII, title.substring(0, iLJJIJLIJ));
                }
                String str = publishSettings.title;
                if (str != null && str.length() != 0) {
                    videoPublishEditModelLJII.setHeading(publishSettings.title);
                }
            }
            C1429890nJT mainBusinessContext = videoPublishEditModelLJII.getMainBusinessContext();
            if (mainBusinessContext != null) {
                mainBusinessContext.setShareContext(c1402840mbq);
            }
        }
        if (Intrinsics.LJFF(videoPublishEditModelLJII.mShootWay, "ttop_photo_share") || Intrinsics.LJFF(videoPublishEditModelLJII.mShootWay, "info_photo_boosted_feedback_h5") || C1428470nHB.LJLL(videoPublishEditModelLJII) || C1428470nHB.LJLJLLL(videoPublishEditModelLJII)) {
            String string3 = bundle.getString("photomode_desc");
            if (string3 != null && C123100dR.LIZ(string3)) {
                int iLJJIJLIJ2 = C0CHQ.LIZ().getPublishService().LJJIJLIJ(bundle.getInt("creation_mode", 1));
                if (string3.length() > iLJJIJLIJ2) {
                    string3 = string3.substring(0, iLJJIJLIJ2);
                }
                videoPublishEditModelLJII.creativeModel.postPageModel.captionModel.markupText = string3;
            }
            String string4 = bundle.getString("photomode_title");
            if (string4 != null && C123100dR.LIZ(string4)) {
                int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 50, "photo_mode_title_max_length", true);
                if (string4.length() > iLJIJ) {
                    string4 = string4.substring(0, iLJIJ);
                }
                videoPublishEditModelLJII.setHeading(string4);
            }
            Integer numValueOf = Integer.valueOf(bundle.getInt("photomode_cover", 0));
            if (numValueOf.intValue() >= 0) {
                int iIntValue = numValueOf.intValue();
                CoverPublishModel coverPublishModel = videoPublishEditModelLJII.getCoverPublishModel();
                if (coverPublishModel != null) {
                    coverPublishModel.setImageCurrentIndex(iIntValue);
                }
            }
            C1428520nHG.LJJIFFI(videoPublishEditModelLJII);
            C1428520nHG.LJJI(videoPublishEditModelLJII);
            String string5 = bundle.getString("open_platform_share_id");
            if (string5 != null && C123100dR.LIZ(string5)) {
                videoPublishEditModelLJII.setShareId(string5);
            }
            String string6 = bundle.getString("open_platform_key");
            if (string6 != null && C123100dR.LIZ(string6)) {
                videoPublishEditModelLJII.setClientId(string6);
            }
        }
        videoPublishEditModelLJII.creativeModel.musicBuzModel.needAddRecent = bundle.getBoolean("extra_need_add_recent", false);
        if (videoPublishEditModelLJII.isRetakeVideo()) {
            C363500EMy.LIZ.getClass();
        }
        String str2 = videoPublishEditModelLJII.creativeModel.text2ImageModel.curPathPage;
        if (str2.length() > 0) {
            Text2ImageModel text2ImageModel = videoPublishEditModelLJII.creativeModel.text2ImageModel;
            text2ImageModel.prevPathPage = str2;
            text2ImageModel.prevPathPageType = text2ImageModel.curPathPageType;
        }
        CreativeModel creativeModel2 = videoPublishEditModelLJII.creativeModel;
        creativeModel2.text2ImageModel.curPathPage = "video_edit_page";
        if (creativeModel2.tangramTempModel != null) {
            C1428520nHG.LJJIFFI(videoPublishEditModelLJII);
            C1428520nHG.LJJI(videoPublishEditModelLJII);
        }
        return new C1439820nZU(videoPublishEditModelLJII, z, i2, aVMusic, EnumC1438880nXy.NORMAL, 0);
    }
}
