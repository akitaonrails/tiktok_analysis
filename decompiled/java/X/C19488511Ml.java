package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11Ml, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19488511Ml<T, K> extends C11J7<T, T> {
    public final InterfaceC1487280oo2<? super T, K> LLILLJJLI;
    public final InterfaceC1627390sS1<? super K, ? super K> LLILLL;

    @Override // X.C11NZ
    public final void LJJZZIII(final InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
        C098D<T> c098d = this.LL;
        final InterfaceC1487280oo2<? super T, K> interfaceC1487280oo2 = this.LLILLJJLI;
        final InterfaceC1627390sS1<? super K, ? super K> interfaceC1627390sS1 = this.LLILLL;
        c098d.LIZIZ(new C11QA<T, T>(interfaceC626120Oh8, interfaceC1487280oo2, interfaceC1627390sS1) { // from class: X.11QB
            public final InterfaceC1487280oo2<? super T, K> LLILZLL;
            public final InterfaceC1627390sS1<? super K, ? super K> LLIZ;
            public K LLIZLLLIL;
            public boolean LLJ;

            @Override // X.InterfaceC19494911Ox
            public final T poll() {
                while (true) {
                    T tPoll = this.LLILLL.poll();
                    if (tPoll == null) {
                        return null;
                    }
                    K kApply = this.LLILZLL.apply(tPoll);
                    if (!this.LLJ) {
                        this.LLJ = true;
                        this.LLIZLLLIL = kApply;
                        return tPoll;
                    }
                    if (!this.LLIZ.test(this.LLIZLLLIL, kApply)) {
                        this.LLIZLLLIL = kApply;
                        return tPoll;
                    }
                    this.LLIZLLLIL = kApply;
                }
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.InterfaceC626120Oh8
            public final void onNext(T t) {
                if (this.LLILZ) {
                    return;
                }
                if (this.LLILZIL != 0) {
                    this.LL.onNext((Object) t);
                    return;
                }
                try {
                    K kApply = this.LLILZLL.apply(t);
                    if (this.LLJ) {
                        boolean zTest = this.LLIZ.test(this.LLIZLLLIL, kApply);
                        this.LLIZLLLIL = kApply;
                        if (zTest) {
                            return;
                        }
                    } else {
                        this.LLJ = true;
                        this.LLIZLLLIL = kApply;
                    }
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
                this.LLILZLL = interfaceC1487280oo2;
                this.LLIZ = interfaceC1627390sS1;
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19488511Ml(C098D c098d, InterfaceC1627390sS1 interfaceC1627390sS1) {
        super(c098d);
        C1076630e7h c1076630e7h = C19487811Me.LIZ;
        this.LLILLJJLI = c1076630e7h;
        this.LLILLL = interfaceC1627390sS1;
    }
}
