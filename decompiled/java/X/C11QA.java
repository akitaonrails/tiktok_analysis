package X;

/* JADX INFO: renamed from: X.11QA, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11QA<T, R> implements InterfaceC626120Oh8<T>, InterfaceC19495611Pe<R> {
    public final InterfaceC626120Oh8<? super R> LL;
    public InterfaceC420801kM LLILLJJLI;
    public InterfaceC19495611Pe<T> LLILLL;
    public boolean LLILZ;
    public int LLILZIL;

    public void clear() {
        this.LLILLL.clear();
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLILLJJLI.dispose();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLJJLI.isDisposed();
    }

    @Override // X.InterfaceC19494911Ox
    public final boolean isEmpty() {
        return this.LLILLL.isEmpty();
    }

    @Override // X.InterfaceC626120Oh8
    public void onComplete() {
        if (this.LLILZ) {
            return;
        }
        this.LLILZ = true;
        this.LL.onComplete();
    }

    public C11QA(InterfaceC626120Oh8<? super R> interfaceC626120Oh8) {
        this.LL = interfaceC626120Oh8;
    }

    public final void LIZ(Throwable th) {
        C11SP.LIZ(th);
        this.LLILLJJLI.dispose();
        onError(th);
    }

    public final int LIZIZ(int i) {
        InterfaceC19495611Pe<T> interfaceC19495611Pe = this.LLILLL;
        if (interfaceC19495611Pe != null && (i & 4) == 0) {
            int iRequestFusion = interfaceC19495611Pe.requestFusion(i);
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

    @Override // X.InterfaceC626120Oh8
    public void onError(Throwable th) {
        if (this.LLILZ) {
            C19489211Ms.LIZIZ(th);
        } else {
            this.LLILZ = true;
            this.LL.onError(th);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILLJJLI, interfaceC420801kM)) {
            this.LLILLJJLI = interfaceC420801kM;
            if (interfaceC420801kM instanceof InterfaceC19495611Pe) {
                this.LLILLL = (InterfaceC19495611Pe) interfaceC420801kM;
            }
            this.LL.onSubscribe(this);
        }
    }
}
