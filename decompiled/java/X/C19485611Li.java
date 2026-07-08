package X;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.11Li, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19485611Li<T, R> extends AtomicInteger implements InterfaceC420801kM {
    public static final long serialVersionUID = -5556924161382950569L;
    public final InterfaceC19474811He<? super R> LL;
    public final InterfaceC1487280oo2<? super Object[], ? extends R> LLILLJJLI;
    public final C19485711Lj<T>[] LLILLL;
    public final Object[] LLILZ;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        if (getAndSet(0) > 0) {
            for (C19485711Lj<T> c19485711Lj : this.LLILLL) {
                c19485711Lj.getClass();
                C11JE.dispose(c19485711Lj);
            }
        }
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return get() <= 0;
    }

    public final void LIZ(int i, Throwable th) {
        if (getAndSet(0) > 0) {
            C19485711Lj<T>[] c19485711LjArr = this.LLILLL;
            int length = c19485711LjArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                C19485711Lj<T> c19485711Lj = c19485711LjArr[i2];
                c19485711Lj.getClass();
                C11JE.dispose(c19485711Lj);
            }
            while (true) {
                i++;
                if (i < length) {
                    C19485711Lj<T> c19485711Lj2 = c19485711LjArr[i];
                    c19485711Lj2.getClass();
                    C11JE.dispose(c19485711Lj2);
                } else {
                    this.LL.onError(th);
                    return;
                }
            }
        } else {
            C19489211Ms.LIZIZ(th);
        }
    }

    public C19485611Li(InterfaceC19474811He<? super R> interfaceC19474811He, int i, InterfaceC1487280oo2<? super Object[], ? extends R> interfaceC1487280oo2) {
        super(i);
        this.LL = interfaceC19474811He;
        this.LLILLJJLI = interfaceC1487280oo2;
        C19485711Lj<T>[] c19485711LjArr = new C19485711Lj[i];
        for (int i2 = 0; i2 < i; i2++) {
            c19485711LjArr[i2] = new C19485711Lj<>(this, i2);
        }
        this.LLILLL = c19485711LjArr;
        this.LLILZ = new Object[i];
    }
}
