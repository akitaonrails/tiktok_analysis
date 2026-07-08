package X;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.13Eg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19976813Eg<K, V> extends AbstractC19976613Ee<K, V> implements Iterator<K>, C03W4 {
    @Override // java.util.Iterator
    public final K next() {
        Map.Entry<? extends K, ? extends V> entry = this.LLILZIL;
        if (entry == null) {
            throw new IllegalStateException();
        }
        LIZ();
        return entry.getKey();
    }

    public C19976813Eg(C13EY<K, V> c13ey, Iterator<? extends Map.Entry<? extends K, ? extends V>> it2) {
        super(c13ey, it2);
    }
}
