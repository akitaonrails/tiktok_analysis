package X;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* JADX INFO: renamed from: X.0jWg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1284320jWg {
    public EGLContext LIZ = EGL14.EGL_NO_CONTEXT;
    public EGLSurface LIZIZ;
    public EGLSurface LIZJ;
    public EGLDisplay LIZLLL;
    public int LJ;

    public final void LIZ() {
        EGL14.eglMakeCurrent(this.LIZLLL, this.LIZIZ, this.LIZJ, this.LIZ);
    }

    public C1284320jWg() {
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        this.LIZIZ = eGLSurface;
        this.LIZJ = eGLSurface;
        this.LIZLLL = EGL14.EGL_NO_DISPLAY;
        this.LJ = 2;
    }

    public final void LIZIZ() {
        EGLContext eGLContextEglGetCurrentContext = EGL14.eglGetCurrentContext();
        this.LIZ = eGLContextEglGetCurrentContext;
        if (eGLContextEglGetCurrentContext.equals(EGL14.EGL_NO_CONTEXT)) {
            C2484209oO.LIZJ("TEEglStateSaver", "Saved EGL_NO_CONTEXT");
        }
        EGLSurface eGLSurfaceEglGetCurrentSurface = EGL14.eglGetCurrentSurface(12378);
        this.LIZIZ = eGLSurfaceEglGetCurrentSurface;
        if (eGLSurfaceEglGetCurrentSurface.equals(EGL14.EGL_NO_SURFACE)) {
            C2484209oO.LIZJ("TEEglStateSaver", "Saved EGL_NO_SURFACE");
        }
        EGLSurface eGLSurfaceEglGetCurrentSurface2 = EGL14.eglGetCurrentSurface(12377);
        this.LIZJ = eGLSurfaceEglGetCurrentSurface2;
        if (eGLSurfaceEglGetCurrentSurface2.equals(EGL14.EGL_NO_SURFACE)) {
            C2484209oO.LIZJ("TEEglStateSaver", "Saved EGL_NO_SURFACE");
        }
        EGLDisplay eGLDisplayEglGetCurrentDisplay = EGL14.eglGetCurrentDisplay();
        this.LIZLLL = eGLDisplayEglGetCurrentDisplay;
        int[] iArr = {2};
        EGL14.eglQueryContext(eGLDisplayEglGetCurrentDisplay, this.LIZ, 12440, iArr, 0);
        this.LJ = iArr[0];
        if (this.LIZLLL.equals(EGL14.EGL_NO_DISPLAY)) {
            C2484209oO.LIZJ("TEEglStateSaver", "Saved EGL_NO_DISPLAY");
        }
    }
}
