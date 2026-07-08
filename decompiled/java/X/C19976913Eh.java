package X;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.13Eh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19976913Eh<K, V> extends AbstractC19976613Ee<K, V> implements Iterator<V>, C03W4 {
    @Override // java.util.Iterator
    public final V next() {
        Map.Entry<? extends K, ? extends V> entry = this.LLILZIL;
        if (entry == null) {
            throw new IllegalStateException();
        }
        LIZ();
        return entry.getValue();
    }

    public C19976913Eh(C13EY<K, V> c13ey, Iterator<? extends Map.Entry<? extends K, ? extends V>> it2) {
        super(c13ey, it2);
    }
}
