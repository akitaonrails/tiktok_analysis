package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11RW, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11RW<T> extends AtomicReference<C19500711Rd> implements C11RY<T> {
    public static final long serialVersionUID = 2346567790059478686L;
    public C19500711Rd LL;
    public int LLILLJJLI;

    public abstract void LIZ();

    public C11RW() {
        C19500711Rd c19500711Rd = new C19500711Rd(null);
        this.LL = c19500711Rd;
        set(c19500711Rd);
    }

    @Override // X.C11RY
    public final void LJFF() {
        C19500711Rd c19500711Rd = new C19500711Rd(C11PO.complete());
        this.LL.set(c19500711Rd);
        this.LL = c19500711Rd;
        this.LLILLJJLI++;
        C19500711Rd c19500711Rd2 = get();
        if (c19500711Rd2.LL != null) {
            C19500711Rd c19500711Rd3 = new C19500711Rd(null);
            c19500711Rd3.lazySet(c19500711Rd2.get());
            set(c19500711Rd3);
        }
    }

    @Override // X.C11RY
    public final void LJIJ(T t) {
        C11PO.next(t);
        C19500711Rd c19500711Rd = new C19500711Rd(t);
        this.LL.set(c19500711Rd);
        this.LL = c19500711Rd;
        this.LLILLJJLI++;
        LIZ();
    }

    @Override // X.C11RY
    public final void LJIJI(Throwable th) {
        C19500711Rd c19500711Rd = new C19500711Rd(C11PO.error(th));
        this.LL.set(c19500711Rd);
        this.LL = c19500711Rd;
        this.LLILLJJLI++;
        C19500711Rd c19500711Rd2 = get();
        if (c19500711Rd2.LL != null) {
            C19500711Rd c19500711Rd3 = new C19500711Rd(null);
            c19500711Rd3.lazySet(c19500711Rd2.get());
            set(c19500711Rd3);
        }
    }

    @Override // X.C11RY
    public final void LJIL(C11RX<T> c11rx) {
        if (c11rx.getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        do {
            C19500711Rd c19500711Rd = (AtomicReference) c11rx.LLILLL;
            if (c19500711Rd == null) {
                c19500711Rd = get();
                c11rx.LLILLL = c19500711Rd;
            }
            while (!c11rx.LLILZ) {
                C19500711Rd c19500711Rd2 = (C19500711Rd) c19500711Rd.get();
                if (c19500711Rd2 != null) {
                    if (C11PO.accept(c19500711Rd2.LL, c11rx.LLILLJJLI)) {
                        c11rx.LLILLL = null;
                        return;
                    }
                    c19500711Rd = c19500711Rd2;
                } else {
                    c11rx.LLILLL = c19500711Rd;
                    iAddAndGet = c11rx.addAndGet(-iAddAndGet);
                }
            }
            c11rx.LLILLL = null;
            return;
        } while (iAddAndGet != 0);
    }
}
