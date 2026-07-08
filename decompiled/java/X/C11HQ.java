package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11HQ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11HQ<T> extends C11NZ<T> {
    public final C098D<T> LL;
    public final InterfaceC1255900imq<? super T> LLILLJJLI;
    public final InterfaceC1790830whd LLILLL;

    @Override // X.C11NZ
    public final void LJJZZIII(final InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
        if (interfaceC626120Oh8 == null) {
            return;
        }
        C098D<T> c098d = this.LL;
        final InterfaceC1255900imq<? super T> interfaceC1255900imq = this.LLILLJJLI;
        final InterfaceC1790830whd interfaceC1790830whd = this.LLILLL;
        c098d.LIZIZ(new C11QA<T, T>(interfaceC626120Oh8, interfaceC1255900imq, interfaceC1790830whd) { // from class: X.11QE
            public final InterfaceC1255900imq<? super T> LLILZLL;
            public final InterfaceC1790830whd LLIZ;
            public C11QF LLIZLLLIL;

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
                        if (!this.LLILZLL.test(t)) {
                            InterfaceC1790830whd interfaceC1790830whd2 = this.LLIZ;
                            if (interfaceC1790830whd2 != 0) {
                                C11QF c11qf = this.LLIZLLLIL;
                                if (c11qf != null) {
                                    interfaceC1790830whd2.Sd(c11qf);
                                }
                                C11QF c11qf2 = new C11QF(this, t);
                                interfaceC1790830whd2.h5(c11qf2);
                                this.LLIZLLLIL = c11qf2;
                                return;
                            }
                            return;
                        }
                        this.LL.onNext((Object) t);
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
                this.LLILZLL = interfaceC1255900imq;
                this.LLIZ = interfaceC1790830whd;
            }
        });
    }

    public C11HQ(C11NZ c11nz, C1211890hdr c1211890hdr, InterfaceC1790830whd interfaceC1790830whd) {
        this.LL = c11nz;
        this.LLILLJJLI = c1211890hdr;
        this.LLILLL = interfaceC1790830whd;
    }
}
