package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0p47, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class ExecutorC1497250p47 implements Executor {
    public static final AtomicBoolean LLIZ = new AtomicBoolean(false);
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public InterruptedIOException LLILZ;
    public RuntimeException LLILZIL;
    public long LLILZLL = -1;
    public final BlockingQueue<Runnable> LL = new LinkedBlockingQueue();

    public final void LIZ(int i) throws InterruptedIOException {
        long jNanoTime = System.nanoTime();
        long jConvert = TimeUnit.NANOSECONDS.convert(i, TimeUnit.MILLISECONDS);
        if (this.LLILLL) {
            InterruptedIOException interruptedIOException = this.LLILZ;
            if (interruptedIOException != null) {
                throw interruptedIOException;
            }
            throw this.LLILZIL;
        }
        if (!this.LLILLJJLI) {
            this.LLILLJJLI = true;
            while (this.LLILLJJLI) {
                if (i == 0) {
                    try {
                        LIZIZ(0L, false).run();
                    } catch (RuntimeException e) {
                        TryCatchGuardChecker.doCheck(e);
                        this.LLILLJJLI = false;
                        this.LLILLL = true;
                        this.LLILZIL = e;
                        throw e;
                    } catch (SocketTimeoutException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        this.LLILLJJLI = false;
                        this.LLILLL = true;
                        throw e2;
                    } catch (InterruptedIOException e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        this.LLILLJJLI = false;
                        this.LLILLL = true;
                        this.LLILZ = e3;
                        throw e3;
                    }
                } else {
                    LIZIZ((jConvert - System.nanoTime()) + jNanoTime, true).run();
                }
            }
            return;
        }
        throw new IllegalStateException("Cannot run loop when it is already running.");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (runnable != null) {
            try {
                ((LinkedBlockingQueue) this.LL).put(runnable);
                return;
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new RejectedExecutionException(e);
            }
        }
        throw new IllegalArgumentException();
    }

    public final Runnable LIZIZ(long j, boolean z) throws InterruptedIOException {
        Runnable runnable;
        try {
            if (!z) {
                runnable = (Runnable) ((LinkedBlockingQueue) this.LL).take();
            } else {
                runnable = (Runnable) ((LinkedBlockingQueue) this.LL).poll(j, TimeUnit.NANOSECONDS);
            }
            if (runnable != null) {
                return runnable;
            }
            throw new SocketTimeoutException("ttnet");
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            InterruptedIOException interruptedIOException = new InterruptedIOException();
            interruptedIOException.initCause(e);
            throw interruptedIOException;
        }
    }
}
