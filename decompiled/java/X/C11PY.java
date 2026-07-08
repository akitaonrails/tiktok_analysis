package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11PY, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11PY<T, U> extends AtomicInteger implements InterfaceC420801kM, InterfaceC626120Oh8<T> {
    public static final C11PZ<?, ?>[] LLJJIII = new C11PZ[0];
    public static final C11PZ<?, ?>[] LLJJIJI = new C11PZ[0];
    public static final long serialVersionUID = -2117620485640801370L;
    public final InterfaceC626120Oh8<? super U> LL;
    public final InterfaceC1487280oo2<? super T, ? extends C098D<? extends U>> LLILLJJLI;
    public final boolean LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public volatile InterfaceC19495011Oy<U> LLILZLL;
    public volatile boolean LLIZ;
    public final C19487711Md LLIZLLLIL = new C19487711Md();
    public volatile boolean LLJ;
    public final AtomicReference<C11PZ<?, ?>[]> LLJI;
    public InterfaceC420801kM LLJIJIL;
    public long LLJILJIL;
    public long LLJILJILJ;
    public int LLJILLL;
    public final Queue<C098D<? extends U>> LLJJ;
    public int LLJJI;

    public final boolean LIZ() {
        if (this.LLJ) {
            return true;
        }
        Throwable th = this.LLIZLLLIL.get();
        if (this.LLILLL || th == null) {
            return false;
        }
        LIZIZ();
        Throwable thTerminate = this.LLIZLLLIL.terminate();
        if (thTerminate != C11QG.LIZ) {
            this.LL.onError(thTerminate);
        }
        return true;
    }

    public final boolean LIZIZ() {
        C11PZ<?, ?>[] andSet;
        this.LLJIJIL.dispose();
        C11PZ<?, ?>[] c11pzArr = this.LLJI.get();
        C11PZ<?, ?>[] c11pzArr2 = LLJJIJI;
        if (c11pzArr == c11pzArr2 || (andSet = this.LLJI.getAndSet(c11pzArr2)) == c11pzArr2) {
            return false;
        }
        for (C11PZ<?, ?> c11pz : andSet) {
            c11pz.getClass();
            C11JE.dispose(c11pz);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0004 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[LOOP:2: B:50:0x008e->B:134:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9 A[PHI: r10
      0x00e9: PHI (r10v7 int) = (r10v3 int), (r10v8 int) binds: [B:65:0x00c8, B:77:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11PY.LIZLLL():void");
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        Throwable thTerminate;
        if (this.LLJ) {
            return;
        }
        this.LLJ = true;
        if (!LIZIZ() || (thTerminate = this.LLIZLLLIL.terminate()) == null || thTerminate == C11QG.LIZ) {
            return;
        }
        C19489211Ms.LIZIZ(thTerminate);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        if (this.LLIZ) {
            return;
        }
        this.LLIZ = true;
        LIZJ();
    }

    public final void LIZJ() {
        if (getAndIncrement() == 0) {
            LIZLLL();
        }
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJ(C11PZ<T, U> c11pz) {
        C11PZ<?, ?>[] c11pzArr;
        while (true) {
            C11PZ<?, ?>[] c11pzArr2 = this.LLJI.get();
            int length = c11pzArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (c11pzArr2[i] != c11pz) {
                i++;
                if (i >= length) {
                    return;
                }
            }
            if (i >= 0) {
                if (length == 1) {
                    c11pzArr = LLJJIII;
                } else {
                    c11pzArr = new C11PZ[length - 1];
                    System.arraycopy(c11pzArr2, 0, c11pzArr, 0, i);
                    System.arraycopy(c11pzArr2, i + 1, c11pzArr, i, (length - i) - 1);
                }
                AtomicReference<C11PZ<?, ?>[]> atomicReference = this.LLJI;
                while (!atomicReference.compareAndSet(c11pzArr2, c11pzArr)) {
                    if (atomicReference.get() != c11pzArr2) {
                        break;
                    }
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.11Ox] */
    public final void LJFF(C098D<? extends U> c098d) throws Throwable {
        boolean z;
        InterfaceC19495011Oy<U> c19500211Qy;
        do {
            z = true;
            if (c098d instanceof Callable) {
                try {
                    Object objCall = ((Callable) c098d).call();
                    if (objCall != null) {
                        if (get() == 0 && compareAndSet(0, 1)) {
                            this.LL.onNext(objCall);
                            if (decrementAndGet() != 0) {
                                LIZLLL();
                            }
                        } else {
                            InterfaceC19495011Oy<U> interfaceC19495011Oy = this.LLILZLL;
                            ?? r1 = interfaceC19495011Oy;
                            if (interfaceC19495011Oy == false) {
                                if (this.LLILZ == Integer.MAX_VALUE) {
                                    c19500211Qy = new C19500111Qx(this.LLILZIL);
                                } else {
                                    c19500211Qy = new C19500211Qy(this.LLILZ);
                                }
                                this.LLILZLL = c19500211Qy;
                                r1 = c19500211Qy;
                            }
                            if (!r1.offer(objCall)) {
                                onError(new IllegalStateException("Scalar queue full?!"));
                            } else {
                                if (getAndIncrement() != 0) {
                                    return;
                                }
                                LIZLLL();
                            }
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C11SP.LIZ(th);
                    this.LLIZLLLIL.addThrowable(th);
                    LIZJ();
                }
                if (this.LLILZ != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            c098d = (C098D) ((ArrayDeque) this.LLJJ).poll();
                            if (c098d == null) {
                                this.LLJJI--;
                            } else {
                                z = false;
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            throw th2;
                        }
                    }
                } else {
                    return;
                }
            } else {
                long j = this.LLJILJIL;
                this.LLJILJIL = 1 + j;
                C11PZ<?, ?> c11pz = new C11PZ<>(this, j);
                while (true) {
                    C11PZ<?, ?>[] c11pzArr = this.LLJI.get();
                    if (c11pzArr == LLJJIJI) {
                        C11JE.dispose(c11pz);
                        return;
                    }
                    int length = c11pzArr.length;
                    C11PZ<?, ?>[] c11pzArr2 = new C11PZ[length + 1];
                    System.arraycopy(c11pzArr, 0, c11pzArr2, 0, length);
                    c11pzArr2[length] = c11pz;
                    AtomicReference<C11PZ<?, ?>[]> atomicReference = this.LLJI;
                    while (!atomicReference.compareAndSet(c11pzArr, c11pzArr2)) {
                        if (atomicReference.get() != c11pzArr) {
                            break;
                        }
                    }
                    c098d.LIZIZ(c11pz);
                    return;
                }
            }
        } while (!z);
        LIZJ();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        if (this.LLIZ) {
            C19489211Ms.LIZIZ(th);
        } else if (this.LLIZLLLIL.addThrowable(th)) {
            this.LLIZ = true;
            LIZJ();
        } else {
            C19489211Ms.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) throws Throwable {
        if (this.LLIZ) {
            return;
        }
        try {
            C098D<? extends U> c098dApply = this.LLILLJJLI.apply(t);
            C1701890uOB.LIZ(c098dApply, "The mapper returned a null ObservableSource");
            C098D<? extends U> c098d = c098dApply;
            if (this.LLILZ != Integer.MAX_VALUE) {
                synchronized (this) {
                    try {
                        int i = this.LLJJI;
                        if (i == this.LLILZ) {
                            ((ArrayDeque) this.LLJJ).offer(c098d);
                            return;
                        }
                        this.LLJJI = i + 1;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            LJFF(c098d);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C11SP.LIZ(th2);
            this.LLJIJIL.dispose();
            onError(th2);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLJIJIL, interfaceC420801kM)) {
            this.LLJIJIL = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    public C11PY(int i, int i2, InterfaceC626120Oh8 interfaceC626120Oh8, InterfaceC1487280oo2 interfaceC1487280oo2, boolean z) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = interfaceC1487280oo2;
        this.LLILLL = z;
        this.LLILZ = i;
        this.LLILZIL = i2;
        if (i != Integer.MAX_VALUE) {
            this.LLJJ = new ArrayDeque(i);
        }
        this.LLJI = new AtomicReference<>(LLJJIII);
    }
}
