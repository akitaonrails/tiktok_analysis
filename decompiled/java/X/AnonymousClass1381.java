package X;

import java.util.AbstractMap;

/* JADX INFO: renamed from: X.1381, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1381<K, V> extends AbstractMap.SimpleImmutableEntry<K, V> {
    public static final long serialVersionUID = 0;
    public final AnonymousClass1391 LL;

    public boolean wasEvicted() {
        return this.LL.LIZJ();
    }

    public AnonymousClass1391 getCause() {
        return this.LL;
    }

    public AnonymousClass1381(K k, V v, AnonymousClass1391 anonymousClass1391) {
        super(k, v);
        anonymousClass1391.getClass();
        this.LL = anonymousClass1391;
    }

    public static <K, V> AnonymousClass1381<K, V> create(K k, V v, AnonymousClass1391 anonymousClass1391) {
        return new AnonymousClass1381<>(k, v, anonymousClass1391);
    }
}
