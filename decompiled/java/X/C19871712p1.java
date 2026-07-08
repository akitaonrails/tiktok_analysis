package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: X.12p1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19871712p1<K, V> extends AbstractC19872012p4<K, V>.i implements NavigableMap<K, Collection<V>> {
    public final /* synthetic */ AbstractC19872012p4 LLIZ;

    @Override // X.AbstractC19872012p4.i
    public final SortedSet LIZIZ() {
        return new C19871812p2(this.LLIZ, LIZLLL());
    }

    @Override // X.AbstractC19872012p4.i
    /* JADX INFO: renamed from: LJFF, reason: merged with bridge method [inline-methods] */
    public final NavigableMap<K, Collection<V>> LIZLLL() {
        return (NavigableMap) ((SortedMap) this.LLILLL);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap<K, Collection<V>> descendingMap() {
        return new C19871712p1(this.LLIZ, LIZLLL().descendingMap());
    }

    @Override // X.AbstractC19872012p4.i
    /* JADX INFO: renamed from: LIZJ */
    public final SortedSet keySet() {
        return super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableSet<K> descendingKeySet() {
        return ((C19871712p1) descendingMap()).navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, Collection<V>> firstEntry() {
        Map.Entry<K, Collection<V>> entryFirstEntry = LIZLLL().firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return LIZ(entryFirstEntry);
    }

    @Override // X.AbstractC19872012p4.i, X.AbstractC19872012p4.c, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public final Set keySet() {
        return super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, Collection<V>> lastEntry() {
        Map.Entry<K, Collection<V>> entryLastEntry = LIZLLL().lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return LIZ(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet<K> navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, Collection<V>> pollFirstEntry() {
        return LJ(((C19867512oL) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, Collection<V>> pollLastEntry() {
        return LJ(((C19867512oL) ((AbstractC19867812oO) descendingMap()).entrySet()).iterator());
    }

    public final C19868212oS LJ(Iterator it2) {
        if (!it2.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it2.next();
        Collection<V> collectionLJII = this.LLIZ.LJII();
        collectionLJII.addAll((Collection) entry.getValue());
        it2.remove();
        return new C19868212oS(entry.getKey(), this.LLIZ.LJIIIZ(collectionLJII));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, Collection<V>> ceilingEntry(K k) {
        Map.Entry<K, Collection<V>> entryCeilingEntry = LIZLLL().ceilingEntry(k);
        if (entryCeilingEntry == null) {
            return null;
        }
        return LIZ(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final K ceilingKey(K k) {
        return LIZLLL().ceilingKey(k);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, Collection<V>> floorEntry(K k) {
        Map.Entry<K, Collection<V>> entryFloorEntry = LIZLLL().floorEntry(k);
        if (entryFloorEntry == null) {
            return null;
        }
        return LIZ(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final K floorKey(K k) {
        return LIZLLL().floorKey(k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC19872012p4.i, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, Collection<V>> higherEntry(K k) {
        Map.Entry<K, Collection<V>> entryHigherEntry = LIZLLL().higherEntry(k);
        if (entryHigherEntry == null) {
            return null;
        }
        return LIZ(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final K higherKey(K k) {
        return LIZLLL().higherKey(k);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, Collection<V>> lowerEntry(K k) {
        Map.Entry<K, Collection<V>> entryLowerEntry = LIZLLL().lowerEntry(k);
        if (entryLowerEntry == null) {
            return null;
        }
        return LIZ(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final K lowerKey(K k) {
        return LIZLLL().lowerKey(k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC19872012p4.i, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19871712p1(AbstractC19872012p4 abstractC19872012p4, NavigableMap<K, Collection<V>> navigableMap) {
        super(navigableMap);
        this.LLIZ = abstractC19872012p4;
    }

    @Override // java.util.NavigableMap
    public final NavigableMap<K, Collection<V>> headMap(K k, boolean z) {
        return new C19871712p1(this.LLIZ, LIZLLL().headMap(k, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC19872012p4.i, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap<K, Collection<V>> tailMap(K k, boolean z) {
        return new C19871712p1(this.LLIZ, LIZLLL().tailMap(k, z));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap<K, Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
        return new C19871712p1(this.LLIZ, LIZLLL().subMap(k, z, k2, z2));
    }
}
