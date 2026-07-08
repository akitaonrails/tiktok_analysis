package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.11Qn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19499111Qn<T, R> extends AtomicInteger implements InterfaceC420801kM {
    public static final long serialVersionUID = 2983708048395377667L;
    public final InterfaceC626120Oh8<? super R> LL;
    public final InterfaceC1487280oo2<? super Object[], ? extends R> LLILLJJLI;
    public final C19499311Qp<T, R>[] LLILLL;
    public final T[] LLILZ;
    public final boolean LLILZIL;
    public volatile boolean LLILZLL;

    public final void LIZ() {
        for (C19499311Qp<T, R> c19499311Qp : this.LLILLL) {
            c19499311Qp.LLILLJJLI.clear();
        }
        for (C19499311Qp<T, R> c19499311Qp2 : this.LLILLL) {
            C11JE.dispose(c19499311Qp2.LLILZIL);
        }
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        if (this.LLILZLL) {
            return;
        }
        this.LLILZLL = true;
        for (C19499311Qp<T, R> c19499311Qp : this.LLILLL) {
            C11JE.dispose(c19499311Qp.LLILZIL);
        }
        if (getAndIncrement() == 0) {
            for (C19499311Qp<T, R> c19499311Qp2 : this.LLILLL) {
                c19499311Qp2.LLILLJJLI.clear();
            }
        }
    }

    public final void LIZIZ() {
        Throwable th;
        if (getAndIncrement() != 0) {
            return;
        }
        C19499311Qp<T, R>[] c19499311QpArr = this.LLILLL;
        InterfaceC626120Oh8<? super R> interfaceC626120Oh8 = this.LL;
        T[] tArr = this.LLILZ;
        boolean z = this.LLILZIL;
        int iAddAndGet = 1;
        while (true) {
            int i = 0;
            int i2 = 0;
            for (C19499311Qp<T, R> c19499311Qp : c19499311QpArr) {
                if (tArr[i2] == null) {
                    boolean z2 = c19499311Qp.LLILLL;
                    T tPoll = c19499311Qp.LLILLJJLI.poll();
                    boolean z3 = tPoll == null;
                    if (this.LLILZLL) {
                        LIZ();
                        return;
                    }
                    if (z2) {
                        if (!z) {
                            Throwable th2 = c19499311Qp.LLILZ;
                            if (th2 != null) {
                                LIZ();
                                interfaceC626120Oh8.onError(th2);
                                return;
                            } else if (z3) {
                                LIZ();
                                interfaceC626120Oh8.onComplete();
                                return;
                            }
                        } else if (z3) {
                            Throwable th3 = c19499311Qp.LLILZ;
                            LIZ();
                            if (th3 != null) {
                                interfaceC626120Oh8.onError(th3);
                                return;
                            } else {
                                interfaceC626120Oh8.onComplete();
                                return;
                            }
                        }
                    } else if (z3) {
                        i++;
                    }
                    tArr[i2] = tPoll;
                } else if (c19499311Qp.LLILLL && !z && (th = c19499311Qp.LLILZ) != null) {
                    LIZ();
                    interfaceC626120Oh8.onError(th);
                    return;
                }
                i2++;
            }
            if (i != 0) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                try {
                    R rApply = this.LLILLJJLI.apply(tArr.clone());
                    C1701890uOB.LIZ(rApply, "The zipper returned a null value");
                    interfaceC626120Oh8.onNext(rApply);
                    Arrays.fill(tArr, (Object) null);
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    C11SP.LIZ(th4);
                    LIZ();
                    interfaceC626120Oh8.onError(th4);
                    return;
                }
            }
        }
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILZLL;
    }

    public C19499111Qn(InterfaceC626120Oh8<? super R> interfaceC626120Oh8, InterfaceC1487280oo2<? super Object[], ? extends R> interfaceC1487280oo2, int i, boolean z) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = interfaceC1487280oo2;
        this.LLILLL = new C19499311Qp[i];
        this.LLILZ = (T[]) new Object[i];
        this.LLILZIL = z;
    }
}
