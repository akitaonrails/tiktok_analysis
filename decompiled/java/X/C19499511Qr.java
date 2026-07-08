package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Qr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19499511Qr<T> extends AtomicReference<InterfaceC420801kM> implements InterfaceC626120Oh8<T> {
    public static final long serialVersionUID = -1185974347409665484L;
    public final C19499611Qs<T> LL;
    public final int LLILLJJLI;
    public final InterfaceC626120Oh8<? super T> LLILLL;
    public boolean LLILZ;

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        if (this.LLILZ) {
            this.LLILLL.onComplete();
        } else if (this.LL.LIZ(this.LLILLJJLI)) {
            this.LLILZ = true;
            this.LLILLL.onComplete();
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        if (this.LLILZ) {
            this.LLILLL.onError(th);
        } else if (this.LL.LIZ(this.LLILLJJLI)) {
            this.LLILZ = true;
            this.LLILLL.onError(th);
        } else {
            C19489211Ms.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        if (this.LLILZ) {
            this.LLILLL.onNext(t);
        } else if (this.LL.LIZ(this.LLILLJJLI)) {
            this.LLILZ = true;
            this.LLILLL.onNext(t);
        } else {
            get().dispose();
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11JE.setOnce(this, interfaceC420801kM);
    }

    public C19499511Qr(C19499611Qs<T> c19499611Qs, int i, InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
        this.LL = c19499611Qs;
        this.LLILLJJLI = i;
        this.LLILLL = interfaceC626120Oh8;
    }
}
