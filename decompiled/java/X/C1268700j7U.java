package X;

import android.os.Handler;
import com.ss.ttlivestreamer.core.opengl.GLThread;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;

/* JADX INFO: renamed from: X.0j7U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1268700j7U implements InterfaceC1272840jEA {
    public SafeHandlerThread LL;
    public Handler LLILLJJLI;
    public GLThread LLILLL;
    public Handler LLILZ;
    public GLThread LLILZIL;
    public Handler LLILZLL;

    public final synchronized Handler LIZ() {
        Handler handler;
        handler = this.LLILZ;
        if (handler == null) {
            GLThread gLThreadLIZ = C1271160jBS.LIZ(EnumC1270220j9w.VIDEO_CAPTURE, "LiveCoreVideoCaptureThread");
            gLThreadLIZ.start();
            handler = gLThreadLIZ.getHandler();
            this.LLILZ = handler;
            this.LLILLL = gLThreadLIZ;
        }
        return handler;
    }

    public final synchronized Handler LIZIZ() {
        Handler handler;
        handler = this.LLILZLL;
        if (handler == null) {
            GLThread gLThreadLIZ = C1271160jBS.LIZ(EnumC1270220j9w.COMMON_GL, "TTLHCommonGLThread");
            gLThreadLIZ.start();
            handler = gLThreadLIZ.getHandler();
            this.LLILZLL = handler;
            this.LLILZIL = gLThreadLIZ;
        }
        return handler;
    }

    public final synchronized SafeHandlerThread LIZJ() {
        SafeHandlerThread safeHandlerThreadLIZIZ;
        safeHandlerThreadLIZIZ = this.LL;
        if (safeHandlerThreadLIZIZ == null) {
            safeHandlerThreadLIZIZ = C1271160jBS.LIZIZ();
            safeHandlerThreadLIZIZ.start();
            this.LL = safeHandlerThreadLIZIZ;
        }
        return safeHandlerThreadLIZIZ;
    }

    public final synchronized Handler LIZLLL() {
        Handler handler;
        handler = this.LLILLJJLI;
        if (handler == null) {
            handler = LIZJ().getHandler();
            this.LLILLJJLI = handler;
        }
        return handler;
    }

    @Override // X.InterfaceC1272840jEA
    public final synchronized void onRelease() {
        SafeHandlerThread safeHandlerThread = this.LL;
        if (safeHandlerThread != null) {
            C1273730jFb.LIZLLL(safeHandlerThread);
            this.LL = null;
            this.LLILLJJLI = null;
        }
        GLThread gLThread = this.LLILLL;
        if (gLThread != null) {
            C1273730jFb.LIZLLL(gLThread);
            this.LLILLL = null;
            this.LLILZ = null;
        }
        GLThread gLThread2 = this.LLILZIL;
        if (gLThread2 != null) {
            C1273730jFb.LIZLLL(gLThread2);
            this.LLILZIL = null;
            this.LLILZLL = null;
        }
    }
}
