package Y;

import X.C07FG;
import X.C07OX;
import X.C098200Yq;
import X.C0B22;
import X.C0B2B;
import X.C0B33;
import X.C0BNM;
import X.C0C4Y;
import X.C0CB2;
import X.C0CB3;
import X.C0CB9;
import X.C0CBN;
import X.C0CBO;
import X.C0CBP;
import X.C0CBQ;
import X.C0CBS;
import X.C0CFN;
import X.C0CMX;
import X.C0CNB;
import X.C0V60;
import X.C1246004uA;
import X.C1253204vK;
import X.C14LC;
import X.C1536390q5F;
import X.C1602860roS;
import X.C1856307Ov;
import X.C1867110ygf;
import X.C189200o6;
import X.C19254610Um;
import X.C19308310gL;
import X.C1BWL;
import X.C1C7U;
import X.C1E21;
import X.C1EKN;
import X.C2124308Tx;
import X.C2162308dZ;
import X.C2206241BWk;
import X.C2279461EKa;
import X.C2456309jt;
import X.C281550B1t;
import X.C282730B6h;
import X.C285090BFj;
import X.C302560BtW;
import X.C302950Bu9;
import X.C303320Buk;
import X.C307730C4l;
import X.C307820C4u;
import X.C308160C6c;
import X.C308170C6d;
import X.C309430CAz;
import X.C309690CBz;
import X.C312230CLt;
import X.C312840COc;
import X.C336620DHo;
import X.C786410Ut5;
import X.C792860V8i;
import X.C793770VBv;
import X.C799570VYd;
import X.C823050WQl;
import X.C844470XAv;
import X.InterfaceC20673515v3;
import X.InterfaceC313560CQw;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.legoimpl.PreloadBootFinishABValueTask;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.experiment.ColdBootTasksDegradeExperiment;
import com.ss.android.ugc.aweme.experiment.ReDexExperimentOpt;
import com.ss.android.ugc.aweme.feed.adapter.IFeedTypeConfigListPreload;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerWidget;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.hybridkit.task.HybridKitConfigTask;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.ss.android.ugc.aweme.legoImp.task.ColdBootSystemOptTask;
import com.ss.android.ugc.aweme.legoImp.task.PreloadWireFieldNoEnumClassTask;
import com.ss.android.ugc.aweme.legoImp.task.assem.ReporterExecutor;
import com.ss.android.ugc.aweme.legoImp.task.mainProcessTask.InitLegoInflate;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.settings.DisableSparkLynxPrefetchV2;
import com.ss.android.ugc.aweme.settings.SparkIABOptimizeConfig;
import com.ss.android.ugc.aweme.settings.SparkLynxPrefetchFallbackToV1;
import com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.feed.platform.ab.LowScreenOptimizeABImpl;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedTransferQueue;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.text.u;

/* JADX INFO: loaded from: classes5.dex */
public class ARunnableS84S0000000_4 implements Runnable {
    public final int $t;

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static void LIZ$0() {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        String strLLIIIJ;
        try {
            ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
            Unit unit = null;
            if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null && (strLLIIIJ = interfaceC20673515v3K4.LLIIIJ()) != null) {
                TTNetInit.preconnectUrl(strLLIIIJ);
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r4v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ$1() {
        /*
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L70
            long r0 = X.C202094145s.LJIILL     // Catch: java.lang.Throwable -> L70
            long r2 = r2 - r0
            java.lang.Boolean r9 = X.C1514430pVp.LIZLLL()     // Catch: java.lang.Throwable -> L70
            X.10Um r0 = X.C19254610Um.LIZIZ     // Catch: java.lang.Throwable -> L70
            int r1 = r0.LJJIJIIJI()     // Catch: java.lang.Throwable -> L70
            r0 = 3
            r7 = 0
            r6 = 1
            if (r1 == r0) goto L27
            X.10R5 r0 = X.C10R5.LJIIIIZZ     // Catch: java.lang.Throwable -> L70
            X.10R5 r0 = X.C10RS.LIZ()     // Catch: java.lang.Throwable -> L70
            boolean r0 = r0.LIZ     // Catch: java.lang.Throwable -> L70
            if (r0 != 0) goto L27
            r8 = 0
            goto L28
        L27:
            r8 = 1
        L28:
            boolean r0 = r9.booleanValue()     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L38
            boolean r0 = X.C311800CKc.LIZ     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L36
            if (r8 == 0) goto L36
            r5 = 1
            goto L3a
        L36:
            r5 = 0
            goto L3a
        L38:
            boolean r5 = X.C311800CKc.LIZ     // Catch: java.lang.Throwable -> L70
        L3a:
            java.lang.String r1 = "is_first_launch"
            boolean r0 = r9.booleanValue()     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L44
            r0 = 1
            goto L45
        L44:
            r0 = 0
        L45:
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = "is_nuj_finished"
            if (r8 == 0) goto L4e
            r0 = 1
            goto L4f
        L4e:
            r0 = 0
        L4f:
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = "from_start_to_current_duration"
            r4.put(r0, r2)     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = "is_tab_layout"
            boolean r0 = X.C311800CKc.LIZ     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L5e
            r7 = 1
        L5e:
            r4.put(r1, r7)     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = "is_tab_on_screen"
            r4.put(r0, r5)     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = "is_after_save_ab"
            org.json.JSONObject r0 = r4.put(r0, r6)     // Catch: java.lang.Throwable -> L70
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L70
            goto L7c
        L70:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L7c:
            java.lang.String r0 = "tab_ab_arrive_when_launch"
            X.C20684815ws.LJIJ(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS84S0000000_4.LIZ$1():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ$2() {
        /*
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L75
            long r0 = X.C202094145s.LJIILL     // Catch: java.lang.Throwable -> L75
            long r2 = r2 - r0
            java.lang.Boolean r9 = X.C1514430pVp.LIZLLL()     // Catch: java.lang.Throwable -> L75
            X.10Um r0 = X.C19254610Um.LIZIZ     // Catch: java.lang.Throwable -> L75
            int r1 = r0.LJJIJIIJI()     // Catch: java.lang.Throwable -> L75
            r0 = 3
            r7 = 1
            r6 = 0
            if (r1 == r0) goto L27
            X.10R5 r0 = X.C10R5.LJIIIIZZ     // Catch: java.lang.Throwable -> L75
            X.10R5 r0 = X.C10RS.LIZ()     // Catch: java.lang.Throwable -> L75
            boolean r0 = r0.LIZ     // Catch: java.lang.Throwable -> L75
            if (r0 != 0) goto L27
            r8 = 0
            goto L28
        L27:
            r8 = 1
        L28:
            boolean r0 = r9.booleanValue()     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L38
            boolean r0 = X.C311800CKc.LIZ     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L36
            if (r8 == 0) goto L36
            r5 = 1
            goto L3a
        L36:
            r5 = 0
            goto L3a
        L38:
            boolean r5 = X.C311800CKc.LIZ     // Catch: java.lang.Throwable -> L75
        L3a:
            java.lang.String r1 = "is_first_launch"
            boolean r0 = r9.booleanValue()     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L44
            r0 = 1
            goto L45
        L44:
            r0 = 0
        L45:
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = "is_nuj_finished"
            if (r8 == 0) goto L4e
            r0 = 1
            goto L4f
        L4e:
            r0 = 0
        L4f:
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = "from_start_to_current_duration"
            r4.put(r0, r2)     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = "is_tab_layout"
            boolean r0 = X.C311800CKc.LIZ     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L5f
            r0 = 1
            goto L60
        L5f:
            r0 = 0
        L60:
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = "is_tab_on_screen"
            if (r5 != 0) goto L68
            r7 = 0
        L68:
            r4.put(r0, r7)     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = "is_after_save_ab"
            org.json.JSONObject r0 = r4.put(r0, r6)     // Catch: java.lang.Throwable -> L75
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L75
            goto L81
        L75:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L81:
            java.lang.String r0 = "tab_ab_arrive_when_launch"
            X.C20684815ws.LJIJ(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS84S0000000_4.LIZ$2():void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS84S0000000_4(int r2) {
        /*
            r1 = this;
            r1.$t = r2
            switch(r2) {
                case 1: goto La;
                case 2: goto L5;
                case 3: goto La;
                case 4: goto La;
                case 5: goto La;
                case 6: goto L5;
                case 7: goto La;
                case 8: goto L5;
                case 9: goto L5;
                case 10: goto La;
                case 11: goto La;
                case 12: goto La;
                case 13: goto La;
                case 14: goto La;
                case 15: goto La;
                case 16: goto La;
                case 17: goto La;
                default: goto L5;
            }
        L5:
            r0 = r1
        L6:
            r0.<init>()
            return
        La:
            r0 = r1
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS84S0000000_4.<init>(int):void");
    }

    public static final void run$0(ARunnableS84S0000000_4 aRunnableS84S0000000_4) {
        boolean zLIZ;
        C1C7U.LIZ("LivePreviewPlayerWidget@e362.preConnectLiveHostSafely$1");
        try {
            LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LivePreviewPlayerWidget@e362.preConnectLiveHostSafely$1");
    }

    public static final void run$1(ARunnableS84S0000000_4 aRunnableS84S0000000_4) {
        C1C7U.LIZ("FixInflateCrashTask@d8ed.realRun$1L");
        C792860V8i c792860V8i = InitLegoInflate.LL;
        C844470XAv.LIZ.getClass();
        c792860V8i.LIZ(C844470XAv.LIZ());
        C1C7U.LIZIZ("FixInflateCrashTask@d8ed.realRun$1L");
    }

    public static final void run$10(ARunnableS84S0000000_4 aRunnableS84S0000000_4) {
        boolean zLIZ;
        C1C7U.LIZ("AbTestManager@3c64.onAbTestCompleteEvent$2");
        try {
            ISettingsRequestService iSettingsRequestService = (ISettingsRequestService) ServiceManager.get().getService(ISettingsRequestService.class);
            C844470XAv.LIZ.getClass();
            iSettingsRequestService.LIZ(C844470XAv.LIZ());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbTestManager@3c64.onAbTestCompleteEvent$2");
    }

    public static final void run$11(ARunnableS84S0000000_4 aRunnableS84S0000000_4) {
        C1C7U.LIZ("I18nSettingsWatcher@aab4.onChangeOptimize$1L");
        C19308310gL.LJII.LJFF();
        C1C7U.LIZIZ("I18nSettingsWatcher@aab4.onChangeOptimize$1L");
    }

    public static final void run$12(ARunnableS84S0000000_4 aRunnableS84S0000000_4) {
        boolean zLIZ;
        C1C7U.LIZ("PushSheduler@1ed.lambda$initPushByFlag$1$1");
        try {
            C303320Buk.LIZ(new ARunnableS88S0000000_9(13));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PushSheduler@1ed.lambda$initPushByFlag$1$1");
    }

    public static final void run$13(ARunnableS84S0000000_4 aRunnableS84S0000000_4) {
        C1C7U.LIZ("KidsModeApplicationImpl@d552.attachBaseContext$1L");
        C307730C4l.LIZLLL.LJIIIZ().load();
        C1C7U.LIZIZ("KidsModeApplicationImpl@d552.attachBaseContext$1L");
    }

    public static final void run$14(ARunnableS84S0000000_4 aRunnableS84S0000000_4) {
        C1C7U.LIZ("KidsModeApplicationImpl@d552.attachBaseContext$2L");
        C0C4Y.LIZJ.LJIIIZ().load();
        C1C7U.LIZIZ("KidsModeApplicationImpl@d552.attachBaseContext$2L");
    }

    public static final void run$15(ARunnableS84S0000000_4 aRunnableS84S0000000_4) {
        boolean zLIZ;
        C1C7U.LIZ("Apm@2a9a.init$2");
        try {
            C793770VBv.LJIIZILJ("Apm#init", "Apm init");
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("Apm@2a9a.init$2");
    }

    public static final void run$16(ARunnableS84S0000000_4 aRunnableS84S0000000_4) {
        boolean zLIZ;
        C1C7U.LIZ("Apm@2a9a.init$3");
        try {
            C793770VBv.LJIIZILJ("Apm#init", "Apm init");
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("Apm@2a9a.init$3");
    }

    public static final void run$17(ARunnableS84S0000000_4 aRunnableS84S0000000_4) throws InterruptedException {
        C1C7U.LIZ("ThreadWithBlockingQueue@d07d.start$1L");
        long j = C308170C6d.LIZIZ;
        if (j > 0) {
            Thread.sleep(j);
        }
        while (true) {
            try {
                String str = (String) ((LinkedTransferQueue) C308160C6c.LIZIZ).take();
                ((HashMap) C308170C6d.LIZJ).put(str, Integer.valueOf(C307820C4u.LIZJ.LIZIZ(str)));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C308160C6c.LIZLLL = true;
            }
        }
    }

    public static final void run$2(ARunnableS84S0000000_4 aRunnableS84S0000000_4) {
        C0CFN c0cfn = C0CFN.LIZ;
        C1C7U.LIZ("InitFakeMainTask@5499.realRun$1L");
        c0cfn.LIZLLL();
        C1C7U.LIZIZ("InitFakeMainTask@5499.realRun$1L");
    }

    public static final void run$3(ARunnableS84S0000000_4 aRunnableS84S0000000_4) {
        C1C7U.LIZ("InitKevaTask@21e1.realRun$1L");
        C1602860roS.LIZ.getClass();
        C1602860roS.LJ();
        C312230CLt.LJIIIIZZ = true;
        C1C7U.LIZIZ("InitKevaTask@21e1.realRun$1L");
    }

    public static final void run$4(ARunnableS84S0000000_4 aRunnableS84S0000000_4) {
        C1C7U.LIZ("PreloadIOTask@d56b.realRun$1L");
        C0CBP c0cbp = C0CBP.LIZ;
        final Application applicationLIZ = C1BWL.LIZ();
        c0cbp.getClass();
        ColdBootTasksDegradeExperiment.LIZ();
        if (C0CMX.LIZ()) {
            C312230CLt.LIZIZ();
            C312230CLt.LIZLLL();
            C312230CLt.LJIJJ.getValue();
            C312230CLt.LJIJJLI.getValue();
            C312230CLt.LJIIJJI();
        }
        if (C0B22.LIZ) {
            C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0CBT
                @Override // java.lang.Runnable
                @C1BCF(distinctId = 13, scene = "boot", taskPriority = EnumC21352718hJ.P2)
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PreloadInInitBefore@7565.preload$1");
                    try {
                        InitLegoInflate.LL.LIZ(applicationLIZ);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PreloadInInitBefore@7565.preload$1");
                }
            });
        }
        if (((Boolean) C285090BFj.LJLZ.getValue()).booleanValue()) {
            C336620DHo.LIZ = true;
            C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0DHn
                public static void LIZ() throws Throwable {
                    C844470XAv.LIZ.getClass();
                    Display displayLLILZIL = C2204961BRm.LLILZIL((WindowManager) C786410Ut5.H2(C844470XAv.LIZ(), "window"), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOu4c5PH3zNdpx5Br4BCH3H7HZ/+xrdalPZ2AmDsIqg=", null));
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    try {
                        displayLLILZIL.getRealMetrics(displayMetrics);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C2344809Gs.LJI(e);
                    }
                    C336620DHo.LIZIZ = displayMetrics;
                    int iMax = (int) (Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels) / displayMetrics.density);
                    boolean z = false;
                    boolean z2 = iMax <= 640;
                    boolean zLIZ = LowScreenOptimizeABImpl.LIZIZ().LIZ(iMax);
                    boolean z3 = ((Number) C303940Bvk.LIZ.getValue()).intValue() == 1 && z2;
                    if (((Number) C303950Bvl.LIZ.getValue()).intValue() == 1 && z2) {
                        z = true;
                    }
                    C336620DHo.LIZLLL = z3;
                    C336620DHo.LJFF = z;
                    C336620DHo.LJ = zLIZ;
                    C336620DHo.LIZJ = true;
                    boolean z4 = C14LC.LJIIIZ;
                    C14LC c14lc = C309690CBz.LIZ;
                }

                @Override // java.lang.Runnable
                @C1BCF(distinctId = 14, scene = "boot", taskPriority = EnumC21352718hJ.P2)
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PreloadInInitBefore@7565.preload$2");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PreloadInInitBefore@7565.preload$2");
                }
            });
        }
        if (C0B2B.LIZ && C2456309jt.LIZ() && Build.VERSION.SDK_INT >= 28) {
            C823050WQl.LIZJ().execute(new Runnable() { // from class: X.09k7
                @Override // java.lang.Runnable
                @C1BCF(distinctId = 15, scene = "boot", taskPriority = EnumC21352718hJ.P2)
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PreloadInInitBefore@7565.preload$3");
                    try {
                        Class.forName("android.graphics.HardwareRenderer").getDeclaredMethod("preload", new Class[0]).invoke(null, new Object[0]);
                    } finally {
                        try {
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                    }
                    C1C7U.LIZIZ("PreloadInInitBefore@7565.preload$3");
                }
            });
        }
        if (C281550B1t.LIZ) {
            if (!C1867110ygf.LIZ()) {
                ((Boolean) C1867110ygf.LIZJ.getValue()).booleanValue();
            }
            C0CBO.LIZ();
            C302950Bu9.LIZ();
            DisableSparkLynxPrefetchV2.LIZ();
            DisableSparkLynxPrefetchV2.LIZJ.getValue();
            SparkLynxPrefetchFallbackToV1.LIZ();
            DisableSparkLynxPrefetchV2.LIZIZ();
            ((Number) C0BNM.LIZ.getValue()).longValue();
            boolean z = C1536390q5F.LIZ;
            C1253204vK.LIZ();
            ((Boolean) SparkIABOptimizeConfig.LIZLLL.getValue()).booleanValue();
            C302560BtW.LIZ();
        }
        C0CBQ.LIZ();
        C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.0CBU
            public static void LIZ() {
                C0CBQ.LIZIZ("ss");
                try {
                    if (C1940507it.LIZ() != null) {
                        C1940507it.LIZ().contains("ss");
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C0CBW c0cbw = C0CBW.LIZ;
                if (C0CBW.LIZ() != 0) {
                    C0CBW.LIZJ = true;
                } else {
                    synchronized (c0cbw) {
                        try {
                            if (C0CBW.LIZ() == 0) {
                                System.currentTimeMillis();
                                String str = Build.MODEL;
                                Iterator it2 = ((List) C0CBW.LJ.getValue()).iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        C0CBW.LIZIZ.storeInt("local_low_device_init", 1);
                                        Iterator it3 = ((List) C0CBW.LJFF.getValue()).iterator();
                                        while (true) {
                                            if (!it3.hasNext()) {
                                                C0CBW c0cbw2 = C0CBW.LIZ;
                                                C0CBW.LIZJ(4);
                                                C0CBW.LIZJ = true;
                                                break;
                                            } else if (u.LJIJI((String) it3.next(), str, true)) {
                                                C0CBW.LIZIZ.storeInt("local_low_device_init", 3);
                                                C0CBW c0cbw3 = C0CBW.LIZ;
                                                C0CBW.LIZJ(3);
                                                C0CBW.LIZJ = true;
                                                break;
                                            }
                                        }
                                    } else if (u.LJIJI((String) it2.next(), str, true)) {
                                        C0CBW.LIZIZ.storeInt("local_low_device_init", 2);
                                        C0CBW c0cbw4 = C0CBW.LIZ;
                                        C0CBW.LIZJ(2);
                                        C0CBW.LIZJ = true;
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                if (((Boolean) C309640CBu.LIZ.getValue()).booleanValue()) {
                    C0CBP c0cbp2 = C0CBP.LIZ;
                    boolean z2 = C14LC.LJIIIZ;
                    C14LC c14lc = C309690CBz.LIZ;
                    c0cbp2.getClass();
                }
            }

            @Override // java.lang.Runnable
            @C1BCF(distinctId = 16, scene = "boot", taskPriority = EnumC21352718hJ.P2)
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PreloadInInitBefore@7565.preload$4");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PreloadInInitBefore@7565.preload$4");
            }
        });
        if (((Boolean) C2279461EKa.LJFF.getValue()).booleanValue()) {
            C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.09k5
                @Override // java.lang.Runnable
                @C1BCF(distinctId = 17, scene = "boot", taskPriority = EnumC21352718hJ.P2)
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PreloadInInitBefore@7565.preload$5");
                    try {
                        LoadSoLancet.LIZJ("fileprotect");
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        Librarian.LJFF("fileprotect");
                        LoadSoLancet.LJ(jUptimeMillis, "fileprotect");
                        LoadSoLancet.LIZLLL(jUptimeMillis, "fileprotect");
                        LoadSoLancet.LIZIZ("fileprotect");
                    } finally {
                        try {
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                    }
                    C1C7U.LIZIZ("PreloadInInitBefore@7565.preload$5");
                }
            });
        }
        if (!Process.is64Bit()) {
            C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.09k6
                @Override // java.lang.Runnable
                @C1BCF(distinctId = 18, scene = "boot", taskPriority = EnumC21352718hJ.P2)
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PreloadInInitBefore@7565.preload$6");
                    try {
                        LoadSoLancet.LIZJ("godzilla-sysopt");
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        Librarian.LJFF("godzilla-sysopt");
                        LoadSoLancet.LJ(jUptimeMillis, "godzilla-sysopt");
                        LoadSoLancet.LIZLLL(jUptimeMillis, "godzilla-sysopt");
                        LoadSoLancet.LIZIZ("godzilla-sysopt");
                    } finally {
                        try {
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                    }
                    C1C7U.LIZIZ("PreloadInInitBefore@7565.preload$6");
                }
            });
        }
        if (applicationLIZ != null && C2162308dZ.LJI(applicationLIZ)) {
            C1602860roS.LIZ.getClass();
            if (!C1602860roS.LJ() && !C1602860roS.LJ() && Build.VERSION.SDK_INT < 26) {
                C823050WQl.LIZIZ().execute(new ARunnableS102S0100000_2(applicationLIZ, 46));
            }
        }
        if (C2206241BWk.LIZ()) {
            if (applicationLIZ != null) {
                new PreloadWireFieldNoEnumClassTask().run(applicationLIZ);
            }
            new C0CBN().run();
            new C0CBS().run();
        }
        if (((Boolean) C1856307Ov.LIZIZ.getValue()).booleanValue()) {
            boolean z2 = C14LC.LJIIIZ;
            C14LC c14lc = C309690CBz.LIZ;
        }
        if (((Boolean) C07OX.LJII.getValue()).booleanValue()) {
            C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0CFi
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PreloadInInitBefore@7565.preload$9");
                    try {
                        String str = HybridKitConfigTask.LL;
                        HybridKitConfigTask.LL = C1553670qX7.LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PreloadInInitBefore@7565.preload$9");
                }
            });
        }
        if (((Boolean) C285090BFj.LJJJJJL.getValue()).booleanValue()) {
            C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.0BuA
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PreloadInInitBefore@7565.preload$10");
                    try {
                        C161N c161n = C161N.LIZIZ;
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PreloadInInitBefore@7565.preload$10");
                }
            });
        }
        if (((Boolean) C285090BFj.LJJJJL.getValue()).booleanValue()) {
            C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.0574
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PreloadInInitBefore@7565.preload$11");
                    try {
                        IFeedTypeConfigListPreload iFeedTypeConfigListPreload = (IFeedTypeConfigListPreload) PluggableExtentionKt.pluggableSpi$default(IFeedTypeConfigListPreload.class, false, false, false, 14, null);
                        if (iFeedTypeConfigListPreload != null) {
                            iFeedTypeConfigListPreload.LIZ();
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PreloadInInitBefore@7565.preload$11");
                }
            });
        }
        if (((Boolean) C285090BFj.LJJIFFI.getValue()).booleanValue()) {
            C0V60.LIZ();
            if (((Boolean) C282730B6h.LIZ.getValue()).booleanValue()) {
                C0CB3.LIZ = new C0CB9();
            }
            ReDexExperimentOpt.load();
            C2124308Tx.LIZ();
            if (!((Boolean) C1E21.LJII.getValue()).booleanValue() || C2162308dZ.LJI(applicationLIZ)) {
                ColdBootSystemOptTask.LIZ();
            }
            if (((Boolean) C07FG.LJI.getValue()).booleanValue()) {
                C309430CAz.LIZ = 9150;
            }
        }
        IMainService iMainService = (IMainService) PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null);
        if (iMainService != null) {
            iMainService.preloadScene();
        }
        if (((Boolean) C1EKN.LJIIJ.getValue()).booleanValue()) {
            C786410Ut5.LJLIIL(((Number) C1246004uA.LIZJ.getValue()).intValue(), C799570VYd.LIZIZ(), new Runnable() { // from class: X.0CXD
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PreloadInInitBefore@7565.preload$12");
                    try {
                        ComplianceServiceProvider.LJJI().LJJIJ();
                        C189200o6.m2constructorimpl(Boolean.valueOf(ComplianceServiceProvider.LJIL().LJJJJZI()));
                    } finally {
                        try {
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                    }
                    C1C7U.LIZIZ("PreloadInInitBefore@7565.preload$12");
                }
            });
        }
        if (((Boolean) C285090BFj.LLFFF.getValue()).booleanValue()) {
            C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.01VU
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PreloadInInitBefore@7565.preload$13");
                    try {
                        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PreloadInInitBefore@7565.preload$13");
                }
            });
        }
        if (((Boolean) C285090BFj.LLFII.getValue()).booleanValue()) {
            C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.0qS4
                public static void LIZ() {
                    try {
                        ((Boolean) C0CD2.LJIIIZ.getValue()).booleanValue();
                        ExecutorService executorService = C2126108Up.LIZ;
                        C810560Vqw.LJ(new Runnable() { // from class: X.0qS5
                            @Override // java.lang.Runnable
                            public final void run() {
                                C1C7U.LIZ("PreloadInInitBefore@7565.preload$14$1$1");
                                C1C7U.LIZIZ("PreloadInInitBefore@7565.preload$14$1$1");
                            }
                        });
                        ExecutorService executorService2 = C2281108wj.LIZ;
                        C2281108wj.LIZIZ(EnumC2281308wl.Sequence, true, new Runnable() { // from class: X.0qS6
                            @Override // java.lang.Runnable
                            public final void run() {
                                C1C7U.LIZ("PreloadInInitBefore@7565.preload$14$1$2");
                                C1C7U.LIZIZ("PreloadInInitBefore@7565.preload$14$1$2");
                            }
                        });
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PreloadInInitBefore@7565.preload$14");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PreloadInInitBefore@7565.preload$14");
                }
            });
        }
        try {
            ReporterExecutor value = ReporterExecutor.LLILZIL.getValue();
            value.getClass();
            if (C0B33.LIZ) {
            }
            C0CFN.LIZ.LJ();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C1C7U.LIZIZ("PreloadIOTask@d56b.realRun$1L");
    }

    public static final void run$5(ARunnableS84S0000000_4 aRunnableS84S0000000_4) {
        boolean zLIZ;
        C1C7U.LIZ("IdleHandlerOptLancet@df10.ensureInit$1");
        try {
            if (!C0CNB.LIZIZ) {
                C0CNB.LIZ();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IdleHandlerOptLancet@df10.ensureInit$1");
    }

    public static final void run$6(ARunnableS84S0000000_4 aRunnableS84S0000000_4) {
        boolean zLIZ;
        C1C7U.LIZ("ABClientIDTask@e93f.run$1");
        try {
            C312840COc c312840COc = C312840COc.LIZ;
            InterfaceC313560CQw interfaceC313560CQwLJIJJ = C19254610Um.LIZIZ.LJIJJ();
            AFwS190S0000000_4 aFwS190S0000000_4 = AFwS190S0000000_4.get$arr$(1716);
            c312840COc.getClass();
            C312840COc.LIZ(interfaceC313560CQwLJIJJ, aFwS190S0000000_4);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ABClientIDTask@e93f.run$1");
    }

    public static final void run$7(ARunnableS84S0000000_4 aRunnableS84S0000000_4) {
        boolean zLIZ;
        C1C7U.LIZ("MessageControllerTask@d094.run$2$onActivityResumed$1");
        try {
            new PreloadBootFinishABValueTask().run(C1BWL.LIZ());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MessageControllerTask@d094.run$2$onActivityResumed$1");
    }

    public static final void run$8(ARunnableS84S0000000_4 aRunnableS84S0000000_4) {
        boolean zLIZ;
        C1C7U.LIZ("HomeTabMonitorHelper@3235.registerConfigurationChunkCallback$1$onAfterDataSave$1");
        try {
            LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("HomeTabMonitorHelper@3235.registerConfigurationChunkCallback$1$onAfterDataSave$1");
    }

    public static final void run$9(ARunnableS84S0000000_4 aRunnableS84S0000000_4) {
        boolean zLIZ;
        C1C7U.LIZ("HomeTabMonitorHelper@3235.registerConfigurationChunkCallback$1$onBeforeDataSave$1");
        try {
            LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("HomeTabMonitorHelper@3235.registerConfigurationChunkCallback$1$onBeforeDataSave$1");
    }

    public ARunnableS84S0000000_4(C0CB2 c0cb2, int i) {
        this.$t = i;
    }

    public ARunnableS84S0000000_4(Context context, int i) {
        this.$t = i;
    }

    public ARunnableS84S0000000_4(LivePreviewPlayerWidget livePreviewPlayerWidget, int i) {
        this.$t = i;
    }
}
