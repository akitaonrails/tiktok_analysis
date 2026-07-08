package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.canvas.CanvasBackground;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.AISelfModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.creative.model.EffectDataTransport;
import com.ss.android.ugc.aweme.creative.model.LiveModel;
import com.ss.android.ugc.aweme.creative.model.MicDataModel;
import com.ss.android.ugc.aweme.creative.model.OnThisDayData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.filter.RecordFilterModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.record.CameraLayoutModel;
import com.ss.android.ugc.aweme.creative.model.stickers.MusicAndTimeModel;
import com.ss.android.ugc.aweme.creative.model.video2sticker.Video2StickerModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.CutSameEditData;
import com.ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.ss.android.ugc.aweme.draft.model.DuetExtraInfo;
import com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.EventStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameterKt;
import com.ss.android.ugc.aweme.shortvideo.model.DuetAndStitchRouterConfig;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.shortvideo.model.RecordSceneExtKt;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.AiMeStyleInfo;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.liveeventstory.LiveEventStoryStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.liveshare.LiveShareStickerModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: X.0nXT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1438570nXT {
    public C1438570nXT(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoPublishEditModelBridge; owner : ");
        sbLIZ.append(str);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final AwemeDraft LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        if (((Boolean) C0ACE.LIZ.getValue()).booleanValue()) {
            ConcurrentModificationException e = null;
            int i = 0;
            while (i < 3) {
                try {
                    return LJ(videoPublishEditModel.clone(), "");
                } catch (ConcurrentModificationException e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                    C0MAY c0may = C0MAY.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("convertToDraft");
                    sbLIZ.append(" safeRetry ConcurrentModificationException, retry ");
                    i++;
                    sbLIZ.append(i);
                    C201955140j.LJIJI(c0may, C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            if (e != null) {
                C0MAY c0may2 = C0MAY.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("convertToDraft");
                sbLIZ2.append(" safeRetry failed after ");
                sbLIZ2.append(3);
                sbLIZ2.append(" retries");
                C201955140j.LJIIJ(c0may2, C2188811AlT.LIZIZ(sbLIZ2), e);
                throw e;
            }
            throw new RuntimeException("safeRetryWithConcurrentModificationException with unknown error");
        }
        return LJ(videoPublishEditModel, "");
    }

    public static VideoPublishEditModel LJFF(Intent intent) {
        Bundle extras;
        try {
            extras = intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            extras = null;
        }
        return LJI(extras, null);
    }

    public static void LIZ(Intent intent, VideoPublishEditModel videoPublishEditModel) {
        MultiEditVideoStatusRecordData multiEditVideoRecordData = videoPublishEditModel.getMultiEditVideoRecordData();
        intent.putParcelableArrayListExtra("original_segments", multiEditVideoRecordData.originalSegments);
        intent.putExtra("original_music_start", multiEditVideoRecordData.originalMusicStart);
        intent.putExtra("retake_shoot_mode", 2);
        if (videoPublishEditModel.isStitchMode()) {
            intent.putExtra("stitch_params", (Parcelable) videoPublishEditModel.getStitchParams());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:241:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0893  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00f3 -> B:276:0x0129). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel LIZJ(com.ss.android.ugc.aweme.draft.model.AwemeDraft r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 2526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1438570nXT.LIZJ(com.ss.android.ugc.aweme.draft.model.AwemeDraft, boolean):com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x029c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.draft.model.AwemeDraft LJ(final com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r17, java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 1591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1438570nXT.LJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.lang.String):com.ss.android.ugc.aweme.draft.model.AwemeDraft");
    }

    public static VideoPublishEditModel LJI(Bundle bundle, VideoPublishEditModel videoPublishEditModel) {
        float f;
        float voiceVolume;
        boolean z;
        boolean z2;
        Integer num;
        CameraLayoutModel cameraLayoutModel;
        ArrayList<TimeSpeedModelExtension> arrayList;
        CameraLayoutModel cameraLayoutModel2;
        ArrayList<TimeSpeedModelExtension> arrayList2;
        String resourceId;
        String str;
        Aweme aweme;
        boolean z3;
        ArrayList<TimeSpeedModelExtension> arrayList3;
        EventStruct eventStruct;
        VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
        if (videoPublishEditModel2 == null) {
            videoPublishEditModel2 = new VideoPublishEditModel();
        }
        videoPublishEditModel2.creativeModel = C0MUK.LIZJ(bundle);
        if (bundle.containsKey("key_story_canvas_bg_color_start") && bundle.containsKey("key_story_canvas_bg_color_end")) {
            videoPublishEditModel2.creativeModel.editModel.storyCanvasBgColorFromAlbumStart = Integer.valueOf(bundle.getInt("key_story_canvas_bg_color_start", 0));
            videoPublishEditModel2.creativeModel.editModel.storyCanvasBgColorFromAlbumEnd = Integer.valueOf(bundle.getInt("key_story_canvas_bg_color_end", 0));
        }
        videoPublishEditModel2.refreshOldFieldIfNeeded();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_bundle_key_check", true, false)) {
            ArrayList<String> arrayList4 = new ArrayList();
            if (!arrayList4.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                for (String str2 : arrayList4) {
                    if (bundle.containsKey(str2)) {
                        arrayList5.add(str2);
                    }
                }
                if (!arrayList5.isEmpty()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("bundle contains forbidden keys: ");
                    sbLIZ.append(C13LP.LJJLIIIJ(arrayList5, ", ", null, null, 0, null, null, 62));
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
        videoPublishEditModel2.setCreativeInfo(C537520L6g.LIZIZ(bundle));
        videoPublishEditModel2.setAlbumPreviewNextMethod(bundle.getString("upload_next_method"));
        videoPublishEditModel2.setAvetParameter(AVETParameterKt.generateAVETParam(bundle));
        videoPublishEditModel2.setWorkspace((Workspace) bundle.getParcelable("workspace"));
        if (videoPublishEditModel2.getWorkspace() == null) {
            videoPublishEditModel2.setWorkspace(C14D2.LIZ(videoPublishEditModel2.getCreativeInfo()));
        }
        if (C297360Bl8.LIZ() && videoPublishEditModel2.getImageAlbumData() != null) {
            videoPublishEditModel2.creativeModel.isTextModeWhenInit = Boolean.valueOf(videoPublishEditModel2.getImageAlbumData().isTextModeWhenInit());
        }
        CreativeModel creativeModel = videoPublishEditModel2.creativeModel;
        OnThisDayData onThisDayData = creativeModel.onThisDayData;
        if (!C566780MKu.LIZ(creativeModel) || !onThisDayData.isFromOnThisDay() || videoPublishEditModel2.creativeModel.draftInfoModel.isDraft) {
            videoPublishEditModel2.setImageAlbumData(null);
        }
        videoPublishEditModel2.setEncodedAudioOutputFile(videoPublishEditModel2.getWorkspace().LIZJ().getPath());
        videoPublishEditModel2.setParallelUploadOutputFile(videoPublishEditModel2.getWorkspace().LIZLLL().getPath());
        videoPublishEditModel2.setCameraPosition(bundle.getInt("camera", 0));
        videoPublishEditModel2.setCameraIds(bundle.getString("extra_av_camera_ids"));
        if (videoPublishEditModel2.getWorkspace().getMusicPath() != null) {
            videoPublishEditModel2.setMMusicPath(videoPublishEditModel2.getWorkspace().getMusicPath());
            videoPublishEditModel2.setMMusicStart(bundle.getInt("music_start", 0));
            videoPublishEditModel2.setMMusicEnd(bundle.getInt("extra_music_end", 0));
        } else {
            videoPublishEditModel2.setMMusicPath(null);
            videoPublishEditModel2.setMMusicStart(0);
            videoPublishEditModel2.setMMusicEnd(0);
        }
        videoPublishEditModel2.setOutputFile(videoPublishEditModel2.getWorkspace().LJFF().getPath());
        if (bundle.getBoolean("enable_music_path_check", true) && videoPublishEditModel2.getMMusicPath() == null && !videoPublishEditModel2.isRetakeVideo()) {
            C1452640nuA.LJII(null, false, videoPublishEditModel2.creativeModel.musicBuzModel);
        }
        if (!videoPublishEditModel2.getFromCut()) {
            videoPublishEditModel2.setVideoSegmentsDesc(bundle.getString("video_segment"));
        }
        videoPublishEditModel2.setHardEncode(bundle.getInt("hard_encode", 0));
        videoPublishEditModel2.stickerInfo = (StickerInfo) bundle.getSerializable("sticker_info");
        videoPublishEditModel2.setRestoreType(bundle.getInt("restore", 0));
        videoPublishEditModel2.mShootWay = bundle.getString("shoot_way");
        if (videoPublishEditModel2.getEnterFrom() == null || "".equals(videoPublishEditModel2.getEnterFrom())) {
            videoPublishEditModel2.setEnterFrom(bundle.getString("enter_from", ""));
        }
        if (TextUtils.equals(videoPublishEditModel2.mShootWay, "chat_shoot")) {
            if (bundle.getInt("extra_dm_media_type", 3) == 2) {
                videoPublishEditModel2.creativeModel.dmMediaModel = new DMMediaModel(2, C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJJJLL(videoPublishEditModel2.getCreativeInfo()), "", "", false, false, false, videoPublishEditModel2.creativeModel.initialModel.dmCameraModel.groupShotData);
                videoPublishEditModel2.setOutputFile(videoPublishEditModel2.getWorkspace().LJFF().getPath());
            } else {
                videoPublishEditModel2.creativeModel.dmMediaModel = new DMMediaModel(3, "", "", C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJJJLL(videoPublishEditModel2.getCreativeInfo()), false, false, false, videoPublishEditModel2.creativeModel.initialModel.dmCameraModel.groupShotData);
            }
        }
        if (C1416310mxZ.LJJJJZI(videoPublishEditModel2)) {
            if (C1428470nHB.LJJZZI(videoPublishEditModel2)) {
                videoPublishEditModel2.setReplaceMusicModel(new C1438590nXV());
            } else {
                C1438590nXV c1438590nXV = new C1438590nXV();
                c1438590nXV.setVid(bundle.getString("video_id"));
                c1438590nXV.setCover(bundle.getString("video_cover"));
                c1438590nXV.setAudioVid(bundle.getString("voice_vid"));
                c1438590nXV.setStrippedAudioVid(bundle.getString("stripped_origin_audio_vid"));
                c1438590nXV.setMuteReason(bundle.getString("mute_reason"));
                if (!TextUtils.isEmpty(c1438590nXV.getStrippedAudioVid())) {
                    c1438590nXV.setAddedStrippedOriginSound(true);
                }
                videoPublishEditModel2.setReplaceMusicModel(c1438590nXV);
                c1438590nXV.setMuteType(Integer.valueOf(bundle.getInt("extra_muted_post_mute_type", 0)));
                c1438590nXV.setHasHumanVoice(bundle.getBoolean("extra_muted_post_has_human_voice", false));
                videoPublishEditModel2.getCreativeModel().musicBuzModel.musicMuteDetailUrl = bundle.getString("extra_mute_detail_url");
            }
            String string = bundle.getString(FollowStatusChangeMethod.PARAM_UID);
            if (!TextUtils.isEmpty(string)) {
                videoPublishEditModel2.getReplaceMusicModel().setAid(string);
            }
            String string2 = bundle.getString("music_id");
            if (!TextUtils.isEmpty(string2)) {
                videoPublishEditModel2.getReplaceMusicModel().setMid(string2);
            }
        }
        videoPublishEditModel2.setShootFrom(bundle.getString("shoot_from"));
        videoPublishEditModel2.mIsFromDraft = bundle.getBoolean("isFromDraft", false);
        videoPublishEditModel2.mDraftToEditFrom = bundle.getInt("draft_to_edit_from", -1);
        if (videoPublishEditModel2.mIsFromDraft) {
            videoPublishEditModel2.setVideoCanvasWidth(bundle.getInt("extra_video_canvas_width", 0));
            videoPublishEditModel2.setVideoCanvasHeight(bundle.getInt("extra_video_canvas_height", 0));
        }
        videoPublishEditModel2.generateVideoCoverPath();
        videoPublishEditModel2.setOrigin(bundle.getInt("origin", 0));
        Iterable iterable = (Iterable) bundle.getSerializable("challenge");
        if (iterable != null) {
            videoPublishEditModel2.challenges = C13LP.LJJJJLI(iterable);
        }
        videoPublishEditModel2.geofencingSetting = (List) bundle.getSerializable("geo_fencing");
        Serializable serializable = bundle.getSerializable("auto_selected_anchors");
        if (serializable != null && (videoPublishEditModel2.getCreativeFlowData().getAnchors() == null || videoPublishEditModel2.getCreativeFlowData().getAnchors().isEmpty())) {
            videoPublishEditModel2.getCreativeFlowData().setAnchors((List) serializable);
        }
        videoPublishEditModel2.mSyncPlatforms = bundle.getString("sync_platform");
        if (videoPublishEditModel2.getNewDraftId() == null) {
            videoPublishEditModel2.setNewDraftId("");
        }
        if (C1428470nHB.LJJZZI(videoPublishEditModel2)) {
            videoPublishEditModel2.setVideoLength(bundle.getInt("extra_video_length", videoPublishEditModel2.getVideoLength()));
            videoPublishEditModel2.setMCurMusicLength(videoPublishEditModel2.creativeModel.musicBuzModel.musicLength);
        }
        float f2 = 1.0f;
        if (videoPublishEditModel2.hasOriginalSound()) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        videoPublishEditModel2.setVoiceVolume(f);
        if (videoPublishEditModel2.isMusic() <= 0) {
            f2 = 0.0f;
        }
        videoPublishEditModel2.setMusicVolume(f2);
        String string3 = bundle.getString("video_title");
        String string4 = bundle.getString("video_title_chain");
        videoPublishEditModel2.setTitle(string3);
        videoPublishEditModel2.setChain(string4);
        videoPublishEditModel2.setDisableDeleteChain(bundle.getBoolean("disable_delete_title_chain", false));
        videoPublishEditModel2.setStructList((List) bundle.getSerializable("struct_list"));
        C569390MUv.LIZ(bundle, new C1438680nXe(videoPublishEditModel2));
        if (videoPublishEditModel2.isMuted()) {
            voiceVolume = 0.0f;
        } else {
            voiceVolume = videoPublishEditModel2.getVoiceVolume();
        }
        videoPublishEditModel2.setVoiceVolume(voiceVolume);
        videoPublishEditModel2.setMusicOrigin(bundle.getString("music_origin"));
        if (videoPublishEditModel2.getMusicOrigin() == null && Objects.equals(videoPublishEditModel2.mShootWay, "profile_photo") && !C0L0Y.LIZ()) {
            videoPublishEditModel2.setMusicOrigin("profile_photo");
            videoPublishEditModel2.creativeModel.musicBuzModel.recommendSourceFrom = "ai_music";
        }
        videoPublishEditModel2.setSoundSyncFromAnchor(bundle.getBoolean("sound_sync_from_anchor", false));
        videoPublishEditModel2.creativeModel.editModel.enableSkipStickPointRes = bundle.getBoolean("skip_stick_point_res", false);
        videoPublishEditModel2.cutSameEditData = (CutSameEditData) bundle.getParcelable("cutsame_data");
        if (bundle.containsKey("extra_share_context")) {
            C1402840mbq c1402840mbq = (C1402840mbq) bundle.getSerializable("extra_share_context");
            C1429890nJT c1429890nJT = new C1429890nJT();
            c1429890nJT.setShareContext(c1402840mbq);
            videoPublishEditModel2.getCreativeFlowData().setExtraShareOptions(c1402840mbq.mExtraShareOptions);
            videoPublishEditModel2.setMainBusinessContext(c1429890nJT);
        }
        if (bundle.containsKey("extra_ar_text")) {
            videoPublishEditModel2.arTextList = bundle.getStringArrayList("extra_ar_text");
        }
        if (bundle.containsKey("extra_sticker_text")) {
            videoPublishEditModel2.messageBubbleTexts = bundle.getStringArrayList("extra_sticker_text");
        }
        if (bundle.containsKey("extra_draft_transform_model")) {
            videoPublishEditModel2.draftEditTransferModel = (DraftEditTransferModel) bundle.getParcelable("extra_draft_transform_model");
        }
        boolean zIsStitchMode = videoPublishEditModel2.isStitchMode();
        if (videoPublishEditModel2.getCanvasVideoData() != null) {
            z = true;
        } else {
            z = false;
        }
        if (videoPublishEditModel2.getMvCreateVideoData() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (videoPublishEditModel2.getMvCreateVideoData() != null) {
                if (videoPublishEditModel2.getMvCreateVideoData().mvType == 1) {
                    videoPublishEditModel2.setVideoEditorType(3);
                } else {
                    videoPublishEditModel2.setVideoEditorType(2);
                }
                videoPublishEditModel2.setTemplateId(videoPublishEditModel2.getMvCreateVideoData().mvId);
            }
        } else if (videoPublishEditModel2.isStickPointMode()) {
            videoPublishEditModel2.setVideoEditorType(4);
        } else if (zIsStitchMode) {
            videoPublishEditModel2.setVideoEditorType(7);
            if (videoPublishEditModel2.getStitchParams() != null && Float.compare(videoPublishEditModel2.getVideoCoverStartTm(), 0.0f) == 0 && ((EditVideoSegment) ListProtector.get(videoPublishEditModel2.getPreviewInfo().getVideoList(), 0)).getVideoFileInfo() != null) {
                videoPublishEditModel2.setVideoCoverStartTm((((EditVideoSegment) ListProtector.get(videoPublishEditModel2.getPreviewInfo().getVideoList(), 0)).getVideoFileInfo().getDuration() + 1) / 1000.0f);
            }
        } else if (C1428470nHB.LLFF(videoPublishEditModel2)) {
            videoPublishEditModel2.setVideoEditorType(14);
        } else if (C1428470nHB.LLII(videoPublishEditModel2)) {
            videoPublishEditModel2.setVideoEditorType(11);
        } else if (C1428470nHB.LJJJLZIJ(videoPublishEditModel2)) {
            videoPublishEditModel2.setVideoEditorType(10);
        } else if (videoPublishEditModel2.isMultiVideoEdit()) {
            videoPublishEditModel2.setVideoEditorType(6);
        } else if (z) {
            videoPublishEditModel2.setVideoEditorType(11);
        } else if (videoPublishEditModel2.isCutSameVideoType()) {
            videoPublishEditModel2.setVideoEditorType(13);
        } else {
            videoPublishEditModel2.setVideoEditorType(0);
        }
        if (bundle.containsKey("extra_ve_cher_effect_param")) {
            videoPublishEditModel2.setVeCherEffectParam((ClientCherEffectParam) bundle.getParcelable("extra_ve_cher_effect_param"));
        }
        if (bundle.containsKey("audio_record_param")) {
            videoPublishEditModel2.setVeAudioRecorderParam((AudioRecorderParam) bundle.getParcelable("audio_record_param"));
        }
        if (bundle.containsKey("live_room_struct_json") && ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q5()) {
            String string5 = bundle.getString("live_room_struct_json", "");
            if (!TextUtils.isEmpty(string5)) {
                String string6 = bundle.getString("room_id", "");
                String string7 = bundle.getString("anchor_name", "");
                C1438720nXi c1438720nXi = new C1438720nXi();
                c1438720nXi.LIZ = EnumC1466150oFx.LIVE_SHARE;
                LiveShareStickerModel liveShareStickerModel = new LiveShareStickerModel(c1438720nXi.LIZ(), string6, string7, (LiveRoomStruct) GsonProtectorUtils.fromJson(C05N6.LIZ().getGson(), string5, LiveRoomStruct.class));
                ArrayList arrayList6 = new ArrayList();
                arrayList6.add(liveShareStickerModel);
                videoPublishEditModel2.creativeModel.stickerModel.liveShareStickerModels = arrayList6;
                videoPublishEditModel2.setShootEnterMethod("click_share_live_to_Story");
            }
        }
        if (bundle.containsKey("live_event_struct") && (eventStruct = (EventStruct) bundle.getSerializable("live_event_struct")) != null) {
            C1438720nXi c1438720nXi2 = new C1438720nXi();
            c1438720nXi2.LIZ = EnumC1466150oFx.LIVE_EVENT_STORY;
            LiveEventStoryStickerModel liveEventStoryStickerModel = new LiveEventStoryStickerModel(c1438720nXi2.LIZ(), eventStruct.getTitle(), eventStruct.getStartTime(), Boolean.valueOf(eventStruct.getHasSubscribed()), CastLongProtector.parseLong(eventStruct.getId()), bundle.getString("live_event_story_bg_color"));
            ArrayList arrayList7 = new ArrayList();
            arrayList7.add(liveEventStoryStickerModel);
            videoPublishEditModel2.creativeModel.stickerModel.liveEventStoryStickerModel = arrayList7;
            videoPublishEditModel2.setCreationMode(3);
        }
        videoPublishEditModel2.allowDownloadSetting = bundle.getInt("download_setting", 0);
        videoPublishEditModel2.setUseMusicBeforeEdit(bundle.getBoolean("use_music_before_edit", false));
        videoPublishEditModel2.setReuseOriginalSoundId(bundle.getString("reuse_original_sound_id"));
        videoPublishEditModel2.setReuseOriginalSoundLength(bundle.getInt("reuse_original_sound_length", 0));
        videoPublishEditModel2.setReuseOriginalSoundUrls((UrlModel) bundle.getSerializable("reuse_original_sound_url"));
        if (!TextUtils.isEmpty(videoPublishEditModel2.getReuseOriginalSoundId())) {
            videoPublishEditModel2.setIsReuseOriginalSound(true);
        }
        videoPublishEditModel2.setDraftMusicIllegal(bundle.getBoolean("draft_music_legal_param", false));
        videoPublishEditModel2.fromPropId = bundle.getString("from_prop_id");
        videoPublishEditModel2.isDefaultProp = bundle.getBoolean("is_default_prop", false);
        if (bundle.containsKey("audio_enhance_param")) {
            videoPublishEditModel2.setAudioEnhanceParam((AudioEnhanceParam) bundle.getParcelable("audio_enhance_param"));
        }
        videoPublishEditModel2.setFromItemId(C1443560nfW.LJ);
        if (bundle.getSerializable("on_this_day_day") != null) {
            OnThisDayData onThisDayData2 = (OnThisDayData) bundle.getSerializable("on_this_day_day");
            videoPublishEditModel2.creativeModel.onThisDayData.setFromOnThisDay(onThisDayData2.isFromOnThisDay());
            videoPublishEditModel2.creativeModel.onThisDayData.setPastMemoryKey(onThisDayData2.getPastMemoryKey());
            videoPublishEditModel2.creativeModel.onThisDayData.setCreateTime(onThisDayData2.getCreateTime());
            videoPublishEditModel2.creativeModel.onThisDayData.setForwardType(onThisDayData2.getForwardType());
            videoPublishEditModel2.creativeModel.onThisDayData.setVersion(onThisDayData2.getVersion());
            onThisDayData.setLeftWay(onThisDayData2.getLeftWay());
            onThisDayData.setPostCnt(onThisDayData2.getPostCnt());
            onThisDayData.setStoryCnt(onThisDayData2.getStoryCnt());
            onThisDayData.setTextStyle(onThisDayData2.getTextStyle());
            onThisDayData.setPostDataList(onThisDayData2.getPostDataList());
            onThisDayData.setClickNextButtonTime(onThisDayData2.getClickNextButtonTime());
            onThisDayData.setCelebrationType(onThisDayData2.getCelebrationType());
        }
        if (bundle.getBoolean("extra_retake_from_advanced", false)) {
            videoPublishEditModel2.getEditorProModel().setAdvancedEditDraft(true);
            C363500EMy.LIZ.getClass();
        }
        if (bundle.containsKey("extra_retake_original_upload_page")) {
            videoPublishEditModel2.getEditorProModel().setOriginalUploadPage(Boolean.valueOf(bundle.getBoolean("extra_retake_original_upload_page", false)));
        }
        if (videoPublishEditModel2.isRetakeVideo()) {
            MultiEditVideoStatusRecordData multiEditVideoRecordData = videoPublishEditModel2.getMultiEditVideoRecordData();
            if (multiEditVideoRecordData != null && (arrayList3 = multiEditVideoRecordData.editSegments) != null) {
                Iterator<TimeSpeedModelExtension> it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (it2.next().getBackgroundVideo() != null) {
                        z3 = true;
                        break;
                    }
                }
                z3 = false;
                videoPublishEditModel2.setContainBackgroundVideo(z3);
            } else {
                z3 = false;
                videoPublishEditModel2.setContainBackgroundVideo(z3);
            }
        }
        if (bundle.getBoolean("video2sticker_mode", false)) {
            Video2StickerModel video2StickerModel = new Video2StickerModel();
            EnumC562490M4h enumC562490M4h = EnumC562490M4h.VIDEO2STICKER;
            int i = bundle.getInt("video2sticker_edit_mode", enumC562490M4h.ordinal());
            if (i == EnumC562490M4h.PHOTO2STICKER.ordinal()) {
                video2StickerModel.videoTimeTrimData.isSingleFrame = true;
            } else if (i == enumC562490M4h.ordinal() && (aweme = (Aweme) bundle.getSerializable("aweme")) != null) {
                video2StickerModel.originVideoInfo.awemeId = aweme.getAid();
                video2StickerModel.originVideoInfo.userId = AwemeExtKt.getAuthorUid(aweme);
                video2StickerModel.originVideoInfo.secUserId = AwemeExtKt.getSecAuthorUid(aweme);
                Video video = aweme.getVideo();
                if (video != null) {
                    video2StickerModel.originVideoInfo.coverTsp = (long) (video.getCoverTsp() * 1000.0d);
                }
            }
            video2StickerModel.originVideoInfo.filePath = bundle.getString("video_file_path");
            videoPublishEditModel2.creativeModel.video2StickerModel = video2StickerModel;
            videoPublishEditModel2.setCreationMode(4);
        }
        if (Objects.equals(videoPublishEditModel2.mShootWay, "change_ban_music")) {
            videoPublishEditModel2.creativeModel.privacySettingModel.isSubscribeOnly = bundle.getBoolean("is_sub_only_video", false);
        }
        videoPublishEditModel2.isPrivate = bundle.getInt("is_private", C1416310mxZ.LJJIIZI(videoPublishEditModel2));
        videoPublishEditModel2.commentSetting = bundle.getInt("comment_setting", C1439000nYA.LIZIZ(null));
        videoPublishEditModel2.reactDuetSetting = bundle.getInt("duet_setting", C1439000nYA.LIZLLL(videoPublishEditModel2, null));
        videoPublishEditModel2.stitchSetting = bundle.getInt("stitch_setting", C1439000nYA.LJI(videoPublishEditModel2, null));
        videoPublishEditModel2.creativeModel.privacySettingModel.allowCreateSticker = bundle.getInt("allow_sticker", C1439000nYA.LJFF(videoPublishEditModel2, null));
        videoPublishEditModel2.creativeModel.privacySettingModel.allowShareToStory = bundle.getInt("share_to_story", C1439000nYA.LJ(videoPublishEditModel2, null));
        MusicAndTimeModel musicAndTimeModel = videoPublishEditModel2.creativeModel.musicAndTimeModel;
        if (musicAndTimeModel != null) {
            musicAndTimeModel.slowMotionApplied = false;
        }
        boolean z4 = bundle.getBoolean("start_saa_with_single_top", false);
        boolean z5 = bundle.getBoolean("start_saa_from_live", false);
        String string8 = bundle.getString("live_shoot_page", null);
        if (z4 || z5 || string8 != null) {
            LiveModel liveModel = videoPublishEditModel2.creativeModel.liveModel;
            if (liveModel == null) {
                liveModel = new LiveModel();
            }
            liveModel.startSaaWithSingleTop = Boolean.valueOf(z4);
            liveModel.startFromLive = Boolean.valueOf(z5);
            liveModel.liveShootPage = string8;
            videoPublishEditModel2.creativeModel.liveModel = liveModel;
        }
        videoPublishEditModel2.creativeModel.privacySettingModel.contentReusePermission = bundle.getInt("content_reuse_permission", C1439000nYA.LIZJ(videoPublishEditModel2, null));
        videoPublishEditModel2.creativeModel.privacySettingModel.allowAIRemix = bundle.getInt("allow_ai_remix", C1439000nYA.LIZ(videoPublishEditModel2, null));
        if (!TextUtils.isEmpty(bundle.getString("ai_self_model_task_id"))) {
            C0MIX c0mix = C0MIX.LIZ;
            CreativeModel creativeModel2 = videoPublishEditModel2.creativeModel;
            c0mix.getClass();
            C0MIX.LIZ(bundle, creativeModel2, null);
        }
        if (C566080MIc.LIZ()) {
            videoPublishEditModel2.creativeModel.recordEffectModel.stickerID = C566140MIi.LIZ(videoPublishEditModel2);
            C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
            AISelfModel aISelfModel = videoPublishEditModel2.creativeModel.aiSelfModel;
            if (aISelfModel.anchorIconUri != null && (str = aISelfModel.styleResourceId) != null) {
                c13dvLIZIZ.add(str);
            }
            ArrayList<TimeSpeedModelExtension> finalVideoList = videoPublishEditModel2.getFinalVideoList();
            ArrayList arrayList8 = new ArrayList();
            Iterator<TimeSpeedModelExtension> it3 = finalVideoList.iterator();
            while (it3.hasNext()) {
                AiMeStyleInfo aiMeStyleInfo = it3.next().getAiMeStyleInfo();
                if (aiMeStyleInfo != null && (resourceId = aiMeStyleInfo.getResourceId()) != null) {
                    arrayList8.add(resourceId);
                }
            }
            c13dvLIZIZ.addAll(arrayList8);
            String strLJJLIIIJ = C13LP.LJJLIIIJ(C1697820uHc.LIZ(c13dvLIZIZ), ",", null, null, 0, null, null, 62);
            EffectDataTransport effectDataTransport = videoPublishEditModel2.creativeModel.effectData;
            String str3 = effectDataTransport.resourceIds;
            if (str3 != null && C041J.LIZ(str3)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(videoPublishEditModel2.creativeModel.effectData.resourceIds);
                sbLIZ2.append(',');
                sbLIZ2.append(strLJJLIIIJ);
                strLJJLIIIJ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            effectDataTransport.resourceIds = strLJJLIIIJ;
        }
        if (C1416310mxZ.LJJJI(videoPublishEditModel2)) {
            String str4 = videoPublishEditModel2.creativeModel.recordEffectModel.stickerID;
            if ((str4 == null || str4.length() == 0) && (cameraLayoutModel = videoPublishEditModel2.creativeModel.cameraLayoutModel) != null && (arrayList = cameraLayoutModel.captureSegments) != null && !arrayList.isEmpty()) {
                videoPublishEditModel2.creativeModel.recordEffectModel.stickerID = RecordScene.getStickerIdsByModel(arrayList);
            }
            String str5 = videoPublishEditModel2.creativeModel.recordFilterModel.recordFilterIds;
            if ((str5 == null || str5.length() == 0) && (cameraLayoutModel2 = videoPublishEditModel2.creativeModel.cameraLayoutModel) != null && (arrayList2 = cameraLayoutModel2.captureSegments) != null && !arrayList2.isEmpty()) {
                RecordFilterModel recordFilterModel = videoPublishEditModel2.creativeModel.recordFilterModel;
                recordFilterModel.recordFilterLabels = RecordScene.getFilterLabelsByModel(arrayList2);
                recordFilterModel.recordFilterIds = RecordScene.getFilterIdsByModel(arrayList2);
                recordFilterModel.recordFilterValues = RecordScene.getFilterValuesByModel(arrayList2);
                recordFilterModel.recordFilterCategoryKeys = RecordSceneExtKt.getFilterCategoryKeysByModel(arrayList2);
                recordFilterModel.recordFilterDefaultInfos = RecordSceneExtKt.getFilterDefaultInfoByModel(videoPublishEditModel2, arrayList2);
            }
        }
        if (C298380Bmm.LIZIZ && (num = videoPublishEditModel2.creativeModel.editModel.storyCanvasBgColorFromAlbumStart) != null) {
            int iIntValue = num.intValue();
            Integer num2 = videoPublishEditModel2.creativeModel.editModel.storyCanvasBgColorFromAlbumEnd;
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                CanvasVideoData canvasVideoData = videoPublishEditModel2.getCanvasVideoData();
                if (canvasVideoData != null) {
                    videoPublishEditModel2.setCanvasVideoData(canvasVideoData.copy(canvasVideoData.sourceInfo, canvasVideoData.auditFrames, C567420MNg.LIZIZ(CanvasBackground.Companion, iIntValue, iIntValue2), canvasVideoData.cropData, canvasVideoData.extra, canvasVideoData.canvasType, canvasVideoData.externalTracks, canvasVideoData.originVideoAIGCLabelType, canvasVideoData.nleClip, canvasVideoData.aigcInfo, canvasVideoData.newGreenScreenEffectModel, canvasVideoData.imageVideoSharedModel));
                }
            }
        }
        return videoPublishEditModel2;
    }

    public static VideoPublishEditModel LJII(Bundle bundle, VideoPublishEditModel videoPublishEditModel) {
        float f;
        boolean z;
        VideoPublishEditModel videoPublishEditModelLJI = LJI(bundle, videoPublishEditModel);
        videoPublishEditModelLJI.setMusicVolume(bundle.getFloat("music_volume", 1.0f));
        if (videoPublishEditModelLJI.isMuted()) {
            f = 0.0f;
        } else {
            f = bundle.getFloat("voice_volume", 1.0f);
        }
        videoPublishEditModelLJI.setVoiceVolume(f);
        if ((!videoPublishEditModelLJI.isFastImport() || !videoPublishEditModelLJI.isStickPointMode()) && !videoPublishEditModelLJI.isPhotoMvMode() && !videoPublishEditModelLJI.getSoundSyncFromAnchor()) {
            MicDataModel micDataModel = videoPublishEditModelLJI.creativeModel.micDataModel;
            float f2 = micDataModel.editDefaultVolume;
            if (f2 != -1.0f && !micDataModel.editVolumeChangeMark) {
                videoPublishEditModelLJI.setVoiceVolume(f2);
            }
        } else {
            videoPublishEditModelLJI.setVoiceVolume(0.0f);
        }
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModelLJI.creativeModel.musicBuzModel);
        if (aVMusicExtractAVMusic != null && aVMusicExtractAVMusic.isMemeSong()) {
            z = true;
        } else {
            z = false;
        }
        videoPublishEditModelLJI.setIsSoundLoop(Boolean.valueOf(bundle.getBoolean("extra_is_sound_loop", z)));
        return videoPublishEditModelLJI;
    }

    public static Intent LIZIZ(VideoPublishEditModel videoPublishEditModel, int i, C1439740nZM c1439740nZM) {
        Intent intent = new Intent();
        C0MUK.LJIIIZ(intent, videoPublishEditModel.creativeModel);
        intent.putExtra("draft_to_edit_from", i);
        intent.putExtra("shoot_way", videoPublishEditModel.mShootWay);
        if (videoPublishEditModel.getVeCherEffectParam() != null) {
            intent.putExtra("extra_ve_cher_effect_param", (Parcelable) videoPublishEditModel.getVeCherEffectParam());
        }
        intent.putExtra("restore", 1);
        intent.putExtra("workspace", videoPublishEditModel.getWorkspace());
        if (videoPublishEditModel.isReuseOriginalSound()) {
            intent.putExtra("reuse_original_sound_id", videoPublishEditModel.getReuseOriginalSoundId());
            intent.putExtra("reuse_original_sound_length", videoPublishEditModel.getReuseOriginalSoundLength());
            intent.putExtra("reuse_original_sound_url", videoPublishEditModel.getReuseOriginalSoundUrls());
        }
        intent.putExtra("translation_type", 1);
        intent.putExtra("video_edit_model", (Serializable) videoPublishEditModel);
        intent.putExtra("path", videoPublishEditModel.getMMusicPath());
        C537520L6g.LIZLLL(intent, videoPublishEditModel.getCreativeInfo());
        intent.putExtra("fromDraft", videoPublishEditModel.mIsFromDraft);
        C1398110mUD.LIZ = "video_post_page";
        videoPublishEditModel.removeChallengeFromTitleAndStruct(c1439740nZM.LIZ().getStickerToChallenge().values());
        if (videoPublishEditModel.getVeAudioEffectParam() != null && videoPublishEditModel.getVeAudioEffectParam().getChallenge() != null) {
            videoPublishEditModel.removeAudioEffectChallengeFromTitleAndStruct(videoPublishEditModel.getVeAudioEffectParam().getChallenge());
        }
        if (videoPublishEditModel.getVeAudioEffectParam() != null && !videoPublishEditModel.getVeAudioEffectParam().getChallenges().isEmpty()) {
            for (int i2 = 0; i2 < videoPublishEditModel.getVeAudioEffectParam().getChallenges().size(); i2++) {
                videoPublishEditModel.removeAudioEffectChallengeFromTitleAndStruct((AVChallenge) ListProtector.get(videoPublishEditModel.getVeAudioEffectParam().getChallenges(), i2));
            }
        }
        intent.putExtra("video_title", videoPublishEditModel.getTitle());
        intent.putExtra("video_title_chain", videoPublishEditModel.getChain());
        intent.putExtra("disable_delete_title_chain", videoPublishEditModel.isDisableDeleteChain());
        intent.putExtra("struct_list", (Serializable) videoPublishEditModel.getStructList());
        intent.putExtra("is_private", videoPublishEditModel.isPrivate);
        intent.putExtra("comment_setting", videoPublishEditModel.commentSetting);
        intent.putExtra("duet_setting", videoPublishEditModel.reactDuetSetting);
        intent.putExtra("stitch_setting", videoPublishEditModel.stitchSetting);
        intent.putExtra("allow_sticker", videoPublishEditModel.creativeModel.privacySettingModel.allowCreateSticker);
        intent.putExtra("share_to_story", videoPublishEditModel.creativeModel.privacySettingModel.allowShareToStory);
        intent.putExtra("content_reuse_permission", videoPublishEditModel.creativeModel.privacySettingModel.contentReusePermission);
        intent.putExtra("allow_ai_remix", videoPublishEditModel.creativeModel.privacySettingModel.allowAIRemix);
        intent.putExtra("download_setting", videoPublishEditModel.allowDownloadSetting);
        if (videoPublishEditModel.isStitchMode()) {
            intent.putExtra("stitch_params", (Parcelable) videoPublishEditModel.getStitchParams());
        }
        if (videoPublishEditModel.hasRetake()) {
            LIZ(intent, videoPublishEditModel);
        }
        intent.putExtra(DuetExtraInfo.class.getName(), (Parcelable) videoPublishEditModel.getDraftDuetExtraInfo());
        intent.putExtra("extra_duet_layout", videoPublishEditModel.getDuetLayout());
        intent.putExtra("duet_video_duration", videoPublishEditModel.getDuetVideoDuration());
        intent.putExtra("duet_from", videoPublishEditModel.getDuetFrom());
        intent.putExtra("music_origin", videoPublishEditModel.getMusicOrigin());
        intent.putExtra("is_default_prop", videoPublishEditModel.isDefaultProp);
        DuetAndStitchRouterConfig duetAndStitchRouterConfig = videoPublishEditModel.creativeModel.initialModel.duetAndStitchRouterConfig;
        if (duetAndStitchRouterConfig != null) {
            intent.putExtra("duet_and_stitch_router_config", duetAndStitchRouterConfig);
        }
        return intent;
    }
}
