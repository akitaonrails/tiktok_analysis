package X;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.12pG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public interface InterfaceC19873212pG<K, V> {
    Map<K, Collection<V>> asMap();

    void clear();

    boolean containsEntry(Object obj, Object obj2);

    boolean containsKey(Object obj);

    Collection<Map.Entry<K, V>> entries();

    Collection<V> get(K k);

    boolean isEmpty();

    Set<K> keySet();

    boolean put(K k, V v);

    boolean remove(Object obj, Object obj2);

    Collection<V> removeAll(Object obj);

    int size();
}
