package X;

/* JADX INFO: renamed from: X.11QX, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11QX<T, U> extends C11J7<T, T> {
    public final C098D<? extends U> LLILLJJLI;

    @Override // X.C11NZ
    public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
        C11QW c11qw = new C11QW(interfaceC626120Oh8);
        interfaceC626120Oh8.onSubscribe(c11qw);
        this.LLILLJJLI.LIZIZ(c11qw.LLILLL);
        this.LL.LIZIZ(c11qw);
    }

    public C11QX(C098D c098d, C11NZ c11nz) {
        super(c098d);
        this.LLILLJJLI = c11nz;
    }
}
