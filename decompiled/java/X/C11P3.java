package X;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.11P3, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11P3<T, R> extends AtomicInteger implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public static final long serialVersionUID = -9140123220065488293L;
    public final InterfaceC626120Oh8<? super R> LL;
    public final InterfaceC1487280oo2<? super T, ? extends InterfaceC19473011Gm<? extends R>> LLILLJJLI;
    public final C19487711Md LLILLL = new C19487711Md();
    public final C11P2<R> LLILZ = new C11P2<>(this);
    public final C19500111Qx LLILZIL;
    public final EnumC19492211Nw LLILZLL;
    public InterfaceC420801kM LLIZ;
    public volatile boolean LLIZLLLIL;
    public volatile boolean LLJ;
    public R LLJI;
    public volatile int LLJIJIL;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLJ = true;
        this.LLIZ.dispose();
        C11P2<R> c11p2 = this.LLILZ;
        c11p2.getClass();
        C11JE.dispose(c11p2);
        if (getAndIncrement() == 0) {
            this.LLILZIL.clear();
            this.LLJI = null;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        this.LLIZLLLIL = true;
        LIZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r6.clear();
        r10.LLJI = null;
        r3.onError(r5.terminate());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r10 = this;
            int r0 = r10.getAndIncrement()
            if (r0 == 0) goto L7
            return
        L7:
            X.0Oh8<? super R> r3 = r10.LL
            X.11Nw r8 = r10.LLILZLL
            X.11Qx r6 = r10.LLILZIL
            X.11Md r5 = r10.LLILLL
            r7 = 1
            r4 = 1
        L11:
            boolean r0 = r10.LLJ
            r9 = 0
            if (r0 == 0) goto L23
            r6.clear()
            r10.LLJI = r9
        L1b:
            int r0 = -r4
            int r4 = r10.addAndGet(r0)
            if (r4 != 0) goto L11
            return
        L23:
            int r1 = r10.LLJIJIL
            java.lang.Object r0 = r5.get()
            if (r0 == 0) goto L42
            X.11Nw r0 = X.EnumC19492211Nw.IMMEDIATE
            if (r8 == r0) goto L35
            X.11Nw r0 = X.EnumC19492211Nw.BOUNDARY
            if (r8 != r0) goto L42
            if (r1 != 0) goto L42
        L35:
            r6.clear()
            r10.LLJI = r9
            java.lang.Throwable r0 = r5.terminate()
            r3.onError(r0)
            return
        L42:
            r2 = 0
            if (r1 != 0) goto L74
            boolean r0 = r10.LLIZLLLIL
            java.lang.Object r1 = r6.poll()
            if (r1 != 0) goto L4e
            r2 = 1
        L4e:
            if (r0 == 0) goto L5c
            if (r2 == 0) goto L5f
            java.lang.Throwable r0 = r5.terminate()
            if (r0 != 0) goto L81
            r3.onComplete()
            return
        L5c:
            if (r2 == 0) goto L5f
            goto L1b
        L5f:
            X.0oo2<? super T, ? extends X.11Gm<? extends R>> r0 = r10.LLILLJJLI     // Catch: java.lang.Throwable -> L85
            java.lang.Object r1 = r0.apply(r1)     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = "The mapper returned a null SingleSource"
            X.C1701890uOB.LIZ(r1, r0)     // Catch: java.lang.Throwable -> L85
            X.11Gm r1 = (X.InterfaceC19473011Gm) r1     // Catch: java.lang.Throwable -> L85
            r10.LLJIJIL = r7
            X.11P2<R> r0 = r10.LLILZ
            r1.LIZ(r0)
            goto L1b
        L74:
            r0 = 2
            if (r1 != r0) goto L1b
            R r0 = r10.LLJI
            r10.LLJI = r9
            r3.onNext(r0)
            r10.LLJIJIL = r2
            goto L11
        L81:
            r3.onError(r0)
            return
        L85:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.C11SP.LIZ(r1)
            X.01kM r0 = r10.LLIZ
            r0.dispose()
            r6.clear()
            r5.addThrowable(r1)
            java.lang.Throwable r0 = r5.terminate()
            r3.onError(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11P3.LIZ():void");
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLJ;
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        if (this.LLILLL.addThrowable(th)) {
            if (this.LLILZLL == EnumC19492211Nw.IMMEDIATE) {
                C11P2<R> c11p2 = this.LLILZ;
                c11p2.getClass();
                C11JE.dispose(c11p2);
            }
            this.LLIZLLLIL = true;
            LIZ();
            return;
        }
        C19489211Ms.LIZIZ(th);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        this.LLILZIL.offer(t);
        LIZ();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLIZ, interfaceC420801kM)) {
            this.LLIZ = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    public C11P3(InterfaceC626120Oh8<? super R> interfaceC626120Oh8, InterfaceC1487280oo2<? super T, ? extends InterfaceC19473011Gm<? extends R>> interfaceC1487280oo2, int i, EnumC19492211Nw enumC19492211Nw) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = interfaceC1487280oo2;
        this.LLILZLL = enumC19492211Nw;
        this.LLILZIL = new C19500111Qx(i);
    }
}
