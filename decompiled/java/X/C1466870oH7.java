package X;

import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.autocut.sdk.data.NLEModelResponse;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.external.IGetPublishDraftCallback;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AutoApplyMusicResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.social.creation.edit.SocialVideoEditContainerScene;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.AVApi;
import com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadTask;
import com.ss.android.vesdk.LoudnessDetectResult;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0oH7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1466870oH7 implements InterfaceC2385309Wh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            case 2:
                return then$2(this, c15o7);
            case 3:
                return then$3(this, c15o7);
            case 4:
                return then$4(this, c15o7);
            case 5:
                return then$5(this, c15o7);
            case 6:
                return then$6(this, c15o7);
            case 7:
                return then$7(this, c15o7);
            case 8:
                return then$8(this, c15o7);
            case BdTuring.TYPE_ECAF /* 9 */:
                return then$9(this, c15o7);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return then$10(this, c15o7);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return then$11(this, c15o7);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return then$12(this, c15o7);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return then$13(this, c15o7);
            case 14:
                return then$14(this, c15o7);
            default:
                return null;
        }
    }

    public C1466870oH7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object then$0(C1466870oH7 c1466870oH7, C15O7 c15o7) {
        List<AutoCutMediaModel> list;
        C1C7U.LIZ("EditAutoCutComponent@9215.initObserver$3$3");
        AutoCutModel autoCutModel = ((C1417330mzD) c1466870oH7.l0).Na().creativeModel.autoCutModel;
        C1417180myy c1417180myy = (C1417180myy) c15o7.LJIIL();
        if (c1417180myy != null) {
            list = c1417180myy.LIZ;
        } else {
            list = null;
        }
        autoCutModel.curMediaList = C1416110mxF.LIZ(list);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditAutoCutComponent@9215.initObserver$3$3");
        return unit;
    }

    public static final Object then$1(C1466870oH7 c1466870oH7, C15O7 c15o7) {
        AVMusic aVMusic;
        VideoEditContainerScene videoEditContainerScene = (VideoEditContainerScene) c1466870oH7.l0;
        String str = VideoEditContainerScene.LLLLLILLIL;
        videoEditContainerScene.getClass();
        C1C7U.LIZ("VideoEditContainerScene@649c.fetchAiselfMusic$2L");
        if (c15o7.LJIILJJIL() && (aVMusic = (AVMusic) c15o7.LJIIL()) != null) {
            aVMusic.getDuration();
            aVMusic.setMusicStartFromCut(0);
            videoEditContainerScene.LLJZIJLIL.setMMusicStart(0);
            C10I1.LIZ(aVMusic);
            videoEditContainerScene.LLLILZLLLI.LLJILLL.Xq();
            videoEditContainerScene.LLLILZLLLI.LLJILLL.Rq(aVMusic.path, aVMusic, false, false, false, false, aVMusic.getDuration(), false, true, "", false, null);
        }
        C1C7U.LIZIZ("VideoEditContainerScene@649c.fetchAiselfMusic$2L");
        return null;
    }

    public static final Object then$10(C1466870oH7 c1466870oH7, C15O7 c15o7) {
        AVMusic aVMusic;
        InterfaceC1454960nxu interfaceC1454960nxuLLLLLIL;
        InterfaceC1454960nxu interfaceC1454960nxuLLLLLIL2;
        C1C7U.LIZ("SocialVideoEditContainerScene@5a77.fetchAiselfMusic$2");
        if (c15o7 != null && c15o7.LJIILJJIL() && (aVMusic = (AVMusic) c15o7.LJIIL()) != null) {
            aVMusic.setMusicStartFromCut(0);
            C10I1.LIZ(aVMusic);
            AbstractC1453750nvx abstractC1453750nvx = ((SocialVideoEditContainerScene) c1466870oH7.l0).LLL;
            if (abstractC1453750nvx != null && (interfaceC1454960nxuLLLLLIL2 = abstractC1453750nvx.LLLLLIL()) != null) {
                interfaceC1454960nxuLLLLLIL2.Xq();
            }
            AbstractC1453750nvx abstractC1453750nvx2 = ((SocialVideoEditContainerScene) c1466870oH7.l0).LLL;
            if (abstractC1453750nvx2 != null && (interfaceC1454960nxuLLLLLIL = abstractC1453750nvx2.LLLLLIL()) != null) {
                interfaceC1454960nxuLLLLLIL.Rq(aVMusic.path, aVMusic, false, false, false, false, aVMusic.getDuration(), false, true, "", false, null);
            }
        }
        C1C7U.LIZIZ("SocialVideoEditContainerScene@5a77.fetchAiselfMusic$2");
        return null;
    }

    public static final Object then$11(C1466870oH7 c1466870oH7, C15O7 c15o7) {
        C1C7U.LIZ("StickPointVideoPresenter@671e.updateAlgorithmFromNormal$2");
        if (c15o7 != null && c15o7.LJIIL() != null) {
            InterfaceC358010E1v interfaceC358010E1v = (InterfaceC358010E1v) c1466870oH7.l0;
            if (interfaceC358010E1v != null) {
                interfaceC358010E1v.LIZ(((Number) c15o7.LJIIL()).intValue());
            }
        } else {
            InterfaceC358010E1v interfaceC358010E1v2 = (InterfaceC358010E1v) c1466870oH7.l0;
            if (interfaceC358010E1v2 != null) {
                interfaceC358010E1v2.onFailed();
            }
        }
        C1C7U.LIZIZ("StickPointVideoPresenter@671e.updateAlgorithmFromNormal$2");
        return null;
    }

    public static final Object then$12(C1466870oH7 c1466870oH7, C15O7 c15o7) {
        C1C7U.LIZ("StickPointVideoPresenter@671e.startDefaultStickPoint$1");
        if (c15o7 != null && c15o7.LJIIL() != null && ((Number) c15o7.LJIIL()).intValue() >= 0) {
            InterfaceC358010E1v interfaceC358010E1v = (InterfaceC358010E1v) c1466870oH7.l0;
            if (interfaceC358010E1v != null) {
                interfaceC358010E1v.LIZ(((Number) c15o7.LJIIL()).intValue());
            }
        } else {
            InterfaceC358010E1v interfaceC358010E1v2 = (InterfaceC358010E1v) c1466870oH7.l0;
            if (interfaceC358010E1v2 != null) {
                interfaceC358010E1v2.onFailed();
            }
        }
        C1C7U.LIZIZ("StickPointVideoPresenter@671e.startDefaultStickPoint$1");
        return null;
    }

    public static final Object then$13(C1466870oH7 c1466870oH7, C15O7 c15o7) {
        int errorCode;
        C23112093u c23112093u;
        C1C7U.LIZ("AIChooseMusicManager@73c4.getAedAutoApplyMusic$1$1");
        Object objLJIIL = c15o7.LJIIL();
        if (objLJIIL != null) {
            ((C09AJ) c1466870oH7.l0).onNext(objLJIIL);
        } else {
            Exception excLJIIJJI = c15o7.LJIIJJI();
            if ((excLJIIJJI instanceof C0XIR) && (c23112093u = (C23112093u) excLJIIJJI) != null) {
                errorCode = c23112093u.getErrorCode();
            } else {
                errorCode = -1;
            }
            AutoApplyMusicResponse autoApplyMusicResponse = new AutoApplyMusicResponse(null, null);
            autoApplyMusicResponse.needAutoApplyMusic = Boolean.FALSE;
            autoApplyMusicResponse.status_code = errorCode;
            ((C09AJ) c1466870oH7.l0).onNext(autoApplyMusicResponse);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIChooseMusicManager@73c4.getAedAutoApplyMusic$1$1");
        return unit;
    }

    public static final Object then$14(C1466870oH7 c1466870oH7, C15O7 c15o7) {
        C15O7<BaseResponse> c15o7LIZ;
        C1C7U.LIZ("OriginalFrameUploadWaveTask@95c7.startModeration$uploadTask$5");
        if (c15o7.LJIILL()) {
            c15o7LIZ = C15O7.LJIIIZ(c15o7.LJIIJJI());
        } else {
            C1441520ncE c1441520ncE = (C1441520ncE) c15o7.LJIIL();
            c15o7LIZ = null;
            Integer numValueOf = null;
            if (c1441520ncE != null) {
                PublishModel publishModel = ((C1436690nUR) c1466870oH7.l0).LLILZLL;
                InterfaceC1441510ncD interfaceC1441510ncD = (InterfaceC1441510ncD) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(((AVApi) ServiceManager.get().getService(AVApi.class)).LIZ()).create(InterfaceC1441510ncD.class);
                int i = c1441520ncE.LIZIZ;
                if (i != -1) {
                    numValueOf = Integer.valueOf(i);
                }
                c15o7LIZ = interfaceC1441510ncD.LIZ(null, c1441520ncE.LIZLLL, c1441520ncE.LJ, c1441520ncE.LJI.getStickerIds(), numValueOf, Integer.valueOf(c1441520ncE.LIZJ));
            }
        }
        C1C7U.LIZIZ("OriginalFrameUploadWaveTask@95c7.startModeration$uploadTask$5");
        return c15o7LIZ;
    }

    public static final Object then$2(C1466870oH7 c1466870oH7, C15O7 c15o7) {
        Intent intent = (Intent) c1466870oH7.l0;
        C1C7U.LIZ("AVToolsHelper@51fc.fetchData$1L");
        if (((BaseBundle) c15o7.LJIIL()).containsKey("first_sticker")) {
            intent.putExtra("show_preloading_dialog", false);
        }
        C15O7 c15o7LJIIJ = C15O7.LJIIJ(c15o7.LJIIL());
        C1C7U.LIZIZ("AVToolsHelper@51fc.fetchData$1L");
        return c15o7LJIIJ;
    }

    public static final Object then$3(C1466870oH7 c1466870oH7, C15O7 c15o7) {
        C1C7U.LIZ("OriginalSoundUploadService@5e57.onHandleWork$2$uploadTask$3");
        if (c15o7.LJIILL()) {
            for (OriginalSoundUploadTask originalSoundUploadTask : (ArrayList) ((C1441600ncM) c1466870oH7.l0).LIZ) {
                C1637890six.LIZ("aweme_movie_publish_log", "upload_audio", C2347509Ht.LIZ(C2097608Jq.LJIIIIZZ(new Pair("success", CardStruct.IStatusCode.DEFAULT), new Pair("success_mid", originalSoundUploadTask.vid), new Pair("aweme_id", originalSoundUploadTask.awemeId), new Pair("errorDesc", C08KI.LIZ(c15o7.LJIIJJI())))));
            }
        } else {
            for (OriginalSoundUploadTask originalSoundUploadTask2 : (ArrayList) ((C1441600ncM) c1466870oH7.l0).LIZ) {
                C1637890six.LIZ("aweme_movie_publish_log", "upload_audio", C2347509Ht.LIZ(C2097608Jq.LJIIIIZZ(new Pair("success", "1"), new Pair("success_mid", originalSoundUploadTask2.vid), new Pair("aweme_id", originalSoundUploadTask2.awemeId))));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OriginalSoundUploadService@5e57.onHandleWork$2$uploadTask$3");
        return unit;
    }

    public static final Object then$4(C1466870oH7 c1466870oH7, C15O7 c15o7) {
        Bundle bundle;
        C1C7U.LIZ("BaseTTEditPreviewComponent@89f0.onCreate$3$1");
        C1422040n6o c1422040n6o = C1422040n6o.LIZ;
        VideoPublishEditContainerScene videoPublishEditContainerSceneKc = ((C1452090ntH) c1466870oH7.l0).Kc();
        if (videoPublishEditContainerSceneKc == null || (bundle = videoPublishEditContainerSceneKc.requireArgumentsSafely()) == null) {
            AbstractC214814194y abstractC214814194yKc = ((C1452090ntH) c1466870oH7.l0).kc();
            if (abstractC214814194yKc != null) {
                bundle = abstractC214814194yKc.requireArgumentsSafely();
            } else {
                bundle = new Bundle();
            }
        }
        VideoPublishEditModel videoPublishEditModelDc = ((C1452090ntH) c1466870oH7.l0).dc();
        C1452090ntH c1452090ntH = (C1452090ntH) c1466870oH7.l0;
        long j = c1452090ntH.n;
        long j2 = c1452090ntH.p;
        long j3 = ((C1452090ntH) c1466870oH7.l0).q;
        C1452090ntH c1452090ntH2 = (C1452090ntH) c1466870oH7.l0;
        C1422050n6p c1422050n6p = new C1422050n6p(c1452090ntH2.o, c1452090ntH2.s, c1452090ntH2.u, c1452090ntH2.t, c1452090ntH2.w);
        c1422040n6o.getClass();
        C1422040n6o.LIZIZ(bundle, videoPublishEditModelDc, j, j2, j3, c1422050n6p);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseTTEditPreviewComponent@89f0.onCreate$3$1");
        return unit;
    }

    public static final Object then$5(C1466870oH7 c1466870oH7, C15O7 c15o7) {
        C1C7U.LIZ("EditStickerCompileComponent@a7e2.compileStickersOnly$3");
        Runnable runnable = (Runnable) c1466870oH7.l0;
        if (runnable != null) {
            runnable.run();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditStickerCompileComponent@a7e2.compileStickersOnly$3");
        return unit;
    }

    public static final Object then$6(C1466870oH7 c1466870oH7, C15O7 c15o7) {
        IGetPublishDraftCallback iGetPublishDraftCallback = (IGetPublishDraftCallback) c1466870oH7.l0;
        C1C7U.LIZ("PublishServiceImpl@ed81.getRecoverDraftByDraftPrimaryKey$2L");
        AwemeDraft awemeDraft = (AwemeDraft) c15o7.LJIIL();
        if (awemeDraft != null) {
            iGetPublishDraftCallback.onSuccess(awemeDraft);
        } else {
            iGetPublishDraftCallback.onFail();
        }
        C1C7U.LIZIZ("PublishServiceImpl@ed81.getRecoverDraftByDraftPrimaryKey$2L");
        return null;
    }

    public static final Object then$7(C1466870oH7 c1466870oH7, C15O7 c15o7) {
        IGetPublishDraftCallback iGetPublishDraftCallback = (IGetPublishDraftCallback) c1466870oH7.l0;
        C1C7U.LIZ("PublishServiceImpl@ed81.doGetRecoverDraftIfAny$2L");
        AwemeDraft awemeDraft = (AwemeDraft) c15o7.LJIIL();
        if (awemeDraft != null) {
            iGetPublishDraftCallback.onSuccess(awemeDraft);
        } else {
            iGetPublishDraftCallback.onFail();
        }
        C1C7U.LIZIZ("PublishServiceImpl@ed81.doGetRecoverDraftIfAny$2L");
        return null;
    }

    public static final Object then$8(C1466870oH7 c1466870oH7, C15O7 c15o7) {
        LoudnessDetectResult loudnessDetectResult;
        LoudnessDetectResult[] loudnessDetectResultArr = (LoudnessDetectResult[]) c15o7.LJIIL();
        if (loudnessDetectResultArr != null && (loudnessDetectResult = loudnessDetectResultArr[0]) != null && loudnessDetectResult.result == 0) {
            double d = loudnessDetectResult.peakLoudness;
            double d2 = loudnessDetectResult.avgLoudness;
            AbstractC1452680nuE abstractC1452680nuE = (AbstractC1452680nuE) c1466870oH7.l0;
            C391360FWc.LIZIZ(abstractC1452680nuE, "VEVideoEditor.addBalanceFilterWithDetect", abstractC1452680nuE.LJIJ(), new C349370Dmp((AbstractC1452680nuE) c1466870oH7.l0, d, d2));
        }
        return Unit.LIZ;
    }

    public static final Object then$9(C1466870oH7 c1466870oH7, C15O7 c15o7) {
        Object objValueOf;
        C1C7U.LIZ("AutoCutNLEModelDelegate@8393.request$disposable$1$1");
        if (!c15o7.LJIILL() && c15o7.LJIILJJIL()) {
            if (C123100dR.LIZ((String) c15o7.LJIIL())) {
                ((C09AJ) c1466870oH7.l0).onNext(c15o7.LJIIL());
                objValueOf = Unit.LIZ;
            } else {
                objValueOf = Boolean.valueOf(((C09AJ) c1466870oH7.l0).tryOnError(new C1419360n2U((NLEModelResponse) null, 3)));
            }
        } else {
            objValueOf = Boolean.valueOf(((C09AJ) c1466870oH7.l0).tryOnError(c15o7.LJIIJJI()));
        }
        C1C7U.LIZIZ("AutoCutNLEModelDelegate@8393.request$disposable$1$1");
        return objValueOf;
    }
}
