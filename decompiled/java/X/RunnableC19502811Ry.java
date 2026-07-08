package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11Ry, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class RunnableC19502811Ry extends AbstractC19502611Rw implements Runnable {
    public static final long serialVersionUID = 1811839108042568751L;

    @Override // java.lang.Runnable
    public void run() {
        io_reactivex_internal_schedulers_ScheduledDirectPeriodicTask_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
    }

    @Override // X.AbstractC19502611Rw
    public /* bridge */ /* synthetic */ Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }

    public void io_reactivex_internal_schedulers_ScheduledDirectPeriodicTask__run$___twin___() {
        this.LLILLJJLI = C786410Ut5.u3();
        try {
            this.LL.run();
            this.LLILLJJLI = null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLJJLI = null;
            lazySet(AbstractC19502611Rw.LLILLL);
            C19489211Ms.LIZIZ(th);
        }
    }

    public RunnableC19502811Ry(Runnable runnable) {
        super(runnable);
    }

    public static void io_reactivex_internal_schedulers_ScheduledDirectPeriodicTask_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(RunnableC19502811Ry runnableC19502811Ry) {
        try {
            runnableC19502811Ry.io_reactivex_internal_schedulers_ScheduledDirectPeriodicTask__run$___twin___();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }
}
