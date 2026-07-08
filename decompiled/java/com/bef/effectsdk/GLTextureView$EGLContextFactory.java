package com.bef.effectsdk;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* JADX INFO: loaded from: classes21.dex */
public interface GLTextureView$EGLContextFactory {
    EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

    void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
}
