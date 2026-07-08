package X;

import Y.AfS198S0100000_29;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11EJ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11EJ<S> implements C11EH<S> {
    public final C11PQ<S> LIZ;
    public final C11PQ<Unit> LIZIZ;
    public final C11EK<S> LIZJ;
    public final C19475711Hn LIZLLL;

    public final void LJ() {
        C11EK<S> c11ek = this.LIZJ;
        synchronized (c11ek) {
            if (c11ek.LIZIZ.isEmpty()) {
                return;
            }
            LinkedList<Function1<S, S>> linkedList = c11ek.LIZIZ;
            c11ek.LIZIZ = new LinkedList<>();
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

    @Override // X.C11EH
    public final S getState() {
        return this.LIZ.LJLZ();
    }

    @Override // X.C11EH
    public final C11NZ<S> LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.C11EH
    public final void LIZ(Function1<? super S, ? extends S> function1) {
        C11EK<S> c11ek = this.LIZJ;
        synchronized (c11ek) {
            c11ek.LIZIZ.add(function1);
        }
        this.LIZIZ.onNext(Unit.LIZ);
    }

    @Override // X.C11EH
    public final void LIZJ(Function1<? super S, ? extends S> function1) {
        this.LIZ.onNext(function1.invoke(getState()));
    }

    @Override // X.C11EH
    public final void LIZLLL(Function1<? super S, Unit> function1) {
        C11EK<S> c11ek = this.LIZJ;
        synchronized (c11ek) {
            c11ek.LIZ.add(function1);
        }
        this.LIZIZ.onNext(Unit.LIZ);
    }

    public C11EJ(S s, C11RO c11ro) {
        C11PQ<S> c11pqLJLLLLLL = C11PQ.LJLLLLLL(s);
        this.LIZ = c11pqLJLLLLLL;
        C11NJ c11nj = new C11NJ();
        C11PQ<Unit> c11pq = new C11PQ<>();
        this.LIZIZ = c11pq;
        this.LIZJ = new C11EK<>();
        this.LIZLLL = new C19475711Hn(c11pqLJLLLLLL);
        c11nj.LIZ(c11pq.LJJJLZIJ(c11ro).LJJLL(new AfS198S0100000_29(new AwS608S0100000_29(this, 682), 52), new AfS198S0100000_29(new C11EL(this), 53)));
    }
}
