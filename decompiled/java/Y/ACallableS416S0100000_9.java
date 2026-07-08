package Y;

import X.C1C7U;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2218281Bru;
import X.C588910N7x;
import X.C701850Rfz;
import X.C849850XVn;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.controller.PlayerController;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.api.MusicApi;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.simkit.model.LoudnessStrategyConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ttkmedia.datacenter.algo.AlgTaskCallback;
import com.ttkmedia.datacenter.algo.AlgTaskConfig;
import com.ttkmedia.datacenter.algo.AlgTaskManager;
import com.ttkmedia.datacenter.api.featurecenter.VCFeatureCenterManager;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class ACallableS416S0100000_9 implements Callable {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ Object call$0(ACallableS416S0100000_9 aCallableS416S0100000_9) {
        C1C7U.LIZ("MovieDetailPresenter@d088.sam$java_util_concurrent_Callable$0");
        Object objInvoke = ((Function0) aCallableS416S0100000_9.l0).invoke();
        C1C7U.LIZIZ("MovieDetailPresenter@d088.sam$java_util_concurrent_Callable$0");
        return objInvoke;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
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
            case 16:
                return call$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return call$17(this);
            default:
                return null;
        }
    }

    public static final Object call$1(ACallableS416S0100000_9 aCallableS416S0100000_9) {
        PlayerController playerController = (PlayerController) aCallableS416S0100000_9.l0;
        playerController.getClass();
        C1C7U.LIZ("PlayerController@7763.onRenderReadyDelay$2L");
        ((FeedCommonService) ServiceManager.get().getService(FeedCommonService.class)).LIZ();
        if ("homepage_hot".equals(playerController.mEventType)) {
            C849850XVn.LIZIZ.LIZJ().LIZLLL();
        }
        C1C7U.LIZIZ("PlayerController@7763.onRenderReadyDelay$2L");
        return null;
    }

    public static final Object call$10(ACallableS416S0100000_9 aCallableS416S0100000_9) {
        C1C7U.LIZ("CLAETHelper@dea0.triggerInETThread$1");
        ((Function0) aCallableS416S0100000_9.l0).invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CLAETHelper@dea0.triggerInETThread$1");
        return unit;
    }

    public static final Object call$11(ACallableS416S0100000_9 aCallableS416S0100000_9) {
        MusicModel musicModel = (MusicModel) aCallableS416S0100000_9.l0;
        C1C7U.LIZ("MusicDownloadPlayHelper@f063.getDownload$1L");
        if (TextUtils.isEmpty(musicModel.getMusicId())) {
            C1C7U.LIZIZ("MusicDownloadPlayHelper@f063.getDownload$1L");
            return musicModel;
        }
        if (musicModel.getMusic() == null || !musicModel.isUnlimitedMusic() || musicModel.getFromCollectionType() != 4 || ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin()) {
            musicModel.setMusic(MusicApi.LIZ(0, musicModel.getMusicId()).music);
        }
        musicModel.setMusicDetailFetched(true);
        musicModel.setStrongBeatUrl(musicModel.getMusic().getStrongBeatUrl());
        C1C7U.LIZIZ("MusicDownloadPlayHelper@f063.getDownload$1L");
        return musicModel;
    }

    public static final Object call$12(ACallableS416S0100000_9 aCallableS416S0100000_9) {
        ((FeedFollowFragment) aCallableS416S0100000_9.l0).getClass();
        C1C7U.LIZ("FeedFollowFragment@1d3d.onRefreshResult$1L");
        final int effectiveConnectionType = ((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).getEffectiveConnectionType();
        C20684815ws.LJIILLIIL("no_data_refresh_page", new HashMap<String, String>(effectiveConnectionType) { // from class: X.00ne
            {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(effectiveConnectionType);
                sbLIZ.append("");
                put("network_status", C2188811AlT.LIZIZ(sbLIZ));
                put("enter_from", "homepage_hot");
            }
        });
        C1C7U.LIZIZ("FeedFollowFragment@1d3d.onRefreshResult$1L");
        return null;
    }

    public static final Object call$13(ACallableS416S0100000_9 aCallableS416S0100000_9) {
        FeedItemList feedItemList = (FeedItemList) aCallableS416S0100000_9.l0;
        C1C7U.LIZ("FeedFetchModel@3835.fetchListFromCacheQueue$1L");
        C1C7U.LIZIZ("FeedFetchModel@3835.fetchListFromCacheQueue$1L");
        return feedItemList;
    }

    public static final Object call$14(ACallableS416S0100000_9 aCallableS416S0100000_9) {
        C1C7U.LIZ("FTCEditAudioRecordScene@eb2b.resetFromModel$1");
        ((Runnable) aCallableS416S0100000_9.l0).run();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FTCEditAudioRecordScene@eb2b.resetFromModel$1");
        return unit;
    }

    public static final Object call$15(ACallableS416S0100000_9 aCallableS416S0100000_9) {
        C1C7U.LIZ("AdSplashLogUtils@dcd2.reportSplashLog$1");
        AppLogNewUtils.onEventV3("adver_first_frame", (JSONObject) aCallableS416S0100000_9.l0);
        C1C7U.LIZIZ("AdSplashLogUtils@dcd2.reportSplashLog$1");
        return null;
    }

    public static final Object call$16(ACallableS416S0100000_9 aCallableS416S0100000_9) {
        C1C7U.LIZ("FcpFeedItemListHandler@ec8e.handleDataInternal$$inlined$callTaskInIO$1");
        for (Aweme aweme : (List) aCallableS416S0100000_9.l0) {
            C701850Rfz.LIZ.getClass();
            C701850Rfz.LIZ(aweme);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FcpFeedItemListHandler@ec8e.handleDataInternal$$inlined$callTaskInIO$1");
        return unit;
    }

    public static final Object call$17(ACallableS416S0100000_9 aCallableS416S0100000_9) {
        FeedItemList feedItemList = (FeedItemList) aCallableS416S0100000_9.l0;
        C1C7U.LIZ("AwemeModel@205.lambda$fetchPublicPostChunk$16$1$onNext$1L");
        C1C7U.LIZIZ("AwemeModel@205.lambda$fetchPublicPostChunk$16$1$onNext$1L");
        return feedItemList;
    }

    public static final Object call$2(ACallableS416S0100000_9 aCallableS416S0100000_9) {
        Runnable runnable = (Runnable) aCallableS416S0100000_9.l0;
        C1C7U.LIZ("PlayerController@7763.invokePlayerAnalyticsTracking$1L");
        runnable.run();
        C1C7U.LIZIZ("PlayerController@7763.invokePlayerAnalyticsTracking$1L");
        return "Done";
    }

    public static final Object call$3(ACallableS416S0100000_9 aCallableS416S0100000_9) {
        MusicModel musicModel = (MusicModel) aCallableS416S0100000_9.l0;
        C1C7U.LIZ("MusicRecordService@49d8.getMusicPre$1L");
        Music music = MusicApi.LIZ(0, musicModel.getMusicId()).music;
        C1C7U.LIZIZ("MusicRecordService@49d8.getMusicPre$1L");
        return music;
    }

    public static final Object call$4(ACallableS416S0100000_9 aCallableS416S0100000_9) {
        C1C7U.LIZ("EditAudioRecordScene@9075.resetFromModel$1");
        ((Runnable) aCallableS416S0100000_9.l0).run();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditAudioRecordScene@9075.resetFromModel$1");
        return unit;
    }

    public static final Object call$5(ACallableS416S0100000_9 aCallableS416S0100000_9) {
        C1C7U.LIZ("LocalVideoCache@1ed3.runOnUiThread$1");
        ((Function0) aCallableS416S0100000_9.l0).invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LocalVideoCache@1ed3.runOnUiThread$1");
        return unit;
    }

    public static final Object call$6(ACallableS416S0100000_9 aCallableS416S0100000_9) {
        C1C7U.LIZ("AbstractMessageHandler@d62f.async$1");
        ((Function0) aCallableS416S0100000_9.l0).invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AbstractMessageHandler@d62f.async$1");
        return unit;
    }

    public static final Object call$7(ACallableS416S0100000_9 aCallableS416S0100000_9) {
        C1C7U.LIZ("RxDisposableManager@a94e.submitRunnable$1");
        ((Runnable) aCallableS416S0100000_9.l0).run();
        Boolean bool = Boolean.TRUE;
        C1C7U.LIZIZ("RxDisposableManager@a94e.submitRunnable$1");
        return bool;
    }

    public static final Object call$8(ACallableS416S0100000_9 aCallableS416S0100000_9) throws Exception {
        String str;
        final C588910N7x c588910N7x = (C588910N7x) aCallableS416S0100000_9.l0;
        c588910N7x.getClass();
        C1C7U.LIZ("LoudnessStrategy@87c8.apply$1L");
        try {
            str = (String) VCFeatureCenterManager.getInstance().getBatchFeaturesFromNative(c588910N7x.LIZLLL, 3500);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            str = "";
        }
        c588910N7x.LIZ = new CountDownLatch(1);
        AlgTaskManager algTaskManager = AlgTaskManager.getInstance();
        HashMap<String, Object> map = new HashMap<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.get(next));
            }
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        AlgTaskConfig.Builder builder = new AlgTaskConfig.Builder();
        builder.setEntrance("LoudnessStrategy");
        LoudnessStrategyConfig loudnessStrategyConfig = C588910N7x.LJ;
        builder.setTimeOut(loudnessStrategyConfig.timeoutMs);
        builder.setCallType(14);
        int iPostTask = algTaskManager.postTask("smart_volume_balance", map, builder.build(), new AlgTaskCallback() { // from class: X.0N7y
            @Override // com.ttkmedia.datacenter.algo.AlgTaskCallback
            public final void onTaskFinish(boolean z, long j, long j2, HashMap map2) {
                Integer numValueOf;
                C588910N7x c588910N7x2 = c588910N7x;
                c588910N7x2.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LoudnessStrategy::postSmartTask.callback: ENTER, isSuccess=");
                sbLIZ.append(z);
                sbLIZ.append(", timestamp=");
                sbLIZ.append(j);
                sbLIZ.append(", timeConsume=");
                sbLIZ.append(j2);
                sbLIZ.append(", result.size()=");
                if (map2 != null) {
                    numValueOf = Integer.valueOf(map2.size());
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                C2188811AlT.LIZIZ(sbLIZ);
                if (z) {
                    Iterator it2 = map2.entrySet().iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                    HashMap map3 = (HashMap) map2.get("score_map");
                    Iterator<LoudnessStrategyConfig.Condition> it3 = C588910N7x.LJ.conditions.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        LoudnessStrategyConfig.Condition next2 = it3.next();
                        if (map3.containsKey(next2.label) && ((Float) map3.get(next2.label)).floatValue() >= next2.threshold) {
                            c588910N7x2.LIZJ = next2.adjust;
                            break;
                        }
                    }
                } else {
                    c588910N7x2.LIZJ = Float.MIN_VALUE;
                }
                if (c588910N7x2.LIZ != null) {
                    c588910N7x2.LIZ.countDown();
                }
            }
        });
        if (iPostTask == 0) {
            try {
                if (c588910N7x.LIZ.await(loudnessStrategyConfig.timeoutMs + 5, TimeUnit.MILLISECONDS)) {
                    Float fValueOf = Float.valueOf(c588910N7x.LIZJ);
                    C1C7U.LIZIZ("LoudnessStrategy@87c8.apply$1L");
                    return fValueOf;
                }
                throw new Exception("AlgTaskTimeout");
            } catch (InterruptedException e3) {
                TryCatchGuardChecker.doCheck(e3);
                throw e3;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PipelineError: ");
        sbLIZ.append(iPostTask);
        throw new Exception(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object call$9(ACallableS416S0100000_9 aCallableS416S0100000_9) throws InterruptedException {
        C1C7U.LIZ("FeedAudioMetricsHelper@f3a.beginCheckData$1");
        while (true) {
            C2218281Bru c2218281Bru = (C2218281Bru) aCallableS416S0100000_9.l0;
            if (c2218281Bru.LJIIL) {
                try {
                    ((C2218281Bru) aCallableS416S0100000_9.l0).LIZJ(c2218281Bru.LJII.take());
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("FeedAudioMetricsHelper@f3a.beginCheckData$1");
                return unit;
            }
        }
    }

    public ACallableS416S0100000_9(Runnable runnable, int i) {
        this.$t = i;
        if (2 - i != 0) {
            this.l0 = runnable;
        } else {
            this.l0 = runnable;
        }
    }

    public ACallableS416S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
