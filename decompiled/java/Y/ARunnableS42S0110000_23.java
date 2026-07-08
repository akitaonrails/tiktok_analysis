package Y;

import X.C0WPS;
import X.C0X9S;
import X.C1468160oJC;
import X.C1468170oJD;
import X.C1468450oJf;
import X.C1468940oKS;
import X.C1484850ok7;
import X.C1515120pWw;
import X.C1520430pfV;
import X.C1520760pg2;
import X.C1520770pg3;
import X.C1520840pgA;
import X.C1520960pgM;
import X.C1521730phb;
import X.C1546140qKy;
import X.C1547730qNX;
import X.C1548490qOl;
import X.C1C7U;
import X.C2119208Ry;
import X.C2187451AjH;
import X.C497740JfY;
import X.InterfaceC1546170qL1;
import X.InterfaceC1904907d9;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.monitorV2.net.MonitorNetApi;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.video.preload.VideoPreloadManagerAsync;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS42S0110000_23 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

    public static final void run$0(ARunnableS42S0110000_23 aRunnableS42S0110000_23) {
        C1468940oKS.LLZLLLL((C1468940oKS) aRunnableS42S0110000_23.l0, aRunnableS42S0110000_23.z1);
    }

    public static final void run$1(ARunnableS42S0110000_23 aRunnableS42S0110000_23) {
        C1468940oKS.LLZZJLIL((C1468940oKS) aRunnableS42S0110000_23.l0, aRunnableS42S0110000_23.z1);
    }

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (this.z1) {
            int i = C2187451AjH.LIZ;
            TTVideoEngineLog.d("VideoEventLoggerV2", "registerBackGroundNotification");
            C1468160oJC c1468160oJC = ((C1468450oJf) this.l0).LIZ;
            C1468170oJD c1468170oJD = c1468160oJC.LIZJ;
            if (c1468170oJD != null) {
                long j = c1468170oJD.LIZLLL;
                if (j > 0 || c1468160oJC.LJJZZI > 0) {
                    if (!c1468160oJC.LJIIL || j <= 0 || c1468170oJD.LJJIIJ > 0) {
                        c1468170oJD.LJJIIZI = System.currentTimeMillis();
                    } else if (c1468170oJD.LJJIJ <= 0) {
                        c1468170oJD.LJJIJ = System.currentTimeMillis();
                    }
                    c1468160oJC.LJII.LJIILJJIL();
                    c1468160oJC.LLIIJLIL();
                    EngineThreadPool.addExecuteTask(new ARunnableS113S0100000_13(c1468160oJC, 220));
                }
            }
        }
    }

    public final void LIZ$1() {
        Object objLJII;
        C0X9S<String> c0x9sDoPost;
        C1520760pg2 c1520760pg2LIZIZ;
        ((C1520770pg3) this.l0).LIZ();
        C1520430pfV c1520430pfV = ((C1520770pg3) this.l0).LJFF;
        c1520430pfV.getClass();
        boolean zLJI = MethodIDManager.LJI(137652);
        try {
            n nVarLIZJ = c1520430pfV.LIZJ();
            String str = c1520430pfV.LIZIZ.LIZIZ;
            CopyOnWriteArrayList<InterfaceC1904907d9> copyOnWriteArrayList = C1515120pWw.LIZ;
            synchronized (C1515120pWw.class) {
                objLJII = C1515120pWw.LJII(C1515120pWw.LJIIL(str), MonitorNetApi.class);
            }
            try {
                c0x9sDoPost = ((MonitorNetApi) objLJII).doPost(new ArrayList(), nVarLIZJ);
                try {
                    c1520760pg2LIZIZ = c1520430pfV.LIZIZ(c0x9sDoPost.execute().LIZIZ);
                    c0x9sDoPost.cancel();
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        C1520960pgM.LIZIZ(th);
                        if (c0x9sDoPost != null) {
                            c0x9sDoPost.cancel();
                        }
                        if (zLJI) {
                            MethodIDManager.LJ();
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        if (c0x9sDoPost != null) {
                            c0x9sDoPost.cancel();
                        }
                        if (zLJI) {
                            MethodIDManager.LJ();
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                c0x9sDoPost = null;
            }
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            C1520960pgM.LIZIZ(th4);
        }
        if (c1520760pg2LIZIZ != null) {
            ((C1520770pg3) this.l0).LIZ = c1520760pg2LIZIZ;
            int i = C2187451AjH.LIZ;
            C1521730phb.LIZ("SettingsParseManager", "highPriorityTaskDone");
            C1521730phb.LJFF("HybridSettingRequestService_update", "monitor setting update succeeded");
            C1520770pg3 c1520770pg3 = (C1520770pg3) this.l0;
            c1520770pg3.LIZLLL(c1520770pg3.LIZ.LIZIZ);
        } else {
            int i2 = C2187451AjH.LIZ;
            C1521730phb.LIZIZ("HybridSettingRequestService_update", "monitor setting update failed");
            ((C1520770pg3) this.l0).LIZLLL(600);
        }
        if (!((C1520770pg3) this.l0).LIZJ) {
            C1520760pg2 c1520760pg2LIZ = ((C1520770pg3) this.l0).LJFF.LIZ();
            if (c1520760pg2LIZ != null) {
                ((C1520770pg3) this.l0).LIZ = c1520760pg2LIZ;
            }
            C1520840pgA.LIZ();
        }
        if (this.z1) {
            HashMap map = new HashMap();
            map.put("setting_id", String.valueOf(((C1520770pg3) this.l0).LIZ.LIZJ));
            C2119208Ry.LIZIZ(null, "startup_init", map, null);
        }
    }

    public final void LIZ$2() {
        LynxView lynxView;
        LynxView lynxView2;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = ((C1548490qOl) this.l0).LIZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            if (this.z1) {
                Object kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView();
                if (!(kitView instanceof LynxView) || (lynxView = (LynxView) kitView) == null) {
                    return;
                }
                lynxView.updateScreenMetrics(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getWidth(), sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getHeight());
                return;
            }
            Object kitView2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView();
            if (!(kitView2 instanceof LynxView) || (lynxView2 = (LynxView) kitView2) == null) {
                return;
            }
            lynxView2.updateScreenMetrics((int) C497740JfY.LIZIZ(375.0f), (int) C497740JfY.LIZIZ(C1547730qNX.LIZJ()));
        }
    }

    public static final void run$10(ARunnableS42S0110000_23 aRunnableS42S0110000_23) {
        boolean zLIZ;
        C1C7U.LIZ("PlayerMsgProxy@fae.setRadioModeEnable$1");
        try {
            ((C1484850ok7) aRunnableS42S0110000_23.l0).LIZ.LIZ(aRunnableS42S0110000_23.z1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PlayerMsgProxy@fae.setRadioModeEnable$1");
    }

    public static final void run$11(ARunnableS42S0110000_23 aRunnableS42S0110000_23) {
        boolean zLIZ;
        C1C7U.LIZ("PlayerMsgProxy@fae.setLoop$1");
        try {
            ((C1484850ok7) aRunnableS42S0110000_23.l0).LIZ.setLoop(aRunnableS42S0110000_23.z1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PlayerMsgProxy@fae.setLoop$1");
    }

    public static final void run$12(ARunnableS42S0110000_23 aRunnableS42S0110000_23) {
        boolean zLIZ;
        C1C7U.LIZ("TTWebViewInstaller@1071.installTTWebView$1$1");
        try {
            C1546140qKy.LIZ.LIZ(aRunnableS42S0110000_23.z1, (InterfaceC1546170qL1) aRunnableS42S0110000_23.l0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TTWebViewInstaller@1071.installTTWebView$1$1");
    }

    public static final void run$13(ARunnableS42S0110000_23 aRunnableS42S0110000_23) {
        boolean zLIZ;
        C1C7U.LIZ("TTWebViewInstaller@1071.installTTWebView$1$2");
        try {
            C1546140qKy.LIZ.LIZ(aRunnableS42S0110000_23.z1, (InterfaceC1546170qL1) aRunnableS42S0110000_23.l0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TTWebViewInstaller@1071.installTTWebView$1$2");
    }

    public static final void run$14(ARunnableS42S0110000_23 aRunnableS42S0110000_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS42S0110000_23.l0;
        boolean z = aRunnableS42S0110000_23.z1;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.updateSubtitlesTranslatedSetting$1L");
        videoPreloadManagerAsync.LJJZZI().LJJJLIIL(z);
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.updateSubtitlesTranslatedSetting$1L");
    }

    public static final void run$15(ARunnableS42S0110000_23 aRunnableS42S0110000_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS42S0110000_23.l0;
        boolean z = aRunnableS42S0110000_23.z1;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.updateAppState$1L");
        videoPreloadManagerAsync.LJJZZI().LJ(z);
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.updateAppState$1L");
    }

    public static final void run$16(ARunnableS42S0110000_23 aRunnableS42S0110000_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS42S0110000_23.l0;
        boolean z = aRunnableS42S0110000_23.z1;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.updateSubtitlesTranslatedSetting$2L");
        videoPreloadManagerAsync.LJJLL(new ARunnableS42S0110000_23(videoPreloadManagerAsync, z, 18));
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.updateSubtitlesTranslatedSetting$2L");
    }

    public static final void run$17(ARunnableS42S0110000_23 aRunnableS42S0110000_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS42S0110000_23.l0;
        boolean z = aRunnableS42S0110000_23.z1;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.updateAppState$2L");
        videoPreloadManagerAsync.LJJLL(new ARunnableS42S0110000_23(videoPreloadManagerAsync, z, 25));
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.updateAppState$2L");
    }

    public static final void run$18(ARunnableS42S0110000_23 aRunnableS42S0110000_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS42S0110000_23.l0;
        boolean z = aRunnableS42S0110000_23.z1;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.updateSubtitlesTranslatedSetting$2L$1L");
        videoPreloadManagerAsync.LJJZZI().LJJJLIIL(z);
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.updateSubtitlesTranslatedSetting$2L$1L");
    }

    public static final void run$19(ARunnableS42S0110000_23 aRunnableS42S0110000_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS42S0110000_23.l0;
        boolean z = aRunnableS42S0110000_23.z1;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.setDataFreeMode$1L");
        videoPreloadManagerAsync.LJJZZI().LJJJJLL(z);
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.setDataFreeMode$1L");
    }

    public static final void run$2(ARunnableS42S0110000_23 aRunnableS42S0110000_23) {
        C1468940oKS c1468940oKS = (C1468940oKS) aRunnableS42S0110000_23.l0;
        boolean z = aRunnableS42S0110000_23.z1;
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.notifySeekCompletion$1L");
        c1468940oKS.LJJIL.LJII(z);
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.notifySeekCompletion$1L");
    }

    public static final void run$20(ARunnableS42S0110000_23 aRunnableS42S0110000_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS42S0110000_23.l0;
        boolean z = aRunnableS42S0110000_23.z1;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.setDataFreeMode$2L");
        videoPreloadManagerAsync.LJJLL(new ARunnableS42S0110000_23(videoPreloadManagerAsync, z, 22));
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.setDataFreeMode$2L");
    }

    public static final void run$21(ARunnableS42S0110000_23 aRunnableS42S0110000_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS42S0110000_23.l0;
        boolean z = aRunnableS42S0110000_23.z1;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.updateSubtitlesDisplaySetting$2L$1L");
        videoPreloadManagerAsync.LJJZZI().LJIIZILJ(z);
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.updateSubtitlesDisplaySetting$2L$1L");
    }

    public static final void run$22(ARunnableS42S0110000_23 aRunnableS42S0110000_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS42S0110000_23.l0;
        boolean z = aRunnableS42S0110000_23.z1;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.setDataFreeMode$2L$1L");
        videoPreloadManagerAsync.LJJZZI().LJJJJLL(z);
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.setDataFreeMode$2L$1L");
    }

    public static final void run$23(ARunnableS42S0110000_23 aRunnableS42S0110000_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS42S0110000_23.l0;
        boolean z = aRunnableS42S0110000_23.z1;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.updateSubtitlesDisplaySetting$1L");
        videoPreloadManagerAsync.LJJZZI().LJIIZILJ(z);
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.updateSubtitlesDisplaySetting$1L");
    }

    public static final void run$24(ARunnableS42S0110000_23 aRunnableS42S0110000_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS42S0110000_23.l0;
        boolean z = aRunnableS42S0110000_23.z1;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.updateSubtitlesDisplaySetting$2L");
        videoPreloadManagerAsync.LJJLL(new ARunnableS42S0110000_23(videoPreloadManagerAsync, z, 21));
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.updateSubtitlesDisplaySetting$2L");
    }

    public static final void run$25(ARunnableS42S0110000_23 aRunnableS42S0110000_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS42S0110000_23.l0;
        boolean z = aRunnableS42S0110000_23.z1;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.updateAppState$2L$1L");
        videoPreloadManagerAsync.LJJZZI().LJ(z);
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.updateAppState$2L$1L");
    }

    public static final void run$3(ARunnableS42S0110000_23 aRunnableS42S0110000_23) {
        boolean zLIZ;
        C1C7U.LIZ("VideoEventLoggerV2@9ece.registerBackGroundNotification$1$onAppEnterBackground$1");
        try {
            aRunnableS42S0110000_23.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoEventLoggerV2@9ece.registerBackGroundNotification$1$onAppEnterBackground$1");
    }

    public static final void run$4(ARunnableS42S0110000_23 aRunnableS42S0110000_23) {
        boolean zLIZ;
        C1C7U.LIZ("VideoEventOneEvent$AsyncGetLogDataRunnable@f9d5.run$1");
        try {
            C0WPS.instance.addEventV2(aRunnableS42S0110000_23.z1, (JSONObject) aRunnableS42S0110000_23.l0, "videoplayer_oneevent");
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoEventOneEvent$AsyncGetLogDataRunnable@f9d5.run$1");
    }

    public static final void run$5(ARunnableS42S0110000_23 aRunnableS42S0110000_23) {
        boolean z = aRunnableS42S0110000_23.z1;
        JSONObject jSONObject = (JSONObject) aRunnableS42S0110000_23.l0;
        C1C7U.LIZ("VideoEventOneNoRender$AsyncGetLogDataRunnable@b13c.run$1L");
        C0WPS.instance.addEventV2(z, jSONObject, "videoplayer_oneevent");
        C1C7U.LIZIZ("VideoEventOneNoRender$AsyncGetLogDataRunnable@b13c.run$1L");
    }

    public static final void run$6(ARunnableS42S0110000_23 aRunnableS42S0110000_23) {
        boolean zLIZ;
        C1C7U.LIZ("VideoEventOneOpera$AsyncGetLogDataRunnable@7394.run$1");
        try {
            C0WPS.instance.addEventV2(aRunnableS42S0110000_23.z1, (JSONObject) aRunnableS42S0110000_23.l0, "videoplayer_oneopera");
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoEventOneOpera$AsyncGetLogDataRunnable@7394.run$1");
    }

    public static final void run$7(ARunnableS42S0110000_23 aRunnableS42S0110000_23) {
        boolean zLIZ;
        C1C7U.LIZ("VideoEventOneOutSync$AsyncGetLogDataRunnable@6d48.run$1");
        try {
            C0WPS.instance.addEventV2(aRunnableS42S0110000_23.z1, (JSONObject) aRunnableS42S0110000_23.l0, "videoplayer_oneevent");
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoEventOneOutSync$AsyncGetLogDataRunnable@6d48.run$1");
    }

    public static final void run$8(ARunnableS42S0110000_23 aRunnableS42S0110000_23) {
        boolean zLIZ;
        C1C7U.LIZ("HybridSettingManagerImpl@106a.loopUpdate$1");
        try {
            aRunnableS42S0110000_23.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("HybridSettingManagerImpl@106a.loopUpdate$1");
    }

    public static final void run$9(ARunnableS42S0110000_23 aRunnableS42S0110000_23) {
        boolean zLIZ;
        C1C7U.LIZ("LiveSparkDefaultParamHelper@3de1.configDefaultParams$1$onSparkViewMounted$1");
        try {
            aRunnableS42S0110000_23.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveSparkDefaultParamHelper@3de1.configDefaultParams$1$onSparkViewMounted$1");
    }

    public ARunnableS42S0110000_23(boolean z, JSONObject jSONObject, int i) {
        this.$t = i;
        switch (i) {
            case 4:
            case 6:
            case 7:
                this.z1 = z;
                this.l0 = jSONObject;
                break;
            case 5:
            default:
                this.z1 = z;
                this.l0 = jSONObject;
                break;
        }
    }

    public ARunnableS42S0110000_23(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
