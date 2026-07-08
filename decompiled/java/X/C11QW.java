package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11QW, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11QW<T, U> extends AtomicInteger implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public static final long serialVersionUID = 1418547743690811973L;
    public final InterfaceC626120Oh8<? super T> LL;
    public final AtomicReference<InterfaceC420801kM> LLILLJJLI = new AtomicReference<>();
    public final C11QW<T, U>.a LLILLL = new a();
    public final C19487711Md LLILZ = new C19487711Md();

    /* JADX INFO: renamed from: X.11QW$a */
    public final class a extends AtomicReference<InterfaceC420801kM> implements InterfaceC626120Oh8<U> {
        public static final long serialVersionUID = -8693423678067375039L;

        @Override // X.InterfaceC626120Oh8
        public final void onComplete() {
            C11QW c11qw = C11QW.this;
            C11JE.dispose(c11qw.LLILLJJLI);
            C11QM.LIZ(c11qw.LL, c11qw, c11qw.LLILZ);
        }

        public a() {
        }

        @Override // X.InterfaceC626120Oh8
        public final void onError(Throwable th) {
            C11QW c11qw = C11QW.this;
            C11JE.dispose(c11qw.LLILLJJLI);
            C11QM.LIZIZ(c11qw.LL, th, c11qw, c11qw.LLILZ);
        }

        @Override // X.InterfaceC626120Oh8
        public final void onNext(U u) {
            C11JE.dispose(this);
            C11QW c11qw = C11QW.this;
            C11JE.dispose(c11qw.LLILLJJLI);
            C11QM.LIZ(c11qw.LL, c11qw, c11qw.LLILZ);
        }

        @Override // X.InterfaceC626120Oh8
        public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
            C11JE.setOnce(this, interfaceC420801kM);
        }
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11JE.dispose(this.LLILLJJLI);
        C11JE.dispose(this.LLILLL);
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return C11JE.isDisposed(this.LLILLJJLI.get());
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        C11JE.dispose(this.LLILLL);
        C11QM.LIZ(this.LL, this, this.LLILZ);
    }

    public C11QW(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
        this.LL = interfaceC626120Oh8;
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        C11JE.dispose(this.LLILLL);
        C11QM.LIZIZ(this.LL, th, this, this.LLILZ);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        C11QM.LIZJ(this.LL, t, this, this.LLILZ);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11JE.setOnce(this.LLILLJJLI, interfaceC420801kM);
    }
}
