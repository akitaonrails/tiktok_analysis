package X;

import Y.AObjectS294S0200000_20;
import Y.AObjectS394S0100000_20;
import Y.ARunnableS120S0100000_20;
import a17.a0;
import android.os.Looper;
import com.bytedance.amg.minigameruntime.api.IClientAdapterService;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vmsdk.worker.JsWorker;
import com.lynx.canvas.Krypton;
import com.lynx.canvas.KryptonApp;
import com.lynx.canvas.KryptonCompat;
import com.lynx.canvas.KryptonFeatureFlag;
import com.lynx.canvas.remote.KryptonAppRemoteDelegate;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0k2N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1303970k2N extends AbstractC1304120k2c {
    public final C1524970pmp LIZ;
    public KryptonApp LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AObjectS394S0100000_20(this, 0));
    public volatile int LIZLLL;
    public C1303980k2O LJ;
    public volatile Thread LJFF;

    public final void LIZ() {
        int i;
        C1524970pmp c1524970pmp = this.LIZ;
        C1304160k2g c1304160k2g = c1524970pmp.LIZ;
        JsWorker jsWorker = c1524970pmp.LIZJ.LJ;
        long napiEnv = jsWorker != null ? jsWorker.getNapiEnv() : -1L;
        Krypton.LIZIZ().LIZ(c1304160k2g.LIZ());
        Krypton.LIZIZ().LIZJ.put("miniApp", new C1304060k2W(this));
        synchronized (this) {
            this.LIZLLL++;
            i = this.LIZLLL;
        }
        KryptonFeatureFlag.Builder builder = new KryptonFeatureFlag.Builder();
        builder.setGPUThreadGroup(i);
        builder.setEnableSar(false);
        builder.setNeedProcessGesture(true);
        builder.setNeedBindingRaf(true);
        builder.setEnablePerformanceStatisticsRelatedInterface(true);
        builder.setEnableFirstFrameCallback(true);
        builder.setFirstOnScreenCanvasIsTheOnlyOnScreen(true);
        builder.setUseVsyncMonitorFromService(true);
        builder.setUseAurumAudioEngine(false);
        builder.setSetupGLGraphicsBackendWhenSurfaceCreated(this.LIZ.LIZ.LJIIIIZZ.setupGLGraphicsBackendWhenSurfaceCreated);
        this.LIZIZ = new KryptonApp(builder.build(), c1304160k2g.LIZ());
        this.LIZ.LIZ();
        C1524970pmp c1524970pmp2 = this.LIZ;
        C1301550jyT c1301550jyT = new C1301550jyT(c1524970pmp2.LIZIZ, c1524970pmp2.LIZLLL);
        KryptonApp kryptonApp = this.LIZIZ;
        if (kryptonApp != null) {
            kryptonApp.LJIIJ(AbstractC1301300jy4.class, c1301550jyT);
        }
        KryptonApp kryptonApp2 = this.LIZIZ;
        if (kryptonApp2 != null) {
            kryptonApp2.LJIIJ(AbstractC1304010k2R.class, (a0) this.LIZJ.getValue());
        }
        try {
            Class.forName("com.ss.ttvideoengine.TTVideoEngine");
            final C1524970pmp c1524970pmp3 = this.LIZ;
            AbstractC1303810k27 abstractC1303810k27 = new AbstractC1303810k27(c1524970pmp3) { // from class: X.0k2P
                public final C1524970pmp LIZ;

                {
                    this.LIZ = c1524970pmp3;
                }

                @Override // X.AbstractC1303810k27
                public final InterfaceC1304250k2p LIZ(Map<String, String> map) {
                    String str;
                    if (map != null) {
                        str = map.get("customPlayerType");
                    } else {
                        str = null;
                    }
                    if (Intrinsics.LJFF(str, "AGameAlgoTexture")) {
                        return new C1304170k2h();
                    }
                    return new C1469970oM7(this.LIZ, map);
                }
            };
            KryptonApp kryptonApp3 = this.LIZIZ;
            if (kryptonApp3 != null) {
                kryptonApp3.LJIIJ(AbstractC1303810k27.class, abstractC1303810k27);
            }
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        KryptonApp kryptonApp4 = this.LIZIZ;
        if (kryptonApp4 != null) {
            this.LIZ.LIZ.LIZJ.LJI(kryptonApp4);
        }
        long jLIZ = KryptonCompat.LIZ();
        KryptonApp kryptonApp5 = this.LIZIZ;
        if (kryptonApp5 != null) {
            kryptonApp5.LJIILL(Boolean.TRUE);
        }
        KryptonApp kryptonApp6 = this.LIZIZ;
        if (kryptonApp6 != null) {
            kryptonApp6.LJIJ(jLIZ);
        }
        KryptonApp kryptonApp7 = this.LIZIZ;
        if (kryptonApp7 != null) {
            kryptonApp7.LJIILLIIL(new ARunnableS120S0100000_20(this, 20));
        }
        IClientAdapterService iClientAdapterServiceLIZIZ = this.LIZ.LIZ.LIZIZ();
        if (iClientAdapterServiceLIZIZ == null || !iClientAdapterServiceLIZIZ.isRemoteDebugMode()) {
            KryptonApp kryptonApp8 = this.LIZIZ;
            if (kryptonApp8 != null) {
                kryptonApp8.LIZ(napiEnv);
                return;
            }
            return;
        }
        KryptonApp kryptonApp9 = this.LIZIZ;
        if (kryptonApp9 != null) {
            KryptonAppRemoteDelegate kryptonAppRemoteDelegate = new KryptonAppRemoteDelegate();
            if (kryptonApp9.LJIIJ) {
                C1288370jdD.LIZIZ("KryptonApp", "already bootstrapped.");
                return;
            }
            if (kryptonApp9.LIZLLL) {
                C1288370jdD.LIZIZ("KryptonApp", "already destroyed.");
                return;
            }
            C1288370jdD.LIZJ("KryptonApp", "bootstrap remote.");
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                throw new IllegalStateException("Looper.myLooper() null on bootstrap");
            }
            kryptonApp9.LJIIIZ = new BPEAHandler(looperMyLooper);
            kryptonApp9.LJIIL = kryptonAppRemoteDelegate;
            kryptonAppRemoteDelegate.bootstrap(kryptonApp9, kryptonApp9.LIZJ);
            kryptonApp9.LJI();
        }
    }

    @Override // X.InterfaceC1304080k2Y
    public final void onExit() {
        C21346018gE c21346018gE = this.LIZ.LIZJ;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            c21346018gE.LJLIIIL(new AObjectS294S0200000_20(countDownLatch, this, 0));
            do {
            } while (!countDownLatch.await(10000L, TimeUnit.MILLISECONDS));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            th.toString();
            if (th instanceof InterruptedException) {
                C786410Ut5.u3().interrupt();
            }
        }
        C1303980k2O c1303980k2O = this.LJ;
        if (c1303980k2O != null) {
            this.LIZ.LIZ.LIZJ.LJIIJ(c1303980k2O);
        }
    }

    @Override // X.AbstractC1304120k2c, X.InterfaceC1304080k2Y
    public final void onPause() {
        this.LIZ.LIZJ.LJLIIIL(new AObjectS394S0100000_20(this, 1));
    }

    @Override // X.AbstractC1304120k2c, X.InterfaceC1304080k2Y
    public final void onResume() {
        this.LIZ.LIZJ.LJLIIIL(new AObjectS394S0100000_20(this, 2));
    }

    @Override // X.InterfaceC1304080k2Y
    public final void onStart() {
        this.LIZ.LIZJ.LJLIIIL(new AObjectS394S0100000_20(this, 3));
    }

    public C1303970k2N(C1524970pmp c1524970pmp) {
        this.LIZ = c1524970pmp;
    }
}
