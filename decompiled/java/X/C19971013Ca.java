package X;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.13Ca, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19971013Ca<K, V> extends C13CZ<Map.Entry<K, V>, K, V> {
    public final C19971113Cb<K, V> LL;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.LL.clear();
    }

    @Override // X.C13CT
    public final int getSize() {
        return this.LL.LIZJ();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new C13F2(this.LL);
    }

    public C19971013Ca(C19971113Cb<K, V> c19971113Cb) {
        this.LL = c19971113Cb;
    }

    @Override // X.C13CT, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }
}
