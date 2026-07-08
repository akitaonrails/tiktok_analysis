package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: renamed from: X.0WTO, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WTO implements ExecutorService, InterfaceC823860WTo {
    public final ExecutorService LL;
    public final C0WTP LLILLJJLI;
    public final String LLILLL;
    public final AtomicInteger LLILZ = new AtomicInteger(0);
    public final AtomicInteger LLILZIL;
    public final AtomicInteger LLILZLL;

    @Override // X.InterfaceC823860WTo
    public final int LIZ() {
        ThreadPoolExecutor threadPoolExecutor;
        ExecutorService executorService = this.LL;
        if (!(executorService instanceof ThreadPoolExecutor) || (threadPoolExecutor = (ThreadPoolExecutor) executorService) == null) {
            return 0;
        }
        return threadPoolExecutor.getActiveCount();
    }

    @Override // X.InterfaceC823860WTo
    public final Pair<Integer, Integer> LIZIZ() {
        return new Pair<>(Integer.valueOf(this.LLILZIL.get()), Integer.valueOf(this.LLILZLL.get()));
    }

    public final void LJI() {
        long j;
        int iIncrementAndGet = this.LLILZIL.incrementAndGet();
        do {
            j = this.LLILZLL.get();
            if (iIncrementAndGet <= j) {
                return;
            }
        } while (!this.LLILZLL.compareAndSet((int) j, iIncrementAndGet));
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
        C0WTP c0wtpLJFF = LJFF(this, this.LLILLJJLI);
        LJI();
        this.LL.execute(new C0WTR(c0wtpLJFF, runnable, this.LLILZ.incrementAndGet(), null, this.LLILLL, new AwS557S0100000_13(this, 179), 24));
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
        C0WTP c0wtpLJFF = LJFF(this, this.LLILLJJLI);
        LJI();
        this.LL.execute(new C0WTR(c0wtpLJFF, futureTask, this.LLILZ.incrementAndGet(), null, this.LLILLL, new AwS557S0100000_13(this, 182), 24));
        return futureTask;
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        C0WTP c0wtpLJFF = LJFF(this, this.LLILLJJLI);
        LJI();
        this.LL.execute(new C0WTR(c0wtpLJFF, futureTask, this.LLILZ.incrementAndGet(), null, this.LLILLL, new AwS557S0100000_13(this, 180), 24));
        return futureTask;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[PHI: r1
      0x0055: PHI (r1v4 X.0WTP) = (r1v3 X.0WTP), (r1v5 X.0WTP), (r1v6 X.0WTP) binds: [B:14:0x0043, B:16:0x004b, B:18:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0WTP LJFF(X.C0WTO r5, X.C0WTP r6) {
        /*
            r5.getClass()
            X.0WTW r0 = X.C0WTW.LIZ
            r0.getClass()
            com.bytedance.android.livesdk.livesetting.performance.LiveThreadPoolOptSetting$ThreadPoolOptConfig r4 = X.C0WTW.LJIIIZ()
            java.util.List<java.lang.String> r1 = r4.priorityWhitelist
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L61
            java.lang.String r3 = r5.LLILLL
            boolean r0 = r1.isEmpty()
            r2 = 0
            if (r0 != 0) goto L61
            java.util.Iterator r1 = r1.iterator()
        L21:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L61
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = kotlin.text.a0.LJJIIZI(r3, r0, r2)
            if (r0 == 0) goto L21
            int r3 = r4.promoteToPriority
            X.0WTP r2 = X.C0WTP.HIGH
            int r0 = r2.getValue()
            if (r3 == r0) goto L56
            X.0WTP r1 = X.C0WTP.NORMAL
            int r0 = r1.getValue()
            if (r3 == r0) goto L55
            X.0WTP r1 = X.C0WTP.LOW
            int r0 = r1.getValue()
            if (r3 == r0) goto L55
            X.0WTP r1 = X.C0WTP.BACKGROUND
            int r0 = r1.getValue()
            if (r3 != r0) goto L56
        L55:
            r2 = r1
        L56:
            int r1 = r2.getValue()
            int r0 = r6.getValue()
            if (r1 >= r0) goto L61
            return r2
        L61:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WTO.LJFF(X.0WTO, X.0WTP):X.0WTP");
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
        C0WTP c0wtpLJFF = LJFF(this, this.LLILLJJLI);
        LJI();
        this.LL.execute(new C0WTR(c0wtpLJFF, futureTask, this.LLILZ.incrementAndGet(), null, this.LLILLL, new AwS557S0100000_13(this, 181), 24));
        return futureTask;
    }

    public C0WTO(C0WPA c0wpa, C0WTP c0wtp, String str) {
        this.LL = c0wpa;
        this.LLILLJJLI = c0wtp;
        this.LLILLL = str;
        new ConcurrentHashMap();
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
        throw new UnsupportedOperationException("Method not decompiled: X.C0WTO.invokeAny(java.util.Collection, long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}
