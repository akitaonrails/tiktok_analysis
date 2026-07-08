package X;

/* JADX INFO: renamed from: X.11IE, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11IE<T> extends AbstractC19483511Kn<T> implements InterfaceC478520Ipe<T> {
    public final C098D<T> LL;
    public final long LLILLJJLI = 0;

    @Override // X.InterfaceC478520Ipe
    public final C11NZ<T> LIZJ() {
        return new C19475611Hm(this.LL, this.LLILLJJLI, null, false);
    }

    public C11IE(C098D c098d) {
        this.LL = c098d;
    }

    @Override // X.AbstractC19483511Kn
    public final void LJIJI(C11IH<? super T> c11ih) {
        this.LL.LIZIZ(new C11IF(c11ih, this.LLILLJJLI));
    }
}
