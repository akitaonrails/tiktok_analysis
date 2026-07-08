package X;

import Y.ARunnableS100S0200000_31;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.157R, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public abstract class C157R extends C157S {
    public boolean LLILLL;
    public ScheduledExecutorService LLILZ;
    public ScheduledFuture<?> LLILZIL;
    public final C13AX LLILLJJLI = C13AD.LIZIZ(C157R.class);
    public long LLILZLL = TimeUnit.SECONDS.toNanos(60);
    public boolean LLIZ = false;
    public final Object LLIZLLLIL = new Object();

    public abstract Collection<InterfaceC204578153g> LJIJJ();

    public final void LJIJ() {
        ScheduledExecutorService scheduledExecutorService = this.LLILZ;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.LLILZ = null;
        }
        ScheduledFuture<?> scheduledFuture = this.LLILZIL;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.LLILZIL = null;
        }
    }

    public final void LJIL() {
        synchronized (this.LLIZLLLIL) {
            try {
                if (this.LLILZLL <= 0) {
                    this.LLILLJJLI.trace("Connection lost timer deactivated");
                    return;
                }
                this.LLILLJJLI.trace("Connection lost timer started");
                this.LLIZ = true;
                LJIJJLI();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJJ() {
        synchronized (this.LLIZLLLIL) {
            try {
                if (this.LLILZ != null || this.LLILZIL != null) {
                    this.LLIZ = false;
                    this.LLILLJJLI.trace("Connection lost timer stopped");
                    LJIJ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIJJLI() {
        LJIJ();
        this.LLILZ = C807400Vlq.LJFF(new ThreadFactory() { // from class: X.0VH2
            public final ThreadFactory LL = Executors.defaultThreadFactory();
            public final AtomicInteger LLILLJJLI = new AtomicInteger(1);
            public final String LLILLL = "connectionLostChecker";

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread threadNewThread = this.LL.newThread(runnable);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LLILLL);
                sbLIZ.append("-");
                sbLIZ.append(this.LLILLJJLI);
                ThreadMethodProxy.setName(threadNewThread, C2188811AlT.LIZIZ(sbLIZ));
                return threadNewThread;
            }
        });
        ARunnableS100S0200000_31 aRunnableS100S0200000_31 = new ARunnableS100S0200000_31(this, 63);
        ScheduledExecutorService scheduledExecutorService = this.LLILZ;
        long j = this.LLILZLL;
        this.LLILZIL = scheduledExecutorService.scheduleAtFixedRate(aRunnableS100S0200000_31, j, j, TimeUnit.NANOSECONDS);
    }

    public final void LJIJI(InterfaceC204578153g interfaceC204578153g, long j) {
        if (!(interfaceC204578153g instanceof C16D0)) {
            return;
        }
        C16D0 c16d0 = (C16D0) interfaceC204578153g;
        if (c16d0.LLJJIJI < j) {
            this.LLILLJJLI.trace("Closing connection due to no pong received: {}", c16d0);
            c16d0.LJ(1006, "The connection was closed because the other endpoint did not respond with a pong in time. For more information check: https://github.com/TooTallNate/Java-WebSocket/wiki/Lost-connection-detection", false);
        } else {
            if (c16d0.isOpen()) {
                C157S c157s = (C157S) c16d0.LLILZ;
                if (c157s.LL == null) {
                    c157s.LL = new C16DQ();
                }
                C16DQ c16dq = c157s.LL;
                if (c16dq != null) {
                    c16d0.LJIILIIL(Collections.singletonList(c16dq));
                    return;
                }
                throw new NullPointerException("onPreparePing(WebSocket) returned null. PingFrame to sent can't be null.");
            }
            this.LLILLJJLI.trace("Trying to ping a non open connection: {}", c16d0);
        }
    }
}
