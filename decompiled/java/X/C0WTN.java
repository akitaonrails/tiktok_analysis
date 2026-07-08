package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0WTN, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WTN implements ScheduledExecutorService, InterfaceC823860WTo {
    public final ScheduledExecutorService LL;
    public final C0WTP LLILLJJLI;
    public final String LLILLL = "scheduled";
    public final AtomicInteger LLILZ = new AtomicInteger(0);
    public final AtomicInteger LLILZIL;
    public final AtomicInteger LLILZLL;

    @Override // X.InterfaceC823860WTo
    public final int LIZ() {
        ThreadPoolExecutor threadPoolExecutor;
        Executor executor = this.LL;
        if (!(executor instanceof ThreadPoolExecutor) || (threadPoolExecutor = (ThreadPoolExecutor) executor) == null) {
            return 0;
        }
        return threadPoolExecutor.getActiveCount();
    }

    @Override // X.InterfaceC823860WTo
    public final Pair<Integer, Integer> LIZIZ() {
        return new Pair<>(Integer.valueOf(this.LLILZIL.get()), Integer.valueOf(this.LLILZLL.get()));
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.LL.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.LL.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.LL.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.LL.shutdownNow();
    }

    @Override // X.InterfaceC823860WTo
    public final String LIZLLL() {
        return this.LLILLL;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.LL.execute(LJFF(this, runnable, this.LLILLJJLI));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(collection, 10));
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(submit((Callable) it2.next()));
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            try {
                ((Future) it3.next()).get();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return arrayList;
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws Exception {
        ArrayList<Future> arrayList = new ArrayList(C15438062q.LJIJJ(collection, 10));
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(submit((Callable) it2.next()));
        }
        try {
            Iterator it3 = arrayList.iterator();
            Exception exc = null;
            while (it3.hasNext()) {
                try {
                    T t = (T) ((Future) it3.next()).get();
                    for (Future future : arrayList) {
                        if (!future.isDone()) {
                            future.cancel(true);
                        }
                    }
                    return t;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (exc == null) {
                        exc = e;
                    }
                }
            }
            if (exc == null) {
                throw new Exception("All tasks failed");
            }
            throw exc;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            for (Future future2 : arrayList) {
                if (!future2.isDone()) {
                    future2.cancel(true);
                }
            }
            throw th;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        FutureTask futureTask = new FutureTask(runnable, null);
        this.LL.execute(LJFF(this, futureTask, this.LLILLJJLI));
        return futureTask;
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        this.LL.execute(LJFF(this, futureTask, this.LLILLJJLI));
        return futureTask;
    }

    public C0WTN(C822660WOy c822660WOy, C0WTP c0wtp) {
        this.LL = c822660WOy;
        this.LLILLJJLI = c0wtp;
        new ConcurrentHashMap();
        this.LLILZIL = new AtomicInteger(0);
        this.LLILZLL = new AtomicInteger(0);
        synchronized (C823800WTi.LJ) {
            try {
                ((ArrayList) C823800WTi.LIZ).add(this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        try {
            return this.LL.awaitTermination(j, timeUnit);
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            C786410Ut5.u3().interrupt();
            return false;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t) {
        FutureTask futureTask = new FutureTask(runnable, t);
        this.LL.execute(LJFF(this, futureTask, this.LLILLJJLI));
        return futureTask;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0070 A[PHI: r1
      0x0070: PHI (r1v4 X.0WTP) = (r1v3 X.0WTP), (r1v5 X.0WTP), (r1v6 X.0WTP) binds: [B:19:0x005e, B:21:0x0066, B:23:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092 A[EDGE_INSN: B:33:0x0092->B:29:0x0092 BREAK  A[LOOP:1: B:12:0x003c->B:35:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0WTR LJFF(X.C0WTN r13, java.lang.Runnable r14, X.C0WTP r15) {
        /*
            r10 = 0
            java.util.concurrent.atomic.AtomicInteger r0 = r13.LLILZIL
            int r6 = r0.incrementAndGet()
        L7:
            java.util.concurrent.atomic.AtomicInteger r0 = r13.LLILZLL
            int r0 = r0.get()
            long r2 = (long) r0
            long r4 = (long) r6
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1c
            java.util.concurrent.atomic.AtomicInteger r1 = r13.LLILZLL
            int r0 = (int) r2
            boolean r0 = r1.compareAndSet(r0, r6)
            if (r0 == 0) goto L7
        L1c:
            X.0WTR r5 = new X.0WTR
            X.0WTW r0 = X.C0WTW.LIZ
            r0.getClass()
            com.bytedance.android.livesdk.livesetting.performance.LiveThreadPoolOptSetting$ThreadPoolOptConfig r4 = X.C0WTW.LJIIIZ()
            java.util.List<java.lang.String> r1 = r4.priorityWhitelist
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L92
            java.lang.String r3 = r13.LLILLL
            boolean r0 = r1.isEmpty()
            r2 = 0
            if (r0 != 0) goto L92
            java.util.Iterator r1 = r1.iterator()
        L3c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = kotlin.text.a0.LJJIIZI(r3, r0, r2)
            if (r0 == 0) goto L3c
            int r2 = r4.promoteToPriority
            X.0WTP r6 = X.C0WTP.HIGH
            int r0 = r6.getValue()
            if (r2 == r0) goto L71
            X.0WTP r1 = X.C0WTP.NORMAL
            int r0 = r1.getValue()
            if (r2 == r0) goto L70
            X.0WTP r1 = X.C0WTP.LOW
            int r0 = r1.getValue()
            if (r2 == r0) goto L70
            X.0WTP r1 = X.C0WTP.BACKGROUND
            int r0 = r1.getValue()
            if (r2 != r0) goto L71
        L70:
            r6 = r1
        L71:
            int r1 = r6.getValue()
            int r0 = r15.getValue()
            if (r1 >= r0) goto L92
        L7b:
            java.util.concurrent.atomic.AtomicInteger r0 = r13.LLILZ
            int r0 = r0.incrementAndGet()
            long r8 = (long) r0
            java.lang.String r11 = r13.LLILLL
            kotlin.jvm.internal.AwS557S0100000_13 r12 = new kotlin.jvm.internal.AwS557S0100000_13
            r0 = 183(0xb7, float:2.56E-43)
            r12.<init>(r13, r0)
            r13 = 16
            r7 = r14
            r5.<init>(r6, r7, r8, r10, r11, r12, r13)
            return r5
        L92:
            r6 = r15
            goto L7b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WTN.LJFF(X.0WTN, java.lang.Runnable, X.0WTP):X.0WTR");
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        long jNanoTime = System.nanoTime() + timeUnit.toNanos(j);
        ArrayList<Future> arrayList = new ArrayList(C15438062q.LJIJJ(collection, 10));
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(submit((Callable) it2.next()));
        }
        for (Future future : arrayList) {
            long jNanoTime2 = jNanoTime - System.nanoTime();
            if (jNanoTime2 > 0) {
                try {
                    future.get(jNanoTime2, TimeUnit.NANOSECONDS);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    @Override // java.util.concurrent.ExecutorService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> r13, long r14, java.util.concurrent.TimeUnit r16) throws java.lang.Exception {
        /*
            r12 = this;
            long r10 = java.lang.System.nanoTime()
            r0 = r16
            long r0 = r0.toNanos(r14)
            long r10 = r10 + r0
            java.util.ArrayList r7 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r13, r0)
            r7.<init>(r0)
            java.util.Iterator r1 = r13.iterator()
        L1a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r1.next()
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
            java.util.concurrent.Future r0 = r12.submit(r0)
            r7.add(r0)
            goto L1a
        L2e:
            r4 = 1
            java.util.Iterator r9 = r7.iterator()     // Catch: java.lang.Throwable -> L7e
            r8 = 0
        L34:
            boolean r0 = r9.hasNext()     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L76
            java.lang.Object r3 = r9.next()     // Catch: java.lang.Throwable -> L7e
            java.util.concurrent.Future r3 = (java.util.concurrent.Future) r3     // Catch: java.lang.Throwable -> L7e
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L7e
            long r1 = r10 - r5
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L76
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L7e
            java.lang.Object r3 = r3.get(r1, r0)     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L7e
            goto L5b
        L53:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7e
            if (r8 != 0) goto L34
            r8 = r0
            goto L34
        L5b:
            java.util.Iterator r2 = r7.iterator()
        L5f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r1 = r2.next()
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            boolean r0 = r1.isDone()
            if (r0 != 0) goto L5f
            r1.cancel(r4)
            goto L5f
        L75:
            return r3
        L76:
            if (r8 != 0) goto L7d
            java.util.concurrent.TimeoutException r8 = new java.util.concurrent.TimeoutException     // Catch: java.lang.Throwable -> L7e
            r8.<init>()     // Catch: java.lang.Throwable -> L7e
        L7d:
            throw r8     // Catch: java.lang.Throwable -> L7e
        L7e:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L7e
            java.util.Iterator r2 = r7.iterator()
        L86:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L9c
            java.lang.Object r1 = r2.next()
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            boolean r0 = r1.isDone()
            if (r0 != 0) goto L86
            r1.cancel(r4)
            goto L86
        L9c:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WTN.invokeAny(java.util.Collection, long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        final FutureTask futureTask = new FutureTask(callable);
        final ScheduledFuture<?> scheduledFutureSchedule = this.LL.schedule(LJFF(this, futureTask, this.LLILLJJLI), j, timeUnit);
        return new ScheduledFuture<V>() { // from class: X.0WTM
            @Override // java.util.concurrent.Future
            public final V get() throws ExecutionException, InterruptedException {
                try {
                    return futureTask.get();
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C786410Ut5.u3().interrupt();
                    throw e;
                } catch (ExecutionException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    throw e2;
                }
            }

            @Override // java.util.concurrent.Future
            public final boolean isCancelled() {
                return futureTask.isCancelled() || scheduledFutureSchedule.isCancelled();
            }

            @Override // java.util.concurrent.Future
            public final boolean isDone() {
                return futureTask.isDone();
            }

            @Override // java.util.concurrent.Future
            public final boolean cancel(boolean z) {
                boolean zCancel = futureTask.cancel(z);
                boolean zCancel2 = scheduledFutureSchedule.cancel(z);
                if (!zCancel && !zCancel2) {
                    return false;
                }
                return true;
            }

            @Override // java.lang.Comparable
            public final int compareTo(Delayed delayed) {
                return scheduledFutureSchedule.compareTo(delayed);
            }

            @Override // java.util.concurrent.Delayed
            public final long getDelay(TimeUnit timeUnit2) {
                return scheduledFutureSchedule.getDelay(timeUnit2);
            }

            @Override // java.util.concurrent.Future
            public final V get(long j2, TimeUnit timeUnit2) throws ExecutionException, InterruptedException, TimeoutException {
                try {
                    return futureTask.get(j2, timeUnit2);
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C786410Ut5.u3().interrupt();
                    throw e;
                } catch (ExecutionException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    throw e2;
                } catch (TimeoutException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    throw e3;
                }
            }
        };
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.LL.schedule(LJFF(this, runnable, this.LLILLJJLI), j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.LL.scheduleAtFixedRate(LJFF(this, runnable, this.LLILLJJLI), j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.LL.scheduleWithFixedDelay(LJFF(this, runnable, this.LLILLJJLI), j, j2, timeUnit);
    }
}
