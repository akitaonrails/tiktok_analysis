package X;

/* JADX INFO: renamed from: X.11OW, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11OW<T, U> extends C11OS implements C11PF<T> {
    public static final long serialVersionUID = -5604623027276966720L;
    public final C11M9<? super T> LLJ;
    public final AbstractC19492911Od<U> LLJI;
    public final C11LR LLJIJIL;
    public long LLJILJIL;

    @Override // X.C11OS, X.C11LR
    public final void cancel() {
        super.cancel();
        this.LLJIJIL.cancel();
    }

    @Override // X.C11M9
    public final void onNext(T t) {
        this.LLJILJIL++;
        this.LLJ.onNext(t);
    }

    @Override // X.C11PF, X.C11M9
    public final void onSubscribe(C11LR c11lr) {
        setSubscription(c11lr);
    }

    public C11OW(C11PH c11ph, AbstractC19492911Od abstractC19492911Od, C11OT c11ot) {
        super(false);
        this.LLJ = c11ph;
        this.LLJI = abstractC19492911Od;
        this.LLJIJIL = c11ot;
    }
}
