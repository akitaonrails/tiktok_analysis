package X;

/* JADX INFO: renamed from: X.1A6N, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A6N<T> extends C1A6I<T> {
    public final boolean LLJJ;
    public final Object LLJJI;
    public final AbstractC470910IdN<?, T> LLJJIII;

    @Override // X.C1A6I
    public final void LJIIIZ(C1A6I c1a6i, C1A6C c1a6c) {
    }

    @Override // X.C1A6I
    public final boolean LJIILIIL() {
        return true;
    }

    @Override // X.C1A6I
    public final boolean LJIILJJIL() {
        return true;
    }

    @Override // X.C1A6I
    public final void LJIIZILJ(int i) {
    }

    @Override // X.C1A6I
    public final AbstractC470910IdN<?, T> LJIIJ() {
        return this.LLJJIII;
    }

    @Override // X.C1A6I
    public final Object LJIIJJI() {
        return this.LLJJI;
    }

    @Override // X.C1A6I
    public final boolean LJIIL() {
        return this.LLJJ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1A6N(C1A6I<T> c1a6i) {
        C1A6G<T> c1a6g = c1a6i.LLILZIL;
        c1a6g.getClass();
        super(new C1A6G(c1a6g), c1a6i.LL, c1a6i.LLILLJJLI, null, c1a6i.LLILZ);
        this.LLJJIII = c1a6i.LJIIJ();
        this.LLJJ = c1a6i.LJIIL();
        this.LLILZLL = c1a6i.LLILZLL;
        this.LLJJI = c1a6i.LJIIJJI();
    }
}
