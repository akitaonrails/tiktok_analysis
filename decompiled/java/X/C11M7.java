package X;

/* JADX INFO: renamed from: X.11M7, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C11M7<T> extends C11NT<T> {
    public static final long serialVersionUID = -2151279923272604993L;
    public final C11M9<? super T> LL;
    public T LLILLJJLI;

    @Override // X.C11NT, X.C11LR
    public void cancel() {
        set(4);
        this.LLILLJJLI = null;
    }

    public final boolean tryCancel() {
        return getAndSet(4) != 4;
    }

    @Override // X.C11NT, X.InterfaceC19494911Ox
    public final void clear() {
        lazySet(32);
        this.LLILLJJLI = null;
    }

    public final boolean isCancelled() {
        return get() == 4;
    }

    @Override // X.C11NT, X.InterfaceC19494911Ox
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // X.C11NT, X.InterfaceC19494911Ox
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t = this.LLILLJJLI;
        this.LLILLJJLI = null;
        return t;
    }

    public C11M7(C11M9<? super T> c11m9) {
        this.LL = c11m9;
    }

    public final void complete(T t) {
        int i = get();
        while (i != 8) {
            if ((i & (-3)) != 0) {
                return;
            }
            if (i == 2) {
                lazySet(3);
                C11M9<? super T> c11m9 = this.LL;
                c11m9.onNext(t);
                if (get() != 4) {
                    c11m9.onComplete();
                    return;
                }
                return;
            }
            this.LLILLJJLI = t;
            if (compareAndSet(0, 1)) {
                return;
            }
            i = get();
            if (i == 4) {
                this.LLILLJJLI = null;
                return;
            }
        }
        this.LLILLJJLI = t;
        lazySet(16);
        C11M9<? super T> c11m92 = this.LL;
        c11m92.onNext(t);
        if (get() != 4) {
            c11m92.onComplete();
        }
    }

    @Override // X.C11NT, X.C11LR
    public final void request(long j) {
        T t;
        if (C11NC.validate(j)) {
            do {
                int i = get();
                if ((i & (-2)) != 0) {
                    return;
                }
                if (i == 1) {
                    if (compareAndSet(1, 3) && (t = this.LLILLJJLI) != null) {
                        this.LLILLJJLI = null;
                        C11M9<? super T> c11m9 = this.LL;
                        c11m9.onNext(t);
                        if (get() != 4) {
                            c11m9.onComplete();
                            return;
                        }
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    @Override // X.C11NT, X.InterfaceC19495111Oz
    public final int requestFusion(int i) {
        if ((i & 2) != 0) {
            lazySet(8);
            return 2;
        }
        return 0;
    }
}
