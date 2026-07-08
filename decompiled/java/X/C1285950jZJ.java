package X;

import android.os.Handler;
import android.os.Looper;
import ci3.a;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: X.0jZJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1285950jZJ {
    public final Object LIZ = new Object();
    public final Queue<C1285960jZK> LIZIZ = new ConcurrentLinkedQueue();
    public final HandlerThreadC1285940jZI LIZJ = new a() { // from class: X.0jZI
        @Override // android.os.HandlerThread
        public final void onLooperPrepared() {
            boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
            try {
                bpea_origin_onLooperPrepared();
                if (zLJ) {
                    C0W9U.LJFF();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (zLJ) {
                    C0W9U.LJFF();
                }
                throw th;
            }
        }

        public final void bpea_origin_onLooperPrepared() {
            super.onLooperPrepared();
            Looper looper = getLooper();
            synchronized (this.LL.LIZ) {
                try {
                    this.LL.LIZLLL = new Handler(looper);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            while (!((ConcurrentLinkedQueue) this.LL.LIZIZ).isEmpty()) {
                C1285960jZK c1285960jZK = (C1285960jZK) ((ConcurrentLinkedQueue) this.LL.LIZIZ).poll();
                if (c1285960jZK != null) {
                    C786410Ut5.LJLIIL(c1285960jZK.LIZIZ, this.LL.LIZLLL, c1285960jZK.LIZ);
                }
            }
        }

        {
            super("DownloaderNotifyThread");
        }
    };
    public Handler LIZLLL;

    public final void LIZ(Runnable runnable, long j) {
        if (this.LIZLLL == null) {
            synchronized (this.LIZ) {
                try {
                    if (this.LIZLLL == null) {
                        ((ConcurrentLinkedQueue) this.LIZIZ).add(new C1285960jZK(runnable, j));
                        return;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C786410Ut5.LJLIIL(j, this.LIZLLL, runnable);
    }
}
