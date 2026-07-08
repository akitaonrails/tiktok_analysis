package X;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0jXC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1284640jXC {
    public EGLDisplay LIZ;
    public EGLSurface LIZIZ;
    public EGLContext LIZJ;

    public final void LIZIZ() {
        try {
            try {
                EGLDisplay eGLDisplay = this.LIZ;
                if (eGLDisplay != null && !Intrinsics.LJFF(eGLDisplay, EGL14.EGL_NO_DISPLAY)) {
                    EGLSurface eGLSurface = this.LIZIZ;
                    if (eGLSurface != null && !Intrinsics.LJFF(eGLSurface, EGL14.EGL_NO_SURFACE)) {
                        EGL14.eglDestroySurface(this.LIZ, this.LIZIZ);
                    }
                    EGLContext eGLContext = this.LIZJ;
                    if (eGLContext != null && !Intrinsics.LJFF(eGLContext, EGL14.EGL_NO_CONTEXT)) {
                        EGL14.eglDestroyContext(this.LIZ, this.LIZJ);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                e.getMessage();
            }
            this.LIZ = null;
            this.LIZIZ = null;
            this.LIZJ = null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ = null;
            this.LIZIZ = null;
            this.LIZJ = null;
            throw th;
        }
    }

    public static EGLConfig LIZ(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        if (EGL14.eglChooseConfig(eGLDisplay, new int[]{12352, 4, 12339, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr, 0) && iArr[0] != 0) {
            return eGLConfigArr[0];
        }
        throw new RuntimeException("Failed to choose EGLConfig");
    }
}
