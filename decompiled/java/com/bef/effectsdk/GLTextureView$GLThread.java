package com.bef.effectsdk;

import X.C0W9U;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C786410Ut5;
import X.TextureViewSurfaceTextureListenerC1287510jbp;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public class GLTextureView$GLThread extends BPEAThread {
    public GLTextureView$EglHelper mEglHelper;
    public boolean mExited;
    public boolean mFinishedCreatingEglSurface;
    public WeakReference<TextureViewSurfaceTextureListenerC1287510jbp> mGLTextureViewWeakRef;
    public boolean mHasSurface;
    public boolean mHaveEglContext;
    public boolean mHaveEglSurface;
    public boolean mPaused;
    public boolean mRenderComplete;
    public boolean mRequestPaused;
    public boolean mShouldExit;
    public boolean mShouldReleaseEglContext;
    public boolean mSurfaceIsBad;
    public boolean mWaitingForSurface;
    public ArrayList<Runnable> mEventQueue = new ArrayList<>();
    public boolean mSizeChanged = true;
    public int mWidth = 0;
    public int mHeight = 0;
    public boolean mRequestRender = true;
    public int mRenderMode = 1;

    private void bpea_origin_run() {
        com_bef_effectsdk_GLTextureView$GLThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
    }

    public void requestReleaseEglContextLocked() {
        this.mShouldReleaseEglContext = true;
        TextureViewSurfaceTextureListenerC1287510jbp.sGLThreadManager.notifyAll();
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0215 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void guardedRun() {
        /*
            Method dump skipped, instruction units count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.GLTextureView$GLThread.guardedRun():void");
    }

    private boolean readyToDraw() {
        if (this.mPaused || !this.mHasSurface || this.mSurfaceIsBad || this.mWidth <= 0 || this.mHeight <= 0) {
            return false;
        }
        return this.mRequestRender || this.mRenderMode == 1;
    }

    private void stopEglContextLocked() {
        if (this.mHaveEglContext) {
            this.mEglHelper.finish();
            this.mHaveEglContext = false;
            TextureViewSurfaceTextureListenerC1287510jbp.sGLThreadManager.releaseEglContextLocked(this);
        }
    }

    private void stopEglSurfaceLocked() {
        if (this.mHaveEglSurface) {
            this.mHaveEglSurface = false;
            this.mEglHelper.destroySurface();
        }
    }

    public boolean ableToDraw() {
        return this.mHaveEglContext && this.mHaveEglSurface && readyToDraw();
    }

    public int getRenderMode() {
        int i;
        synchronized (TextureViewSurfaceTextureListenerC1287510jbp.sGLThreadManager) {
            try {
                i = this.mRenderMode;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return i;
    }

    public void onPause() {
        GLTextureView$GLThreadManager gLTextureView$GLThreadManager = TextureViewSurfaceTextureListenerC1287510jbp.sGLThreadManager;
        synchronized (gLTextureView$GLThreadManager) {
            try {
                this.mRequestPaused = true;
                gLTextureView$GLThreadManager.notifyAll();
                while (!this.mExited && !this.mPaused) {
                    try {
                        TextureViewSurfaceTextureListenerC1287510jbp.sGLThreadManager.wait();
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C786410Ut5.u3().interrupt();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void onResume() {
        GLTextureView$GLThreadManager gLTextureView$GLThreadManager = TextureViewSurfaceTextureListenerC1287510jbp.sGLThreadManager;
        synchronized (gLTextureView$GLThreadManager) {
            try {
                this.mRequestPaused = false;
                this.mRequestRender = true;
                this.mRenderComplete = false;
                gLTextureView$GLThreadManager.notifyAll();
                while (!this.mExited && this.mPaused && !this.mRenderComplete) {
                    try {
                        TextureViewSurfaceTextureListenerC1287510jbp.sGLThreadManager.wait();
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C786410Ut5.u3().interrupt();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void requestExitAndWait() {
        GLTextureView$GLThreadManager gLTextureView$GLThreadManager = TextureViewSurfaceTextureListenerC1287510jbp.sGLThreadManager;
        synchronized (gLTextureView$GLThreadManager) {
            try {
                this.mShouldExit = true;
                gLTextureView$GLThreadManager.notifyAll();
                while (!this.mExited) {
                    try {
                        TextureViewSurfaceTextureListenerC1287510jbp.sGLThreadManager.wait();
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C786410Ut5.u3().interrupt();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void requestRender() {
        GLTextureView$GLThreadManager gLTextureView$GLThreadManager = TextureViewSurfaceTextureListenerC1287510jbp.sGLThreadManager;
        synchronized (gLTextureView$GLThreadManager) {
            try {
                this.mRequestRender = true;
                gLTextureView$GLThreadManager.notifyAll();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
    public void run() {
        C1C7U.LIZ("GLTextureView$GLThread@5a1a.run");
        boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
        try {
            com_bef_effectsdk_GLTextureView$GLThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            if (zLJ) {
                C0W9U.LJFF();
            }
            C1C7U.LIZIZ("GLTextureView$GLThread@5a1a.run");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (zLJ) {
                C0W9U.LJFF();
            }
            throw th;
        }
    }

    public void surfaceCreated() {
        GLTextureView$GLThreadManager gLTextureView$GLThreadManager = TextureViewSurfaceTextureListenerC1287510jbp.sGLThreadManager;
        synchronized (gLTextureView$GLThreadManager) {
            try {
                this.mHasSurface = true;
                this.mFinishedCreatingEglSurface = false;
                gLTextureView$GLThreadManager.notifyAll();
                while (this.mWaitingForSurface && !this.mFinishedCreatingEglSurface && !this.mExited) {
                    try {
                        TextureViewSurfaceTextureListenerC1287510jbp.sGLThreadManager.wait();
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C786410Ut5.u3().interrupt();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void surfaceDestroyed() {
        GLTextureView$GLThreadManager gLTextureView$GLThreadManager = TextureViewSurfaceTextureListenerC1287510jbp.sGLThreadManager;
        synchronized (gLTextureView$GLThreadManager) {
            try {
                this.mHasSurface = false;
                gLTextureView$GLThreadManager.notifyAll();
                while (!this.mWaitingForSurface && !this.mExited) {
                    try {
                        TextureViewSurfaceTextureListenerC1287510jbp.sGLThreadManager.wait();
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C786410Ut5.u3().interrupt();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void com_bef_effectsdk_GLTextureView$GLThread__run$___twin___() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GLThread ");
        sbLIZ.append(getId());
        setName(C2188811AlT.LIZIZ(sbLIZ));
        try {
            guardedRun();
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (RuntimeException e2) {
            TryCatchGuardChecker.doCheck(e2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            TextureViewSurfaceTextureListenerC1287510jbp.sGLThreadManager.threadExiting(this);
            throw th;
        }
        TextureViewSurfaceTextureListenerC1287510jbp.sGLThreadManager.threadExiting(this);
    }

    public GLTextureView$GLThread(WeakReference<TextureViewSurfaceTextureListenerC1287510jbp> weakReference) {
        this.mGLTextureViewWeakRef = weakReference;
    }

    public static void com_bef_effectsdk_GLTextureView$GLThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(GLTextureView$GLThread gLTextureView$GLThread) {
        try {
            gLTextureView$GLThread.com_bef_effectsdk_GLTextureView$GLThread__run$___twin___();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public void queueEvent(Runnable runnable) {
        if (runnable != null) {
            GLTextureView$GLThreadManager gLTextureView$GLThreadManager = TextureViewSurfaceTextureListenerC1287510jbp.sGLThreadManager;
            synchronized (gLTextureView$GLThreadManager) {
                try {
                    this.mEventQueue.add(runnable);
                    gLTextureView$GLThreadManager.notifyAll();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        throw new IllegalArgumentException("r must not be null");
    }

    public void setRenderMode(int i) {
        if (i >= 0 && i <= 1) {
            GLTextureView$GLThreadManager gLTextureView$GLThreadManager = TextureViewSurfaceTextureListenerC1287510jbp.sGLThreadManager;
            synchronized (gLTextureView$GLThreadManager) {
                try {
                    this.mRenderMode = i;
                    gLTextureView$GLThreadManager.notifyAll();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        throw new IllegalArgumentException("renderMode");
    }

    public void onWindowResize(int i, int i2) {
        GLTextureView$GLThreadManager gLTextureView$GLThreadManager = TextureViewSurfaceTextureListenerC1287510jbp.sGLThreadManager;
        synchronized (gLTextureView$GLThreadManager) {
            try {
                this.mWidth = i;
                this.mHeight = i2;
                this.mSizeChanged = true;
                this.mRequestRender = true;
                this.mRenderComplete = false;
                gLTextureView$GLThreadManager.notifyAll();
                while (!this.mExited && !this.mPaused && !this.mRenderComplete && ableToDraw()) {
                    try {
                        TextureViewSurfaceTextureListenerC1287510jbp.sGLThreadManager.wait();
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C786410Ut5.u3().interrupt();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
