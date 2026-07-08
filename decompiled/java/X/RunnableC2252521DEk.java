package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.EventLoopImplBase;

/* JADX INFO: renamed from: X.1DEk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class RunnableC2252521DEk extends EventLoopImplBase implements Runnable {
    public static final RunnableC2252521DEk LL;
    public static final long LLILLJJLI;
    public static volatile Thread _thread;
    public static volatile int debugStatus;

    public final synchronized void LLIILII() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            resetAll();
            notifyAll();
        }
    }

    @Override // kotlinx.coroutines.EventLoopImplBase, X.AbstractC2252601DEs
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    static {
        Long l;
        RunnableC2252521DEk runnableC2252521DEk = new RunnableC2252521DEk();
        LL = runnableC2252521DEk;
        AbstractC2252601DEs.incrementUseCount$default(runnableC2252521DEk, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        LLILLJJLI = timeUnit.toNanos(l.longValue());
    }

    public final void LLIILZL() {
        C23262099o.LIZ.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    LLIILII();
                    if (isEmpty()) {
                        return;
                    }
                    getThread();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jProcessNextEvent = processNextEvent();
                    if (jProcessNextEvent == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = LLILLJJLI + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            LLIILII();
                            if (isEmpty()) {
                                return;
                            }
                            getThread();
                            return;
                        }
                        if (jProcessNextEvent > j2) {
                            jProcessNextEvent = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jProcessNextEvent > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            break;
                        } else {
                            LockSupport.parkNanos(this, jProcessNextEvent);
                        }
                    }
                }
            }
        } finally {
            _thread = null;
            LLIILII();
            if (!isEmpty()) {
                getThread();
            }
        }
    }

    @Override // X.AbstractC2252541DEm
    public final Thread getThread() {
        Thread pthreadThread = _thread;
        if (pthreadThread == null) {
            synchronized (this) {
                pthreadThread = _thread;
                if (pthreadThread == null) {
                    pthreadThread = new PthreadThread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = pthreadThread;
                    pthreadThread.setDaemon(true);
                    pthreadThread.start();
                }
            }
        }
        return pthreadThread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            LLIILZL();
        } catch (Throwable th) {
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    @Override // kotlinx.coroutines.EventLoopImplBase
    public final void enqueue(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.enqueue(runnable);
    }

    @Override // X.AbstractC2252541DEm
    public final void reschedule(long j, AbstractRunnableC2252511DEj abstractRunnableC2252511DEj) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.EventLoopImplBase, X.InterfaceC2239108px
    public final InterfaceC2238208po invokeOnTimeout(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return scheduleInvokeOnTimeout(j, runnable);
    }
}
