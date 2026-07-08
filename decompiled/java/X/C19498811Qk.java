package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.11Qk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19498811Qk<T, R> extends AtomicInteger implements InterfaceC420801kM {
    public static final long serialVersionUID = 8567835998786448817L;
    public final InterfaceC626120Oh8<? super R> LL;
    public final InterfaceC1487280oo2<? super Object[], ? extends R> LLILLJJLI;
    public final C19499211Qo<T, R>[] LLILLL;
    public Object[] LLILZ;
    public final C19500111Qx<Object[]> LLILZIL;
    public final boolean LLILZLL;
    public volatile boolean LLIZ;
    public volatile boolean LLIZLLLIL;
    public final C19487711Md LLJ = new C19487711Md();
    public int LLJI;
    public int LLJIJIL;

    public final void LIZ() {
        for (C19499211Qo<T, R> c19499211Qo : this.LLILLL) {
            c19499211Qo.getClass();
            C11JE.dispose(c19499211Qo);
        }
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        if (this.LLIZ) {
            return;
        }
        this.LLIZ = true;
        LIZ();
        if (getAndIncrement() == 0) {
            LIZIZ(this.LLILZIL);
        }
    }

    public final void LIZJ() throws Throwable {
        if (getAndIncrement() != 0) {
            return;
        }
        C19500111Qx<Object[]> c19500111Qx = this.LLILZIL;
        InterfaceC626120Oh8<? super R> interfaceC626120Oh8 = this.LL;
        boolean z = this.LLILZLL;
        int iAddAndGet = 1;
        while (!this.LLIZ) {
            if (!z && this.LLJ.get() != null) {
                LIZ();
                LIZIZ(c19500111Qx);
                interfaceC626120Oh8.onError(this.LLJ.terminate());
                return;
            }
            boolean z2 = this.LLIZLLLIL;
            Object[] objArrPoll = c19500111Qx.poll();
            boolean z3 = objArrPoll == null;
            try {
                if (z2) {
                    if (z3) {
                        LIZIZ(c19500111Qx);
                        Throwable thTerminate = this.LLJ.terminate();
                        if (thTerminate == null) {
                            interfaceC626120Oh8.onComplete();
                            return;
                        } else {
                            interfaceC626120Oh8.onError(thTerminate);
                            return;
                        }
                    }
                } else if (z3) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
                R rApply = this.LLILLJJLI.apply(objArrPoll);
                C1701890uOB.LIZ(rApply, "The combiner returned a null value");
                interfaceC626120Oh8.onNext(rApply);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C11SP.LIZ(th);
                this.LLJ.addThrowable(th);
                LIZ();
                LIZIZ(c19500111Qx);
                interfaceC626120Oh8.onError(this.LLJ.terminate());
                return;
            }
        }
        LIZIZ(c19500111Qx);
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLIZ;
    }

    public final void LIZIZ(C19500111Qx<?> c19500111Qx) {
        synchronized (this) {
            try {
                this.LLILZ = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        c19500111Qx.clear();
    }

    public C19498811Qk(int i, int i2, InterfaceC626120Oh8 interfaceC626120Oh8, InterfaceC1487280oo2 interfaceC1487280oo2, boolean z) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = interfaceC1487280oo2;
        this.LLILZLL = z;
        this.LLILZ = new Object[i];
        C19499211Qo<T, R>[] c19499211QoArr = new C19499211Qo[i];
        for (int i3 = 0; i3 < i; i3++) {
            c19499211QoArr[i3] = new C19499211Qo<>(this, i3);
        }
        this.LLILLL = c19499211QoArr;
        this.LLILZIL = new C19500111Qx<>(i2);
    }
}
