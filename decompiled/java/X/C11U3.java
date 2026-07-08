package X;

import java.util.Map;

/* JADX INFO: renamed from: X.11U3, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11U3<K, V> implements Map.Entry<K, V>, C03W4 {
    public final K LL;
    public final V LLILLJJLI;

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.LL;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.LLILLJJLI;
    }

    public C11U3(K k, V v) {
        this.LL = k;
        this.LLILLJJLI = v;
    }
}
