package X;

import java.util.Set;

/* JADX INFO: renamed from: X.0u0w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1687480u0w<K, V, E> implements Set<E>, InterfaceC835440Wpy {
    public final C13EY<K, V> LL;

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return C1975307oV.LIZ(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C1975307oV.LIZIZ(this, tArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.LL.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.LL.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.LL.size();
    }

    public AbstractC1687480u0w(C13EY<K, V> c13ey) {
        this.LL = c13ey;
    }
}
