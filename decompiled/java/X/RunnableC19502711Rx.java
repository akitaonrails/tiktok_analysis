package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.11Rx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class RunnableC19502711Rx extends AtomicInteger implements Runnable, InterfaceC420801kM {
    public static final long serialVersionUID = -3603436687413320876L;
    public final Runnable LL;
    public final C11S3 LLILLJJLI;
    public volatile Thread LLILLL;

    @Override // java.lang.Runnable
    public void run() {
        io_reactivex_internal_schedulers_ExecutorScheduler$ExecutorWorker$InterruptibleRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
    }

    @Override // X.InterfaceC420801kM
    public void dispose() {
        while (true) {
            int i = get();
            if (i >= 2) {
                return;
            }
            if (i == 0) {
                if (compareAndSet(0, 4)) {
                    C11S3 c11s3 = this.LLILLJJLI;
                    if (c11s3 != null) {
                        c11s3.LIZIZ(this);
                        return;
                    }
                    return;
                }
            } else if (compareAndSet(1, 3)) {
                Thread thread = this.LLILLL;
                if (thread != null) {
                    thread.interrupt();
                    this.LLILLL = null;
                }
                set(4);
                C11S3 c11s32 = this.LLILLJJLI;
                if (c11s32 != null) {
                    c11s32.LIZIZ(this);
                    return;
                }
                return;
            }
        }
    }

    public void io_reactivex_internal_schedulers_ExecutorScheduler$ExecutorWorker$InterruptibleRunnable__run$___twin___() {
        if (get() == 0) {
            this.LLILLL = C786410Ut5.u3();
            if (!compareAndSet(0, 1)) {
                this.LLILLL = null;
                return;
            }
            try {
                this.LL.run();
                this.LLILLL = null;
                if (!compareAndSet(1, 2)) {
                    while (get() == 3) {
                        Thread.yield();
                    }
                    Thread.interrupted();
                } else {
                    C11S3 c11s3 = this.LLILLJJLI;
                    if (c11s3 != null) {
                        c11s3.LIZIZ(this);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LLILLL = null;
                if (compareAndSet(1, 2)) {
                    C11S3 c11s32 = this.LLILLJJLI;
                    if (c11s32 != null) {
                        c11s32.LIZIZ(this);
                    }
                    throw th;
                }
                while (get() == 3) {
                    Thread.yield();
                }
                Thread.interrupted();
                throw th;
            }
        }
    }

    @Override // X.InterfaceC420801kM
    public boolean isDisposed() {
        return get() >= 2;
    }

    public static void io_reactivex_internal_schedulers_ExecutorScheduler$ExecutorWorker$InterruptibleRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(RunnableC19502711Rx runnableC19502711Rx) {
        try {
            runnableC19502711Rx.io_reactivex_internal_schedulers_ExecutorScheduler$ExecutorWorker$InterruptibleRunnable__run$___twin___();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public RunnableC19502711Rx(Runnable runnable, C11NJ c11nj) {
        this.LL = runnable;
        this.LLILLJJLI = c11nj;
    }
}
