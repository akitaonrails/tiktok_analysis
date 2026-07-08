package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import ci3.a;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: X.0VXF, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VXF extends a {
    public static volatile C0VXF LLILZ;
    public final Queue<C0VXG> LL;
    public Handler LLILLJJLI;
    public int LLILLL;

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
        try {
            bpea_origin_onLooperPrepared();
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (zLJ) {
                C0W9U.LJFF();
            }
            throw th;
        }
    }

    public C0VXF() {
        super("npth-worker");
        this.LL = new ConcurrentLinkedQueue();
    }

    public static C0VXF LIZIZ() {
        if (LLILZ == null) {
            synchronized (C0VXF.class) {
                try {
                    if (LLILZ == null) {
                        LLILZ = new C0VXF();
                        LLILZ.start();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LLILZ;
    }

    public final void bpea_origin_onLooperPrepared() {
        super.onLooperPrepared();
        this.LLILLJJLI = new Handler(Looper.myLooper());
        synchronized (this.LL) {
            while (!((ConcurrentLinkedQueue) this.LL).isEmpty()) {
                try {
                    C0VXG c0vxg = (C0VXG) ((ConcurrentLinkedQueue) this.LL).poll();
                    if (c0vxg != null) {
                        try {
                            C786410Ut5.LJLJL(this.LLILLJJLI, Message.obtain(this.LLILLJJLI, c0vxg.LIZ), c0vxg.LIZIZ);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        while (true) {
            try {
                Looper.loop();
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                try {
                    int i = this.LLILLL;
                    if (i <= 5) {
                        C801940Vd2.LIZIZ(i == 5 ? "NPTH_ERR_MAX" : "NPTH_CATCH", th3);
                    }
                    this.LLILLL++;
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                }
            }
        }
    }

    public static void post(Runnable runnable) {
        C0VXF c0vxfLIZIZ = LIZIZ();
        c0vxfLIZIZ.getClass();
        c0vxfLIZIZ.LIZJ(SystemClock.uptimeMillis() + 0, runnable);
    }

    public static void removeCallbacks(Runnable runnable) {
        C0VXF c0vxfLIZIZ = LIZIZ();
        synchronized (c0vxfLIZIZ.LL) {
            try {
                Iterator it2 = ((ConcurrentLinkedQueue) c0vxfLIZIZ.LL).iterator();
                while (it2.hasNext()) {
                    if (((C0VXG) it2.next()).LIZ.equals(runnable)) {
                        it2.remove();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Handler handler = c0vxfLIZIZ.LLILLJJLI;
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
    }

    public static void postDelayed(Runnable runnable, long j) {
        C0VXF c0vxfLIZIZ = LIZIZ();
        c0vxfLIZIZ.getClass();
        if (j < 0) {
            j = 0;
        }
        c0vxfLIZIZ.LIZJ(SystemClock.uptimeMillis() + j, runnable);
    }

    public final void LIZJ(long j, Runnable runnable) {
        if (this.LLILLJJLI == null) {
            synchronized (this.LL) {
                try {
                    if (this.LLILLJJLI == null) {
                        ((ConcurrentLinkedQueue) this.LL).add(new C0VXG(j, runnable));
                        return;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C786410Ut5.LJLJL(this.LLILLJJLI, Message.obtain(this.LLILLJJLI, runnable), j);
    }
}
