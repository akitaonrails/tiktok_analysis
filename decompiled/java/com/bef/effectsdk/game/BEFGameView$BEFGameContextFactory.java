package com.bef.effectsdk.game;

import X.C1287650jc3;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* JADX INFO: loaded from: classes21.dex */
public class BEFGameView$BEFGameContextFactory implements GLSurfaceView.EGLContextFactory {
    public int EGL_CONTEXT_CLIENT_VERSION;
    public final /* synthetic */ C1287650jc3 this$0;

    public BEFGameView$BEFGameContextFactory(C1287650jc3 c1287650jc3) {
        this.this$0 = c1287650jc3;
        this.EGL_CONTEXT_CLIENT_VERSION = 12440;
    }

    @Override // android.opengl.GLSurfaceView.EGLContextFactory
    public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{this.EGL_CONTEXT_CLIENT_VERSION, 2, 12344});
    }

    @Override // android.opengl.GLSurfaceView.EGLContextFactory
    public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
        egl10.eglDestroyContext(eGLDisplay, eGLContext);
        if (this.this$0.getNativeInited()) {
            this.this$0.setNativeInited(false);
            NativeInterface.nativeDestroy(this.this$0.mHandle);
            this.this$0.deleteBuffers();
        }
    }
}
