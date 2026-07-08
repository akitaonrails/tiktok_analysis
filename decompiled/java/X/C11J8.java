package X;

/* JADX INFO: renamed from: X.11J8, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11J8<T, U> extends AbstractC19477911Ij<T, T> {
    public final C11ID<U> LLILLJJLI;
    public final C11ID<? extends T> LLILLL;

    @Override // X.AbstractC19483511Kn
    public final void LJIJI(C11IH<? super T> c11ih) {
        C11J9 c11j9 = new C11J9(c11ih, this.LLILLL);
        c11ih.onSubscribe(c11j9);
        this.LLILLJJLI.LIZ(c11j9.LLILLJJLI);
        this.LL.LIZ(c11j9);
    }

    public C11J8(C11ID c11id, C11IM c11im, C11ID c11id2) {
        super(c11id);
        this.LLILLJJLI = c11im;
        this.LLILLL = c11id2;
    }
}
