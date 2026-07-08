package X;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0jWx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1284490jWx implements Serializable {
    public static final long serialVersionUID = 20260122154612L;
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    public static C1284490jWx LIZIZ() {
        EGLConfig eGLConfig;
        int iIndexOf;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.EGL_NO_DISPLAY;
        EGLContext eGLContextEglCreateContext = EGL14.EGL_NO_CONTEXT;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        try {
            eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            EGLDisplay eGLDisplay = EGL14.EGL_NO_DISPLAY;
            if (eGLDisplayEglGetDisplay == eGLDisplay) {
                if (eGLDisplayEglGetDisplay != eGLDisplay) {
                    try {
                        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY && eGLContextEglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY && eGLSurfaceEglCreatePbufferSurface != EGL14.EGL_NO_SURFACE) {
                        EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
                    }
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                }
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGL14.eglTerminate(eGLDisplayEglGetDisplay);
                        return null;
                    }
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                }
                return null;
            }
            int[] iArr = new int[2];
            if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
                    }
                } catch (Throwable th5) {
                    TryCatchGuardChecker.doCheck(th5);
                }
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY && eGLContextEglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
                    }
                } catch (Throwable th6) {
                    TryCatchGuardChecker.doCheck(th6);
                }
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY && eGLSurfaceEglCreatePbufferSurface != EGL14.EGL_NO_SURFACE) {
                        EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
                    }
                } catch (Throwable th7) {
                    TryCatchGuardChecker.doCheck(th7);
                }
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGL14.eglTerminate(eGLDisplayEglGetDisplay);
                        return null;
                    }
                } catch (Throwable th8) {
                    TryCatchGuardChecker.doCheck(th8);
                }
                return null;
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            if (!EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12352, 4, 12339, 1, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
                    }
                } catch (Throwable th9) {
                    TryCatchGuardChecker.doCheck(th9);
                }
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY && eGLContextEglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
                    }
                } catch (Throwable th10) {
                    TryCatchGuardChecker.doCheck(th10);
                }
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY && eGLSurfaceEglCreatePbufferSurface != EGL14.EGL_NO_SURFACE) {
                        EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
                    }
                } catch (Throwable th11) {
                    TryCatchGuardChecker.doCheck(th11);
                }
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGL14.eglTerminate(eGLDisplayEglGetDisplay);
                        return null;
                    }
                } catch (Throwable th12) {
                    TryCatchGuardChecker.doCheck(th12);
                }
                return null;
            }
            if (iArr2[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGLSurface eGLSurface4 = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface4, eGLSurface4, EGL14.EGL_NO_CONTEXT);
                    }
                } catch (Throwable th13) {
                    TryCatchGuardChecker.doCheck(th13);
                }
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY && eGLContextEglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
                    }
                } catch (Throwable th14) {
                    TryCatchGuardChecker.doCheck(th14);
                }
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY && eGLSurfaceEglCreatePbufferSurface != EGL14.EGL_NO_SURFACE) {
                        EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
                    }
                } catch (Throwable th15) {
                    TryCatchGuardChecker.doCheck(th15);
                }
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGL14.eglTerminate(eGLDisplayEglGetDisplay);
                        return null;
                    }
                } catch (Throwable th16) {
                    TryCatchGuardChecker.doCheck(th16);
                }
                return null;
            }
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eGLSurfaceEglCreatePbufferSurface == null || eGLSurfaceEglCreatePbufferSurface == EGL14.EGL_NO_SURFACE) {
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGLSurface eGLSurface5 = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface5, eGLSurface5, EGL14.EGL_NO_CONTEXT);
                    }
                } catch (Throwable th17) {
                    TryCatchGuardChecker.doCheck(th17);
                }
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY && eGLContextEglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
                    }
                } catch (Throwable th18) {
                    TryCatchGuardChecker.doCheck(th18);
                }
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY && eGLSurfaceEglCreatePbufferSurface != EGL14.EGL_NO_SURFACE) {
                        EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
                    }
                } catch (Throwable th19) {
                    TryCatchGuardChecker.doCheck(th19);
                }
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGL14.eglTerminate(eGLDisplayEglGetDisplay);
                        return null;
                    }
                } catch (Throwable th20) {
                    TryCatchGuardChecker.doCheck(th20);
                }
                return null;
            }
            eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
            if (eGLContextEglCreateContext == null || eGLContextEglCreateContext == EGL14.EGL_NO_CONTEXT) {
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGLSurface eGLSurface6 = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface6, eGLSurface6, EGL14.EGL_NO_CONTEXT);
                    }
                } catch (Throwable th21) {
                    TryCatchGuardChecker.doCheck(th21);
                }
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY && eGLContextEglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
                    }
                } catch (Throwable th22) {
                    TryCatchGuardChecker.doCheck(th22);
                }
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY && eGLSurfaceEglCreatePbufferSurface != EGL14.EGL_NO_SURFACE) {
                        EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
                    }
                } catch (Throwable th23) {
                    TryCatchGuardChecker.doCheck(th23);
                }
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGL14.eglTerminate(eGLDisplayEglGetDisplay);
                        return null;
                    }
                } catch (Throwable th24) {
                    TryCatchGuardChecker.doCheck(th24);
                }
                return null;
            }
            if (!EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext)) {
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGLSurface eGLSurface7 = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface7, eGLSurface7, EGL14.EGL_NO_CONTEXT);
                    }
                } catch (Throwable th25) {
                    TryCatchGuardChecker.doCheck(th25);
                }
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY && eGLContextEglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
                    }
                } catch (Throwable th26) {
                    TryCatchGuardChecker.doCheck(th26);
                }
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY && eGLSurfaceEglCreatePbufferSurface != EGL14.EGL_NO_SURFACE) {
                        EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
                    }
                } catch (Throwable th27) {
                    TryCatchGuardChecker.doCheck(th27);
                }
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGL14.eglTerminate(eGLDisplayEglGetDisplay);
                        return null;
                    }
                } catch (Throwable th28) {
                    TryCatchGuardChecker.doCheck(th28);
                }
                return null;
            }
            String strGlGetString = GLES20.glGetString(7936);
            String strGlGetString2 = GLES20.glGetString(7937);
            String strGlGetString3 = GLES20.glGetString(7938);
            if (strGlGetString3 != null && strGlGetString3.startsWith("OpenGL ES ") && (iIndexOf = strGlGetString3.indexOf(32, 10)) != -1) {
                strGlGetString3 = strGlGetString3.substring(0, iIndexOf);
            }
            if (strGlGetString2 == null || strGlGetString2.isEmpty()) {
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGLSurface eGLSurface8 = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface8, eGLSurface8, EGL14.EGL_NO_CONTEXT);
                    }
                } catch (Throwable th29) {
                    TryCatchGuardChecker.doCheck(th29);
                }
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY && eGLContextEglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
                    }
                } catch (Throwable th30) {
                    TryCatchGuardChecker.doCheck(th30);
                }
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY && eGLSurfaceEglCreatePbufferSurface != EGL14.EGL_NO_SURFACE) {
                        EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
                    }
                } catch (Throwable th31) {
                    TryCatchGuardChecker.doCheck(th31);
                }
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGL14.eglTerminate(eGLDisplayEglGetDisplay);
                        return null;
                    }
                } catch (Throwable th32) {
                    TryCatchGuardChecker.doCheck(th32);
                }
                return null;
            }
            C1284490jWx c1284490jWx = new C1284490jWx(strGlGetString, strGlGetString2, strGlGetString3);
            try {
                if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                    EGLSurface eGLSurface9 = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface9, eGLSurface9, EGL14.EGL_NO_CONTEXT);
                }
            } catch (Throwable th33) {
                TryCatchGuardChecker.doCheck(th33);
            }
            try {
                if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY && eGLContextEglCreateContext != EGL14.EGL_NO_CONTEXT) {
                    EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
                }
            } catch (Throwable th34) {
                TryCatchGuardChecker.doCheck(th34);
            }
            try {
                if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY && eGLSurfaceEglCreatePbufferSurface != EGL14.EGL_NO_SURFACE) {
                    EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
                }
            } catch (Throwable th35) {
                TryCatchGuardChecker.doCheck(th35);
            }
            try {
                if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                    EGL14.eglTerminate(eGLDisplayEglGetDisplay);
                    return c1284490jWx;
                }
            } catch (Throwable th36) {
                TryCatchGuardChecker.doCheck(th36);
            }
            return c1284490jWx;
        } catch (Throwable th37) {
            try {
                TryCatchGuardChecker.doCheck(th37);
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGLSurface eGLSurface10 = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface10, eGLSurface10, EGL14.EGL_NO_CONTEXT);
                    }
                } catch (Throwable th38) {
                    TryCatchGuardChecker.doCheck(th38);
                }
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY && eGLContextEglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
                    }
                } catch (Throwable th39) {
                    TryCatchGuardChecker.doCheck(th39);
                }
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY && eGLSurfaceEglCreatePbufferSurface != EGL14.EGL_NO_SURFACE) {
                        EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
                    }
                } catch (Throwable th40) {
                    TryCatchGuardChecker.doCheck(th40);
                }
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGL14.eglTerminate(eGLDisplayEglGetDisplay);
                        return null;
                    }
                } catch (Throwable th41) {
                    TryCatchGuardChecker.doCheck(th41);
                }
                return null;
            } catch (Throwable th42) {
                TryCatchGuardChecker.doCheck(th42);
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGLSurface eGLSurface11 = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface11, eGLSurface11, EGL14.EGL_NO_CONTEXT);
                    }
                } catch (Throwable th43) {
                    TryCatchGuardChecker.doCheck(th43);
                }
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY && eGLContextEglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
                    }
                } catch (Throwable th44) {
                    TryCatchGuardChecker.doCheck(th44);
                }
                try {
                    if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY && eGLSurfaceEglCreatePbufferSurface != EGL14.EGL_NO_SURFACE) {
                        EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
                    }
                } catch (Throwable th45) {
                    TryCatchGuardChecker.doCheck(th45);
                }
                try {
                    if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
                        throw th42;
                    }
                    EGL14.eglTerminate(eGLDisplayEglGetDisplay);
                    throw th42;
                } catch (Throwable th46) {
                    TryCatchGuardChecker.doCheck(th46);
                    throw th42;
                }
            }
        }
    }

    public static synchronized C1284490jWx LIZ(C0VSJ c0vsj) {
        C1284490jWx c1284490jWx;
        C0VSJ c0vsj2 = new C0VSJ(c0vsj, "gpu.inf");
        try {
            c1284490jWx = (C1284490jWx) C0VJB.LIZ(c0vsj2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (c1284490jWx == null) {
            try {
                c1284490jWx = LIZIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (c1284490jWx == null) {
                c1284490jWx = new C1284490jWx("unknown", "unknown", "unknown");
            }
            C0VJB.LIZIZ(c0vsj2, c1284490jWx);
        }
        return c1284490jWx;
    }

    public C1284490jWx(String str, String str2, String str3) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }
}
