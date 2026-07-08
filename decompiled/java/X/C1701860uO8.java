package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0uO8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1701860uO8 extends C11RN {
    public final PriorityBlockingQueue<C1701880uOA> LL = new PriorityBlockingQueue<>();
    public final AtomicInteger LLILLJJLI = new AtomicInteger();
    public final AtomicInteger LLILLL = new AtomicInteger();
    public volatile boolean LLILZ;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLILZ = true;
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILZ;
    }

    @Override // X.C11RN
    public final InterfaceC420801kM LIZIZ(Runnable runnable) {
        return LJ(C11RN.LIZ(TimeUnit.MILLISECONDS), runnable);
    }

    public final InterfaceC420801kM LJ(long j, Runnable runnable) {
        if (this.LLILZ) {
            return C11JT.INSTANCE;
        }
        final C1701880uOA c1701880uOA = new C1701880uOA(runnable, Long.valueOf(j), this.LLILLL.incrementAndGet());
        this.LL.add(c1701880uOA);
        if (this.LLILLJJLI.getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!this.LLILZ) {
                C1701880uOA c1701880uOAPoll = this.LL.poll();
                if (c1701880uOAPoll == null) {
                    iAddAndGet = this.LLILLJJLI.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return C11JT.INSTANCE;
                    }
                } else if (!c1701880uOAPoll.LLILZ) {
                    c1701880uOAPoll.LL.run();
                }
            }
            this.LL.clear();
            return C11JT.INSTANCE;
        }
        return new C11LO(new Runnable(c1701880uOA) { // from class: X.0uO9
            public final C1701880uOA LL;

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.LL.LLILZ = true;
                    this.LLILLJJLI.LL.remove(this.LL);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }

            {
                this.LL = c1701880uOA;
            }
        });
    }

    @Override // X.C11RN
    public final InterfaceC420801kM LIZJ(final Runnable runnable, long j, TimeUnit timeUnit) {
        final long jLIZ = C11RN.LIZ(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
        return LJ(jLIZ, new Runnable(runnable, this, jLIZ) { // from class: X.0uO7
            public final Runnable LL;
            public final C1701860uO8 LLILLJJLI;
            public final long LLILLL;

            public final void LIZ() {
                if (this.LLILLJJLI.LLILZ) {
                    return;
                }
                C1701860uO8 c1701860uO8 = this.LLILLJJLI;
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                c1701860uO8.getClass();
                long jLIZ2 = C11RN.LIZ(timeUnit2);
                long j2 = this.LLILLL;
                if (j2 > jLIZ2) {
                    try {
                        Thread.sleep(j2 - jLIZ2);
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C786410Ut5.u3().interrupt();
                        C19489211Ms.LIZIZ(e);
                        return;
                    }
                }
                if (this.LLILLJJLI.LLILZ) {
                    return;
                }
                this.LL.run();
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    LIZ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }

            {
                this.LL = runnable;
                this.LLILLJJLI = this;
                this.LLILLL = jLIZ;
            }
        });
    }
}
