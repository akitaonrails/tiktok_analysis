package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import defpackage.Config;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.11P0, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11P0<T, R> extends AtomicInteger implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public static final long serialVersionUID = -6951100001833242599L;
    public final InterfaceC626120Oh8<? super R> LL;
    public final InterfaceC1487280oo2<? super T, ? extends C098D<? extends R>> LLILLJJLI;
    public final int LLILLL;
    public final C19487711Md LLILZ = new C19487711Md();
    public final C11P1<R> LLILZIL;
    public final boolean LLILZLL;
    public InterfaceC19494911Ox<T> LLIZ;
    public InterfaceC420801kM LLIZLLLIL;
    public volatile boolean LLJ;
    public volatile boolean LLJI;
    public volatile boolean LLJIJIL;
    public int LLJILJIL;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLJIJIL = true;
        this.LLIZLLLIL.dispose();
        C11P1<R> c11p1 = this.LLILZIL;
        c11p1.getClass();
        C11JE.dispose(c11p1);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        this.LLJI = true;
        LIZ();
    }

    public final void LIZ() {
        if (getAndIncrement() != 0) {
            return;
        }
        InterfaceC626120Oh8<? super R> interfaceC626120Oh8 = this.LL;
        InterfaceC19494911Ox<T> interfaceC19494911Ox = this.LLIZ;
        C19487711Md c19487711Md = this.LLILZ;
        while (true) {
            if (!this.LLJ) {
                if (this.LLJIJIL) {
                    interfaceC19494911Ox.clear();
                    return;
                }
                if (!this.LLILZLL && c19487711Md.get() != null) {
                    interfaceC19494911Ox.clear();
                    this.LLJIJIL = true;
                    interfaceC626120Oh8.onError(c19487711Md.terminate());
                    return;
                }
                boolean z = this.LLJI;
                try {
                    T tPoll = interfaceC19494911Ox.poll();
                    boolean z2 = tPoll == null;
                    if (z) {
                        if (z2) {
                            this.LLJIJIL = true;
                            Throwable thTerminate = c19487711Md.terminate();
                            if (thTerminate != null) {
                                interfaceC626120Oh8.onError(thTerminate);
                                return;
                            } else {
                                interfaceC626120Oh8.onComplete();
                                return;
                            }
                        }
                    } else if (!z2) {
                    }
                    try {
                        C098D<? extends R> c098dApply = this.LLILLJJLI.apply(tPoll);
                        C1701890uOB.LIZ(c098dApply, "The mapper returned a null ObservableSource");
                        C098D<? extends R> c098d = c098dApply;
                        if (c098d instanceof Callable) {
                            try {
                                Config config = (Object) ((Callable) c098d).call();
                                if (config != null && !this.LLJIJIL) {
                                    interfaceC626120Oh8.onNext(config);
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C11SP.LIZ(th);
                                c19487711Md.addThrowable(th);
                            }
                        } else {
                            this.LLJ = true;
                            c098d.LIZIZ(this.LLILZIL);
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C11SP.LIZ(th2);
                        this.LLJIJIL = true;
                        this.LLIZLLLIL.dispose();
                        interfaceC19494911Ox.clear();
                        c19487711Md.addThrowable(th2);
                        interfaceC626120Oh8.onError(c19487711Md.terminate());
                        return;
                    }
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    C11SP.LIZ(th3);
                    this.LLJIJIL = true;
                    this.LLIZLLLIL.dispose();
                    c19487711Md.addThrowable(th3);
                    interfaceC626120Oh8.onError(c19487711Md.terminate());
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        if (this.LLILZ.addThrowable(th)) {
            this.LLJI = true;
            LIZ();
        } else {
            C19489211Ms.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        if (this.LLJILJIL == 0) {
            this.LLIZ.offer(t);
        }
        LIZ();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLIZLLLIL, interfaceC420801kM)) {
            this.LLIZLLLIL = interfaceC420801kM;
            if (interfaceC420801kM instanceof InterfaceC19495611Pe) {
                InterfaceC19495111Oz interfaceC19495111Oz = (InterfaceC19495111Oz) interfaceC420801kM;
                int iRequestFusion = interfaceC19495111Oz.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.LLJILJIL = iRequestFusion;
                    this.LLIZ = interfaceC19495111Oz;
                    this.LLJI = true;
                    this.LL.onSubscribe(this);
                    LIZ();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.LLJILJIL = iRequestFusion;
                    this.LLIZ = interfaceC19495111Oz;
                    this.LL.onSubscribe(this);
                    return;
                }
            }
            this.LLIZ = new C19500111Qx(this.LLILLL);
            this.LL.onSubscribe(this);
        }
    }

    public C11P0(InterfaceC626120Oh8<? super R> interfaceC626120Oh8, InterfaceC1487280oo2<? super T, ? extends C098D<? extends R>> interfaceC1487280oo2, int i, boolean z) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = interfaceC1487280oo2;
        this.LLILLL = i;
        this.LLILZLL = z;
        this.LLILZIL = new C11P1<>(interfaceC626120Oh8, this);
    }
}
