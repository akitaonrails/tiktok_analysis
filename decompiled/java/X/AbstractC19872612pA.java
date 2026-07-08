package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.12pA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19872612pA<K, V> implements InterfaceC19873212pG<K, V> {
    public transient Collection<Map.Entry<K, V>> LL;
    public transient Set<K> LLILLJJLI;
    public transient InterfaceC19879212qE<K> LLILLL;
    public transient Collection<V> LLILZ;
    public transient Map<K, Collection<V>> LLILZIL;

    /* JADX INFO: renamed from: X.12pA$a */
    public class a extends AbstractC19873612pK<K, V> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            return AbstractC19872612pA.this.LJFF();
        }

        public a() {
        }
    }

    public abstract Map<K, Collection<V>> LIZ();

    public abstract Collection<Map.Entry<K, V>> LIZIZ();

    public abstract Set<K> LIZJ();

    public abstract InterfaceC19879212qE<K> LIZLLL();

    public abstract Collection<V> LJ();

    public abstract Iterator<Map.Entry<K, V>> LJFF();

    @Override // X.InterfaceC19873212pG
    public Map<K, Collection<V>> asMap() {
        Map<K, Collection<V>> map = this.LLILZIL;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapLIZ = LIZ();
        this.LLILZIL = mapLIZ;
        return mapLIZ;
    }

    @Override // X.InterfaceC19873212pG
    public Collection<Map.Entry<K, V>> entries() {
        Collection<Map.Entry<K, V>> collection = this.LL;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> collectionLIZIZ = LIZIZ();
        this.LL = collectionLIZIZ;
        return collectionLIZIZ;
    }

    @Override // X.InterfaceC19873212pG
    public Set<K> keySet() {
        Set<K> set = this.LLILLJJLI;
        if (set != null) {
            return set;
        }
        Set<K> setLIZJ = LIZJ();
        this.LLILLJJLI = setLIZJ;
        return setLIZJ;
    }

    public InterfaceC19879212qE<K> keys() {
        InterfaceC19879212qE<K> interfaceC19879212qE = this.LLILLL;
        if (interfaceC19879212qE != null) {
            return interfaceC19879212qE;
        }
        InterfaceC19879212qE<K> interfaceC19879212qELIZLLL = LIZLLL();
        this.LLILLL = interfaceC19879212qELIZLLL;
        return interfaceC19879212qELIZLLL;
    }

    public Collection<V> values() {
        Collection<V> collection = this.LLILZ;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionLJ = LJ();
        this.LLILZ = collectionLJ;
        return collectionLJ;
    }

    public Iterator<V> LJI() {
        return new C19873912pN(entries().iterator());
    }

    public int hashCode() {
        return asMap().hashCode();
    }

    @Override // X.InterfaceC19873212pG
    public boolean isEmpty() {
        return size() == 0;
    }

    public String toString() {
        return asMap().toString();
    }

    public boolean containsValue(Object obj) {
        Iterator<Collection<V>> it2 = asMap().values().iterator();
        while (it2.hasNext()) {
            if (it2.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC19873212pG) {
            return asMap().equals(((InterfaceC19873212pG) obj).asMap());
        }
        return false;
    }

    public boolean putAll(InterfaceC19873212pG<? extends K, ? extends V> interfaceC19873212pG) {
        boolean zPut = false;
        for (Map.Entry<? extends K, ? extends V> entry : interfaceC19873212pG.entries()) {
            zPut |= put(entry.getKey(), entry.getValue());
        }
        return zPut;
    }

    @Override // X.InterfaceC19873212pG
    public boolean containsEntry(Object obj, Object obj2) {
        Collection<V> collection = asMap().get(obj);
        if (collection != null && collection.contains(obj2)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC19873212pG
    public boolean put(K k, V v) {
        return get(k).add(v);
    }

    public boolean putAll(K k, Iterable<? extends V> iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection<? extends V> collection = (Collection) iterable;
            if (!collection.isEmpty() && get(k).addAll(collection)) {
                return true;
            }
            return false;
        }
        Iterator<? extends V> it2 = iterable.iterator();
        if (it2.hasNext() && C19867212oI.LIZ(get(k), it2)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC19873212pG
    public boolean remove(Object obj, Object obj2) {
        Collection<V> collection = asMap().get(obj);
        if (collection != null && collection.remove(obj2)) {
            return true;
        }
        return false;
    }

    public Collection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        iterable.getClass();
        Collection<V> collectionRemoveAll = removeAll(k);
        putAll(k, iterable);
        return collectionRemoveAll;
    }
}
