package X;

/* JADX INFO: renamed from: X.11Lh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19485511Lh<T, R> extends AbstractC19484711Kz<R> {
    public final InterfaceC19473011Gm<? extends T>[] LL;
    public final InterfaceC1487280oo2<? super Object[], ? extends R> LLILLJJLI;

    @Override // X.AbstractC19484711Kz
    public final void LJJIJ(InterfaceC19474811He<? super R> interfaceC19474811He) {
        InterfaceC19473011Gm<? extends T>[] interfaceC19473011GmArr = this.LL;
        int length = interfaceC19473011GmArr.length;
        if (length == 1) {
            interfaceC19473011GmArr[0].LIZ(new C19481911Jx(interfaceC19474811He, new InterfaceC1487280oo2<T, R>() { // from class: X.11Lk
                /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.lang.Object[]] */
                @Override // X.InterfaceC1487280oo2
                public final R apply(T t) {
                    R rApply = this.LL.LLILLJJLI.apply(new Object[]{t});
                    C1701890uOB.LIZ(rApply, "The zipper returned a null value");
                    return rApply;
                }
            }));
            return;
        }
        C19485611Li c19485611Li = new C19485611Li(interfaceC19474811He, length, this.LLILLJJLI);
        interfaceC19474811He.onSubscribe(c19485611Li);
        for (int i = 0; i < length && !c19485611Li.isDisposed(); i++) {
            InterfaceC19473011Gm<? extends T> interfaceC19473011Gm = interfaceC19473011GmArr[i];
            if (interfaceC19473011Gm == null) {
                c19485611Li.LIZ(i, new NullPointerException("One of the sources is null"));
                return;
            }
            interfaceC19473011Gm.LIZ(c19485611Li.LLILLL[i]);
        }
    }

    public C19485511Lh(InterfaceC1487280oo2 interfaceC1487280oo2, InterfaceC19473011Gm[] interfaceC19473011GmArr) {
        this.LL = interfaceC19473011GmArr;
        this.LLILLJJLI = interfaceC1487280oo2;
    }
}
