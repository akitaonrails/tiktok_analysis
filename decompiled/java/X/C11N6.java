package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11N6, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11N6<T> extends AtomicInteger implements InterfaceC626120Oh8, InterfaceC420801kM {
    public final AtomicReference<InterfaceC420801kM> LL = new AtomicReference<>();
    public final AtomicReference<InterfaceC420801kM> LLILLJJLI = new AtomicReference<>();
    public final C11N8 LLILLL = new C11N8();
    public final C11IV LLILZ;
    public final InterfaceC626120Oh8<? super T> LLILZIL;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        EnumC19489911Mz.LIZJ(this.LLILLJJLI);
        EnumC19489911Mz.LIZJ(this.LL);
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LL.get() == EnumC19489911Mz.LL;
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        if (isDisposed()) {
            return;
        }
        this.LL.lazySet(EnumC19489911Mz.LL);
        EnumC19489911Mz.LIZJ(this.LLILLJJLI);
        InterfaceC626120Oh8<? super T> interfaceC626120Oh8 = this.LLILZIL;
        C11N8 c11n8 = this.LLILLL;
        if (getAndIncrement() == 0) {
            Throwable thLIZIZ = c11n8.LIZIZ();
            if (thLIZIZ != null) {
                interfaceC626120Oh8.onError(thLIZIZ);
            } else {
                interfaceC626120Oh8.onComplete();
            }
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        if (!isDisposed()) {
            this.LL.lazySet(EnumC19489911Mz.LL);
            EnumC19489911Mz.LIZJ(this.LLILLJJLI);
            InterfaceC626120Oh8<? super T> interfaceC626120Oh8 = this.LLILZIL;
            C11N8 c11n8 = this.LLILLL;
            if (c11n8.LIZ(th)) {
                if (getAndIncrement() == 0) {
                    interfaceC626120Oh8.onError(c11n8.LIZIZ());
                    return;
                }
                return;
            }
            C19489211Ms.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        if (!isDisposed()) {
            InterfaceC626120Oh8<? super T> interfaceC626120Oh8 = this.LLILZIL;
            C11N8 c11n8 = this.LLILLL;
            if (get() == 0 && compareAndSet(0, 1)) {
                interfaceC626120Oh8.onNext(t);
                if (decrementAndGet() != 0) {
                    Throwable thLIZIZ = c11n8.LIZIZ();
                    if (thLIZIZ != null) {
                        interfaceC626120Oh8.onError(thLIZIZ);
                    } else {
                        interfaceC626120Oh8.onComplete();
                    }
                    this.LL.lazySet(EnumC19489911Mz.LL);
                    EnumC19489911Mz.LIZJ(this.LLILLJJLI);
                }
            }
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11N1 c11n1 = new C11N1() { // from class: X.11N7
            @Override // X.C11IY
            public final void onComplete() {
                this.LLILLJJLI.LLILLJJLI.lazySet(EnumC19489911Mz.LL);
                EnumC19489911Mz.LIZJ(this.LLILLJJLI.LL);
            }

            @Override // X.C11IY
            public final void onError(Throwable th) {
                this.LLILLJJLI.LLILLJJLI.lazySet(EnumC19489911Mz.LL);
                this.LLILLJJLI.onError(th);
            }
        };
        if (C19489711Mx.LIZIZ(this.LLILLJJLI, c11n1, C11N6.class)) {
            this.LLILZIL.onSubscribe(this);
            this.LLILZ.LIZIZ(c11n1);
            C19489711Mx.LIZIZ(this.LL, interfaceC420801kM, C11N6.class);
        }
    }

    public C11N6(C11IV c11iv, InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
        this.LLILZ = c11iv;
        this.LLILZIL = interfaceC626120Oh8;
    }
}
