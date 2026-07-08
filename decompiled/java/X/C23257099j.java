package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CompletedExceptionally;

/* JADX INFO: renamed from: X.099j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23257099j<T> extends C099D<Unit> implements C094D<T> {
    public static final AtomicIntegerFieldUpdater LLILZLL = AtomicIntegerFieldUpdater.newUpdater(C23257099j.class, "_signal");
    public final C09AJ<T> LLILZ;
    public final C1DEV LLILZIL;
    public volatile int _signal;

    @Override // X.C094D
    public final AnonymousClass0955<T> getChannel() {
        return this;
    }

    public final void LJLJLJ() {
        this.LLILZIL.LIZIZ(null);
        if (isActive() || !this.LLILZIL.LJFF(null)) {
            return;
        }
        Throwable thLJJJJI = LJJJJI();
        Object objLJJJJZI = LJJJJZI();
        LJLJL(thLJJJJI, (objLJJJJZI instanceof CompletedExceptionally) && ((CompletedExceptionally) objLJJJJZI).getHandled());
    }

    @Override // X.AnonymousClass0955
    public final boolean LJ() {
        return !isActive();
    }

    @Override // X.AnonymousClass0955
    public final void LIZJ(Function1 function1) {
        throw new UnsupportedOperationException("RxObservableCoroutine doesn't support invokeOnClose");
    }

    @Override // X.AnonymousClass0955
    public final Object LJIIIIZZ(T t) {
        if (!this.LLILZIL.LJFF(null)) {
            return C094N.LIZIZ;
        }
        Throwable thLJLJJL = LJLJJL(t);
        if (thLJLJJL == null) {
            return Unit.LIZ;
        }
        return new C094M(thLJLJJL);
    }

    @Override // X.AnonymousClass0955
    public final boolean LJIIJJI(Throwable th) {
        return LJJIIZI(th);
    }

    @Override // X.C099D
    public final void LJLJJI(Unit unit) {
        if (LLILZLL.compareAndSet(this, 0, -1) && this.LLILZIL.LJFF(null)) {
            LJLJL(null, false);
        }
    }

    public final Throwable LJLJJL(T t) {
        boolean z;
        if (!isActive()) {
            Throwable thLJJJJI = LJJJJI();
            Object objLJJJJZI = LJJJJZI();
            if ((objLJJJJZI instanceof CompletedExceptionally) && ((CompletedExceptionally) objLJJJJZI).getHandled()) {
                z = true;
            } else {
                z = false;
            }
            LJLJL(thLJJJJI, z);
            return LJJJLL();
        }
        try {
            this.LLILZ.onNext(t);
            LJLJLJ();
            return null;
        } catch (Throwable th) {
            C08EF c08ef = new C08EF(th);
            boolean zLJJIIZI = LJJIIZI(c08ef);
            LJLJLJ();
            if (!zLJJIIZI) {
                C095J.LIZ(this.LLILLL, c08ef);
                return LJJJLL();
            }
            return c08ef;
        }
    }

    public C23257099j(CoroutineContext coroutineContext, C19482611Ke c19482611Ke) {
        super(coroutineContext, false, true);
        this.LLILZ = c19482611Ke;
        this.LLILZIL = C2191201ApK.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    @Override // X.AnonymousClass0955
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJI(T r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C23258099k
            if (r0 == 0) goto L44
            r4 = r7
            X.099k r4 = (X.C23258099k) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r3 = r4.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZIL
            r0 = 1
            if (r1 == 0) goto L2f
            if (r1 != r0) goto L4b
            java.lang.Object r6 = r4.LLILLJJLI
            X.099j r0 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L26:
            java.lang.Throwable r0 = r0.LJLJJL(r6)
            if (r0 != 0) goto L4a
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2f:
            X.C155000ia.LIZIZ(r3)
            X.1DEV r1 = r5.LLILZIL
            r4.LL = r5
            r4.LLILLJJLI = r6
            r4.LLILZIL = r0
            r0 = 0
            java.lang.Object r0 = r1.LIZLLL(r0, r4)
            if (r0 != r2) goto L42
            return r2
        L42:
            r0 = r5
            goto L26
        L44:
            X.099k r4 = new X.099k
            r4.<init>(r5, r7)
            goto L12
        L4a:
            throw r0
        L4b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23257099j.LJIJI(java.lang.Object, X.05Vn):java.lang.Object");
    }

    @Override // X.C099D
    public final void LJLILLLLZI(Throwable th, boolean z) {
        if (LLILZLL.compareAndSet(this, 0, -1) && this.LLILZIL.LJFF(null)) {
            LJLJL(th, z);
        }
    }

    public final void LJLJL(Throwable th, boolean z) {
        try {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = LLILZLL;
            if (atomicIntegerFieldUpdater.get(this) == -2) {
                return;
            }
            atomicIntegerFieldUpdater.set(this, -2);
            if (th != null) {
                if ((th instanceof C08EF) && !z) {
                    C095J.LIZ(this.LLILLL, th);
                } else if (th != LJJJLL() || !this.LLILZ.isDisposed()) {
                    try {
                        this.LLILZ.onError(th);
                    } catch (Exception e) {
                        C13SZ.LIZ(th, e);
                        C095J.LIZ(this.LLILLL, th);
                    }
                }
            } else {
                try {
                    this.LLILZ.onComplete();
                } catch (Exception e2) {
                    C095J.LIZ(this.LLILLL, e2);
                }
            }
        } finally {
            this.LLILZIL.LIZIZ(null);
        }
    }
}
