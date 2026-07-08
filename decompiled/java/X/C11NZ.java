package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import defpackage.Config;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import lip.j;

/* JADX INFO: renamed from: X.11NZ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11NZ<T> implements C098D<T> {
    public final C11RS LJJLIIIJJI() {
        C1701890uOB.LIZIZ(1, "bufferSize");
        InterfaceC19500611Rc<T> interfaceC19500611Rc = new InterfaceC19500611Rc<T>() { // from class: X.11RZ
            public final int LIZ = 1;

            @Override // X.InterfaceC19500611Rc
            public final C11RY<T> call() {
                final int i = this.LIZ;
                return new C11RW<T>(i) { // from class: X.11Ra
                    public static final long serialVersionUID = -5898283885385201806L;
                    public final int LLILLL;

                    @Override // X.C11RW
                    public final void LIZ() {
                        if (this.LLILLJJLI > this.LLILLL) {
                            this.LLILLJJLI--;
                            set(get().get());
                        }
                    }

                    {
                        this.LLILLL = i;
                    }
                };
            }
        };
        AtomicReference atomicReference = new AtomicReference();
        return new C11RS(new C11RT(atomicReference, interfaceC19500611Rc), this, atomicReference, interfaceC19500611Rc);
    }

    public abstract void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8);

    public final T LIZLLL() {
        C345810Dh5 c345810Dh5 = new C345810Dh5();
        LIZIZ(c345810Dh5);
        T tLIZ = c345810Dh5.LIZ();
        if (tLIZ != null) {
            return tLIZ;
        }
        throw new NoSuchElementException();
    }

    public final T LJFF() {
        T tLIZLLL = new C11IK(this).LIZLLL();
        if (tLIZLLL != null) {
            return tLIZLLL;
        }
        throw new NoSuchElementException();
    }

    public final C19488511Ml LJJIFFI() {
        return new C19488511Ml(this, C1701890uOB.LIZ);
    }

    public final C19500811Re LJJLIIJ() {
        final AtomicReference atomicReference = new AtomicReference();
        final C098D<T> c098d = new C098D<T>(atomicReference) { // from class: X.11R6
            public final AtomicReference<C11R5<T>> LL;

            {
                this.LL = atomicReference;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x0008, code lost:
            
                continue;
             */
            @Override // X.C098D
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(X.InterfaceC626120Oh8<? super T> r8) {
                /*
                    r7 = this;
                    X.11R7 r4 = new X.11R7
                    r4.<init>(r8)
                    r8.onSubscribe(r4)
                L8:
                    java.util.concurrent.atomic.AtomicReference<X.11R5<T>> r0 = r7.LL
                    java.lang.Object r2 = r0.get()
                    X.11R5 r2 = (X.C11R5) r2
                    r6 = 0
                    if (r2 == 0) goto L4a
                    boolean r0 = r2.isDisposed()
                    if (r0 != 0) goto L4a
                    r5 = r2
                L1a:
                    java.util.concurrent.atomic.AtomicReference<X.11R7<T>[]> r0 = r5.LLILLJJLI
                    java.lang.Object r3 = r0.get()
                    X.11R7[] r3 = (X.C11R7[]) r3
                    X.11R7[] r0 = X.C11R5.LLILZLL
                    if (r3 == r0) goto L8
                    int r1 = r3.length
                    int r0 = r1 + 1
                    X.11R7[] r2 = new X.C11R7[r0]
                    java.lang.System.arraycopy(r3, r6, r2, r6, r1)
                    r2[r1] = r4
                    java.util.concurrent.atomic.AtomicReference<X.11R7<T>[]> r1 = r5.LLILLJJLI
                L32:
                    boolean r0 = r1.compareAndSet(r3, r2)
                    if (r0 == 0) goto L43
                    r0 = 0
                    boolean r0 = r4.compareAndSet(r0, r5)
                    if (r0 != 0) goto L42
                    r5.LIZ(r4)
                L42:
                    return
                L43:
                    java.lang.Object r0 = r1.get()
                    if (r0 == r3) goto L32
                    goto L1a
                L4a:
                    X.11R5 r5 = new X.11R5
                    java.util.concurrent.atomic.AtomicReference<X.11R5<T>> r0 = r7.LL
                    r5.<init>(r0)
                    java.util.concurrent.atomic.AtomicReference<X.11R5<T>> r1 = r7.LL
                L53:
                    boolean r0 = r1.compareAndSet(r2, r5)
                    if (r0 != 0) goto L1a
                    java.lang.Object r0 = r1.get()
                    if (r0 == r2) goto L53
                    goto L8
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C11R6.LIZIZ(X.0Oh8):void");
            }
        };
        return new C19500811Re(new AnonymousClass0984<T>(c098d, this, atomicReference) { // from class: X.11R4
            public final C098D<T> LL;
            public final AtomicReference<C11R5<T>> LLILLJJLI;
            public final C098D<T> LLILLL;

            @Override // X.C11NZ
            public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
                this.LLILLL.LIZIZ(interfaceC626120Oh8);
            }

            @Override // X.AnonymousClass0984
            public final void LJLLLLLL(C09JN<? super InterfaceC420801kM> c09jn) throws Throwable {
                C11R5<T> c11r5;
                boolean z;
                loop0: while (true) {
                    c11r5 = this.LLILLJJLI.get();
                    z = false;
                    if (c11r5 != null && !c11r5.isDisposed()) {
                        break;
                    }
                    C11R5<T> c11r52 = new C11R5<>(this.LLILLJJLI);
                    AtomicReference<C11R5<T>> atomicReference2 = this.LLILLJJLI;
                    while (!atomicReference2.compareAndSet(c11r5, c11r52)) {
                        if (atomicReference2.get() != c11r5) {
                            break;
                        }
                    }
                    c11r5 = c11r52;
                    break loop0;
                }
                if (!c11r5.LLILLL.get() && c11r5.LLILLL.compareAndSet(false, true)) {
                    z = true;
                }
                try {
                    c09jn.accept(c11r5);
                    if (z) {
                        this.LL.LIZIZ(c11r5);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C11SP.LIZ(th);
                    throw C11QG.LIZIZ(th);
                }
            }

            {
                this.LLILLL = c098d;
                this.LL = this;
                this.LLILLJJLI = atomicReference;
            }
        });
    }

    public final InterfaceC420801kM LJJLJ() {
        AnonymousClass0988 anonymousClass0988 = C19487811Me.LIZLLL;
        return LJJZZI(anonymousClass0988, C19487811Me.LJFF, C19487811Me.LIZJ, anonymousClass0988);
    }

    public final C11MK LJLJLLL() {
        C1701890uOB.LIZIZ(16, "capacityHint");
        return new C11MK(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> C11NZ<T> LJIILJJIL(Iterable<? extends C098D<? extends T>> iterable) {
        C19482111Jz c19482111JzLJJJJIZL = LJJJJIZL(iterable);
        C1076630e7h c1076630e7h = C19487811Me.LIZ;
        int i = C11NN.LL;
        C1701890uOB.LIZIZ(i, "prefetch");
        if (c19482111JzLJJJJIZL instanceof InterfaceCallableC1559550qgb) {
            Object objCall = ((InterfaceCallableC1559550qgb) c19482111JzLJJJJIZL).call();
            if (objCall == null) {
                return C11IR.LL;
            }
            return new C11KA(c1076630e7h, objCall);
        }
        return new j(c19482111JzLJJJJIZL, c1076630e7h, i, EnumC19492211Nw.BOUNDARY);
    }

    public static <T> C11NZ<T> LJIILLIIL(C098D<? extends T>... c098dArr) {
        if (c098dArr.length == 0) {
            return C11IR.LL;
        }
        if (c098dArr.length == 1) {
            C098D<? extends T> c098d = c098dArr[0];
            C1701890uOB.LIZ(c098d, "source is null");
            if (c098d instanceof C11NZ) {
                return (C11NZ) c098d;
            }
            return new C098E(c098d);
        }
        return new j(LJJJJ(c098dArr), C19487811Me.LIZ, C11NN.LL, EnumC19492211Nw.BOUNDARY);
    }

    public static C19492411Ny LJIIZILJ(Iterable iterable) {
        int i = C11NN.LL;
        C19482111Jz c19482111JzLJJJJIZL = LJJJJIZL(iterable);
        C1076630e7h c1076630e7h = C19487811Me.LIZ;
        C1701890uOB.LIZIZ(i, "maxConcurrency");
        C1701890uOB.LIZIZ(i, "prefetch");
        return new C19492411Ny(c19482111JzLJJJJIZL, c1076630e7h, EnumC19492211Nw.BOUNDARY, i, i);
    }

    public static C19482711Kf LJIJJLI(InterfaceC1478005qU interfaceC1478005qU) {
        C1701890uOB.LIZ(interfaceC1478005qU, "source is null");
        return new C11NZ<T>(interfaceC1478005qU) { // from class: X.11Kf
            public final InterfaceC1478005qU<T> LL;

            {
                this.LL = interfaceC1478005qU;
            }

            @Override // X.C11NZ
            public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) throws Throwable {
                C19482611Ke c19482611Ke = new C19482611Ke(interfaceC626120Oh8);
                interfaceC626120Oh8.onSubscribe(c19482611Ke);
                try {
                    this.LL.subscribe(c19482611Ke);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C11SP.LIZ(th);
                    c19482611Ke.onError(th);
                }
            }
        };
    }

    public static C19479111Iv LJJ(final Callable callable) {
        return new C11NZ<T>(callable) { // from class: X.11Iv
            public final Callable<? extends C098D<? extends T>> LL;

            {
                this.LL = callable;
            }

            @Override // X.C11NZ
            public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) throws Throwable {
                try {
                    C098D<? extends T> c098dCall = this.LL.call();
                    C1701890uOB.LIZ(c098dCall, "null ObservableSource supplied");
                    c098dCall.LIZIZ(interfaceC626120Oh8);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C11SP.LIZ(th);
                    C11JT.error(th, interfaceC626120Oh8);
                }
            }
        };
    }

    public static C19479211Iw LJJIJLIJ(Throwable th) {
        C1701890uOB.LIZ(th, "e is null");
        return new C19479211Iw(new CallableC19491911Nt(th));
    }

    public static <T> C11NZ<T> LJJJJ(final T... tArr) {
        if (tArr.length == 0) {
            return C11IR.LL;
        }
        if (tArr.length == 1) {
            return LJJJJZ(tArr[0]);
        }
        return new C11NZ<T>(tArr) { // from class: X.11KO
            public final T[] LL;

            {
                this.LL = tArr;
            }

            @Override // X.C11NZ
            public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
                T[] tArr2 = this.LL;
                C11KN c11kn = new C11KN(interfaceC626120Oh8, tArr2);
                interfaceC626120Oh8.onSubscribe(c11kn);
                if (c11kn.LLILZ) {
                    return;
                }
                int length = tArr2.length;
                for (int i = 0; i < length && !c11kn.LLILZIL; i++) {
                    T t = tArr2[i];
                    if (t == null) {
                        InterfaceC626120Oh8<? super T> interfaceC626120Oh82 = c11kn.LL;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("The ");
                        sbLIZ.append(i);
                        sbLIZ.append("th element is null");
                        interfaceC626120Oh82.onError(new NullPointerException(C2188811AlT.LIZIZ(sbLIZ)));
                        return;
                    }
                    c11kn.LL.onNext(t);
                }
                if (c11kn.LLILZIL) {
                    return;
                }
                c11kn.LL.onComplete();
            }
        };
    }

    public static C11K6 LJJJJI(Callable callable) {
        return new C11K6(callable);
    }

    public static C19482111Jz LJJJJIZL(final Iterable iterable) {
        C1701890uOB.LIZ(iterable, "source is null");
        return new C11NZ<T>(iterable) { // from class: X.11Jz
            public final Iterable<? extends T> LL;

            {
                this.LL = iterable;
            }

            @Override // X.C11NZ
            public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) throws Throwable {
                try {
                    Iterator<? extends T> it2 = this.LL.iterator();
                    try {
                        if (!it2.hasNext()) {
                            C11JT.complete(interfaceC626120Oh8);
                            return;
                        }
                        C11K0 c11k0 = new C11K0(interfaceC626120Oh8, it2);
                        interfaceC626120Oh8.onSubscribe(c11k0);
                        if (!c11k0.LLILZ) {
                            while (!c11k0.LLILLL) {
                                try {
                                    T next = c11k0.LLILLJJLI.next();
                                    C1701890uOB.LIZ(next, "The iterator returned a null value");
                                    c11k0.LL.onNext(next);
                                    if (!c11k0.LLILLL) {
                                        try {
                                            if (!c11k0.LLILLJJLI.hasNext()) {
                                                if (!c11k0.LLILLL) {
                                                    c11k0.LL.onComplete();
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            C11SP.LIZ(th);
                                            c11k0.LL.onError(th);
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    C11SP.LIZ(th2);
                                    c11k0.LL.onError(th2);
                                    return;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        C11SP.LIZ(th3);
                        C11JT.error(th3, interfaceC626120Oh8);
                    }
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    C11SP.LIZ(th4);
                    C11JT.error(th4, interfaceC626120Oh8);
                }
            }
        };
    }

    public static C11LZ LJJJJJ(final C11LE c11le) {
        C1701890uOB.LIZ(c11le, "publisher is null");
        return new C11NZ<T>(c11le) { // from class: X.11LZ
            public final C11LE<? extends T> LL;

            {
                this.LL = c11le;
            }

            @Override // X.C11NZ
            public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
                this.LL.subscribe(new C11LY(interfaceC626120Oh8));
            }
        };
    }

    public static C11K9 LJJJJZ(Object obj) {
        C1701890uOB.LIZ(obj, "The item is null");
        return new C11K9(obj);
    }

    public static <T> C11NZ<T> LJJJLIIL(Iterable<? extends C098D<? extends T>> iterable) {
        return (C11NZ<T>) LJJJJIZL(iterable).LJJJ(C19487811Me.LIZ, false);
    }

    @Override // X.C098D
    public final void LIZIZ(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
        C1701890uOB.LIZ(interfaceC626120Oh8, "observer is null");
        try {
            LJJZZIII(interfaceC626120Oh8);
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            C19489211Ms.LIZIZ(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final <R> R LIZJ(InterfaceC465970IPb<T, ? extends R> interfaceC465970IPb) {
        C1701890uOB.LIZ(interfaceC465970IPb, "converter is null");
        return interfaceC465970IPb.LIZIZ(this);
    }

    public final T LJ(T t) {
        C345810Dh5 c345810Dh5 = new C345810Dh5();
        LIZIZ(c345810Dh5);
        T tLIZ = c345810Dh5.LIZ();
        if (tLIZ != null) {
            return tLIZ;
        }
        return t;
    }

    public final <R> C11NZ<R> LJIILIIL(InterfaceC742320T9y<? super T, ? extends R> interfaceC742320T9y) {
        C1701890uOB.LIZ(interfaceC742320T9y, "composer is null");
        C098D<? extends R> c098dLIZIZ = interfaceC742320T9y.LIZIZ(this);
        C1701890uOB.LIZ(c098dLIZIZ, "source is null");
        if (c098dLIZIZ instanceof C11NZ) {
            return (C11NZ) c098dLIZIZ;
        }
        return new C098E(c098dLIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> C11NZ<R> LJIJ(InterfaceC1487280oo2<? super T, ? extends C098D<? extends R>> interfaceC1487280oo2) {
        C1701890uOB.LIZIZ(2, "prefetch");
        if (this instanceof InterfaceCallableC1559550qgb) {
            Object objCall = ((InterfaceCallableC1559550qgb) this).call();
            if (objCall == null) {
                return C11IR.LL;
            }
            return new C11KA(interfaceC1487280oo2, objCall);
        }
        return new j(this, interfaceC1487280oo2, 2, EnumC19492211Nw.IMMEDIATE);
    }

    public final C19492411Ny LJIJI(InterfaceC1487280oo2 interfaceC1487280oo2) {
        int i = C11NN.LL;
        C1701890uOB.LIZIZ(Integer.MAX_VALUE, "maxConcurrency");
        C1701890uOB.LIZIZ(i, "prefetch");
        return new C19492411Ny(this, interfaceC1487280oo2, EnumC19492211Nw.IMMEDIATE, Integer.MAX_VALUE, i);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.11JY] */
    public final C11JY LJIJJ(final InterfaceC1487280oo2 interfaceC1487280oo2) {
        C1701890uOB.LIZIZ(2, "prefetch");
        final EnumC19492211Nw enumC19492211Nw = EnumC19492211Nw.IMMEDIATE;
        return new C11NZ<R>(this, interfaceC1487280oo2, enumC19492211Nw) { // from class: X.11JY
            public final C11NZ<T> LL;
            public final InterfaceC1487280oo2<? super T, ? extends InterfaceC19473011Gm<? extends R>> LLILLJJLI;
            public final EnumC19492211Nw LLILLL;
            public final int LLILZ = 2;

            @Override // X.C11NZ
            public final void LJJZZIII(InterfaceC626120Oh8<? super R> interfaceC626120Oh8) throws Throwable {
                C11NZ<T> c11nz = this.LL;
                InterfaceC1487280oo2<? super T, ? extends InterfaceC19473011Gm<? extends R>> interfaceC1487280oo22 = this.LLILLJJLI;
                if (c11nz instanceof Callable) {
                    try {
                        Config config = (Object) ((Callable) c11nz).call();
                        if (config != null) {
                            InterfaceC19473011Gm<? extends R> interfaceC19473011GmApply = interfaceC1487280oo22.apply(config);
                            C1701890uOB.LIZ(interfaceC19473011GmApply, "The mapper returned a null SingleSource");
                            InterfaceC19473011Gm<? extends R> interfaceC19473011Gm = interfaceC19473011GmApply;
                            if (interfaceC19473011Gm != null) {
                                interfaceC19473011Gm.LIZ(new C11K4(interfaceC626120Oh8));
                                return;
                            }
                        }
                        C11JT.complete(interfaceC626120Oh8);
                        return;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C11SP.LIZ(th);
                        C11JT.error(th, interfaceC626120Oh8);
                        return;
                    }
                }
                this.LL.LIZIZ(new C11P3(interfaceC626120Oh8, this.LLILLJJLI, this.LLILZ, this.LLILLL));
            }

            {
                this.LL = this;
                this.LLILLJJLI = interfaceC1487280oo2;
                this.LLILLL = enumC19492211Nw;
            }
        };
    }

    public final C19488511Ml LJJII(InterfaceC1627390sS1 interfaceC1627390sS1) {
        C1701890uOB.LIZ(interfaceC1627390sS1, "comparer is null");
        return new C19488511Ml(this, interfaceC1627390sS1);
    }

    public final C19491111Nl LJJIII(final C09JN c09jn) {
        return new C11J7<T, T>(this, c09jn) { // from class: X.11Nl
            public final C09JN<? super T> LLILLJJLI;

            @Override // X.C11NZ
            public final void LJJZZIII(final InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
                C098D<T> c098d = this.LL;
                final C09JN<? super T> c09jn2 = this.LLILLJJLI;
                c098d.LIZIZ(new C11QA<T, T>(interfaceC626120Oh8, c09jn2) { // from class: X.11QD
                    public final C09JN<? super T> LLILZLL;

                    @Override // X.InterfaceC19494911Ox
                    public final T poll() {
                        T tPoll = this.LLILLL.poll();
                        if (tPoll != null) {
                            this.LLILZLL.accept(tPoll);
                        }
                        return tPoll;
                    }

                    /* JADX WARN: Type inference incomplete: some casts might be missing */
                    @Override // X.InterfaceC626120Oh8
                    public final void onNext(T t) {
                        this.LL.onNext((Object) t);
                        if (this.LLILZIL == 0) {
                            try {
                                this.LLILZLL.accept(t);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                LIZ(th);
                            }
                        }
                    }

                    @Override // X.InterfaceC19495111Oz
                    public final int requestFusion(int i) {
                        return LIZIZ(i);
                    }

                    {
                        this.LLILZLL = c09jn2;
                    }
                });
            }

            {
                this.LLILLJJLI = c09jn;
            }
        };
    }

    public final C19491211Nm LJJIIJ(final InterfaceC781210Ukh interfaceC781210Ukh) {
        C1701890uOB.LIZ(interfaceC781210Ukh, "onFinally is null");
        return new C11J7<T, T>(this, interfaceC781210Ukh) { // from class: X.11Nm
            public final InterfaceC781210Ukh LLILLJJLI;

            @Override // X.C11NZ
            public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
                this.LL.LIZIZ(new C19494011Oo(interfaceC626120Oh8, this.LLILLJJLI));
            }

            {
                this.LLILLJJLI = interfaceC781210Ukh;
            }
        };
    }

    public final C11JN LJJIIJZLJL(InterfaceC781210Ukh interfaceC781210Ukh) {
        AnonymousClass0988 anonymousClass0988 = C19487811Me.LIZLLL;
        return LJJIJ(anonymousClass0988, anonymousClass0988, interfaceC781210Ukh);
    }

    public final C11JH LJJIIZ(InterfaceC781210Ukh interfaceC781210Ukh) {
        return new C11JH(this, C19487811Me.LIZLLL, interfaceC781210Ukh);
    }

    public final C11JN LJJIIZI(final C09JN c09jn) {
        return LJJIJ(new C09JN<T>(c09jn) { // from class: X.11Og
            public final C09JN<? super C19493411Oi<T>> LL;

            {
                this.LL = c09jn;
            }

            @Override // X.C09JN
            public final void accept(T t) {
                C09JN<? super C19493411Oi<T>> c09jn2 = this.LL;
                C1701890uOB.LIZ(t, "value is null");
                c09jn2.accept(new C19493411Oi(t));
            }
        }, new C09JN<Throwable>(c09jn) { // from class: X.11Oh
            public final C09JN<? super C19493411Oi<T>> LL;

            {
                this.LL = c09jn;
            }

            @Override // X.C09JN
            public final void accept(Throwable th) {
                Throwable th2 = th;
                C09JN<? super C19493411Oi<T>> c09jn2 = this.LL;
                C1701890uOB.LIZ(th2, "error is null");
                c09jn2.accept(new C19493411Oi(C11PO.error(th2)));
            }
        }, new InterfaceC781210Ukh(c09jn) { // from class: X.11Oj
            public final C09JN<? super C19493411Oi<T>> LIZ;

            @Override // X.InterfaceC781210Ukh
            public final void run() {
                this.LIZ.accept(C19493411Oi.LIZIZ);
            }

            {
                this.LIZ = c09jn;
            }
        });
    }

    public final C11JN LJJIJIIJI(C09JN c09jn) {
        return LJJIJ(C19487811Me.LIZLLL, c09jn, C19487811Me.LIZJ);
    }

    public final C11JN LJJIJIIJIL(C09JN c09jn) {
        return LJJIJ(c09jn, C19487811Me.LIZLLL, C19487811Me.LIZJ);
    }

    public final C11JH LJJIJIL(C09JN c09jn) {
        return new C11JH(this, c09jn, C19487811Me.LIZJ);
    }

    public final C11JN LJJIJL(final InterfaceC781210Ukh interfaceC781210Ukh) {
        return LJJIJ(C19487811Me.LIZLLL, new C09JN<T>(interfaceC781210Ukh) { // from class: X.11KE
            public final InterfaceC781210Ukh LL;

            {
                this.LL = interfaceC781210Ukh;
            }

            @Override // X.C09JN
            public final void accept(T t) {
                this.LL.run();
            }
        }, interfaceC781210Ukh);
    }

    public final C19491011Nk LJJIL(final InterfaceC19483011Ki interfaceC19483011Ki) {
        return new C11J7<T, T>(this, interfaceC19483011Ki) { // from class: X.11Nk
            public final InterfaceC19483011Ki<? super T> LLILLJJLI;

            @Override // X.C11NZ
            public final void LJJZZIII(final InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
                C098D<T> c098d = this.LL;
                final InterfaceC19483011Ki<? super T> interfaceC19483011Ki2 = this.LLILLJJLI;
                c098d.LIZIZ(new C11QA<T, T>(interfaceC626120Oh8, interfaceC19483011Ki2) { // from class: X.11QC
                    public final InterfaceC19483011Ki<? super T> LLILZLL;

                    @Override // X.InterfaceC19494911Ox
                    public final T poll() {
                        T tPoll;
                        do {
                            tPoll = this.LLILLL.poll();
                            if (tPoll == null) {
                                break;
                            }
                        } while (!this.LLILZLL.test(tPoll));
                        return tPoll;
                    }

                    /* JADX WARN: Type inference incomplete: some casts might be missing */
                    @Override // X.InterfaceC626120Oh8
                    public final void onNext(T t) {
                        if (this.LLILZIL == 0) {
                            try {
                                if (this.LLILZLL.test(t)) {
                                    this.LL.onNext((Object) t);
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                LIZ(th);
                                return;
                            }
                        }
                        this.LL.onNext(null);
                    }

                    @Override // X.InterfaceC19495111Oz
                    public final int requestFusion(int i) {
                        return LIZIZ(i);
                    }

                    {
                        this.LLILZLL = interfaceC19483011Ki2;
                    }
                });
            }

            {
                this.LLILLJJLI = interfaceC19483011Ki;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.11Jn] */
    public final C19480911Jn LJJJI(final InterfaceC1487280oo2 interfaceC1487280oo2) {
        return new C11J7<T, R>(this, interfaceC1487280oo2) { // from class: X.11Jn
            public final InterfaceC1487280oo2<? super T, ? extends Iterable<? extends R>> LLILLJJLI;

            @Override // X.C11NZ
            public final void LJJZZIII(InterfaceC626120Oh8<? super R> interfaceC626120Oh8) {
                this.LL.LIZIZ(new C19480811Jm(interfaceC626120Oh8, this.LLILLJJLI));
            }

            {
                this.LLILLJJLI = interfaceC1487280oo2;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.11Nj] */
    public final C19490911Nj LJJJIL(final InterfaceC1487280oo2 interfaceC1487280oo2) {
        return new C11J7<T, R>(this, interfaceC1487280oo2) { // from class: X.11Nj
            public final InterfaceC1487280oo2<? super T, ? extends InterfaceC19473011Gm<? extends R>> LLILLJJLI;
            public final boolean LLILLL = false;

            @Override // X.C11NZ
            public final void LJJZZIII(InterfaceC626120Oh8<? super R> interfaceC626120Oh8) {
                this.LL.LIZIZ(new C11P8(interfaceC626120Oh8, this.LLILLJJLI, this.LLILLL));
            }

            {
                this.LLILLJJLI = interfaceC1487280oo2;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.11ON] */
    public final C11ON LJJJJZI(final InterfaceC1487280oo2 interfaceC1487280oo2) {
        return new C11J7<T, U>(this, interfaceC1487280oo2) { // from class: X.11ON
            public final InterfaceC1487280oo2<? super T, ? extends U> LLILLJJLI;

            @Override // X.C11NZ
            public final void LJJZZIII(final InterfaceC626120Oh8<? super U> interfaceC626120Oh8) {
                C098D<T> c098d = this.LL;
                final InterfaceC1487280oo2<? super T, ? extends U> interfaceC1487280oo22 = this.LLILLJJLI;
                c098d.LIZIZ(new C11QA<T, U>(interfaceC626120Oh8, interfaceC1487280oo22) { // from class: X.11Q8
                    public final InterfaceC1487280oo2<? super T, ? extends U> LLILZLL;

                    @Override // X.InterfaceC19494911Ox
                    public final U poll() {
                        T tPoll = this.LLILLL.poll();
                        if (tPoll == null) {
                            return null;
                        }
                        U uApply = this.LLILZLL.apply(tPoll);
                        C1701890uOB.LIZ(uApply, "The mapper function returned a null value.");
                        return uApply;
                    }

                    /* JADX WARN: Type inference incomplete: some casts might be missing */
                    @Override // X.InterfaceC626120Oh8
                    public final void onNext(T t) {
                        if (this.LLILZ) {
                            return;
                        }
                        if (this.LLILZIL != 0) {
                            this.LL.onNext(null);
                            return;
                        }
                        try {
                            U uApply = this.LLILZLL.apply(t);
                            C1701890uOB.LIZ(uApply, "The mapper function returned a null value.");
                            this.LL.onNext((Object) uApply);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            LIZ(th);
                        }
                    }

                    @Override // X.InterfaceC19495111Oz
                    public final int requestFusion(int i) {
                        return LIZIZ(i);
                    }

                    {
                        this.LLILZLL = interfaceC1487280oo22;
                    }
                });
            }

            {
                this.LLILLJJLI = interfaceC1487280oo2;
            }
        };
    }

    public final C11O8 LJJJLZIJ(final C11RO c11ro) {
        final int i = C11NN.LL;
        C1701890uOB.LIZ(c11ro, "scheduler is null");
        C1701890uOB.LIZIZ(i, "bufferSize");
        return new C11J7<T, T>(this, c11ro, i) { // from class: X.11O8
            public final C11RO LLILLJJLI;
            public final boolean LLILLL = false;
            public final int LLILZ;

            @Override // X.C11NZ
            public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
                C11RO c11ro2 = this.LLILLJJLI;
                if (c11ro2 instanceof C1701840uO6) {
                    this.LL.LIZIZ(interfaceC626120Oh8);
                } else {
                    this.LL.LIZIZ(new RunnableC19494311Or(interfaceC626120Oh8, c11ro2.LIZ(), this.LLILLL, this.LLILZ));
                }
            }

            {
                this.LLILLJJLI = c11ro;
                this.LLILZ = i;
            }
        };
    }

    public final C11ON LJJJZ(final Class cls) {
        C1701890uOB.LIZ(cls, "clazz is null");
        return LJJIL(new InterfaceC19483011Ki<T>(cls) { // from class: X.11Mk
            public final Class<U> LL;

            {
                this.LL = cls;
            }

            @Override // X.InterfaceC19483011Ki
            public final boolean test(T t) {
                return this.LL.isInstance(t);
            }
        }).LJJJJZI(new InterfaceC1487280oo2<T, U>(cls) { // from class: X.11Nu
            public final Class<U> LL;

            {
                this.LL = cls;
            }

            @Override // X.InterfaceC1487280oo2
            public final U apply(T t) {
                return this.LL.cast(t);
            }
        });
    }

    public final C19484211Ku LJJL(InterfaceC1487280oo2 interfaceC1487280oo2) {
        return new C19484211Ku(this, interfaceC1487280oo2, false);
    }

    public final C19484211Ku LJJLI(C11NZ c11nz) {
        C1701890uOB.LIZ(c11nz, "next is null");
        return LJJL(new CallableC19491911Nt(c11nz));
    }

    public final C19476011Hq LJJLIIIIJ(final InterfaceC1487280oo2 interfaceC1487280oo2) {
        return new C11J7<T, T>(this, interfaceC1487280oo2) { // from class: X.11Hq
            public final InterfaceC1487280oo2<? super Throwable, ? extends T> LLILLJJLI;

            @Override // X.C11NZ
            public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
                this.LL.LIZIZ(new C19478511Ip(interfaceC626120Oh8, this.LLILLJJLI));
            }

            {
                this.LLILLJJLI = interfaceC1487280oo2;
            }
        };
    }

    public final C19484211Ku LJJLIIIJ(C11IR c11ir) {
        C1701890uOB.LIZ(c11ir, "next is null");
        return new C19484211Ku(this, new CallableC19491911Nt(c11ir), true);
    }

    public final C19488711Mn LJJLIIIJJIZ(long j) {
        return LJJLIIIJL(j, C19487811Me.LJI);
    }

    public final C11QK LJJLIIIJLJLI(final InterfaceC1487280oo2 interfaceC1487280oo2) {
        C1701890uOB.LIZ(interfaceC1487280oo2, "handler is null");
        return new C11J7<T, T>(this, interfaceC1487280oo2) { // from class: X.11QK
            public final InterfaceC1487280oo2<? super C11NZ<Throwable>, ? extends C098D<?>> LLILLJJLI;

            @Override // X.C11NZ
            public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) throws Throwable {
                C11PR<T> c11prLJLLLL = new C11RK().LJLLLL();
                try {
                    C098D<?> c098dApply = this.LLILLJJLI.apply(c11prLJLLLL);
                    C1701890uOB.LIZ(c098dApply, "The handler returned a null ObservableSource");
                    C098D<?> c098d = c098dApply;
                    C11QL c11ql = new C11QL(interfaceC626120Oh8, c11prLJLLLL, this.LL);
                    interfaceC626120Oh8.onSubscribe(c11ql);
                    c098d.LIZIZ(c11ql.LLILZIL);
                    c11ql.LIZ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C11SP.LIZ(th);
                    C11JT.error(th, interfaceC626120Oh8);
                }
            }

            {
                this.LLILLJJLI = interfaceC1487280oo2;
            }
        };
    }

    public final C11NZ<T> LJJLIL(T t) {
        C1701890uOB.LIZ(t, "item is null");
        return LJIILLIIL(LJJJJZ(t), this);
    }

    public final InterfaceC420801kM LJJLJLI(C09JN<? super T> c09jn) {
        return LJJZZI(c09jn, C19487811Me.LJFF, C19487811Me.LIZJ, C19487811Me.LIZLLL);
    }

    public final C19476611Hw LJL(C11RO c11ro) {
        C1701890uOB.LIZ(c11ro, "scheduler is null");
        return new C11J7<T, T>(this, c11ro) { // from class: X.11Hw
            public final C11RO LLILLJJLI;

            @Override // X.C11NZ
            public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
                final C19476811Hy c19476811Hy = new C19476811Hy(interfaceC626120Oh8);
                interfaceC626120Oh8.onSubscribe(c19476811Hy);
                C11JE.setOnce(c19476811Hy, this.LLILLJJLI.LIZIZ(new Runnable(c19476811Hy) { // from class: X.11Hv
                    public final C19476811Hy<T> LL;

                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            this.LLILLJJLI.LL.LIZIZ(this.LL);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            if (!C2179971ATj.LIZ(th)) {
                                throw th;
                            }
                        }
                    }

                    {
                        this.LL = c19476811Hy;
                    }
                }));
            }

            {
                this.LLILLJJLI = c11ro;
            }
        };
    }

    public final C19490411Ne LJLI(final C098D c098d) {
        C1701890uOB.LIZ(c098d, "other is null");
        return new C11J7<T, T>(this, c098d) { // from class: X.11Ne
            public final C098D<? extends T> LLILLJJLI;

            @Override // X.C11NZ
            public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
                C19490511Nf c19490511Nf = new C19490511Nf(interfaceC626120Oh8, this.LLILLJJLI);
                interfaceC626120Oh8.onSubscribe(c19490511Nf.LLILLL);
                this.LL.LIZIZ(c19490511Nf);
            }

            {
                this.LLILLJJLI = c098d;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> C11NZ<R> LJLIIIL(final InterfaceC1487280oo2<? super T, ? extends C098D<? extends R>> interfaceC1487280oo2) {
        final int i = C11NN.LL;
        C1701890uOB.LIZIZ(i, "bufferSize");
        if (this instanceof InterfaceCallableC1559550qgb) {
            Object objCall = ((InterfaceCallableC1559550qgb) this).call();
            if (objCall == null) {
                return C11IR.LL;
            }
            return new C11KA(interfaceC1487280oo2, objCall);
        }
        return new C11J7<T, R>(this, interfaceC1487280oo2, i) { // from class: X.11KR
            public final InterfaceC1487280oo2<? super T, ? extends C098D<? extends R>> LLILLJJLI;
            public final int LLILLL;
            public final boolean LLILZ = false;

            @Override // X.C11NZ
            public final void LJJZZIII(InterfaceC626120Oh8<? super R> interfaceC626120Oh8) {
                if (C11KB.LIZ(this.LL, interfaceC626120Oh8, this.LLILLJJLI)) {
                    return;
                }
                this.LL.LIZIZ(new C11P4(interfaceC626120Oh8, this.LLILLJJLI, this.LLILLL, this.LLILZ));
            }

            {
                this.LLILLJJLI = interfaceC1487280oo2;
                this.LLILLL = i;
            }
        };
    }

    public final C19476411Hu LJLIIL(long j) {
        if (j >= 0) {
            return new C19476411Hu(this, j);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("count >= 0 required but it was ");
        sbLIZ.append(j);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final C11NN<T> LJLJLJ(EnumC19496911Pr enumC19496911Pr) {
        final C11NN<T> c11nn = new C11NN<T>(this) { // from class: X.11Nr
            public final C11NZ<T> LLILLJJLI;

            {
                this.LLILLJJLI = this;
            }

            @Override // X.C11NN
            public final void LJIILLIIL(C11M9<? super T> c11m9) {
                this.LLILLJJLI.LIZIZ(new C19491811Ns(c11m9));
            }
        };
        int i = C19496811Pq.LIZ[enumC19496911Pr.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        final int i2 = C11NN.LL;
                        C1701890uOB.LIZIZ(i2, "bufferSize");
                        return new C11M6<T, T>(c11nn, i2) { // from class: X.11Ni
                            public final int LLILLL;
                            public final boolean LLILZ;
                            public final boolean LLILZIL;
                            public final InterfaceC781210Ukh LLILZLL;

                            @Override // X.C11NN
                            public final void LJIILLIIL(C11M9<? super T> c11m9) {
                                this.LLILLJJLI.LJIILL(new C19494611Ou(c11m9, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL));
                            }

                            {
                                C1239380iMC c1239380iMC = C19487811Me.LIZJ;
                                this.LLILLL = i2;
                                this.LLILZ = true;
                                this.LLILZIL = false;
                                this.LLILZLL = c1239380iMC;
                            }
                        };
                    }
                    return new C11M6<T, T>(c11nn) { // from class: X.11Np
                        @Override // X.C11NN
                        public final void LJIILLIIL(C11M9<? super T> c11m9) {
                            this.LLILLJJLI.LJIILL(new C19491611Nq(c11m9));
                        }
                    };
                }
                return c11nn;
            }
            return new C19491311Nn(c11nn);
        }
        return new C19490611Ng(c11nn);
    }

    public static <T> C11NZ<T> LJIILL(C098D<? extends T> c098d, C098D<? extends T> c098d2) {
        C1701890uOB.LIZ(c098d, "source1 is null");
        C1701890uOB.LIZ(c098d2, "source2 is null");
        return LJIILLIIL(c098d, c098d2);
    }

    public static C11O1 LJJJJLI(long j, TimeUnit timeUnit) {
        return LJJJJL(j, j, timeUnit, C11S5.LIZIZ);
    }

    public static C11NZ LJJJLL(C098D c098d, C11NZ c11nz) {
        C1701890uOB.LIZ(c098d, "source1 is null");
        C1701890uOB.LIZ(c11nz, "source2 is null");
        C11NZ c11nzLJJJJ = LJJJJ(c098d, c11nz);
        C1076630e7h c1076630e7h = C19487811Me.LIZ;
        c11nzLJJJJ.getClass();
        return c11nzLJJJJ.LJJIZ(2, C11NN.LL, c1076630e7h, false);
    }

    public static C11NZ<Integer> LJJLIIIJILLIZJL(final int i, final int i2) {
        if (i2 >= 0) {
            if (i2 == 0) {
                return C11IR.LL;
            }
            if (i2 == 1) {
                return LJJJJZ(Integer.valueOf(i));
            }
            if (((long) i) + ((long) (i2 - 1)) <= 2147483647L) {
                return new C11NZ<Integer>(i, i2) { // from class: X.11Oq
                    public final int LL;
                    public final long LLILLJJLI;

                    @Override // X.C11NZ
                    public final void LJJZZIII(InterfaceC626120Oh8<? super Integer> interfaceC626120Oh8) {
                        C19494111Op c19494111Op = new C19494111Op(interfaceC626120Oh8, this.LL, this.LLILLJJLI);
                        interfaceC626120Oh8.onSubscribe(c19494111Op);
                        if (!c19494111Op.LLILZ) {
                            InterfaceC626120Oh8<? super Integer> interfaceC626120Oh82 = c19494111Op.LL;
                            long j = c19494111Op.LLILLJJLI;
                            for (long j2 = c19494111Op.LLILLL; j2 != j && c19494111Op.get() == 0; j2++) {
                                interfaceC626120Oh82.onNext(Integer.valueOf((int) j2));
                            }
                            if (c19494111Op.get() == 0) {
                                c19494111Op.lazySet(1);
                                interfaceC626120Oh82.onComplete();
                            }
                        }
                    }

                    {
                        this.LL = i;
                        this.LLILLJJLI = ((long) i) + ((long) i2);
                    }
                };
            }
            throw new IllegalArgumentException("Integer overflow");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("count >= 0 required but it was ");
        sbLIZ.append(i2);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static C11IB LJLJJLL(long j, TimeUnit timeUnit) {
        return LJLJL(j, timeUnit, C11S5.LIZIZ);
    }

    public static C19499011Qm LJLL(Iterable iterable, InterfaceC1487280oo2 interfaceC1487280oo2) {
        return new C19499011Qm(null, iterable, interfaceC1487280oo2, C11NN.LL);
    }

    public final C11OG LJI(long j, TimeUnit timeUnit) {
        return LJII(j, timeUnit, C11S5.LIZIZ, Integer.MAX_VALUE);
    }

    public final C11O9 LJIL(final long j, final TimeUnit timeUnit) {
        final C11RO c11ro = C11S5.LIZIZ;
        C1701890uOB.LIZ(timeUnit, "unit is null");
        C1701890uOB.LIZ(c11ro, "scheduler is null");
        return new C11J7<T, T>(j, this, c11ro, timeUnit) { // from class: X.11O9
            public final long LLILLJJLI;
            public final TimeUnit LLILLL;
            public final C11RO LLILZ;

            @Override // X.C11NZ
            public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
                this.LL.LIZIZ(new C11OD(new C11PI(interfaceC626120Oh8), this.LLILLJJLI, this.LLILLL, this.LLILZ.LIZ()));
            }

            {
                super(this);
                this.LLILLJJLI = j;
                this.LLILLL = timeUnit;
                this.LLILZ = c11ro;
            }
        };
    }

    public final C11O5 LJJI(long j, TimeUnit timeUnit) {
        C11RO c11ro = C11S5.LIZIZ;
        C1701890uOB.LIZ(timeUnit, "unit is null");
        C1701890uOB.LIZ(c11ro, "scheduler is null");
        return new C11O5(this, j, timeUnit, c11ro);
    }

    public final <R> C11NZ<R> LJJJ(InterfaceC1487280oo2<? super T, ? extends C098D<? extends R>> interfaceC1487280oo2, boolean z) {
        return LJJIZ(Integer.MAX_VALUE, C11NN.LL, interfaceC1487280oo2, z);
    }

    public final C19488711Mn LJJLIIIJL(long j, InterfaceC19483011Ki interfaceC19483011Ki) {
        if (j >= 0) {
            return new C11J7<T, T>(this, j, interfaceC19483011Ki) { // from class: X.11Mn
                public final InterfaceC19483011Ki<? super Throwable> LLILLJJLI;
                public final long LLILLL;

                @Override // X.C11NZ
                public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
                    C19484811La c19484811La = new C19484811La();
                    interfaceC626120Oh8.onSubscribe(c19484811La);
                    new C19488611Mm(interfaceC626120Oh8, this.LLILLL, this.LLILLJJLI, c19484811La, this.LL).LIZ();
                }

                {
                    super(this);
                    this.LLILLJJLI = interfaceC19483011Ki;
                    this.LLILLL = j;
                }
            };
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("times >= 0 required but it was ");
        sbLIZ.append(j);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final C19493911On LJJLIIIJLLLLLLLZ(final long j, final TimeUnit timeUnit) {
        final C11RO c11ro = C11S5.LIZIZ;
        C1701890uOB.LIZ(timeUnit, "unit is null");
        C1701890uOB.LIZ(c11ro, "scheduler is null");
        return new C11J7<T, T>(this, j, timeUnit, c11ro) { // from class: X.11On
            public final long LLILLJJLI;
            public final TimeUnit LLILLL;
            public final C11RO LLILZ;
            public final boolean LLILZIL = false;

            @Override // X.C11NZ
            public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
                C11PI c11pi = new C11PI(interfaceC626120Oh8);
                if (this.LLILZIL) {
                    this.LL.LIZIZ(new AbstractRunnableC19493611Ok<T>(c11pi, this.LLILLJJLI, this.LLILLL, this.LLILZ) { // from class: X.11Ol
                        public static final long serialVersionUID = -7139995637533111443L;
                        public final AtomicInteger LLIZ = new AtomicInteger(1);

                        @Override // X.AbstractRunnableC19493611Ok
                        public final void LIZ() {
                            T andSet = getAndSet(null);
                            if (andSet != null) {
                                this.LL.onNext(andSet);
                            }
                            if (this.LLIZ.decrementAndGet() == 0) {
                                this.LL.onComplete();
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            try {
                                if (this.LLIZ.incrementAndGet() == 2) {
                                    T andSet = getAndSet(null);
                                    if (andSet != null) {
                                        this.LL.onNext(andSet);
                                    }
                                    if (this.LLIZ.decrementAndGet() == 0) {
                                        this.LL.onComplete();
                                    }
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                        }
                    });
                } else {
                    this.LL.LIZIZ(new AbstractRunnableC19493611Ok<T>(c11pi, this.LLILLJJLI, this.LLILLL, this.LLILZ) { // from class: X.11Om
                        public static final long serialVersionUID = -7139995637533111443L;

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            try {
                                T andSet = getAndSet(null);
                                if (andSet != null) {
                                    this.LL.onNext(andSet);
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                        }

                        @Override // X.AbstractRunnableC19493611Ok
                        public final void LIZ() {
                            this.LL.onComplete();
                        }
                    });
                }
            }

            {
                this.LLILLJJLI = j;
                this.LLILLL = timeUnit;
                this.LLILZ = c11ro;
            }
        };
    }

    public final InterfaceC420801kM LJJLL(C09JN<? super T> c09jn, C09JN<? super Throwable> c09jn2) {
        return LJJZZI(c09jn, c09jn2, C19487811Me.LIZJ, C19487811Me.LIZLLL);
    }

    public final C11O3 LJLIL(final long j, final TimeUnit timeUnit) {
        final C11RO c11ro = C11S5.LIZIZ;
        C1701890uOB.LIZ(timeUnit, "unit is null");
        C1701890uOB.LIZ(c11ro, "scheduler is null");
        return new C11J7<T, T>(j, this, c11ro, timeUnit) { // from class: X.11O3
            public final long LLILLJJLI;
            public final TimeUnit LLILLL;
            public final C11RO LLILZ;

            @Override // X.C11NZ
            public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
                this.LL.LIZIZ(new C11O4(new C11PI(interfaceC626120Oh8), this.LLILLJJLI, this.LLILLL, this.LLILZ.LIZ()));
            }

            {
                super(this);
                this.LLILLJJLI = j;
                this.LLILLL = timeUnit;
                this.LLILZ = c11ro;
            }
        };
    }

    public final C11O6 LJLILLLLZI(final long j, final TimeUnit timeUnit) {
        final C11RO c11ro = C11S5.LIZIZ;
        C1701890uOB.LIZ(timeUnit, "unit is null");
        C1701890uOB.LIZ(c11ro, "scheduler is null");
        return new C11J7<T, T>(this, j, timeUnit, c11ro) { // from class: X.11O6
            public final long LLILLJJLI;
            public final TimeUnit LLILLL;
            public final C11RO LLILZ;
            public final boolean LLILZIL;

            @Override // X.C11NZ
            public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
                this.LL.LIZIZ(new C11O7(interfaceC626120Oh8, this.LLILLJJLI, this.LLILLL, this.LLILZ.LIZ(), this.LLILZIL));
            }

            {
                super(this);
                this.LLILLJJLI = j;
                this.LLILLL = timeUnit;
                this.LLILZ = c11ro;
                this.LLILZIL = true;
            }
        };
    }

    public final C19497811Qa LJLJI(long j, TimeUnit timeUnit) {
        return LJLJJL(j, null, C11S5.LIZIZ, timeUnit);
    }

    public final C11NZ LJLLL(C11NZ c11nz, InterfaceC500500Jk0 interfaceC500500Jk0) {
        C1701890uOB.LIZ(c11nz, "other is null");
        return LJLLILLLL(this, c11nz, interfaceC500500Jk0);
    }

    public static <T, R> C11NZ<R> LJIIIIZZ(final InterfaceC1487280oo2<? super Object[], ? extends R> interfaceC1487280oo2, int i, final C098D<? extends T>... c098dArr) {
        if (c098dArr.length == 0) {
            return C11IR.LL;
        }
        C1701890uOB.LIZIZ(i, "bufferSize");
        final int i2 = i << 1;
        return new C11NZ<R>(c098dArr, interfaceC1487280oo2, i2) { // from class: X.11Ql
            public final C098D<? extends T>[] LL;
            public final InterfaceC1487280oo2<? super Object[], ? extends R> LLILLL;
            public final int LLILZ;
            public final Iterable<? extends C098D<? extends T>> LLILLJJLI = null;
            public final boolean LLILZIL = false;

            @Override // X.C11NZ
            public final void LJJZZIII(InterfaceC626120Oh8<? super R> interfaceC626120Oh8) {
                int length;
                C098D<? extends T>[] c098dArr2 = this.LL;
                if (c098dArr2 == null) {
                    c098dArr2 = new C11NZ[8];
                    length = 0;
                    for (C098D<? extends T> c098d : this.LLILLJJLI) {
                        if (length == c098dArr2.length) {
                            C098D<? extends T>[] c098dArr3 = new C098D[(length >> 2) + length];
                            System.arraycopy(c098dArr2, 0, c098dArr3, 0, length);
                            c098dArr2 = c098dArr3;
                        }
                        c098dArr2[length] = c098d;
                        length++;
                    }
                } else {
                    length = c098dArr2.length;
                }
                if (length == 0) {
                    C11JT.complete(interfaceC626120Oh8);
                    return;
                }
                C19498811Qk c19498811Qk = new C19498811Qk(length, this.LLILZ, interfaceC626120Oh8, this.LLILLL, this.LLILZIL);
                C19499211Qo<T, R>[] c19499211QoArr = c19498811Qk.LLILLL;
                int length2 = c19499211QoArr.length;
                c19498811Qk.LL.onSubscribe(c19498811Qk);
                for (int i3 = 0; i3 < length2 && !c19498811Qk.LLIZLLLIL && !c19498811Qk.LLIZ; i3++) {
                    c098dArr2[i3].LIZIZ(c19499211QoArr[i3]);
                }
            }

            {
                this.LL = c098dArr;
                this.LLILLL = interfaceC1487280oo2;
                this.LLILZ = i2;
            }
        };
    }

    public static <T1, T2, R> C11NZ<R> LJIIJ(C098D<? extends T1> c098d, C098D<? extends T2> c098d2, InterfaceC500500Jk0<? super T1, ? super T2, ? extends R> interfaceC500500Jk0) {
        C1701890uOB.LIZ(c098d, "source1 is null");
        C1701890uOB.LIZ(c098d2, "source2 is null");
        return LJIIIIZZ(new C1627730sSZ(interfaceC500500Jk0), C11NN.LL, c098d, c098d2);
    }

    public static C11O1 LJJJJJL(long j, long j2, TimeUnit timeUnit) {
        return LJJJJL(j, j2, timeUnit, C11S5.LIZIZ);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.11IB] */
    public static C11IB LJLJL(long j, final TimeUnit timeUnit, final C11RO c11ro) {
        C1701890uOB.LIZ(timeUnit, "unit is null");
        C1701890uOB.LIZ(c11ro, "scheduler is null");
        final long jMax = Math.max(j, 0L);
        return new C11NZ<Long>(jMax, timeUnit, c11ro) { // from class: X.11IB
            public final C11RO LL;
            public final long LLILLJJLI;
            public final TimeUnit LLILLL;

            @Override // X.C11NZ
            public final void LJJZZIII(InterfaceC626120Oh8<? super Long> interfaceC626120Oh8) {
                C11IA c11ia = new C11IA(interfaceC626120Oh8);
                interfaceC626120Oh8.onSubscribe(c11ia);
                C11JE.trySet(c11ia, this.LL.LIZJ(c11ia, this.LLILLJJLI, this.LLILLL));
            }

            {
                this.LLILLJJLI = jMax;
                this.LLILLL = timeUnit;
                this.LL = c11ro;
            }
        };
    }

    public static C11NZ LJLLILLLL(C098D c098d, C11NZ c11nz, InterfaceC500500Jk0 interfaceC500500Jk0) {
        C1701890uOB.LIZ(c098d, "source1 is null");
        C1701890uOB.LIZ(c11nz, "source2 is null");
        return LJLLJ(new C1627730sSZ(interfaceC500500Jk0), C11NN.LL, c098d, c11nz);
    }

    public static C11NZ LJLLJ(InterfaceC1487280oo2 interfaceC1487280oo2, int i, C098D... c098dArr) {
        if (c098dArr.length == 0) {
            return C11IR.LL;
        }
        C1701890uOB.LIZIZ(i, "bufferSize");
        return new C19499011Qm(c098dArr, null, interfaceC1487280oo2, i);
    }

    public final C11JN LJJIJ(final C09JN c09jn, final C09JN c09jn2, final InterfaceC781210Ukh interfaceC781210Ukh) {
        return new C11J7<T, T>(this, c09jn, c09jn2, interfaceC781210Ukh) { // from class: X.11JN
            public final C09JN<? super T> LLILLJJLI;
            public final C09JN<? super Throwable> LLILLL;
            public final InterfaceC781210Ukh LLILZ;
            public final InterfaceC781210Ukh LLILZIL;

            @Override // X.C11NZ
            public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
                this.LL.LIZIZ(new C11JM(interfaceC626120Oh8, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL));
            }

            {
                C1239380iMC c1239380iMC = C19487811Me.LIZJ;
                this.LLILLJJLI = c09jn;
                this.LLILLL = c09jn2;
                this.LLILZ = interfaceC781210Ukh;
                this.LLILZIL = c1239380iMC;
            }
        };
    }

    public final InterfaceC420801kM LJJZ(C09JN<? super T> c09jn, C09JN<? super Throwable> c09jn2, InterfaceC781210Ukh interfaceC781210Ukh) {
        return LJJZZI(c09jn, c09jn2, interfaceC781210Ukh, C19487811Me.LIZLLL);
    }

    public final C19497811Qa LJLJJI(long j, TimeUnit timeUnit, C098D c098d) {
        return LJLJJL(j, c098d, C11S5.LIZIZ, timeUnit);
    }

    public static <T1, T2, T3, R> C11NZ<R> LJIIJJI(C098D<? extends T1> c098d, C098D<? extends T2> c098d2, C098D<? extends T3> c098d3, InterfaceC953020auK<? super T1, ? super T2, ? super T3, ? extends R> interfaceC953020auK) {
        C1701890uOB.LIZ(c098d, "source1 is null");
        C1701890uOB.LIZ(c098d2, "source2 is null");
        C1701890uOB.LIZ(c098d3, "source3 is null");
        return LJIIIIZZ(new C953010auJ(interfaceC953020auK), C11NN.LL, c098d, c098d2, c098d3);
    }

    public static C11O1 LJJJJL(long j, long j2, TimeUnit timeUnit, C11RO c11ro) {
        C1701890uOB.LIZ(timeUnit, "unit is null");
        C1701890uOB.LIZ(c11ro, "scheduler is null");
        return new C11O1(Math.max(0L, j), Math.max(0L, j2), timeUnit, c11ro);
    }

    public static C11NZ LJLLI(C11NZ c11nz, C11NZ c11nz2, C11NZ c11nz3, InterfaceC953020auK interfaceC953020auK) {
        C1701890uOB.LIZ(c11nz, "source1 is null");
        C1701890uOB.LIZ(c11nz3, "source3 is null");
        return LJLLJ(new C953010auJ(interfaceC953020auK), C11NN.LL, c11nz, c11nz2, c11nz3);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.11OG] */
    public final C11OG LJII(final long j, final TimeUnit timeUnit, final C11RO c11ro, final int i) {
        final Callable callableAsCallable = EnumC23083092r.asCallable();
        C1701890uOB.LIZ(timeUnit, "unit is null");
        C1701890uOB.LIZ(c11ro, "scheduler is null");
        C1701890uOB.LIZ(callableAsCallable, "bufferSupplier is null");
        C1701890uOB.LIZIZ(i, "count");
        return new C11J7<T, U>(this, j, j, timeUnit, c11ro, callableAsCallable, i) { // from class: X.11OG
            public final long LLILLJJLI;
            public final long LLILLL;
            public final TimeUnit LLILZ;
            public final C11RO LLILZIL;
            public final Callable<U> LLILZLL;
            public final int LLIZ;
            public final boolean LLIZLLLIL = false;

            @Override // X.C11NZ
            public final void LJJZZIII(InterfaceC626120Oh8<? super U> interfaceC626120Oh8) {
                long j2 = this.LLILLJJLI;
                if (j2 == this.LLILLL && this.LLIZ == Integer.MAX_VALUE) {
                    this.LL.LIZIZ(new C11SH(new C11PI(interfaceC626120Oh8), this.LLILZLL, j2, this.LLILZ, this.LLILZIL));
                    return;
                }
                C11RN c11rnLIZ = this.LLILZIL.LIZ();
                long j3 = this.LLILLJJLI;
                long j4 = this.LLILLL;
                if (j3 == j4) {
                    this.LL.LIZIZ(new C11SJ(new C11PI(interfaceC626120Oh8), this.LLILZLL, j3, this.LLILZ, this.LLIZ, this.LLIZLLLIL, c11rnLIZ));
                } else {
                    this.LL.LIZIZ(new C11SI(new C11PI(interfaceC626120Oh8), this.LLILZLL, j3, j4, this.LLILZ, c11rnLIZ));
                }
            }

            {
                this.LLILLJJLI = j;
                this.LLILLL = j;
                this.LLILZ = timeUnit;
                this.LLILZIL = c11ro;
                this.LLILZLL = callableAsCallable;
                this.LLIZ = i;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C11NZ LJJIZ(final int i, final int i2, final InterfaceC1487280oo2 interfaceC1487280oo2, final boolean z) {
        C1701890uOB.LIZIZ(i, "maxConcurrency");
        C1701890uOB.LIZIZ(i2, "bufferSize");
        if (this instanceof InterfaceCallableC1559550qgb) {
            Object objCall = ((InterfaceCallableC1559550qgb) this).call();
            if (objCall == null) {
                return C11IR.LL;
            }
            return new C11KA(interfaceC1487280oo2, objCall);
        }
        return new C11J7<T, U>(this, interfaceC1487280oo2, z, i, i2) { // from class: X.11Nd
            public final InterfaceC1487280oo2<? super T, ? extends C098D<? extends U>> LLILLJJLI;
            public final boolean LLILLL;
            public final int LLILZ;
            public final int LLILZIL;

            @Override // X.C11NZ
            public final void LJJZZIII(InterfaceC626120Oh8<? super U> interfaceC626120Oh8) {
                if (C11KB.LIZ(this.LL, interfaceC626120Oh8, this.LLILLJJLI)) {
                    return;
                }
                this.LL.LIZIZ(new C11PY(this.LLILZ, this.LLILZIL, interfaceC626120Oh8, this.LLILLJJLI, this.LLILLL));
            }

            {
                this.LLILLJJLI = interfaceC1487280oo2;
                this.LLILLL = z;
                this.LLILZ = i;
                this.LLILZIL = i2;
            }
        };
    }

    public final InterfaceC420801kM LJJZZI(C09JN<? super T> c09jn, C09JN<? super Throwable> c09jn2, InterfaceC781210Ukh interfaceC781210Ukh, C09JN<? super InterfaceC420801kM> c09jn3) {
        C1701890uOB.LIZ(c09jn, "onNext is null");
        C1701890uOB.LIZ(c09jn2, "onError is null");
        C1701890uOB.LIZ(interfaceC781210Ukh, "onComplete is null");
        C11JF c11jf = new C11JF(c09jn, c09jn2, interfaceC781210Ukh, c09jn3);
        LIZIZ(c11jf);
        return c11jf;
    }

    public final C19497811Qa LJLJJL(final long j, final C098D c098d, final C11RO c11ro, final TimeUnit timeUnit) {
        C1701890uOB.LIZ(timeUnit, "timeUnit is null");
        C1701890uOB.LIZ(c11ro, "scheduler is null");
        return new C11J7<T, T>(this, j, timeUnit, c11ro, c098d) { // from class: X.11Qa
            public final long LLILLJJLI;
            public final TimeUnit LLILLL;
            public final C11RO LLILZ;
            public final C098D<? extends T> LLILZIL;

            @Override // X.C11NZ
            public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
                if (this.LLILZIL == null) {
                    C11QY c11qy = new C11QY(interfaceC626120Oh8, this.LLILLJJLI, this.LLILLL, this.LLILZ.LIZ());
                    interfaceC626120Oh8.onSubscribe(c11qy);
                    c11qy.LLILZIL.replace(c11qy.LLILZ.LIZJ(new RunnableC19497911Qb(0L, c11qy), c11qy.LLILLJJLI, c11qy.LLILLL));
                    this.LL.LIZIZ(c11qy);
                    return;
                }
                C11QZ c11qz = new C11QZ(interfaceC626120Oh8, this.LLILLJJLI, this.LLILLL, this.LLILZ.LIZ(), this.LLILZIL);
                interfaceC626120Oh8.onSubscribe(c11qz);
                c11qz.LLILZIL.replace(c11qz.LLILZ.LIZJ(new RunnableC19497911Qb(0L, c11qz), c11qz.LLILLJJLI, c11qz.LLILLL));
                this.LL.LIZIZ(c11qz);
            }

            {
                super(this);
                this.LLILLJJLI = j;
                this.LLILLL = timeUnit;
                this.LLILZ = c11ro;
                this.LLILZIL = c098d;
            }
        };
    }

    public static <T1, T2, T3, T4, R> C11NZ<R> LJIIL(C098D<? extends T1> c098d, C098D<? extends T2> c098d2, C098D<? extends T3> c098d3, C098D<? extends T4> c098d4, InterfaceC941150abB<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> interfaceC941150abB) {
        C1701890uOB.LIZ(c098d, "source1 is null");
        C1701890uOB.LIZ(c098d2, "source2 is null");
        C1701890uOB.LIZ(c098d3, "source3 is null");
        C1701890uOB.LIZ(c098d4, "source4 is null");
        return LJIIIIZZ(new C950560aqM(interfaceC941150abB), C11NN.LL, c098d, c098d2, c098d3, c098d4);
    }

    public static C11NZ<Long> LJJJJLL(long j, long j2, long j3, long j4, TimeUnit timeUnit) {
        C11RO c11ro = C11S5.LIZIZ;
        if (j2 >= 0) {
            if (j2 == 0) {
                C11IR c11ir = C11IR.LL;
                c11ir.getClass();
                C1701890uOB.LIZ(timeUnit, "unit is null");
                C1701890uOB.LIZ(c11ro, "scheduler is null");
                return new C11O5(c11ir, j3, timeUnit, c11ro);
            }
            long j5 = j + (j2 - 1);
            if (j > 0 && j5 < 0) {
                throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
            }
            C1701890uOB.LIZ(timeUnit, "unit is null");
            C1701890uOB.LIZ(c11ro, "scheduler is null");
            return new C11O2(j, j5, Math.max(0L, j3), Math.max(0L, j4), timeUnit, c11ro);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("count >= 0 required but it was ");
        sbLIZ.append(j2);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static C11NZ LJIIIZ(C11NZ c11nz, C11NZ c11nz2, C11NZ c11nz3, C11NZ c11nz4, C11J7 c11j7, final InterfaceC1627660sSS interfaceC1627660sSS) {
        C1701890uOB.LIZ(c11nz, "source1 is null");
        C1701890uOB.LIZ(c11nz2, "source2 is null");
        C1701890uOB.LIZ(c11nz3, "source3 is null");
        C1701890uOB.LIZ(c11nz4, "source4 is null");
        return LJIIIIZZ(new InterfaceC1487280oo2<Object[], R>(interfaceC1627660sSS) { // from class: X.0sST
            public final InterfaceC1627660sSS<T1, T2, T3, T4, T5, R> LL;

            {
                this.LL = interfaceC1627660sSS;
            }

            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object[] objArr) {
                Object[] objArr2 = objArr;
                if (objArr2.length == 5) {
                    return this.LL.LIZ((T1) objArr2[0], (T2) objArr2[1], (T3) objArr2[2], (T4) objArr2[3], (T5) objArr2[4]);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Array of size 5 expected but got ");
                sbLIZ.append(objArr2.length);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }, C11NN.LL, c11nz, c11nz2, c11nz3, c11nz4, c11j7);
    }
}
