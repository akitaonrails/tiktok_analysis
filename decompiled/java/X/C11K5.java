package X;

/* JADX INFO: renamed from: X.11K5, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C11K5<T> extends C11K7<T> {
    public static final long serialVersionUID = -5502432239815349361L;
    public final InterfaceC626120Oh8<? super T> LL;
    public T LLILLJJLI;

    @Override // X.C11K7, X.InterfaceC420801kM
    public void dispose() {
        set(4);
        this.LLILLJJLI = null;
    }

    public final boolean tryDispose() {
        return getAndSet(4) != 4;
    }

    @Override // X.C11K7, X.InterfaceC19494911Ox
    public final void clear() {
        lazySet(32);
        this.LLILLJJLI = null;
    }

    public final void complete() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.LL.onComplete();
    }

    @Override // X.C11K7, X.InterfaceC420801kM
    public final boolean isDisposed() {
        return get() == 4;
    }

    @Override // X.C11K7, X.InterfaceC19494911Ox
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // X.C11K7, X.InterfaceC19494911Ox
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        T t = this.LLILLJJLI;
        this.LLILLJJLI = null;
        lazySet(32);
        return t;
    }

    public C11K5(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
        this.LL = interfaceC626120Oh8;
    }

    public final void complete(T t) {
        int i = get();
        if ((i & 54) != 0) {
            return;
        }
        InterfaceC626120Oh8<? super T> interfaceC626120Oh8 = this.LL;
        if (i == 8) {
            this.LLILLJJLI = t;
            lazySet(16);
            interfaceC626120Oh8.onNext(null);
        } else {
            lazySet(2);
            interfaceC626120Oh8.onNext(t);
        }
        if (get() != 4) {
            interfaceC626120Oh8.onComplete();
        }
    }

    public final void error(Throwable th) {
        if ((get() & 54) != 0) {
            C19489211Ms.LIZIZ(th);
        } else {
            lazySet(2);
            this.LL.onError(th);
        }
    }

    @Override // X.C11K7, X.InterfaceC19495111Oz
    public final int requestFusion(int i) {
        if ((i & 2) != 0) {
            lazySet(8);
            return 2;
        }
        return 0;
    }
}
