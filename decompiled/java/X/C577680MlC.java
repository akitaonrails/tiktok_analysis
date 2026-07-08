package X;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.common.MusicContent;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.album.AlbumModel;
import com.ss.android.ugc.aweme.creative.model.beauty.BeautyModel;
import com.ss.android.ugc.aweme.creative.model.filter.RecordFilterModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.creative.model.record.CameraLayoutModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.onthisday.OnThisDayService;
import com.ss.android.ugc.aweme.services.recording.NowsShootActivityArg;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautifySegmentInfo;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.shortvideo.model.RecordSceneExtKt;
import com.ss.android.ugc.aweme.shortvideo.p1;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MlC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C577680MlC {
    public static final /* synthetic */ int LIZ = 0;

    public static Intent LIZ(C577690MlD c577690MlD) {
        boolean z;
        String string;
        String str;
        List<BeautifySegmentInfo> listSingletonList;
        String stringExtra;
        MusicContent musicContent;
        String strLJIIJJI;
        ArrayList<TimeSpeedModelExtension> arrayList;
        boolean z2;
        ArrayList<TimeSpeedModelExtension> arrayList2;
        boolean z3;
        Serializable serializable;
        ShortVideoContext shortVideoContext = c577690MlD.LIZIZ;
        shortVideoContext.creativeModel.aigcExtraModel.aiCreationId = UUID.randomUUID().toString();
        p1.LJ(c577690MlD.LIZ, shortVideoContext);
        Intent intent = new Intent();
        C0MUK.LJIIIZ(intent, shortVideoContext.creativeModel);
        CreativeModel creativeModelLIZIZ = C0MUK.LIZIZ(intent);
        Serializable serializable2 = shortVideoContext.shareContext;
        if (serializable2 != null) {
            intent.putExtra("extra_share_context", serializable2);
        }
        intent.putExtra("av_et_parameter", shortVideoContext.LJ());
        List arrayList3 = C1443030nef.LJII().LIZ;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
        }
        List<AVChallenge> list = c577690MlD.LJII;
        boolean z4 = false;
        if (list != null && !((ArrayList) list).isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            arrayList3.addAll(c577690MlD.LJII);
        }
        String str2 = "";
        if (C123100dR.LIZ(shortVideoContext.creativeModel.aiSelfModel.musicId) && C527780Kmu.LIZ) {
            intent.putExtra("music_id", shortVideoContext.creativeModel.aiSelfModel.musicId);
        } else {
            MusicObject musicObject = shortVideoContext.creativeModel.musicBuzModel.music;
            if (musicObject == null || (string = Long.valueOf(musicObject.id).toString()) == null) {
                string = "";
            }
            intent.putExtra("music_id", string);
        }
        if (C527780Kmu.LIZ) {
            intent.putExtra("challenge_id", shortVideoContext.creativeModel.aiSelfModel.challengeId);
        }
        intent.putExtra("challenge", (Serializable) arrayList3);
        ((OnThisDayService) ServiceManager.get().getService(OnThisDayService.class)).insertChallengeIfNeed(intent, C0MUK.LIZIZ(intent), c577690MlD.LIZ);
        if (TextUtils.equals(shortVideoContext.enterFrom, "open_platform_share") && (serializable = shortVideoContext.shareContext) != null) {
            intent.putExtra("extra_share_context", serializable);
        }
        intent.putExtra("voice_volume", 0.0f);
        creativeModelLIZIZ.extractFramesModel = shortVideoContext.cameraComponentModel.extractFramesModel;
        intent.putExtra("shoot_way", shortVideoContext.shootWay);
        intent.putExtra("enter_from", shortVideoContext.enterFrom);
        C537520L6g.LIZLLL(intent, shortVideoContext.creativeInfo);
        creativeModelLIZIZ.recordData.shootMode = shortVideoContext.shootMode;
        C0MUK.LIZIZ(intent).draftInfoModel.newDraftId = shortVideoContext.newDraftId;
        C0MUK.LIZIZ(intent).draftInfoModel.draftId = shortVideoContext.draftId;
        intent.putExtra("origin", c577690MlD.LIZJ ? 1 : 0);
        intent.putExtra("content_type", "slideshow");
        if (c577690MlD.LIZJ) {
            str = "shoot";
        } else {
            str = "upload";
        }
        intent.putExtra("content_source", str);
        if (shortVideoContext.LIZJ().size() > 0) {
            intent.putExtra("extra_av_camera_ids", RecordScene.getCameraIdsStringByModel(shortVideoContext.LIZJ()));
        }
        if (shortVideoContext.LJJJJZI() && C536570L2p.LIZ()) {
            intent.putExtra("music_start", shortVideoContext.cameraComponentModel.mMusicStart);
            intent.putExtra("extra_music_end", shortVideoContext.cameraComponentModel.musicEndTime);
        }
        intent.putExtra("camera", c577690MlD.LJI);
        intent.putExtra("share_id", shortVideoContext.mShareId);
        intent.putExtra("channel", shortVideoContext.clientId);
        creativeModelLIZIZ.editStickerModel.commentVideoModel = shortVideoContext.LJFF();
        C0MUK.LIZIZ(intent).ttsVoiceModel = shortVideoContext.ttsVoiceModel;
        intent.putExtra("extra_start_enter_edit_page", c577690MlD.LJFF);
        RecordFilterModel recordFilterModel = creativeModelLIZIZ.recordFilterModel;
        String stringExtra2 = null;
        if (C539900LFk.LJI(shortVideoContext)) {
            CameraLayoutModel cameraLayoutModel = shortVideoContext.creativeModel.cameraLayoutModel;
            if (cameraLayoutModel != null) {
                arrayList2 = cameraLayoutModel.captureSegments;
            } else {
                arrayList2 = null;
            }
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z3) {
                String filterLabelsByModel = RecordScene.getFilterLabelsByModel(arrayList2);
                String filterIdsByModel = RecordScene.getFilterIdsByModel(arrayList2);
                String filterValuesByModel = RecordScene.getFilterValuesByModel(arrayList2);
                recordFilterModel.recordFilterLabels = filterLabelsByModel;
                recordFilterModel.recordFilterIds = filterIdsByModel;
                recordFilterModel.recordFilterValues = filterValuesByModel;
                recordFilterModel.curFilterLabels = filterLabelsByModel;
                recordFilterModel.curFilterIds = filterIdsByModel;
                recordFilterModel.recordFilterCategoryKeys = RecordSceneExtKt.getFilterCategoryKeysByModel(arrayList2);
                recordFilterModel.recordFilterDefaultInfos = RecordSceneExtKt.getFilterDefaultInfoByModel(shortVideoContext, arrayList2);
            }
        } else if (!C525810Kjj.LIZ()) {
            recordFilterModel.recordFilterLabels = shortVideoContext.cameraComponentModel.recordContext.filterLabels.toString();
            recordFilterModel.recordFilterIds = shortVideoContext.cameraComponentModel.recordContext.filterIds.toString();
            recordFilterModel.recordFilterValues = shortVideoContext.cameraComponentModel.recordContext.filterValues.toString();
            recordFilterModel.curFilterLabels = shortVideoContext.cameraComponentModel.recordContext.filterLabels.toString();
            recordFilterModel.curFilterIds = shortVideoContext.cameraComponentModel.recordContext.filterIds.toString();
            recordFilterModel.recordFilterCategoryKeys = shortVideoContext.cameraComponentModel.recordContext.filterCategoryKeys.toString();
            recordFilterModel.recordFilterDefaultInfos = shortVideoContext.cameraComponentModel.recordContext.filterIsDefaultInfos.toString();
        }
        BeautyModel beautyModel = creativeModelLIZIZ.beautyModel;
        BeautifySegmentInfo beautifySegmentInfo = c577690MlD.LJ;
        if (beautifySegmentInfo == null || (listSingletonList = Collections.singletonList(beautifySegmentInfo)) == null) {
            listSingletonList = C13BV.INSTANCE;
        }
        beautyModel.beautifyUsedSegments = listSingletonList;
        creativeModelLIZIZ.eventData.beautyMobParam = shortVideoContext.beautyMobParam;
        intent.putExtra("use_music_before_edit", true);
        intent.putExtra("from_prop_id", shortVideoContext.LJIIIZ());
        FaceStickerBean faceStickerBean = c577690MlD.LIZLLL;
        if (faceStickerBean != null) {
            if (!(!Intrinsics.LJFF(faceStickerBean, FaceStickerBean.NONE))) {
                faceStickerBean = null;
            }
            if (faceStickerBean != null) {
                creativeModelLIZIZ.recordEffectModel.stickerID = String.valueOf(faceStickerBean.getStickerId());
                intent.putExtra("is_default_prop", C1443570nfX.LIZIZ(creativeModelLIZIZ.propFromGroupModel, c577690MlD.LIZLLL));
            }
        }
        if (C539900LFk.LJI(shortVideoContext)) {
            CameraLayoutModel cameraLayoutModel2 = shortVideoContext.creativeModel.cameraLayoutModel;
            if (cameraLayoutModel2 != null) {
                arrayList = cameraLayoutModel2.captureSegments;
            } else {
                arrayList = null;
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                creativeModelLIZIZ.recordEffectModel.stickerID = RecordScene.getStickerIdsByModel(arrayList);
            }
        }
        String str3 = c577690MlD.LJIIIZ;
        MusicModel musicModel = c577690MlD.LJIIIIZZ;
        if (str3 != null && musicModel != null) {
            intent.putExtra("path", str3);
            intent.putExtra("music_model", c577690MlD.LJIIIIZZ);
            if (c577690MlD.LJIIJ) {
                strLJIIJJI = shortVideoContext.LJIIJJI();
            } else {
                strLJIIJJI = "slideshow_rec";
            }
            intent.putExtra("music_origin", strLJIIJJI);
            C0MUK.LIZIZ(intent).recordEffectModel.firstStickerMusicIdsJson = GsonProtectorUtils.toJson(new Gson(), Collections.singletonList(musicModel.getMusicId()));
            intent.putExtra(FollowStatusChangeMethod.PARAM_UID, musicModel.getMusicId());
            if (!c577690MlD.LIZJ) {
                creativeModelLIZIZ.mvModel.isPhotoMvMusic = shortVideoContext.mIsPhotoMvModeMusic;
            }
            intent.putExtra("preset_music_source", !c577690MlD.LJIIJ ? 1 : 0);
            intent.putExtra("need_clean_music_when_back", !c577690MlD.LJIIJ);
        } else {
            intent.putExtra("music_origin", shortVideoContext.LJIIJJI());
        }
        C1402840mbq c1402840mbq = shortVideoContext.shareContext;
        if (c1402840mbq != null && (musicContent = c1402840mbq.mMusicContent) != null) {
            String str4 = musicContent.musicId;
            if (str4 != null) {
                intent.putExtra("music_id", str4);
            }
            intent.putExtra("music_start_time", musicContent.musicStartTime);
        }
        intent.putExtra("workspace", shortVideoContext.cameraComponentModel.mWorkspace);
        if (shortVideoContext.microAppModel != null || shortVideoContext.LJJIII()) {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList4 = new ArrayList();
            C579490Mo7.LIZ(shortVideoContext.microAppModel, sb, arrayList4);
            intent.putExtra("struct_list", arrayList4);
            String string2 = sb.toString();
            shortVideoContext.title = string2;
            intent.putExtra("video_title", string2);
            intent.putExtra("video_title_chain", shortVideoContext.title);
            intent.putExtra("disable_delete_title_chain", true);
        }
        intent.putExtra("commerce_data_in_tools_line", shortVideoContext.extraSession.commerceData);
        intent.putExtra("extra_request_code", 12346);
        creativeModelLIZIZ.eventData.enterFrom = shortVideoContext.enterFrom;
        intent.putExtra("is_private", shortVideoContext.LJIILLIIL());
        creativeModelLIZIZ.microAppModel = shortVideoContext.microAppModel;
        creativeModelLIZIZ.eventData.shootEnterMethod = shortVideoContext.enterMethod;
        intent.putExtra("shoot_from", shortVideoContext.mShootFrom);
        AlbumModel albumModel = creativeModelLIZIZ.albumModel;
        albumModel.uploadMethod = shortVideoContext.uploadMethod;
        List<String> list2 = shortVideoContext.uploadTabNameList;
        if (list2 != null) {
            albumModel.uploadTabNameList = new ArrayList(list2);
        }
        intent.putExtra("upload_next_method", shortVideoContext.albumPreviewNextMethod);
        creativeModelLIZIZ.creativeFlowData = shortVideoContext.creativeFlowData;
        intent.putExtra("sticker_info", shortVideoContext.creativeModel.recordEffectModel.stickerInfo);
        if (c577690MlD.LIZJ) {
            if (!C580130Mp9.LIZ(shortVideoContext.arTextList)) {
                intent.putStringArrayListExtra("extra_ar_text", shortVideoContext.arTextList);
            }
            if (!C580130Mp9.LIZ(shortVideoContext.messageBubbleTexts)) {
                intent.putStringArrayListExtra("extra_sticker_text", shortVideoContext.messageBubbleTexts);
            }
        }
        C537520L6g.LIZLLL(intent, shortVideoContext.creativeInfo);
        Intent intent2 = c577690MlD.LIZ.getIntent();
        if (intent2 != null) {
            try {
                stringExtra = intent2.getStringExtra("enter_dm");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
            if (stringExtra != null) {
                intent.putExtra("enter_dm", stringExtra);
            }
        }
        Intent intent3 = c577690MlD.LIZ.getIntent();
        if (intent3 != null) {
            try {
                stringExtra2 = intent3.getStringExtra("launch_method");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            if (stringExtra2 != null) {
                intent.putExtra("launch_method", stringExtra2);
            }
        }
        if (shortVideoContext.creativeModel.nowsShootModel != null) {
            if (shortVideoContext.shootMode == 16) {
                z4 = true;
            }
            if (z4) {
                String str5 = shortVideoContext.shootWay;
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = shortVideoContext.enterMethod;
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = shortVideoContext.enterFrom;
                if (str7 != null) {
                    str2 = str7;
                }
                intent.putExtra("now_shoot_activity_arg", new NowsShootActivityArg(str5, str6, str2, false, false, "friends", null, "", null, "", "", "", "", null, 0, "", "", "", "record_button"));
            }
        }
        if (C534210KxH.LIZ() && shortVideoContext.creativeModel.onThisDayData.isFromOnThisDay()) {
            intent.putExtra("extra_saa_scene_force_disable_translucent", true);
            intent.putExtra("shoot_way", shortVideoContext.shootWay);
        }
        return intent;
    }
}
