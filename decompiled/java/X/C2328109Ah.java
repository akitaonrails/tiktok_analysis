package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.09Ah, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2328109Ah implements InterfaceC497601wk, InterfaceC20035313aJ {
    public static final C2327909Af LLILZIL = new CoroutineContext.Element() { // from class: X.09Af
        public static final C2328009Ag LL = new InterfaceC23272099y<C2327909Af>() { // from class: X.09Ag
        };

        @Override // kotlin.coroutines.CoroutineContext.Element
        public final InterfaceC23272099y<?> getKey() {
            return LL;
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public final <E extends CoroutineContext.Element> E get(InterfaceC23272099y<E> interfaceC23272099y) {
            return (E) C09A1.LIZIZ(this, interfaceC23272099y);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public final CoroutineContext minusKey(InterfaceC23272099y<?> interfaceC23272099y) {
            return C09A1.LIZJ(this, interfaceC23272099y);
        }

        @Override // kotlin.coroutines.CoroutineContext
        public final CoroutineContext plus(CoroutineContext coroutineContext) {
            return C09A1.LIZLLL(this, coroutineContext);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public final <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) C09A1.LIZ(this, r, function2);
        }
    };
    public final CoroutineContext LL;
    public final CoroutineContext LLILLJJLI;
    public final C2328109Ah LLILLL = this;
    public volatile CoroutineContext LLILZ;

    @Override // X.InterfaceC20035313aJ
    public final void LJFF() {
    }

    public final void LIZ() {
        synchronized (this.LLILLL) {
            try {
                CoroutineContext coroutineContext = this.LLILZ;
                if (coroutineContext == null) {
                    this.LLILZ = LLILZIL;
                } else {
                    C23118094a.LIZJ(coroutineContext, new C2328609Am());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        CoroutineContext coroutineContextPlus = this.LLILZ;
        if (coroutineContextPlus == null || coroutineContextPlus == LLILZIL) {
            synchronized (this.LLILLL) {
                try {
                    coroutineContextPlus = this.LLILZ;
                    if (coroutineContextPlus == null) {
                        CoroutineContext coroutineContext = this.LL;
                        coroutineContextPlus = coroutineContext.plus(new C1DFK((C09AE) coroutineContext.get(C09AE.LJJLJ))).plus(this.LLILLJJLI);
                    } else if (coroutineContextPlus == LLILZIL) {
                        CoroutineContext coroutineContext2 = this.LL;
                        C1DFK c1dfk = new C1DFK((C09AE) coroutineContext2.get(C09AE.LJJLJ));
                        c1dfk.LIZIZ(new C2328609Am());
                        coroutineContextPlus = coroutineContext2.plus(c1dfk).plus(this.LLILLJJLI);
                    }
                    this.LLILZ = coroutineContextPlus;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return coroutineContextPlus;
    }

    @Override // X.InterfaceC20035313aJ
    public final void LIZLLL() {
        LIZ();
    }

    @Override // X.InterfaceC20035313aJ
    public final void LJ() {
        LIZ();
    }

    public C2328109Ah(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        this.LL = coroutineContext;
        this.LLILLJJLI = coroutineContext2;
    }
}
