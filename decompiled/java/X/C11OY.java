package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11OY, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11OY<T> extends C11M6<T, T> {
    public final InterfaceC19483011Ki<? super T> LLILLL;

    @Override // X.C11NN
    public final void LJIILLIIL(C11M9<? super T> c11m9) {
        if (c11m9 instanceof C11OM) {
            C11NN<T> c11nn = this.LLILLJJLI;
            final C11OM c11om = (C11OM) c11m9;
            final InterfaceC19483011Ki<? super T> interfaceC19483011Ki = this.LLILLL;
            c11nn.LJIILL(new C11Q2<T, T>(c11om, interfaceC19483011Ki) { // from class: X.11Q7
                public final InterfaceC19483011Ki<? super T> LLILZLL;

                @Override // X.InterfaceC19494911Ox
                public final T poll() {
                    InterfaceC19495511Pd<T> interfaceC19495511Pd = this.LLILLL;
                    InterfaceC19483011Ki<? super T> interfaceC19483011Ki2 = this.LLILZLL;
                    while (true) {
                        T tPoll = interfaceC19495511Pd.poll();
                        if (tPoll == null) {
                            return null;
                        }
                        if (interfaceC19483011Ki2.test(tPoll)) {
                            return tPoll;
                        }
                        if (this.LLILZIL == 2) {
                            interfaceC19495511Pd.request(1L);
                        }
                    }
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // X.C11OM
                public final boolean LIZJ(T t) throws Throwable {
                    if (this.LLILZ) {
                        return false;
                    }
                    if (this.LLILZIL != 0) {
                        return this.LL.LIZJ(null);
                    }
                    try {
                        if (!this.LLILZLL.test(t) || !this.LL.LIZJ((Object) t)) {
                            return false;
                        }
                        return true;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        LIZ(th);
                        return true;
                    }
                }

                @Override // X.C11M9
                public final void onNext(T t) {
                    if (!LIZJ(t)) {
                        this.LLILLJJLI.request(1L);
                    }
                }

                @Override // X.InterfaceC19495111Oz
                public final int requestFusion(int i) {
                    return LIZIZ(i);
                }

                {
                    this.LLILZLL = interfaceC19483011Ki;
                }
            });
            return;
        }
        this.LLILLJJLI.LJIILL(new C11Q4(c11m9, this.LLILLL));
    }

    public C11OY(C11NN<T> c11nn, InterfaceC19483011Ki<? super T> interfaceC19483011Ki) {
        super(c11nn);
        this.LLILLL = interfaceC19483011Ki;
    }
}
