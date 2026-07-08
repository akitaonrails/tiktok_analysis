package X;

/* JADX INFO: renamed from: X.11QQ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11QQ<R> extends C11OS implements C11PF<R> {
    public static final long serialVersionUID = 897683679971470653L;
    public final C11QS<R> LLJ;
    public long LLJI;

    @Override // X.C11M9
    public final void onComplete() {
        long j = this.LLJI;
        if (j != 0) {
            this.LLJI = 0L;
            produced(j);
        }
        C11QP c11qp = (C11QP) this.LLJ;
        c11qp.LLJIJIL = false;
        c11qp.LIZLLL();
    }

    public C11QQ(C11QS<R> c11qs) {
        super(false);
        this.LLJ = c11qs;
    }

    @Override // X.C11M9
    public final void onError(Throwable th) {
        long j = this.LLJI;
        if (j != 0) {
            this.LLJI = 0L;
            produced(j);
        }
        this.LLJ.LIZIZ(th);
    }

    @Override // X.C11M9
    public final void onNext(R r) {
        this.LLJI++;
        this.LLJ.LIZ(r);
    }

    @Override // X.C11PF, X.C11M9
    public final void onSubscribe(C11LR c11lr) {
        setSubscription(c11lr);
    }
}
