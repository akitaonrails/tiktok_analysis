package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.11Os, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19494411Os<T> extends AtomicInteger implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public static final long serialVersionUID = 3610901111000061034L;
    public final C11IY LL;
    public final InterfaceC1487280oo2<? super T, ? extends C11IV> LLILLJJLI;
    public final EnumC19492211Nw LLILLL;
    public final C19487711Md LLILZ = new C19487711Md();
    public final C19494711Ov LLILZIL = new C19494711Ov(this);
    public final int LLILZLL;
    public InterfaceC19494911Ox<T> LLIZ;
    public InterfaceC420801kM LLIZLLLIL;
    public volatile boolean LLJ;
    public volatile boolean LLJI;
    public volatile boolean LLJIJIL;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLJIJIL = true;
        this.LLIZLLLIL.dispose();
        C19494711Ov c19494711Ov = this.LLILZIL;
        c19494711Ov.getClass();
        C11JE.dispose(c19494711Ov);
        if (getAndIncrement() == 0) {
            this.LLIZ.clear();
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        this.LLJI = true;
        LIZ();
    }

    public final void LIZ() {
        C11IV c11iv;
        boolean z;
        if (getAndIncrement() != 0) {
            return;
        }
        C19487711Md c19487711Md = this.LLILZ;
        EnumC19492211Nw enumC19492211Nw = this.LLILLL;
        while (!this.LLJIJIL) {
            if (!this.LLJ) {
                if (enumC19492211Nw == EnumC19492211Nw.BOUNDARY && c19487711Md.get() != null) {
                    this.LLJIJIL = true;
                    this.LLIZ.clear();
                    this.LL.onError(c19487711Md.terminate());
                    return;
                }
                boolean z2 = this.LLJI;
                try {
                    T tPoll = this.LLIZ.poll();
                    if (tPoll != null) {
                        C11IV c11ivApply = this.LLILLJJLI.apply(tPoll);
                        C1701890uOB.LIZ(c11ivApply, "The mapper returned a null CompletableSource");
                        c11iv = c11ivApply;
                        z = false;
                    } else {
                        c11iv = null;
                        z = true;
                    }
                    if (z2) {
                        if (z) {
                            this.LLJIJIL = true;
                            Throwable thTerminate = c19487711Md.terminate();
                            if (thTerminate != null) {
                                this.LL.onError(thTerminate);
                                return;
                            } else {
                                this.LL.onComplete();
                                return;
                            }
                        }
                    } else if (!z) {
                    }
                    this.LLJ = true;
                    c11iv.LIZIZ(this.LLILZIL);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C11SP.LIZ(th);
                    this.LLJIJIL = true;
                    this.LLIZ.clear();
                    this.LLIZLLLIL.dispose();
                    c19487711Md.addThrowable(th);
                    this.LL.onError(c19487711Md.terminate());
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
        this.LLIZ.clear();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        if (this.LLILZ.addThrowable(th)) {
            if (this.LLILLL == EnumC19492211Nw.IMMEDIATE) {
                this.LLJIJIL = true;
                C19494711Ov c19494711Ov = this.LLILZIL;
                c19494711Ov.getClass();
                C11JE.dispose(c19494711Ov);
                Throwable thTerminate = this.LLILZ.terminate();
                if (thTerminate != C11QG.LIZ) {
                    this.LL.onError(thTerminate);
                }
                if (getAndIncrement() == 0) {
                    this.LLIZ.clear();
                    return;
                }
                return;
            }
            this.LLJI = true;
            LIZ();
            return;
        }
        C19489211Ms.LIZIZ(th);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        if (t != null) {
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
                    this.LLIZ = interfaceC19495111Oz;
                    this.LLJI = true;
                    this.LL.onSubscribe(this);
                    LIZ();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.LLIZ = interfaceC19495111Oz;
                    this.LL.onSubscribe(this);
                    return;
                }
            }
            this.LLIZ = new C19500111Qx(this.LLILZLL);
            this.LL.onSubscribe(this);
        }
    }

    public C19494411Os(C11IY c11iy, InterfaceC1487280oo2<? super T, ? extends C11IV> interfaceC1487280oo2, EnumC19492211Nw enumC19492211Nw, int i) {
        this.LL = c11iy;
        this.LLILLJJLI = interfaceC1487280oo2;
        this.LLILLL = enumC19492211Nw;
        this.LLILZLL = i;
    }
}
