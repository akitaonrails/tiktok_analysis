package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11P1, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11P1<R> extends AtomicReference<InterfaceC420801kM> implements InterfaceC626120Oh8<R> {
    public static final long serialVersionUID = 2620149119579502636L;
    public final InterfaceC626120Oh8<? super R> LL;
    public final C11P0<?, R> LLILLJJLI;

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        C11P0<?, R> c11p0 = this.LLILLJJLI;
        c11p0.LLJ = false;
        c11p0.LIZ();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        C11P0<?, R> c11p0 = this.LLILLJJLI;
        if (c11p0.LLILZ.addThrowable(th)) {
            if (!c11p0.LLILZLL) {
                c11p0.LLIZLLLIL.dispose();
            }
            c11p0.LLJ = false;
            c11p0.LIZ();
            return;
        }
        C19489211Ms.LIZIZ(th);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(R r) {
        this.LL.onNext(r);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11JE.replace(this, interfaceC420801kM);
    }

    public C11P1(InterfaceC626120Oh8<? super R> interfaceC626120Oh8, C11P0<?, R> c11p0) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = c11p0;
    }
}
