package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11OE, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11OE<T> extends AtomicReference<InterfaceC420801kM> implements Runnable, InterfaceC420801kM {
    public static final long serialVersionUID = 6812032969491025141L;
    public final T LL;
    public final long LLILLJJLI;
    public final C11OD<T> LLILLL;
    public final AtomicBoolean LLILZ = new AtomicBoolean();

    @Override // java.lang.Runnable
    public void run() {
        io_reactivex_internal_operators_observable_ObservableDebounceTimed$DebounceEmitter_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
    }

    public void io_reactivex_internal_operators_observable_ObservableDebounceTimed$DebounceEmitter__run$___twin___() {
        if (this.LLILZ.compareAndSet(false, true)) {
            C11OD<T> c11od = this.LLILLL;
            long j = this.LLILLJJLI;
            T t = this.LL;
            if (j == c11od.LLIZ) {
                c11od.LL.onNext(t);
                dispose();
            }
        }
    }

    @Override // X.InterfaceC420801kM
    public boolean isDisposed() {
        return get() == C11JE.DISPOSED;
    }

    @Override // X.InterfaceC420801kM
    public void dispose() {
        C11JE.dispose(this);
    }

    public static void io_reactivex_internal_operators_observable_ObservableDebounceTimed$DebounceEmitter_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(C11OE c11oe) {
        try {
            c11oe.io_reactivex_internal_operators_observable_ObservableDebounceTimed$DebounceEmitter__run$___twin___();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public void setResource(InterfaceC420801kM interfaceC420801kM) {
        C11JE.replace(this, interfaceC420801kM);
    }

    public C11OE(T t, long j, C11OD<T> c11od) {
        this.LL = t;
        this.LLILLJJLI = j;
        this.LLILLL = c11od;
    }
}
