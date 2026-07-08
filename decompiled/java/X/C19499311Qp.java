package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Qp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19499311Qp<T, R> implements InterfaceC626120Oh8<T> {
    public final C19499111Qn<T, R> LL;
    public final C19500111Qx<T> LLILLJJLI;
    public volatile boolean LLILLL;
    public Throwable LLILZ;
    public final AtomicReference<InterfaceC420801kM> LLILZIL = new AtomicReference<>();

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        this.LLILLL = true;
        this.LL.LIZIZ();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        this.LLILZ = th;
        this.LLILLL = true;
        this.LL.LIZIZ();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        this.LLILLJJLI.offer(t);
        this.LL.LIZIZ();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11JE.setOnce(this.LLILZIL, interfaceC420801kM);
    }

    public C19499311Qp(C19499111Qn<T, R> c19499111Qn, int i) {
        this.LL = c19499111Qn;
        this.LLILLJJLI = new C19500111Qx<>(i);
    }
}
