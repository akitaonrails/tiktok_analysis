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

/* JADX INFO: renamed from: X.0VD0, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VD0 {
    public static final C0VD3 LJFF = new C0VD3();
    public static final C0VD4 LJI = new C0VD4();
    public volatile Handler LIZLLL;
    public final Queue<C0VD5> LIZIZ = new ConcurrentLinkedQueue();
    public final Queue<Message> LIZJ = new ConcurrentLinkedQueue();
    public final Object LJ = new Object();
    public final C0VD1 LIZ = new a() { // from class: X.0VD1
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

        public final void bpea_origin_onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (this.LL.LJ) {
                try {
                    this.LL.LIZLLL = new Handler();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            Handler handler = this.LL.LIZLLL;
            final C0VD0 c0vd0 = this.LL;
            C786410Ut5.LJJZZIII(handler, new Runnable() { // from class: X.0VD2
                public final void LIZ() {
                    while (!((ConcurrentLinkedQueue) c0vd0.LIZJ).isEmpty()) {
                        if (c0vd0.LIZLLL != null) {
                            C786410Ut5.LJLJJLL(c0vd0.LIZLLL, (Message) ((ConcurrentLinkedQueue) c0vd0.LIZJ).poll());
                        }
                    }
                    while (!((ConcurrentLinkedQueue) c0vd0.LIZIZ).isEmpty()) {
                        C0VD5 c0vd5 = (C0VD5) ((ConcurrentLinkedQueue) c0vd0.LIZIZ).poll();
                        if (c0vd0.LIZLLL != null) {
                            C786410Ut5.LJLJL(c0vd0.LIZLLL, c0vd5.LIZ, c0vd5.LIZIZ);
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ThreadWithHandler$CheckCacheRunnable@afc.run");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ThreadWithHandler$CheckCacheRunnable@afc.run");
                }
            });
            while (true) {
                try {
                    Looper.loop();
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
        }

        {
            super("AsyncEventManager-Thread");
        }
    };

    public final void LIZ(RunnableC794000VCs runnableC794000VCs) {
        if (!((ConcurrentLinkedQueue) this.LIZIZ).isEmpty() || !((ConcurrentLinkedQueue) this.LIZJ).isEmpty()) {
            Iterator it2 = ((ConcurrentLinkedQueue) this.LIZIZ).iterator();
            while (it2.hasNext()) {
                if (C0VD3.LIZ(it2.next(), runnableC794000VCs)) {
                    it2.remove();
                }
            }
            Iterator it3 = ((ConcurrentLinkedQueue) this.LIZJ).iterator();
            while (it3.hasNext()) {
                if (C0VD4.LIZ(it3.next(), runnableC794000VCs)) {
                    it3.remove();
                }
            }
        }
        if (this.LIZLLL != null) {
            this.LIZLLL.removeCallbacks(runnableC794000VCs);
        }
    }

    public final boolean LIZIZ(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() + j;
        if (this.LIZLLL == null) {
            synchronized (this.LJ) {
                try {
                    if (this.LIZLLL == null) {
                        ((ConcurrentLinkedQueue) this.LIZIZ).add(new C0VD5(message, jUptimeMillis));
                        return true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return C786410Ut5.LJLJL(this.LIZLLL, message, jUptimeMillis);
    }
}
