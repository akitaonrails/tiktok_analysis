package X;

import Y.AObjectS363S0100000_20;
import Y.ARunnableS39S0110000_20;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import com.bytedance.amg.minigameruntime.api.ABSetting;
import com.bytedance.amg.minigameruntime.api.IClientAdapterService;
import com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI;
import com.bytedance.amg.minigameruntime.api.InitParams;
import com.bytedance.amg.minigameruntime.api.RefreshParams;
import com.bytedance.amg.minigameruntime.api.ScreenShotData;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vmsdk.worker.JsWorker;
import com.lynx.canvas.Krypton;
import com.lynx.canvas.KryptonApp;
import com.lynx.canvas.KryptonDownStreamManager;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.function.Consumer;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0k2U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1304040k2U implements IMiniGameRuntimeAPI {
    public final InitParams LIZ;
    public volatile boolean LIZIZ;
    public boolean LIZJ;
    public C1304160k2g LIZLLL;
    public WeakReference<IClientAdapterService> LJ;
    public volatile C1524970pmp LJFF;
    public C1304070k2X LJI;
    public IMiniGameRuntimeAPI.LaunchResultListener LJII;
    public InterfaceC1304030k2T LJIIIIZZ;
    public volatile BPEAThread LJIIJJI;
    public ABSetting LJIIIZ = new ABSetting(false, false, 1.0f, 1, true, true, true, false, 1, true);
    public final Object LJIIJ = new Object();
    public final List<Pair<IMiniGameRuntimeAPI.ExitResultListener, Handler>> LJIIL = new ArrayList();

    public final synchronized void LIZIZ() {
        IClientAdapterService iClientAdapterService;
        if (this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        try {
            Krypton.LIZIZ().getClass();
            Krypton.LIZJ("lynx", true);
            Krypton.LIZIZ().getClass();
            Krypton.LIZJ("krypton", true);
            Krypton.LIZIZ().getClass();
            Krypton.LIZJ("kryptonaudio", true);
            Krypton.LIZIZ().getClass();
            Krypton.LIZJ("kryptoni18n", true);
            WeakReference<IClientAdapterService> weakReference = this.LJ;
            if (weakReference != null && (iClientAdapterService = weakReference.get()) != null && iClientAdapterService.isRemoteDebugMode()) {
                Krypton.LIZIZ().getClass();
                Krypton.LIZJ("kryptonremote", true);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            th.toString();
        }
    }

    static {
        LoadSoLancet.LIZJ("c++_shared");
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF("c++_shared");
        LoadSoLancet.LJ(jUptimeMillis, "c++_shared");
        LoadSoLancet.LIZLLL(jUptimeMillis, "c++_shared");
        LoadSoLancet.LIZIZ("c++_shared");
    }

    public final void LIZ() {
        InterfaceC1304030k2T interfaceC1304030k2T;
        WeakReference<IClientAdapterService> weakReference;
        WeakReference<IClientAdapterService> weakReference2 = this.LJ;
        if (weakReference2 == null || weakReference2.get() == null || (interfaceC1304030k2T = this.LJIIIIZZ) == null || (weakReference = this.LJ) == null) {
            return;
        }
        C1304160k2g c1304160k2g = new C1304160k2g(this.LIZ.getApp(), weakReference, interfaceC1304030k2T);
        this.LIZLLL = c1304160k2g;
        c1304160k2g.LIZLLL = this.LIZ.getMAppName();
        c1304160k2g.LJ = this.LIZ.getMAppVersion();
        c1304160k2g.LJFF = this.LIZ.getMSdkVersion();
        c1304160k2g.LJI = this.LIZ.getMIsDebugLocateJSMode();
        c1304160k2g.LJII = this.LIZ.getMJSEngineType();
        ABSetting aBSetting = this.LJIIIZ;
        c1304160k2g.LJIIIIZZ = aBSetting;
        interfaceC1304030k2T.LJIIL(aBSetting);
    }

    @Override // com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI
    public final String getAndResetPerformanceStatistics() {
        KryptonApp kryptonApp;
        String strLIZJ;
        C1304070k2X c1304070k2X = this.LJI;
        return (c1304070k2X == null || (kryptonApp = c1304070k2X.LIZJ.LIZIZ) == null || (strLIZJ = kryptonApp.LIZJ()) == null) ? "" : strLIZJ;
    }

    @Override // com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI
    public final String getRemoteKryptonJS() {
        KryptonApp kryptonApp;
        C1304070k2X c1304070k2X = this.LJI;
        if (c1304070k2X != null && (kryptonApp = c1304070k2X.LIZJ.LIZIZ) != null) {
            InterfaceC1303940k2K interfaceC1303940k2K = kryptonApp.LJIIL;
            if (interfaceC1303940k2K == null) {
                C1288370jdD.LIZIZ("KryptonApp", "getRemoteHookJS failed: remote delegate is null");
            } else {
                String remoteHookJS = interfaceC1303940k2K.getRemoteHookJS();
                if (remoteHookJS != null) {
                    return remoteHookJS;
                }
            }
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI
    public final ScreenShotData screenshot() {
        C1304070k2X c1304070k2X = this.LJI;
        if (c1304070k2X == null) {
            return null;
        }
        final C1303970k2N c1303970k2N = c1304070k2X.LIZJ;
        c1303970k2N.getClass();
        if (C786410Ut5.u3() == c1303970k2N.LJFF) {
            KryptonApp kryptonApp = c1303970k2N.LIZIZ;
            if (kryptonApp == null) {
                return null;
            }
            C1303820k28 c1303820k28LJIILIIL = kryptonApp.LJIILIIL();
            return new ScreenShotData(c1303820k28LJIILIIL.LIZ, c1303820k28LJIILIIL.LIZIZ, c1303820k28LJIILIIL.LIZJ);
        }
        C21346018gE c21346018gE = c1303970k2N.LIZ.LIZJ;
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final C259800zU c259800zU = new C259800zU();
        c21346018gE.LJLIIIL(new Function0() { // from class: X.0k2M
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                T screenShotData;
                C259800zU c259800zU2 = c259800zU;
                C1303970k2N c1303970k2N2 = c1303970k2N;
                CountDownLatch countDownLatch2 = countDownLatch;
                try {
                    try {
                        KryptonApp kryptonApp2 = c1303970k2N2.LIZIZ;
                        if (kryptonApp2 != null) {
                            C1303820k28 c1303820k28LJIILIIL2 = kryptonApp2.LJIILIIL();
                            screenShotData = new ScreenShotData(c1303820k28LJIILIIL2.LIZ, c1303820k28LJIILIIL2.LIZIZ, c1303820k28LJIILIIL2.LIZJ);
                        } else {
                            screenShotData = 0;
                        }
                        c259800zU2.element = screenShotData;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        e.getMessage();
                    }
                    countDownLatch2.countDown();
                    return Unit.LIZ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    countDownLatch2.countDown();
                    throw th;
                }
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            C786410Ut5.u3().interrupt();
            e.getMessage();
        }
        return (ScreenShotData) c259800zU.element;
    }

    public C1304040k2U(InitParams initParams) {
        this.LIZ = initParams;
    }

    @Override // com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI
    public final void onExit(IMiniGameRuntimeAPI.ExitResultListener exitResultListener) {
        BPEAHandler bPEAHandler;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            bPEAHandler = new BPEAHandler(looperMyLooper);
        } else {
            bPEAHandler = null;
        }
        this.LJII = null;
        synchronized (this.LJIIJ) {
            try {
                if (this.LJIIJJI == null && !this.LIZIZ) {
                    if (exitResultListener != null) {
                        ARunnableS39S0110000_20 aRunnableS39S0110000_20 = new ARunnableS39S0110000_20((Object) exitResultListener, true, 18);
                        if (bPEAHandler != null) {
                            C786410Ut5.LJJZZIII(bPEAHandler, aRunnableS39S0110000_20);
                        } else {
                            aRunnableS39S0110000_20.run();
                        }
                    }
                    return;
                }
                if (exitResultListener != null) {
                    ((ArrayList) this.LJIIL).add(new Pair(exitResultListener, bPEAHandler));
                }
                if (this.LJIIJJI != null) {
                    return;
                }
                this.LIZIZ = false;
                BPEAThread bPEAThread = new BPEAThread(new Runnable() { // from class: X.0k2V
                    @Override // java.lang.Runnable
                    public final void run() throws JSONException {
                        boolean z;
                        List<Pair> listLLIIII;
                        C1304040k2U c1304040k2U = this.LL;
                        C1C7U.LIZ("MiniGameRuntime@f72d.onExit$1L");
                        try {
                            C1304070k2X c1304070k2X = c1304040k2U.LJI;
                            if (c1304070k2X != null) {
                                Iterator<InterfaceC1304080k2Y> it2 = c1304070k2X.LIZIZ.iterator();
                                while (it2.hasNext()) {
                                    it2.next().onExit();
                                }
                            }
                            C1524970pmp c1524970pmp = c1304040k2U.LJFF;
                            if (c1524970pmp != null) {
                                Iterator<InterfaceC1304090k2Z> it3 = c1524970pmp.LJIIIIZZ.iterator();
                                while (it3.hasNext()) {
                                    it3.next().onExit();
                                }
                            }
                            z = true;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C1304110k2b.LIZ("MiniGameRuntime onExit", th);
                            z = false;
                        }
                        synchronized (c1304040k2U.LJIIJ) {
                            try {
                                listLLIIII = C13LP.LLIIII(c1304040k2U.LJIIL);
                                ((ArrayList) c1304040k2U.LJIIL).clear();
                                c1304040k2U.LJIIJJI = null;
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                throw th2;
                            }
                        }
                        for (Pair pair : listLLIIII) {
                            IMiniGameRuntimeAPI.ExitResultListener exitResultListener2 = (IMiniGameRuntimeAPI.ExitResultListener) pair.getFirst();
                            Handler handler = (Handler) pair.getSecond();
                            if (exitResultListener2 != null) {
                                ARunnableS39S0110000_20 aRunnableS39S0110000_202 = new ARunnableS39S0110000_20(exitResultListener2, z, 18);
                                if (handler != null) {
                                    C786410Ut5.LJJZZIII(handler, aRunnableS39S0110000_202);
                                } else {
                                    aRunnableS39S0110000_202.run();
                                }
                            }
                        }
                        C1C7U.LIZIZ("MiniGameRuntime@f72d.onExit$1L");
                    }
                }, "MiniGameRuntime-Exit");
                bPEAThread.start();
                this.LJIIJJI = bPEAThread;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI
    public final void onPause(JSONObject jSONObject) {
        C21346018gE c21346018gE;
        if (!this.LIZIZ) {
            return;
        }
        C1524970pmp c1524970pmp = this.LJFF;
        if (c1524970pmp != null && (c21346018gE = c1524970pmp.LIZJ) != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            c21346018gE.emitJSAPIEvent("onHide", jSONObject);
        }
        C1524970pmp c1524970pmp2 = this.LJFF;
        if (c1524970pmp2 != null) {
            Iterator<InterfaceC1304090k2Z> it2 = c1524970pmp2.LJIIIIZZ.iterator();
            while (it2.hasNext()) {
                it2.next().onPause();
            }
        }
        C1304070k2X c1304070k2X = this.LJI;
        if (c1304070k2X != null) {
            Iterator<InterfaceC1304080k2Y> it3 = c1304070k2X.LIZIZ.iterator();
            while (it3.hasNext()) {
                it3.next().onPause();
            }
        }
    }

    @Override // com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI
    public final void onResume(JSONObject jSONObject) {
        C21346018gE c21346018gE;
        if (!this.LIZIZ) {
            return;
        }
        C1524970pmp c1524970pmp = this.LJFF;
        if (c1524970pmp != null && (c21346018gE = c1524970pmp.LIZJ) != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            c21346018gE.emitJSAPIEvent("onShow", jSONObject);
        }
        C1524970pmp c1524970pmp2 = this.LJFF;
        if (c1524970pmp2 != null) {
            Iterator<InterfaceC1304090k2Z> it2 = c1524970pmp2.LJIIIIZZ.iterator();
            while (it2.hasNext()) {
                it2.next().onResume();
            }
        }
        C1304070k2X c1304070k2X = this.LJI;
        if (c1304070k2X != null) {
            Iterator<InterfaceC1304080k2Y> it3 = c1304070k2X.LIZIZ.iterator();
            while (it3.hasNext()) {
                it3.next().onResume();
            }
        }
    }

    @Override // com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI
    public final void refresh(RefreshParams refreshParams) {
        InterfaceC1304030k2T interfaceC1304030k2T = this.LJIIIIZZ;
        if (interfaceC1304030k2T == null) {
            return;
        }
        interfaceC1304030k2T.LJFF(refreshParams.getActivity());
        interfaceC1304030k2T.LIZIZ(refreshParams.getSurfaceView());
        IClientAdapterService clientAdapter = refreshParams.getClientAdapter();
        if (clientAdapter != null) {
            this.LJ = new WeakReference<>(clientAdapter);
            C1304160k2g c1304160k2g = this.LIZLLL;
            if (c1304160k2g != null) {
                c1304160k2g.LIZIZ = new WeakReference<>(clientAdapter);
                c1304160k2g.LIZJ.LJ(clientAdapter);
            }
        }
    }

    @Override // com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI
    public final void registerABValue(ABSetting aBSetting) {
        this.LJIIIZ = aBSetting.copy(aBSetting.UsePrefFrameRate, aBSetting.setupGLGraphicsBackendWhenSurfaceCreated, aBSetting.reduceRenderDprAtViewInit, aBSetting.network, aBSetting.kevaStorageSwitch, aBSetting.storageMigrationV2, aBSetting.fileMultithreadSwitch, aBSetting.sendBufferEvent, aBSetting.networkUntrustedZone, aBSetting.emitEventLockFree);
    }

    @Override // com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI
    public final void setRenderFrameCallback(final InterfaceC1631620sYq<? super String, ? super Long, ? super Long, Unit> interfaceC1631620sYq) {
        C1304070k2X c1304070k2X;
        KryptonApp kryptonApp;
        if (this.LIZIZ && (c1304070k2X = this.LJI) != null && (kryptonApp = c1304070k2X.LIZJ.LIZIZ) != null) {
            if (interfaceC1631620sYq != null) {
                kryptonApp.LJIIZILJ(new InterfaceC1303920k2I() { // from class: X.0jfp
                    @Override // X.InterfaceC1303920k2I
                    public final void onFrameRender(String str, long j, long j2) {
                        interfaceC1631620sYq.invoke(str, Long.valueOf(j), Long.valueOf(j2));
                    }
                });
            } else {
                kryptonApp.LJIIZILJ(null);
            }
        }
    }

    @Override // com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI
    public final void emitJSAPIEvent(String str, JSONObject jSONObject) {
        C1524970pmp c1524970pmp;
        C21346018gE c21346018gE;
        if (this.LIZIZ && (c1524970pmp = this.LJFF) != null && (c21346018gE = c1524970pmp.LIZJ) != null) {
            c21346018gE.emitJSAPIEvent(str, jSONObject);
        }
    }

    @Override // com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI
    public final void executeJSScript(String str, String str2) {
        C21346018gE c21346018gE;
        boolean z = this.LIZIZ;
        C1524970pmp c1524970pmp = this.LJFF;
        if (c1524970pmp != null && (c21346018gE = c1524970pmp.LIZJ) != null) {
            if (str2 == null) {
                str2 = "testGame.js";
            }
            synchronized (c21346018gE) {
                if (c21346018gE.LJII.get()) {
                    return;
                }
                JsWorker jsWorker = c21346018gE.LJ;
                if (jsWorker != null) {
                    jsWorker.evaluateJavaScript(str, str2);
                }
            }
        }
    }

    @Override // com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI
    public final void onLaunch(IClientAdapterService iClientAdapterService, IMiniGameRuntimeAPI.LaunchResultListener launchResultListener) {
        if (this.LIZIZ) {
            launchResultListener.onSuccess();
            return;
        }
        try {
            this.LJII = launchResultListener;
            this.LJ = new WeakReference<>(iClientAdapterService);
            LIZIZ();
            LIZ();
            C1304160k2g c1304160k2g = this.LIZLLL;
            if (c1304160k2g == null) {
                IMiniGameRuntimeAPI.LaunchResultListener launchResultListener2 = this.LJII;
                if (launchResultListener2 != null) {
                    launchResultListener2.onFailed(new Exception("Error Config"));
                    return;
                }
                return;
            }
            this.LJFF = new C1524970pmp(c1304160k2g);
            C1524970pmp c1524970pmp = this.LJFF;
            if (c1524970pmp != null) {
                Iterator<InterfaceC1304090k2Z> it2 = c1524970pmp.LJIIIIZZ.iterator();
                while (it2.hasNext()) {
                    it2.next().onStart();
                }
                C1304070k2X c1304070k2X = new C1304070k2X(c1524970pmp);
                this.LJI = c1304070k2X;
                c1304070k2X.LIZ();
                this.LIZIZ = true;
                c1524970pmp.LJFF.LJJZ(EnumC1304340k2y.FirstOnScreenCanvasFrame, new AObjectS363S0100000_20(this, 1));
            }
            if (this.LIZIZ) {
                IMiniGameRuntimeAPI.LaunchResultListener launchResultListener3 = this.LJII;
                if (launchResultListener3 != null) {
                    launchResultListener3.onSuccess();
                    return;
                }
                return;
            }
            IMiniGameRuntimeAPI.LaunchResultListener launchResultListener4 = this.LJII;
            if (launchResultListener4 != null) {
                launchResultListener4.onFailed(new Exception("Launch Fail, service is nil or module is nill"));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1304110k2b.LIZ("MiniGameRuntime onLaunch", th);
            this.LIZIZ = false;
            IMiniGameRuntimeAPI.LaunchResultListener launchResultListener5 = this.LJII;
            if (launchResultListener5 != null) {
                launchResultListener5.onFailed(new Exception("Launch Fail"));
            }
        }
    }

    @Override // com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI
    public final void postJSAPIResponse(Number number, JSONObject jSONObject) {
        C1524970pmp c1524970pmp;
        C21346018gE c21346018gE;
        if (this.LIZIZ && (c1524970pmp = this.LJFF) != null && (c21346018gE = c1524970pmp.LIZJ) != null) {
            c21346018gE.LJL(number, jSONObject);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0k2L] */
    @Override // com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI
    public final String receiveRemoteJSBuffer(final byte[] bArr, final Function1<? super byte[], Unit> function1) {
        final KryptonApp kryptonApp;
        if (!this.LIZIZ) {
            return null;
        }
        C1304070k2X c1304070k2X = this.LJI;
        if (c1304070k2X != null && (kryptonApp = c1304070k2X.LIZJ.LIZIZ) != null) {
            final ?? r2 = new Consumer() { // from class: X.0k2L
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    function1.invoke(obj);
                }
            };
            if (bArr != null && bArr.length != 0) {
                BPEAHandler bPEAHandler = kryptonApp.LJIIIZ;
                if (bPEAHandler != null) {
                    C786410Ut5.LJJZZIII(bPEAHandler, new Runnable() { // from class: X.0k2J
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("KryptonApp@446f.runBuffer$1");
                            try {
                                KryptonApp kryptonApp2 = kryptonApp;
                                if (!kryptonApp2.LIZLLL) {
                                    InterfaceC1303940k2K interfaceC1303940k2K = kryptonApp2.LJIIL;
                                    if (interfaceC1303940k2K == null) {
                                        C1288370jdD.LIZIZ("KryptonApp", "runBuffer failed: remote delegate is null");
                                    } else {
                                        interfaceC1303940k2K.runBuffer(bArr, r2);
                                    }
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("KryptonApp@446f.runBuffer$1");
                        }
                    });
                    return "";
                }
                return "";
            }
            C1288370jdD.LIZIZ("KryptonApp", "runBuffer failed: data is null");
            return "";
        }
        return "";
    }

    @Override // com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI
    public final void removeDownStreamSurface(String str, long j) {
        C1304070k2X c1304070k2X;
        KryptonApp kryptonApp;
        if (this.LIZIZ && (c1304070k2X = this.LJI) != null && (kryptonApp = c1304070k2X.LIZJ.LIZIZ) != null) {
            C1286170jZf.LIZ.getClass();
            KryptonDownStreamManager.LIZIZ(kryptonApp, j, str);
        }
    }

    @Override // com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI
    public final String receiveRemoteJSMsg(String str, String str2, int i) {
        C1524970pmp c1524970pmp;
        C21346018gE c21346018gE;
        if (!this.LIZIZ || (c1524970pmp = this.LJFF) == null || (c21346018gE = c1524970pmp.LIZJ) == null) {
            return null;
        }
        return c21346018gE.LJLIIL(i, str, str2);
    }

    @Override // com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI
    public final void registerJSAPI(String str, Function2<? super JSONObject, ? super Integer, ? extends JSONObject> function2, Object obj) {
        C1524970pmp c1524970pmp;
        C21346018gE c21346018gE;
        if (this.LIZIZ && (c1524970pmp = this.LJFF) != null && (c21346018gE = c1524970pmp.LIZJ) != null) {
            c21346018gE.LIZIZ.put(str, new C1304140k2e(str, function2, obj));
        }
    }

    @Override // com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI
    public final void registerJSBufferAPI(String str, Function2<? super JSONObject, ? super Integer, byte[]> function2, Object obj) {
        C1524970pmp c1524970pmp;
        C21346018gE c21346018gE;
        if (this.LIZIZ && (c1524970pmp = this.LJFF) != null && (c21346018gE = c1524970pmp.LIZJ) != null) {
            c21346018gE.LIZJ.put(str, function2);
        }
    }

    @Override // com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI
    public final long addDownStreamSurface(String str, Surface surface, int i, int i2, EnumC1285200jY6 enumC1285200jY6, RectF rectF, int i3) {
        C1304070k2X c1304070k2X;
        KryptonApp kryptonApp;
        if (!this.LIZIZ || (c1304070k2X = this.LJI) == null || (kryptonApp = c1304070k2X.LIZJ.LIZIZ) == null) {
            return 0L;
        }
        C1286170jZf.LIZ.getClass();
        return KryptonDownStreamManager.LIZ(kryptonApp, surface, i, i2, enumC1285200jY6, rectF, i3);
    }
}
