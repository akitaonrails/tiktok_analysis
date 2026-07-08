package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.08JA, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08JA<K, V> extends ConcurrentHashMap<K, V> {
    public static final Object NULL = new Object();

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        final Set<Map.Entry<K, V>> setEntrySet = super.entrySet();
        return new Set<Map.Entry<K, V>>() { // from class: X.08JK
            @Override // java.util.Set, java.util.Collection
            public final void clear() {
                setEntrySet.clear();
            }

            @Override // java.util.Set, java.util.Collection
            public final boolean isEmpty() {
                return setEntrySet.isEmpty();
            }

            @Override // java.util.Set, java.util.Collection, java.lang.Iterable
            public final Iterator<Map.Entry<K, V>> iterator() {
                final Iterator it2 = setEntrySet.iterator();
                return new Iterator<Map.Entry<K, V>>() { // from class: X.08JJ
                    @Override // java.util.Iterator
                    public final boolean hasNext() {
                        return it2.hasNext();
                    }

                    @Override // java.util.Iterator
                    public final Object next() {
                        final Map.Entry entry = (Map.Entry) it2.next();
                        return new Map.Entry<Object, Object>() { // from class: X.08JI
                            @Override // java.util.Map.Entry
                            public final Object getKey() {
                                Object key = entry.getKey();
                                if (key == C08JA.NULL) {
                                    return null;
                                }
                                return key;
                            }

                            @Override // java.util.Map.Entry
                            public final Object getValue() {
                                Object value = entry.getValue();
                                if (value == C08JA.NULL) {
                                    return null;
                                }
                                return value;
                            }

                            @Override // java.util.Map.Entry
                            public final Object setValue(Object obj) {
                                Map.Entry entry2 = entry;
                                if (obj == null) {
                                    obj = C08JA.NULL;
                                }
                                return entry2.setValue(obj);
                            }
                        };
                    }
                };
            }

            @Override // java.util.Set, java.util.Collection
            public final int size() {
                return setEntrySet.size();
            }

            @Override // java.util.Set, java.util.Collection
            public final Object[] toArray() {
                Object[] array = setEntrySet.toArray();
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == C08JA.NULL) {
                        array[i] = null;
                    }
                }
                return array;
            }

            @Override // java.util.Set, java.util.Collection
            public final boolean add(Object obj) {
                return setEntrySet.add(obj);
            }

            @Override // java.util.Set, java.util.Collection
            public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
                return setEntrySet.addAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public final boolean contains(Object obj) {
                Set set = setEntrySet;
                if (obj == null) {
                    obj = C08JA.NULL;
                }
                return set.contains(obj);
            }

            @Override // java.util.Set, java.util.Collection
            public final boolean containsAll(Collection<?> collection) {
                return setEntrySet.containsAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public final boolean remove(Object obj) {
                return setEntrySet.remove(obj);
            }

            @Override // java.util.Set, java.util.Collection
            public final boolean removeAll(Collection<?> collection) {
                return setEntrySet.retainAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public final boolean retainAll(Collection<?> collection) {
                return setEntrySet.retainAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public final <T> T[] toArray(T[] tArr) {
                return (T[]) setEntrySet.toArray(tArr);
            }
        };
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            obj = NULL;
        }
        V v = (V) super.get(obj);
        if (v == NULL) {
            return null;
        }
        return v;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        if (map == null) {
            return;
        }
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k == null) {
            k = (K) NULL;
        }
        if (v == null) {
            v = (V) NULL;
        }
        V v2 = (V) super.put(k, v);
        if (v2 == NULL) {
            return null;
        }
        return v2;
    }
}
