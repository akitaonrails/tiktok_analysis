package X;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11SA, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11SA extends C11RO {
    public static final ThreadFactoryC1301810jyt LIZLLL;
    public static final ThreadFactoryC1301810jyt LJ;
    public static final C11SD LJII;
    public static final C11SB LJIIIIZZ;
    public final ThreadFactory LIZIZ = LIZLLL;
    public final AtomicReference<C11SB> LIZJ;
    public static final TimeUnit LJI = TimeUnit.SECONDS;
    public static final long LJFF = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    static {
        C11SD c11sd = new C11SD(new ThreadFactoryC1301810jyt("RxCachedThreadSchedulerShutdown"));
        LJII = c11sd;
        c11sd.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        LIZLLL = new ThreadFactoryC1301810jyt("RxCachedThreadScheduler", iMax);
        LJ = new ThreadFactoryC1301810jyt("RxCachedWorkerPoolEvictor", iMax);
        C11SB c11sb = new C11SB(0L, null, LIZLLL);
        LJIIIIZZ = c11sb;
        c11sb.LLILLL.dispose();
        Future<?> future = c11sb.LLILZIL;
        if (future != null) {
            future.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = c11sb.LLILZ;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public C11SA() {
        C11SB c11sb = LJIIIIZZ;
        AtomicReference<C11SB> atomicReference = new AtomicReference<>(c11sb);
        this.LIZJ = atomicReference;
        C11SB c11sb2 = new C11SB(LJFF, LJI, this.LIZIZ);
        while (!atomicReference.compareAndSet(c11sb, c11sb2)) {
            if (atomicReference.get() != c11sb) {
                c11sb2.LLILLL.dispose();
                Future<?> future = c11sb2.LLILZIL;
                if (future != null) {
                    future.cancel(true);
                }
                ScheduledExecutorService scheduledExecutorService = c11sb2.LLILZ;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    return;
                }
                return;
            }
        }
    }

    @Override // X.C11RO
    public final C11RN LIZ() {
        final C11SB c11sb = this.LIZJ.get();
        return new C11RN(c11sb) { // from class: X.11SC
            public final C11SB LLILLJJLI;
            public final C11SD LLILLL;
            public final AtomicBoolean LLILZ = new AtomicBoolean();
            public final C11NJ LL = new C11NJ();

            @Override // X.InterfaceC420801kM
            public final void dispose() {
                if (this.LLILZ.compareAndSet(false, true)) {
                    this.LL.dispose();
                    C11SB c11sb2 = this.LLILLJJLI;
                    C11SD c11sd = this.LLILLL;
                    c11sb2.getClass();
                    c11sd.LLILLL = System.nanoTime() + c11sb2.LL;
                    c11sb2.LLILLJJLI.offer(c11sd);
                }
            }

            @Override // X.InterfaceC420801kM
            public final boolean isDisposed() {
                return this.LLILZ.get();
            }

            {
                C11SD c11sd;
                this.LLILLJJLI = c11sb;
                if (!c11sb.LLILLL.LLILLJJLI) {
                    while (true) {
                        if (!c11sb.LLILLJJLI.isEmpty()) {
                            c11sd = c11sb.LLILLJJLI.poll();
                            if (c11sd != null) {
                                break;
                            }
                        } else {
                            c11sd = new C11SD(c11sb.LLILZLL);
                            c11sb.LLILLL.LIZ(c11sd);
                            break;
                        }
                    }
                } else {
                    c11sd = C11SA.LJII;
                }
                this.LLILLL = c11sd;
            }

            @Override // X.C11RN
            public final InterfaceC420801kM LIZJ(Runnable runnable, long j, TimeUnit timeUnit) {
                if (this.LL.LLILLJJLI) {
                    return C11JT.INSTANCE;
                }
                return this.LLILLL.LJ(runnable, j, timeUnit, this.LL);
            }
        };
    }
}
