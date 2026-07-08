package X;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.11NR, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11NR<T> extends AtomicInteger implements InterfaceC19495511Pd<T> {
    public static final long serialVersionUID = -3830916580126663321L;
    public final T LL;
    public final C11M9<? super T> LLILLJJLI;

    @Override // X.C11LR
    public void cancel() {
        lazySet(2);
    }

    @Override // X.InterfaceC19494911Ox
    public void clear() {
        lazySet(1);
    }

    @Override // X.InterfaceC19495111Oz
    public int requestFusion(int i) {
        return i & 1;
    }

    public boolean isCancelled() {
        return get() == 2;
    }

    @Override // X.InterfaceC19494911Ox
    public boolean isEmpty() {
        return get() != 0;
    }

    @Override // X.InterfaceC19494911Ox
    public T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.LL;
    }

    @Override // X.InterfaceC19494911Ox
    public boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // X.C11LR
    public void request(long j) {
        if (C11NC.validate(j) && compareAndSet(0, 1)) {
            C11M9<? super T> c11m9 = this.LLILLJJLI;
            c11m9.onNext(this.LL);
            if (get() != 2) {
                c11m9.onComplete();
            }
        }
    }

    public C11NR(C11M9<? super T> c11m9, T t) {
        this.LLILLJJLI = c11m9;
        this.LL = t;
    }

    public boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
