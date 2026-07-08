package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.bef.effectsdk.GLTextureView$ComponentSizeChooser;
import com.bef.effectsdk.GLTextureView$DefaultContextFactory;
import com.bef.effectsdk.GLTextureView$DefaultWindowSurfaceFactory;
import com.bef.effectsdk.GLTextureView$EGLConfigChooser;
import com.bef.effectsdk.GLTextureView$EGLContextFactory;
import com.bef.effectsdk.GLTextureView$EGLWindowSurfaceFactory;
import com.bef.effectsdk.GLTextureView$GLThread;
import com.bef.effectsdk.GLTextureView$GLThreadManager;
import com.bef.effectsdk.GLTextureView$GLWrapper;
import com.bef.effectsdk.GLTextureView$SimpleEGLConfigChooser;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0jbp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class TextureViewSurfaceTextureListenerC1287510jbp extends TextureView implements TextureView.SurfaceTextureListener {
    public static final GLTextureView$GLThreadManager sGLThreadManager = new GLTextureView$GLThreadManager();
    public int mDebugFlags;
    public boolean mDetached;
    public GLTextureView$EGLConfigChooser mEGLConfigChooser;
    public int mEGLContextClientVersion;
    public GLTextureView$EGLContextFactory mEGLContextFactory;
    public GLTextureView$EGLWindowSurfaceFactory mEGLWindowSurfaceFactory;
    public GLTextureView$GLThread mGLThread;
    public GLTextureView$GLWrapper mGLWrapper;
    public boolean mPreserveEGLContextOnPause;
    public SurfaceTexture mPrevSurfaceTexture;
    public GLSurfaceView.Renderer mRenderer;
    public final WeakReference<TextureViewSurfaceTextureListenerC1287510jbp> mThisWeakRef;

    public void onExitContext() {
    }

    private void checkRenderThreadState() {
        if (this.mGLThread != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    public void finalize() throws Throwable {
        try {
            GLTextureView$GLThread gLTextureView$GLThread = this.mGLThread;
            if (gLTextureView$GLThread != null) {
                gLTextureView$GLThread.requestExitAndWait();
            }
            super.finalize();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            super.finalize();
            throw th;
        }
    }

    public int getRenderMode() {
        return this.mGLThread.getRenderMode();
    }

    public void onDestroy() {
        SurfaceTexture surfaceTexture = this.mPrevSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        GLTextureView$GLThread gLTextureView$GLThread = this.mGLThread;
        if (gLTextureView$GLThread != null) {
            gLTextureView$GLThread.requestExitAndWait();
        }
        this.mDetached = true;
        super.onDetachedFromWindow();
    }

    public void onPause() {
        this.mGLThread.onPause();
    }

    public void onResume() {
        if (this.mPrevSurfaceTexture != null) {
            SurfaceTexture surfaceTexture = getSurfaceTexture();
            SurfaceTexture surfaceTexture2 = this.mPrevSurfaceTexture;
            if (surfaceTexture != surfaceTexture2) {
                setSurfaceTexture(surfaceTexture2);
                this.mGLThread.surfaceCreated();
            }
        }
        this.mGLThread.onResume();
    }

    public void requestRender() {
        this.mGLThread.requestRender();
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mDetached && this.mRenderer != null) {
            GLTextureView$GLThread gLTextureView$GLThread = this.mGLThread;
            int renderMode = gLTextureView$GLThread != null ? gLTextureView$GLThread.getRenderMode() : 1;
            GLTextureView$GLThread gLTextureView$GLThread2 = new GLTextureView$GLThread(this.mThisWeakRef);
            this.mGLThread = gLTextureView$GLThread2;
            if (renderMode != 1) {
                gLTextureView$GLThread2.setRenderMode(renderMode);
            }
            this.mGLThread.onWindowResize(getWidth(), getHeight());
            this.mGLThread.start();
        }
        this.mDetached = false;
    }

    private void init() {
        setSurfaceTextureListener(this);
    }

    public int getDebugFlags() {
        return this.mDebugFlags;
    }

    public int getEGLContextClientVersion() {
        return this.mEGLContextClientVersion;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.mPreserveEGLContextOnPause;
    }

    public TextureViewSurfaceTextureListenerC1287510jbp(Context context) {
        super(context);
        this.mThisWeakRef = new WeakReference<>(this);
        init();
    }

    public void on(SurfaceHolder surfaceHolder) {
        this.mGLThread.surfaceCreated();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        GLTextureView$GLThread gLTextureView$GLThread = this.mGLThread;
        if (gLTextureView$GLThread != null) {
            gLTextureView$GLThread.surfaceDestroyed();
            return false;
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (getRenderMode() != 0) {
            requestRender();
        }
    }

    public void queueEvent(Runnable runnable) {
        this.mGLThread.queueEvent(runnable);
    }

    public void setDebugFlags(int i) {
        this.mDebugFlags = i;
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser(new GLTextureView$SimpleEGLConfigChooser(this, z));
    }

    public void setEGLContextClientVersion(int i) {
        checkRenderThreadState();
        this.mEGLContextClientVersion = i;
    }

    public void setEGLContextFactory(GLTextureView$EGLContextFactory gLTextureView$EGLContextFactory) {
        checkRenderThreadState();
        this.mEGLContextFactory = gLTextureView$EGLContextFactory;
    }

    public void setEGLWindowSurfaceFactory(GLTextureView$EGLWindowSurfaceFactory gLTextureView$EGLWindowSurfaceFactory) {
        checkRenderThreadState();
        this.mEGLWindowSurfaceFactory = gLTextureView$EGLWindowSurfaceFactory;
    }

    public void setGLWrapper(GLTextureView$GLWrapper gLTextureView$GLWrapper) {
        this.mGLWrapper = gLTextureView$GLWrapper;
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.mPreserveEGLContextOnPause = z;
    }

    public void setRenderMode(int i) {
        this.mGLThread.setRenderMode(i);
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        checkRenderThreadState();
        if (this.mEGLConfigChooser == null) {
            this.mEGLConfigChooser = new GLTextureView$SimpleEGLConfigChooser(this, true);
        }
        if (this.mEGLContextFactory == null) {
            this.mEGLContextFactory = new GLTextureView$DefaultContextFactory(this);
        }
        if (this.mEGLWindowSurfaceFactory == null) {
            this.mEGLWindowSurfaceFactory = new GLTextureView$DefaultWindowSurfaceFactory();
        }
        this.mRenderer = renderer;
        GLTextureView$GLThread gLTextureView$GLThread = new GLTextureView$GLThread(this.mThisWeakRef);
        this.mGLThread = gLTextureView$GLThread;
        gLTextureView$GLThread.start();
    }

    public void setEGLConfigChooser(GLTextureView$EGLConfigChooser gLTextureView$EGLConfigChooser) {
        checkRenderThreadState();
        this.mEGLConfigChooser = gLTextureView$EGLConfigChooser;
    }

    public TextureViewSurfaceTextureListenerC1287510jbp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mThisWeakRef = new WeakReference<>(this);
        init();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.mPrevSurfaceTexture = surfaceTexture;
        GLTextureView$GLThread gLTextureView$GLThread = this.mGLThread;
        if (gLTextureView$GLThread != null) {
            gLTextureView$GLThread.surfaceCreated();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.mGLThread.onWindowResize(i, i2);
    }

    @Override // android.view.TextureView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        GLTextureView$GLThread gLTextureView$GLThread = this.mGLThread;
        if (gLTextureView$GLThread != null) {
            gLTextureView$GLThread.onWindowResize(i, i2);
        }
    }

    public void setEGLConfigChooser(int i, int i2, int i3, int i4, int i5, int i6) {
        setEGLConfigChooser(new GLTextureView$ComponentSizeChooser(this, i, i2, i3, i4, i5, i6));
    }
}
