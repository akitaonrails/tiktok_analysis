package Y;

import X.C082Q;
import X.C08M9;
import X.C08MD;
import X.C08MX;
import X.C08PD;
import X.C08V1;
import X.C08V2;
import X.C0NET;
import X.C0VDB;
import X.C0WZX;
import X.C1150504el;
import X.C1331660kl2;
import X.C1906580ziK;
import X.C1C7U;
import X.C202094145s;
import X.C20622086a;
import X.C2089608Go;
import X.C2090208Gu;
import X.C2115808Qq;
import X.C2116508Qx;
import X.C2116608Qy;
import X.C2120108Sh;
import X.C2179971ATj;
import X.C2187451AjH;
import X.C2188571Al5;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2333709Cl;
import X.C2367709Pn;
import X.C609920Nw6;
import X.C786410Ut5;
import X.C792400V6o;
import X.C844470XAv;
import X.InterfaceC1331720kl8;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Debug;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveDowngradeThreadMapSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.boost.DexCacheExpandOpt;
import com.bytedance.common.jato.boost.HandleGetEnvOpt;
import com.bytedance.common.jato.boost.TextureOpt;
import com.bytedance.common.jato.gfx.GraphicsUtil;
import com.bytedance.common.jato.interpreter.InterpreterBridge;
import com.bytedance.common.jato.jit.JitCodeCacheMProtectOpt;
import com.bytedance.common.jato.soload.SoLoad;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.librarian.Librarian;
import com.bytedance.memrelief.gc.WeakRefQueueMonitor;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.otis.optimise.system.jit.JitMemory;
import com.bytedance.otis.optimise.system.render.RenderManager;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.internal.bind.GsonBoundFieldsPreloader;
import com.ss.android.agilelogger.ALog;
import com.ss.android.legoimpl.FlippedTask;
import com.ss.android.ugc.aweme.app.crash.launchguard.LaunchCrashGuard;
import com.ss.android.ugc.aweme.boot.handler.HandlerInterceptor;
import com.ss.android.ugc.aweme.classopt.ColdBootClassPreloader;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.ss.android.ugc.aweme.lifecycle.ScheduleGroupPromotionReceiver;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.memory.ab.MemoryDetailALogParameters;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.utils.LancetPreload;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class ARunnableS83S0000000_3 implements Runnable {
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
                WeakRefQueueMonitor.lambda$start$0();
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LaunchCrashGuard.lambda$waitForLaunchGuardEndPointUpdate$0();
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
                LancetPreload.lambda$preloadThread$0();
                break;
            case 27:
                run$27(this);
                break;
            case 28:
                run$28(this);
                break;
            case 29:
                run$29(this);
                break;
            case 30:
                run$30(this);
                break;
            case 31:
                run$31(this);
                break;
            case 32:
                run$32(this);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                run$33(this);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                run$34(this);
                break;
            case 35:
                run$35(this);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                run$36(this);
                break;
            case 37:
                run$37(this);
                break;
            case 38:
                run$38(this);
                break;
            case 39:
                run$39(this);
                break;
            case 40:
                run$40(this);
                break;
            case 41:
                run$41(this);
                break;
            case 42:
                run$42(this);
                break;
            case 43:
                run$43(this);
                break;
            case 44:
                run$44(this);
                break;
            case 45:
                run$45(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static void LIZ$0() throws Throwable {
        try {
            Intent intent = new Intent("com.apm.setting.update.action");
            Context context = C792400V6o.LIZ;
            intent.putExtra("PROCESS_NAME", C08MX.LIZ());
            C2204961BRm.LJJJJI(C792400V6o.LIZ, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv++N2g8gatBiY1P3WLfOQ8Kqp6b+BUTF1VLenf", null));
            if (C792400V6o.LJIIIIZZ()) {
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZ$1() {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis() - C202094145s.LJII;
            double d = CastDoubleProtector.parseDouble(C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(C2367709Pn.LIZJ())}, 1)));
            int iLIZ = C08M9.LIZ(Debug.getNativeHeapAllocatedSize(), true);
            C844470XAv.LIZ.getClass();
            int iLIZ2 = C08M9.LIZ(C2188571Al5.LIZ(C844470XAv.LIZ()), true);
            int iLIZ3 = C08M9.LIZ(Debug.getPss(), false);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bootTimeMin:");
            sbLIZ.append((jUptimeMillis / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) / ((long) 60));
            sbLIZ.append(" javaRate:");
            sbLIZ.append(d);
            sbLIZ.append(", nativeHeapMb:");
            sbLIZ.append(iLIZ);
            sbLIZ.append(", deviceAvailMb:");
            sbLIZ.append(iLIZ2);
            sbLIZ.append(" appPssMb:");
            sbLIZ.append(iLIZ3);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("MemoryALog", C2188811AlT.LIZIZ(sbLIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS83S0000000_3(int r3) {
        /*
            r2 = this;
            r2.$t = r3
            switch(r3) {
                case 0: goto Lc;
                case 1: goto Lc;
                case 2: goto Lc;
                case 3: goto Lc;
                case 4: goto Lc;
                case 5: goto Lc;
                case 6: goto Lc;
                case 7: goto Lc;
                case 8: goto Lc;
                case 9: goto Lc;
                case 10: goto Lc;
                case 11: goto Lc;
                case 12: goto Lc;
                case 13: goto Lc;
                case 14: goto Lc;
                case 15: goto Lc;
                case 16: goto Lc;
                case 17: goto Lc;
                case 18: goto L5;
                case 19: goto Lc;
                case 20: goto Lc;
                case 21: goto Lc;
                case 22: goto Lc;
                case 23: goto Lc;
                case 24: goto Lc;
                case 25: goto Lc;
                case 26: goto Lc;
                case 27: goto Lc;
                case 28: goto Lc;
                case 29: goto Lc;
                case 30: goto Lc;
                case 31: goto Lc;
                case 32: goto Lc;
                case 33: goto Lc;
                case 34: goto Lc;
                case 35: goto Lc;
                case 36: goto Lc;
                case 37: goto L5;
                case 38: goto Lc;
                case 39: goto Lc;
                case 40: goto Lc;
                case 41: goto Lc;
                case 42: goto L5;
                case 43: goto L5;
                case 44: goto Lc;
                case 45: goto Lc;
                default: goto L5;
            }
        L5:
            r1 = r2
            X.08MD r0 = X.C08MD.LIZ
        L8:
            r1.<init>()
            return
        Lc:
            r1 = r2
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS83S0000000_3.<init>(int):void");
    }

    public static final void run$0(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        C1C7U.LIZ("SearchPreloadLancet@a104.resetRaceView$1L");
        try {
            Class<?> cls = Class.forName("com.ss.android.ugc.gamora.recorder.splitshoot.SplitShootScenePreloader");
            cls.getDeclaredMethod("reset", new Class[0]).invoke(cls.getDeclaredField("INSTANCE").get(cls), new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            Class<?> cls2 = Class.forName("com.ss.android.ugc.aweme.shortvideo.record.RecordBottomTabConfigurePreloader");
            cls2.getDeclaredMethod("reset", new Class[0]).invoke(cls2.getDeclaredField("INSTANCE").get(cls2), new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        C1C7U.LIZIZ("SearchPreloadLancet@a104.resetRaceView$1L");
    }

    public static final void run$1(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        C1C7U.LIZ("SearchPreloadLancet@a104.register$1L");
        try {
            Class<?> cls = Class.forName("com.ss.android.ugc.aweme.tools.ToolsBaseLightSensorUtils");
            cls.getDeclaredMethod("registerSensorListener", new Class[0]).invoke(cls.getDeclaredField("INSTANCE").get(cls), new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1C7U.LIZIZ("SearchPreloadLancet@a104.register$1L");
    }

    public static final void run$11(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        C1C7U.LIZ("PlayerController@7763.setAllowLoadVcnVerifyLib$1L");
        try {
            LoadSoLancet.LIZJ("ttmverify");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF("ttmverify");
            LoadSoLancet.LJ(jUptimeMillis, "ttmverify");
            LoadSoLancet.LIZLLL(jUptimeMillis, "ttmverify");
            LoadSoLancet.LIZIZ("ttmverify");
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        C0NET.LIZ.getClass();
        C0NET.LJIIJ = true;
        C1C7U.LIZIZ("PlayerController@7763.setAllowLoadVcnVerifyLib$1L");
    }

    public static final void run$12(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        C1C7U.LIZ("LoadSoLancet@e671.doIdleSoPreload$1L");
        C1C7U.LIZIZ("LoadSoLancet@e671.doIdleSoPreload$1L");
    }

    public static final void run$13(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        C1C7U.LIZ("MessageControllerTask@d094.run$1L");
        C0NET.LIZ.getClass();
        if (C0NET.LJIIZILJ(true)) {
            C20622086a.LIZ().LIZJ();
        }
        C1C7U.LIZIZ("MessageControllerTask@d094.run$1L");
    }

    public static final void run$14(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        C1C7U.LIZ("MessageControllerTask@d094.run$3L");
        HandlerInterceptor.LIZ().LIZIZ();
        C1C7U.LIZIZ("MessageControllerTask@d094.run$3L");
    }

    public static final void run$15(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        C1C7U.LIZ("ColdBootInitTask@1c6b.preloadThread$1L");
        C609920Nw6.LIZ();
        C1C7U.LIZIZ("ColdBootInitTask@1c6b.preloadThread$1L");
    }

    public static final void run$16(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        C1C7U.LIZ("BindFrescoTask@51a4.run$1L");
        C1150504el.LIZ().LIZLLL("method_lighten_preload_value", false);
        InterfaceC1331720kl8 interfaceC1331720kl8 = C1331660kl2.LIZ;
        C1150504el.LIZ().LJI("method_lighten_preload_value", false);
        C1C7U.LIZIZ("BindFrescoTask@51a4.run$1L");
    }

    public static final void run$17(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        C1C7U.LIZ("ScheduleGroupPromotionReceiver@3d64.com_ss_android_ugc_aweme_lifecycle_ScheduleGroupPromotionReceiver__onReceive$___twin___$1L");
        try {
            BroadcastReceiver.PendingResult andSet = ScheduleGroupPromotionReceiver.LIZ.getAndSet(null);
            if (andSet != null) {
                andSet.finish();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C1C7U.LIZIZ("ScheduleGroupPromotionReceiver@3d64.com_ss_android_ugc_aweme_lifecycle_ScheduleGroupPromotionReceiver__onReceive$___twin___$1L");
    }

    public static final void run$18(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        boolean zLIZ;
        C1C7U.LIZ("DfPreloadInitTask@d49b.run$1$1");
        try {
            if (C1906580ziK.LJI()) {
                ((IPluginService) ServiceManager.get().getService(IPluginService.class)).LJJIIZI(2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DfPreloadInitTask@d49b.run$1$1");
    }

    public static final void run$19(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        C1C7U.LIZ("OptimizerHelper@3f44.initHandleGetEnvOpt$1L");
        HandleGetEnvOpt.init();
        C1C7U.LIZIZ("OptimizerHelper@3f44.initHandleGetEnvOpt$1L");
    }

    public static final void run$2(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        C1C7U.LIZ("Profiler@a527.benchMark$4");
        while (true) {
            try {
                Arrays.toString(ThreadMethodProxy.getStackTrace(Looper.getMainLooper().getThread()));
                try {
                    Thread.sleep(300L);
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (C2179971ATj.LIZ(th)) {
                    C1C7U.LIZIZ("Profiler@a527.benchMark$4");
                    return;
                }
                throw th;
            }
        }
    }

    public static final void run$20(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        C1C7U.LIZ("OptimizerHelper@3f44.blockGcThread$1L");
        if (C08V1.LIZ.get() && C08V1.LIZIZ.compareAndSet(true, false)) {
            C08V1.LIZIZ(false);
        }
        C1C7U.LIZIZ("OptimizerHelper@3f44.blockGcThread$1L");
    }

    public static final void run$21(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        C1C7U.LIZ("OptimizerHelper@3f44.blockGcThread$2L");
        if (C08V1.LIZ.get() && System.currentTimeMillis() - C08V1.LJ > ((Number) C08V2.LIZ.getValue()).intValue() && C08V1.LIZIZ.compareAndSet(false, true)) {
            C08V1.LJ = System.currentTimeMillis();
            C08V1.LIZIZ(true);
        }
        C1C7U.LIZIZ("OptimizerHelper@3f44.blockGcThread$2L");
    }

    public static final void run$22(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        C1C7U.LIZ("OptimizerHelper@3f44.initJitTrimMapsOpt$1L");
        JitMemory.blockTrimMaps(((Number) C08PD.LIZ.getValue()).intValue());
        C1C7U.LIZIZ("OptimizerHelper@3f44.initJitTrimMapsOpt$1L");
    }

    public static final void run$23(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        C1C7U.LIZ("OptimizerHelper@3f44.optDexCacheFullExpand$1L");
        DexCacheExpandOpt.LIZ(SpeechEngineDefines.TTS_WORK_MODE_BOTH);
        C1C7U.LIZIZ("OptimizerHelper@3f44.optDexCacheFullExpand$1L");
    }

    public static final void run$24(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        C1C7U.LIZ("OptimizerHelper@3f44.initLooperMessageOpt$1L");
        C082Q.LIZ();
        C1C7U.LIZIZ("OptimizerHelper@3f44.initLooperMessageOpt$1L");
    }

    public static final void run$25(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        C1C7U.LIZ("OptimizerHelper@3f44.initLooperMessageOpt$2L");
        C082Q.LIZ();
        C1C7U.LIZIZ("OptimizerHelper@3f44.initLooperMessageOpt$2L");
    }

    public static final void run$27(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        boolean zLIZ;
        C1C7U.LIZ("OptimizerHelper@3f44.speedUpRender$1");
        try {
            RenderManager.getInstance().speedUpRender(Build.VERSION.SDK_INT);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OptimizerHelper@3f44.speedUpRender$1");
    }

    public static final void run$28(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        boolean zLIZ;
        C1C7U.LIZ("OptimizerHelper@3f44.startCodeCacheMprotectOpt$1");
        try {
            JitCodeCacheMProtectOpt.LIZIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OptimizerHelper@3f44.startCodeCacheMprotectOpt$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$29(Y.ARunnableS83S0000000_3 r10) {
        /*
            java.lang.String r10 = "ProcessSelfKiller@7b19.<clinit>$1L"
            X.C1C7U.LIZ(r10)
            X.C1BWL.LIZ()
            boolean r0 = X.C2416709dV.LIZ
            if (r0 != 0) goto L82
            boolean r0 = X.C1906580ziK.LJI()
            if (r0 == 0) goto L82
            android.app.ActivityManager$RunningAppProcessInfo r0 = new android.app.ActivityManager$RunningAppProcessInfo     // Catch: java.lang.Throwable -> L7e
            r0.<init>()     // Catch: java.lang.Throwable -> L7e
            android.app.ActivityManager.getMyMemoryState(r0)     // Catch: java.lang.Throwable -> L7e
            int r1 = r0.importance     // Catch: java.lang.Throwable -> L7e
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 <= r0) goto L82
            android.app.Application r8 = X.C1BWL.LIZ()
            java.lang.String r7 = "dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahZZrNxTHwdyqQgKeRO6tib9etq5WstFjQ2fsd6iK9"
            java.lang.Class<android.app.ActivityManager> r0 = android.app.ActivityManager.class
            java.lang.Object r2 = r8.getSystemService(r0)     // Catch: java.lang.Throwable -> L8d
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2     // Catch: java.lang.Throwable -> L8d
            if (r2 == 0) goto L91
            X.0WZX r1 = new X.0WZX     // Catch: java.lang.Throwable -> L8d
            r6 = 0
            r1.<init>(r7, r6)     // Catch: java.lang.Throwable -> L8d
            r0 = 100
            java.util.List r0 = X.C2204961BRm.LJIIIIZZ(r2, r0, r1)     // Catch: java.lang.Throwable -> L8d
            java.util.Iterator r9 = r0.iterator()     // Catch: java.lang.Throwable -> L8d
        L40:
            boolean r0 = r9.hasNext()     // Catch: java.lang.Throwable -> L8d
            if (r0 == 0) goto L91
            java.lang.Object r5 = r9.next()     // Catch: java.lang.Throwable -> L8d
            android.app.ActivityManager$RunningServiceInfo r5 = (android.app.ActivityManager.RunningServiceInfo) r5     // Catch: java.lang.Throwable -> L8d
            int r1 = r5.pid     // Catch: java.lang.Throwable -> L8d
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L8d
            if (r1 != r0) goto L40
            boolean r0 = r5.foreground     // Catch: java.lang.Throwable -> L8d
            if (r0 != 0) goto L40
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Throwable -> L79
            r4.<init>()     // Catch: java.lang.Throwable -> L79
            android.content.ComponentName r3 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = r8.getPackageName()     // Catch: java.lang.Throwable -> L79
            android.content.ComponentName r1 = r5.service     // Catch: java.lang.Throwable -> L79
            X.0WZX r0 = new X.0WZX     // Catch: java.lang.Throwable -> L79
            r0.<init>(r7, r6)     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = X.C2204961BRm.LJJIJIIJIL(r1, r0)     // Catch: java.lang.Throwable -> L79
            r3.<init>(r2, r0)     // Catch: java.lang.Throwable -> L79
            android.content.Intent r0 = r4.setComponent(r3)     // Catch: java.lang.Throwable -> L79
            r8.stopService(r0)     // Catch: java.lang.Throwable -> L79
            goto L40
        L79:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L8d
            goto L40
        L7e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L82:
            com.bytedance.bpea.transmit.delegate.BPEAHandler r3 = X.C2416709dV.LIZIZ
            Y.ARunnableS83S0000000_3 r2 = X.C2416709dV.LIZJ
            r0 = 60000(0xea60, double:2.9644E-319)
            X.C786410Ut5.LJLIIL(r0, r3, r2)
            goto L98
        L8d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L91:
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
        L98:
            X.C1C7U.LIZIZ(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS83S0000000_3.run$29(Y.ARunnableS83S0000000_3):void");
    }

    public static final void run$3(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.enableGpuResourceCleanup$1");
        try {
            GraphicsUtil.LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.enableGpuResourceCleanup$1");
    }

    public static final void run$30(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        boolean zLIZ;
        C1C7U.LIZ("CloudMessageManager@d2ac.clearDataCache$1");
        try {
            Context context = C0VDB.LJFF;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(context.getApplicationInfo().dataDir);
            sbLIZ.append(File.separator);
            sbLIZ.append("dbFiles");
            C2120108Sh.LJII(C2188811AlT.LIZIZ(sbLIZ));
        } finally {
            try {
            } finally {
                if (!zLIZ) {
                }
            }
        }
        C1C7U.LIZIZ("CloudMessageManager@d2ac.clearDataCache$1");
    }

    public static final void run$31(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        boolean zLIZ;
        C1C7U.LIZ("Kita@213f.enable$1");
        try {
            C2089608Go.LIZIZ();
            C2090208Gu.LIZIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("Kita@213f.enable$1");
    }

    public static final void run$32(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        C1C7U.LIZ("ChoreographerUtils@308a.postToCommit$1L");
        C1C7U.LIZIZ("ChoreographerUtils@308a.postToCommit$1L");
    }

    public static final void run$33(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        boolean zLIZ;
        C1C7U.LIZ("SlardarConfigFetcher@1ebb.sendBroadUpdateSetting$1");
        try {
            LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SlardarConfigFetcher@1ebb.sendBroadUpdateSetting$1");
    }

    public static final void run$34(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        C1C7U.LIZ("StartupJankOptEntry@3e83.onStartupJankEnd$2L");
        if ((C2115808Qq.LIZIZ(false) & 65536) == 65536 && ((Number) C2116608Qy.LIZ.getValue()).intValue() > 0) {
            GsonBoundFieldsPreloader.LIZLLL();
            GsonBoundFieldsPreloader.LIZJ = false;
            ((ConcurrentHashMap) GsonBoundFieldsPreloader.LJ).clear();
        }
        if ((C2116508Qx.LIZ & 2) == 2) {
            C786410Ut5.LJIIZILJ(Looper.getMainLooper(), null);
        }
        C1C7U.LIZIZ("StartupJankOptEntry@3e83.onStartupJankEnd$2L");
    }

    public static final void run$35(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        C1C7U.LIZ("MainLooperOptService@34cc.doAtTheEndOfMeasure$1L");
        C1C7U.LIZIZ("MainLooperOptService@34cc.doAtTheEndOfMeasure$1L");
    }

    public static final void run$36(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        boolean zLIZ;
        C1C7U.LIZ("AlphaVideoSurfaceView@e51a.onAttachedToWindow$1");
        try {
            Thread threadU3 = C786410Ut5.u3();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("alpha-play-");
            sbLIZ.append(threadU3.getName());
            ThreadMethodProxy.setName(threadU3, C2188811AlT.LIZIZ(sbLIZ));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AlphaVideoSurfaceView@e51a.onAttachedToWindow$1");
    }

    public static final void run$37(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        boolean zLIZ;
        C1C7U.LIZ("MemoryALogMonitor@386d.start$1");
        try {
            LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MemoryALogMonitor@386d.start$1");
    }

    public static final void run$38(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        C1C7U.LIZ("AwemeApplicationImpl@4971.<init>$2L");
        FlippedTask.LIZ();
        C1C7U.LIZIZ("AwemeApplicationImpl@4971.<init>$2L");
    }

    public static final void run$39(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        C1C7U.LIZ("KidsModeApplicationImpl@d552.beforeSuperAttachBaseContext$1L");
        try {
            Librarian.LIZIZ();
            System.out.println("librarian eagerInit coldboot kidmode");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C1C7U.LIZIZ("KidsModeApplicationImpl@d552.beforeSuperAttachBaseContext$1L");
    }

    public static final void run$4(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.optTextureBufferQueue$1");
        try {
            TextureOpt.LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.optTextureBufferQueue$1");
    }

    public static final void run$40(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        boolean zLIZ;
        C1C7U.LIZ("ChunkPatchUtils@2cc4.prepare$1");
        try {
            System.currentTimeMillis();
            C2333709Cl.LIZIZ(SearchMixFeedList.class);
            C2333709Cl.LIZIZ(SearchMixFeed.class);
            C2333709Cl.LIZIZ(Aweme.class);
            C2333709Cl.LIZIZ(GlobalDoodleConfig.class);
            C2333709Cl.LIZIZ(Video.class);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ChunkPatchUtils@2cc4.prepare$1");
    }

    public static final void run$41(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        C1C7U.LIZ("FeedFollowFragment@1d3d.optimizeWhenFollowFragmentCreate$1L");
        int i = C2187451AjH.LIZ;
        JatoXL.resetPriority(Process.myTid());
        C1C7U.LIZIZ("FeedFollowFragment@1d3d.optimizeWhenFollowFragmentCreate$1L");
    }

    public static final void run$42(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        C08MD c08md = C08MD.LIZ;
        C1C7U.LIZ("LivePlayRootManagerV2@6c53.onDestroy$1L");
        if (LiveDowngradeThreadMapSetting.INSTANCE.enable()) {
            Iterator<Integer> it2 = C08MD.LIZIZ.iterator();
            while (it2.hasNext()) {
                JatoXL.resetPriority(it2.next().intValue());
            }
            C08MD.LIZIZ.clear();
        }
        C1C7U.LIZIZ("LivePlayRootManagerV2@6c53.onDestroy$1L");
    }

    public static final void run$43(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        C08MD c08md = C08MD.LIZ;
        C1C7U.LIZ("LivePlayRootManagerV2@6c53.start$1L");
        C08MD.LIZ();
        C1C7U.LIZIZ("LivePlayRootManagerV2@6c53.start$1L");
    }

    public static final void run$44(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        boolean zLIZ;
        C1C7U.LIZ("LivePlayRootManagerV2@6c53.start$1");
        try {
            C08MD c08md = C08MD.LIZ;
            C08MD.LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LivePlayRootManagerV2@6c53.start$1");
    }

    public static final void run$45(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        boolean zLIZ;
        C1C7U.LIZ("ColdBootClassPreloader@fc46.stopTrackOnTryPlay$1");
        try {
            ColdBootClassPreloader.LJII();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ColdBootClassPreloader@fc46.stopTrackOnTryPlay$1");
    }

    public static final void run$5(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.initInterpreterBridge$1");
        try {
            InterpreterBridge.LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.initInterpreterBridge$1");
    }

    public static final void run$6(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.soLoadStart$1");
        try {
            SoLoad.LIZLLL();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.soLoadStart$1");
    }

    public static final void run$7(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.soLoadStop$1");
        try {
            SoLoad.LJ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.soLoadStop$1");
    }

    public static final void run$9(ARunnableS83S0000000_3 aRunnableS83S0000000_3) {
        C1C7U.LIZ("LibrarianTask@ffa4.realRun$1L");
        try {
            Librarian.LIZIZ();
            System.out.println("librarian eagerInit coldboot");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C1C7U.LIZIZ("LibrarianTask@ffa4.realRun$1L");
    }

    public ARunnableS83S0000000_3(Context context, int i) {
        this.$t = i;
    }

    public ARunnableS83S0000000_3(MemoryDetailALogParameters memoryDetailALogParameters, int i) {
        this.$t = i;
    }
}
