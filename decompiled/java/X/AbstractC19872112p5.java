package X;

import X.AbstractC19872012p4;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: renamed from: X.12p5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19872112p5<K, V> extends AbstractC19872012p4<K, V> implements C11UZ<K, V> {
    public static final long serialVersionUID = 6588350623831699109L;

    @Override // X.AbstractC19872012p4
    /* JADX INFO: renamed from: LJIIJJI, reason: merged with bridge method [inline-methods] */
    public abstract List<V> LJII();

    @Override // X.AbstractC19872012p4
    public final Collection LJIIIIZZ() {
        return Collections.emptyList();
    }

    @Override // X.AbstractC19872612pA, X.InterfaceC19873212pG
    public final Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    public AbstractC19872112p5(C19880612qS c19880612qS) {
        super(c19880612qS);
    }

    @Override // X.AbstractC19872012p4
    public final <E> Collection<E> LJIIIZ(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // X.AbstractC19872612pA
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // X.AbstractC19872012p4, X.InterfaceC19873212pG
    public final List<V> get(K k) {
        return (List) super.get((Object) k);
    }

    @Override // X.AbstractC19872012p4, X.InterfaceC19873212pG
    public final Collection removeAll(Object obj) {
        return super.removeAll(obj);
    }

    @Override // X.AbstractC19872012p4
    public final Collection<V> LJIIJ(K k, Collection<V> collection) {
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            return new C19872312p7(this, k, list, null);
        }
        return new AbstractC19872012p4.l(k, list, null);
    }

    @Override // X.AbstractC19872012p4, X.AbstractC19872612pA, X.InterfaceC19873212pG
    public final boolean put(K k, V v) {
        return super.put(k, v);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC19872012p4, X.AbstractC19872612pA
    public final Collection replaceValues(Object obj, Iterable iterable) {
        return super.replaceValues(obj, iterable);
    }
}
