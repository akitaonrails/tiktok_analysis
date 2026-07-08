package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11PB, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11PB<T, U> extends AtomicReference<C11LR> implements C11PF<U>, InterfaceC420801kM {
    public static final long serialVersionUID = -4606175640614850599L;
    public final long LL;
    public final C11PA<T, U> LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public volatile boolean LLILZIL;
    public volatile InterfaceC19494911Ox<U> LLILZLL;
    public long LLIZ;
    public int LLIZLLLIL;

    @Override // X.C11M9
    public final void onComplete() {
        this.LLILZIL = true;
        this.LLILLJJLI.LIZIZ();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return get() == C11NC.CANCELLED;
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11NC.cancel(this);
    }

    public final void LIZ(long j) {
        if (this.LLIZLLLIL != 1) {
            long j2 = this.LLIZ + j;
            if (j2 >= this.LLILLL) {
                this.LLIZ = 0L;
                get().request(j2);
            } else {
                this.LLIZ = j2;
            }
        }
    }

    @Override // X.C11M9
    public final void onError(Throwable th) {
        lazySet(C11NC.CANCELLED);
        C11PA<T, U> c11pa = this.LLILLJJLI;
        if (c11pa.LLIZLLLIL.addThrowable(th)) {
            this.LLILZIL = true;
            if (!c11pa.LLILLL) {
                c11pa.LLJILJIL.cancel();
                for (C11PB<?, ?> c11pb : c11pa.LLJI.getAndSet(C11PA.LLJJIJIIJIL)) {
                    c11pb.getClass();
                    C11NC.cancel(c11pb);
                }
            }
            c11pa.LIZIZ();
            return;
        }
        C19489211Ms.LIZIZ(th);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b A[RETURN] */
    @Override // X.C11M9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNext(U r9) {
        /*
            r8 = this;
            int r1 = r8.LLIZLLLIL
            r0 = 2
            if (r1 == r0) goto L91
            X.11PA<T, U> r2 = r8.LLILLJJLI
            int r0 = r2.get()
            java.lang.String r5 = "Inner queue full?!"
            if (r0 != 0) goto L6a
            r1 = 0
            r0 = 1
            boolean r0 = r2.compareAndSet(r1, r0)
            if (r0 == 0) goto L6a
            java.util.concurrent.atomic.AtomicLong r0 = r2.LLJIJIL
            long r6 = r0.get()
            X.11Ox<U> r1 = r8.LLILZLL
            r3 = 0
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 == 0) goto L4c
            if (r1 == 0) goto L2d
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L5b
        L2d:
            X.11M9<? super U> r0 = r2.LL
            r0.onNext(r9)
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 == 0) goto L40
            java.util.concurrent.atomic.AtomicLong r0 = r2.LLJIJIL
            r0.decrementAndGet()
        L40:
            r0 = 1
            r8.LIZ(r0)
        L45:
            int r0 = r2.decrementAndGet()
            if (r0 != 0) goto L8d
            return
        L4c:
            if (r1 != 0) goto L5b
            X.11Ox<U> r1 = r8.LLILZLL
            if (r1 != 0) goto L5b
            X.11Qy r1 = new X.11Qy
            int r0 = r2.LLILZIL
            r1.<init>(r0)
            r8.LLILZLL = r1
        L5b:
            boolean r0 = r1.offer(r9)
            if (r0 != 0) goto L45
            X.11MF r0 = new X.11MF
            r0.<init>(r5)
            r2.onError(r0)
            return
        L6a:
            X.11Ox<U> r1 = r8.LLILZLL
            if (r1 != 0) goto L77
            X.11Qy r1 = new X.11Qy
            int r0 = r2.LLILZIL
            r1.<init>(r0)
            r8.LLILZLL = r1
        L77:
            boolean r0 = r1.offer(r9)
            if (r0 != 0) goto L86
            X.11MF r0 = new X.11MF
            r0.<init>(r5)
            r2.onError(r0)
            return
        L86:
            int r0 = r2.getAndIncrement()
            if (r0 == 0) goto L8d
            return
        L8d:
            r2.LIZLLL()
            return
        L91:
            X.11PA<T, U> r0 = r8.LLILLJJLI
            r0.LIZIZ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11PB.onNext(java.lang.Object):void");
    }

    @Override // X.C11PF, X.C11M9
    public final void onSubscribe(C11LR c11lr) {
        if (C11NC.setOnce(this, c11lr)) {
            if (c11lr instanceof InterfaceC19495511Pd) {
                InterfaceC19495111Oz interfaceC19495111Oz = (InterfaceC19495111Oz) c11lr;
                int iRequestFusion = interfaceC19495111Oz.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.LLIZLLLIL = iRequestFusion;
                    this.LLILZLL = interfaceC19495111Oz;
                    this.LLILZIL = true;
                    this.LLILLJJLI.LIZIZ();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.LLIZLLLIL = iRequestFusion;
                    this.LLILZLL = interfaceC19495111Oz;
                }
            }
            c11lr.request(this.LLILZ);
        }
    }

    public C11PB(C11PA<T, U> c11pa, long j) {
        this.LL = j;
        this.LLILLJJLI = c11pa;
        int i = c11pa.LLILZIL;
        this.LLILZ = i;
        this.LLILLL = i >> 2;
    }
}
