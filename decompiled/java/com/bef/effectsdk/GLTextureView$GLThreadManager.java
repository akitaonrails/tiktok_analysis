package com.bef.effectsdk;

import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes21.dex */
public class GLTextureView$GLThreadManager {
    public static String TAG = "GLThreadManager";
    public GLTextureView$GLThread mEglOwner;
    public boolean mGLESDriverCheckComplete;
    public int mGLESVersion;
    public boolean mGLESVersionCheckComplete;
    public boolean mLimitedGLESContexts;
    public boolean mMultipleGLESContextsAllowed;

    public synchronized boolean shouldReleaseEGLContextWhenPausing() {
        return this.mLimitedGLESContexts;
    }

    public synchronized boolean shouldTerminateEGLWhenPausing() {
        checkGLESVersion();
        return !this.mMultipleGLESContextsAllowed;
    }

    private void checkGLESVersion() {
        if (this.mGLESVersionCheckComplete) {
            return;
        }
        this.mMultipleGLESContextsAllowed = true;
        this.mGLESVersionCheckComplete = true;
    }

    public GLTextureView$GLThreadManager() {
    }

    public synchronized void checkGLDriver(GL10 gl10) {
        boolean z;
        if (!this.mGLESDriverCheckComplete) {
            checkGLESVersion();
            String strGlGetString = gl10.glGetString(7937);
            boolean z2 = false;
            if (this.mGLESVersion < 131072) {
                if (!strGlGetString.startsWith("Q3Dimension MSM7500 ")) {
                    z = true;
                } else {
                    z = false;
                }
                this.mMultipleGLESContextsAllowed = z;
                notifyAll();
            }
            if (!this.mMultipleGLESContextsAllowed) {
                z2 = true;
            }
            this.mLimitedGLESContexts = z2;
            this.mGLESDriverCheckComplete = true;
        }
    }

    public void releaseEglContextLocked(GLTextureView$GLThread gLTextureView$GLThread) {
        if (this.mEglOwner == gLTextureView$GLThread) {
            this.mEglOwner = null;
        }
        notifyAll();
    }

    public synchronized void threadExiting(GLTextureView$GLThread gLTextureView$GLThread) {
        gLTextureView$GLThread.mExited = true;
        if (this.mEglOwner == gLTextureView$GLThread) {
            this.mEglOwner = null;
        }
        notifyAll();
    }

    public boolean tryAcquireEglContextLocked(GLTextureView$GLThread gLTextureView$GLThread) {
        GLTextureView$GLThread gLTextureView$GLThread2 = this.mEglOwner;
        if (gLTextureView$GLThread2 != gLTextureView$GLThread && gLTextureView$GLThread2 != null) {
            checkGLESVersion();
            if (this.mMultipleGLESContextsAllowed) {
                return true;
            }
            GLTextureView$GLThread gLTextureView$GLThread3 = this.mEglOwner;
            if (gLTextureView$GLThread3 != null) {
                gLTextureView$GLThread3.requestReleaseEglContextLocked();
                return false;
            }
            return false;
        }
        this.mEglOwner = gLTextureView$GLThread;
        notifyAll();
        return true;
    }
}
