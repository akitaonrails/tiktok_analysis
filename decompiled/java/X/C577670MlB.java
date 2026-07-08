package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.album.AlbumModel;
import com.ss.android.ugc.aweme.creative.model.beauty.BeautyModel;
import com.ss.android.ugc.aweme.creative.model.edit.CameraPhotoInfo;
import com.ss.android.ugc.aweme.creative.model.event.EventData;
import com.ss.android.ugc.aweme.creative.model.filter.RecordFilterModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.creative.model.record.CameraLayoutModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.service.IStoryAlbumEnterEditTimingService;
import com.ss.android.ugc.aweme.services.recording.NowsShootActivityArg;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautifySegmentInfo;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.shortvideo.model.RecordSceneExtKt;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureExtractionService;
import dmt.av.video.SingleImageCoverBitmapData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MlB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C577670MlB extends C0L18 {
    public static final C577670MlB LIZ = new C577670MlB();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(644));

    public static IStoryAlbumEnterEditTimingService LIZLLL() {
        return (IStoryAlbumEnterEditTimingService) LIZIZ.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x025c A[PHI: r5
      0x025c: PHI (r5v10 boolean) = (r5v5 boolean), (r5v11 boolean) binds: [B:110:0x0258, B:84:0x01b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(final X.AbstractC577770MlL r31) {
        /*
            Method dump skipped, instruction units count: 1291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C577670MlB.LIZ(X.0MlL):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03c5  */
    /* JADX WARN: Type inference failed for: r0v43, types: [T, androidx.lifecycle.LifecycleOwner] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(X.C577710MlF r40, com.ss.android.ugc.aweme.canvas.CanvasVideoData r41, dmt.av.video.SingleImageCoverBitmapData r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C577670MlB.LJ(X.0MlF, com.ss.android.ugc.aweme.canvas.CanvasVideoData, dmt.av.video.SingleImageCoverBitmapData):void");
    }

    public static void LJFF(String str, String str2, String str3) throws Throwable {
        C573990MfF.LIZLLL(str, str2);
        IMixEditingFeatureExtractionService iMixEditingFeatureExtractionService = (IMixEditingFeatureExtractionService) PluggableExtentionKt.pluggableSpi$default(IMixEditingFeatureExtractionService.class, false, false, false, 14, null);
        if (iMixEditingFeatureExtractionService != null) {
            iMixEditingFeatureExtractionService.LJFF(str, str2);
        }
        IMixEditingFeatureExtractionService iMixEditingFeatureExtractionService2 = (IMixEditingFeatureExtractionService) PluggableExtentionKt.pluggableSpi$default(IMixEditingFeatureExtractionService.class, false, false, false, 14, null);
        if (iMixEditingFeatureExtractionService2 != null) {
            iMixEditingFeatureExtractionService2.LJIILJJIL(str2, str, str3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZJ(Intent intent, ShortVideoContext shortVideoContext, FaceStickerBean faceStickerBean, Long l, SingleImageCoverBitmapData singleImageCoverBitmapData) {
        String string;
        long jCurrentTimeMillis;
        String strLJIIJJI;
        intent.putExtra("av_et_parameter", shortVideoContext.LJ());
        MusicModel musicModelLJII = C0CHQ.LIZ().LJJJJL().LJII(MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel));
        if (musicModelLJII != null) {
            if (!C2286708xd.LIZJ(shortVideoContext.getMusicPath())) {
                if (C1661210tKZ.LIZ()) {
                    C141Q c141q = C141Q.LIZ;
                    String musicPath = shortVideoContext.getMusicPath();
                    c141q.getClass();
                    if (C141Q.LJII(musicPath)) {
                    }
                }
                intent.putExtra("music_origin", shortVideoContext.LJIIJJI());
            }
            boolean z = !shortVideoContext.mIsPhotoMvModeMusic ? 1 : 0;
            intent.putExtra("path", shortVideoContext.getMusicPath());
            intent.putExtra("music_model", musicModelLJII);
            if (z != 0) {
                strLJIIJJI = shortVideoContext.LJIIJJI();
            } else {
                strLJIIJJI = "slideshow_rec";
            }
            intent.putExtra("music_origin", strLJIIJJI);
            C1227904rF c1227904rF = C1227904rF.LIZ;
            List listSingletonList = Collections.singletonList(musicModelLJII.getMusicId());
            c1227904rF.getClass();
            C0MUK.LIZIZ(intent).recordEffectModel.firstStickerMusicIdsJson = C1227904rF.LJI(listSingletonList);
            intent.putExtra(FollowStatusChangeMethod.PARAM_UID, musicModelLJII.getMusicId());
            boolean z2 = !z;
            intent.putExtra("preset_music_source", z2 ? 1 : 0);
            intent.putExtra("need_clean_music_when_back", z2);
        } else {
            intent.putExtra("music_origin", shortVideoContext.LJIIJJI());
        }
        MusicObject musicObject = shortVideoContext.creativeModel.musicBuzModel.music;
        String str = "";
        if (musicObject == null || (string = Long.valueOf(musicObject.id).toString()) == null) {
            string = "";
        }
        intent.putExtra("music_id", string);
        C0MUK.LIZIZ(intent).draftInfoModel.newDraftId = shortVideoContext.newDraftId;
        C0MUK.LIZIZ(intent).draftInfoModel.draftId = shortVideoContext.draftId;
        intent.putExtra("origin", 1);
        intent.putExtra("content_type", "slideshow");
        intent.putExtra("content_source", "shoot");
        if (shortVideoContext.LJJJJZI() && C536570L2p.LIZ()) {
            intent.putExtra("music_start", shortVideoContext.cameraComponentModel.mMusicStart);
            intent.putExtra("extra_music_end", shortVideoContext.cameraComponentModel.musicEndTime);
        }
        intent.putExtra("camera", shortVideoContext.creativeModel.recordData.cameraPosition);
        intent.putExtra("from_prop_id", shortVideoContext.LJIIIZ());
        if (faceStickerBean != null && (!Intrinsics.LJFF(faceStickerBean, FaceStickerBean.NONE))) {
            intent.putExtra("is_default_prop", C1443570nfX.LIZIZ(shortVideoContext.creativeModel.propFromGroupModel, faceStickerBean));
        }
        if (shortVideoContext.microAppModel != null || shortVideoContext.LJJIII()) {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = new ArrayList();
            C579490Mo7.LIZ(shortVideoContext.microAppModel, sb, arrayList);
            intent.putExtra("struct_list", arrayList);
            String string2 = sb.toString();
            shortVideoContext.title = string2;
            intent.putExtra("video_title", string2);
            intent.putExtra("video_title_chain", shortVideoContext.title);
            intent.putExtra("disable_delete_title_chain", true);
        }
        intent.putExtra("sticker_info", shortVideoContext.creativeModel.recordEffectModel.stickerInfo);
        if (!C580130Mp9.LIZ(shortVideoContext.arTextList)) {
            intent.putStringArrayListExtra("extra_ar_text", shortVideoContext.arTextList);
        }
        if (!C580130Mp9.LIZ(shortVideoContext.messageBubbleTexts)) {
            intent.putStringArrayListExtra("extra_sticker_text", shortVideoContext.messageBubbleTexts);
        }
        if (shortVideoContext.creativeModel.nowsShootModel != null && shortVideoContext.shootMode == 16) {
            String str2 = shortVideoContext.shootWay;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = shortVideoContext.enterMethod;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = shortVideoContext.enterFrom;
            if (str4 != null) {
                str = str4;
            }
            intent.putExtra("now_shoot_activity_arg", new NowsShootActivityArg(str2, str3, str, false, false, "friends", null, "", null, "", "", "", "", null, 0, "", "", "", "record_button"));
        }
        if (C0BMN.LIZ()) {
            if (l != null) {
                jCurrentTimeMillis = l.longValue();
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            intent.putExtra("camera_photo_info", new CameraPhotoInfo(jCurrentTimeMillis, shortVideoContext.creativeModel.newGreenScreenEffectModel.deepCopy(), singleImageCoverBitmapData, false));
        }
    }

    public static void LIZIZ(CreativeModel creativeModel, ShortVideoContext shortVideoContext, int i, MediaModel mediaModel, FaceStickerBean faceStickerBean, BeautifySegmentInfo beautifySegmentInfo, CanvasVideoData canvasVideoData, SingleImageCoverBitmapData singleImageCoverBitmapData) {
        List<BeautifySegmentInfo> listSingletonList;
        CameraLayoutModel cameraLayoutModel;
        ArrayList<TimeSpeedModelExtension> arrayList;
        ArrayList<TimeSpeedModelExtension> arrayList2;
        creativeModel.recordData.cameraPosition = i;
        creativeModel.aigcExtraModel.aiCreationId = UUID.randomUUID().toString();
        if (singleImageCoverBitmapData != null) {
            creativeModel.editModel.singleImageCoverBitmapData = singleImageCoverBitmapData;
        }
        creativeModel.recordData.shootMode = shortVideoContext.shootMode;
        creativeModel.editStickerModel.commentVideoModel = shortVideoContext.LJFF();
        RecordFilterModel recordFilterModel = creativeModel.recordFilterModel;
        if (C539900LFk.LJI(shortVideoContext)) {
            CameraLayoutModel cameraLayoutModel2 = shortVideoContext.creativeModel.cameraLayoutModel;
            if (cameraLayoutModel2 != null && (arrayList2 = cameraLayoutModel2.captureSegments) != null && !arrayList2.isEmpty()) {
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
        BeautyModel beautyModel = creativeModel.beautyModel;
        if (beautifySegmentInfo == null || (listSingletonList = Collections.singletonList(beautifySegmentInfo)) == null) {
            listSingletonList = C13BV.INSTANCE;
        }
        beautyModel.beautifyUsedSegments = listSingletonList;
        creativeModel.eventData.beautyMobParam = shortVideoContext.beautyMobParam;
        if (faceStickerBean != null && (!Intrinsics.LJFF(faceStickerBean, FaceStickerBean.NONE))) {
            creativeModel.recordEffectModel.stickerID = String.valueOf(faceStickerBean.getStickerId());
        }
        if (C539900LFk.LJI(shortVideoContext) && (cameraLayoutModel = shortVideoContext.creativeModel.cameraLayoutModel) != null && (arrayList = cameraLayoutModel.captureSegments) != null && !arrayList.isEmpty()) {
            shortVideoContext.creativeModel.recordEffectModel.stickerID = RecordScene.getStickerIdsByModel(arrayList);
        }
        if (!C0BMN.LIZ()) {
            if (canvasVideoData != null) {
                C23250099c.LJ(C23271099x.INSTANCE, new C536530L2l(mediaModel, canvasVideoData, shortVideoContext, null));
            } else {
                canvasVideoData = null;
            }
            creativeModel.canvasVideoData = canvasVideoData;
        }
        EventData eventData = creativeModel.eventData;
        eventData.enterFrom = shortVideoContext.enterFrom;
        creativeModel.microAppModel = shortVideoContext.microAppModel;
        eventData.shootEnterMethod = shortVideoContext.enterMethod;
        AlbumModel albumModel = creativeModel.albumModel;
        albumModel.uploadMethod = shortVideoContext.uploadMethod;
        creativeModel.creativeFlowData = shortVideoContext.creativeFlowData;
        List<String> list = shortVideoContext.uploadTabNameList;
        if (list != null) {
            albumModel.uploadTabNameList = new ArrayList(list);
        }
        creativeModel.creativeFlowData = shortVideoContext.creativeFlowData;
        if (singleImageCoverBitmapData != null) {
            creativeModel.editModel.singleImageCoverBitmapData = singleImageCoverBitmapData;
        }
        if (shortVideoContext.creativeModel.draftInfoModel.isDraft) {
            creativeModel.draftInfoModel.draftFromShoot = true;
        }
    }
}
