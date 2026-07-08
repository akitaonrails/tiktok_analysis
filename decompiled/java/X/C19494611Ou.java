package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.11Ou, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19494611Ou<T> extends C11NT<T> implements C11PF<T> {
    public static final long serialVersionUID = -2514538129242366402L;
    public final C11M9<? super T> LL;
    public final InterfaceC19495011Oy<T> LLILLJJLI;
    public final boolean LLILLL;
    public final InterfaceC781210Ukh LLILZ;
    public C11LR LLILZIL;
    public volatile boolean LLILZLL;
    public volatile boolean LLIZ;
    public Throwable LLIZLLLIL;
    public final AtomicLong LLJ = new AtomicLong();
    public boolean LLJI;

    @Override // X.C11M9
    public final void onComplete() {
        this.LLIZ = true;
        if (this.LLJI) {
            this.LL.onComplete();
        } else {
            LIZIZ();
        }
    }

    @Override // X.C11NT, X.C11LR
    public final void cancel() {
        if (this.LLILZLL) {
            return;
        }
        this.LLILZLL = true;
        this.LLILZIL.cancel();
        if (getAndIncrement() == 0) {
            this.LLILLJJLI.clear();
        }
    }

    @Override // X.C11NT, X.InterfaceC19494911Ox
    public final void clear() {
        this.LLILLJJLI.clear();
    }

    @Override // X.C11NT, X.InterfaceC19494911Ox
    public final boolean isEmpty() {
        return this.LLILLJJLI.isEmpty();
    }

    @Override // X.C11NT, X.InterfaceC19494911Ox
    public final T poll() {
        return this.LLILLJJLI.poll();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if (r2 == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if (r10 == Long.MAX_VALUE) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        r12.LLJ.addAndGet(-r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        r5 = addAndGet(-r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        if (r5 != 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            r12 = this;
            int r0 = r12.getAndIncrement()
            if (r0 != 0) goto L68
            X.11Oy<T> r7 = r12.LLILLJJLI
            X.11M9<? super T> r6 = r12.LL
            r5 = 1
        Lb:
            boolean r1 = r12.LLIZ
            boolean r0 = r7.isEmpty()
            boolean r0 = r12.LIZ(r1, r0, r6)
            if (r0 == 0) goto L18
            return
        L18:
            java.util.concurrent.atomic.AtomicLong r0 = r12.LLJ
            long r10 = r0.get()
            r8 = 0
            r2 = 0
        L22:
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 == 0) goto L41
            boolean r0 = r12.LLIZ
            java.lang.Object r4 = r7.poll()
            if (r4 != 0) goto L3f
            r1 = 1
        L2f:
            boolean r0 = r12.LIZ(r0, r1, r6)
            if (r0 == 0) goto L36
            return
        L36:
            if (r1 != 0) goto L4e
            r6.onNext(r4)
            r0 = 1
            long r2 = r2 + r0
            goto L22
        L3f:
            r1 = 0
            goto L2f
        L41:
            boolean r1 = r12.LLIZ
            boolean r0 = r7.isEmpty()
            boolean r0 = r12.LIZ(r1, r0, r6)
            if (r0 == 0) goto L4e
            return
        L4e:
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 == 0) goto L61
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 == 0) goto L61
            java.util.concurrent.atomic.AtomicLong r4 = r12.LLJ
            long r0 = -r2
            r4.addAndGet(r0)
        L61:
            int r0 = -r5
            int r5 = r12.addAndGet(r0)
            if (r5 != 0) goto Lb
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19494611Ou.LIZIZ():void");
    }

    @Override // X.C11M9
    public final void onError(Throwable th) {
        this.LLIZLLLIL = th;
        this.LLIZ = true;
        if (this.LLJI) {
            this.LL.onError(th);
        } else {
            LIZIZ();
        }
    }

    @Override // X.C11M9
    public final void onNext(T t) throws Throwable {
        if (!this.LLILLJJLI.offer(t)) {
            this.LLILZIL.cancel();
            C11MF c11mf = new C11MF("Buffer is full");
            try {
                this.LLILZ.run();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C11SP.LIZ(th);
                c11mf.initCause(th);
            }
            onError(c11mf);
            return;
        }
        if (this.LLJI) {
            this.LL.onNext(null);
        } else {
            LIZIZ();
        }
    }

    @Override // X.C11PF, X.C11M9
    public final void onSubscribe(C11LR c11lr) {
        if (C11NC.validate(this.LLILZIL, c11lr)) {
            this.LLILZIL = c11lr;
            this.LL.onSubscribe(this);
            c11lr.request(Long.MAX_VALUE);
        }
    }

    @Override // X.C11NT, X.C11LR
    public final void request(long j) {
        if (!this.LLJI && C11NC.validate(j)) {
            C19492311Nx.LIZ(this.LLJ, j);
            LIZIZ();
        }
    }

    @Override // X.C11NT, X.InterfaceC19495111Oz
    public final int requestFusion(int i) {
        if ((i & 2) != 0) {
            this.LLJI = true;
            return 2;
        }
        return 0;
    }

    public final boolean LIZ(boolean z, boolean z2, C11M9<? super T> c11m9) {
        if (this.LLILZLL) {
            this.LLILLJJLI.clear();
            return true;
        }
        if (z) {
            if (this.LLILLL) {
                if (z2) {
                    Throwable th = this.LLIZLLLIL;
                    if (th != null) {
                        c11m9.onError(th);
                        return true;
                    }
                    c11m9.onComplete();
                    return true;
                }
                return false;
            }
            Throwable th2 = this.LLIZLLLIL;
            if (th2 != null) {
                this.LLILLJJLI.clear();
                c11m9.onError(th2);
                return true;
            }
            if (z2) {
                c11m9.onComplete();
                return true;
            }
            return false;
        }
        return false;
    }

    public C19494611Ou(C11M9<? super T> c11m9, int i, boolean z, boolean z2, InterfaceC781210Ukh interfaceC781210Ukh) {
        InterfaceC19495011Oy<T> c19500211Qy;
        this.LL = c11m9;
        this.LLILZ = interfaceC781210Ukh;
        this.LLILLL = z2;
        if (z) {
            c19500211Qy = new C19500111Qx<>(i);
        } else {
            c19500211Qy = new C19500211Qy<>(i);
        }
        this.LLILLJJLI = c19500211Qy;
    }
}
