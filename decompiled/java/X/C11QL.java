package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11QL, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11QL<T> extends AtomicInteger implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public static final long serialVersionUID = 802743776666017014L;
    public final InterfaceC626120Oh8<? super T> LL;
    public final C11PR<Throwable> LLILZ;
    public final C098D<T> LLIZ;
    public volatile boolean LLIZLLLIL;
    public final AtomicInteger LLILLJJLI = new AtomicInteger();
    public final C19487711Md LLILLL = new C19487711Md();
    public final C11QL<T>.a LLILZIL = new a();
    public final AtomicReference<InterfaceC420801kM> LLILZLL = new AtomicReference<>();

    /* JADX INFO: renamed from: X.11QL$a */
    public final class a extends AtomicReference<InterfaceC420801kM> implements InterfaceC626120Oh8<Object> {
        public static final long serialVersionUID = 3254781284376480842L;

        @Override // X.InterfaceC626120Oh8
        public final void onComplete() {
            C11QL c11ql = C11QL.this;
            C11JE.dispose(c11ql.LLILZLL);
            C11QM.LIZ(c11ql.LL, c11ql, c11ql.LLILLL);
        }

        public a() {
        }

        @Override // X.InterfaceC626120Oh8
        public final void onError(Throwable th) {
            C11QL c11ql = C11QL.this;
            C11JE.dispose(c11ql.LLILZLL);
            C11QM.LIZIZ(c11ql.LL, th, c11ql, c11ql.LLILLL);
        }

        @Override // X.InterfaceC626120Oh8
        public final void onNext(Object obj) {
            C11QL.this.LIZ();
        }

        @Override // X.InterfaceC626120Oh8
        public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
            C11JE.setOnce(this, interfaceC420801kM);
        }
    }

    public final void LIZ() {
        if (this.LLILLJJLI.getAndIncrement() == 0) {
            while (!isDisposed()) {
                if (!this.LLIZLLLIL) {
                    this.LLIZLLLIL = true;
                    this.LLIZ.LIZIZ(this);
                }
                if (this.LLILLJJLI.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11JE.dispose(this.LLILZLL);
        C11JE.dispose(this.LLILZIL);
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return C11JE.isDisposed(this.LLILZLL.get());
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        C11JE.dispose(this.LLILZIL);
        C11QM.LIZ(this.LL, this, this.LLILLL);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        C11JE.replace(this.LLILZLL, null);
        this.LLIZLLLIL = false;
        this.LLILZ.onNext(th);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        C11QM.LIZJ(this.LL, t, this, this.LLILLL);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11JE.replace(this.LLILZLL, interfaceC420801kM);
    }

    public C11QL(InterfaceC626120Oh8<? super T> interfaceC626120Oh8, C11PR<Throwable> c11pr, C098D<T> c098d) {
        this.LL = interfaceC626120Oh8;
        this.LLILZ = c11pr;
        this.LLIZ = c098d;
    }
}
