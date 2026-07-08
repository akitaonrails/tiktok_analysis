package X;

import X.AbstractC1677260tkS;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tl1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677610tl1<T, V extends AbstractC1677260tkS> implements InterfaceC1677290tkV<T, V> {
    public final Function1<T, V> LIZ;
    public final Function1<V, T> LIZIZ;

    @Override // X.InterfaceC1677290tkV
    public final Function1<T, V> LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1677290tkV
    public final Function1<V, T> LIZIZ() {
        return this.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1677610tl1(Function1<? super T, ? extends V> function1, Function1<? super V, ? extends T> function12) {
        this.LIZ = function1;
        this.LIZIZ = function12;
    }
}
