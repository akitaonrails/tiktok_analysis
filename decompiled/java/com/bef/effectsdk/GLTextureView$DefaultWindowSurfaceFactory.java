package com.bef.effectsdk;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: loaded from: classes21.dex */
public class GLTextureView$DefaultWindowSurfaceFactory implements GLTextureView$EGLWindowSurfaceFactory {
    public GLTextureView$DefaultWindowSurfaceFactory() {
    }

    @Override // com.bef.effectsdk.GLTextureView$EGLWindowSurfaceFactory
    public void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        egl10.eglDestroySurface(eGLDisplay, eGLSurface);
    }

    @Override // com.bef.effectsdk.GLTextureView$EGLWindowSurfaceFactory
    public EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
        EGLSurface eGLSurfaceEglCreateWindowSurface = null;
        try {
            eGLSurfaceEglCreateWindowSurface = egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            return eGLSurfaceEglCreateWindowSurface;
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return eGLSurfaceEglCreateWindowSurface;
        }
    }
}
