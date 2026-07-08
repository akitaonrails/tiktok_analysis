package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.Message;
import ci3.a;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttm.player.DummySurface;
import java.util.Locale;

/* JADX INFO: renamed from: X.0jX9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class HandlerThreadC1284610jX9 extends a implements Handler.Callback {
    public RunnableC1284620jXA LL;
    public BPEAHandler LLILLJJLI;
    public Error LLILLL;
    public RuntimeException LLILZ;
    public DummySurface LLILZIL;

    public HandlerThreadC1284610jX9() {
        super("dummySurface");
    }

    public final void LIZLLL() {
        RunnableC1284620jXA runnableC1284620jXA = this.LL;
        if (runnableC1284620jXA == null) {
            throw null;
        }
        runnableC1284620jXA.LL.removeCallbacks(runnableC1284620jXA);
        try {
            SurfaceTexture surfaceTexture = runnableC1284620jXA.LLILZLL;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, runnableC1284620jXA.LLILLJJLI, 0);
            }
            EGLDisplay eGLDisplay = runnableC1284620jXA.LLILLL;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = runnableC1284620jXA.LLILLL;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = runnableC1284620jXA.LLILZIL;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(runnableC1284620jXA.LLILLL, runnableC1284620jXA.LLILZIL);
            }
            EGLContext eGLContext = runnableC1284620jXA.LLILZ;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(runnableC1284620jXA.LLILLL, eGLContext);
            }
            EGL14.eglReleaseThread();
            runnableC1284620jXA.LLILLL = null;
            runnableC1284620jXA.LLILZ = null;
            runnableC1284620jXA.LLILZIL = null;
            runnableC1284620jXA.LLILZLL = null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            EGLDisplay eGLDisplay3 = runnableC1284620jXA.LLILLL;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay4 = runnableC1284620jXA.LLILLL;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay4, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = runnableC1284620jXA.LLILZIL;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(runnableC1284620jXA.LLILLL, runnableC1284620jXA.LLILZIL);
            }
            EGLContext eGLContext2 = runnableC1284620jXA.LLILZ;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(runnableC1284620jXA.LLILLL, eGLContext2);
            }
            EGL14.eglReleaseThread();
            runnableC1284620jXA.LLILLL = null;
            runnableC1284620jXA.LLILZ = null;
            runnableC1284620jXA.LLILZIL = null;
            runnableC1284620jXA.LLILZLL = null;
            throw th;
        }
    }

    public final DummySurface LIZIZ(int i) {
        boolean z;
        start();
        BPEAHandler bPEAHandler = new BPEAHandler(getLooper(), this);
        this.LLILLJJLI = bPEAHandler;
        this.LL = new RunnableC1284620jXA(bPEAHandler);
        synchronized (this) {
            try {
                z = false;
                this.LLILLJJLI.obtainMessage(1, i, 0).sendToTarget();
                while (this.LLILZIL == null && this.LLILZ == null && this.LLILLL == null) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                        z = true;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (z) {
            C786410Ut5.u3().interrupt();
        }
        RuntimeException runtimeException = this.LLILZ;
        if (runtimeException == null) {
            Error error = this.LLILLL;
            if (error == null) {
                DummySurface dummySurface = this.LLILZIL;
                dummySurface.getClass();
                return dummySurface;
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void LIZJ(int i) {
        EGLConfig eGLConfig;
        int[] iArr;
        int[] iArr2;
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        RunnableC1284620jXA runnableC1284620jXA = this.LL;
        runnableC1284620jXA.getClass();
        boolean z = false;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay != null) {
            int[] iArr3 = new int[2];
            if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr3, 0, iArr3, 1)) {
                runnableC1284620jXA.LLILLL = eGLDisplayEglGetDisplay;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr4 = new int[1];
                boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, RunnableC1284620jXA.LLIZ, 0, eGLConfigArr, 0, 1, iArr4, 0);
                if (zEglChooseConfig && iArr4[0] > 0 && (eGLConfig = eGLConfigArr[0]) != null) {
                    EGLDisplay eGLDisplay = runnableC1284620jXA.LLILLL;
                    if (i == 0) {
                        iArr = new int[]{12440, 2, 12344};
                    } else {
                        iArr = new int[]{12440, 2, 12992, 1, 12344};
                    }
                    EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
                    if (eGLContextEglCreateContext != null) {
                        runnableC1284620jXA.LLILZ = eGLContextEglCreateContext;
                        EGLDisplay eGLDisplay2 = runnableC1284620jXA.LLILLL;
                        if (i == 1) {
                            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
                        } else {
                            if (i == 2) {
                                iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
                            } else {
                                iArr2 = new int[]{12375, 1, 12374, 1, 12344};
                            }
                            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig, iArr2, 0);
                            if (eGLSurfaceEglCreatePbufferSurface == null) {
                                final String str = "eglCreatePbufferSurface failed";
                                throw new RuntimeException(str) { // from class: X.0jXB
                                };
                            }
                        }
                        if (EGL14.eglMakeCurrent(eGLDisplay2, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext)) {
                            runnableC1284620jXA.LLILZIL = eGLSurfaceEglCreatePbufferSurface;
                            GLES20.glGenTextures(1, runnableC1284620jXA.LLILLJJLI, 0);
                            int iGlGetError = GLES20.glGetError();
                            if (iGlGetError == 0) {
                                SurfaceTexture surfaceTexture = new SurfaceTexture(runnableC1284620jXA.LLILLJJLI[0]);
                                runnableC1284620jXA.LLILZLL = surfaceTexture;
                                surfaceTexture.setOnFrameAvailableListener(runnableC1284620jXA);
                                SurfaceTexture surfaceTexture2 = this.LL.LLILZLL;
                                surfaceTexture2.getClass();
                                if (i != 0) {
                                    z = true;
                                }
                                this.LLILZIL = new DummySurface(this, surfaceTexture2, z);
                                return;
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("glGenTextures failed. Error: ");
                            sbLIZ.append(Integer.toHexString(iGlGetError));
                            final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            throw new RuntimeException(strLIZIZ) { // from class: X.0jXB
                            };
                        }
                        final String str2 = "eglMakeCurrent failed";
                        throw new RuntimeException(str2) { // from class: X.0jXB
                        };
                    }
                    final String str3 = "eglCreateContext failed";
                    throw new RuntimeException(str3) { // from class: X.0jXB
                    };
                }
                final String strK4 = C786410Ut5.k4(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", new Object[]{Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr4[0]), eGLConfigArr[0]});
                throw new RuntimeException(strK4) { // from class: X.0jXB
                };
            }
            final String str4 = "eglInitialize failed";
            throw new RuntimeException(str4) { // from class: X.0jXB
            };
        }
        final String str5 = "eglGetDisplay failed";
        throw new RuntimeException(str5) { // from class: X.0jXB
        };
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i != 1) {
                if (i != 2) {
                    return true;
                }
                try {
                    LIZLLL();
                } finally {
                    try {
                    } catch (Throwable th) {
                    }
                }
                quit();
                return true;
            }
            try {
                try {
                    LIZJ(message.arg1);
                    synchronized (this) {
                        try {
                            notify();
                        } finally {
                        }
                    }
                    return true;
                } catch (Error e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LLILLL = e;
                    synchronized (this) {
                        try {
                            notify();
                            return true;
                        } finally {
                        }
                    }
                }
            } catch (RuntimeException e2) {
                TryCatchGuardChecker.doCheck(e2);
                this.LLILZ = e2;
                synchronized (this) {
                    try {
                        notify();
                        return true;
                    } finally {
                    }
                }
            }
        } catch (Throwable th2) {
            synchronized (this) {
                try {
                    notify();
                    throw th2;
                } finally {
                }
            }
        }
    }
}
