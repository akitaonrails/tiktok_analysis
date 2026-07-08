package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0jXA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class RunnableC1284620jXA implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] LLIZ = {12352, 4, 12339, 1, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12344};
    public final Handler LL;
    public final int[] LLILLJJLI = new int[1];
    public EGLDisplay LLILLL;
    public EGLContext LLILZ;
    public EGLSurface LLILZIL;
    public SurfaceTexture LLILZLL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("EGLSurfaceTexture@428a.run");
        try {
            SurfaceTexture surfaceTexture = this.LLILZLL;
            if (surfaceTexture != null) {
                surfaceTexture.updateTexImage();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EGLSurfaceTexture@428a.run");
    }

    public RunnableC1284620jXA(BPEAHandler bPEAHandler) {
        this.LL = bPEAHandler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        C786410Ut5.LJJZZIII(this.LL, this);
    }
}
