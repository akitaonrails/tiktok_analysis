package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: renamed from: X.11P9, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11P9<R> extends AtomicReference<InterfaceC420801kM> implements InterfaceC19474811He<R>, InterfaceC420801kM {
    public static final long serialVersionUID = -502562646270949838L;
    public final /* synthetic */ C11P8 LL;

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return C11JE.isDisposed(get());
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11JE.dispose(this);
    }

    public C11P9(C11P8 c11p8) {
        this.LL = c11p8;
    }

    @Override // X.InterfaceC19474811He
    public final void onError(Throwable th) {
        C11P8 c11p8 = this.LL;
        c11p8.LLILLL.LIZIZ(this);
        if (c11p8.LLILZIL.addThrowable(th)) {
            if (!c11p8.LLILLJJLI) {
                c11p8.LLIZLLLIL.dispose();
                c11p8.LLILLL.dispose();
            }
            c11p8.LLILZ.decrementAndGet();
            if (c11p8.getAndIncrement() == 0) {
                c11p8.LIZ();
                return;
            }
            return;
        }
        C19489211Ms.LIZIZ(th);
    }

    @Override // X.InterfaceC19474811He
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11JE.setOnce(this, interfaceC420801kM);
    }

    @Override // X.InterfaceC19474811He
    public final void onSuccess(R r) {
        C19500111Qx<R> c19500111Qx;
        C11P8 c11p8 = this.LL;
        c11p8.LLILLL.LIZIZ(this);
        boolean z = false;
        if (c11p8.get() == 0 && c11p8.compareAndSet(0, 1)) {
            c11p8.LL.onNext(r);
            if (c11p8.LLILZ.decrementAndGet() == 0) {
                z = true;
            }
            C19500111Qx<R> c19500111Qx2 = c11p8.LLIZ.get();
            if (z && (c19500111Qx2 == null || c19500111Qx2.isEmpty())) {
                Throwable thTerminate = c11p8.LLILZIL.terminate();
                if (thTerminate != null) {
                    c11p8.LL.onError(thTerminate);
                    return;
                } else {
                    c11p8.LL.onComplete();
                    return;
                }
            }
            if (c11p8.decrementAndGet() == 0) {
                return;
            }
        } else {
            loop0: while (true) {
                c19500111Qx = c11p8.LLIZ.get();
                if (c19500111Qx != null) {
                    break;
                }
                c19500111Qx = new C19500111Qx<>(C11NN.LL);
                AtomicReference<C19500111Qx<R>> atomicReference = c11p8.LLIZ;
                while (!atomicReference.compareAndSet(null, c19500111Qx)) {
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                break loop0;
            }
            synchronized (c19500111Qx) {
                try {
                    c19500111Qx.offer(r);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            c11p8.LLILZ.decrementAndGet();
            if (c11p8.getAndIncrement() != 0) {
                return;
            }
        }
        c11p8.LIZ();
    }
}
