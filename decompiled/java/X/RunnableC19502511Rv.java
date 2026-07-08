package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: X.11Rv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class RunnableC19502511Rv extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, InterfaceC420801kM {
    public static final Object LLILLJJLI = new Object();
    public static final Object LLILLL = new Object();
    public static final Object LLILZ = new Object();
    public static final Object LLILZIL = new Object();
    public static final long serialVersionUID = -6120223772001106981L;
    public final Runnable LL;

    @Override // X.InterfaceC420801kM
    public void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        boolean z;
        while (true) {
            Object obj6 = get(1);
            obj = LLILZIL;
            if (obj6 == obj || obj6 == (obj4 = LLILLL) || obj6 == (obj5 = LLILZ)) {
                break;
            }
            if (get(2) != C786410Ut5.u3()) {
                z = true;
                obj4 = obj5;
            } else {
                z = false;
            }
            if (compareAndSet(1, obj6, obj4)) {
                if (obj6 != null) {
                    ((Future) obj6).cancel(z);
                }
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = LLILLJJLI) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((C11S3) obj2).LIZIZ(this);
    }

    @Override // X.InterfaceC420801kM
    public boolean isDisposed() {
        Object obj = get(0);
        return obj == LLILLJJLI || obj == LLILZIL;
    }

    @Override // java.lang.Runnable
    public void run() {
        io_reactivex_internal_schedulers_ScheduledRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
    }

    public void io_reactivex_internal_schedulers_ScheduledRunnable__run$___twin___() {
        Object obj;
        boolean zCompareAndSet;
        Object obj2;
        Object obj3 = LLILZ;
        Object obj4 = LLILLL;
        Object obj5 = LLILLJJLI;
        Object obj6 = LLILZIL;
        lazySet(2, C786410Ut5.u3());
        try {
            this.LL.run();
        } finally {
            try {
            } catch (Throwable th) {
                do {
                    if (obj == obj4 || obj == obj3) {
                        break;
                    }
                } while (!zCompareAndSet);
            }
        }
        lazySet(2, null);
        Object obj7 = get(0);
        if (obj7 != obj5 && compareAndSet(0, obj7, obj6) && obj7 != null) {
            ((C11S3) obj7).LIZIZ(this);
        }
        do {
            obj2 = get(1);
            if (obj2 == obj4 || obj2 == obj3) {
                return;
            }
        } while (!compareAndSet(1, obj2, obj6));
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    public static void io_reactivex_internal_schedulers_ScheduledRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(RunnableC19502511Rv runnableC19502511Rv) {
        try {
            runnableC19502511Rv.io_reactivex_internal_schedulers_ScheduledRunnable__run$___twin___();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public void setFuture(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == LLILZIL) {
                return;
            }
            if (obj == LLILLL) {
                future.cancel(false);
                return;
            } else if (obj == LLILZ) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    public RunnableC19502511Rv(Runnable runnable, C11S3 c11s3) {
        super(3);
        this.LL = runnable;
        lazySet(0, c11s3);
    }
}
