package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.12oS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19868212oS<K, V> extends AbstractC19868112oR<K, V> implements Serializable {
    public static final long serialVersionUID = 0;
    public final K LL;
    public final V LLILLJJLI;

    @Override // X.AbstractC19868112oR, java.util.Map.Entry
    public final K getKey() {
        return this.LL;
    }

    @Override // X.AbstractC19868112oR, java.util.Map.Entry
    public final V getValue() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC19868112oR, java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    public C19868212oS(K k, V v) {
        this.LL = k;
        this.LLILLJJLI = v;
    }
}
