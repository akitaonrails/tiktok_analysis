package com.bef.effectsdk;

import X.C2188811AlT;
import X.TextureViewSurfaceTextureListenerC1287510jbp;
import android.opengl.GLDebugHelper;
import java.io.Writer;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;

/* JADX INFO: loaded from: classes21.dex */
public class GLTextureView$EglHelper {
    public EGL10 mEgl;
    public EGLConfig mEglConfig;
    public EGLContext mEglContext;
    public EGLDisplay mEglDisplay;
    public EGLSurface mEglSurface;
    public WeakReference<TextureViewSurfaceTextureListenerC1287510jbp> mGLTextureViewWeakRef;

    public static void logEglErrorAsWarning(String str, String str2, int i) {
    }

    private void destroySurfaceImp() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.mEglSurface;
        if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            return;
        }
        this.mEgl.eglMakeCurrent(this.mEglDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        TextureViewSurfaceTextureListenerC1287510jbp textureViewSurfaceTextureListenerC1287510jbp = this.mGLTextureViewWeakRef.get();
        if (textureViewSurfaceTextureListenerC1287510jbp != null) {
            textureViewSurfaceTextureListenerC1287510jbp.mEGLWindowSurfaceFactory.destroySurface(this.mEgl, this.mEglDisplay, this.mEglSurface);
        }
        this.mEglSurface = null;
    }

    public GL createGL() {
        GL gl = this.mEglContext.getGL();
        TextureViewSurfaceTextureListenerC1287510jbp textureViewSurfaceTextureListenerC1287510jbp = this.mGLTextureViewWeakRef.get();
        if (textureViewSurfaceTextureListenerC1287510jbp == null) {
            return gl;
        }
        GLTextureView$GLWrapper gLTextureView$GLWrapper = textureViewSurfaceTextureListenerC1287510jbp.mGLWrapper;
        if (gLTextureView$GLWrapper != null) {
            gl = gLTextureView$GLWrapper.wrap(gl);
        }
        int i = textureViewSurfaceTextureListenerC1287510jbp.mDebugFlags;
        if ((i & 3) != 0) {
            return GLDebugHelper.wrap(gl, (i & 1) != 0 ? 1 : 0, (i & 2) != 0 ? new Writer() { // from class: com.bef.effectsdk.GLTextureView$LogWriter
                public StringBuilder mBuilder = new StringBuilder();

                private void flushBuilder() {
                    if (this.mBuilder.length() > 0) {
                        StringBuilder sb = this.mBuilder;
                        sb.delete(0, sb.length());
                    }
                }

                @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    flushBuilder();
                }

                @Override // java.io.Writer, java.io.Flushable
                public void flush() {
                    flushBuilder();
                }

                @Override // java.io.Writer
                public void write(char[] cArr, int i2, int i3) {
                    for (int i4 = 0; i4 < i3; i4++) {
                        char c = cArr[i2 + i4];
                        if (c == '\n') {
                            flushBuilder();
                        } else {
                            this.mBuilder.append(c);
                        }
                    }
                }
            } : null);
        }
        return gl;
    }

    public boolean createSurface() {
        if (this.mEgl == null) {
            throw new RuntimeException("egl not initialized");
        }
        if (this.mEglDisplay == null) {
            throw new RuntimeException("eglDisplay not initialized");
        }
        if (this.mEglConfig == null) {
            throw new RuntimeException("mEglConfig not initialized");
        }
        destroySurfaceImp();
        TextureViewSurfaceTextureListenerC1287510jbp textureViewSurfaceTextureListenerC1287510jbp = this.mGLTextureViewWeakRef.get();
        if (textureViewSurfaceTextureListenerC1287510jbp != null) {
            this.mEglSurface = textureViewSurfaceTextureListenerC1287510jbp.mEGLWindowSurfaceFactory.createWindowSurface(this.mEgl, this.mEglDisplay, this.mEglConfig, textureViewSurfaceTextureListenerC1287510jbp.getSurfaceTexture());
        } else {
            this.mEglSurface = null;
        }
        EGLSurface eGLSurface = this.mEglSurface;
        if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
            this.mEgl.eglGetError();
            return false;
        }
        if (this.mEgl.eglMakeCurrent(this.mEglDisplay, eGLSurface, eGLSurface, this.mEglContext)) {
            return true;
        }
        logEglErrorAsWarning("EGLHelper", "eglMakeCurrent", this.mEgl.eglGetError());
        return false;
    }

    public void finish() {
        if (this.mEglContext != null) {
            TextureViewSurfaceTextureListenerC1287510jbp textureViewSurfaceTextureListenerC1287510jbp = this.mGLTextureViewWeakRef.get();
            if (textureViewSurfaceTextureListenerC1287510jbp != null) {
                textureViewSurfaceTextureListenerC1287510jbp.mEGLContextFactory.destroyContext(this.mEgl, this.mEglDisplay, this.mEglContext);
            }
            this.mEglContext = null;
        }
        EGLDisplay eGLDisplay = this.mEglDisplay;
        if (eGLDisplay != null) {
            this.mEgl.eglTerminate(eGLDisplay);
            this.mEglDisplay = null;
        }
    }

    public int swap() {
        if (this.mEgl.eglSwapBuffers(this.mEglDisplay, this.mEglSurface)) {
            return 12288;
        }
        return this.mEgl.eglGetError();
    }

    public void start() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.mEgl = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.mEglDisplay = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            throw new RuntimeException("eglGetDisplay failed");
        }
        if (!this.mEgl.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
            throw new RuntimeException("eglInitialize failed");
        }
        TextureViewSurfaceTextureListenerC1287510jbp textureViewSurfaceTextureListenerC1287510jbp = this.mGLTextureViewWeakRef.get();
        if (textureViewSurfaceTextureListenerC1287510jbp == null) {
            this.mEglConfig = null;
            this.mEglContext = null;
        } else {
            EGLConfig eGLConfigChooseConfig = textureViewSurfaceTextureListenerC1287510jbp.mEGLConfigChooser.chooseConfig(this.mEgl, this.mEglDisplay);
            this.mEglConfig = eGLConfigChooseConfig;
            this.mEglContext = textureViewSurfaceTextureListenerC1287510jbp.mEGLContextFactory.createContext(this.mEgl, this.mEglDisplay, eGLConfigChooseConfig);
        }
        EGLContext eGLContext = this.mEglContext;
        if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
            this.mEglContext = null;
            throwEglException("createContext");
        }
        this.mEglSurface = null;
    }

    public void destroySurface() {
        destroySurfaceImp();
    }

    public GLTextureView$EglHelper(WeakReference<TextureViewSurfaceTextureListenerC1287510jbp> weakReference) {
        this.mGLTextureViewWeakRef = weakReference;
    }

    private void throwEglException(String str) {
        throwEglException(str, this.mEgl.eglGetError());
    }

    public static String formatEglError(String str, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" failed");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void throwEglException(String str, int i) {
        throw new RuntimeException(formatEglError(str, i));
    }
}
