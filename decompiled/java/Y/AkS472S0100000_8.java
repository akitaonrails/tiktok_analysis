package Y;

import X.AbstractC19484711Kz;
import X.AbstractC19852312lt;
import X.AbstractC577050MkB;
import X.C036E;
import X.C09JN;
import X.C0MD2;
import X.C0MD3;
import X.C1100070ejV;
import X.C11IR;
import X.C11NZ;
import X.C11S5;
import X.C1227904rF;
import X.C1232830iBd;
import X.C1308910kAL;
import X.C13LP;
import X.C1441190nbh;
import X.C1602160rnK;
import X.C1664590tQ1;
import X.C19478811Is;
import X.C21641619mo;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2471909mP;
import X.C2477909nN;
import X.C259800zU;
import X.C523440Kfu;
import X.C523660KgG;
import X.C530010KqV;
import X.C534850KyJ;
import X.C534860KyK;
import X.C535020Kya;
import X.C538540LAe;
import X.C539860LFg;
import X.C539870LFh;
import X.C548260Leq;
import X.C550940LjA;
import X.C564710MCv;
import X.C569160MTy;
import X.C570810Ma7;
import X.C570820Ma8;
import X.C576610MjT;
import X.C576730Mjf;
import X.C576760Mji;
import X.C576800Mjm;
import X.C576900Mjw;
import X.C576940Mk0;
import X.C577030Mk9;
import X.C577450Mkp;
import X.C577760MlK;
import X.C578890Mn9;
import X.C579270Mnl;
import X.C580100Mp6;
import X.C580200MpG;
import X.C581120Mqk;
import X.C786410Ut5;
import X.InterfaceC1487280oo2;
import X.InterfaceC534840KyI;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewStub;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.record.LayoutApplyFrom;
import com.ss.android.ugc.aweme.creative.model.record.LayoutMediaType;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.minis.model.metrics.MinisMetricsNetworkResponse;
import com.ss.android.ugc.aweme.minis.model.metrics.MinisMetricsResponse;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautifySegmentInfo;
import com.ss.android.ugc.aweme.shortvideo.d4;
import com.ss.android.ugc.aweme.shortvideo.edit.DraftMusicPermissionCheckApi;
import com.ss.android.ugc.aweme.shortvideo.edit.DraftMusicPermissionCheckResponse;
import com.ss.android.ugc.aweme.shortvideo.edit.DraftMusicPermissionCheckResultBean;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.aicontentprotocol.AlbumAiContentService;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aicontent.AlbumAiContentRepositoryImpl;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.social.creation.api.edit.IStoryCanvasVideoHelper;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import com.ss.android.ugc.gamora.recorder.layout.model.LayoutItemMedia;
import com.ss.android.vesdk.VEUtils;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import pyl.s;

/* JADX INFO: loaded from: classes9.dex */
public class AkS472S0100000_8 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            case 5:
                return apply$5(this, obj);
            case 6:
                return apply$6(this, obj);
            case 7:
                return apply$7(this, obj);
            case 8:
                return apply$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return apply$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return apply$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return apply$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return apply$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return apply$13(this, obj);
            case 14:
                return apply$14(this, obj);
            case 15:
                return apply$15(this, obj);
            case 16:
                return apply$16(this, obj);
            default:
                return null;
        }
    }

    public AkS472S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$0(AkS472S0100000_8 akS472S0100000_8, Object obj) {
        DraftMusicPermissionCheckApi.PermissionCheckEntity permissionCheckEntity;
        String id;
        C570820Ma8 c570820Ma8 = (C570820Ma8) akS472S0100000_8.l0;
        List<DraftMusicPermissionCheckResultBean> list = ((DraftMusicPermissionCheckResponse) obj).result;
        boolean z = true;
        if (list != null && !list.isEmpty()) {
            boolean z2 = true;
            for (DraftMusicPermissionCheckResultBean draftMusicPermissionCheckResultBean : list) {
                if (draftMusicPermissionCheckResultBean.allowCurrent) {
                    C570810Ma7.LIZ(1, draftMusicPermissionCheckResultBean.reason, draftMusicPermissionCheckResultBean.id);
                } else {
                    C570810Ma7.LIZ(2, draftMusicPermissionCheckResultBean.reason, draftMusicPermissionCheckResultBean.id);
                    z2 = false;
                }
            }
            z = z2;
        } else {
            List<DraftMusicPermissionCheckApi.PermissionCheckEntity> list2 = c570820Ma8.LIZ;
            if (list2 != null && (permissionCheckEntity = (DraftMusicPermissionCheckApi.PermissionCheckEntity) C13LP.LJJJLL(list2)) != null && (id = permissionCheckEntity.getId()) != null) {
                C570810Ma7.LIZ(1, "", id);
            }
        }
        return Boolean.valueOf(z);
    }

    public static final Object apply$1(AkS472S0100000_8 akS472S0100000_8, Object obj) {
        Boolean bool = (Boolean) obj;
        boolean z = true;
        if (C523660KgG.LIZ() && C530010KqV.LIZ() > 60000 && C530010KqV.LIZ() <= 180000 && bool.booleanValue()) {
            ViewStub viewStub = ((MvChoosePhotoScene) akS472S0100000_8.l0).mNoticeViewViewStub;
            if (viewStub != null && viewStub.getParent() != null && viewStub != null) {
                C786410Ut5.LJLLLL(viewStub);
            }
            MvChoosePhotoScene mvChoosePhotoScene = (MvChoosePhotoScene) akS472S0100000_8.l0;
            mvChoosePhotoScene.noticeView = (C21641619mo) mvChoosePhotoScene.findViewById(R.id.pd1);
            C21641619mo c21641619mo = ((MvChoosePhotoScene) akS472S0100000_8.l0).noticeView;
            if (c21641619mo != null) {
                int visibility = c21641619mo.getVisibility();
                c21641619mo.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c21641619mo);
            }
            int iLIZ = (int) (C530010KqV.LIZ() / ((long) C538540LAe.LLJJJIL));
            MvChoosePhotoScene mvChoosePhotoScene2 = (MvChoosePhotoScene) akS472S0100000_8.l0;
            C21641619mo c21641619mo2 = mvChoosePhotoScene2.noticeView;
            if (c21641619mo2 != null) {
                c21641619mo2.setTitleContent(mvChoosePhotoScene2.getResources().getString(2131857951, Integer.valueOf(iLIZ)));
            }
            MvChoosePhotoScene mvChoosePhotoScene3 = (MvChoosePhotoScene) akS472S0100000_8.l0;
            C21641619mo c21641619mo3 = mvChoosePhotoScene3.noticeView;
            if (c21641619mo3 != null) {
                c21641619mo3.setOnCloseClickListener(new AwS552S0100000_8(mvChoosePhotoScene3, 276));
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object apply$10(AkS472S0100000_8 akS472S0100000_8, Object obj) {
        boolean z;
        LivePhotoModel livePhotoModel;
        boolean z2;
        C576800Mjm c576800Mjm = (C576800Mjm) obj;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJL(bundle, "currentSticker", ((C576760Mji) akS472S0100000_8.l0).getStickerApiComponent().jr());
        Bundle bundle2 = new Bundle();
        C1441190nbh c1441190nbh = ((C576760Mji) akS472S0100000_8.l0).LLJJ.cameraComponentModel.mDurings;
        ArrayList arrayList = new ArrayList();
        Iterator<TimeSpeedModelExtension> it2 = c1441190nbh.iterator();
        while (it2.hasNext()) {
            BeautifySegmentInfo beautifySegmentInfo = it2.next().getBeautifySegmentInfo();
            if (beautifySegmentInfo != null) {
                arrayList.add(beautifySegmentInfo);
            }
        }
        C786410Ut5.LJJIJL(bundle2, "beauty_segment_info", new BeautifySegmentInfo(C577760MlK.LIZIZ(arrayList)));
        ((C576760Mji) akS472S0100000_8.l0).LLJJ.cameraComponentModel.mDurings.clear();
        ((C576760Mji) akS472S0100000_8.l0).LLJJ.cameraComponentModel.mDurings.begin(s.NORMAL, bundle, bundle2);
        C576760Mji c576760Mji = (C576760Mji) akS472S0100000_8.l0;
        c576760Mji.LLJJ.cameraComponentModel.mDurings.end(c576760Mji.K4().kn2(), null);
        AbstractC577050MkB abstractC577050MkBG8 = ((C576760Mji) akS472S0100000_8.l0).P4().G8();
        if (abstractC577050MkBG8 == null) {
            return null;
        }
        C576760Mji c576760Mji2 = (C576760Mji) akS472S0100000_8.l0;
        C576940Mk0 c576940Mk0O4 = c576760Mji2.O4();
        String str = c576800Mjm.LIZ;
        String str2 = c576800Mjm.LIZIZ;
        int i = c576800Mjm.LIZJ;
        int i2 = c576800Mjm.LIZLLL;
        long jKn2 = c576760Mji2.K4().kn2();
        LayoutApplyFrom layoutApplyFromF60 = c576760Mji2.P4().f60();
        List<LayoutItemMedia> listKG2 = c576760Mji2.T4().KG2();
        c576940Mk0O4.getClass();
        if ((listKG2 instanceof Collection) && listKG2.isEmpty()) {
            z = true;
        } else {
            Iterator<LayoutItemMedia> it3 = listKG2.iterator();
            while (it3.hasNext()) {
                if (it3.next().mediaType != LayoutMediaType.LIVE_PHOTO) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        c576940Mk0O4.LIZIZ(str, true, z, abstractC577050MkBG8, layoutApplyFromF60, listKG2);
        CreativeModel creativeModel = c576940Mk0O4.LJ.creativeModel;
        if (z) {
            MediaModel mediaModel = new MediaModel(UUID.randomUUID().toString());
            mediaModel.relativePath = str;
            mediaModel.LJIILL(str);
            mediaModel.duration = jKn2;
            mediaModel.width = i;
            mediaModel.height = i2;
            mediaModel.type = 1;
            mediaModel.subType = 1;
            livePhotoModel = new LivePhotoModel(LivePhotoPreviewMode.LOOP, null, Collections.singletonList(mediaModel), null, null, true, false, 0, 0L, 0, null, 2010, null);
        } else {
            livePhotoModel = null;
        }
        creativeModel.livePhotoModel = livePhotoModel;
        if (z) {
            str2 = "";
        }
        AVMusicWaveBean aVMusicWaveBean = null;
        String strLIZIZ = C580200MpG.LIZIZ(str, Integer.valueOf((int) jKn2), Integer.valueOf(i), Integer.valueOf(i2), null);
        ShortVideoContext shortVideoContext = c576940Mk0O4.LJ;
        AVMusicWaveBean aVMusicWaveBean2 = shortVideoContext.musicWaveBean;
        if (!TextUtils.isEmpty(shortVideoContext.cameraComponentModel.mMusicPath) && aVMusicWaveBean2 != null && TextUtils.equals(aVMusicWaveBean2.getMusicPath(), shortVideoContext.cameraComponentModel.mMusicPath)) {
            aVMusicWaveBean = aVMusicWaveBean2;
        }
        ShortVideoContext shortVideoContext2 = c576940Mk0O4.LJ;
        if (!d4.LJJ(shortVideoContext2) && shortVideoContext2.getMusicPath() != null && !shortVideoContext2.creativeModel.micDataModel.recordOriginalSoundWithBGM) {
            z2 = true;
        } else {
            z2 = false;
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = new MultiEditVideoStatusRecordData();
        MultiEditVideoRecordData multiEditVideoRecordData = new MultiEditVideoRecordData();
        multiEditVideoRecordData.useMusic = z2;
        multiEditVideoRecordData.concatVideo = str;
        multiEditVideoRecordData.concatAudio = str2;
        multiEditVideoRecordData.startTime = 0L;
        multiEditVideoRecordData.setThreadSafeSegmentDataList(new ArrayList(1));
        MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = new MultiEditVideoSegmentRecordData();
        multiEditVideoSegmentRecordData.videoPath = str;
        multiEditVideoSegmentRecordData.audioPath = str2;
        multiEditVideoSegmentRecordData.setStartTime(0L);
        multiEditVideoSegmentRecordData.setEndTime(jKn2);
        multiEditVideoSegmentRecordData.draftVideoPath = str;
        multiEditVideoSegmentRecordData.draftAudioPath = str2;
        long j = ((long) LSPassThroughRecordSizeConfig.DEFAULT) * jKn2;
        multiEditVideoSegmentRecordData.videoLength = j;
        multiEditVideoSegmentRecordData.audioLength = j;
        multiEditVideoSegmentRecordData.setVideoSpeed(1.0f);
        multiEditVideoSegmentRecordData.audioSpeed = 1.0f;
        multiEditVideoSegmentRecordData.rotate = 0;
        multiEditVideoSegmentRecordData.width = i;
        multiEditVideoSegmentRecordData.height = i2;
        multiEditVideoSegmentRecordData.videoKey = 0;
        multiEditVideoSegmentRecordData.aigcInfo = C576940Mk0.LIZ(listKG2);
        multiEditVideoRecordData.segmentDataList.add(multiEditVideoSegmentRecordData);
        multiEditVideoRecordData.endTime = jKn2;
        multiEditVideoRecordData.isSingleVideo = true;
        multiEditVideoStatusRecordData.originMultiEditRecordData = multiEditVideoRecordData.cloneData();
        multiEditVideoStatusRecordData.curMultiEditVideoRecordData = multiEditVideoRecordData;
        multiEditVideoStatusRecordData.videoMetaData = strLIZIZ;
        return new C576900Mjw(c576940Mk0O4.LIZIZ, new C580100Mp6(c576940Mk0O4.LIZLLL.Ak(), System.currentTimeMillis(), c576940Mk0O4.LJ, c576940Mk0O4.LIZJ.LJLJJLL(), aVMusicWaveBean, multiEditVideoStatusRecordData, str, str2));
    }

    public static final Object apply$11(AkS472S0100000_8 akS472S0100000_8, Object obj) {
        return new Pair(Boolean.valueOf(!(obj instanceof C579270Mnl)), ((C577450Mkp) akS472S0100000_8.l0).H4().G8());
    }

    public static final Object apply$12(AkS472S0100000_8 akS472S0100000_8, Object obj) {
        Boolean bool = (Boolean) obj;
        ((C576610MjT) akS472S0100000_8.l0).K4().aC0(bool.booleanValue());
        if (bool.booleanValue()) {
            return AbstractC19484711Kz.LJII(new C581120Mqk((C576610MjT) akS472S0100000_8.l0, 1)).LJJIJIIJI(C11S5.LIZIZ).LJIL(new AkS472S0100000_8((C576610MjT) akS472S0100000_8.l0, 14));
        }
        return AbstractC19484711Kz.LJIJJLI(new Pair(Boolean.FALSE, null));
    }

    public static final Object apply$13(AkS472S0100000_8 akS472S0100000_8, Object obj) {
        Pair pair = (Pair) obj;
        boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
        String str = (String) pair.getSecond();
        if (zBooleanValue) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("turn on layout, blur bitmap path: ");
            sbLIZ.append(str);
            C576730Mjf.LJIIIZ("CameraLayoutGridComponent", C2188811AlT.LIZIZ(sbLIZ));
            if (str != null) {
                ((C576610MjT) akS472S0100000_8.l0).K4().xi2(str, ((C576610MjT) akS472S0100000_8.l0).O4().kn2());
            }
            ((C576610MjT) akS472S0100000_8.l0).N5(true);
            ((C576610MjT) akS472S0100000_8.l0).LLJLIL.onNext(Boolean.TRUE);
            ((C576610MjT) akS472S0100000_8.l0).H4().S60(((C576610MjT) akS472S0100000_8.l0).LLJLLIL);
            ((C576610MjT) akS472S0100000_8.l0).O4().Oa1();
            return C576730Mjf.LJIILIIL(((C576610MjT) akS472S0100000_8.l0).T4().r6(), (C576610MjT) akS472S0100000_8.l0);
        }
        C576730Mjf.LJIIIZ("CameraLayoutGridComponent", "turn off layout");
        ((C576610MjT) akS472S0100000_8.l0).LLJLIL.onNext(Boolean.FALSE);
        ((C576610MjT) akS472S0100000_8.l0).N5(false);
        ((C576610MjT) akS472S0100000_8.l0).H4().bQ2(((C576610MjT) akS472S0100000_8.l0).LLJLLIL);
        ((C576610MjT) akS472S0100000_8.l0).O4().qe();
        ((C576610MjT) akS472S0100000_8.l0).i3(AFwS239S0000000_8.get$arr$(220));
        ((C576610MjT) akS472S0100000_8.l0).K4().EB2();
        return C11IR.LL;
    }

    public static final Object apply$14(AkS472S0100000_8 akS472S0100000_8, Object obj) throws Throwable {
        int iIntValue;
        Bitmap bitmapLIZ = C1100070ejV.LIZ((Bitmap) obj, 0.5f, 24.0f, true);
        if (bitmapLIZ != null) {
            Canvas canvas = new Canvas(bitmapLIZ);
            Rect rect = new Rect(0, 0, bitmapLIZ.getWidth(), bitmapLIZ.getHeight());
            Paint paint = new Paint();
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.z_, C1664590tQ1.LJIIIZ((C576610MjT) akS472S0100000_8.l0));
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            paint.setColor(iIntValue);
            paint.setAlpha(165);
            canvas.drawRect(rect, paint);
            String strPF = ((C576610MjT) akS472S0100000_8.l0).d5().PF(false);
            C2477909nN.LJI(bitmapLIZ, strPF, Bitmap.CompressFormat.JPEG, 0, 4);
            if (!bitmapLIZ.isRecycled()) {
                bitmapLIZ.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmapLIZ);
            }
            return new Pair(Boolean.TRUE, strPF);
        }
        return new Pair(Boolean.FALSE, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, com.ss.android.ugc.aweme.minis.model.metrics.MinisMetricsNetworkResponse] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, com.ss.android.ugc.aweme.minis.model.metrics.MinisMetricsNetworkResponse] */
    public static final Object apply$15(AkS472S0100000_8 akS472S0100000_8, Object obj) {
        int iIntValue;
        MinisMetricsResponse minisMetricsResponse = (MinisMetricsResponse) obj;
        try {
            C1227904rF.LIZ.getClass();
            String strLJI = C1227904rF.LJI(minisMetricsResponse);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("middleWare, refresh, resp:");
            sbLIZ.append(strLJI);
            C2188811AlT.LIZIZ(sbLIZ);
            Integer num = minisMetricsResponse.statusCode;
            String str = minisMetricsResponse.statusMsg;
            if (num != null && num.intValue() == 0) {
                C259800zU c259800zU = (C259800zU) akS472S0100000_8.l0;
                C1232830iBd.LIZ.getClass();
                c259800zU.element = new MinisMetricsNetworkResponse(minisMetricsResponse, 0);
                return AbstractC19484711Kz.LJII(new C581120Mqk((C259800zU) akS472S0100000_8.l0, 2));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("doSendMetricsData, error response, server statusCode:");
            sbLIZ2.append(num);
            sbLIZ2.append(", statusMsg:");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            C259800zU c259800zU2 = (C259800zU) akS472S0100000_8.l0;
            C1232830iBd c1232830iBd = C1232830iBd.LIZ;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            c1232830iBd.getClass();
            c259800zU2.element = new MinisMetricsNetworkResponse(minisMetricsResponse, Integer.valueOf(iIntValue));
            return AbstractC19484711Kz.LJIJJLI(((C259800zU) akS472S0100000_8.l0).element);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("doSendMetricsData, error occurred, exception:");
            sbLIZ3.append(e);
            C2188811AlT.LIZIZ(sbLIZ3);
            ((MinisMetricsNetworkResponse) ((C259800zU) akS472S0100000_8.l0).element).errorCode = -1;
            return AbstractC19484711Kz.LJIJJLI(((C259800zU) akS472S0100000_8.l0).element);
        }
    }

    public static final Object apply$16(AkS472S0100000_8 akS472S0100000_8, Object obj) {
        List<MultiEditVideoSegmentRecordData> list;
        int size;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData;
        MultiEditVideoRecordData multiEditVideoRecordData;
        MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData;
        AbstractC19852312lt abstractC19852312lt = (AbstractC19852312lt) obj;
        String str = null;
        if (abstractC19852312lt.isPresent() && (multiEditVideoStatusRecordData = (MultiEditVideoStatusRecordData) abstractC19852312lt.get()) != null && (multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) != null) {
            list = multiEditVideoRecordData.segmentDataList;
            if (list != null && (multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) C13LP.LJJJLL(list)) != null) {
                str = multiEditVideoSegmentRecordData.videoPath;
            }
        } else {
            list = null;
        }
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        IStoryCanvasVideoHelper iStoryCanvasVideoHelper = (IStoryCanvasVideoHelper) PluggableExtentionKt.pluggableSpi$default(IStoryCanvasVideoHelper.class, false, false, false, 14, null);
        if (str != null && str.length() != 0 && iStoryCanvasVideoHelper != null && iStoryCanvasVideoHelper.LIZJ(size, ((C578890Mn9) akS472S0100000_8.l0).LIZJ())) {
            return C11NZ.LJJJJI(new ACallableS68S1200000_8((C578890Mn9) akS472S0100000_8.l0, str, iStoryCanvasVideoHelper, 1)).LJL(C11S5.LIZ());
        }
        return C11NZ.LJJJJZ(AbstractC19852312lt.absent());
    }

    public static final Object apply$2(AkS472S0100000_8 akS472S0100000_8, Object obj) {
        C535020Kya c535020KyaLJFF;
        C535020Kya c535020Kya = (C535020Kya) obj;
        ((AlbumAiContentRepositoryImpl) akS472S0100000_8.l0).getClass();
        AlbumAiContentService.LIZ.getClass();
        AlbumAiContentService albumAiContentServiceLIZ = C523440Kfu.LIZ();
        if (albumAiContentServiceLIZ != null && (c535020KyaLJFF = albumAiContentServiceLIZ.LJFF(c535020Kya)) != null) {
            return c535020KyaLJFF;
        }
        return c535020Kya;
    }

    public static final Object apply$3(AkS472S0100000_8 akS472S0100000_8, Object obj) {
        AbstractC19484711Kz<C535020Kya> c19478811Is;
        InterfaceC534840KyI interfaceC534840KyI;
        C535020Kya c535020Kya = (C535020Kya) obj;
        if (!((AlbumAiContentRepositoryImpl) akS472S0100000_8.l0).LIZIZ.contains(Integer.valueOf(c535020Kya.LIZJ))) {
            c19478811Is = new C19478811Is<>(new ACallableS411S0100000_3(c535020Kya, 23));
        } else {
            C534850KyJ c534850KyJ = (C534850KyJ) ((Map) C534860KyK.LIZLLL.getValue()).get(Integer.valueOf(c535020Kya.LIZJ));
            if (c534850KyJ != null && (interfaceC534840KyI = c534850KyJ.LIZ) != null) {
                c19478811Is = interfaceC534840KyI.LIZ(c535020Kya);
            } else {
                c19478811Is = new C19478811Is<>(new ACallableS411S0100000_3(c535020Kya, 24));
            }
        }
        return c19478811Is.LJJ(C11S5.LIZ()).LJIL(new AkS472S0100000_8((AlbumAiContentRepositoryImpl) akS472S0100000_8.l0, 2)).LJIIL(new C09JN() { // from class: X.0KwY
            @Override // X.C09JN
            public final void accept(Object obj2) {
                C1C7U.LIZ("AlbumAiContentRepositoryImpl@e3c.fetchAiMediaModel$1$remoteAiContentList$1$4$2");
                C552700Lm0 c552700Lm0 = C552700Lm0.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ignore resolve ");
                sbLIZ.append(obj2);
                C201955140j.LJIJJ(c552700Lm0, "AlbumAiContentRepository", C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("AlbumAiContentRepositoryImpl@e3c.fetchAiMediaModel$1$remoteAiContentList$1$4$2");
            }
        }).LJJII(new AkS468S0100000_3(c535020Kya, 4));
    }

    public static final Object apply$4(AkS472S0100000_8 akS472S0100000_8, Object obj) {
        ArrayList arrayList = new ArrayList();
        C539870LFh c539870LFh = (C539870LFh) akS472S0100000_8.l0;
        for (Pair pair : (List) obj) {
            if (C2471909mP.LJJIII((String) pair.getFirst(), true, 4)) {
                arrayList.add(new C539860LFg((String) pair.getFirst(), c539870LFh.getShortVideoContext().getMusicPath(), (int) c539870LFh.getShortVideoContext().cameraComponentModel.mMaxDuration, (int) c539870LFh.getShortVideoContext().LJIILJJIL(), c539870LFh.getShortVideoContext().cameraComponentModel.musicEndTime, Boolean.FALSE, 128));
            } else {
                String str = (String) pair.getFirst();
                if (str == null) {
                    str = "";
                }
                VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str);
                if (videoFileInfo != null) {
                    int i = videoFileInfo.duration;
                    arrayList.add(new C539860LFg((String) pair.getFirst(), null, 0, i, 0, i, Boolean.TRUE, (String) pair.getSecond()));
                }
            }
        }
        return C11NZ.LJJJJZ(arrayList);
    }

    public static final Object apply$5(AkS472S0100000_8 akS472S0100000_8, Object obj) {
        return C11NZ.LJJJJLL(0L, ((C550940LjA) akS472S0100000_8.l0).LLJIJIL, 0L, 1L, TimeUnit.SECONDS).LJJJJZI(new AkS472S0100000_8((C548260Leq) obj, 7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$6(AkS472S0100000_8 akS472S0100000_8, Object obj) {
        int i = -1;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        Object[] objArr19 = 0 == true ? 1 : 0;
        Object[] objArr20 = 0 == true ? 1 : 0;
        Object[] objArr21 = 0 == true ? 1 : 0;
        Object[] objArr22 = 0 == true ? 1 : 0;
        Object[] objArr23 = 0 == true ? 1 : 0;
        Object[] objArr24 = 0 == true ? 1 : 0;
        Object[] objArr25 = 0 == true ? 1 : 0;
        Object[] objArr26 = 0 == true ? 1 : 0;
        Object[] objArr27 = 0 == true ? 1 : 0;
        Object[] objArr28 = 0 == true ? 1 : 0;
        Object[] objArr29 = 0 == true ? 1 : 0;
        Object[] objArr30 = 0 == true ? 1 : 0;
        Object[] objArr31 = 0 == true ? 1 : 0;
        Object[] objArr32 = 0 == true ? 1 : 0;
        Object[] objArr33 = 0 == true ? 1 : 0;
        Object[] objArr34 = 0 == true ? 1 : 0;
        Object[] objArr35 = 0 == true ? 1 : 0;
        Object[] objArr36 = 0 == true ? 1 : 0;
        Object[] objArr37 = 0 == true ? 1 : 0;
        Object[] objArr38 = 0 == true ? 1 : 0;
        Object[] objArr39 = 0 == true ? 1 : 0;
        Object[] objArr40 = 0 == true ? 1 : 0;
        Object[] objArr41 = 0 == true ? 1 : 0;
        Object[] objArr42 = 0 == true ? 1 : 0;
        Object[] objArr43 = 0 == true ? 1 : 0;
        Object[] objArr44 = 0 == true ? 1 : 0;
        Object[] objArr45 = 0 == true ? 1 : 0;
        Object[] objArr46 = 0 == true ? 1 : 0;
        Object[] objArr47 = 0 == true ? 1 : 0;
        Object[] objArr48 = 0 == true ? 1 : 0;
        Object[] objArr49 = 0 == true ? 1 : 0;
        Object[] objArr50 = 0 == true ? 1 : 0;
        Object[] objArr51 = 0 == true ? 1 : 0;
        Object[] objArr52 = 0 == true ? 1 : 0;
        Object[] objArr53 = 0 == true ? 1 : 0;
        Object[] objArr54 = 0 == true ? 1 : 0;
        Object[] objArr55 = 0 == true ? 1 : 0;
        Object[] objArr56 = 0 == true ? 1 : 0;
        Object[] objArr57 = 0 == true ? 1 : 0;
        Object[] objArr58 = 0 == true ? 1 : 0;
        Object[] objArr59 = 0 == true ? 1 : 0;
        Object[] objArr60 = 0 == true ? 1 : 0;
        Object[] objArr61 = 0 == true ? 1 : 0;
        Object[] objArr62 = 0 == true ? 1 : 0;
        Object[] objArr63 = 0 == true ? 1 : 0;
        Object[] objArr64 = 0 == true ? 1 : 0;
        Object[] objArr65 = 0 == true ? 1 : 0;
        Object[] objArr66 = 0 == true ? 1 : 0;
        Object[] objArr67 = 0 == true ? 1 : 0;
        Object[] objArr68 = 0 == true ? 1 : 0;
        Object[] objArr69 = 0 == true ? 1 : 0;
        Object[] objArr70 = 0 == true ? 1 : 0;
        Object[] objArr71 = 0 == true ? 1 : 0;
        Object[] objArr72 = 0 == true ? 1 : 0;
        Object[] objArr73 = 0 == true ? 1 : 0;
        Object[] objArr74 = 0 == true ? 1 : 0;
        Object[] objArr75 = 0 == true ? 1 : 0;
        Object[] objArr76 = 0 == true ? 1 : 0;
        Object[] objArr77 = 0 == true ? 1 : 0;
        Object[] objArr78 = 0 == true ? 1 : 0;
        Object[] objArr79 = 0 == true ? 1 : 0;
        Object[] objArr80 = 0 == true ? 1 : 0;
        Object[] objArr81 = 0 == true ? 1 : 0;
        Object[] objArr82 = 0 == true ? 1 : 0;
        Object[] objArr83 = 0 == true ? 1 : 0;
        Object[] objArr84 = 0 == true ? 1 : 0;
        Object[] objArr85 = 0 == true ? 1 : 0;
        Object[] objArr86 = 0 == true ? 1 : 0;
        Object[] objArr87 = 0 == true ? 1 : 0;
        Object[] objArr88 = 0 == true ? 1 : 0;
        Object[] objArr89 = 0 == true ? 1 : 0;
        Object[] objArr90 = 0 == true ? 1 : 0;
        Object[] objArr91 = 0 == true ? 1 : 0;
        Object[] objArr92 = 0 == true ? 1 : 0;
        Object[] objArr93 = 0 == true ? 1 : 0;
        Object[] objArr94 = 0 == true ? 1 : 0;
        Object[] objArr95 = 0 == true ? 1 : 0;
        Object[] objArr96 = 0 == true ? 1 : 0;
        Object[] objArr97 = 0 == true ? 1 : 0;
        Object[] objArr98 = 0 == true ? 1 : 0;
        Object[] objArr99 = 0 == true ? 1 : 0;
        Object[] objArr100 = 0 == true ? 1 : 0;
        Object[] objArr101 = 0 == true ? 1 : 0;
        Object[] objArr102 = 0 == true ? 1 : 0;
        Object[] objArr103 = 0 == true ? 1 : 0;
        Object[] objArr104 = 0 == true ? 1 : 0;
        Object[] objArr105 = 0 == true ? 1 : 0;
        Object[] objArr106 = 0 == true ? 1 : 0;
        Object[] objArr107 = 0 == true ? 1 : 0;
        Object[] objArr108 = 0 == true ? 1 : 0;
        Object[] objArr109 = 0 == true ? 1 : 0;
        Object[] objArr110 = 0 == true ? 1 : 0;
        Object[] objArr111 = 0 == true ? 1 : 0;
        Object[] objArr112 = 0 == true ? 1 : 0;
        Object[] objArr113 = 0 == true ? 1 : 0;
        Object[] objArr114 = 0 == true ? 1 : 0;
        Object[] objArr115 = 0 == true ? 1 : 0;
        Object[] objArr116 = 0 == true ? 1 : 0;
        Object[] objArr117 = 0 == true ? 1 : 0;
        Object[] objArr118 = 0 == true ? 1 : 0;
        Object[] objArr119 = 0 == true ? 1 : 0;
        Object[] objArr120 = 0 == true ? 1 : 0;
        Object[] objArr121 = 0 == true ? 1 : 0;
        Object[] objArr122 = 0 == true ? 1 : 0;
        Object[] objArr123 = 0 == true ? 1 : 0;
        Object[] objArr124 = 0 == true ? 1 : 0;
        Object[] objArr125 = 0 == true ? 1 : 0;
        Object[] objArr126 = 0 == true ? 1 : 0;
        Object[] objArr127 = 0 == true ? 1 : 0;
        Object[] objArr128 = 0 == true ? 1 : 0;
        Object[] objArr129 = 0 == true ? 1 : 0;
        Object[] objArr130 = 0 == true ? 1 : 0;
        Object[] objArr131 = 0 == true ? 1 : 0;
        Object[] objArr132 = 0 == true ? 1 : 0;
        Object[] objArr133 = 0 == true ? 1 : 0;
        Object[] objArr134 = 0 == true ? 1 : 0;
        Object[] objArr135 = 0 == true ? 1 : 0;
        Object[] objArr136 = 0 == true ? 1 : 0;
        Object[] objArr137 = 0 == true ? 1 : 0;
        Object[] objArr138 = 0 == true ? 1 : 0;
        Object[] objArr139 = 0 == true ? 1 : 0;
        Object[] objArr140 = 0 == true ? 1 : 0;
        Object[] objArr141 = 0 == true ? 1 : 0;
        Object[] objArr142 = 0 == true ? 1 : 0;
        Object[] objArr143 = 0 == true ? 1 : 0;
        Object[] objArr144 = 0 == true ? 1 : 0;
        Object[] objArr145 = 0 == true ? 1 : 0;
        Object[] objArr146 = 0 == true ? 1 : 0;
        Object[] objArr147 = 0 == true ? 1 : 0;
        Object[] objArr148 = 0 == true ? 1 : 0;
        Object[] objArr149 = 0 == true ? 1 : 0;
        Object[] objArr150 = 0 == true ? 1 : 0;
        Object[] objArr151 = 0 == true ? 1 : 0;
        Object[] objArr152 = 0 == true ? 1 : 0;
        Object[] objArr153 = 0 == true ? 1 : 0;
        Object[] objArr154 = 0 == true ? 1 : 0;
        Object[] objArr155 = 0 == true ? 1 : 0;
        Object[] objArr156 = 0 == true ? 1 : 0;
        Object[] objArr157 = 0 == true ? 1 : 0;
        Object[] objArr158 = 0 == true ? 1 : 0;
        Object[] objArr159 = 0 == true ? 1 : 0;
        Object[] objArr160 = 0 == true ? 1 : 0;
        Object[] objArr161 = 0 == true ? 1 : 0;
        Object[] objArr162 = 0 == true ? 1 : 0;
        Object[] objArr163 = 0 == true ? 1 : 0;
        Object[] objArr164 = 0 == true ? 1 : 0;
        Object[] objArr165 = 0 == true ? 1 : 0;
        Object[] objArr166 = 0 == true ? 1 : 0;
        Object[] objArr167 = 0 == true ? 1 : 0;
        Object[] objArr168 = 0 == true ? 1 : 0;
        Object[] objArr169 = 0 == true ? 1 : 0;
        Object[] objArr170 = 0 == true ? 1 : 0;
        Object[] objArr171 = 0 == true ? 1 : 0;
        Object[] objArr172 = 0 == true ? 1 : 0;
        Object[] objArr173 = 0 == true ? 1 : 0;
        Object[] objArr174 = 0 == true ? 1 : 0;
        Object[] objArr175 = 0 == true ? 1 : 0;
        Object[] objArr176 = 0 == true ? 1 : 0;
        Object[] objArr177 = 0 == true ? 1 : 0;
        Object[] objArr178 = 0 == true ? 1 : 0;
        Object[] objArr179 = 0 == true ? 1 : 0;
        Object[] objArr180 = 0 == true ? 1 : 0;
        Object[] objArr181 = 0 == true ? 1 : 0;
        Object[] objArr182 = 0 == true ? 1 : 0;
        Object[] objArr183 = 0 == true ? 1 : 0;
        Object[] objArr184 = 0 == true ? 1 : 0;
        Object[] objArr185 = 0 == true ? 1 : 0;
        Object[] objArr186 = 0 == true ? 1 : 0;
        Object[] objArr187 = 0 == true ? 1 : 0;
        Object[] objArr188 = 0 == true ? 1 : 0;
        Object[] objArr189 = 0 == true ? 1 : 0;
        Object[] objArr190 = 0 == true ? 1 : 0;
        Object[] objArr191 = 0 == true ? 1 : 0;
        Object[] objArr192 = 0 == true ? 1 : 0;
        Object[] objArr193 = 0 == true ? 1 : 0;
        Object[] objArr194 = 0 == true ? 1 : 0;
        Object[] objArr195 = 0 == true ? 1 : 0;
        Object[] objArr196 = 0 == true ? 1 : 0;
        Object[] objArr197 = 0 == true ? 1 : 0;
        Object[] objArr198 = 0 == true ? 1 : 0;
        Object[] objArr199 = 0 == true ? 1 : 0;
        Object[] objArr200 = 0 == true ? 1 : 0;
        Object[] objArr201 = 0 == true ? 1 : 0;
        Object[] objArr202 = 0 == true ? 1 : 0;
        Object[] objArr203 = 0 == true ? 1 : 0;
        Object[] objArr204 = 0 == true ? 1 : 0;
        Object[] objArr205 = 0 == true ? 1 : 0;
        Object[] objArr206 = 0 == true ? 1 : 0;
        Object[] objArr207 = 0 == true ? 1 : 0;
        CreativeModel creativeModel = new CreativeModel(null, objArr, objArr2, objArr3, objArr4, objArr5, objArr6, objArr7, objArr8, objArr9, objArr10, objArr11, objArr12, objArr13, objArr14, objArr15, objArr16, objArr17, objArr18, objArr19, objArr20, objArr21, objArr22, objArr23, objArr24, objArr25, objArr26, objArr27, objArr28, objArr29, objArr30, objArr31, objArr32, objArr33, objArr34, objArr35, objArr36, objArr37, objArr38, objArr39, 0, objArr40, objArr41, objArr42, objArr43, objArr44, objArr45, objArr46, objArr47, objArr48, objArr49, objArr50, objArr51, objArr52, objArr53, 0 == true ? 1 : 0, objArr54, objArr55, objArr56, objArr57, objArr58, objArr59, objArr60, objArr61, objArr62, objArr63, objArr64, objArr65, objArr66, objArr67, objArr68, objArr69, objArr70, objArr71, objArr72, objArr73, objArr74, objArr75, objArr76, objArr77, objArr78, objArr79, objArr80, objArr81, objArr82, objArr83, objArr84, objArr85, objArr86, objArr87, objArr88, objArr89, 0 == true ? 1 : 0, objArr90, objArr91, objArr92, objArr93, objArr94, objArr95, objArr96, objArr97, objArr98, objArr99, objArr100, objArr101, objArr102, objArr103, objArr104, objArr105, objArr106, objArr107, objArr108, objArr109, objArr110, objArr111, objArr112, objArr113, objArr114, objArr115, objArr116, objArr117, objArr118, objArr119, objArr120, objArr121, objArr122, objArr123, objArr124, objArr125, objArr126, objArr127, objArr128, objArr129, objArr130, objArr131, objArr132, objArr133, objArr134, objArr135, objArr136, objArr137, objArr138, objArr139, objArr140, objArr141, objArr142, objArr143, objArr144, objArr145, objArr146, objArr147, objArr148, objArr149, objArr150, objArr151, objArr152, objArr153, objArr154, objArr155, objArr156, objArr157, objArr158, objArr159, objArr160, objArr161, objArr162, objArr163, objArr164, objArr165, objArr166, objArr167, objArr168, objArr169, objArr170, objArr171, objArr172, objArr173, objArr174, objArr175, objArr176, objArr177, objArr178, objArr179, objArr180, objArr181, objArr182, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr183, 0 == true ? 1 : 0, objArr184, objArr185, objArr186, objArr187, objArr188, objArr189, objArr190, objArr191, objArr192, objArr193, objArr194, objArr195, objArr196, objArr197, objArr198, objArr199, objArr200, objArr201, objArr202, objArr203, objArr204, objArr205, objArr206, i, i, i, i, i, i, 2097151, objArr207);
        C569160MTy c569160MTy = C569160MTy.LIZ;
        IAITheaterCreationLauncher.EnterParams enterParamsG2 = ((C550940LjA) akS472S0100000_8.l0).G2();
        c569160MTy.getClass();
        C569160MTy.LIZIZ(creativeModel, enterParamsG2);
        C569160MTy.LIZLLL(creativeModel, (C548260Leq) obj, null);
        return creativeModel;
    }

    public static final Object apply$7(AkS472S0100000_8 akS472S0100000_8, Object obj) {
        return (C548260Leq) akS472S0100000_8.l0;
    }

    public static final Object apply$8(AkS472S0100000_8 akS472S0100000_8, Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof C0MD2) {
            return new C0MD3(((C0MD2) th).getErrorCode(), null);
        }
        if (th instanceof TimeoutException) {
            return new C0MD3(3001, null);
        }
        ((C564710MCv) akS472S0100000_8.l0).getContext();
        try {
            if (C036E.LIZ.LIZIZ()) {
                return new C0MD3(3003, null);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return new C0MD3(LSPassThroughRecordSizeConfig.DEFAULT, null);
    }

    public static final Object apply$9(AkS472S0100000_8 akS472S0100000_8, Object obj) {
        String strLIZLLL;
        AbstractC577050MkB abstractC577050MkBG8 = ((C577030Mk9) akS472S0100000_8.l0).i3().G8();
        if (abstractC577050MkBG8 == null || (strLIZLLL = abstractC577050MkBG8.LIZLLL()) == null) {
            return "";
        }
        return strLIZLLL;
    }
}
