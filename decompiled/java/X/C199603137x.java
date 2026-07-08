package X;

import java.util.AbstractMap;

/* JADX INFO: renamed from: X.137x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199603137x<K, V> extends AbstractMap.SimpleImmutableEntry<K, V> {
    public static final long serialVersionUID = 0;
    public final EnumC199605137z LL;

    public boolean wasEvicted() {
        return this.LL.LIZJ();
    }

    public EnumC199605137z getCause() {
        return this.LL;
    }

    public C199603137x(K k, V v, EnumC199605137z enumC199605137z) {
        super(k, v);
        enumC199605137z.getClass();
        this.LL = enumC199605137z;
    }

    public static <K, V> C199603137x<K, V> create(K k, V v, EnumC199605137z enumC199605137z) {
        return new C199603137x<>(k, v, enumC199605137z);
    }
}
