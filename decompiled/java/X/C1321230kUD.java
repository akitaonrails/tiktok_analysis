package X;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.0kUD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1321230kUD<T> implements InterfaceC1320070kSL<InterfaceC1320200kSY<T>> {
    public final Set<C1321220kUC> LIZ = Collections.newSetFromMap(new WeakHashMap());
    public InterfaceC1320070kSL<InterfaceC1320200kSY<T>> LIZIZ = null;

    @Override // X.InterfaceC1320070kSL
    public final Object get() {
        C1321220kUC c1321220kUC = new C1321220kUC();
        c1321220kUC.LJIILLIIL(this.LIZIZ);
        this.LIZ.add(c1321220kUC);
        return c1321220kUC;
    }
}
