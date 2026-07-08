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

/* JADX INFO: renamed from: X.0V3G, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V3G {
    public static final C0V3H LJFF = new C0V3H();
    public static final C0V3I LJI = new C0V3I();
    public final C0V3E LIZ;
    public volatile Handler LIZLLL;
    public final Queue<C0V3J> LIZIZ = new ConcurrentLinkedQueue();
    public final Queue<Message> LIZJ = new ConcurrentLinkedQueue();
    public final Object LJ = new Object();

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0V3E] */
    public C0V3G(final String str) {
        this.LIZ = new a(str) { // from class: X.0V3E
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
                final C0V3G c0v3g = this.LL;
                C786410Ut5.LJJZZIII(handler, new Runnable() { // from class: X.0V3F
                    public final void LIZ() {
                        while (!((ConcurrentLinkedQueue) c0v3g.LIZJ).isEmpty()) {
                            synchronized (c0v3g.LJ) {
                                try {
                                    if (c0v3g.LIZLLL != null) {
                                        C786410Ut5.LJLJJLL(c0v3g.LIZLLL, (Message) ((ConcurrentLinkedQueue) c0v3g.LIZJ).poll());
                                    }
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    throw th2;
                                }
                            }
                        }
                        LIZIZ();
                    }

                    public final void LIZIZ() {
                        while (!((ConcurrentLinkedQueue) c0v3g.LIZIZ).isEmpty()) {
                            synchronized (c0v3g.LJ) {
                                try {
                                    C0V3J c0v3j = (C0V3J) ((ConcurrentLinkedQueue) c0v3g.LIZIZ).poll();
                                    if (c0v3g.LIZLLL != null) {
                                        C786410Ut5.LJLJL(c0v3g.LIZLLL, c0v3j.LIZ, c0v3j.LIZIZ);
                                    }
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    throw th2;
                                }
                            }
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("ThreadWithHandler$CheckCacheRunnable@70bd.run");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("ThreadWithHandler$CheckCacheRunnable@70bd.run");
                    }
                });
                while (true) {
                    try {
                        Looper.loop();
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C0V38.LIZ.LIZ(th2);
                    }
                }
            }
        };
    }

    public final void LIZ(Runnable runnable) {
        if (!((ConcurrentLinkedQueue) this.LIZIZ).isEmpty() || !((ConcurrentLinkedQueue) this.LIZJ).isEmpty()) {
            Iterator it2 = ((ConcurrentLinkedQueue) this.LIZIZ).iterator();
            while (it2.hasNext()) {
                if (C0V3H.LIZ(it2.next(), runnable)) {
                    it2.remove();
                }
            }
            Iterator it3 = ((ConcurrentLinkedQueue) this.LIZJ).iterator();
            while (it3.hasNext()) {
                if (C0V3I.LIZ(it3.next(), runnable)) {
                    it3.remove();
                }
            }
        }
        if (this.LIZLLL != null) {
            this.LIZLLL.removeCallbacks(runnable);
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
                        ((ConcurrentLinkedQueue) this.LIZIZ).add(new C0V3J(message, jUptimeMillis));
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
