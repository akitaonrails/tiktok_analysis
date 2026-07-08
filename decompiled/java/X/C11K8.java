package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.11K8, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11K8<T> extends AtomicInteger implements InterfaceC19495611Pe<T>, Runnable {
    public static final long serialVersionUID = 3880992722410194083L;
    public final InterfaceC626120Oh8<? super T> LL;
    public final T LLILLJJLI;

    @Override // X.InterfaceC19494911Ox
    public void clear() {
        lazySet(3);
    }

    @Override // X.InterfaceC420801kM
    public void dispose() {
        set(3);
    }

    @Override // java.lang.Runnable
    public void run() {
        io_reactivex_internal_operators_observable_ObservableScalarXMap$ScalarDisposable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
    }

    public void io_reactivex_internal_operators_observable_ObservableScalarXMap$ScalarDisposable__run$___twin___() {
        if (get() == 0 && compareAndSet(0, 2)) {
            this.LL.onNext(this.LLILLJJLI);
            if (get() == 2) {
                lazySet(3);
                this.LL.onComplete();
            }
        }
    }

    @Override // X.InterfaceC420801kM
    public boolean isDisposed() {
        return get() == 3;
    }

    @Override // X.InterfaceC19494911Ox
    public boolean isEmpty() {
        return get() != 1;
    }

    @Override // X.InterfaceC19494911Ox
    public T poll() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.LLILLJJLI;
    }

    public static void io_reactivex_internal_operators_observable_ObservableScalarXMap$ScalarDisposable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(C11K8 c11k8) {
        try {
            c11k8.io_reactivex_internal_operators_observable_ObservableScalarXMap$ScalarDisposable__run$___twin___();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    @Override // X.InterfaceC19494911Ox
    public boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // X.InterfaceC19495111Oz
    public int requestFusion(int i) {
        if ((i & 1) != 0) {
            lazySet(1);
            return 1;
        }
        return 0;
    }

    public C11K8(InterfaceC626120Oh8<? super T> interfaceC626120Oh8, T t) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = t;
    }

    public boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
