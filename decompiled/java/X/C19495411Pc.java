package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.11Pc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19495411Pc<T, U extends Collection<? super T>> extends AtomicBoolean implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public static final long serialVersionUID = -8223395059921494546L;
    public final InterfaceC626120Oh8<? super U> LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final Callable<U> LLILZ;
    public InterfaceC420801kM LLILZIL;
    public final ArrayDeque<U> LLILZLL = new ArrayDeque<>();
    public long LLIZ;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLILZIL.dispose();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILZIL.isDisposed();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        while (!this.LLILZLL.isEmpty()) {
            this.LL.onNext(this.LLILZLL.poll());
        }
        this.LL.onComplete();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        this.LLILZLL.clear();
        this.LL.onError(th);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        long j = this.LLIZ;
        this.LLIZ = 1 + j;
        if (j % ((long) this.LLILLL) == 0) {
            try {
                U uCall = this.LLILZ.call();
                C1701890uOB.LIZ(uCall, "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
                this.LLILZLL.offer(uCall);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LLILZLL.clear();
                this.LLILZIL.dispose();
                this.LL.onError(th);
                return;
            }
        }
        Iterator<U> it2 = this.LLILZLL.iterator();
        while (it2.hasNext()) {
            U next = it2.next();
            next.add(t);
            if (this.LLILLJJLI <= next.size()) {
                it2.remove();
                this.LL.onNext(next);
            }
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILZIL, interfaceC420801kM)) {
            this.LLILZIL = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    public C19495411Pc(InterfaceC626120Oh8<? super U> interfaceC626120Oh8, int i, int i2, Callable<U> callable) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = callable;
    }
}
