package X;

import android.os.Build;
import java.util.Locale;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0jXN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1284750jXN {
    public EGL10 LIZ;
    public EGLDisplay LIZIZ;
    public EGLConfig LIZJ;
    public EGLSurface LIZLLL;
    public EGLContext LJ;
    public GL10 LJFF;
    public final EGLContext LJI = EGL10.EGL_NO_CONTEXT;
    public final boolean LJII;

    public final void LIZIZ() {
        EGLSurface eGLSurface;
        EGL10 egl10 = this.LIZ;
        if (egl10 != null) {
            if (!this.LJII) {
                EGLDisplay eGLDisplay = this.LIZIZ;
                EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
                egl10.eglDestroySurface(this.LIZIZ, this.LIZLLL);
                egl10.eglDestroyContext(this.LIZIZ, this.LJ);
                egl10.eglTerminate(this.LIZIZ);
                return;
            }
            EGLDisplay eGLDisplay2 = this.LIZIZ;
            if (eGLDisplay2 != EGL10.EGL_NO_DISPLAY) {
                EGLSurface eGLSurface3 = this.LIZLLL;
                if (eGLSurface3 != null && eGLSurface3 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                    egl10.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                    egl10.eglDestroySurface(this.LIZIZ, this.LIZLLL);
                    this.LIZLLL = null;
                }
                EGLContext eGLContext = this.LJ;
                if (eGLContext != null) {
                    egl10.eglDestroyContext(this.LIZIZ, eGLContext);
                    this.LJ = null;
                }
                EGLDisplay eGLDisplay3 = this.LIZIZ;
                if (eGLDisplay3 != null) {
                    egl10.eglTerminate(eGLDisplay3);
                    this.LIZIZ = null;
                }
            }
        }
    }

    public final void LIZJ() {
        EGL10 egl10;
        int[] iArr = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
        EGL egl = EGLContext.getEGL();
        if (!(egl instanceof EGL10) || (egl10 = (EGL10) egl) == null) {
            return;
        }
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.LIZIZ = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            LIZLLL("unable to get EGL10 display");
        }
        LIZ(egl10);
        if (!egl10.eglInitialize(this.LIZIZ, new int[2])) {
            LIZLLL("unable to initialize EGL10");
        }
        LIZ(egl10);
        int[] iArr2 = new int[1];
        if (!egl10.eglChooseConfig(this.LIZIZ, iArr, null, 0, iArr2)) {
            LIZLLL("eglChooseConfig failed");
        }
        LIZ(egl10);
        int i = iArr2[0];
        EGLConfig[] eGLConfigArr = new EGLConfig[i];
        if (!egl10.eglChooseConfig(this.LIZIZ, iArr, eGLConfigArr, i, iArr2)) {
            LIZLLL("eglChooseConfig#2 failed");
        }
        LIZ(egl10);
        EGLConfig eGLConfig = eGLConfigArr[0];
        this.LIZJ = eGLConfig;
        if (eGLConfig == null) {
            LIZLLL("Unable to find a suitable EGLConfig");
        }
        EGLSurface eGLSurfaceEglCreatePbufferSurface = egl10.eglCreatePbufferSurface(this.LIZIZ, this.LIZJ, new int[]{12375, 16, 12374, 16, 12344});
        this.LIZLLL = eGLSurfaceEglCreatePbufferSurface;
        if (eGLSurfaceEglCreatePbufferSurface == EGL10.EGL_NO_SURFACE || eGLSurfaceEglCreatePbufferSurface == null) {
            LIZLLL("surface was null");
        }
        LIZ(egl10);
        EGLContext eGLContextEglCreateContext = egl10.eglCreateContext(this.LIZIZ, this.LIZJ, this.LJI, new int[]{12440, 2, 12344});
        this.LJ = eGLContextEglCreateContext;
        if (eGLContextEglCreateContext == EGL10.EGL_NO_CONTEXT || eGLContextEglCreateContext == null) {
            LIZLLL("context was null");
        }
        LIZ(egl10);
        EGLDisplay eGLDisplay = this.LIZIZ;
        EGLSurface eGLSurface = this.LIZLLL;
        if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.LJ)) {
            LIZLLL("eglMakeCurrent failed");
        }
        LIZ(egl10);
        EGLContext eGLContext = this.LJ;
        GL gl = eGLContext != null ? eGLContext.getGL() : null;
        this.LJFF = gl instanceof GL10 ? (GL10) gl : null;
        this.LIZ = egl10;
    }

    public C1284750jXN() {
        String str = Build.MODEL;
        this.LJII = Intrinsics.LJFF("mi play", str != null ? str.toLowerCase(Locale.ROOT) : null);
    }

    public final void LIZ(EGL10 egl10) {
        int iEglGetError = egl10.eglGetError();
        if (iEglGetError != 12288) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EGL error: 0x");
            sbLIZ.append(Integer.toHexString(iEglGetError));
            LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LIZLLL(String str) {
        if (!this.LJII) {
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get gpu info error:");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LIZIZ("EGLUtils", strLIZIZ, null);
            return;
        }
        throw new RuntimeException(str);
    }
}
