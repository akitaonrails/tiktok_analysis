package X;

import X.C0S5Q;
import X.InterfaceC710780RuO;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.164P, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public interface C164P<T extends C0S5Q, E extends InterfaceC710780RuO> {
    void LIZLLL(T t, C13IQ<? extends T> c13iq, E e);

    Map<C13IQ<? extends T>, Set<C164Q<T, E>>> LJIILIIL();

    void LJIILL(Function2<? super T, ? super E, Unit> function2);

    void LJIILLIIL(C164P<T, E> c164p, C164Q<T, E> c164q);

    String getTag();

    void onEvent(E e);
}
