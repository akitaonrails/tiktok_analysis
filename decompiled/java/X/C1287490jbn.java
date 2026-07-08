package X;

import android.graphics.SurfaceTexture;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: renamed from: X.0jbn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1287490jbn {
    public final WeakReference<TextureViewSurfaceTextureListenerC1287530jbr> LIZ;
    public EGL10 LIZIZ;
    public EGLDisplay LIZJ;
    public EGLSurface LIZLLL;
    public EGLConfig LJ;
    public EGLContext LJFF;

    public final boolean LIZ() {
        try {
            if (this.LIZIZ == null) {
                throw new RuntimeException("egl not initialized");
            }
            if (this.LIZJ == null) {
                throw new RuntimeException("eglDisplay not initialized");
            }
            if (this.LJ == null) {
                throw new RuntimeException("mEglConfig not initialized");
            }
            LIZIZ();
            TextureViewSurfaceTextureListenerC1287530jbr textureViewSurfaceTextureListenerC1287530jbr = this.LIZ.get();
            EGLSurface eGLSurfaceEglCreateWindowSurface = null;
            if (textureViewSurfaceTextureListenerC1287530jbr != null) {
                InterfaceC1287620jc0 interfaceC1287620jc0 = textureViewSurfaceTextureListenerC1287530jbr.LLIZLLLIL;
                EGL10 egl10 = this.LIZIZ;
                EGLDisplay eGLDisplay = this.LIZJ;
                EGLConfig eGLConfig = this.LJ;
                SurfaceTexture surfaceTexture = textureViewSurfaceTextureListenerC1287530jbr.getSurfaceTexture();
                ((C1287590jbx) interfaceC1287620jc0).getClass();
                try {
                    eGLSurfaceEglCreateWindowSurface = egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, surfaceTexture, null);
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                this.LIZLLL = eGLSurfaceEglCreateWindowSurface;
            } else {
                this.LIZLLL = null;
            }
            EGLSurface eGLSurface = this.LIZLLL;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                this.LIZIZ.eglGetError();
                return false;
            }
            if (this.LIZIZ.eglMakeCurrent(this.LIZJ, eGLSurface, eGLSurface, this.LJFF)) {
                return true;
            }
            this.LIZIZ.eglGetError();
            return false;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return false;
        }
    }

    public final void LIZIZ() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.LIZLLL;
        if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            return;
        }
        this.LIZIZ.eglMakeCurrent(this.LIZJ, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        TextureViewSurfaceTextureListenerC1287530jbr textureViewSurfaceTextureListenerC1287530jbr = this.LIZ.get();
        if (textureViewSurfaceTextureListenerC1287530jbr != null) {
            InterfaceC1287620jc0 interfaceC1287620jc0 = textureViewSurfaceTextureListenerC1287530jbr.LLIZLLLIL;
            EGL10 egl10 = this.LIZIZ;
            EGLDisplay eGLDisplay = this.LIZJ;
            EGLSurface eGLSurface3 = this.LIZLLL;
            interfaceC1287620jc0.getClass();
            egl10.eglDestroySurface(eGLDisplay, eGLSurface3);
        }
        this.LIZLLL = null;
    }

    public final void LIZJ() {
        if (this.LJFF != null) {
            TextureViewSurfaceTextureListenerC1287530jbr textureViewSurfaceTextureListenerC1287530jbr = this.LIZ.get();
            if (textureViewSurfaceTextureListenerC1287530jbr != null) {
                InterfaceC1287610jbz interfaceC1287610jbz = textureViewSurfaceTextureListenerC1287530jbr.LLIZ;
                EGL10 egl10 = this.LIZIZ;
                EGLDisplay eGLDisplay = this.LIZJ;
                EGLContext eGLContext = this.LJFF;
                interfaceC1287610jbz.getClass();
                if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                    int iEglGetError = egl10.eglGetError();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("eglDestroyContex");
                    sbLIZ.append(" failed: ");
                    sbLIZ.append(iEglGetError);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
            this.LJFF = null;
        }
        EGLDisplay eGLDisplay2 = this.LIZJ;
        if (eGLDisplay2 != null) {
            this.LIZIZ.eglTerminate(eGLDisplay2);
            this.LIZJ = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1287490jbn.LIZLLL():void");
    }

    public C1287490jbn(WeakReference<TextureViewSurfaceTextureListenerC1287530jbr> weakReference) {
        this.LIZ = weakReference;
    }
}
