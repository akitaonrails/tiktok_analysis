package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11PA, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11PA<T, U> extends AtomicInteger implements C11PF<T>, C11LR {
    public static final C11PB<?, ?>[] LLJJIJI = new C11PB[0];
    public static final C11PB<?, ?>[] LLJJIJIIJIL = new C11PB[0];
    public static final long serialVersionUID = -2117620485640801370L;
    public final C11M9<? super U> LL;
    public final InterfaceC1487280oo2<? super T, ? extends C11LE<? extends U>> LLILLJJLI;
    public final boolean LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public volatile InterfaceC19495011Oy<U> LLILZLL;
    public volatile boolean LLIZ;
    public final C19487711Md LLIZLLLIL = new C19487711Md();
    public volatile boolean LLJ;
    public final AtomicReference<C11PB<?, ?>[]> LLJI;
    public final AtomicLong LLJIJIL;
    public C11LR LLJILJIL;
    public long LLJILJILJ;
    public long LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public final int LLJJIII;

    public final boolean LIZ() {
        if (this.LLJ) {
            InterfaceC19495011Oy<U> interfaceC19495011Oy = this.LLILZLL;
            if (interfaceC19495011Oy != null) {
                interfaceC19495011Oy.clear();
            }
            return true;
        }
        if (this.LLILLL || this.LLIZLLLIL.get() == null) {
            return false;
        }
        InterfaceC19495011Oy<U> interfaceC19495011Oy2 = this.LLILZLL;
        if (interfaceC19495011Oy2 != null) {
            interfaceC19495011Oy2.clear();
        }
        Throwable thTerminate = this.LLIZLLLIL.terminate();
        if (thTerminate != C11QG.LIZ) {
            this.LL.onError(thTerminate);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0005 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0050 A[EDGE_INSN: B:142:0x0050->B:24:0x0050 BREAK  A[LOOP:1: B:11:0x0027->B:146:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x004e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11PA.LIZLLL():void");
    }

    public final InterfaceC19495011Oy LJ() {
        InterfaceC19495011Oy<U> c19500111Qx = this.LLILZLL;
        if (c19500111Qx == null) {
            c19500111Qx = this.LLILZ == Integer.MAX_VALUE ? new C19500111Qx<>(this.LLILZIL) : new C19500211Qy<>(this.LLILZ);
            this.LLILZLL = c19500111Qx;
        }
        return c19500111Qx;
    }

    @Override // X.C11LR
    public final void cancel() {
        InterfaceC19495011Oy<U> interfaceC19495011Oy;
        C11PB<?, ?>[] andSet;
        if (this.LLJ) {
            return;
        }
        this.LLJ = true;
        this.LLJILJIL.cancel();
        C11PB<?, ?>[] c11pbArr = this.LLJI.get();
        C11PB<?, ?>[] c11pbArr2 = LLJJIJIIJIL;
        if (c11pbArr != c11pbArr2 && (andSet = this.LLJI.getAndSet(c11pbArr2)) != c11pbArr2) {
            for (C11PB<?, ?> c11pb : andSet) {
                c11pb.getClass();
                C11NC.cancel(c11pb);
            }
            Throwable thTerminate = this.LLIZLLLIL.terminate();
            if (thTerminate != null && thTerminate != C11QG.LIZ) {
                C19489211Ms.LIZIZ(thTerminate);
            }
        }
        if (getAndIncrement() != 0 || (interfaceC19495011Oy = this.LLILZLL) == null) {
            return;
        }
        interfaceC19495011Oy.clear();
    }

    @Override // X.C11M9
    public final void onComplete() {
        if (this.LLIZ) {
            return;
        }
        this.LLIZ = true;
        LIZIZ();
    }

    public final void LIZIZ() {
        if (getAndIncrement() == 0) {
            LIZLLL();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJFF(C11PB<T, U> c11pb) {
        C11PB<?, ?>[] c11pbArr;
        while (true) {
            C11PB<?, ?>[] c11pbArr2 = this.LLJI.get();
            int length = c11pbArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (c11pbArr2[i] != c11pb) {
                i++;
                if (i >= length) {
                    return;
                }
            }
            if (i >= 0) {
                if (length == 1) {
                    c11pbArr = LLJJIJI;
                } else {
                    c11pbArr = new C11PB[length - 1];
                    System.arraycopy(c11pbArr2, 0, c11pbArr, 0, i);
                    System.arraycopy(c11pbArr2, i + 1, c11pbArr, i, (length - i) - 1);
                }
                AtomicReference<C11PB<?, ?>[]> atomicReference = this.LLJI;
                while (!atomicReference.compareAndSet(c11pbArr2, c11pbArr)) {
                    if (atomicReference.get() != c11pbArr2) {
                        break;
                    }
                }
                return;
            }
            return;
        }
    }

    @Override // X.C11M9
    public final void onError(Throwable th) {
        if (this.LLIZ) {
            C19489211Ms.LIZIZ(th);
        } else if (this.LLIZLLLIL.addThrowable(th)) {
            this.LLIZ = true;
            LIZIZ();
        } else {
            C19489211Ms.LIZIZ(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.11Ox, X.11Oy] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.11Ox] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // X.C11M9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNext(T r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11PA.onNext(java.lang.Object):void");
    }

    @Override // X.C11PF, X.C11M9
    public final void onSubscribe(C11LR c11lr) {
        if (C11NC.validate(this.LLJILJIL, c11lr)) {
            this.LLJILJIL = c11lr;
            this.LL.onSubscribe(this);
            if (!this.LLJ) {
                int i = this.LLILZ;
                if (i == Integer.MAX_VALUE) {
                    c11lr.request(Long.MAX_VALUE);
                } else {
                    c11lr.request(i);
                }
            }
        }
    }

    @Override // X.C11LR
    public final void request(long j) {
        if (C11NC.validate(j)) {
            C19492311Nx.LIZ(this.LLJIJIL, j);
            LIZIZ();
        }
    }

    public C11PA(C11M9<? super U> c11m9, InterfaceC1487280oo2<? super T, ? extends C11LE<? extends U>> interfaceC1487280oo2, boolean z, int i, int i2) {
        AtomicReference<C11PB<?, ?>[]> atomicReference = new AtomicReference<>();
        this.LLJI = atomicReference;
        this.LLJIJIL = new AtomicLong();
        this.LL = c11m9;
        this.LLILLJJLI = interfaceC1487280oo2;
        this.LLILLL = z;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLJJIII = Math.max(1, i >> 1);
        atomicReference.lazySet(LLJJIJI);
    }
}
