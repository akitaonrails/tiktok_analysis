package X;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.13Ef, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19976713Ef<K, V> extends AbstractC19976613Ee<K, V> implements Iterator<Map.Entry<K, V>>, C03W4 {
    @Override // java.util.Iterator
    public final Object next() {
        LIZ();
        if (this.LLILZ != null) {
            return new C19976513Ed(this);
        }
        throw new IllegalStateException();
    }

    public C19976713Ef(C13EY<K, V> c13ey, Iterator<? extends Map.Entry<? extends K, ? extends V>> it2) {
        super(c13ey, it2);
    }
}
