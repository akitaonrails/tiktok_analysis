package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.11N3, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11N3<T, U> extends C11N2<U> {
    public final C11N4<T, U> LLILLJJLI;
    public final long LLILLL;
    public final T LLILZ;
    public boolean LLILZIL;
    public final AtomicBoolean LLILZLL = new AtomicBoolean();

    public final void LIZ() {
        if (this.LLILZLL.compareAndSet(false, true)) {
            C11N4<T, U> c11n4 = this.LLILLJJLI;
            long j = this.LLILLL;
            T t = this.LLILZ;
            if (j == c11n4.LLILZIL) {
                c11n4.LL.onNext(t);
            }
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        if (this.LLILZIL) {
            return;
        }
        this.LLILZIL = true;
        LIZ();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        if (this.LLILZIL) {
            C19489211Ms.LIZIZ(th);
        } else {
            this.LLILZIL = true;
            this.LLILLJJLI.onError(th);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(U u) {
        if (this.LLILZIL) {
            return;
        }
        this.LLILZIL = true;
        dispose();
        LIZ();
    }

    public C11N3(C11N4<T, U> c11n4, long j, T t) {
        this.LLILLJJLI = c11n4;
        this.LLILLL = j;
        this.LLILZ = t;
    }
}
