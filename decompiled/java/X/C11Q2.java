package X;

/* JADX INFO: renamed from: X.11Q2, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11Q2<T, R> implements C11OM<T>, InterfaceC19495511Pd<R> {
    public final C11OM<? super R> LL;
    public C11LR LLILLJJLI;
    public InterfaceC19495511Pd<T> LLILLL;
    public boolean LLILZ;
    public int LLILZIL;

    @Override // X.C11LR
    public final void cancel() {
        this.LLILLJJLI.cancel();
    }

    @Override // X.InterfaceC19494911Ox
    public final void clear() {
        this.LLILLL.clear();
    }

    @Override // X.InterfaceC19494911Ox
    public final boolean isEmpty() {
        return this.LLILLL.isEmpty();
    }

    @Override // X.C11M9
    public void onComplete() {
        if (this.LLILZ) {
            return;
        }
        this.LLILZ = true;
        this.LL.onComplete();
    }

    public C11Q2(C11OM<? super R> c11om) {
        this.LL = c11om;
    }

    public final void LIZ(Throwable th) throws Throwable {
        C11SP.LIZ(th);
        this.LLILLJJLI.cancel();
        onError(th);
    }

    public final int LIZIZ(int i) {
        InterfaceC19495511Pd<T> interfaceC19495511Pd = this.LLILLL;
        if (interfaceC19495511Pd != null && (i & 4) == 0) {
            int iRequestFusion = interfaceC19495511Pd.requestFusion(i);
            if (iRequestFusion != 0) {
                this.LLILZIL = iRequestFusion;
            }
            return iRequestFusion;
        }
        return 0;
    }

    @Override // X.InterfaceC19494911Ox
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // X.C11M9
    public void onError(Throwable th) {
        if (this.LLILZ) {
            C19489211Ms.LIZIZ(th);
        } else {
            this.LLILZ = true;
            this.LL.onError(th);
        }
    }

    @Override // X.C11PF, X.C11M9
    public final void onSubscribe(C11LR c11lr) {
        if (C11NC.validate(this.LLILLJJLI, c11lr)) {
            this.LLILLJJLI = c11lr;
            if (c11lr instanceof InterfaceC19495511Pd) {
                this.LLILLL = (InterfaceC19495511Pd) c11lr;
            }
            this.LL.onSubscribe(this);
        }
    }

    @Override // X.C11LR
    public final void request(long j) {
        this.LLILLJJLI.request(j);
    }
}
