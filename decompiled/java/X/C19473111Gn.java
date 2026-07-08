package X;

import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11Gn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19473111Gn<S> implements InterfaceC19473611Gs<S> {
    public final C11PQ<S> LIZ;
    public final C11PQ<Unit> LIZIZ;
    public final C19473311Gp<S> LIZJ;
    public final C19475711Hn LIZLLL;

    public final void LJ() {
        C19473311Gp<S> c19473311Gp = this.LIZJ;
        synchronized (c19473311Gp) {
            if (c19473311Gp.LIZIZ.isEmpty()) {
                return;
            }
            LinkedList<Function1<S, S>> linkedList = c19473311Gp.LIZIZ;
            c19473311Gp.LIZIZ = new LinkedList<>();
            if (linkedList != null) {
                S state = getState();
                Iterator<Function1<S, S>> it2 = linkedList.iterator();
                while (it2.hasNext()) {
                    state = it2.next().invoke(state);
                }
                this.LIZ.onNext(state);
            }
        }
    }

    @Override // X.InterfaceC19473611Gs
    public final S getState() {
        return this.LIZ.LJLZ();
    }

    @Override // X.InterfaceC19473611Gs
    public final C19475711Hn LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC19473611Gs
    public final void LIZ(Function1<? super S, ? extends S> function1) {
        C19473311Gp<S> c19473311Gp = this.LIZJ;
        synchronized (c19473311Gp) {
            c19473311Gp.LIZIZ.add(function1);
        }
        this.LIZIZ.onNext(Unit.LIZ);
    }

    @Override // X.InterfaceC19473611Gs
    public final void LIZJ(Function1<? super S, ? extends S> function1) {
        this.LIZ.onNext(function1.invoke(getState()));
    }

    @Override // X.InterfaceC19473611Gs
    public final void LIZLLL(Function1<? super S, Unit> function1) {
        C19473311Gp<S> c19473311Gp = this.LIZJ;
        synchronized (c19473311Gp) {
            c19473311Gp.LIZ.add(function1);
        }
        this.LIZIZ.onNext(Unit.LIZ);
    }

    public C19473111Gn(InterfaceC0148002o interfaceC0148002o, C19501611Rm c19501611Rm) {
        C11PQ<S> c11pqLJLLLLLL = C11PQ.LJLLLLLL(interfaceC0148002o);
        this.LIZ = c11pqLJLLLLLL;
        C11NJ c11nj = new C11NJ();
        C11PQ<Unit> c11pq = new C11PQ<>();
        this.LIZIZ = c11pq;
        this.LIZJ = new C19473311Gp<>();
        this.LIZLLL = new C19475711Hn(c11pqLJLLLLLL);
        c11nj.LIZ(c11pq.LJJJLZIJ(c19501611Rm).LJJLL(new C09JN(this) { // from class: X.11Go
            public final /* synthetic */ C19473111Gn<Object> LL;

            {
                this.LL = this;
            }

            @Override // X.C09JN
            public final void accept(Object obj) {
                Function1<Object, Unit> function1RemoveFirst;
                C1C7U.LIZ("RxStore@42d6.<init>$1");
                C19473111Gn<Object> c19473111Gn = this.LL;
                while (true) {
                    C19473311Gp<Object> c19473311Gp = c19473111Gn.LIZJ;
                    synchronized (c19473311Gp) {
                        if (!c19473311Gp.LIZ.isEmpty()) {
                            function1RemoveFirst = c19473311Gp.LIZ.removeFirst();
                        } else {
                            function1RemoveFirst = null;
                        }
                    }
                    c19473111Gn.LJ();
                    if (function1RemoveFirst == null) {
                        C1C7U.LIZIZ("RxStore@42d6.<init>$1");
                        return;
                    }
                    function1RemoveFirst.invoke(c19473111Gn.getState());
                }
            }
        }, new C09JN(this) { // from class: X.11Gq
            public final /* synthetic */ C19473111Gn<Object> LL;

            {
                this.LL = this;
            }

            @Override // X.C09JN
            public final void accept(Object obj) throws Throwable {
                C1C7U.LIZ("RxStore@42d6.<init>$2");
                Throwable cause = (Throwable) obj;
                this.LL.getClass();
                while (true) {
                    if (cause == null) {
                        break;
                    }
                    if (cause.getCause() != null) {
                        cause = cause.getCause();
                    } else if (cause != null) {
                        throw cause;
                    }
                }
                C1C7U.LIZIZ("RxStore@42d6.<init>$2");
            }
        }));
    }
}
