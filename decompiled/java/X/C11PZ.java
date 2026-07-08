package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11PZ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11PZ<T, U> extends AtomicReference<InterfaceC420801kM> implements InterfaceC626120Oh8<U> {
    public static final long serialVersionUID = -4606175640614850599L;
    public final long LL;
    public final C11PY<T, U> LLILLJJLI;
    public volatile boolean LLILLL;
    public volatile InterfaceC19494911Ox<U> LLILZ;
    public int LLILZIL;

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        this.LLILLL = true;
        this.LLILLJJLI.LIZJ();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        if (this.LLILLJJLI.LLIZLLLIL.addThrowable(th)) {
            C11PY<T, U> c11py = this.LLILLJJLI;
            if (!c11py.LLILLL) {
                c11py.LIZIZ();
            }
            this.LLILLL = true;
            this.LLILLJJLI.LIZJ();
            return;
        }
        C19489211Ms.LIZIZ(th);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(U u) {
        if (this.LLILZIL == 0) {
            C11PY<T, U> c11py = this.LLILLJJLI;
            if (c11py.get() == 0 && c11py.compareAndSet(0, 1)) {
                c11py.LL.onNext(u);
                if (c11py.decrementAndGet() == 0) {
                    return;
                }
            } else {
                InterfaceC19494911Ox c19500111Qx = this.LLILZ;
                if (c19500111Qx == null) {
                    c19500111Qx = new C19500111Qx(c11py.LLILZIL);
                    this.LLILZ = c19500111Qx;
                }
                c19500111Qx.offer(u);
                if (c11py.getAndIncrement() != 0) {
                    return;
                }
            }
            c11py.LIZLLL();
            return;
        }
        this.LLILLJJLI.LIZJ();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.setOnce(this, interfaceC420801kM) && (interfaceC420801kM instanceof InterfaceC19495611Pe)) {
            InterfaceC19495111Oz interfaceC19495111Oz = (InterfaceC19495111Oz) interfaceC420801kM;
            int iRequestFusion = interfaceC19495111Oz.requestFusion(7);
            if (iRequestFusion == 1) {
                this.LLILZIL = iRequestFusion;
                this.LLILZ = interfaceC19495111Oz;
                this.LLILLL = true;
                this.LLILLJJLI.LIZJ();
                return;
            }
            if (iRequestFusion == 2) {
                this.LLILZIL = iRequestFusion;
                this.LLILZ = interfaceC19495111Oz;
            }
        }
    }

    public C11PZ(C11PY<T, U> c11py, long j) {
        this.LL = j;
        this.LLILLJJLI = c11py;
    }
}
