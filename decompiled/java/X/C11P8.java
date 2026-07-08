package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11P8, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11P8<T, R> extends AtomicInteger implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public static final long serialVersionUID = 8600231336733376951L;
    public final InterfaceC626120Oh8<? super R> LL;
    public final boolean LLILLJJLI;
    public final InterfaceC1487280oo2<? super T, ? extends InterfaceC19473011Gm<? extends R>> LLILZLL;
    public InterfaceC420801kM LLIZLLLIL;
    public volatile boolean LLJ;
    public final C11NJ LLILLL = new C11NJ();
    public final C19487711Md LLILZIL = new C19487711Md();
    public final AtomicInteger LLILZ = new AtomicInteger(1);
    public final AtomicReference<C19500111Qx<R>> LLIZ = new AtomicReference<>();

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLJ = true;
        this.LLIZLLLIL.dispose();
        this.LLILLL.dispose();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0055 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r7 = this;
            X.0Oh8<? super R> r3 = r7.LL
            java.util.concurrent.atomic.AtomicInteger r6 = r7.LLILZ
            java.util.concurrent.atomic.AtomicReference<X.11Qx<R>> r5 = r7.LLIZ
            r4 = 1
        L7:
            boolean r0 = r7.LLJ
            if (r0 == 0) goto L19
            java.util.concurrent.atomic.AtomicReference<X.11Qx<R>> r0 = r7.LLIZ
            java.lang.Object r0 = r0.get()
            X.11Qx r0 = (X.C19500111Qx) r0
            if (r0 == 0) goto L18
            r0.clear()
        L18:
            return
        L19:
            boolean r0 = r7.LLILLJJLI
            if (r0 != 0) goto L3c
            X.11Md r0 = r7.LLILZIL
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L3c
            X.11Md r0 = r7.LLILZIL
            java.lang.Throwable r1 = r0.terminate()
            java.util.concurrent.atomic.AtomicReference<X.11Qx<R>> r0 = r7.LLIZ
            java.lang.Object r0 = r0.get()
            X.11Qx r0 = (X.C19500111Qx) r0
            if (r0 == 0) goto L38
            r0.clear()
        L38:
            r3.onError(r1)
            return
        L3c:
            int r0 = r6.get()
            r2 = 0
            if (r0 != 0) goto L65
            r1 = 1
        L44:
            java.lang.Object r0 = r5.get()
            X.11Qx r0 = (X.C19500111Qx) r0
            if (r0 == 0) goto L63
            java.lang.Object r0 = r0.poll()
            if (r0 != 0) goto L53
        L52:
            r2 = 1
        L53:
            if (r1 == 0) goto L67
            if (r2 == 0) goto L71
            X.11Md r0 = r7.LLILZIL
            java.lang.Throwable r0 = r0.terminate()
            if (r0 == 0) goto L75
            r3.onError(r0)
            return
        L63:
            r0 = 0
            goto L52
        L65:
            r1 = 0
            goto L44
        L67:
            if (r2 == 0) goto L71
            int r0 = -r4
            int r4 = r7.addAndGet(r0)
            if (r4 != 0) goto L7
            return
        L71:
            r3.onNext(r0)
            goto L7
        L75:
            r3.onComplete()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11P8.LIZ():void");
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        this.LLILZ.decrementAndGet();
        if (getAndIncrement() == 0) {
            LIZ();
        }
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLJ;
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        this.LLILZ.decrementAndGet();
        if (this.LLILZIL.addThrowable(th)) {
            if (!this.LLILLJJLI) {
                this.LLILLL.dispose();
            }
            if (getAndIncrement() == 0) {
                LIZ();
                return;
            }
            return;
        }
        C19489211Ms.LIZIZ(th);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) throws Throwable {
        try {
            InterfaceC19473011Gm<? extends R> interfaceC19473011GmApply = this.LLILZLL.apply(t);
            C1701890uOB.LIZ(interfaceC19473011GmApply, "The mapper returned a null SingleSource");
            InterfaceC19473011Gm<? extends R> interfaceC19473011Gm = interfaceC19473011GmApply;
            this.LLILZ.getAndIncrement();
            C11P9 c11p9 = new C11P9(this);
            if (!this.LLJ && this.LLILLL.LIZ(c11p9)) {
                interfaceC19473011Gm.LIZ(c11p9);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            this.LLIZLLLIL.dispose();
            onError(th);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLIZLLLIL, interfaceC420801kM)) {
            this.LLIZLLLIL = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    public C11P8(InterfaceC626120Oh8<? super R> interfaceC626120Oh8, InterfaceC1487280oo2<? super T, ? extends InterfaceC19473011Gm<? extends R>> interfaceC1487280oo2, boolean z) {
        this.LL = interfaceC626120Oh8;
        this.LLILZLL = interfaceC1487280oo2;
        this.LLILLJJLI = z;
    }
}
