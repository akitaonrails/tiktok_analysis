package X;

/* JADX INFO: renamed from: X.11Qm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19499011Qm<T, R> extends C11NZ<R> {
    public final C098D<? extends T>[] LL;
    public final Iterable<? extends C098D<? extends T>> LLILLJJLI;
    public final InterfaceC1487280oo2<? super Object[], ? extends R> LLILLL;
    public final int LLILZ;
    public final boolean LLILZIL = false;

    @Override // X.C11NZ
    public final void LJJZZIII(InterfaceC626120Oh8<? super R> interfaceC626120Oh8) {
        int length;
        C098D<? extends T>[] c098dArr = this.LL;
        if (c098dArr == null) {
            c098dArr = new C11NZ[8];
            length = 0;
            for (C098D<? extends T> c098d : this.LLILLJJLI) {
                if (length == c098dArr.length) {
                    C098D<? extends T>[] c098dArr2 = new C098D[(length >> 2) + length];
                    System.arraycopy(c098dArr, 0, c098dArr2, 0, length);
                    c098dArr = c098dArr2;
                }
                c098dArr[length] = c098d;
                length++;
            }
        } else {
            length = c098dArr.length;
        }
        if (length == 0) {
            C11JT.complete(interfaceC626120Oh8);
            return;
        }
        C19499111Qn c19499111Qn = new C19499111Qn(interfaceC626120Oh8, this.LLILLL, length, this.LLILZIL);
        int i = this.LLILZ;
        C19499311Qp<T, R>[] c19499311QpArr = c19499111Qn.LLILLL;
        int length2 = c19499311QpArr.length;
        for (int i2 = 0; i2 < length2; i2++) {
            c19499311QpArr[i2] = new C19499311Qp<>(c19499111Qn, i);
        }
        c19499111Qn.lazySet(0);
        c19499111Qn.LL.onSubscribe(c19499111Qn);
        for (int i3 = 0; i3 < length2 && !c19499111Qn.LLILZLL; i3++) {
            c098dArr[i3].LIZIZ(c19499311QpArr[i3]);
        }
    }

    public C19499011Qm(C098D[] c098dArr, Iterable iterable, InterfaceC1487280oo2 interfaceC1487280oo2, int i) {
        this.LL = c098dArr;
        this.LLILLJJLI = iterable;
        this.LLILLL = interfaceC1487280oo2;
        this.LLILZ = i;
    }
}
