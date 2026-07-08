package X;

import X.AbstractC19872612pA;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: X.12p4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19872012p4<K, V> extends AbstractC19872612pA<K, V> implements Serializable {
    public static final long serialVersionUID = 2447537837011683357L;
    public transient Map<K, Collection<V>> LLILZLL;
    public transient int LLIZ;

    /* JADX INFO: renamed from: X.12p4$c */
    public class c extends AbstractC19867812oO<K, Collection<V>> {
        public final transient Map<K, Collection<V>> LLILLL;

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            Map<K, Collection<V>> map = this.LLILLL;
            AbstractC19872012p4 abstractC19872012p4 = AbstractC19872012p4.this;
            if (map == abstractC19872012p4.LLILZLL) {
                abstractC19872012p4.clear();
            } else {
                C19867212oI.LIZIZ(new C19867412oK(this));
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int hashCode() {
            return this.LLILLL.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<K> keySet() {
            return AbstractC19872012p4.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.LLILLL.size();
        }

        @Override // java.util.AbstractMap
        public final String toString() {
            return this.LLILLL.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final C19868212oS LIZ(Map.Entry entry) {
            Object key = entry.getKey();
            return new C19868212oS(key, AbstractC19872012p4.this.LJIIJ(key, (Collection) entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            return C19867612oM.LIZ(obj, this.LLILLL);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean equals(Object obj) {
            if (this != obj && !this.LLILLL.equals(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            Collection<V> collection = (Collection) C19867612oM.LIZIZ(obj, this.LLILLL);
            if (collection == null) {
                return null;
            }
            return AbstractC19872012p4.this.LJIIJ(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            Collection<V> collectionRemove = this.LLILLL.remove(obj);
            if (collectionRemove == null) {
                return null;
            }
            Collection<V> collectionLJII = AbstractC19872012p4.this.LJII();
            collectionLJII.addAll(collectionRemove);
            AbstractC19872012p4.this.LLIZ -= collectionRemove.size();
            collectionRemove.clear();
            return collectionLJII;
        }

        public c(Map<K, Collection<V>> map) {
            this.LLILLL = map;
        }
    }

    /* JADX INFO: renamed from: X.12p4$d */
    public abstract class d<T> implements Iterator<T> {
        public final Iterator<Map.Entry<K, Collection<V>>> LL;
        public K LLILLJJLI = null;
        public Collection<V> LLILLL = null;
        public Iterator<V> LLILZ = EnumC19864412nq.LL;

        public abstract T LIZ(K k, V v);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.LL.hasNext() || this.LLILZ.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.LLILZ.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.LL.next();
                this.LLILLJJLI = next.getKey();
                Collection<V> value = next.getValue();
                this.LLILLL = value;
                this.LLILZ = value.iterator();
            }
            return LIZ(this.LLILLJJLI, this.LLILZ.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.LLILZ.remove();
            Collection<V> collection = this.LLILLL;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.LL.remove();
            }
            AbstractC19872012p4 abstractC19872012p4 = AbstractC19872012p4.this;
            abstractC19872012p4.LLIZ--;
        }

        public d() {
            this.LL = AbstractC19872012p4.this.LLILZLL.entrySet().iterator();
        }
    }

    /* JADX INFO: renamed from: X.12p4$e */
    public class e extends C19867912oP<K, Collection<V>> {
        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            return this.LL.keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new C19868512oV(this, this.LL.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            C19867212oI.LIZIZ(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection<?> collection) {
            return this.LL.keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            if (this != obj && !this.LL.keySet().equals(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Collection collection = (Collection) this.LL.remove(obj);
            if (collection == null) {
                return false;
            }
            int size = collection.size();
            collection.clear();
            AbstractC19872012p4.this.LLIZ -= size;
            if (size <= 0) {
                return false;
            }
            return true;
        }

        public e(Map<K, Collection<V>> map) {
            super(map);
        }
    }

    /* JADX INFO: renamed from: X.12p4$i */
    public class i extends AbstractC19872012p4<K, V>.c implements SortedMap<K, Collection<V>> {
        public SortedSet<K> LLILZIL;

        public SortedSet<K> LIZIZ() {
            return new j(LIZLLL());
        }

        @Override // X.AbstractC19872012p4.c, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.LLILZIL;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> sortedSetLIZIZ = LIZIZ();
            this.LLILZIL = sortedSetLIZIZ;
            return sortedSetLIZIZ;
        }

        public SortedMap<K, Collection<V>> LIZLLL() {
            return (SortedMap) this.LLILLL;
        }

        @Override // java.util.SortedMap
        public final Comparator<? super K> comparator() {
            return LIZLLL().comparator();
        }

        @Override // java.util.SortedMap
        public final K firstKey() {
            return LIZLLL().firstKey();
        }

        @Override // java.util.SortedMap
        public final K lastKey() {
            return LIZLLL().lastKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k) {
            return new i(LIZLLL().headMap(k));
        }

        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new i(LIZLLL().tailMap(k));
        }

        public i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new i(LIZLLL().subMap(k, k2));
        }
    }

    /* JADX INFO: renamed from: X.12p4$j */
    public class j extends AbstractC19872012p4<K, V>.e implements SortedSet<K> {
        public SortedMap<K, Collection<V>> LIZJ() {
            return (SortedMap) this.LL;
        }

        @Override // java.util.SortedSet
        public final Comparator<? super K> comparator() {
            return LIZJ().comparator();
        }

        @Override // java.util.SortedSet
        public final K first() {
            return LIZJ().firstKey();
        }

        @Override // java.util.SortedSet
        public final K last() {
            return LIZJ().lastKey();
        }

        public SortedSet<K> headSet(K k) {
            return new j(LIZJ().headMap(k));
        }

        public SortedSet<K> tailSet(K k) {
            return new j(LIZJ().tailMap(k));
        }

        public j(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new j(LIZJ().subMap(k, k2));
        }
    }

    /* JADX INFO: renamed from: X.12p4$k */
    public class k extends AbstractCollection<V> {
        public final K LL;
        public Collection<V> LLILLJJLI;
        public final AbstractC19872012p4<K, V>.k LLILLL;
        public final Collection<V> LLILZ;

        /* JADX INFO: renamed from: X.12p4$k$a */
        public class a implements Iterator<V> {
            public final Iterator<V> LL;
            public final Collection<V> LLILLJJLI;

            public final void LIZ() {
                k.this.LJ();
                if (k.this.LLILLJJLI != this.LLILLJJLI) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public final void remove() {
                this.LL.remove();
                k kVar = k.this;
                AbstractC19872012p4 abstractC19872012p4 = AbstractC19872012p4.this;
                abstractC19872012p4.LLIZ--;
                kVar.LJFF();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                LIZ();
                return this.LL.hasNext();
            }

            @Override // java.util.Iterator
            public final V next() {
                LIZ();
                return this.LL.next();
            }

            public a() {
                Iterator<V> it2;
                Collection<V> collection = k.this.LLILLJJLI;
                this.LLILLJJLI = collection;
                if (collection instanceof List) {
                    it2 = ((List) collection).listIterator();
                } else {
                    it2 = collection.iterator();
                }
                this.LL = it2;
            }

            public a(Iterator<V> it2) {
                this.LLILLJJLI = k.this.LLILLJJLI;
                this.LL = it2;
            }
        }

        public final void LIZJ() {
            AbstractC19872012p4<K, V>.k kVar = this.LLILLL;
            if (kVar != null) {
                kVar.LIZJ();
            } else {
                AbstractC19872012p4.this.LLILZLL.put(this.LL, this.LLILLJJLI);
            }
        }

        public final void LJ() {
            Collection<V> collection;
            AbstractC19872012p4<K, V>.k kVar = this.LLILLL;
            if (kVar != null) {
                kVar.LJ();
                if (this.LLILLL.LLILLJJLI != this.LLILZ) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.LLILLJJLI.isEmpty() || (collection = AbstractC19872012p4.this.LLILZLL.get(this.LL)) == null) {
                    return;
                }
                this.LLILLJJLI = collection;
            }
        }

        public final void LJFF() {
            AbstractC19872012p4<K, V>.k kVar = this.LLILLL;
            if (kVar != null) {
                kVar.LJFF();
            } else if (this.LLILLJJLI.isEmpty()) {
                AbstractC19872012p4.this.LLILZLL.remove(this.LL);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.LLILLJJLI.clear();
            AbstractC19872012p4.this.LLIZ -= size;
            LJFF();
        }

        @Override // java.util.Collection
        public final int hashCode() {
            LJ();
            return this.LLILLJJLI.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            LJ();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            LJ();
            return this.LLILLJJLI.size();
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            LJ();
            return this.LLILLJJLI.toString();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean add(V v) {
            LJ();
            boolean zIsEmpty = this.LLILLJJLI.isEmpty();
            boolean zAdd = this.LLILLJJLI.add(v);
            if (zAdd) {
                AbstractC19872012p4.this.LLIZ++;
                if (zIsEmpty) {
                    LIZJ();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.LLILLJJLI.addAll(collection);
            if (zAddAll) {
                int size2 = this.LLILLJJLI.size();
                AbstractC19872012p4.this.LLIZ += size2 - size;
                if (size == 0) {
                    LIZJ();
                }
            }
            return zAddAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            LJ();
            return this.LLILLJJLI.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            LJ();
            return this.LLILLJJLI.containsAll(collection);
        }

        @Override // java.util.Collection
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            LJ();
            return this.LLILLJJLI.equals(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            LJ();
            boolean zRemove = this.LLILLJJLI.remove(obj);
            if (zRemove) {
                AbstractC19872012p4 abstractC19872012p4 = AbstractC19872012p4.this;
                abstractC19872012p4.LLIZ--;
                LJFF();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.LLILLJJLI.removeAll(collection);
            if (zRemoveAll) {
                int size2 = this.LLILLJJLI.size();
                AbstractC19872012p4.this.LLIZ += size2 - size;
                LJFF();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            collection.getClass();
            int size = size();
            boolean zRetainAll = this.LLILLJJLI.retainAll(collection);
            if (zRetainAll) {
                int size2 = this.LLILLJJLI.size();
                AbstractC19872012p4.this.LLIZ += size2 - size;
                LJFF();
            }
            return zRetainAll;
        }

        public k(K k, Collection<V> collection, AbstractC19872012p4<K, V>.k kVar) {
            Collection<V> collection2;
            this.LL = k;
            this.LLILLJJLI = collection;
            this.LLILLL = kVar;
            if (kVar == null) {
                collection2 = null;
            } else {
                collection2 = kVar.LLILLJJLI;
            }
            this.LLILZ = collection2;
        }
    }

    public abstract Collection<V> LJII();

    /* JADX INFO: renamed from: X.12p4$l */
    public class l extends AbstractC19872012p4<K, V>.k implements List<V> {
        @Override // java.util.List
        public final ListIterator<V> listIterator() {
            LJ();
            return new C19882812qo(this);
        }

        @Override // java.util.List
        public final V get(int i) {
            LJ();
            return (V) ListProtector.get((List) this.LLILLJJLI, i);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            LJ();
            return ((List) this.LLILLJJLI).indexOf(obj);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            LJ();
            return ((List) this.LLILLJJLI).lastIndexOf(obj);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator(int i) {
            LJ();
            return new C19882812qo(this, i);
        }

        @Override // java.util.List
        public final V remove(int i) {
            LJ();
            V v = (V) ListProtector.remove((List) this.LLILLJJLI, i);
            AbstractC19872012p4 abstractC19872012p4 = AbstractC19872012p4.this;
            abstractC19872012p4.LLIZ--;
            LJFF();
            return v;
        }

        @Override // java.util.List
        public final void add(int i, V v) {
            LJ();
            boolean zIsEmpty = this.LLILLJJLI.isEmpty();
            ListProtector.add((List) this.LLILLJJLI, i, v);
            AbstractC19872012p4.this.LLIZ++;
            if (zIsEmpty) {
                LIZJ();
            }
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = ((List) this.LLILLJJLI).addAll(i, collection);
            if (zAddAll) {
                int size2 = this.LLILLJJLI.size();
                AbstractC19872012p4.this.LLIZ += size2 - size;
                if (size == 0) {
                    LIZJ();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        public final V set(int i, V v) {
            LJ();
            return (V) ListProtector.set((List) this.LLILLJJLI, i, v);
        }

        @Override // java.util.List
        public final List<V> subList(int i, int i2) {
            LJ();
            AbstractC19872012p4 abstractC19872012p4 = AbstractC19872012p4.this;
            K k = this.LL;
            List listSubList = ((List) this.LLILLJJLI).subList(i, i2);
            AbstractC19872012p4<K, V>.k kVar = this.LLILLL;
            if (kVar == null) {
                kVar = this;
            }
            abstractC19872012p4.getClass();
            if (listSubList instanceof RandomAccess) {
                return new C19872312p7(abstractC19872012p4, k, listSubList, kVar);
            }
            return new l(k, listSubList, kVar);
        }

        public l(K k, List<V> list, AbstractC19872012p4<K, V>.k kVar) {
            super(k, list, kVar);
        }
    }

    @Override // X.AbstractC19872612pA
    public Map<K, Collection<V>> LIZ() {
        return new c(this.LLILZLL);
    }

    @Override // X.AbstractC19872612pA
    public final Collection<Map.Entry<K, V>> LIZIZ() {
        return this instanceof InterfaceC19508211Ua ? new C19872212p6(this) : new AbstractC19872612pA.a();
    }

    @Override // X.AbstractC19872612pA
    public Set<K> LIZJ() {
        return new e(this.LLILZLL);
    }

    @Override // X.AbstractC19872612pA
    public final InterfaceC19879212qE<K> LIZLLL() {
        return new AbstractC19878612q8<K>(this) { // from class: X.12pF
            public final InterfaceC19873212pG<K, V> LLILLL;

            @Override // X.AbstractC19878612q8
            public final int LIZJ() {
                return this.LLILLL.asMap().size();
            }

            @Override // X.AbstractC19878612q8
            public final Iterator<K> LJ() {
                throw new AssertionError("should never be called");
            }

            @Override // X.AbstractC19878612q8
            public final Iterator<InterfaceC19878012q2<K>> LJFF() {
                final Iterator<Map.Entry<K, Collection<V>>> it2 = this.LLILLL.asMap().entrySet().iterator();
                return new AbstractC19882412qk<Map.Entry<K, Collection<V>>, InterfaceC19878012q2<K>>(it2) { // from class: X.12pL
                    @Override // X.AbstractC19882412qk
                    public final Object LIZ(Object obj) {
                        final Map.Entry entry = (Map.Entry) obj;
                        return new AbstractC19877812q0<Object>() { // from class: X.12pV
                            @Override // X.InterfaceC19878012q2
                            public final int getCount() {
                                return ((Collection) entry.getValue()).size();
                            }

                            @Override // X.InterfaceC19878012q2
                            public final Object getElement() {
                                return entry.getKey();
                            }
                        };
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final void clear() {
                this.LLILLL.clear();
            }

            @Override // X.AbstractC19878612q8, X.InterfaceC19879212qE
            public final Set<K> elementSet() {
                return this.LLILLL.keySet();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            public final Iterator<K> iterator() {
                final Iterator<Map.Entry<K, V>> it2 = this.LLILLL.entries().iterator();
                return new AbstractC19882412qk<Map.Entry<Object, Object>, Object>(it2) { // from class: X.12pM
                    @Override // X.AbstractC19882412qk
                    public final Object LIZ(Map.Entry<Object, Object> entry) {
                        return entry.getKey();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, X.InterfaceC19879212qE
            public final int size() {
                return this.LLILLL.size();
            }

            {
                this.LLILLL = this;
            }

            @Override // X.AbstractC19878612q8, java.util.AbstractCollection, java.util.Collection, X.InterfaceC19879212qE
            public final boolean contains(Object obj) {
                return this.LLILLL.containsKey(obj);
            }

            @Override // X.InterfaceC19879212qE
            public final int count(Object obj) {
                Collection collection = (Collection) C19867612oM.LIZIZ(obj, this.LLILLL.asMap());
                if (collection == null) {
                    return 0;
                }
                return collection.size();
            }

            @Override // X.AbstractC19878612q8, X.InterfaceC19879212qE
            public final int remove(Object obj, int i2) {
                C19863912nl.LIZIZ(i2, "occurrences");
                if (i2 == 0) {
                    return count(obj);
                }
                Collection collection = (Collection) C19867612oM.LIZIZ(obj, this.LLILLL.asMap());
                if (collection == null) {
                    return 0;
                }
                int size = collection.size();
                if (i2 >= size) {
                    collection.clear();
                } else {
                    Iterator it2 = collection.iterator();
                    for (int i3 = 0; i3 < i2; i3++) {
                        it2.next();
                        it2.remove();
                    }
                }
                return size;
            }
        };
    }

    @Override // X.AbstractC19872612pA
    public final Collection<V> LJ() {
        return new AbstractCollection<V>() { // from class: X.12p9
            @Override // java.util.AbstractCollection, java.util.Collection
            public final void clear() {
                this.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            public final Iterator<V> iterator() {
                return this.LJI();
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final int size() {
                return this.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final boolean contains(Object obj) {
                return this.containsValue(obj);
            }
        };
    }

    @Override // X.AbstractC19872612pA
    public final Iterator<Map.Entry<K, V>> LJFF() {
        return new AbstractC19872012p4<K, V>.d<Map.Entry<K, V>>(this) { // from class: X.12oz
            {
                super();
            }

            @Override // X.AbstractC19872012p4.d
            public final Object LIZ(Object obj, Object obj2) {
                return new C19868212oS(obj, obj2);
            }
        };
    }

    @Override // X.AbstractC19872612pA
    public final Iterator<V> LJI() {
        return new AbstractC19872012p4<K, V>.d<V>(this) { // from class: X.12p0
            @Override // X.AbstractC19872012p4.d
            public final V LIZ(K k2, V v) {
                return v;
            }

            {
                super();
            }
        };
    }

    @Override // X.InterfaceC19873212pG
    public final void clear() {
        Iterator<Collection<V>> it2 = this.LLILZLL.values().iterator();
        while (it2.hasNext()) {
            it2.next().clear();
        }
        this.LLILZLL.clear();
        this.LLIZ = 0;
    }

    public Collection<V> LJIIIIZZ() {
        return (Collection<V>) LJIIIZ(LJII());
    }

    @Override // X.AbstractC19872612pA, X.InterfaceC19873212pG
    public final Collection<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    @Override // X.AbstractC19872612pA
    public final Collection<V> values() {
        return super.values();
    }

    @Override // X.InterfaceC19873212pG
    public final int size() {
        return this.LLIZ;
    }

    public AbstractC19872012p4(C19880612qS c19880612qS) {
        C19864312np.LJ(c19880612qS.isEmpty());
        this.LLILZLL = c19880612qS;
    }

    public <E> Collection<E> LJIIIZ(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    @Override // X.InterfaceC19873212pG
    public final boolean containsKey(Object obj) {
        return this.LLILZLL.containsKey(obj);
    }

    @Override // X.InterfaceC19873212pG
    public Collection<V> get(K k2) {
        Collection<V> collectionLJII = this.LLILZLL.get(k2);
        if (collectionLJII == null) {
            collectionLJII = LJII();
        }
        return LJIIJ(k2, collectionLJII);
    }

    @Override // X.InterfaceC19873212pG
    public Collection<V> removeAll(Object obj) {
        Collection<V> collectionRemove = this.LLILZLL.remove(obj);
        if (collectionRemove == null) {
            return LJIIIIZZ();
        }
        Collection collectionLJII = LJII();
        collectionLJII.addAll(collectionRemove);
        this.LLIZ -= collectionRemove.size();
        collectionRemove.clear();
        return (Collection<V>) LJIIIZ(collectionLJII);
    }

    public Collection<V> LJIIJ(K k2, Collection<V> collection) {
        return new k(k2, collection, null);
    }

    @Override // X.AbstractC19872612pA, X.InterfaceC19873212pG
    public boolean put(K k2, V v) {
        Collection<V> collection = this.LLILZLL.get(k2);
        if (collection == null) {
            Collection<V> collectionLJII = LJII();
            if (collectionLJII.add(v)) {
                this.LLIZ++;
                this.LLILZLL.put(k2, collectionLJII);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        }
        if (collection.add(v)) {
            this.LLIZ++;
            return true;
        }
        return false;
    }

    @Override // X.AbstractC19872612pA
    public Collection<V> replaceValues(K k2, Iterable<? extends V> iterable) {
        Iterator<? extends V> it2 = iterable.iterator();
        if (!it2.hasNext()) {
            return removeAll(k2);
        }
        Collection<V> collectionLJII = this.LLILZLL.get(k2);
        if (collectionLJII == null) {
            collectionLJII = LJII();
            this.LLILZLL.put(k2, collectionLJII);
        }
        Collection collectionLJII2 = LJII();
        collectionLJII2.addAll(collectionLJII);
        this.LLIZ -= collectionLJII.size();
        collectionLJII.clear();
        while (it2.hasNext()) {
            if (collectionLJII.add(it2.next())) {
                this.LLIZ++;
            }
        }
        return (Collection<V>) LJIIIZ(collectionLJII2);
    }
}
