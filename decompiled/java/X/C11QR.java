package X;

/* JADX INFO: renamed from: X.11QR, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11QR<T> implements C11LR {
    public final C11M9<? super T> LL;
    public final T LLILLJJLI;
    public boolean LLILLL;

    @Override // X.C11LR
    public final void cancel() {
    }

    @Override // X.C11LR
    public final void request(long j) {
        if (j > 0 && !this.LLILLL) {
            this.LLILLL = true;
            C11M9<? super T> c11m9 = this.LL;
            c11m9.onNext(this.LLILLJJLI);
            c11m9.onComplete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11QR(Object obj, C11QQ c11qq) {
        this.LLILLJJLI = obj;
        this.LL = c11qq;
    }
}
