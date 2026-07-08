package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11Or, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class RunnableC19494311Or<T> extends C11K7<T> implements InterfaceC626120Oh8<T>, Runnable {
    public static final long serialVersionUID = 6576896619930983584L;
    public final InterfaceC626120Oh8<? super T> LL;
    public final C11RN LLILLJJLI;
    public final boolean LLILLL;
    public final int LLILZ;
    public InterfaceC19494911Ox<T> LLILZIL;
    public InterfaceC420801kM LLILZLL;
    public Throwable LLIZ;
    public volatile boolean LLIZLLLIL;
    public volatile boolean LLJ;
    public int LLJI;
    public boolean LLJIJIL;

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0072, code lost:
    
        r3 = addAndGet(-r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0077, code lost:
    
        if (r3 != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0079, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r7.LLJIJIL
            r6 = 1
            if (r0 == 0) goto L4c
            r3 = 1
        L6:
            boolean r0 = r7.LLJ
            if (r0 != 0) goto L24
            boolean r2 = r7.LLIZLLLIL
            java.lang.Throwable r1 = r7.LLIZ
            boolean r0 = r7.LLILLL
            if (r0 != 0) goto L25
            if (r2 == 0) goto L25
            if (r1 == 0) goto L25
            r7.LLJ = r6
            X.0Oh8<? super T> r1 = r7.LL
            java.lang.Throwable r0 = r7.LLIZ
            r1.onError(r0)
            X.11RN r0 = r7.LLILLJJLI
            r0.dispose()
        L24:
            return
        L25:
            X.0Oh8<? super T> r1 = r7.LL
            r0 = 0
            r1.onNext(r0)
            if (r2 == 0) goto L44
            r7.LLJ = r6
            java.lang.Throwable r1 = r7.LLIZ
            if (r1 == 0) goto L3e
            X.0Oh8<? super T> r0 = r7.LL
            r0.onError(r1)
        L38:
            X.11RN r0 = r7.LLILLJJLI
            r0.dispose()
            return
        L3e:
            X.0Oh8<? super T> r0 = r7.LL
            r0.onComplete()
            goto L38
        L44:
            int r0 = -r3
            int r3 = r7.addAndGet(r0)
            if (r3 != 0) goto L6
            return
        L4c:
            X.11Ox<T> r5 = r7.LLILZIL
            X.0Oh8<? super T> r4 = r7.LL
            r3 = 1
        L51:
            boolean r1 = r7.LLIZLLLIL
            boolean r0 = r5.isEmpty()
            boolean r0 = r7.LIZ(r1, r0, r4)
            if (r0 == 0) goto L5e
            return
        L5e:
            boolean r0 = r7.LLIZLLLIL
            java.lang.Object r2 = r5.poll()     // Catch: java.lang.Throwable -> L7e
            if (r2 != 0) goto L67
            goto L69
        L67:
            r1 = 0
            goto L6a
        L69:
            r1 = 1
        L6a:
            boolean r0 = r7.LIZ(r0, r1, r4)
            if (r0 != 0) goto L24
            if (r1 == 0) goto L7a
            int r0 = -r3
            int r3 = r7.addAndGet(r0)
            if (r3 != 0) goto L51
            return
        L7a:
            r4.onNext(r2)
            goto L5e
        L7e:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.C11SP.LIZ(r1)
            r7.LLJ = r6
            X.01kM r0 = r7.LLILZLL
            r0.dispose()
            r5.clear()
            r4.onError(r1)
            X.11RN r0 = r7.LLILLJJLI
            r0.dispose()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC19494311Or.LIZIZ():void");
    }

    @Override // X.C11K7, X.InterfaceC19494911Ox
    public final void clear() {
        this.LLILZIL.clear();
    }

    @Override // X.C11K7, X.InterfaceC420801kM
    public final void dispose() {
        if (this.LLJ) {
            return;
        }
        this.LLJ = true;
        this.LLILZLL.dispose();
        this.LLILLJJLI.dispose();
        if (getAndIncrement() == 0) {
            this.LLILZIL.clear();
        }
    }

    @Override // X.C11K7, X.InterfaceC19494911Ox
    public final boolean isEmpty() {
        return this.LLILZIL.isEmpty();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        if (this.LLIZLLLIL) {
            return;
        }
        this.LLIZLLLIL = true;
        LIZJ();
    }

    @Override // X.C11K7, X.InterfaceC19494911Ox
    public final T poll() {
        return this.LLILZIL.poll();
    }

    public final void LIZJ() {
        if (getAndIncrement() == 0) {
            this.LLILLJJLI.LIZIZ(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            LIZIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    @Override // X.C11K7, X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLJ;
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        if (this.LLIZLLLIL) {
            C19489211Ms.LIZIZ(th);
            return;
        }
        this.LLIZ = th;
        this.LLIZLLLIL = true;
        LIZJ();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        if (this.LLIZLLLIL) {
            return;
        }
        if (this.LLJI != 2) {
            this.LLILZIL.offer(t);
        }
        LIZJ();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILZLL, interfaceC420801kM)) {
            this.LLILZLL = interfaceC420801kM;
            if (interfaceC420801kM instanceof InterfaceC19495611Pe) {
                InterfaceC19495111Oz interfaceC19495111Oz = (InterfaceC19495111Oz) interfaceC420801kM;
                int iRequestFusion = interfaceC19495111Oz.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.LLJI = iRequestFusion;
                    this.LLILZIL = interfaceC19495111Oz;
                    this.LLIZLLLIL = true;
                    this.LL.onSubscribe(this);
                    LIZJ();
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

    @Override // X.C11K7, X.InterfaceC19495111Oz
    public final int requestFusion(int i) {
        if ((i & 2) != 0) {
            this.LLJIJIL = true;
            return 2;
        }
        return 0;
    }

    public final boolean LIZ(boolean z, boolean z2, InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
        if (this.LLJ) {
            this.LLILZIL.clear();
            return true;
        }
        if (z) {
            Throwable th = this.LLIZ;
            if (this.LLILLL) {
                if (z2) {
                    this.LLJ = true;
                    if (th != null) {
                        interfaceC626120Oh8.onError(th);
                    } else {
                        interfaceC626120Oh8.onComplete();
                    }
                    this.LLILLJJLI.dispose();
                    return true;
                }
                return false;
            }
            if (th != null) {
                this.LLJ = true;
                this.LLILZIL.clear();
                interfaceC626120Oh8.onError(th);
                this.LLILLJJLI.dispose();
                return true;
            }
            if (z2) {
                this.LLJ = true;
                interfaceC626120Oh8.onComplete();
                this.LLILLJJLI.dispose();
                return true;
            }
            return false;
        }
        return false;
    }

    public RunnableC19494311Or(InterfaceC626120Oh8<? super T> interfaceC626120Oh8, C11RN c11rn, boolean z, int i) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = c11rn;
        this.LLILLL = z;
        this.LLILZ = i;
    }
}
