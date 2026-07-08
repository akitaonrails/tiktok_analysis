package com.bef.effectsdk;

import X.TextureViewSurfaceTextureListenerC1287510jbp;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* JADX INFO: loaded from: classes21.dex */
public class GLTextureView$DefaultContextFactory implements GLTextureView$EGLContextFactory {
    public int EGL_CONTEXT_CLIENT_VERSION;
    public final /* synthetic */ TextureViewSurfaceTextureListenerC1287510jbp this$0;

    public GLTextureView$DefaultContextFactory(TextureViewSurfaceTextureListenerC1287510jbp textureViewSurfaceTextureListenerC1287510jbp) {
        this.this$0 = textureViewSurfaceTextureListenerC1287510jbp;
        this.EGL_CONTEXT_CLIENT_VERSION = 12440;
    }

    @Override // com.bef.effectsdk.GLTextureView$EGLContextFactory
    public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        EGLContext eGLContextEglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{this.EGL_CONTEXT_CLIENT_VERSION, 3, 12344});
        this.this$0.mEGLContextClientVersion = 3;
        EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
        if (eGLContextEglCreateContext == eGLContext) {
            eGLContextEglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{this.EGL_CONTEXT_CLIENT_VERSION, 2, 12344});
            TextureViewSurfaceTextureListenerC1287510jbp textureViewSurfaceTextureListenerC1287510jbp = this.this$0;
            textureViewSurfaceTextureListenerC1287510jbp.mEGLContextClientVersion = 2;
            if (eGLContextEglCreateContext == EGL10.EGL_NO_CONTEXT) {
                textureViewSurfaceTextureListenerC1287510jbp.mEGLContextClientVersion = 0;
            }
        }
        return eGLContextEglCreateContext;
    }

    @Override // com.bef.effectsdk.GLTextureView$EGLContextFactory
    public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
        if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
            GLTextureView$EglHelper.throwEglException("eglDestroyContex", egl10.eglGetError());
        }
    }
}
