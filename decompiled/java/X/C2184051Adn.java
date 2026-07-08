package X;

import Y.AObjectS356S0100000_13;
import Y.AObjectS76S0000000_26;
import Y.AObjectS80S0000000_33;
import Y.ARunnableS104S0000000_31;
import Y.ARunnableS106S0000000_33;
import Y.ARunnableS20S1000000_33;
import Y.ARunnableS5S1000000_9;
import Y.ARunnableS83S0000000_3;
import Y.ARunnableS88S0000000_9;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.view.Display;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.jato.gfx.DoFrameController;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.BusinessModuleService;
import com.ss.android.ugc.aweme.strategy.api.IStrategyApi;
import com.ss.android.ugc.aweme.util.IFeedCacheLoaderService;
import com.ss.android.ugc.aweme.util.IStartupFeedAwemesService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Adn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2184051Adn implements C0CMV {
    public InterfaceC1602960roc LIZ;
    public final long LIZIZ = ((Number) C285780BIa.LIZIZ.getValue()).longValue();
    public final HandlerThread LIZJ;
    public final BPEAHandler LIZLLL;
    public final RunnableC2184061Ado LJ;
    public final AtomicInteger LJFF;
    public final boolean LJI;
    public final boolean LJII;

    public final void LIZ() {
        int i;
        InterfaceC1602960roc interfaceC1602960roc = this.LIZ;
        if (interfaceC1602960roc != null) {
            interfaceC1602960roc.LIZ("end_launch_vv", Integer.toString(C585500Mxo.LIZ));
            interfaceC1602960roc.LIZ("end_frame_count", Long.toString(C791380V2q.LIZLLL.get()));
            if (((Boolean) C278140AvE.LIZIZ.getValue()).booleanValue() && this.LJFF.get() == 1) {
                if ("com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment".contains(C2187451AjH.LJIIIZ)) {
                    interfaceC1602960roc.LIZ("in_fyp", "1");
                } else {
                    interfaceC1602960roc.LIZ("in_fyp", CardStruct.IStatusCode.DEFAULT);
                }
                IStartupFeedAwemesService iStartupFeedAwemesService = C584470Mw9.LJII;
                if (iStartupFeedAwemesService != null) {
                    C443120HZe<Integer, Integer, Integer> c443120HZeLIZ = iStartupFeedAwemesService.LIZ();
                    interfaceC1602960roc.LIZ("first_aweme_type", String.valueOf(c443120HZeLIZ.getFirst()));
                    interfaceC1602960roc.LIZ("second_aweme_type", String.valueOf(c443120HZeLIZ.getSecond()));
                    interfaceC1602960roc.LIZ("third_aweme_type", String.valueOf(c443120HZeLIZ.getThird()));
                }
            }
            interfaceC1602960roc.stop();
            if (this.LJFF.get() == 1) {
                C0VWW.LIZIZ("core_scene_loop_1");
                C820260WFs.LIZ = true;
                C312230CLt.LJIIJ(C0CME.START_UP_END);
                C788320UwA c788320UwA = C820260WFs.LIZLLL;
                C820260WFs.LIZLLL = null;
                if (c788320UwA != null) {
                    c788320UwA.LIZIZ();
                }
                IStrategyApi iStrategyApi = C820260WFs.LIZJ;
                if (iStrategyApi != null) {
                    iStrategyApi.LJJIJL(new ARunnableS106S0000000_33(4));
                }
                C104100aN.LIZ().LJJIJL(new ARunnableS20S1000000_33("SystemLaunchStage", 1));
                if (((Boolean) C304660Bwu.LIZIZ.getValue()).booleanValue()) {
                    DoFrameController.LIZIZ = 0;
                }
                C823050WQl.LIZIZ().execute(new ARunnableS83S0000000_3(34));
                if (((Boolean) C1229304rT.LIZIZ.getValue()).booleanValue()) {
                    C0N5P.LJ("system_launch_new");
                }
                if (((Boolean) C305730Byd.LIZIZ.getValue()).booleanValue() && (i = Build.VERSION.SDK_INT) > 30 && i <= ((Number) C0BPC.LIZ.getValue()).intValue()) {
                    C104100aN.LIZ().LJJIJL(C08G8.LL);
                }
                if (C146C.LIZ) {
                    C786410Ut5.LJJZZIII(C2113808Pw.LIZIZ.LL, new ARunnableS88S0000000_9(18));
                }
                if (((Boolean) C1DS1.LJJIJIL.getValue()).booleanValue()) {
                    final boolean z = this.LJII;
                    C0VV4.LIZ.addIfAbsent(new C0VV5(z) { // from class: X.0VWO
                        public final boolean LIZ;

                        {
                            this.LIZ = z;
                        }

                        @Override // X.C0VV5
                        public final void LIZ(String str, JSONObject jSONObject) {
                            if (jSONObject.optInt("loop_count", -1) == 0 && "core_scene".equals(str)) {
                                long jOptLong = jSONObject.optLong("block_duration", 0L);
                                if (this.LIZ && jOptLong > ((Number) C1DS1.LJJIJL.getValue()).longValue()) {
                                    EnumC805430Vif enumC805430Vif = EnumC805430Vif.FEED_FORYOU;
                                    if (C584360Mvy.LIZIZ()) {
                                        enumC805430Vif = EnumC805430Vif.FEED_FORYOU_5VV;
                                    }
                                    C804290Vgp.LIZ(new C804330Vgt(enumC805430Vif, EnumC804170Vgd.CORE_SCENE_FPS_JANK));
                                }
                                C0VV4.LIZ.remove(this);
                            }
                        }
                    });
                }
            }
        }
    }

    public final void LIZIZ() {
        DisplayManager displayManager;
        Display display;
        InterfaceC1602960roc interfaceC1602960rocLIZ = C0VWN.LIZ("core_scene", true);
        interfaceC1602960rocLIZ.LIZ("loop_count", Integer.toString(this.LJFF.getAndIncrement()));
        interfaceC1602960rocLIZ.LIZ("is_launch_from_home", this.LJII ? "1" : CardStruct.IStatusCode.DEFAULT);
        interfaceC1602960rocLIZ.LIZ("core_scene_sample_period", String.valueOf(this.LIZIZ));
        interfaceC1602960rocLIZ.LIZ("feed_has_cache", this.LJI ? "1" : CardStruct.IStatusCode.DEFAULT);
        this.LIZ = interfaceC1602960rocLIZ;
        interfaceC1602960rocLIZ.LIZ("start_launch_vv", Integer.toString(C585500Mxo.LIZ));
        interfaceC1602960rocLIZ.LIZ("start_frame_count", Long.toString(C791380V2q.LIZLLL.get()));
        interfaceC1602960rocLIZ.LIZ("cache_revert_status", Integer.toString(C584470Mw9.LJIJ));
        interfaceC1602960rocLIZ.start();
        if (this.LJFF.get() == 1) {
            C0VWW.LJI("core_scene_loop_1");
            interfaceC1602960rocLIZ.LIZ("aweme_is_paid_content", Integer.toString(C1150504el.LIZ().LJIILIIL));
            boolean z = C820260WFs.LIZ;
            if (C146C.LIZ) {
                C146A c146aLIZ = C202103146b.LIZ(2, "boot_finish");
                c146aLIZ.LIZIZ(0.25f);
                c146aLIZ.LIZ("total");
            }
            C820260WFs.LIZIZ = SystemClock.elapsedRealtime();
            C082Q.LJIIIZ = C07A2.LJ;
            C2184071Adp.LIZ.getClass();
            C104100aN.LIZ().LJJIJL(new ARunnableS20S1000000_33("AllStage", 0));
            C104100aN.LIZ().LJJIJL(new ARunnableS20S1000000_33("OnPageSelectedStage", 0));
            C104100aN.LIZ().LJJIJL(new ARunnableS20S1000000_33("SystemLaunchStage", 0));
            if (C07A2.LIZLLL) {
                C082Q.LIZ();
            }
            C823050WQl.LIZIZ().execute(new ARunnableS104S0000000_31(2));
            int i = C2516909tf.LIZ;
            if (i >= 2 && C1150504el.LIZ().LJIILJJIL == 1 && C1150504el.LIZ().LJIIJJI == 0 && (displayManager = (DisplayManager) C786410Ut5.G2(C1BWL.LIZ(), "display")) != null && (display = displayManager.getDisplay(0)) != null && display.getRefreshRate() >= 60.0f) {
                final C788320UwA c788320UwA = new C788320UwA();
                int i2 = C2549909yz.LIZ;
                if (i2 >= 2) {
                    c788320UwA.LIZ(i2);
                    ((ArrayList) C0CFK.LJI).add(new AObjectS356S0100000_13(c788320UwA, 0));
                    ((ArrayList) C0CFK.LJIIIIZZ).add(new AObjectS356S0100000_13(c788320UwA, 1));
                    C0CMU.LIZ.LIZIZ(new C0CMV() { // from class: X.0VVr
                        @Override // X.C0CMV
                        public final void LIZJ() {
                        }

                        @Override // X.C0CMV
                        public final void onExit() {
                            c788320UwA.LIZIZ();
                        }
                    });
                } else {
                    c788320UwA.LIZ(i);
                    C820260WFs.LIZLLL = c788320UwA;
                }
            }
            if (C1514060pVE.LIZIZ()) {
                DoFrameController.LIZIZ = 0;
                BusinessModuleService businessModuleService = (BusinessModuleService) PluggableExtentionKt.pluggableSpi(BusinessModuleService.class);
                if (businessModuleService != null) {
                    businessModuleService.resetWatchState();
                }
            }
            IStrategyApi iStrategyApi = C820260WFs.LIZJ;
            if (iStrategyApi != null) {
                iStrategyApi.LJJIJL(new ARunnableS106S0000000_33(5));
            }
            if (((Boolean) C304660Bwu.LIZIZ.getValue()).booleanValue()) {
                DoFrameController.LIZIZ = ((Number) C304660Bwu.LIZJ.getValue()).intValue();
            }
            if (((Boolean) C304670Bwv.LIZIZ.getValue()).booleanValue()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("core_scene_loop_1_");
                C01GW c01gw = C304670Bwv.LIZJ;
                sbLIZ.append(((Number) c01gw.getValue()).longValue() / 1000);
                sbLIZ.append("s");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C0VWW.LJI(strLIZIZ);
                C786410Ut5.LJLIIL(((Number) c01gw.getValue()).longValue(), C2113808Pw.LIZIZ.LL, new ARunnableS5S1000000_9(strLIZIZ, 3));
            }
            C2184091Adr.LIZ();
            if (((Boolean) C2184781Aey.LIZLLL.getValue()).booleanValue()) {
                C312240CLu.LIZ(new C0CM3(C0CMJ.HIGH_PRIORITY.getType(), C0CME.FIRST_VIDEO_SHOW, "StartupJankFirstStageBlock", new AObjectS80S0000000_33(7), true));
            }
            if (C2508309sH.LIZ > 0 && C1150504el.LIZ().LJIILJJIL == 1 && C1150504el.LIZ().LJIIJJI == 0) {
                C312240CLu.LIZ(new C0CM3(C0CMJ.HIGH_PRIORITY.getType(), C0CME.FIRST_VIDEO_SHOW, "StartupJankDoFrameMerge", new AObjectS76S0000000_26(1), true));
            }
            if (C1514060pVE.LIZIZ() && !C0CN5.LJII() && C1514060pVE.LIZIZ()) {
                C20508081q.LIZ(C786410Ut5.v2(), RunnableC310490CFb.LL);
            }
        }
    }

    @Override // X.C0CMV
    public final void onExit() {
        this.LIZLLL.removeCallbacks(this.LJ);
        InterfaceC1602960roc interfaceC1602960roc = this.LIZ;
        if (interfaceC1602960roc != null) {
            interfaceC1602960roc.LJIIJJI(1, "is_exit");
        }
        LIZ();
        this.LIZJ.quitSafely();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.1Ado] */
    public C2184051Adn() {
        HandlerThread handlerThread = new HandlerThread("core_scene_period");
        this.LIZJ = handlerThread;
        boolean zLJII = false;
        this.LJFF = new AtomicInteger(0);
        Set services = ServiceManager.get().getServices(IFeedCacheLoaderService.class);
        if (services != null) {
            Iterator it2 = services.iterator();
            if (it2.hasNext()) {
                zLJII = ((IFeedCacheLoaderService) it2.next()).LJII();
            }
        }
        this.LJI = zLJII;
        this.LJII = C2456309jt.LIZ();
        this.LJ = new Runnable() { // from class: X.1Ado
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FpsReportHelper@46a.realStartCoreSceneMonitor$1$<field>$1");
                try {
                    this.LL.LIZ.LJIIJJI(0, "is_exit");
                    this.LL.LIZ();
                    this.LL.LIZIZ();
                    C2184051Adn c2184051Adn = this.LL;
                    C786410Ut5.LJLIIL(c2184051Adn.LIZIZ, c2184051Adn.LIZLLL, c2184051Adn.LJ);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FpsReportHelper@46a.realStartCoreSceneMonitor$1$<field>$1");
            }
        };
        handlerThread.start();
        this.LIZLLL = new BPEAHandler(C786410Ut5.W2(handlerThread));
    }

    @Override // X.C0CMV
    public final void LIZJ() {
        LIZIZ();
        C786410Ut5.LJLIIL(this.LIZIZ, this.LIZLLL, this.LJ);
    }
}
