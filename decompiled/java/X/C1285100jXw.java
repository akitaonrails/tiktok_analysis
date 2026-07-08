package X;

import Y.ARunnableS89S0200000_20;
import android.app.Activity;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.os.HandlerThread;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.bytedance.amg.minigameruntime.api.ABSetting;
import com.bytedance.amg.minigameruntime.api.IClientAdapterService;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.canvas.KryptonApp;
import com.lynx.canvas.KryptonViewAdaptor;
import com.lynx.canvas.b;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0jXw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1285100jXw implements InterfaceC1304030k2T {
    public static final /* synthetic */ int LJIJI = 0;
    public SurfaceTexture LIZIZ;
    public Surface LIZJ;
    public int LJI;
    public int LJII;
    public HandlerThread LJIIJ;
    public BPEAHandler LJIIJJI;
    public KryptonViewAdaptor LJIILIIL;
    public final SurfaceHolderC1285110jXx LJIILJJIL;
    public final C1285120jXy LJIILL;
    public final C1285160jY2 LJIILLIIL;
    public final AtomicBoolean LJIIZILJ;
    public WeakReference<IClientAdapterService> LJIJ;
    public final AtomicLong LIZ = new AtomicLong(-1);
    public final AtomicInteger LIZLLL = new AtomicInteger(-1);
    public final Rect LJ = new Rect(0, 0, 0, 0);
    public final float LJFF = 1.0f;
    public final Object LJIIIIZZ = new Object();
    public final AtomicBoolean LJIIIZ = new AtomicBoolean(false);
    public final C1284640jXC LJIIL = new C1284640jXC();

    @Override // X.InterfaceC1304030k2T
    public final void LIZ(C1303980k2O c1303980k2O) {
    }

    @Override // X.InterfaceC1304030k2T
    public final int LIZJ() {
        return 0;
    }

    @Override // X.InterfaceC1304030k2T
    public final void LJII() {
    }

    @Override // X.InterfaceC1304030k2T
    public final void LJIIJ(C1303980k2O c1303980k2O) {
    }

    @Override // X.InterfaceC1304030k2T
    public final int LJIIJJI() {
        return 0;
    }

    public final int LJIJI() {
        long andSet;
        long andSet2;
        try {
            boolean z = this.LJIIZILJ.get();
            this.LJIILLIIL.LIZLLL(z);
            if (z) {
                synchronized (this.LJIIIIZZ) {
                    try {
                        andSet2 = this.LIZ.getAndSet(-1L);
                    } finally {
                    }
                }
                if (andSet2 > 0) {
                    LJIILL(andSet2);
                    GLES30.glDeleteSync(andSet2);
                }
                return this.LIZLLL.get();
            }
            synchronized (this.LJIIIIZZ) {
                try {
                    andSet = this.LIZ.getAndSet(-1L);
                } finally {
                }
            }
            if (andSet <= 0) {
                return -1;
            }
            LJIILL(andSet);
            GLES30.glDeleteSync(andSet);
            return this.LIZLLL.get();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
            return -1;
        }
        TryCatchGuardChecker.doCheck(e);
        e.getMessage();
        return -1;
    }

    @Override // X.InterfaceC1304030k2T
    public final Activity getActivity() {
        return null;
    }

    @Override // X.InterfaceC1304030k2T
    public final int getStatusBarHeight() {
        return 0;
    }

    @Override // X.InterfaceC1304030k2T
    public final void LIZLLL() {
        KryptonViewAdaptor kryptonViewAdaptor = this.LJIILIIL;
        if (kryptonViewAdaptor != null) {
            kryptonViewAdaptor.LIZJ.LIZJ();
        }
    }

    public final void LJIILLIIL() {
        try {
            if (this.LIZ.get() > 0) {
                GLES30.glDeleteSync(this.LIZ.get());
                this.LIZ.set(-1L);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
        }
    }

    public final void LJIJ() {
        try {
            BPEAHandler bPEAHandler = this.LJIIJJI;
            if (bPEAHandler != null) {
                bPEAHandler.removeCallbacksAndMessages(null);
            }
            this.LJIIJJI = null;
            HandlerThread handlerThread = this.LJIIJ;
            if (handlerThread != null) {
                handlerThread.quitSafely();
                try {
                    HandlerThread handlerThread2 = this.LJIIJ;
                    if (handlerThread2 != null) {
                        handlerThread2.join(1000L);
                    }
                    HandlerThread handlerThread3 = this.LJIIJ;
                    if (handlerThread3 != null && handlerThread3.isAlive()) {
                        HandlerThread handlerThread4 = this.LJIIJ;
                        if (handlerThread4 != null) {
                            handlerThread4.quit();
                        }
                        HandlerThread handlerThread5 = this.LJIIJ;
                        if (handlerThread5 != null) {
                            handlerThread5.join(500L);
                        }
                    }
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C786410Ut5.u3().interrupt();
                }
                this.LJIIJ = null;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            e2.getMessage();
        }
    }

    @Override // X.InterfaceC1304030k2T
    public final String getAppLanguage() {
        IClientAdapterService iClientAdapterService;
        String appLanguage;
        WeakReference<IClientAdapterService> weakReference = this.LJIJ;
        return (weakReference == null || (iClientAdapterService = weakReference.get()) == null || (appLanguage = iClientAdapterService.getAppLanguage()) == null) ? "en" : appLanguage;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0jXy] */
    public C1285100jXw() {
        final SurfaceHolderC1285110jXx surfaceHolderC1285110jXx = new SurfaceHolderC1285110jXx();
        this.LJIILJJIL = surfaceHolderC1285110jXx;
        this.LJIILL = new InterfaceC1288240jd0(surfaceHolderC1285110jXx) { // from class: X.0jXy
            public final SurfaceHolderC1285110jXx LIZ;

            @Override // X.InterfaceC1288240jd0
            public final float getDensity() {
                return 1.0f;
            }

            @Override // X.InterfaceC1288240jd0
            public final int getHeight() {
                return this.LIZ.LIZJ.height();
            }

            @Override // X.InterfaceC1288240jd0
            public final int getWidth() {
                return this.LIZ.LIZJ.width();
            }

            @Override // X.InterfaceC1288240jd0
            public final SurfaceHolder LJJZZI() {
                return this.LIZ;
            }

            {
                this.LIZ = surfaceHolderC1285110jXx;
            }

            @Override // X.InterfaceC1288240jd0
            public final void LJJZZIII(ViewOnTouchListenerC1288260jd2 viewOnTouchListenerC1288260jd2) {
            }
        };
        this.LJIILLIIL = new C1285160jY2();
        this.LJIIZILJ = new AtomicBoolean(false);
    }

    @Override // X.InterfaceC1304030k2T
    public final int LJIIIIZZ() {
        return this.LJII;
    }

    @Override // X.InterfaceC1304030k2T
    public final int LJIIIZ() {
        return this.LJI;
    }

    @Override // X.InterfaceC1304030k2T
    public final float getDensity() {
        return this.LJFF;
    }

    @Override // X.InterfaceC1304030k2T
    public final int getHeight() {
        return this.LJII;
    }

    @Override // X.InterfaceC1304030k2T
    public final int getWidth() {
        return this.LJI;
    }

    public static void LJIILL(long j) {
        if (j > 0) {
            try {
                GLES30.glClientWaitSync(j, 1, 50000000L);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                e.getMessage();
            }
        }
    }

    @Override // X.InterfaceC1304030k2T
    public final void LJ(IClientAdapterService iClientAdapterService) {
        this.LJIJ = new WeakReference<>(iClientAdapterService);
    }

    @Override // X.InterfaceC1304030k2T
    public final void LJI(KryptonApp kryptonApp) {
        kryptonApp.LJIIJ(b.class, this.LJIILLIIL);
    }

    @Override // X.InterfaceC1304030k2T
    public final void LJIILIIL(KryptonApp kryptonApp) {
        KryptonViewAdaptor kryptonViewAdaptor = this.LJIILIIL;
        if (kryptonViewAdaptor != null) {
            kryptonViewAdaptor.LIZJ.LIZJ();
        }
        KryptonViewAdaptor kryptonViewAdaptorLIZ = KryptonViewAdaptor.LIZ(this.LJIILL, EnumC1285200jY6.SCALE_TO_FILL);
        this.LJIILIIL = kryptonViewAdaptorLIZ;
        if (kryptonViewAdaptorLIZ != null) {
            kryptonViewAdaptorLIZ.LIZIZ(kryptonApp);
        }
    }

    public final void LJIILJJIL(Function0<Unit> function0) {
        boolean z;
        try {
            ARunnableS89S0200000_20 aRunnableS89S0200000_20 = new ARunnableS89S0200000_20(function0, this, 161);
            BPEAHandler bPEAHandler = this.LJIIJJI;
            if (bPEAHandler != null) {
                C786410Ut5.LJJZZIII(bPEAHandler, aRunnableS89S0200000_20);
                z = true;
            } else {
                z = false;
            }
            SurfaceHolderC1285110jXx surfaceHolderC1285110jXx = this.LJIILJJIL;
            surfaceHolderC1285110jXx.LIZ = null;
            SurfaceHolder.Callback callback = surfaceHolderC1285110jXx.LIZIZ;
            if (callback != null) {
                callback.surfaceDestroyed(surfaceHolderC1285110jXx);
            }
            if (!z && function0 != null) {
                function0.invoke();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public final void LJIIZILJ(final int i) {
        this.LJI = 1080;
        this.LJII = i;
        this.LJ.set(0, 0, 1080, i);
        this.LJIIL.getClass();
        final EGLDisplay eGLDisplayEglGetCurrentDisplay = EGL14.eglGetCurrentDisplay();
        if (!Intrinsics.LJFF(eGLDisplayEglGetCurrentDisplay, EGL14.EGL_NO_DISPLAY)) {
            this.LJIIL.getClass();
            EGLContext eGLContextEglGetCurrentContext = EGL14.eglGetCurrentContext();
            if (!Intrinsics.LJFF(eGLContextEglGetCurrentContext, EGL14.EGL_NO_CONTEXT)) {
                C1284640jXC c1284640jXC = this.LJIIL;
                c1284640jXC.getClass();
                final EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetCurrentDisplay, C1284640jXC.LIZ(eGLDisplayEglGetCurrentDisplay), eGLContextEglGetCurrentContext, new int[]{12440, 2, 12344}, 0);
                if (!Intrinsics.LJFF(eGLContextEglCreateContext, EGL14.EGL_NO_CONTEXT)) {
                    c1284640jXC.LIZJ = eGLContextEglCreateContext;
                    try {
                        LJIJ();
                        HandlerThread handlerThread = new HandlerThread("MiniGameSharedGLThread");
                        this.LJIIJ = handlerThread;
                        handlerThread.start();
                        this.LJIIJJI = new BPEAHandler(C786410Ut5.W2(this.LJIIJ));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        e.getMessage();
                        LJIJ();
                    }
                    Runnable runnable = new Runnable() { // from class: X.0jXu
                        public final /* synthetic */ int LLILZ = 1080;

                        @Override // java.lang.Runnable
                        public final void run() {
                            EGLSurface eGLSurfaceEglCreatePbufferSurface;
                            int i2;
                            final C1285100jXw c1285100jXw = this.LL;
                            EGLDisplay eGLDisplay = eGLDisplayEglGetCurrentDisplay;
                            EGLContext eGLContext = eGLContextEglCreateContext;
                            int i3 = this.LLILZ;
                            int i4 = i;
                            C1C7U.LIZ("CustomGameView@e262.launch$1L");
                            C1284640jXC c1284640jXC2 = c1285100jXw.LJIIL;
                            c1284640jXC2.getClass();
                            try {
                                eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, C1284640jXC.LIZ(eGLDisplay), new int[]{12375, i3, 12374, i4, 12344}, 0);
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                e2.getMessage();
                            }
                            if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext)) {
                                EGL14.eglGetError();
                                EGL14.eglDestroySurface(eGLDisplay, eGLSurfaceEglCreatePbufferSurface);
                                c1285100jXw.LJIIL.LIZIZ();
                                C1C7U.LIZIZ("CustomGameView@e262.launch$1L");
                            }
                            c1284640jXC2.LIZ = eGLDisplay;
                            c1284640jXC2.LIZIZ = eGLSurfaceEglCreatePbufferSurface;
                            C786410Ut5.u3().getName();
                            try {
                                AtomicInteger atomicInteger = c1285100jXw.LIZLLL;
                                try {
                                    int[] iArr = new int[1];
                                    GLES20.glGenTextures(1, iArr, 0);
                                    GLES20.glBindTexture(36197, iArr[0]);
                                    GLES20.glTexParameteri(36197, 10241, 9729);
                                    GLES20.glTexParameteri(36197, 10240, 9729);
                                    GLES20.glTexParameteri(36197, 10242, 33071);
                                    GLES20.glTexParameteri(36197, 10243, 33071);
                                    GLES20.glBindTexture(36197, 0);
                                    i2 = iArr[0];
                                } catch (Exception e3) {
                                    TryCatchGuardChecker.doCheck(e3);
                                    e3.getMessage();
                                    i2 = -1;
                                }
                                atomicInteger.set(i2);
                                c1285100jXw.LIZLLL.get();
                                SurfaceTexture surfaceTexture = new SurfaceTexture(c1285100jXw.LIZLLL.get());
                                c1285100jXw.LIZIZ = surfaceTexture;
                                surfaceTexture.setDefaultBufferSize(c1285100jXw.LJI, c1285100jXw.LJII);
                                SurfaceTexture surfaceTexture2 = c1285100jXw.LIZIZ;
                                if (surfaceTexture2 != null) {
                                    surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: X.0jXv
                                        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                                        public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                                            C1285100jXw c1285100jXw2 = c1285100jXw;
                                            try {
                                                SurfaceTexture surfaceTexture4 = c1285100jXw2.LIZIZ;
                                                if (surfaceTexture4 != null) {
                                                    synchronized (c1285100jXw2.LJIIIIZZ) {
                                                        try {
                                                            surfaceTexture4.updateTexImage();
                                                            c1285100jXw2.LJIILLIIL();
                                                            try {
                                                                c1285100jXw2.LIZ.set(GLES30.glFenceSync(37143, 0));
                                                            } catch (Exception e4) {
                                                                TryCatchGuardChecker.doCheck(e4);
                                                                e4.getMessage();
                                                            }
                                                            try {
                                                                GLES30.glFlush();
                                                            } catch (Exception e5) {
                                                                TryCatchGuardChecker.doCheck(e5);
                                                                e5.getMessage();
                                                            }
                                                        } catch (Throwable th) {
                                                            TryCatchGuardChecker.doCheck(th);
                                                            throw th;
                                                        }
                                                    }
                                                    c1285100jXw2.LJIIZILJ.set(true);
                                                }
                                                CountDownLatch countDownLatch = c1285100jXw2.LJIILLIIL.LJII.LIZ.get();
                                                if (countDownLatch != null) {
                                                    countDownLatch.countDown();
                                                }
                                            } catch (Exception e6) {
                                                TryCatchGuardChecker.doCheck(e6);
                                                e6.getMessage();
                                            }
                                        }
                                    }, c1285100jXw.LJIIJJI);
                                }
                                Surface surface = new Surface(c1285100jXw.LIZIZ);
                                c1285100jXw.LIZJ = surface;
                                SurfaceHolderC1285110jXx surfaceHolderC1285110jXx = c1285100jXw.LJIILJJIL;
                                Rect rect = c1285100jXw.LJ;
                                surfaceHolderC1285110jXx.LIZ = surface;
                                surfaceHolderC1285110jXx.LIZJ.set(rect.left, rect.top, rect.right, rect.bottom);
                                SurfaceHolder.Callback callback = surfaceHolderC1285110jXx.LIZIZ;
                                if (callback != null) {
                                    callback.surfaceCreated(surfaceHolderC1285110jXx);
                                }
                                c1285100jXw.LJIIIZ.set(true);
                            } catch (Exception e4) {
                                TryCatchGuardChecker.doCheck(e4);
                                e4.getMessage();
                                c1285100jXw.LJIILJJIL(null);
                            }
                            C1C7U.LIZIZ("CustomGameView@e262.launch$1L");
                        }
                    };
                    BPEAHandler bPEAHandler = this.LJIIJJI;
                    if (bPEAHandler != null) {
                        C786410Ut5.LJJZZIII(bPEAHandler, runnable);
                        return;
                    }
                    return;
                }
                throw new RuntimeException("Failed to create shared EGLContext");
            }
            throw new RuntimeException("Current thread has no EGLContext bound");
        }
        throw new RuntimeException("Current thread has no EGLDisplay bound");
    }

    @Override // X.InterfaceC1304030k2T
    public final void LIZIZ(SurfaceView surfaceView) {
    }

    @Override // X.InterfaceC1304030k2T
    public final void LJFF(Activity activity) {
    }

    @Override // X.InterfaceC1304030k2T
    public final void LJIIL(ABSetting aBSetting) {
    }
}
