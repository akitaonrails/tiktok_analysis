package X;

import android.os.Looper;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastResourceOptSetting;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.0USd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C772530USd {
    public static volatile boolean LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static final BPEAHandler LIZLLL = new BPEAHandler(Looper.getMainLooper());
    public static final RunnableC772300URg LJ = RunnableC772300URg.LL;

    public static void LIZIZ() {
        if (LiveBroadcastResourceOptSetting.INSTANCE.pauseGeckoDownload()) {
            try {
                ((IHostResource) C1161920gLG.LIZJ(IHostResource.class)).OP(true);
                LIZJ = true;
                C20441214yg.LIZIZ("BroadcastResOpt", "gecko download paused");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("pauseGeckoDownload error: ");
                sbLIZ.append(th.getMessage());
                C20441214yg.LIZIZ("BroadcastResOpt", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public static void LIZJ() {
        if (LiveBroadcastResourceOptSetting.INSTANCE.pauseImagePipeline()) {
            try {
                C1325540kbA c1325540kbALIZ = C1322200kVm.LIZ();
                if (c1325540kbALIZ.LJIILL()) {
                    return;
                }
                c1325540kbALIZ.LJIILLIIL();
                LIZIZ = true;
                C20441214yg.LIZIZ("BroadcastResOpt", "image pipeline paused");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("pauseImagePipeline error: ");
                sbLIZ.append(th.getMessage());
                C20441214yg.LIZIZ("BroadcastResOpt", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public static void LIZLLL() {
        try {
            C772430URt.LIZ();
            C20441214yg.LIZIZ("BroadcastResOpt", "applog flush resumed");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resumeAppLog error: ");
            sbLIZ.append(th.getMessage());
            C20441214yg.LIZIZ("BroadcastResOpt", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LJ() {
        if (LIZJ) {
            try {
                ((IHostResource) C1161920gLG.LIZJ(IHostResource.class)).Ck2();
                LIZJ = false;
                C20441214yg.LIZIZ("BroadcastResOpt", "gecko download resumed");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("resumeGeckoDownload error: ");
                sbLIZ.append(th.getMessage());
                C20441214yg.LIZIZ("BroadcastResOpt", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public static void LJFF() {
        if (LIZIZ) {
            try {
                C1322200kVm.LIZ().LJIJJ();
                LIZIZ = false;
                C20441214yg.LIZIZ("BroadcastResOpt", "image pipeline resumed");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("resumeImagePipeline error: ");
                sbLIZ.append(th.getMessage());
                C20441214yg.LIZIZ("BroadcastResOpt", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public static void LJI() {
        try {
            C800240VaI.LIZ();
            C20441214yg.LIZIZ("BroadcastResOpt", "lego tasks resumed");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resumeLegoTasks error: ");
            sbLIZ.append(th.getMessage());
            C20441214yg.LIZIZ("BroadcastResOpt", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LJII() {
        if (LIZ) {
            LIZ = false;
            C20441214yg.LIZIZ("BroadcastResOpt", "stopOpt");
            LIZLLL.removeCallbacks(LJ);
            LJFF();
            LJI();
            LIZLLL();
            LJ();
        }
    }

    public static void LJIIIIZZ() {
        LiveBroadcastResourceOptSetting liveBroadcastResourceOptSetting = LiveBroadcastResourceOptSetting.INSTANCE;
        if (liveBroadcastResourceOptSetting.suspendLegoTasks()) {
            try {
                List<String> listLegoTaskAllowList = liveBroadcastResourceOptSetting.legoTaskAllowList();
                C799900VZk c799900VZk = C799900VZk.LIZ;
                C800250VaJ c800250VaJ = new C800250VaJ(listLegoTaskAllowList);
                c799900VZk.getClass();
                C800240VaI.LIZ = C799900VZk.LIZ(c800250VaJ);
                C20441214yg.LIZIZ("BroadcastResOpt", "lego tasks suspended");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("suspendLegoTasks error: ");
                sbLIZ.append(th.getMessage());
                C20441214yg.LIZIZ("BroadcastResOpt", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public static void LIZ(int i) {
        if (!LIZ) {
            return;
        }
        if (C1697810uHb.LJIIJJI(1, Integer.MAX_VALUE).contains(Integer.valueOf(i))) {
            LIZLLL();
        }
        if (C1697810uHb.LJIIJJI(Integer.valueOf(LiveBroadcastResourceOptSetting.INSTANCE.endPhase()), Integer.MAX_VALUE).contains(Integer.valueOf(i))) {
            LIZLLL.removeCallbacks(LJ);
            LJFF();
            LJI();
            LJ();
            LIZ = false;
            C20441214yg.LIZIZ("BroadcastResOpt", "stopOpt endPhase");
            return;
        }
        if (i != 1) {
            return;
        }
        BPEAHandler bPEAHandler = LIZLLL;
        RunnableC772300URg runnableC772300URg = LJ;
        bPEAHandler.removeCallbacks(runnableC772300URg);
        C786410Ut5.LJLIIL(10000L, bPEAHandler, runnableC772300URg);
        C20441214yg.LIZIZ("BroadcastResOpt", "safety timer armed for 10000ms after PHASE_CREATE_ROOM");
    }
}
