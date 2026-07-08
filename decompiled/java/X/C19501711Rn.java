package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Rn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19501711Rn<T> implements InterfaceC19495011Oy<T> {
    public final AtomicReference<C19501911Rp<T>> LL;
    public final AtomicReference<C19501911Rp<T>> LLILLJJLI;

    @Override // X.InterfaceC19494911Ox
    public final boolean isEmpty() {
        return this.LLILLJJLI.get() == this.LL.get();
    }

    @Override // X.InterfaceC19495011Oy, X.InterfaceC19494911Ox
    public final T poll() {
        C19501911Rp c19501911Rp;
        C19501911Rp<T> c19501911Rp2 = this.LLILLJJLI.get();
        C19501911Rp c19501911Rp3 = c19501911Rp2.get();
        if (c19501911Rp3 != null) {
            T t = c19501911Rp3.LL;
            c19501911Rp3.LL = null;
            this.LLILLJJLI.lazySet(c19501911Rp3);
            return t;
        }
        if (c19501911Rp2 == this.LL.get()) {
            return null;
        }
        do {
            c19501911Rp = c19501911Rp2.get();
        } while (c19501911Rp == null);
        T t2 = c19501911Rp.LL;
        c19501911Rp.LL = null;
        this.LLILLJJLI.lazySet(c19501911Rp);
        return t2;
    }

    public C19501711Rn() {
        AtomicReference<C19501911Rp<T>> atomicReference = new AtomicReference<>();
        this.LL = atomicReference;
        AtomicReference<C19501911Rp<T>> atomicReference2 = new AtomicReference<>();
        this.LLILLJJLI = atomicReference2;
        C19501911Rp<T> c19501911Rp = new C19501911Rp<>();
        atomicReference2.lazySet(c19501911Rp);
        atomicReference.getAndSet(c19501911Rp);
    }

    @Override // X.InterfaceC19494911Ox
    public final void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    @Override // X.InterfaceC19494911Ox
    public final boolean offer(T t) {
        if (t != null) {
            C19501911Rp<T> c19501911Rp = new C19501911Rp<>(t);
            this.LL.getAndSet(c19501911Rp).lazySet(c19501911Rp);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }
}
