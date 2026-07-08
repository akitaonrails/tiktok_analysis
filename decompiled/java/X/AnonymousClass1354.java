package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.ReferenceQueue;

/* JADX INFO: renamed from: X.1354, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class AnonymousClass1354<K, V> implements C135A<K, V> {
    public volatile C135A<K, V> LL;
    public final C199494133s<V> LLILLJJLI;
    public final C138P LLILLL;

    @Override // X.C135A
    public final InterfaceC199564136k<K, V> LIZIZ() {
        return null;
    }

    @Override // X.C135A
    public final C135A<K, V> LJ(ReferenceQueue<V> referenceQueue, V v, InterfaceC199564136k<K, V> interfaceC199564136k) {
        return this;
    }

    @Override // X.C135A
    public final boolean isLoading() {
        return true;
    }

    public AnonymousClass1354() {
        this(ConcurrentMapC199594137o.LLJJJJJIL);
    }

    @Override // X.C135A
    public final int LIZ() {
        return this.LL.LIZ();
    }

    @Override // X.C135A
    public final V LIZLLL() {
        return (V) C23184096o.LIZ(this.LLILLJJLI);
    }

    @Override // X.C135A
    public final V get() {
        return this.LL.get();
    }

    @Override // X.C135A
    public final boolean isActive() {
        return this.LL.isActive();
    }

    public AnonymousClass1354(C135A<K, V> c135a) {
        this.LLILLJJLI = new C199494133s<>();
        this.LLILLL = new C138P();
        this.LL = c135a;
    }

    @Override // X.C135A
    public final void LIZJ(V v) {
        if (v != null) {
            this.LLILLJJLI.LJIIZILJ(v);
        } else {
            this.LL = ConcurrentMapC199594137o.LLJJJJJIL;
        }
    }

    public final ListenableFuture<V> LJFF(K k, C135O<? super K, V> c135o) {
        ListenableFuture<V> c822710WPd;
        C199484133i c199484133i;
        try {
            this.LLILLL.LIZLLL();
            if (this.LL.get() == null) {
                Object objCall = ((C135N) c135o).LIZ.call();
                if (this.LLILLJJLI.LJIIZILJ((V) objCall)) {
                    return this.LLILLJJLI;
                }
                if (objCall == null) {
                    return C199484133i.LLILLJJLI;
                }
                return new C199484133i(objCall);
            }
            c135o.getClass();
            k.getClass();
            Object objCall2 = ((C135N) c135o).LIZ.call();
            if (objCall2 == null) {
                c199484133i = C199484133i.LLILLJJLI;
            } else {
                c199484133i = new C199484133i(objCall2);
            }
            InterfaceC19882712qn<V, V> interfaceC19882712qn = new InterfaceC19882712qn<V, V>() { // from class: X.1355
                @Override // X.InterfaceC19882712qn
                public final V apply(V v) {
                    this.LL.LLILLJJLI.LJIIZILJ(v);
                    return v;
                }
            };
            int i = AnonymousClass1349.LLIZLLLIL;
            C134C c134c = new C134C(c199484133i, interfaceC19882712qn);
            c199484133i.LJIIJJI(c134c, EnumC2272608vM.LL);
            return c134c;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (this.LLILLJJLI.LJIJ(th)) {
                c822710WPd = this.LLILLJJLI;
            } else {
                c822710WPd = new C822710WPd<>(th);
            }
            if (th instanceof InterruptedException) {
                C786410Ut5.u3().interrupt();
            }
            return c822710WPd;
        }
    }
}
