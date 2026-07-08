package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.11Kz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19484711Kz<T> implements InterfaceC19473011Gm<T> {
    public abstract void LJJIJ(InterfaceC19474811He<? super T> interfaceC19474811He);

    public final T LJ() {
        C11R3 c11r3 = new C11R3();
        LIZ(c11r3);
        return (T) c11r3.LIZ();
    }

    public final InterfaceC420801kM LJJIIJ() {
        return LJJIIZ(C19487811Me.LIZLLL, C19487811Me.LJFF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C11NZ<T> LJJIJLIJ() {
        return this instanceof InterfaceC478520Ipe ? ((InterfaceC478520Ipe) this).LIZJ() : new C11NZ<T>(this) { // from class: X.11HX
            public final InterfaceC19473011Gm<? extends T> LL;

            {
                this.LL = this;
            }

            @Override // X.C11NZ
            public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
                this.LL.LIZ(new C11K4(interfaceC626120Oh8));
            }
        };
    }

    public static C11KS LJII(final InterfaceC300801Eo interfaceC300801Eo) {
        return new AbstractC19484711Kz<T>(interfaceC300801Eo) { // from class: X.11KS
            public final InterfaceC300801Eo<T> LL;

            {
                this.LL = interfaceC300801Eo;
            }

            @Override // X.AbstractC19484711Kz
            public final void LJJIJ(InterfaceC19474811He<? super T> interfaceC19474811He) throws Throwable {
                C11KT c11kt = new C11KT(interfaceC19474811He);
                interfaceC19474811He.onSubscribe(c11kt);
                try {
                    this.LL.subscribe(c11kt);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C11SP.LIZ(th);
                    c11kt.onError(th);
                }
            }
        };
    }

    public static C19478811Is LJIILLIIL(Throwable th) {
        C1701890uOB.LIZ(th, "error is null");
        return new C19478811Is(new CallableC19491911Nt(th));
    }

    public static C11LG LJIJI(final Callable callable) {
        return new AbstractC19484711Kz<T>(callable) { // from class: X.11LG
            public final Callable<? extends T> LL;

            {
                this.LL = callable;
            }

            @Override // X.AbstractC19484711Kz
            public final void LJJIJ(InterfaceC19474811He<? super T> interfaceC19474811He) throws Throwable {
                C11LO c11lo = new C11LO(C19487811Me.LIZIZ);
                interfaceC19474811He.onSubscribe(c11lo);
                if (c11lo.isDisposed()) {
                    return;
                }
                try {
                    T tCall = this.LL.call();
                    C1701890uOB.LIZ(tCall, "The callable returned a null value");
                    if (!c11lo.isDisposed()) {
                        interfaceC19474811He.onSuccess(tCall);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C11SP.LIZ(th);
                    if (!c11lo.isDisposed()) {
                        interfaceC19474811He.onError(th);
                    } else {
                        C19489211Ms.LIZIZ(th);
                    }
                }
            }
        };
    }

    public static C19474411Ha LJIJJ(C11NZ c11nz) {
        C1701890uOB.LIZ(c11nz, "observableSource is null");
        return new C19474411Ha(c11nz);
    }

    public static C19475311Hj LJIJJLI(final Object obj) {
        C1701890uOB.LIZ(obj, "value is null");
        return new AbstractC19484711Kz<T>(obj) { // from class: X.11Hj
            public final T LL;

            {
                this.LL = obj;
            }

            @Override // X.AbstractC19484711Kz
            public final void LJJIJ(InterfaceC19474811He<? super T> interfaceC19474811He) {
                interfaceC19474811He.onSubscribe(C11JT.INSTANCE);
                interfaceC19474811He.onSuccess(this.LL);
            }
        };
    }

    @Override // X.InterfaceC19473011Gm
    public final void LIZ(InterfaceC19474811He<? super T> interfaceC19474811He) {
        C1701890uOB.LIZ(interfaceC19474811He, "subscriber is null");
        try {
            LJJIJ(interfaceC19474811He);
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final Object LIZLLL(C0TCG c0tcg) {
        C1701890uOB.LIZ(c0tcg, "converter is null");
        return c0tcg.LIZ(this);
    }

    public final <R> AbstractC19484711Kz<R> LJFF(InterfaceC751480Tdq<? super T, ? extends R> interfaceC751480Tdq) {
        C1701890uOB.LIZ(interfaceC751480Tdq, "transformer is null");
        final InterfaceC19473011Gm<? extends R> interfaceC19473011GmLIZ = interfaceC751480Tdq.LIZ(this);
        C1701890uOB.LIZ(interfaceC19473011GmLIZ, "source is null");
        if (interfaceC19473011GmLIZ instanceof AbstractC19484711Kz) {
            return (AbstractC19484711Kz) interfaceC19473011GmLIZ;
        }
        return new AbstractC19484711Kz<T>(interfaceC19473011GmLIZ) { // from class: X.11HV
            public final InterfaceC19473011Gm<T> LL;

            {
                this.LL = interfaceC19473011GmLIZ;
            }

            @Override // X.AbstractC19484711Kz
            public final void LJJIJ(InterfaceC19474811He<? super T> interfaceC19474811He) {
                this.LL.LIZ(interfaceC19474811He);
            }
        };
    }

    public final C11J2 LJIIIZ(final C09JN c09jn) {
        return new AbstractC19484711Kz<T>(this, c09jn) { // from class: X.11J2
            public final InterfaceC19473011Gm<T> LL;
            public final C09JN<? super T> LLILLJJLI;

            @Override // X.AbstractC19484711Kz
            public final void LJJIJ(InterfaceC19474811He<? super T> interfaceC19474811He) {
                this.LL.LIZ(new C11J1(interfaceC19474811He, this.LLILLJJLI));
            }

            {
                this.LL = this;
                this.LLILLJJLI = c09jn;
            }
        };
    }

    public final C19481311Jr LJIIJ(final InterfaceC781210Ukh interfaceC781210Ukh) {
        return new AbstractC19484711Kz<T>(this, interfaceC781210Ukh) { // from class: X.11Jr
            public final InterfaceC19473011Gm<T> LL;
            public final InterfaceC781210Ukh LLILLJJLI;

            @Override // X.AbstractC19484711Kz
            public final void LJJIJ(InterfaceC19474811He<? super T> interfaceC19474811He) {
                this.LL.LIZ(new C19481211Jq(interfaceC19474811He, this.LLILLJJLI));
            }

            {
                this.LL = this;
                this.LLILLJJLI = interfaceC781210Ukh;
            }
        };
    }

    public final C11JP LJIIJJI(final InterfaceC781210Ukh interfaceC781210Ukh) {
        return new AbstractC19484711Kz<T>(this, interfaceC781210Ukh) { // from class: X.11JP
            public final InterfaceC19473011Gm<T> LL;
            public final InterfaceC781210Ukh LLILLJJLI;

            @Override // X.AbstractC19484711Kz
            public final void LJJIJ(InterfaceC19474811He<? super T> interfaceC19474811He) {
                this.LL.LIZ(new C11JO(interfaceC19474811He, this.LLILLJJLI));
            }

            {
                this.LL = this;
                this.LLILLJJLI = interfaceC781210Ukh;
            }
        };
    }

    public final C11KQ LJIIL(C09JN c09jn) {
        return new C11KQ(this, c09jn);
    }

    public final C11L3 LJIILIIL(C11L5 c11l5) {
        return new C11L3(this, c11l5);
    }

    public final C11J0 LJIILJJIL(final C09JN c09jn) {
        return new AbstractC19484711Kz<T>(this, c09jn) { // from class: X.11J0
            public final InterfaceC19473011Gm<T> LL;
            public final C09JN<? super InterfaceC420801kM> LLILLJJLI;

            @Override // X.AbstractC19484711Kz
            public final void LJJIJ(InterfaceC19474811He<? super T> interfaceC19474811He) {
                this.LL.LIZ((InterfaceC19474811He<? super T>) new InterfaceC19474811He<T>(interfaceC19474811He, this.LLILLJJLI) { // from class: X.11Iz
                    public final InterfaceC19474811He<? super T> LL;
                    public final C09JN<? super InterfaceC420801kM> LLILLJJLI;
                    public boolean LLILLL;

                    @Override // X.InterfaceC19474811He
                    public final void onError(Throwable th) {
                        if (this.LLILLL) {
                            C19489211Ms.LIZIZ(th);
                        } else {
                            this.LL.onError(th);
                        }
                    }

                    @Override // X.InterfaceC19474811He
                    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) throws Throwable {
                        try {
                            this.LLILLJJLI.accept(interfaceC420801kM);
                            this.LL.onSubscribe(interfaceC420801kM);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C11SP.LIZ(th);
                            this.LLILLL = true;
                            interfaceC420801kM.dispose();
                            C11JT.error(th, this.LL);
                        }
                    }

                    @Override // X.InterfaceC19474811He
                    public final void onSuccess(T t) {
                        if (this.LLILLL) {
                            return;
                        }
                        this.LL.onSuccess(t);
                    }

                    {
                        this.LL = interfaceC19474811He;
                        this.LLILLJJLI = c09jn;
                    }
                });
            }

            {
                this.LL = this;
                this.LLILLJJLI = c09jn;
            }
        };
    }

    public final C11L6 LJIILL(C09JN c09jn) {
        return new C11L6(this, c09jn);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.11Je] */
    public final C19480011Je LJIIZILJ(InterfaceC1487280oo2 interfaceC1487280oo2) {
        return new AbstractC19484711Kz<R>(this, interfaceC1487280oo2) { // from class: X.11Je
            public final InterfaceC19473011Gm<? extends T> LL;
            public final InterfaceC1487280oo2<? super T, ? extends InterfaceC19473011Gm<? extends R>> LLILLJJLI;

            @Override // X.AbstractC19484711Kz
            public final void LJJIJ(InterfaceC19474811He<? super R> interfaceC19474811He) {
                this.LL.LIZ(new C19479911Jd(interfaceC19474811He, this.LLILLJJLI));
            }

            {
                this.LLILLJJLI = interfaceC1487280oo2;
                this.LL = this;
            }
        };
    }

    public final AbstractC19486711Lt LJIJ(final InterfaceC1487280oo2<? super T, ? extends C11IV> interfaceC1487280oo2) {
        return new AbstractC19486711Lt(this, interfaceC1487280oo2) { // from class: X.11J4
            public final InterfaceC19473011Gm<T> LL;
            public final InterfaceC1487280oo2<? super T, ? extends C11IV> LLILLJJLI;

            @Override // X.AbstractC19486711Lt
            public final void LJIJJ(C11IY c11iy) {
                C11J3 c11j3 = new C11J3(c11iy, this.LLILLJJLI);
                c11iy.onSubscribe(c11j3);
                this.LL.LIZ(c11j3);
            }

            {
                this.LL = this;
                this.LLILLJJLI = interfaceC1487280oo2;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.11Jy] */
    public final C19482011Jy LJIL(InterfaceC1487280oo2 interfaceC1487280oo2) {
        return new AbstractC19484711Kz<R>(this, interfaceC1487280oo2) { // from class: X.11Jy
            public final InterfaceC19473011Gm<? extends T> LL;
            public final InterfaceC1487280oo2<? super T, ? extends R> LLILLJJLI;

            @Override // X.AbstractC19484711Kz
            public final void LJJIJ(InterfaceC19474811He<? super R> interfaceC19474811He) {
                this.LL.LIZ(new C19481911Jx(interfaceC19474811He, this.LLILLJJLI));
            }

            {
                this.LL = this;
                this.LLILLJJLI = interfaceC1487280oo2;
            }
        };
    }

    public final C11HU LJJ(C11RO c11ro) {
        C1701890uOB.LIZ(c11ro, "scheduler is null");
        return new AbstractC19484711Kz<T>(this, c11ro) { // from class: X.11HU
            public final InterfaceC19473011Gm<T> LL;
            public final C11RO LLILLJJLI;

            @Override // X.AbstractC19484711Kz
            public final void LJJIJ(InterfaceC19474811He<? super T> interfaceC19474811He) {
                this.LL.LIZ(new RunnableC19476711Hx(interfaceC19474811He, this.LLILLJJLI));
            }

            {
                this.LL = this;
                this.LLILLJJLI = c11ro;
            }
        };
    }

    public final C11HW LJJI(final InterfaceC1487280oo2 interfaceC1487280oo2) {
        return new AbstractC19484711Kz<T>(this, interfaceC1487280oo2) { // from class: X.11HW
            public final InterfaceC19473011Gm<? extends T> LL;
            public final InterfaceC1487280oo2<? super Throwable, ? extends InterfaceC19473011Gm<? extends T>> LLILLJJLI;

            @Override // X.AbstractC19484711Kz
            public final void LJJIJ(InterfaceC19474811He<? super T> interfaceC19474811He) {
                this.LL.LIZ(new C19478311In(interfaceC19474811He, this.LLILLJJLI));
            }

            {
                this.LL = this;
                this.LLILLJJLI = interfaceC1487280oo2;
            }
        };
    }

    public final C11HW LJJIFFI(AbstractC19484711Kz abstractC19484711Kz) {
        return LJJI(new CallableC19491911Nt(abstractC19484711Kz));
    }

    public final C11KD LJJII(InterfaceC1487280oo2 interfaceC1487280oo2) {
        return new C11KD(this, interfaceC1487280oo2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C11LM LJJIII(long j) {
        C11NN<T> c11lc;
        if (this instanceof InterfaceC1360530lVb) {
            c11lc = ((InterfaceC1360530lVb) this).LIZIZ();
        } else {
            c11lc = new C11LC<>(this);
        }
        c11lc.getClass();
        return new C11LM(c11lc.LJIIJJI(j, C19487811Me.LJI));
    }

    public final InterfaceC420801kM LJJIIJZLJL(C09JN<? super T> c09jn) {
        return LJJIIZ(c09jn, C19487811Me.LJFF);
    }

    public final C11L2 LJJIIZI(C11L5 c11l5) {
        C11L2 c11l2 = new C11L2(c11l5);
        LIZ(c11l2);
        return c11l2;
    }

    public final C19484011Ks LJJIJIIJI(C11RO c11ro) {
        C1701890uOB.LIZ(c11ro, "scheduler is null");
        return new AbstractC19484711Kz<T>(this, c11ro) { // from class: X.11Ks
            public final InterfaceC19473011Gm<? extends T> LL;
            public final C11RO LLILLJJLI;

            @Override // X.AbstractC19484711Kz
            public final void LJJIJ(InterfaceC19474811He<? super T> interfaceC19474811He) {
                RunnableC19483911Kr runnableC19483911Kr = new RunnableC19483911Kr(interfaceC19474811He, this.LL);
                interfaceC19474811He.onSubscribe(runnableC19483911Kr);
                runnableC19483911Kr.LLILLJJLI.replace(this.LLILLJJLI.LIZIZ(runnableC19483911Kr));
            }

            {
                this.LL = this;
                this.LLILLJJLI = c11ro;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.11NW] */
    public static C11NW LJI(AbstractC19484711Kz abstractC19484711Kz, AbstractC19484711Kz abstractC19484711Kz2) {
        final InterfaceC19473011Gm[] interfaceC19473011GmArr = {abstractC19484711Kz, abstractC19484711Kz2};
        int i = C11NN.LL;
        final C11NN<T> c11nn = new C11NN<T>(interfaceC19473011GmArr) { // from class: X.11OI
            public final T[] LLILLJJLI;

            {
                this.LLILLJJLI = interfaceC19473011GmArr;
            }

            @Override // X.C11NN
            public final void LJIILLIIL(final C11M9<? super T> c11m9) {
                if (c11m9 instanceof C11OM) {
                    final C11OM c11om = (C11OM) c11m9;
                    final T[] tArr = this.LLILLJJLI;
                    c11m9.onSubscribe(new C11OJ<T>(c11om, tArr) { // from class: X.11OL
                        public static final long serialVersionUID = 2587302975077663557L;
                        public final C11OM<? super T> LLILZ;

                        @Override // X.C11OJ
                        public final void LIZ() {
                            T[] tArr2 = this.LL;
                            int length = tArr2.length;
                            C11OM<? super T> c11om2 = this.LLILZ;
                            for (int i2 = this.LLILLJJLI; i2 != length; i2++) {
                                if (this.LLILLL) {
                                    return;
                                }
                                T t = tArr2[i2];
                                if (t == null) {
                                    c11om2.onError(new NullPointerException("array element is null"));
                                    return;
                                }
                                c11om2.LIZJ(t);
                            }
                            if (this.LLILLL) {
                                return;
                            }
                            c11om2.onComplete();
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
                        
                            r10.LLILLJJLI = r5;
                            r11 = addAndGet(-r2);
                         */
                        @Override // X.C11OJ
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void LIZIZ(long r11) {
                            /*
                                r10 = this;
                                T[] r7 = r10.LL
                                int r6 = r7.length
                                int r5 = r10.LLILLJJLI
                                X.11OM<? super T> r4 = r10.LLILZ
                                r8 = 0
                            L9:
                                r2 = 0
                            Lb:
                                int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
                                if (r0 == 0) goto L31
                                if (r5 == r6) goto L31
                                boolean r0 = r10.LLILLL
                                if (r0 == 0) goto L16
                                return
                            L16:
                                r0 = r7[r5]
                                if (r0 != 0) goto L25
                                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                                java.lang.String r0 = "array element is null"
                                r1.<init>(r0)
                                r4.onError(r1)
                                return
                            L25:
                                boolean r0 = r4.LIZJ(r0)
                                if (r0 == 0) goto L2e
                                r0 = 1
                                long r2 = r2 + r0
                            L2e:
                                int r5 = r5 + 1
                                goto Lb
                            L31:
                                if (r5 != r6) goto L3b
                                boolean r0 = r10.LLILLL
                                if (r0 != 0) goto L3a
                                r4.onComplete()
                            L3a:
                                return
                            L3b:
                                long r11 = r10.get()
                                int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
                                if (r0 != 0) goto Lb
                                r10.LLILLJJLI = r5
                                long r0 = -r2
                                long r11 = r10.addAndGet(r0)
                                int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                                if (r0 != 0) goto L9
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C11OL.LIZIZ(long):void");
                        }

                        {
                            super(tArr);
                            this.LLILZ = c11om;
                        }
                    });
                } else {
                    final T[] tArr2 = this.LLILLJJLI;
                    c11m9.onSubscribe(new C11OJ<T>(c11m9, tArr2) { // from class: X.11OK
                        public static final long serialVersionUID = 2587302975077663557L;
                        public final C11M9<? super T> LLILZ;

                        @Override // X.C11OJ
                        public final void LIZ() {
                            T[] tArr3 = this.LL;
                            int length = tArr3.length;
                            C11M9<? super T> c11m92 = this.LLILZ;
                            for (int i2 = this.LLILLJJLI; i2 != length; i2++) {
                                if (this.LLILLL) {
                                    return;
                                }
                                T t = tArr3[i2];
                                if (t == null) {
                                    c11m92.onError(new NullPointerException("array element is null"));
                                    return;
                                }
                                c11m92.onNext(t);
                            }
                            if (this.LLILLL) {
                                return;
                            }
                            c11m92.onComplete();
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
                        
                            r10.LLILLJJLI = r5;
                            r11 = addAndGet(-r2);
                         */
                        @Override // X.C11OJ
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void LIZIZ(long r11) {
                            /*
                                r10 = this;
                                T[] r7 = r10.LL
                                int r6 = r7.length
                                int r5 = r10.LLILLJJLI
                                X.11M9<? super T> r4 = r10.LLILZ
                                r8 = 0
                            L9:
                                r2 = 0
                            Lb:
                                int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
                                if (r0 == 0) goto L2e
                                if (r5 == r6) goto L2e
                                boolean r0 = r10.LLILLL
                                if (r0 == 0) goto L16
                                return
                            L16:
                                r0 = r7[r5]
                                if (r0 != 0) goto L25
                                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                                java.lang.String r0 = "array element is null"
                                r1.<init>(r0)
                                r4.onError(r1)
                                return
                            L25:
                                r4.onNext(r0)
                                r0 = 1
                                long r2 = r2 + r0
                                int r5 = r5 + 1
                                goto Lb
                            L2e:
                                if (r5 != r6) goto L38
                                boolean r0 = r10.LLILLL
                                if (r0 != 0) goto L37
                                r4.onComplete()
                            L37:
                                return
                            L38:
                                long r11 = r10.get()
                                int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
                                if (r0 != 0) goto Lb
                                r10.LLILLJJLI = r5
                                long r0 = -r2
                                long r11 = r10.addAndGet(r0)
                                int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                                if (r0 != 0) goto L9
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C11OK.LIZIZ(long):void");
                        }

                        {
                            super(tArr2);
                            this.LLILZ = c11m9;
                        }
                    });
                }
            }
        };
        C1701890uOB.LIZIZ(2, "prefetch");
        final EnumC19492211Nw enumC19492211Nw = EnumC19492211Nw.IMMEDIATE;
        return new C11NN<R>(c11nn, enumC19492211Nw) { // from class: X.11NW
            public final C11LE<T> LLILLJJLI;
            public final InterfaceC1487280oo2<? super T, ? extends C11LE<? extends R>> LLILLL;
            public final int LLILZ;
            public final EnumC19492211Nw LLILZIL;

            @Override // X.C11NN
            public final void LJIILLIIL(final C11M9<? super R> c11m9) {
                C11QP<T, R> c11qp;
                if (C11NQ.LIZ(this.LLILLJJLI, c11m9, this.LLILLL)) {
                    return;
                }
                C11LE<T> c11le = this.LLILLJJLI;
                final InterfaceC1487280oo2<? super T, ? extends C11LE<? extends R>> interfaceC1487280oo2 = this.LLILLL;
                final int i2 = this.LLILZ;
                int i3 = C19492111Nv.LIZ[this.LLILZIL.ordinal()];
                final boolean z = true;
                if (i3 != 1) {
                    if (i3 != 2) {
                        c11qp = new C11QP<T, R>(c11m9, interfaceC1487280oo2, i2) { // from class: X.11QO
                            public static final long serialVersionUID = 7898995095634264146L;
                            public final C11M9<? super R> LLJILJILJ;
                            public final AtomicInteger LLJILLL;

                            @Override // X.C11QP
                            public final void LIZLLL() throws Throwable {
                                if (this.LLJILLL.getAndIncrement() == 0) {
                                    while (!this.LLJ) {
                                        if (!this.LLJIJIL) {
                                            boolean z2 = this.LLIZLLLIL;
                                            try {
                                                T tPoll = this.LLIZ.poll();
                                                boolean z3 = tPoll == null;
                                                if (z2) {
                                                    if (z3) {
                                                        this.LLJILJILJ.onComplete();
                                                        return;
                                                    }
                                                } else if (!z3) {
                                                }
                                                try {
                                                    C11LE<? extends R> c11leApply = this.LLILLJJLI.apply(tPoll);
                                                    C1701890uOB.LIZ(c11leApply, "The mapper returned a null Publisher");
                                                    C11LE<? extends R> c11le2 = c11leApply;
                                                    if (this.LLJILJIL != 1) {
                                                        int i4 = this.LLILZLL + 1;
                                                        if (i4 == this.LLILZ) {
                                                            this.LLILZLL = 0;
                                                            this.LLILZIL.request(i4);
                                                        } else {
                                                            this.LLILZLL = i4;
                                                        }
                                                    }
                                                    if (c11le2 instanceof Callable) {
                                                        try {
                                                            Object objCall = ((Callable) c11le2).call();
                                                            if (objCall == null) {
                                                                continue;
                                                            } else if (!this.LL.isUnbounded()) {
                                                                this.LLJIJIL = true;
                                                                C11QQ<R> c11qq = this.LL;
                                                                c11qq.setSubscription(new C11QR(objCall, c11qq));
                                                            } else if (get() == 0 && compareAndSet(0, 1)) {
                                                                this.LLJILJILJ.onNext(objCall);
                                                                if (!compareAndSet(1, 0)) {
                                                                    this.LLJILJILJ.onError(this.LLJI.terminate());
                                                                    return;
                                                                }
                                                            }
                                                        } catch (Throwable th) {
                                                            TryCatchGuardChecker.doCheck(th);
                                                            C11SP.LIZ(th);
                                                            this.LLILZIL.cancel();
                                                            this.LLJI.addThrowable(th);
                                                            this.LLJILJILJ.onError(this.LLJI.terminate());
                                                            return;
                                                        }
                                                    } else {
                                                        this.LLJIJIL = true;
                                                        c11le2.subscribe(this.LL);
                                                    }
                                                } catch (Throwable th2) {
                                                    TryCatchGuardChecker.doCheck(th2);
                                                    C11SP.LIZ(th2);
                                                    this.LLILZIL.cancel();
                                                    this.LLJI.addThrowable(th2);
                                                    this.LLJILJILJ.onError(this.LLJI.terminate());
                                                    return;
                                                }
                                            } catch (Throwable th3) {
                                                TryCatchGuardChecker.doCheck(th3);
                                                C11SP.LIZ(th3);
                                                this.LLILZIL.cancel();
                                                this.LLJI.addThrowable(th3);
                                                this.LLJILJILJ.onError(this.LLJI.terminate());
                                                return;
                                            }
                                        }
                                        if (this.LLJILLL.decrementAndGet() == 0) {
                                            return;
                                        }
                                    }
                                }
                            }

                            @Override // X.C11QP
                            public final void LJ() {
                                this.LLJILJILJ.onSubscribe(this);
                            }

                            @Override // X.C11LR
                            public final void cancel() {
                                if (this.LLJ) {
                                    return;
                                }
                                this.LLJ = true;
                                this.LL.cancel();
                                this.LLILZIL.cancel();
                            }

                            @Override // X.C11QS
                            public final void LIZ(R r) {
                                if (get() == 0 && compareAndSet(0, 1)) {
                                    this.LLJILJILJ.onNext(r);
                                    if (compareAndSet(1, 0)) {
                                        return;
                                    }
                                    this.LLJILJILJ.onError(this.LLJI.terminate());
                                }
                            }

                            @Override // X.C11QS
                            public final void LIZIZ(Throwable th) {
                                if (this.LLJI.addThrowable(th)) {
                                    this.LLILZIL.cancel();
                                    if (getAndIncrement() == 0) {
                                        this.LLJILJILJ.onError(this.LLJI.terminate());
                                        return;
                                    }
                                    return;
                                }
                                C19489211Ms.LIZIZ(th);
                            }

                            @Override // X.C11M9
                            public final void onError(Throwable th) {
                                if (this.LLJI.addThrowable(th)) {
                                    this.LL.cancel();
                                    if (getAndIncrement() == 0) {
                                        this.LLJILJILJ.onError(this.LLJI.terminate());
                                        return;
                                    }
                                    return;
                                }
                                C19489211Ms.LIZIZ(th);
                            }

                            @Override // X.C11LR
                            public final void request(long j) {
                                this.LL.request(j);
                            }

                            {
                                super(interfaceC1487280oo2, i2);
                                this.LLJILJILJ = c11m9;
                                this.LLJILLL = new AtomicInteger();
                            }
                        };
                    } else {
                        c11qp = new C11QP<T, R>(c11m9, interfaceC1487280oo2, i2, z) { // from class: X.11QN
                            public static final long serialVersionUID = -2945777694260521066L;
                            public final C11M9<? super R> LLJILJILJ;
                            public final boolean LLJILLL;

                            @Override // X.C11QP
                            public final void LJ() {
                                this.LLJILJILJ.onSubscribe(this);
                            }

                            @Override // X.C11LR
                            public final void cancel() {
                                if (this.LLJ) {
                                    return;
                                }
                                this.LLJ = true;
                                this.LL.cancel();
                                this.LLILZIL.cancel();
                            }

                            @Override // X.C11QP
                            public final void LIZLLL() throws Throwable {
                                if (getAndIncrement() == 0) {
                                    while (!this.LLJ) {
                                        if (!this.LLJIJIL) {
                                            boolean z2 = this.LLIZLLLIL;
                                            if (z2 && !this.LLJILLL && this.LLJI.get() != null) {
                                                this.LLJILJILJ.onError(this.LLJI.terminate());
                                                return;
                                            }
                                            try {
                                                T tPoll = this.LLIZ.poll();
                                                boolean z3 = tPoll == null;
                                                if (z2) {
                                                    if (z3) {
                                                        Throwable thTerminate = this.LLJI.terminate();
                                                        if (thTerminate != null) {
                                                            this.LLJILJILJ.onError(thTerminate);
                                                            return;
                                                        } else {
                                                            this.LLJILJILJ.onComplete();
                                                            return;
                                                        }
                                                    }
                                                } else if (!z3) {
                                                }
                                                try {
                                                    C11LE<? extends R> c11leApply = this.LLILLJJLI.apply(tPoll);
                                                    C1701890uOB.LIZ(c11leApply, "The mapper returned a null Publisher");
                                                    C11LE<? extends R> c11le2 = c11leApply;
                                                    if (this.LLJILJIL != 1) {
                                                        int i4 = this.LLILZLL + 1;
                                                        if (i4 == this.LLILZ) {
                                                            this.LLILZLL = 0;
                                                            this.LLILZIL.request(i4);
                                                        } else {
                                                            this.LLILZLL = i4;
                                                        }
                                                    }
                                                    if (c11le2 instanceof Callable) {
                                                        try {
                                                            Object objCall = ((Callable) c11le2).call();
                                                            if (objCall == null) {
                                                                continue;
                                                            } else if (this.LL.isUnbounded()) {
                                                                this.LLJILJILJ.onNext(objCall);
                                                            } else {
                                                                this.LLJIJIL = true;
                                                                C11QQ<R> c11qq = this.LL;
                                                                c11qq.setSubscription(new C11QR(objCall, c11qq));
                                                            }
                                                        } catch (Throwable th) {
                                                            TryCatchGuardChecker.doCheck(th);
                                                            C11SP.LIZ(th);
                                                            this.LLILZIL.cancel();
                                                            this.LLJI.addThrowable(th);
                                                            this.LLJILJILJ.onError(this.LLJI.terminate());
                                                            return;
                                                        }
                                                    } else {
                                                        this.LLJIJIL = true;
                                                        c11le2.subscribe(this.LL);
                                                    }
                                                } catch (Throwable th2) {
                                                    TryCatchGuardChecker.doCheck(th2);
                                                    C11SP.LIZ(th2);
                                                    this.LLILZIL.cancel();
                                                    this.LLJI.addThrowable(th2);
                                                    this.LLJILJILJ.onError(this.LLJI.terminate());
                                                    return;
                                                }
                                            } catch (Throwable th3) {
                                                TryCatchGuardChecker.doCheck(th3);
                                                C11SP.LIZ(th3);
                                                this.LLILZIL.cancel();
                                                this.LLJI.addThrowable(th3);
                                                this.LLJILJILJ.onError(this.LLJI.terminate());
                                                return;
                                            }
                                        }
                                        if (decrementAndGet() == 0) {
                                            return;
                                        }
                                    }
                                }
                            }

                            @Override // X.C11QS
                            public final void LIZ(R r) {
                                this.LLJILJILJ.onNext(r);
                            }

                            @Override // X.C11QS
                            public final void LIZIZ(Throwable th) {
                                if (this.LLJI.addThrowable(th)) {
                                    if (!this.LLJILLL) {
                                        this.LLILZIL.cancel();
                                        this.LLIZLLLIL = true;
                                    }
                                    this.LLJIJIL = false;
                                    LIZLLL();
                                    return;
                                }
                                C19489211Ms.LIZIZ(th);
                            }

                            @Override // X.C11M9
                            public final void onError(Throwable th) {
                                if (this.LLJI.addThrowable(th)) {
                                    this.LLIZLLLIL = true;
                                    LIZLLL();
                                } else {
                                    C19489211Ms.LIZIZ(th);
                                }
                            }

                            @Override // X.C11LR
                            public final void request(long j) {
                                this.LL.request(j);
                            }

                            {
                                super(interfaceC1487280oo2, i2);
                                this.LLJILJILJ = c11m9;
                                this.LLJILLL = z;
                            }
                        };
                    }
                } else {
                    final boolean z2 = false;
                    c11qp = new C11QP<T, R>(c11m9, interfaceC1487280oo2, i2, z2) { // from class: X.11QN
                        public static final long serialVersionUID = -2945777694260521066L;
                        public final C11M9<? super R> LLJILJILJ;
                        public final boolean LLJILLL;

                        @Override // X.C11QP
                        public final void LJ() {
                            this.LLJILJILJ.onSubscribe(this);
                        }

                        @Override // X.C11LR
                        public final void cancel() {
                            if (this.LLJ) {
                                return;
                            }
                            this.LLJ = true;
                            this.LL.cancel();
                            this.LLILZIL.cancel();
                        }

                        @Override // X.C11QP
                        public final void LIZLLL() throws Throwable {
                            if (getAndIncrement() == 0) {
                                while (!this.LLJ) {
                                    if (!this.LLJIJIL) {
                                        boolean z22 = this.LLIZLLLIL;
                                        if (z22 && !this.LLJILLL && this.LLJI.get() != null) {
                                            this.LLJILJILJ.onError(this.LLJI.terminate());
                                            return;
                                        }
                                        try {
                                            T tPoll = this.LLIZ.poll();
                                            boolean z3 = tPoll == null;
                                            if (z22) {
                                                if (z3) {
                                                    Throwable thTerminate = this.LLJI.terminate();
                                                    if (thTerminate != null) {
                                                        this.LLJILJILJ.onError(thTerminate);
                                                        return;
                                                    } else {
                                                        this.LLJILJILJ.onComplete();
                                                        return;
                                                    }
                                                }
                                            } else if (!z3) {
                                            }
                                            try {
                                                C11LE<? extends R> c11leApply = this.LLILLJJLI.apply(tPoll);
                                                C1701890uOB.LIZ(c11leApply, "The mapper returned a null Publisher");
                                                C11LE<? extends R> c11le2 = c11leApply;
                                                if (this.LLJILJIL != 1) {
                                                    int i4 = this.LLILZLL + 1;
                                                    if (i4 == this.LLILZ) {
                                                        this.LLILZLL = 0;
                                                        this.LLILZIL.request(i4);
                                                    } else {
                                                        this.LLILZLL = i4;
                                                    }
                                                }
                                                if (c11le2 instanceof Callable) {
                                                    try {
                                                        Object objCall = ((Callable) c11le2).call();
                                                        if (objCall == null) {
                                                            continue;
                                                        } else if (this.LL.isUnbounded()) {
                                                            this.LLJILJILJ.onNext(objCall);
                                                        } else {
                                                            this.LLJIJIL = true;
                                                            C11QQ<R> c11qq = this.LL;
                                                            c11qq.setSubscription(new C11QR(objCall, c11qq));
                                                        }
                                                    } catch (Throwable th) {
                                                        TryCatchGuardChecker.doCheck(th);
                                                        C11SP.LIZ(th);
                                                        this.LLILZIL.cancel();
                                                        this.LLJI.addThrowable(th);
                                                        this.LLJILJILJ.onError(this.LLJI.terminate());
                                                        return;
                                                    }
                                                } else {
                                                    this.LLJIJIL = true;
                                                    c11le2.subscribe(this.LL);
                                                }
                                            } catch (Throwable th2) {
                                                TryCatchGuardChecker.doCheck(th2);
                                                C11SP.LIZ(th2);
                                                this.LLILZIL.cancel();
                                                this.LLJI.addThrowable(th2);
                                                this.LLJILJILJ.onError(this.LLJI.terminate());
                                                return;
                                            }
                                        } catch (Throwable th3) {
                                            TryCatchGuardChecker.doCheck(th3);
                                            C11SP.LIZ(th3);
                                            this.LLILZIL.cancel();
                                            this.LLJI.addThrowable(th3);
                                            this.LLJILJILJ.onError(this.LLJI.terminate());
                                            return;
                                        }
                                    }
                                    if (decrementAndGet() == 0) {
                                        return;
                                    }
                                }
                            }
                        }

                        @Override // X.C11QS
                        public final void LIZ(R r) {
                            this.LLJILJILJ.onNext(r);
                        }

                        @Override // X.C11QS
                        public final void LIZIZ(Throwable th) {
                            if (this.LLJI.addThrowable(th)) {
                                if (!this.LLJILLL) {
                                    this.LLILZIL.cancel();
                                    this.LLIZLLLIL = true;
                                }
                                this.LLJIJIL = false;
                                LIZLLL();
                                return;
                            }
                            C19489211Ms.LIZIZ(th);
                        }

                        @Override // X.C11M9
                        public final void onError(Throwable th) {
                            if (this.LLJI.addThrowable(th)) {
                                this.LLIZLLLIL = true;
                                LIZLLL();
                            } else {
                                C19489211Ms.LIZIZ(th);
                            }
                        }

                        @Override // X.C11LR
                        public final void request(long j) {
                            this.LL.request(j);
                        }

                        {
                            super(interfaceC1487280oo2, i2);
                            this.LLJILJILJ = c11m9;
                            this.LLJILLL = z2;
                        }
                    };
                }
                c11le.subscribe(c11qp);
            }

            {
                EnumC1840240xzK enumC1840240xzK = EnumC1840240xzK.LL;
                this.LLILLJJLI = c11nn;
                this.LLILLL = enumC1840240xzK;
                this.LLILZ = 2;
                this.LLILZIL = enumC19492211Nw;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.11I1] */
    public static C11I1 LJJIJL(final long j, final TimeUnit timeUnit) {
        final C11RO c11ro = C11S5.LIZIZ;
        C1701890uOB.LIZ(timeUnit, "unit is null");
        C1701890uOB.LIZ(c11ro, "scheduler is null");
        return new AbstractC19484711Kz<Long>(j, timeUnit, c11ro) { // from class: X.11I1
            public final long LL;
            public final TimeUnit LLILLJJLI;
            public final C11RO LLILLL;

            @Override // X.AbstractC19484711Kz
            public final void LJJIJ(InterfaceC19474811He<? super Long> interfaceC19474811He) {
                C11I0 c11i0 = new C11I0(interfaceC19474811He);
                interfaceC19474811He.onSubscribe(c11i0);
                C11JE.replace(c11i0, this.LLILLL.LIZJ(c11i0, this.LL, this.LLILLJJLI));
            }

            {
                this.LL = j;
                this.LLILLJJLI = timeUnit;
                this.LLILLL = c11ro;
            }
        };
    }

    public static C19485411Lg LJJIL(Iterable iterable, InterfaceC1487280oo2 interfaceC1487280oo2) {
        return new C19485411Lg(iterable, interfaceC1487280oo2);
    }

    public static <T, R> AbstractC19484711Kz<R> LJJJI(InterfaceC1487280oo2<? super Object[], ? extends R> interfaceC1487280oo2, InterfaceC19473011Gm<? extends T>... interfaceC19473011GmArr) {
        if (interfaceC19473011GmArr.length == 0) {
            return LJIILLIIL(new NoSuchElementException());
        }
        return new C19485511Lh(interfaceC1487280oo2, interfaceC19473011GmArr);
    }

    public final C11LU LJIIIIZZ(long j, TimeUnit timeUnit) {
        C11RO c11ro = C11S5.LIZIZ;
        C1701890uOB.LIZ(timeUnit, "unit is null");
        C1701890uOB.LIZ(c11ro, "scheduler is null");
        return new C11LU(this, j, timeUnit, c11ro);
    }

    public final InterfaceC420801kM LJJIIZ(C09JN<? super T> c09jn, C09JN<? super Throwable> c09jn2) {
        C1701890uOB.LIZ(c09jn, "onSuccess is null");
        C1701890uOB.LIZ(c09jn2, "onError is null");
        C11JL c11jl = new C11JL(c09jn, c09jn2);
        LIZ(c11jl);
        return c11jl;
    }

    public final C11I8 LJJIJIIJIL(long j, TimeUnit timeUnit) {
        return LJJIJIL(j, timeUnit, C11S5.LIZIZ, null);
    }

    public static AbstractC19484711Kz LJJJ(AbstractC19484711Kz abstractC19484711Kz, InterfaceC19473011Gm interfaceC19473011Gm, InterfaceC500500Jk0 interfaceC500500Jk0) {
        C1701890uOB.LIZ(interfaceC19473011Gm, "source2 is null");
        return LJJJI(new C1627730sSZ(interfaceC500500Jk0), abstractC19484711Kz, interfaceC19473011Gm);
    }

    public static AbstractC19484711Kz LJJIZ(AbstractC19484711Kz abstractC19484711Kz, AbstractC19484711Kz abstractC19484711Kz2, AbstractC19484711Kz abstractC19484711Kz3, InterfaceC953020auK interfaceC953020auK) {
        return LJJJI(new C953010auJ(interfaceC953020auK), abstractC19484711Kz, abstractC19484711Kz2, abstractC19484711Kz3);
    }

    public final C11I8 LJJIJIL(final long j, final TimeUnit timeUnit, final C11RO c11ro, final InterfaceC19473011Gm interfaceC19473011Gm) {
        C1701890uOB.LIZ(timeUnit, "unit is null");
        C1701890uOB.LIZ(c11ro, "scheduler is null");
        return new AbstractC19484711Kz<T>(this, j, timeUnit, c11ro, interfaceC19473011Gm) { // from class: X.11I8
            public final InterfaceC19473011Gm<T> LL;
            public final long LLILLJJLI;
            public final TimeUnit LLILLL;
            public final C11RO LLILZ;
            public final InterfaceC19473011Gm<? extends T> LLILZIL;

            @Override // X.AbstractC19484711Kz
            public final void LJJIJ(InterfaceC19474811He<? super T> interfaceC19474811He) {
                C11I7 c11i7 = new C11I7(interfaceC19474811He, this.LLILZIL, this.LLILLJJLI, this.LLILLL);
                interfaceC19474811He.onSubscribe(c11i7);
                C11JE.replace(c11i7.LLILLJJLI, this.LLILZ.LIZJ(c11i7, this.LLILLJJLI, this.LLILLL));
                this.LL.LIZ(c11i7);
            }

            {
                this.LL = this;
                this.LLILLJJLI = j;
                this.LLILLL = timeUnit;
                this.LLILZ = c11ro;
                this.LLILZIL = interfaceC19473011Gm;
            }
        };
    }
}
