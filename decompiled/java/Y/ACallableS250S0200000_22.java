package Y;

import X.C0C1L;
import X.C0CHQ;
import X.C0LAB;
import X.C0VSJ;
import X.C1324750kZt;
import X.C1417160myw;
import X.C1417180myy;
import X.C1417330mzD;
import X.C1428520nHG;
import X.C1429320nIY;
import X.C1432030nMv;
import X.C1432620nNs;
import X.C1432850nOF;
import X.C1432910nOL;
import X.C1436690nUR;
import X.C1436730nUV;
import X.C1436760nUY;
import X.C1436770nUZ;
import X.C1436990nUv;
import X.C1439880nZa;
import X.C1441830ncj;
import X.C1444110ngP;
import X.C1450090nq3;
import X.C1450710nr3;
import X.C1450940nrQ;
import X.C1450990nrV;
import X.C1463670oBx;
import X.C1466860oH6;
import X.C1466870oH7;
import X.C1466880oH8;
import X.C15O7;
import X.C1629570sVX;
import X.C1C7U;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2298208zU;
import X.C2341909Fp;
import X.C2344009Gk;
import X.C2488709p7;
import X.C2489809pI;
import X.C297370Bl9;
import X.C348100Dkm;
import X.C352130DrH;
import X.C580320MpS;
import X.C580650Mpz;
import X.C918190a09;
import X.EnumC1432600nNq;
import X.EnumC20228214Cy;
import X.InterfaceC1432820nOC;
import X.InterfaceC1452170ntP;
import X.InterfaceC1631620sYq;
import X.InterfaceC2342209Fs;
import X.RunnableC1432010nMt;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.services.IVideo2GifService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewScene;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.extract.video.VideoFramesUploadService;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS566S0100000_22;
import v7.o;

/* JADX INFO: loaded from: classes23.dex */
public class ACallableS250S0200000_22 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return call$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return call$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return call$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return call$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return call$13(this);
            case 14:
                return call$14(this);
            case 15:
                return call$15(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$0(ACallableS250S0200000_22 aCallableS250S0200000_22) {
        C1C7U.LIZ("ImageViewManager@63e.compileTempImageForChange$1");
        C1450940nrQ c1450940nrQ = (C1450940nrQ) aCallableS250S0200000_22.l0;
        Bitmap bitmapLIZLLL = new RunnableC1432010nMt(c1450940nrQ.LIZIZ, c1450940nrQ.LIZJ, c1450940nrQ.LJI, (String) null, new C1432030nMv((Boolean) aCallableS250S0200000_22.l1, C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), ((C1450940nrQ) aCallableS250S0200000_22.l0).LJFF, EnumC20228214Cy.VE_PREVIEW_WORKSPACE, null, false, 12), ((C1450940nrQ) aCallableS250S0200000_22.l0).LJI.imageEditModel.map, 16), (Function1) (0 == true ? 1 : 0), (InterfaceC1631620sYq) (0 == true ? 1 : 0), 232).LIZLLL(((C1450940nrQ) aCallableS250S0200000_22.l0).LIZJ.getSurfaceData().getSurfaceViewWidth(), ((C1450940nrQ) aCallableS250S0200000_22.l0).LIZJ.getSurfaceData().getSurfaceViewHeight());
        C1C7U.LIZIZ("ImageViewManager@63e.compileTempImageForChange$1");
        return bitmapLIZLLL;
    }

    public static final Object call$1(ACallableS250S0200000_22 aCallableS250S0200000_22) {
        INLEMediaSession iNLEMediaSession;
        INLEMediaRuntime mediaRuntimeApi;
        Bitmap currDisplayImage;
        C1C7U.LIZ("ImageEditItemScene@e4f8.generateImageByNLE$3");
        InterfaceC1452170ntP value = ((C1450990nrV) aCallableS250S0200000_22.l0).LLLLL().g().getValue();
        if (value != null) {
            InterfaceC1452170ntP interfaceC1452170ntP = value;
            C1450990nrV c1450990nrV = (C1450990nrV) aCallableS250S0200000_22.l0;
            C1450090nq3 c1450090nq3 = c1450990nrV.LLJJJ;
            if (c1450090nq3 != null) {
                String id = c1450990nrV.LLJJIJIIJIL.getId();
                if (id != null) {
                    NLEModel nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntP);
                    if (nLEModelLIZ != null) {
                        c1450090nq3.LJ(nLEModelLIZ, id);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP);
            if (c348100DkmLIZIZ != null && (iNLEMediaSession = c348100DkmLIZIZ.LIZIZ) != null && (mediaRuntimeApi = iNLEMediaSession.getMediaRuntimeApi()) != null && (currDisplayImage = mediaRuntimeApi.getCurrDisplayImage()) != null) {
                Rect rect = (Rect) aCallableS250S0200000_22.l1;
                C1450990nrV c1450990nrV2 = (C1450990nrV) aCallableS250S0200000_22.l0;
                int width = currDisplayImage.getWidth();
                int height = currDisplayImage.getHeight();
                C1450940nrQ c1450940nrQ = null;
                if (rect.width() <= width && rect.height() <= height) {
                    int iMax = Math.max(rect.left, 0);
                    int iMax2 = Math.max(rect.top, 0);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(currDisplayImage, iMax, iMax2, Math.min(rect.right, width) - iMax, Math.min(rect.bottom, height) - iMax2);
                    C1450940nrQ c1450940nrQ2 = c1450990nrV2.LLJLIL;
                    if (c1450940nrQ2 != null) {
                        c1450940nrQ = c1450940nrQ2;
                    }
                    c1450940nrQ.LJII(bitmapCreateBitmap, c1450990nrV2.LLJJIJIL.getAutoEnhanceOn());
                    currDisplayImage.recycle();
                    BitmapCrashChecker.recordBitmapRecyclePoint(currDisplayImage);
                } else {
                    C1450940nrQ c1450940nrQ3 = c1450990nrV2.LLJLIL;
                    if (c1450940nrQ3 != null) {
                        c1450940nrQ = c1450940nrQ3;
                    }
                    c1450940nrQ.LJII(currDisplayImage, c1450990nrV2.LLJJIJIL.getAutoEnhanceOn());
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ImageEditItemScene@e4f8.generateImageByNLE$3");
            return unit;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Object call$10(ACallableS250S0200000_22 aCallableS250S0200000_22) {
        Object obj = aCallableS250S0200000_22.l0;
        final o oVar = (o) aCallableS250S0200000_22.l1;
        C1C7U.LIZ("OriginFramesUploader@4db1.createExtractCustomStickerTask$1L");
        if (obj instanceof VideoPublishEditModel) {
            new C1432850nOF((VideoPublishEditModel) obj).LJFF(new InterfaceC1432820nOC() { // from class: X.0nOI
                @Override // X.InterfaceC1432820nOC
                public final void onFinish(boolean z) {
                    oVar.LIZJ(null);
                }
            });
        } else {
            oVar.LIZJ(null);
        }
        C1C7U.LIZIZ("OriginFramesUploader@4db1.createExtractCustomStickerTask$1L");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5 A[PHI: r20
      0x00c5: PHI (r20v8 long) = (r20v7 long), (r20v11 long) binds: [B:39:0x00c2, B:34:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0158 A[PHI: r20
      0x0158: PHI (r20v2 long) = (r20v1 long), (r20v5 long) binds: [B:73:0x0155, B:68:0x0133] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$11(Y.ACallableS250S0200000_22 r26) {
        /*
            Method dump skipped, instruction units count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS250S0200000_22.call$11(Y.ACallableS250S0200000_22):java.lang.Object");
    }

    public static final Object call$12(ACallableS250S0200000_22 aCallableS250S0200000_22) {
        IVideo2GifService.ConvertListener convertListener = (IVideo2GifService.ConvertListener) aCallableS250S0200000_22.l0;
        C1463670oBx c1463670oBx = (C1463670oBx) aCallableS250S0200000_22.l1;
        C1C7U.LIZ("VEEditorConverter@9855.lambda$convert2Gif$3$1L");
        convertListener.onDone(false);
        c1463670oBx.destroy();
        C1C7U.LIZIZ("VEEditorConverter@9855.lambda$convert2Gif$3$1L");
        return null;
    }

    public static final Object call$13(ACallableS250S0200000_22 aCallableS250S0200000_22) throws InterruptedException {
        C1C7U.LIZ("EditCanvasEmbeddedStickerController@d5f5.onRenderContextReady$5");
        ((CountDownLatch) aCallableS250S0200000_22.l0).await();
        MutableLiveData mutableLiveData = ((C1450710nr3) aCallableS250S0200000_22.l1).LJ;
        Unit unit = Unit.LIZ;
        mutableLiveData.postValue(unit);
        C1C7U.LIZIZ("EditCanvasEmbeddedStickerController@d5f5.onRenderContextReady$5");
        return unit;
    }

    public static final Object call$14(ACallableS250S0200000_22 aCallableS250S0200000_22) {
        C1436770nUZ c1436770nUZ;
        C1C7U.LIZ("OriginalFrameUploadWaveTask@95c7.execute$1");
        C1436690nUR c1436690nUR = (C1436690nUR) aCallableS250S0200000_22.l0;
        ExtractFramesModel extractFramesModel = (ExtractFramesModel) aCallableS250S0200000_22.l1;
        c1436690nUR.getClass();
        Integer numValueOf = null;
        if (C0C1L.LIZ()) {
            PublishModel publishModel = c1436690nUR.LLILZLL;
            if (publishModel == null) {
                publishModel = null;
            }
            if (!publishModel.isEditSave) {
                VideoPublishEditModel videoPublishEditModel = c1436690nUR.LLIZ;
                if (videoPublishEditModel == null) {
                    videoPublishEditModel = null;
                }
                c1436690nUR.LJIJ(videoPublishEditModel, "backup_fake_uri");
                Keva keva = C1436760nUY.LIZ;
                VideoPublishEditModel videoPublishEditModel2 = c1436690nUR.LLIZ;
                if (videoPublishEditModel2 == null) {
                    videoPublishEditModel2 = null;
                }
                C1436760nUY.LIZ(videoPublishEditModel2.getCreationId(), "backup_fake_uri");
            }
        }
        C1436730nUV c1436730nUV = C1436730nUV.LIZ;
        VideoPublishEditModel videoPublishEditModel3 = c1436690nUR.LLIZ;
        if (videoPublishEditModel3 == null) {
            videoPublishEditModel3 = null;
        }
        String creationId = videoPublishEditModel3.getCreationId();
        c1436730nUV.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", creationId);
        C20684815ws.LJIILLIIL("tools_performance_save_local_watermark_moderation_start", c2344009Gk.LIZ);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1432910nOL c1432910nOL = new C1432910nOL();
        VideoFramesUploadService videoFramesUploadService = new VideoFramesUploadService();
        C1432620nNs c1432620nNs = new C1432620nNs(EnumC1432600nNq.WATERMARK_MODERATION, new AwS566S0100000_22(extractFramesModel, 1056));
        VideoPublishEditModel videoPublishEditModel4 = c1436690nUR.LLIZ;
        if (videoPublishEditModel4 == null) {
            videoPublishEditModel4 = null;
        }
        boolean z = true;
        C580320MpS.LIZ(videoPublishEditModel4, extractFramesModel, true);
        VideoPublishEditModel videoPublishEditModel5 = c1436690nUR.LLIZ;
        if (videoPublishEditModel5 == null) {
            videoPublishEditModel5 = null;
        }
        C15O7 c15o7LJI = C1432910nOL.LIZ(c1432620nNs, videoPublishEditModel5, null).LJI(new C1466880oH8(c1432910nOL, c1432620nNs, c1436690nUR, 3)).LIZLLL(new C1466860oH6(extractFramesModel, c1436690nUR, 13)).LJI(new C1466860oH6(c1432620nNs, videoFramesUploadService, 14)).LJI(new C1466860oH6(videoFramesUploadService, c1436690nUR, 15)).LJI(new C1466870oH7(c1436690nUR, 14));
        try {
            c15o7LJI.LJIJJLI();
            BaseResponse baseResponse = (BaseResponse) c15o7LJI.LJIIL();
            VideoPublishEditModel videoPublishEditModel6 = c1436690nUR.LLIZ;
            if (videoPublishEditModel6 == null) {
                videoPublishEditModel6 = null;
            }
            String creationId2 = videoPublishEditModel6.getCreationId();
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (!c15o7LJI.LJIILJJIL() || baseResponse == null || baseResponse.status_code != 0) {
                z = false;
            }
            C1436730nUV.LIZIZ(jCurrentTimeMillis2, creationId2, z);
            c1436690nUR.LJIILJJIL(40);
            if (!c15o7LJI.LJIILL() && baseResponse != null && baseResponse.status_code == 0) {
                c1436690nUR.LJIILLIIL(baseResponse);
            } else {
                if (c15o7LJI.LJIILL()) {
                    Exception excLJIIJJI = c15o7LJI.LJIIJJI();
                    if (!(excLJIIJJI instanceof C1436770nUZ) || (c1436770nUZ = (C1436770nUZ) excLJIIJJI) == null) {
                        c1436770nUZ = new C1436770nUZ(20002, "", c15o7LJI.LJIIJJI());
                    }
                } else {
                    if (baseResponse != null) {
                        numValueOf = Integer.valueOf(baseResponse.status_code);
                    }
                    c1436770nUZ = new C1436770nUZ(20003, String.valueOf(numValueOf), null);
                }
                c1436690nUR.LJIILL(c1436770nUZ);
            }
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            c1436690nUR.LJIILL(new C1436770nUZ(20000, "", null));
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            c1436690nUR.LJIILL(new C1436770nUZ(20001, "", e2));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OriginalFrameUploadWaveTask@95c7.execute$1");
        return unit;
    }

    public static final Object call$15(ACallableS250S0200000_22 aCallableS250S0200000_22) {
        C1C7U.LIZ("DefaultTaskExternalDependencyFactory@7684.getEditorCreator$1$create$task$1");
        C1441830ncj c1441830ncjLIZJ = C1439880nZa.LIZJ((VideoPublishEditModel) aCallableS250S0200000_22.l0, (C918190a09) aCallableS250S0200000_22.l1, null);
        C1C7U.LIZIZ("DefaultTaskExternalDependencyFactory@7684.getEditorCreator$1$create$task$1");
        return c1441830ncjLIZJ;
    }

    public static final Object call$2(ACallableS250S0200000_22 aCallableS250S0200000_22) throws Throwable {
        C1C7U.LIZ("ImageViewManager@63e.destroy$1$1");
        ((C1450940nrQ) aCallableS250S0200000_22.l0).LJIIIZ();
        if (C297370Bl9.LIZ()) {
            ((Function0) aCallableS250S0200000_22.l1).invoke();
            ((C1450940nrQ) aCallableS250S0200000_22.l0).LJIIIZ = null;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageViewManager@63e.destroy$1$1");
        return unit;
    }

    public static final Object call$3(ACallableS250S0200000_22 aCallableS250S0200000_22) throws Throwable {
        C1C7U.LIZ("ImageViewManager@63e.getLargeImageOptimizedBitmap$1$1");
        C1450940nrQ c1450940nrQ = (C1450940nrQ) aCallableS250S0200000_22.l0;
        Bitmap bitmap = (Bitmap) aCallableS250S0200000_22.l1;
        c1450940nrQ.getClass();
        C2488709p7 c2488709p7 = C2488709p7.LIZ;
        int i = c1450940nrQ.LIZLLL;
        c2488709p7.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append('_');
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append("_edit_temp_mini");
        sbLIZ.append(".jpeg");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        File fileLIZIZ = C2489809pI.LIZIZ(c1450940nrQ.LJFF);
        boolean zLJIIL = C2488709p7.LJIIL(bitmap, fileLIZIZ.getPath(), strLIZIZ);
        if (zLJIIL) {
            c1450940nrQ.LIZIZ.getEditImageInfo().setTempSynthesisMiniPath(new C0VSJ(fileLIZIZ, strLIZIZ).getPath(), !C0CHQ.LIZ().LJJIIJZLJL().LIZ());
        }
        C1450940nrQ.LJI(new C0VSJ(fileLIZIZ, strLIZIZ).getPath(), zLJIIL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageViewManager@63e.getLargeImageOptimizedBitmap$1$1");
        return unit;
    }

    public static final Object call$4(ACallableS250S0200000_22 aCallableS250S0200000_22) {
        C1C7U.LIZ("EditAutoCutComponent@9215.initObserver$3$2");
        C1417180myy c1417180myyLJII = C1417160myw.LJII(((C1417330mzD) aCallableS250S0200000_22.l0).getActivity(), ((C1417330mzD) aCallableS250S0200000_22.l0).Na(), ((C1417330mzD) aCallableS250S0200000_22.l0).LLJILJILJ, true);
        C1C7U.LIZIZ("EditAutoCutComponent@9215.initObserver$3$2");
        return c1417180myyLJII;
    }

    public static final Object call$5(ACallableS250S0200000_22 aCallableS250S0200000_22) {
        VEVideoPublishPreviewScene vEVideoPublishPreviewScene = (VEVideoPublishPreviewScene) aCallableS250S0200000_22.l0;
        C0LAB c0lab = (C0LAB) aCallableS250S0200000_22.l1;
        vEVideoPublishPreviewScene.getClass();
        C1C7U.LIZ("VEVideoPublishPreviewScene@ca2a.mobPublishPreview$1L");
        c0lab.LJ("original_resolution", C1428520nHG.LJJIJL(vEVideoPublishPreviewScene.LLJL));
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("tool_performance_publish_preview", c0lab.LIZ);
        C1C7U.LIZIZ("VEVideoPublishPreviewScene@ca2a.mobPublishPreview$1L");
        return null;
    }

    public static final Object call$6(ACallableS250S0200000_22 aCallableS250S0200000_22) {
        C0LAB c0lab = (C0LAB) aCallableS250S0200000_22.l0;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aCallableS250S0200000_22.l1;
        C1C7U.LIZ("VideoPublishContainerScene@d2f3.monitorEnterPublish$1L");
        c0lab.LJ("original_resolution", C1428520nHG.LJJIJL(videoPublishEditModel));
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("tool_performance_publish_first_frame", c0lab.LIZ);
        C1C7U.LIZIZ("VideoPublishContainerScene@d2f3.monitorEnterPublish$1L");
        return null;
    }

    public static final Object call$7(ACallableS250S0200000_22 aCallableS250S0200000_22) {
        boolean zLJIIIIZZ;
        C1C7U.LIZ("EditStickerCompileComponent@a7e2.compileStickersOnly$2");
        C1436990nUv.LJIIIZ((InterfaceC1452170ntP) aCallableS250S0200000_22.l1, ((C1444110ngP) aCallableS250S0200000_22.l0).T2());
        VideoPublishEditModel videoPublishEditModelT2 = ((C1444110ngP) aCallableS250S0200000_22.l0).T2();
        NLEModel nLEModelLIZ = C352130DrH.LIZ((InterfaceC1452170ntP) aCallableS250S0200000_22.l1);
        if (nLEModelLIZ != null) {
            zLJIIIIZZ = C1429320nIY.LJIIIIZZ(nLEModelLIZ);
        } else {
            zLJIIIIZZ = false;
        }
        C1436990nUv.LJIIIIZZ(videoPublishEditModelT2, zLJIIIIZZ);
        C580650Mpz.LIZ(((C1444110ngP) aCallableS250S0200000_22.l0).T2());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditStickerCompileComponent@a7e2.compileStickersOnly$2");
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$8(Y.ACallableS250S0200000_22 r4) {
        /*
            java.lang.String r3 = "EditStickerCompileComponent@a7e2.compileStickersOnly$updateAIGCTask$1"
            X.C1C7U.LIZ(r3)
            java.lang.Object r0 = r4.l0
            X.0ngP r0 = (X.C1444110ngP) r0
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r0.T2()
            java.lang.Object r0 = r4.l1
            X.0ntP r0 = (X.InterfaceC1452170ntP) r0
            X.C1436990nUv.LJIIIZ(r0, r1)
            java.lang.Object r0 = r4.l0
            X.0ngP r0 = (X.C1444110ngP) r0
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r0.T2()
            java.lang.Object r0 = r4.l1
            X.0ntP r0 = (X.InterfaceC1452170ntP) r0
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = X.C352130DrH.LIZ(r0)
            if (r0 == 0) goto L36
            boolean r1 = X.C1429320nIY.LJIIIIZZ(r0)
            r0 = 1
            if (r1 != r0) goto L36
        L2d:
            X.C1436990nUv.LJIIIIZZ(r2, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r3)
            return r0
        L36:
            r0 = 0
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS250S0200000_22.call$8(Y.ACallableS250S0200000_22):java.lang.Object");
    }

    public static final Object call$9(ACallableS250S0200000_22 aCallableS250S0200000_22) {
        String str;
        List<String> urlList;
        C1C7U.LIZ("DownloadStickerAndHintIconCombiner@4b5.download$4");
        C1629570sVX c1629570sVX = (C1629570sVX) aCallableS250S0200000_22.l0;
        Effect effect = (Effect) aCallableS250S0200000_22.l1;
        c1629570sVX.getClass();
        UrlModel hintIcon = effect.getHintIcon();
        boolean z = true;
        if (hintIcon != null && (urlList = hintIcon.getUrlList()) != null && !urlList.isEmpty()) {
            str = (String) ListProtector.get(urlList, 0);
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str) || C1324750kZt.LJIIZILJ(UriProtector.parse(str))) {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("DownloadStickerAndHintIconCombiner@4b5.download$4");
        return boolValueOf;
    }

    public ACallableS250S0200000_22(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public ACallableS250S0200000_22(VideoPublishEditModel videoPublishEditModel, C1432620nNs c1432620nNs, o oVar, int i) {
        this.$t = i;
        this.l0 = videoPublishEditModel;
        this.l1 = oVar;
    }
}
