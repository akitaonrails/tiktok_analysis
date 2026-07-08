package X;

import android.os.Handler;
import android.os.Message;
import com.ss.ttlivestreamer.core.opengl.GLThread;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0jLv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1277650jLv {
    public final Handler LIZ;
    public final InterfaceC1279210jOR LIZIZ;
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public final long LIZLLL;
    public final int LJ;
    public boolean LJFF;

    public final void LIZ() {
        if (this.LIZJ.get()) {
            System.currentTimeMillis();
            this.LIZJ.set(false);
            InterfaceC1279210jOR interfaceC1279210jOR = this.LIZIZ;
            if (interfaceC1279210jOR != null) {
                interfaceC1279210jOR.LJI();
            }
        }
    }

    public C1277650jLv(GLThread gLThread, Handler handler, InterfaceC1279210jOR interfaceC1279210jOR) {
        System.currentTimeMillis();
        this.LIZLLL = 200L;
        this.LJ = 101;
        this.LIZ = handler;
        this.LIZIZ = interfaceC1279210jOR;
        if (gLThread != null) {
            gLThread.setHandlerCallback(new Handler.Callback() { // from class: X.0jM2
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    C1277650jLv c1277650jLv = this.LL;
                    C1C7U.LIZ("LyraxRenderStallMonitor@6f2f.<init>$1L");
                    if (message.what == c1277650jLv.LJ) {
                        InterfaceC1279210jOR interfaceC1279210jOR2 = c1277650jLv.LIZIZ;
                        if (interfaceC1279210jOR2 != null) {
                            interfaceC1279210jOR2.LJIIJ();
                        }
                        c1277650jLv.LIZJ.set(true);
                        c1277650jLv.LJFF = false;
                    }
                    return true;
                }
            });
        }
    }
}
