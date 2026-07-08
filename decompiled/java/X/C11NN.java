package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.11NN, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11NN<T> implements C11LE<T> {
    public static final int LL = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    public abstract void LJIILLIIL(C11M9<? super T> c11m9);

    public static C11MN LIZLLL(Throwable th) {
        C1701890uOB.LIZ(th, "throwable is null");
        final CallableC19491911Nt callableC19491911Nt = new CallableC19491911Nt(th);
        return new C11NN<T>(callableC19491911Nt) { // from class: X.11MN
            public final Callable<? extends Throwable> LLILLJJLI;

            {
                this.LLILLJJLI = callableC19491911Nt;
            }

            @Override // X.C11NN
            public final void LJIILLIIL(C11M9<? super T> c11m9) throws Throwable {
                try {
                    Throwable thCall = this.LLILLJJLI.call();
                    C1701890uOB.LIZ(thCall, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
                    th = thCall;
                } catch (Throwable th2) {
                    th = th2;
                    TryCatchGuardChecker.doCheck(th);
                    C11SP.LIZ(th);
                }
                C11NS.error(th, c11m9);
            }
        };
    }

    public static C11M3 LJFF(Callable callable) {
        return new C11M3(callable);
    }

    public static C11NO LJIIIIZZ(Object obj) {
        C1701890uOB.LIZ(obj, "item is null");
        return new C11NO(obj);
    }

    public final <R> C11NN<R> LIZ(InterfaceC751490Tdr<? super T, ? extends R> interfaceC751490Tdr) {
        C1701890uOB.LIZ(interfaceC751490Tdr, "composer is null");
        final C11LE<? extends R> c11leLIZJ = interfaceC751490Tdr.LIZJ(this);
        if (c11leLIZJ instanceof C11NN) {
            return (C11NN) c11leLIZJ;
        }
        C1701890uOB.LIZ(c11leLIZJ, "publisher is null");
        return new C11NN<T>(c11leLIZJ) { // from class: X.11Lb
            public final C11LE<? extends T> LLILLJJLI;

            {
                this.LLILLJJLI = c11leLIZJ;
            }

            @Override // X.C11NN
            public final void LJIILLIIL(C11M9<? super T> c11m9) {
                this.LLILLJJLI.subscribe(c11m9);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> C11NN<R> LJ(final InterfaceC1487280oo2<? super T, ? extends C11LE<? extends R>> interfaceC1487280oo2) {
        final int i = LL;
        C1701890uOB.LIZ(interfaceC1487280oo2, "mapper is null");
        C1701890uOB.LIZIZ(i, "maxConcurrency");
        C1701890uOB.LIZIZ(i, "bufferSize");
        if (this instanceof InterfaceCallableC1559550qgb) {
            final Object objCall = ((InterfaceCallableC1559550qgb) this).call();
            if (objCall == null) {
                return C11NV.LLILLJJLI;
            }
            return new C11NN<R>(interfaceC1487280oo2, objCall) { // from class: X.11NP
                public final T LLILLJJLI;
                public final InterfaceC1487280oo2<? super T, ? extends C11LE<? extends R>> LLILLL;

                @Override // X.C11NN
                public final void LJIILLIIL(C11M9<? super R> c11m9) throws Throwable {
                    try {
                        C11LE<? extends R> c11leApply = this.LLILLL.apply(this.LLILLJJLI);
                        C1701890uOB.LIZ(c11leApply, "The mapper returned a null Publisher");
                        C11LE<? extends R> c11le = c11leApply;
                        if (c11le instanceof Callable) {
                            try {
                                Object objCall2 = ((Callable) c11le).call();
                                if (objCall2 == null) {
                                    C11NS.complete(c11m9);
                                    return;
                                } else {
                                    c11m9.onSubscribe(new C11NR(c11m9, objCall2));
                                    return;
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C11SP.LIZ(th);
                                C11NS.error(th, c11m9);
                                return;
                            }
                        }
                        c11le.subscribe(c11m9);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C11NS.error(th2, c11m9);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.LLILLJJLI = objCall;
                    this.LLILLL = interfaceC1487280oo2;
                }
            };
        }
        return new C11M6<T, U>(this, interfaceC1487280oo2, i, i) { // from class: X.11NX
            public final InterfaceC1487280oo2<? super T, ? extends C11LE<? extends U>> LLILLL;
            public final boolean LLILZ;
            public final int LLILZIL;
            public final int LLILZLL;

            @Override // X.C11NN
            public final void LJIILLIIL(C11M9<? super U> c11m9) {
                if (C11NQ.LIZ(this.LLILLJJLI, c11m9, this.LLILLL)) {
                    return;
                }
                this.LLILLJJLI.LJIILL(new C11PA(c11m9, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL));
            }

            {
                super(this);
                this.LLILLL = interfaceC1487280oo2;
                this.LLILZ = false;
                this.LLILZIL = i;
                this.LLILZLL = i;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.11OO] */
    public final C11OO LJIIIZ(final InterfaceC1487280oo2 interfaceC1487280oo2) {
        return new C11M6<T, U>(this, interfaceC1487280oo2) { // from class: X.11OO
            public final InterfaceC1487280oo2<? super T, ? extends U> LLILLL;

            @Override // X.C11NN
            public final void LJIILLIIL(final C11M9<? super U> c11m9) {
                if (c11m9 instanceof C11OM) {
                    C11NN<T> c11nn = this.LLILLJJLI;
                    final C11OM c11om = (C11OM) c11m9;
                    final InterfaceC1487280oo2<? super T, ? extends U> interfaceC1487280oo22 = this.LLILLL;
                    c11nn.LJIILL(new C11Q2<T, U>(c11om, interfaceC1487280oo22) { // from class: X.11Q6
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
                        @Override // X.C11OM
                        public final boolean LIZJ(T t) throws Throwable {
                            if (this.LLILZ) {
                                return false;
                            }
                            try {
                                U uApply = this.LLILZLL.apply(t);
                                C1701890uOB.LIZ(uApply, "The mapper function returned a null value.");
                                return this.LL.LIZJ((Object) uApply);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                LIZ(th);
                                return true;
                            }
                        }

                        /* JADX WARN: Type inference incomplete: some casts might be missing */
                        @Override // X.C11M9
                        public final void onNext(T t) throws Throwable {
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
                    return;
                }
                C11NN<T> c11nn2 = this.LLILLJJLI;
                final InterfaceC1487280oo2<? super T, ? extends U> interfaceC1487280oo23 = this.LLILLL;
                c11nn2.LJIILL(new C11Q3<T, U>(c11m9, interfaceC1487280oo23) { // from class: X.11Q5
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
                    @Override // X.C11M9
                    public final void onNext(T t) throws Throwable {
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
                            C11SP.LIZ(th);
                            this.LLILLJJLI.cancel();
                            onError(th);
                        }
                    }

                    @Override // X.InterfaceC19495111Oz
                    public final int requestFusion(int i) {
                        return LIZ(i);
                    }

                    {
                        this.LLILZLL = interfaceC1487280oo23;
                    }
                });
            }

            {
                super(this);
                this.LLILLL = interfaceC1487280oo2;
            }
        };
    }

    public final C11OP LJIIJ(final C11RO c11ro) {
        final int i = LL;
        C1701890uOB.LIZ(c11ro, "scheduler is null");
        C1701890uOB.LIZIZ(i, "bufferSize");
        return new C11M6<T, T>(this, c11ro, i) { // from class: X.11OP
            public final C11RO LLILLL;
            public final boolean LLILZ;
            public final int LLILZIL;

            @Override // X.C11NN
            public final void LJIILLIIL(final C11M9<? super T> c11m9) {
                final C11RN c11rnLIZ = this.LLILLL.LIZ();
                if (c11m9 instanceof C11OM) {
                    C11NN<T> c11nn = this.LLILLJJLI;
                    final C11OM c11om = (C11OM) c11m9;
                    final boolean z = this.LLILZ;
                    final int i2 = this.LLILZIL;
                    c11nn.LJIILL(new C11PC<T>(c11om, c11rnLIZ, z, i2) { // from class: X.11PD
                        public static final long serialVersionUID = 644624475404284533L;
                        public final C11OM<? super T> LLJILLL;
                        public long LLJJ;

                        @Override // X.C11PC
                        public final void LIZLLL() {
                            int iAddAndGet = 1;
                            while (!this.LLIZLLLIL) {
                                boolean z2 = this.LLJ;
                                this.LLJILLL.onNext(null);
                                if (z2) {
                                    this.LLIZLLLIL = true;
                                    Throwable th = this.LLJI;
                                    if (th != null) {
                                        this.LLJILLL.onError(th);
                                    } else {
                                        this.LLJILLL.onComplete();
                                    }
                                    this.LL.dispose();
                                    return;
                                }
                                iAddAndGet = addAndGet(-iAddAndGet);
                                if (iAddAndGet == 0) {
                                    return;
                                }
                            }
                        }

                        @Override // X.C11PC
                        public final void LIZIZ() throws Throwable {
                            C11OM<? super T> c11om2 = this.LLJILLL;
                            InterfaceC19494911Ox<T> interfaceC19494911Ox = this.LLIZ;
                            long j = this.LLJILJIL;
                            long j2 = this.LLJJ;
                            int iAddAndGet = 1;
                            while (true) {
                                long j3 = this.LLILZIL.get();
                                while (true) {
                                    if (j != j3) {
                                        boolean z2 = this.LLJ;
                                        try {
                                            T tPoll = interfaceC19494911Ox.poll();
                                            boolean z3 = tPoll == null;
                                            if (!LIZ(z2, z3, c11om2)) {
                                                if (z3) {
                                                    break;
                                                }
                                                if (c11om2.LIZJ(tPoll)) {
                                                    j++;
                                                }
                                                j2++;
                                                if (j2 == this.LLILZ) {
                                                    this.LLILZLL.request(j2);
                                                    j2 = 0;
                                                }
                                            } else {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            C11SP.LIZ(th);
                                            this.LLIZLLLIL = true;
                                            this.LLILZLL.cancel();
                                            interfaceC19494911Ox.clear();
                                            c11om2.onError(th);
                                            this.LL.dispose();
                                            return;
                                        }
                                    } else if (LIZ(this.LLJ, interfaceC19494911Ox.isEmpty(), c11om2)) {
                                        return;
                                    }
                                }
                                int i3 = get();
                                if (iAddAndGet == i3) {
                                    this.LLJILJIL = j;
                                    this.LLJJ = j2;
                                    iAddAndGet = addAndGet(-iAddAndGet);
                                    if (iAddAndGet == 0) {
                                        return;
                                    }
                                } else {
                                    iAddAndGet = i3;
                                }
                            }
                        }

                        @Override // X.C11PC
                        public final void LJ() throws Throwable {
                            C11OM<? super T> c11om2 = this.LLJILLL;
                            InterfaceC19494911Ox<T> interfaceC19494911Ox = this.LLIZ;
                            long j = this.LLJILJIL;
                            int iAddAndGet = 1;
                            while (true) {
                                long j2 = this.LLILZIL.get();
                                while (j != j2) {
                                    try {
                                        T tPoll = interfaceC19494911Ox.poll();
                                        if (this.LLIZLLLIL) {
                                            return;
                                        }
                                        if (tPoll == null) {
                                            this.LLIZLLLIL = true;
                                            c11om2.onComplete();
                                            this.LL.dispose();
                                            return;
                                        } else if (c11om2.LIZJ(tPoll)) {
                                            j++;
                                        }
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        C11SP.LIZ(th);
                                        this.LLIZLLLIL = true;
                                        this.LLILZLL.cancel();
                                        c11om2.onError(th);
                                        this.LL.dispose();
                                        return;
                                    }
                                }
                                if (this.LLIZLLLIL) {
                                    return;
                                }
                                if (interfaceC19494911Ox.isEmpty()) {
                                    this.LLIZLLLIL = true;
                                    c11om2.onComplete();
                                    this.LL.dispose();
                                    return;
                                } else {
                                    int i3 = get();
                                    if (iAddAndGet == i3) {
                                        this.LLJILJIL = j;
                                        iAddAndGet = addAndGet(-iAddAndGet);
                                        if (iAddAndGet == 0) {
                                            return;
                                        }
                                    } else {
                                        iAddAndGet = i3;
                                    }
                                }
                            }
                        }

                        @Override // X.C11NT, X.InterfaceC19494911Ox
                        public final T poll() {
                            T tPoll = this.LLIZ.poll();
                            if (tPoll != null && this.LLJIJIL != 1) {
                                long j = this.LLJJ + 1;
                                if (j != this.LLILZ) {
                                    this.LLJJ = j;
                                    return tPoll;
                                }
                                this.LLJJ = 0L;
                                this.LLILZLL.request(j);
                            }
                            return tPoll;
                        }

                        @Override // X.C11PF, X.C11M9
                        public final void onSubscribe(C11LR c11lr) {
                            if (C11NC.validate(this.LLILZLL, c11lr)) {
                                this.LLILZLL = c11lr;
                                if (c11lr instanceof InterfaceC19495511Pd) {
                                    InterfaceC19495111Oz interfaceC19495111Oz = (InterfaceC19495111Oz) c11lr;
                                    int iRequestFusion = interfaceC19495111Oz.requestFusion(7);
                                    if (iRequestFusion == 1) {
                                        this.LLJIJIL = 1;
                                        this.LLIZ = interfaceC19495111Oz;
                                        this.LLJ = true;
                                        this.LLJILLL.onSubscribe(this);
                                        return;
                                    }
                                    if (iRequestFusion == 2) {
                                        this.LLJIJIL = 2;
                                        this.LLIZ = interfaceC19495111Oz;
                                        this.LLJILLL.onSubscribe(this);
                                        c11lr.request(this.LLILLL);
                                        return;
                                    }
                                }
                                this.LLIZ = new C19500211Qy(this.LLILLL);
                                this.LLJILLL.onSubscribe(this);
                                c11lr.request(this.LLILLL);
                            }
                        }

                        {
                            super(c11rnLIZ, z, i2);
                            this.LLJILLL = c11om;
                        }
                    });
                    return;
                }
                C11NN<T> c11nn2 = this.LLILLJJLI;
                final boolean z2 = this.LLILZ;
                final int i3 = this.LLILZIL;
                c11nn2.LJIILL(new C11PC<T>(c11m9, c11rnLIZ, z2, i3) { // from class: X.11PE
                    public static final long serialVersionUID = -4547113800637756442L;
                    public final C11M9<? super T> LLJILLL;

                    @Override // X.C11PC
                    public final void LIZLLL() {
                        int iAddAndGet = 1;
                        while (!this.LLIZLLLIL) {
                            boolean z3 = this.LLJ;
                            this.LLJILLL.onNext(null);
                            if (z3) {
                                this.LLIZLLLIL = true;
                                Throwable th = this.LLJI;
                                if (th != null) {
                                    this.LLJILLL.onError(th);
                                } else {
                                    this.LLJILLL.onComplete();
                                }
                                this.LL.dispose();
                                return;
                            }
                            iAddAndGet = addAndGet(-iAddAndGet);
                            if (iAddAndGet == 0) {
                                return;
                            }
                        }
                    }

                    @Override // X.C11PC
                    public final void LIZIZ() throws Throwable {
                        C11M9<? super T> c11m92 = this.LLJILLL;
                        InterfaceC19494911Ox<T> interfaceC19494911Ox = this.LLIZ;
                        long j = this.LLJILJIL;
                        int iAddAndGet = 1;
                        while (true) {
                            long jAddAndGet = this.LLILZIL.get();
                            while (true) {
                                if (j != jAddAndGet) {
                                    boolean z3 = this.LLJ;
                                    try {
                                        T tPoll = interfaceC19494911Ox.poll();
                                        boolean z4 = tPoll == null;
                                        if (!LIZ(z3, z4, c11m92)) {
                                            if (z4) {
                                                break;
                                            }
                                            c11m92.onNext(tPoll);
                                            j++;
                                            if (j == this.LLILZ) {
                                                if (jAddAndGet != Long.MAX_VALUE) {
                                                    jAddAndGet = this.LLILZIL.addAndGet(-j);
                                                }
                                                this.LLILZLL.request(j);
                                                j = 0;
                                            }
                                        } else {
                                            return;
                                        }
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        C11SP.LIZ(th);
                                        this.LLIZLLLIL = true;
                                        this.LLILZLL.cancel();
                                        interfaceC19494911Ox.clear();
                                        c11m92.onError(th);
                                        this.LL.dispose();
                                        return;
                                    }
                                } else if (LIZ(this.LLJ, interfaceC19494911Ox.isEmpty(), c11m92)) {
                                    return;
                                }
                            }
                            int i4 = get();
                            if (iAddAndGet == i4) {
                                this.LLJILJIL = j;
                                iAddAndGet = addAndGet(-iAddAndGet);
                                if (iAddAndGet == 0) {
                                    return;
                                }
                            } else {
                                iAddAndGet = i4;
                            }
                        }
                    }

                    @Override // X.C11PC
                    public final void LJ() throws Throwable {
                        C11M9<? super T> c11m92 = this.LLJILLL;
                        InterfaceC19494911Ox<T> interfaceC19494911Ox = this.LLIZ;
                        long j = this.LLJILJIL;
                        int iAddAndGet = 1;
                        while (true) {
                            long j2 = this.LLILZIL.get();
                            while (j != j2) {
                                try {
                                    T tPoll = interfaceC19494911Ox.poll();
                                    if (this.LLIZLLLIL) {
                                        return;
                                    }
                                    if (tPoll == null) {
                                        this.LLIZLLLIL = true;
                                        c11m92.onComplete();
                                        this.LL.dispose();
                                        return;
                                    }
                                    c11m92.onNext(tPoll);
                                    j++;
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C11SP.LIZ(th);
                                    this.LLIZLLLIL = true;
                                    this.LLILZLL.cancel();
                                    c11m92.onError(th);
                                    this.LL.dispose();
                                    return;
                                }
                            }
                            if (this.LLIZLLLIL) {
                                return;
                            }
                            if (interfaceC19494911Ox.isEmpty()) {
                                this.LLIZLLLIL = true;
                                c11m92.onComplete();
                                this.LL.dispose();
                                return;
                            } else {
                                int i4 = get();
                                if (iAddAndGet == i4) {
                                    this.LLJILJIL = j;
                                    iAddAndGet = addAndGet(-iAddAndGet);
                                    if (iAddAndGet == 0) {
                                        return;
                                    }
                                } else {
                                    iAddAndGet = i4;
                                }
                            }
                        }
                    }

                    @Override // X.C11NT, X.InterfaceC19494911Ox
                    public final T poll() {
                        T tPoll = this.LLIZ.poll();
                        if (tPoll != null && this.LLJIJIL != 1) {
                            long j = this.LLJILJIL + 1;
                            if (j != this.LLILZ) {
                                this.LLJILJIL = j;
                                return tPoll;
                            }
                            this.LLJILJIL = 0L;
                            this.LLILZLL.request(j);
                        }
                        return tPoll;
                    }

                    @Override // X.C11PF, X.C11M9
                    public final void onSubscribe(C11LR c11lr) {
                        if (C11NC.validate(this.LLILZLL, c11lr)) {
                            this.LLILZLL = c11lr;
                            if (c11lr instanceof InterfaceC19495511Pd) {
                                InterfaceC19495111Oz interfaceC19495111Oz = (InterfaceC19495111Oz) c11lr;
                                int iRequestFusion = interfaceC19495111Oz.requestFusion(7);
                                if (iRequestFusion == 1) {
                                    this.LLJIJIL = 1;
                                    this.LLIZ = interfaceC19495111Oz;
                                    this.LLJ = true;
                                    this.LLJILLL.onSubscribe(this);
                                    return;
                                }
                                if (iRequestFusion == 2) {
                                    this.LLJIJIL = 2;
                                    this.LLIZ = interfaceC19495111Oz;
                                    this.LLJILLL.onSubscribe(this);
                                    c11lr.request(this.LLILLL);
                                    return;
                                }
                            }
                            this.LLIZ = new C19500211Qy(this.LLILLL);
                            this.LLJILLL.onSubscribe(this);
                            c11lr.request(this.LLILLL);
                        }
                    }

                    {
                        super(c11rnLIZ, z2, i3);
                        this.LLJILLL = c11m9;
                    }
                });
            }

            {
                super(this);
                this.LLILLL = c11ro;
                this.LLILZ = false;
                this.LLILZIL = i;
            }
        };
    }

    public final InterfaceC420801kM LJIIL(C09JN<? super T> c09jn) {
        return LJIILJJIL(c09jn, C19487811Me.LJFF, C19487811Me.LIZJ, C11NU.INSTANCE);
    }

    public final void LJIILL(C11PF<? super T> c11pf) {
        C1701890uOB.LIZ(c11pf, "s is null");
        try {
            LJIILLIIL(c11pf);
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

    public final C11OA LJIIZILJ(final C11RO c11ro) {
        C1701890uOB.LIZ(c11ro, "scheduler is null");
        final boolean z = !(this instanceof C19496211Pk);
        return new C11M6<T, T>(this, c11ro, z) { // from class: X.11OA
            public final C11RO LLILLL;
            public final boolean LLILZ;

            @Override // X.C11NN
            public final void LJIILLIIL(C11M9<? super T> c11m9) {
                C11RN c11rnLIZ = this.LLILLL.LIZ();
                C11OB c11ob = new C11OB(c11m9, c11rnLIZ, this.LLILLJJLI, this.LLILZ);
                c11m9.onSubscribe(c11ob);
                c11rnLIZ.LIZIZ(c11ob);
            }

            {
                super(this);
                this.LLILLL = c11ro;
                this.LLILZ = z;
            }
        };
    }

    @Override // X.C11LE
    public final void subscribe(C11M9<? super T> c11m9) {
        if (c11m9 instanceof C11PF) {
            LJIILL((C11PF) c11m9);
        } else {
            C1701890uOB.LIZ(c11m9, "s is null");
            LJIILL(new C11ND(c11m9));
        }
    }

    public static C11O0 LJII(long j, TimeUnit timeUnit) {
        return LJI(j, j, timeUnit, C11S5.LIZIZ);
    }

    public final C11OQ LJIIJJI(final long j, final InterfaceC19483011Ki interfaceC19483011Ki) {
        if (j >= 0) {
            return new C11M6<T, T>(this, j, interfaceC19483011Ki) { // from class: X.11OQ
                public final InterfaceC19483011Ki<? super Throwable> LLILLL;
                public final long LLILZ;

                @Override // X.C11NN
                public final void LJIILLIIL(C11M9<? super T> c11m9) {
                    C11OS c11os = new C11OS(false);
                    c11m9.onSubscribe(c11os);
                    new C11OR(c11m9, this.LLILZ, this.LLILLL, c11os, this.LLILLJJLI).LIZ();
                }

                {
                    super(this);
                    this.LLILLL = interfaceC19483011Ki;
                    this.LLILZ = j;
                }
            };
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("times >= 0 required but it was ");
        sbLIZ.append(j);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final InterfaceC420801kM LJIILIIL(C09JN<? super T> c09jn, C09JN<? super Throwable> c09jn2) {
        return LJIILJJIL(c09jn, c09jn2, C19487811Me.LIZJ, C11NU.INSTANCE);
    }

    public final C11OH LIZIZ(final C09JN c09jn, final C09JN c09jn2, final InterfaceC781210Ukh interfaceC781210Ukh) {
        return new C11M6<T, T>(this, c09jn, c09jn2, interfaceC781210Ukh) { // from class: X.11OH
            public final C09JN<? super T> LLILLL;
            public final C09JN<? super Throwable> LLILZ;
            public final InterfaceC781210Ukh LLILZIL;
            public final InterfaceC781210Ukh LLILZLL;

            @Override // X.C11NN
            public final void LJIILLIIL(final C11M9<? super T> c11m9) {
                if (c11m9 instanceof C11OM) {
                    C11NN<T> c11nn = this.LLILLJJLI;
                    final C11OM c11om = (C11OM) c11m9;
                    final C09JN<? super T> c09jn3 = this.LLILLL;
                    final C09JN<? super Throwable> c09jn4 = this.LLILZ;
                    final InterfaceC781210Ukh interfaceC781210Ukh2 = this.LLILZIL;
                    final InterfaceC781210Ukh interfaceC781210Ukh3 = this.LLILZLL;
                    c11nn.LJIILL(new C11Q2<T, T>(c11om, c09jn3, c09jn4, interfaceC781210Ukh2, interfaceC781210Ukh3) { // from class: X.11Q0
                        public final C09JN<? super T> LLILZLL;
                        public final C09JN<? super Throwable> LLIZ;
                        public final InterfaceC781210Ukh LLIZLLLIL;
                        public final InterfaceC781210Ukh LLJ;

                        @Override // X.InterfaceC19494911Ox
                        public final T poll() throws Throwable {
                            try {
                                T tPoll = this.LLILLL.poll();
                                if (tPoll == null) {
                                    if (this.LLILZIL == 1) {
                                        this.LLIZLLLIL.run();
                                        this.LLJ.run();
                                    }
                                    return tPoll;
                                }
                                try {
                                    this.LLILZLL.accept(tPoll);
                                    this.LLJ.run();
                                    return tPoll;
                                } catch (Throwable th) {
                                    try {
                                        TryCatchGuardChecker.doCheck(th);
                                        C11SP.LIZ(th);
                                        try {
                                            this.LLIZ.accept(th);
                                            C11NG c11ng = C11QG.LIZ;
                                            if (th instanceof Exception) {
                                                throw th;
                                            }
                                            throw th;
                                        } catch (Throwable th2) {
                                            TryCatchGuardChecker.doCheck(th2);
                                            throw new C0VYA(th, th2);
                                        }
                                    } catch (Throwable th3) {
                                        TryCatchGuardChecker.doCheck(th3);
                                        this.LLJ.run();
                                        throw th3;
                                    }
                                }
                            } catch (Throwable th4) {
                                TryCatchGuardChecker.doCheck(th4);
                                C11SP.LIZ(th4);
                                try {
                                    this.LLIZ.accept(th4);
                                    C11NG c11ng2 = C11QG.LIZ;
                                    if (th4 instanceof Exception) {
                                        throw th4;
                                    }
                                    throw th4;
                                } catch (Throwable th5) {
                                    TryCatchGuardChecker.doCheck(th5);
                                    throw new C0VYA(th4, th5);
                                }
                            }
                        }

                        @Override // X.C11Q2, X.C11M9
                        public final void onComplete() throws Throwable {
                            if (this.LLILZ) {
                                return;
                            }
                            try {
                                this.LLIZLLLIL.run();
                                this.LLILZ = true;
                                this.LL.onComplete();
                                try {
                                    this.LLJ.run();
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C11SP.LIZ(th);
                                    C19489211Ms.LIZIZ(th);
                                }
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                LIZ(th2);
                            }
                        }

                        /* JADX WARN: Type inference incomplete: some casts might be missing */
                        @Override // X.C11OM
                        public final boolean LIZJ(T t) throws Throwable {
                            if (this.LLILZ) {
                                return false;
                            }
                            try {
                                this.LLILZLL.accept(t);
                                return this.LL.LIZJ((Object) t);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                LIZ(th);
                                return false;
                            }
                        }

                        @Override // X.C11Q2, X.C11M9
                        public final void onError(Throwable th) throws Throwable {
                            if (this.LLILZ) {
                                C19489211Ms.LIZIZ(th);
                                return;
                            }
                            this.LLILZ = true;
                            try {
                                this.LLIZ.accept(th);
                                this.LL.onError(th);
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                C11SP.LIZ(th2);
                                this.LL.onError(new C0VYA(th, th2));
                            }
                            try {
                                this.LLJ.run();
                            } catch (Throwable th3) {
                                TryCatchGuardChecker.doCheck(th3);
                                C11SP.LIZ(th3);
                                C19489211Ms.LIZIZ(th3);
                            }
                        }

                        /* JADX WARN: Type inference incomplete: some casts might be missing */
                        @Override // X.C11M9
                        public final void onNext(T t) throws Throwable {
                            if (this.LLILZ) {
                                return;
                            }
                            if (this.LLILZIL != 0) {
                                this.LL.onNext(null);
                                return;
                            }
                            try {
                                this.LLILZLL.accept(t);
                                this.LL.onNext((Object) t);
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
                            this.LLILZLL = c09jn3;
                            this.LLIZ = c09jn4;
                            this.LLIZLLLIL = interfaceC781210Ukh2;
                            this.LLJ = interfaceC781210Ukh3;
                        }
                    });
                    return;
                }
                C11NN<T> c11nn2 = this.LLILLJJLI;
                final C09JN<? super T> c09jn5 = this.LLILLL;
                final C09JN<? super Throwable> c09jn6 = this.LLILZ;
                final InterfaceC781210Ukh interfaceC781210Ukh4 = this.LLILZIL;
                final InterfaceC781210Ukh interfaceC781210Ukh5 = this.LLILZLL;
                c11nn2.LJIILL(new C11Q3<T, T>(c11m9, c09jn5, c09jn6, interfaceC781210Ukh4, interfaceC781210Ukh5) { // from class: X.11Q1
                    public final C09JN<? super T> LLILZLL;
                    public final C09JN<? super Throwable> LLIZ;
                    public final InterfaceC781210Ukh LLIZLLLIL;
                    public final InterfaceC781210Ukh LLJ;

                    @Override // X.InterfaceC19494911Ox
                    public final T poll() throws Throwable {
                        try {
                            T tPoll = this.LLILLL.poll();
                            if (tPoll == null) {
                                if (this.LLILZIL == 1) {
                                    this.LLIZLLLIL.run();
                                    this.LLJ.run();
                                }
                                return tPoll;
                            }
                            try {
                                this.LLILZLL.accept(tPoll);
                                this.LLJ.run();
                                return tPoll;
                            } catch (Throwable th) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    C11SP.LIZ(th);
                                    try {
                                        this.LLIZ.accept(th);
                                        C11NG c11ng = C11QG.LIZ;
                                        if (th instanceof Exception) {
                                            throw th;
                                        }
                                        throw th;
                                    } catch (Throwable th2) {
                                        TryCatchGuardChecker.doCheck(th2);
                                        throw new C0VYA(th, th2);
                                    }
                                } catch (Throwable th3) {
                                    TryCatchGuardChecker.doCheck(th3);
                                    this.LLJ.run();
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            TryCatchGuardChecker.doCheck(th4);
                            C11SP.LIZ(th4);
                            try {
                                this.LLIZ.accept(th4);
                                C11NG c11ng2 = C11QG.LIZ;
                                if (th4 instanceof Exception) {
                                    throw th4;
                                }
                                throw th4;
                            } catch (Throwable th5) {
                                TryCatchGuardChecker.doCheck(th5);
                                throw new C0VYA(th4, th5);
                            }
                        }
                    }

                    @Override // X.C11Q3, X.C11M9
                    public final void onComplete() throws Throwable {
                        if (this.LLILZ) {
                            return;
                        }
                        try {
                            this.LLIZLLLIL.run();
                            this.LLILZ = true;
                            this.LL.onComplete();
                            try {
                                this.LLJ.run();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C11SP.LIZ(th);
                                C19489211Ms.LIZIZ(th);
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            C11SP.LIZ(th2);
                            this.LLILLJJLI.cancel();
                            onError(th2);
                        }
                    }

                    @Override // X.C11Q3, X.C11M9
                    public final void onError(Throwable th) throws Throwable {
                        if (this.LLILZ) {
                            C19489211Ms.LIZIZ(th);
                            return;
                        }
                        this.LLILZ = true;
                        try {
                            this.LLIZ.accept(th);
                            this.LL.onError(th);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            C11SP.LIZ(th2);
                            this.LL.onError(new C0VYA(th, th2));
                        }
                        try {
                            this.LLJ.run();
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                            C11SP.LIZ(th3);
                            C19489211Ms.LIZIZ(th3);
                        }
                    }

                    /* JADX WARN: Type inference incomplete: some casts might be missing */
                    @Override // X.C11M9
                    public final void onNext(T t) throws Throwable {
                        if (this.LLILZ) {
                            return;
                        }
                        if (this.LLILZIL != 0) {
                            this.LL.onNext(null);
                            return;
                        }
                        try {
                            this.LLILZLL.accept(t);
                            this.LL.onNext((Object) t);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C11SP.LIZ(th);
                            this.LLILLJJLI.cancel();
                            onError(th);
                        }
                    }

                    @Override // X.InterfaceC19495111Oz
                    public final int requestFusion(int i) {
                        return LIZ(i);
                    }

                    {
                        this.LLILZLL = c09jn5;
                        this.LLIZ = c09jn6;
                        this.LLIZLLLIL = interfaceC781210Ukh4;
                        this.LLJ = interfaceC781210Ukh5;
                    }
                });
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this);
                C1239380iMC c1239380iMC = C19487811Me.LIZJ;
                this.LLILLL = c09jn;
                this.LLILZ = c09jn2;
                this.LLILZIL = interfaceC781210Ukh;
                this.LLILZLL = c1239380iMC;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.11O0] */
    public static C11O0 LJI(long j, long j2, final TimeUnit timeUnit, final C11RO c11ro) {
        C1701890uOB.LIZ(timeUnit, "unit is null");
        C1701890uOB.LIZ(c11ro, "scheduler is null");
        final long jMax = Math.max(0L, j);
        final long jMax2 = Math.max(0L, j2);
        return new C11NN<Long>(jMax, jMax2, timeUnit, c11ro) { // from class: X.11O0
            public final C11RO LLILLJJLI;
            public final long LLILLL;
            public final long LLILZ;
            public final TimeUnit LLILZIL;

            @Override // X.C11NN
            public final void LJIILLIIL(C11M9<? super Long> c11m9) {
                RunnableC19492511Nz runnableC19492511Nz = new RunnableC19492511Nz(c11m9);
                c11m9.onSubscribe(runnableC19492511Nz);
                C11RO c11ro2 = this.LLILLJJLI;
                if (c11ro2 instanceof C1701840uO6) {
                    C11RN c11rnLIZ = c11ro2.LIZ();
                    C11JE.setOnce(runnableC19492511Nz.LLILLL, c11rnLIZ);
                    c11rnLIZ.LIZLLL(runnableC19492511Nz, this.LLILLL, this.LLILZ, this.LLILZIL);
                } else {
                    C11JE.setOnce(runnableC19492511Nz.LLILLL, c11ro2.LIZLLL(runnableC19492511Nz, this.LLILLL, this.LLILZ, this.LLILZIL));
                }
            }

            {
                this.LLILLL = jMax;
                this.LLILZ = jMax2;
                this.LLILZIL = timeUnit;
                this.LLILLJJLI = c11ro;
            }
        };
    }

    public final InterfaceC420801kM LJIILJJIL(C09JN<? super T> c09jn, C09JN<? super Throwable> c09jn2, InterfaceC781210Ukh interfaceC781210Ukh, C09JN<? super C11LR> c09jn3) {
        C1701890uOB.LIZ(c09jn3, "onSubscribe is null");
        C11LS c11ls = new C11LS(c09jn, c09jn2, interfaceC781210Ukh, c09jn3);
        LJIILL(c11ls);
        return c11ls;
    }
}
