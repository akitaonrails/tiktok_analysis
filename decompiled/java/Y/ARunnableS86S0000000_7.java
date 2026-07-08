package Y;

import X.C0IUV;
import X.C1119120fEE;
import X.C1161920gLG;
import X.C1AC7;
import X.C1AD3;
import X.C1C7U;
import X.C464170IId;
import X.C465520INi;
import X.C465900IOu;
import X.C466700IRw;
import X.C480940ItY;
import X.C784440Upu;
import X.C786410Ut5;
import com.bytedance.android.live.browser.ILiveSparkService;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.comp.api.performance.IPerformanceService;
import com.bytedance.android.livesdk.init.BadPhonesCommonOptTask;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.log.monitor.IPerformanceManager;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes8.dex */
public class ARunnableS86S0000000_7 implements Runnable {
    public final int $t;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                BadPhonesCommonOptTask.lambda$preloadWatchWidgets$1();
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                BadPhonesCommonOptTask.lambda$preloadWatchWidgets$2();
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                BadPhonesCommonOptTask.lambda$preloadConfigs$3();
                break;
            case 14:
                BadPhonesCommonOptTask.lambda$preloadRetrofitApi$4();
                break;
            case 15:
                run$15(this);
                break;
            case 16:
                run$16(this);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                run$17(this);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                run$18(this);
                break;
            case 19:
                run$19(this);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                run$20(this);
                break;
            case 21:
                run$21(this);
                break;
            case 22:
                run$22(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C480940ItY.LIZ.getClass();
        long jLIZIZ = C1AD3.LIZIZ();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Set<Map.Entry<Long, Long>> setEntrySet = C480940ItY.LIZJ.entrySet();
        ArrayList<Map.Entry> arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            if (jCurrentTimeMillis - ((Number) ((Map.Entry) obj).getValue()).longValue() > jLIZIZ) {
                arrayList.add(obj);
            }
        }
        for (Map.Entry entry : arrayList) {
            C1AC7 c1ac7 = C1AC7.LIZ;
            Pair[] pairArr = {new Pair("roomId", entry.getKey()), new Pair("ageMs", Long.valueOf(jCurrentTimeMillis - ((Number) entry.getValue()).longValue())), new Pair("thresholdMs", Long.valueOf(jLIZIZ)), new Pair("reason", "max_age_expired")};
            c1ac7.getClass();
            C1AC7.LJIILL("eta_cache_expired", pairArr);
            C480940ItY c480940ItY = C480940ItY.LIZ;
            Long l = (Long) entry.getKey();
            c480940ItY.getClass();
            C480940ItY.LIZJ(l, "max_age_expired");
        }
        C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, C480940ItY.LIZLLL, this);
    }

    public ARunnableS86S0000000_7(int i) {
        this.$t = i;
    }

    public static final void run$0(ARunnableS86S0000000_7 aRunnableS86S0000000_7) {
        boolean zLIZ;
        C1C7U.LIZ("LivePrePlayerManger@3f2f.cleanupRunnable$1");
        try {
            aRunnableS86S0000000_7.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LivePrePlayerManger@3f2f.cleanupRunnable$1");
    }

    public static final void run$1(ARunnableS86S0000000_7 aRunnableS86S0000000_7) {
        C1C7U.LIZ("LiveRoomFragment@108c.newInstance$1L");
        IPerformanceManager iPerformanceManager = C465520INi.LIZ;
        iPerformanceManager.setIsAnchor(false);
        iPerformanceManager.V42();
        iPerformanceManager.Bl0();
        C1C7U.LIZIZ("LiveRoomFragment@108c.newInstance$1L");
    }

    public static final void run$10(ARunnableS86S0000000_7 aRunnableS86S0000000_7) {
        C1C7U.LIZ("LiveNewAudienceEndPresenter@b1c0.onDestroy$1L");
        C1C7U.LIZIZ("LiveNewAudienceEndPresenter@b1c0.onDestroy$1L");
    }

    public static final void run$15(ARunnableS86S0000000_7 aRunnableS86S0000000_7) {
        C1C7U.LIZ("LivePlayRootManagerV2@6c53.onCreateSecondStage$1L");
        ((ILiveSparkService) C1161920gLG.LIZJ(ILiveSparkService.class)).mT1(false);
        C1C7U.LIZIZ("LivePlayRootManagerV2@6c53.onCreateSecondStage$1L");
    }

    public static final void run$16(ARunnableS86S0000000_7 aRunnableS86S0000000_7) {
        C1C7U.LIZ("LivePlayRootManagerV2@6c53.start$2L");
        IPerformanceManager iPerformanceManager = C465520INi.LIZ;
        iPerformanceManager.setIsAnchor(false);
        iPerformanceManager.gV();
        C1C7U.LIZIZ("LivePlayRootManagerV2@6c53.start$2L");
    }

    public static final void run$17(ARunnableS86S0000000_7 aRunnableS86S0000000_7) {
        C1C7U.LIZ("NewFeedStyleEntranceUtils@a570.onFetchDataSuccess$1L");
        C0IUV.LIZ = false;
        C1C7U.LIZIZ("NewFeedStyleEntranceUtils@a570.onFetchDataSuccess$1L");
    }

    public static final void run$18(ARunnableS86S0000000_7 aRunnableS86S0000000_7) {
        C1C7U.LIZ("NewFeedStyleEntranceUtils@a570.fetchDrawFeedForyouPage$1L");
        C0IUV.LIZ = false;
        C1C7U.LIZIZ("NewFeedStyleEntranceUtils@a570.fetchDrawFeedForyouPage$1L");
    }

    public static final void run$19(ARunnableS86S0000000_7 aRunnableS86S0000000_7) {
        C1C7U.LIZ("NewFeedStyleEntranceUtils@a570.fetchDrawFeedForyouPage$2L");
        C0IUV.LIZ = false;
        C1C7U.LIZIZ("NewFeedStyleEntranceUtils@a570.fetchDrawFeedForyouPage$2L");
    }

    public static final void run$2(ARunnableS86S0000000_7 aRunnableS86S0000000_7) {
        boolean zLIZ;
        C1C7U.LIZ("LivePlayFragment@afba.onReceiveLiveEvent$1");
        try {
            C784440Upu.LIZ().LIZIZ(new C465900IOu(34));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LivePlayFragment@afba.onReceiveLiveEvent$1");
    }

    public static final void run$20(ARunnableS86S0000000_7 aRunnableS86S0000000_7) {
        C1C7U.LIZ("NewFeedStyleEntranceUtils@a570.onFetchDataFailure$1L");
        C0IUV.LIZ = false;
        C1C7U.LIZIZ("NewFeedStyleEntranceUtils@a570.onFetchDataFailure$1L");
    }

    public static final void run$21(ARunnableS86S0000000_7 aRunnableS86S0000000_7) {
        C1C7U.LIZ("NewFeedStyleEntranceUtils@a570.startWithGuaranteeData$1L");
        C0IUV.LIZ = false;
        C1C7U.LIZIZ("NewFeedStyleEntranceUtils@a570.startWithGuaranteeData$1L");
    }

    public static final void run$22(ARunnableS86S0000000_7 aRunnableS86S0000000_7) {
        C1C7U.LIZ("NewFeedStyleEntranceUtils@a570.startInnerFeedWithPreDataV2$1L");
        C0IUV.LIZ = false;
        C1C7U.LIZIZ("NewFeedStyleEntranceUtils@a570.startInnerFeedWithPreDataV2$1L");
    }

    public static final void run$3(ARunnableS86S0000000_7 aRunnableS86S0000000_7) {
        String str = LivePlayFragment._pnsPageId;
        C1C7U.LIZ("LivePlayFragment@afba.endRoom$1L");
        C464170IId.LIZ().LJIIL();
        C1C7U.LIZIZ("LivePlayFragment@afba.endRoom$1L");
    }

    public static final void run$4(ARunnableS86S0000000_7 aRunnableS86S0000000_7) {
        String str = LivePlayFragment._pnsPageId;
        C1C7U.LIZ("LivePlayFragment@afba.onEvent$2L");
        C464170IId.LIZ().LJIIL();
        C1C7U.LIZIZ("LivePlayFragment@afba.onEvent$2L");
    }

    public static final void run$5(ARunnableS86S0000000_7 aRunnableS86S0000000_7) {
        C1C7U.LIZ("LivePlayFragment@afba.<field>$1$onPlayDisplayed$4L");
        ((IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class)).cX();
        C1C7U.LIZIZ("LivePlayFragment@afba.<field>$1$onPlayDisplayed$4L");
    }

    public static final void run$6(ARunnableS86S0000000_7 aRunnableS86S0000000_7) {
        C1C7U.LIZ("LiveRoomFragment@108c.onCreate$1L");
        ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).Wr1().LIZ("watch_live");
        C1C7U.LIZIZ("LiveRoomFragment@108c.onCreate$1L");
    }

    public static final void run$7(ARunnableS86S0000000_7 aRunnableS86S0000000_7) {
        C1C7U.LIZ("LiveRoomFragment@108c.onCreate$10L");
        ((IRankService) C1161920gLG.LIZJ(IRankService.class)).XI2();
        C1119120fEE.LJII();
        C1C7U.LIZIZ("LiveRoomFragment@108c.onCreate$10L");
    }

    public static final void run$8(ARunnableS86S0000000_7 aRunnableS86S0000000_7) {
        C1C7U.LIZ("LiveRoomFragment@108c.onCreate$11L");
        C466700IRw.LIZ("live_watch_room");
        C1C7U.LIZIZ("LiveRoomFragment@108c.onCreate$11L");
    }

    public static final void run$9(ARunnableS86S0000000_7 aRunnableS86S0000000_7) {
        C1C7U.LIZ("AvatarImageWithLive@7e0f.showLive$1L");
        IPerformanceManager iPerformanceManager = C465520INi.LIZ;
        iPerformanceManager.Ym2();
        iPerformanceManager.setIsAnchor(false);
        iPerformanceManager.gV();
        C1C7U.LIZIZ("AvatarImageWithLive@7e0f.showLive$1L");
    }
}
