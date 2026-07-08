package X;

import X.C0S5Q;
import X.InterfaceC710780RuO;
import Y.ARunnableS100S0200000_31;
import android.os.Handler;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.164O, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public abstract class C164O<T extends C0S5Q, E extends InterfaceC710780RuO> implements C164P<T, E> {
    public static final AbstractC2252651DEx LIZJ = C1699690uKd.LIZ();
    public final Map<C13IQ<? extends T>, Set<C164Q<T, E>>> LIZ = new LinkedHashMap();
    public Function2<? super T, ? super E, Unit> LIZIZ;

    public abstract InterfaceC332260D0u<T> LJIIZILJ();

    @Override // X.C164P
    public final Map<C13IQ<? extends T>, Set<C164Q<T, E>>> LJIILIIL() {
        return this.LIZ;
    }

    @Override // X.C164P
    public final void LJIILL(Function2<? super T, ? super E, Unit> function2) {
        this.LIZIZ = function2;
    }

    @Override // X.C164P
    public void onEvent(E e) {
        C786410Ut5.LJJZZIII((Handler) C1699690uKd.LIZIZ.getValue(), new ARunnableS100S0200000_31(this, e, 36));
    }

    @Override // X.C164P
    public final void LJIILLIIL(C164P<T, E> c164p, C164Q<T, E> c164q) {
        Set<C164Q<T, E>> linkedHashSet = c164p.LJIILIIL().get(c164q.LIZ);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
        }
        if (!linkedHashSet.contains(c164q)) {
            linkedHashSet.add(c164q);
            c164p.LJIILIIL().put(c164q.LIZ, linkedHashSet);
        }
    }
}
