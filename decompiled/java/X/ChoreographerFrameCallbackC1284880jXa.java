package X;

import Y.ARunnableS89S0200000_20;
import android.os.Handler;
import android.view.Choreographer;
import ci3.a;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: renamed from: X.0jXa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class ChoreographerFrameCallbackC1284880jXa extends a implements Choreographer.FrameCallback {
    public Handler LL;
    public boolean LLILLJJLI;
    public EGLDisplay LLILLL;
    public EGLContext LLILZ;
    public EGLSurface LLILZIL;
    public final EGL10 LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public volatile boolean LLJ;
    public volatile boolean LLJI;
    public final int[] LLJIJIL;
    public final /* synthetic */ TextureViewSurfaceTextureListenerC1284890jXb LLJILJIL;

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
        try {
            bpea_origin_onLooperPrepared();
            if (zLJ) {
                C0W9U.LJFF();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (zLJ) {
                C0W9U.LJFF();
            }
            throw th;
        }
    }

    public final void LIZIZ() {
        if (this.LLJ) {
            C1287380jbc renderer = this.LLJILJIL.getRenderer();
            EGLContext eGLContext = this.LLILZ;
            renderer.onSurfaceChanged((GL10) (eGLContext != null ? eGLContext.getGL() : null), this.LLIZ, this.LLIZLLLIL);
            this.LLJ = false;
        }
        C1287380jbc renderer2 = this.LLJILJIL.getRenderer();
        EGLContext eGLContext2 = this.LLILZ;
        renderer2.onDrawFrame((GL10) (eGLContext2 != null ? eGLContext2.getGL() : null));
        if (this.LLILZLL.eglSwapBuffers(this.LLILLL, this.LLILZIL)) {
            return;
        }
        this.LLILZLL.eglGetError();
    }

    public final void bpea_origin_onLooperPrepared() {
        this.LL = new Handler(getLooper());
        EGLDisplay eGLDisplayEglGetDisplay = this.LLILZLL.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.LLILLL = eGLDisplayEglGetDisplay;
        this.LLILZLL.eglInitialize(eGLDisplayEglGetDisplay, new int[]{0, 0});
        EGL10 egl10 = this.LLILZLL;
        EGLDisplay eGLDisplay = this.LLILLL;
        if (eGLDisplay != null) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            egl10.eglChooseConfig(eGLDisplay, this.LLJIJIL, eGLConfigArr, 1, new int[]{0});
            EGLConfig eGLConfig = eGLConfigArr[0];
            if (eGLConfig != null) {
                this.LLILZ = this.LLILZLL.eglCreateContext(this.LLILLL, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                EGLSurface eGLSurfaceEglCreateWindowSurface = this.LLILZLL.eglCreateWindowSurface(this.LLILLL, eGLConfig, this.LLJILJIL.getSurfaceTexture(), null);
                this.LLILZIL = eGLSurfaceEglCreateWindowSurface;
                this.LLILZLL.eglMakeCurrent(this.LLILLL, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, this.LLILZ);
                C1287380jbc renderer = this.LLJILJIL.getRenderer();
                EGLContext eGLContext = this.LLILZ;
                renderer.onSurfaceCreated((GL10) (eGLContext != null ? eGLContext.getGL() : null), eGLConfig);
                this.LLILLJJLI = true;
                if (this.LLJILJIL.getRenderMode() == EnumC1284920jXe.CONTINUOUS) {
                    C786410Ut5.v2().postFrameCallback(this);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChoreographerFrameCallbackC1284880jXa(TextureViewSurfaceTextureListenerC1284890jXb textureViewSurfaceTextureListenerC1284890jXb) {
        super(textureViewSurfaceTextureListenerC1284890jXb.LLILLL);
        this.LLJILJIL = textureViewSurfaceTextureListenerC1284890jXb;
        this.LLILZLL = (EGL10) EGLContext.getEGL();
        this.LLIZ = textureViewSurfaceTextureListenerC1284890jXb.getWidth();
        this.LLIZLLLIL = textureViewSurfaceTextureListenerC1284890jXb.getHeight();
        this.LLJ = true;
        this.LLJIJIL = new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (!this.LLILLJJLI) {
            return;
        }
        int i = C1284900jXc.LIZ[this.LLJILJIL.getRenderMode().ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i == 2) {
                if (!this.LLJI && !this.LLJ) {
                    z = false;
                }
                this.LLJI = false;
                if (z) {
                    LIZIZ();
                    return;
                }
                return;
            }
            throw new C1954807lC();
        }
        LIZIZ();
        C786410Ut5.v2().postFrameCallback(this);
    }

    public final synchronized void LIZJ(int i, int i2) {
        this.LLIZ = i;
        this.LLIZLLLIL = i2;
        C1287380jbc renderer = this.LLJILJIL.getRenderer();
        int i3 = this.LLIZ;
        int i4 = this.LLIZLLLIL;
        renderer.LLILZIL = i3;
        renderer.LLILZLL = i4;
        C1287370jbb c1287370jbb = renderer.LLILZ;
        if (c1287370jbb != null) {
            c1287370jbb.LIZIZ = i3;
            c1287370jbb.LIZJ = i4;
        }
        this.LLJ = true;
        if (this.LLJILJIL.getRenderMode() == EnumC1284920jXe.WHEN_DIRTY) {
            this.LLJI = true;
            Handler handler = this.LL;
            if (handler != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS89S0200000_20(this.LLJILJIL, this, 27));
            }
        }
    }
}
