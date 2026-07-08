package X;

/* JADX INFO: renamed from: X.11Ku, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19484211Ku<T> extends C11J7<T, T> {
    public final InterfaceC1487280oo2<? super Throwable, ? extends C098D<? extends T>> LLILLJJLI;
    public final boolean LLILLL;

    @Override // X.C11NZ
    public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
        C19484111Kt c19484111Kt = new C19484111Kt(interfaceC626120Oh8, this.LLILLJJLI, this.LLILLL);
        interfaceC626120Oh8.onSubscribe(c19484111Kt.LLILZ);
        this.LL.LIZIZ(c19484111Kt);
    }

    public C19484211Ku(C098D<T> c098d, InterfaceC1487280oo2<? super Throwable, ? extends C098D<? extends T>> interfaceC1487280oo2, boolean z) {
        super(c098d);
        this.LLILLJJLI = interfaceC1487280oo2;
        this.LLILLL = z;
    }
}
