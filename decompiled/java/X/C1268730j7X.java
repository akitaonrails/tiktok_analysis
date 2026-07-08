package X;

import Y.ARunnableS109S0100000_9;
import android.os.Handler;
import com.ss.ttlivestreamer.core.opengl.GLThread;

/* JADX INFO: renamed from: X.0j7X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1268730j7X implements InterfaceC1272840jEA {
    public final Handler LL;

    @Override // X.InterfaceC1272840jEA
    public final void onRelease() {
        Handler handler = this.LL;
        if (handler == null) {
            return;
        }
        C786410Ut5.LJJZZIII(handler, new ARunnableS109S0100000_9(handler, 128));
    }

    public C1268730j7X() {
        GLThread gLThreadLIZ = C1273730jFb.LIZ(0, "util_gl_thread");
        gLThreadLIZ.start();
        this.LL = gLThreadLIZ.getHandler();
    }
}
