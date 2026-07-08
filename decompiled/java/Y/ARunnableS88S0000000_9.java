package Y;

import X.C08TN;
import X.C0CD2;
import X.C0VWN;
import X.C0X35;
import X.C1126604au;
import X.C1150504el;
import X.C1602200rnO;
import X.C1C7U;
import X.C202098145w;
import X.C202103146b;
import X.C20508081q;
import X.C2187451AjH;
import X.C2201531BEh;
import X.C2277891EDz;
import X.C2487409ou;
import X.C582130MsN;
import X.C582600Mt8;
import X.C583130Mtz;
import X.C583140Mu0;
import X.C584420Mw4;
import X.C584470Mw9;
import X.C587180N1g;
import X.C786410Ut5;
import X.C799180VWq;
import X.C799900VZk;
import X.C810560Vqw;
import X.C810890VrT;
import X.C823050WQl;
import X.EnumC585000Mx0;
import X.InterfaceC582280Msc;
import X.InterfaceC582400Mso;
import android.view.Choreographer;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.anchor.service.IAnchorMakerInitService;
import com.ss.android.ugc.aweme.feed.controller.PlayerController;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.util.IStartupFeedAwemesService;
import com.ss.android.ugc.awemepushlib.interaction.PushSheduler;
import com.ttkmedia.datacenter.api.featurecenter.VCFeatureCenterManager;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class ARunnableS88S0000000_9 implements Runnable {
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
                PlayerController.LLIIZ();
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
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
            case 23:
                run$23(this);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                run$24(this);
                break;
            case 25:
                run$25(this);
                break;
            case 26:
                run$26(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public ARunnableS88S0000000_9(int i) {
        this.$t = i;
    }

    public static final void run$0(ARunnableS88S0000000_9 aRunnableS88S0000000_9) {
        boolean zLIZ;
        C1C7U.LIZ("StrategyCenterService@9e57.registerSignalChannelProviders$1");
        try {
            C583140Mu0 c583140Mu0 = C583130Mtz.LIZ;
            InterfaceC582400Mso interfaceC582400Mso = new InterfaceC582400Mso() { // from class: X.0Mu1
                @Override // X.InterfaceC582400Mso
                public final Object query(String str) {
                    return null;
                }

                @Override // X.InterfaceC582400Mso
                public final Object LIZ(C581510MrN c581510MrN) {
                    return VCFeatureCenterManager.getInstance().getVideoFeatureFromNative(c581510MrN.LIZIZ, "", c581510MrN.LIZ);
                }
            };
            if (!((CopyOnWriteArrayList) c583140Mu0.LIZLLL).contains(interfaceC582400Mso)) {
                ((CopyOnWriteArrayList) c583140Mu0.LIZLLL).add(interfaceC582400Mso);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StrategyCenterService@9e57.registerSignalChannelProviders$1");
    }

    public static final void run$1(ARunnableS88S0000000_9 aRunnableS88S0000000_9) {
        C1C7U.LIZ("SimPageScrollStatusHelper@592b.onPageScrollStateChanged$1L");
        Iterator<WeakReference<Runnable>> it2 = C587180N1g.LIZLLL.iterator();
        while (it2.hasNext()) {
            Runnable runnable = it2.next().get();
            if (runnable != null) {
                runnable.run();
            }
        }
        C587180N1g.LIZLLL.clear();
        C587180N1g.LIZIZ(false);
        C1C7U.LIZIZ("SimPageScrollStatusHelper@592b.onPageScrollStateChanged$1L");
    }

    public static final void run$10(ARunnableS88S0000000_9 aRunnableS88S0000000_9) {
        C1C7U.LIZ("MessageControllerTask@d094.run$1$onActivityResumed$1L");
        try {
            C202098145w c202098145wLIZ = C08TN.LIZ();
            if (c202098145wLIZ.LJJIJIIJIL) {
                C823050WQl.LIZLLL().execute(new ARunnableS109S0100000_9(c202098145wLIZ, 176));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C1C7U.LIZIZ("MessageControllerTask@d094.run$1$onActivityResumed$1L");
    }

    public static final void run$11(ARunnableS88S0000000_9 aRunnableS88S0000000_9) {
        C1C7U.LIZ("OptimizerHelper@3f44.enhanceChromiumNetThreadPriority$2L");
        JatoXL.resetPriority(C2187451AjH.LJII);
        C1C7U.LIZIZ("OptimizerHelper@3f44.enhanceChromiumNetThreadPriority$2L");
    }

    public static final void run$12(ARunnableS88S0000000_9 aRunnableS88S0000000_9) {
        C1C7U.LIZ("OptimizerHelper@3f44.blockBootFinishTask$1L");
        C799900VZk.LIZ.getClass();
        C799900VZk.LIZIZ();
        C1C7U.LIZIZ("OptimizerHelper@3f44.blockBootFinishTask$1L");
    }

    public static final void run$13(ARunnableS88S0000000_9 aRunnableS88S0000000_9) {
        boolean zLIZ;
        C1C7U.LIZ("PushSheduler@1ed.lambda$initPushByFlag$1$1$1");
        try {
            C810890VrT c810890VrT = C810890VrT.LIZIZ;
            c810890VrT.LJFF("initPushFully_asynchronously_in_initPushByFlag");
            c810890VrT.LJIIL("initPushFully_asynchronously_in_initPushByFlag");
            PushSheduler.LIZIZ();
            c810890VrT.LJI("initPushFully_asynchronously_in_initPushByFlag");
            c810890VrT.LJIIJJI("initPushFully_asynchronously_in_initPushByFlag");
            c810890VrT.LJI("initPushFully_execute_in_initPushByFlag");
            c810890VrT.LJIIJJI("initPushFully_execute_in_initPushByFlag");
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PushSheduler@1ed.lambda$initPushByFlag$1$1$1");
    }

    public static final void run$14(ARunnableS88S0000000_9 aRunnableS88S0000000_9) {
        C1C7U.LIZ("PushInitializer@b651.excuteInitPushByFlag$1L$1L");
        C810890VrT c810890VrT = C810890VrT.LIZIZ;
        c810890VrT.LJFF("initPushByFlag_run_in_executeInitPushByFlag");
        c810890VrT.LJIIL("initPushByFlag_run_in_executeInitPushByFlag");
        c810890VrT.LJIIIZ("excuteInitPushByFlag in postDelay, calls initPushByFlag()");
        PushSheduler.LIZ(2);
        c810890VrT.LJI("initPushByFlag_run_in_executeInitPushByFlag");
        c810890VrT.LJIIJJI("initPushByFlag_run_in_executeInitPushByFlag");
        c810890VrT.LJI("initPushByFlag_post_in_executeInitPushByFlag");
        c810890VrT.LJIIJJI("initPushByFlag_post_in_executeInitPushByFlag");
        c810890VrT.LJI("initPushByFlag_later_in_executeInitPushByFlag");
        c810890VrT.LJIIJJI("initPushByFlag_later_in_executeInitPushByFlag");
        C1C7U.LIZIZ("PushInitializer@b651.excuteInitPushByFlag$1L$1L");
    }

    public static final void run$15(ARunnableS88S0000000_9 aRunnableS88S0000000_9) {
        C1C7U.LIZ("ThreadTaskDiagnose@b238.start$1L");
        C799180VWq.LIZ.getClass();
        C799180VWq.LIZIZ();
        C1C7U.LIZIZ("ThreadTaskDiagnose@b238.start$1L");
    }

    public static final void run$16(ARunnableS88S0000000_9 aRunnableS88S0000000_9) {
        C1C7U.LIZ("ThreadTaskDiagnose@b238.start$2L");
        C799180VWq.LIZ.getClass();
        if (C799180VWq.LIZIZ.compareAndSet(true, false)) {
            BPEAHandler bPEAHandler = C799180VWq.LJI;
            if (bPEAHandler != null) {
                C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS88S0000000_9(17));
            } else {
                C799180VWq.LIZ();
            }
        }
        C1C7U.LIZIZ("ThreadTaskDiagnose@b238.start$2L");
    }

    public static final void run$17(ARunnableS88S0000000_9 aRunnableS88S0000000_9) {
        C1C7U.LIZ("ThreadTaskDiagnose@b238.end$1L");
        C799180VWq.LIZ.getClass();
        C799180VWq.LIZ();
        C1C7U.LIZIZ("ThreadTaskDiagnose@b238.end$1L");
    }

    public static final void run$18(ARunnableS88S0000000_9 aRunnableS88S0000000_9) {
        C1C7U.LIZ("StartupJankOptEntry@3e83.onStartupJankEnd$3L");
        C202103146b.LIZ(2, "boot_finish").stop();
        C1C7U.LIZIZ("StartupJankOptEntry@3e83.onStartupJankEnd$3L");
    }

    public static final void run$19(ARunnableS88S0000000_9 aRunnableS88S0000000_9) {
        C1C7U.LIZ("MainLooperOptService@34cc.logFirstDoFrameDuration$1L");
        if (((Boolean) C0CD2.LJIIJ.getValue()).booleanValue()) {
            C584420Mw4 c584420Mw4LIZ = C584420Mw4.LIZ();
            if (!c584420Mw4LIZ.LIZIZ.get() && JatoXL.isInited() && c584420Mw4LIZ.LIZIZ.compareAndSet(false, true)) {
                synchronized (C584420Mw4.class) {
                    try {
                        Iterator it2 = ((CopyOnWriteArrayList) c584420Mw4LIZ.LIZ).iterator();
                        while (it2.hasNext()) {
                            c584420Mw4LIZ.LIZIZ(((Integer) it2.next()).intValue());
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }
        C0X35.LJIIJJI("cold_boot_main_measure_duration", true);
        C0X35.LJIIJJI("cold_boot_main_draw_tail", true);
        C0X35.LIZ("cold_boot_main_measure_to_focus", true);
        C0X35.LIZIZ("cold_boot_main_measure_to_focus");
        C582600Mt8.LIZ("cold_boot_main_measure_to_focus");
        C0X35.LJIIJJI("measure_resume_to_end", true);
        C1150504el.LIZ().LJI("cold_boot_main_layout_to_measure", false);
        C1150504el.LIZ().LIZLLL("cold_boot_main_measure_to_feed", false);
        C1C7U.LIZIZ("MainLooperOptService@34cc.logFirstDoFrameDuration$1L");
    }

    public static final void run$2(ARunnableS88S0000000_9 aRunnableS88S0000000_9) {
        C1C7U.LIZ("PlayerController@7763.logFirstFeedEvent$1L");
        C1602200rnO.LIZ().LIZLLL(EnumC585000Mx0.FIRST_FEED_COMPLETED);
        C1C7U.LIZIZ("PlayerController@7763.logFirstFeedEvent$1L");
    }

    public static final void run$20(ARunnableS88S0000000_9 aRunnableS88S0000000_9) {
        C1C7U.LIZ("FpsReportHelper@46a.<clinit>$1L");
        C584470Mw9.LIZLLL = false;
        C0VWN.LIZ("video_play", false).LIZ("is_pause", "false");
        C0VWN.LIZ("video_play", false).stop();
        C1C7U.LIZIZ("FpsReportHelper@46a.<clinit>$1L");
    }

    public static final void run$21(ARunnableS88S0000000_9 aRunnableS88S0000000_9) {
        C1C7U.LIZ("FpsReportHelper@46a.<clinit>$2L");
        C584470Mw9.LJI();
        C1C7U.LIZIZ("FpsReportHelper@46a.<clinit>$2L");
    }

    public static final void run$22(ARunnableS88S0000000_9 aRunnableS88S0000000_9) {
        C1C7U.LIZ("FpsReportHelper@46a.<clinit>$3L");
        if (C584470Mw9.LJII("system_launch_1_to_2_minute", null)) {
            C2487409ou.LIZ(C584470Mw9.LJIILJJIL);
        }
        C1C7U.LIZIZ("FpsReportHelper@46a.<clinit>$3L");
    }

    public static final void run$23(ARunnableS88S0000000_9 aRunnableS88S0000000_9) {
        C1C7U.LIZ("FpsReportHelper@46a.<clinit>$4L");
        if (C584470Mw9.LJII("system_launch_1_to_2_minute_feed", null)) {
            C2487409ou.LIZ(C584470Mw9.LJIILL);
        }
        C1C7U.LIZIZ("FpsReportHelper@46a.<clinit>$4L");
    }

    public static final void run$24(ARunnableS88S0000000_9 aRunnableS88S0000000_9) {
        C1C7U.LIZ("FpsReportHelper@46a.<clinit>$6L");
        C584470Mw9.LJII("login", null);
        C1C7U.LIZIZ("FpsReportHelper@46a.<clinit>$6L");
    }

    public static final void run$25(ARunnableS88S0000000_9 aRunnableS88S0000000_9) {
        C1C7U.LIZ("FeedFetchModel@3835.sendFeedCacheMsg$1L");
        Choreographer choreographerV2 = C786410Ut5.v2();
        HashMap<String, Queue<Runnable>> map = C20508081q.LIZIZ;
        if (!map.containsKey("optimize_firstonlayout")) {
            map.put("optimize_firstonlayout", new ArrayBlockingQueue(4));
        }
        C20508081q.LIZ(choreographerV2, new ARunnableS5S1000000_9(1));
        C1C7U.LIZIZ("FeedFetchModel@3835.sendFeedCacheMsg$1L");
    }

    public static final void run$26(ARunnableS88S0000000_9 aRunnableS88S0000000_9) {
        C1C7U.LIZ("ReplaceWorkerExcutorUtils@fb3c.replaceWorkerExecutor$1L");
        C810560Vqw.LIZ = C823050WQl.LIZJ();
        C1C7U.LIZIZ("ReplaceWorkerExcutorUtils@fb3c.replaceWorkerExecutor$1L");
    }

    public static final void run$3(ARunnableS88S0000000_9 aRunnableS88S0000000_9) {
        C1C7U.LIZ("PlayerController@7763.initPlayBackStrategy$1L");
        C582130MsN.LIZ().LJ().getClass();
        ((InterfaceC582280Msc) C1126604au.LIZ("com.ss.android.ugc.aweme.video.simplayer.tt.PlayerStrategyCenterChannel")).init();
        C1C7U.LIZIZ("PlayerController@7763.initPlayBackStrategy$1L");
    }

    public static final void run$4(ARunnableS88S0000000_9 aRunnableS88S0000000_9) {
        C1C7U.LIZ("PlayerController@7763.onRenderFirstFrameDelay$2L");
        C1150504el.LIZ().LJIIL();
        C1C7U.LIZIZ("PlayerController@7763.onRenderFirstFrameDelay$2L");
    }

    public static final void run$5(ARunnableS88S0000000_9 aRunnableS88S0000000_9) {
        C1C7U.LIZ("PlayerController@7763.onRenderFirstFrameDelay$4L");
        C799900VZk.LIZ.getClass();
        C799900VZk.LIZIZ();
        C1C7U.LIZIZ("PlayerController@7763.onRenderFirstFrameDelay$4L");
    }

    public static final void run$6(ARunnableS88S0000000_9 aRunnableS88S0000000_9) {
        C1C7U.LIZ("PlayerController@7763.onRenderFirstFrameDelay$5L");
        C2277891EDz.LIZIZ.LIZ().LIZ();
        C1C7U.LIZIZ("PlayerController@7763.onRenderFirstFrameDelay$5L");
    }

    public static final void run$7(ARunnableS88S0000000_9 aRunnableS88S0000000_9) {
        IAnchorMakerInitService iAnchorMakerInitService;
        C1C7U.LIZ("PlayerController@7763.preloadAnchorMaker$1L");
        IStartupFeedAwemesService iStartupFeedAwemesService = (IStartupFeedAwemesService) PluggableExtentionKt.pluggableSpi(IStartupFeedAwemesService.class);
        if (iStartupFeedAwemesService != null && iStartupFeedAwemesService.LIZIZ() && (iAnchorMakerInitService = (IAnchorMakerInitService) PluggableExtentionKt.pluggableSpi(IAnchorMakerInitService.class)) != null) {
            iAnchorMakerInitService.LIZ();
        }
        C1C7U.LIZIZ("PlayerController@7763.preloadAnchorMaker$1L");
    }

    public static final void run$8(ARunnableS88S0000000_9 aRunnableS88S0000000_9) {
        C1C7U.LIZ("PlayerController@7763.loadTrackSdkImpl$1L");
        C2201531BEh.LIZ();
        C1C7U.LIZIZ("PlayerController@7763.loadTrackSdkImpl$1L");
    }
}
