package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.11Ot, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19494511Ot<T, U> extends AtomicInteger implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public static final long serialVersionUID = 8828587559905699186L;
    public final InterfaceC626120Oh8<? super U> LL;
    public final InterfaceC1487280oo2<? super T, ? extends C098D<? extends U>> LLILLJJLI;
    public final C19494811Ow<U> LLILLL;
    public final int LLILZ;
    public InterfaceC19494911Ox<T> LLILZIL;
    public InterfaceC420801kM LLILZLL;
    public volatile boolean LLIZ;
    public volatile boolean LLIZLLLIL;
    public volatile boolean LLJ;
    public int LLJI;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLIZLLLIL = true;
        C19494811Ow<U> c19494811Ow = this.LLILLL;
        c19494811Ow.getClass();
        C11JE.dispose(c19494811Ow);
        this.LLILZLL.dispose();
        if (getAndIncrement() == 0) {
            this.LLILZIL.clear();
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        if (this.LLJ) {
            return;
        }
        this.LLJ = true;
        LIZ();
    }

    public final void LIZ() {
        if (getAndIncrement() != 0) {
            return;
        }
        while (!this.LLIZLLLIL) {
            if (!this.LLIZ) {
                boolean z = this.LLJ;
                try {
                    T tPoll = this.LLILZIL.poll();
                    boolean z2 = tPoll == null;
                    if (z) {
                        if (z2) {
                            this.LLIZLLLIL = true;
                            this.LL.onComplete();
                            return;
                        }
                    } else if (!z2) {
                    }
                    try {
                        C098D<? extends U> c098dApply = this.LLILLJJLI.apply(tPoll);
                        C1701890uOB.LIZ(c098dApply, "The mapper returned a null ObservableSource");
                        C098D<? extends U> c098d = c098dApply;
                        this.LLIZ = true;
                        c098d.LIZIZ(this.LLILLL);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C11SP.LIZ(th);
                        dispose();
                        this.LLILZIL.clear();
                        this.LL.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C11SP.LIZ(th2);
                    dispose();
                    this.LLILZIL.clear();
                    this.LL.onError(th2);
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
        this.LLILZIL.clear();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        if (this.LLJ) {
            C19489211Ms.LIZIZ(th);
            return;
        }
        this.LLJ = true;
        dispose();
        this.LL.onError(th);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        if (this.LLJ) {
            return;
        }
        if (this.LLJI == 0) {
            this.LLILZIL.offer(t);
        }
        LIZ();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILZLL, interfaceC420801kM)) {
            this.LLILZLL = interfaceC420801kM;
            if (interfaceC420801kM instanceof InterfaceC19495611Pe) {
                InterfaceC19495111Oz interfaceC19495111Oz = (InterfaceC19495111Oz) interfaceC420801kM;
                int iRequestFusion = interfaceC19495111Oz.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.LLJI = iRequestFusion;
                    this.LLILZIL = interfaceC19495111Oz;
                    this.LLJ = true;
                    this.LL.onSubscribe(this);
                    LIZ();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.LLJI = iRequestFusion;
                    this.LLILZIL = interfaceC19495111Oz;
                    this.LL.onSubscribe(this);
                    return;
                }
            }
            this.LLILZIL = new C19500111Qx(this.LLILZ);
            this.LL.onSubscribe(this);
        }
    }

    public C19494511Ot(C11PI c11pi, InterfaceC1487280oo2 interfaceC1487280oo2, int i) {
        this.LL = c11pi;
        this.LLILLJJLI = interfaceC1487280oo2;
        this.LLILZ = i;
        this.LLILLL = new C19494811Ow<>(c11pi, this);
    }
}
