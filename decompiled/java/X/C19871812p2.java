package X;

import X.AbstractC19872012p4;
import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: Add missing generic type declarations: [K] */
/* JADX INFO: renamed from: X.12p2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19871812p2<K> extends AbstractC19872012p4<K, V>.j implements NavigableSet<K> {
    public final /* synthetic */ AbstractC19872012p4 LLILZ;

    @Override // X.AbstractC19872012p4.j
    /* JADX INFO: renamed from: LJ, reason: merged with bridge method [inline-methods] */
    public final NavigableMap<K, Collection<V>> LIZJ() {
        return (NavigableMap) ((SortedMap) this.LL);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet<K> descendingSet() {
        return new C19871812p2(this.LLILZ, LIZJ().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Iterator<K> descendingIterator() {
        return ((AbstractC19872012p4.e) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final K pollFirst() {
        C19868512oV c19868512oV = (C19868512oV) iterator();
        if (!c19868512oV.hasNext()) {
            return null;
        }
        K k = (K) c19868512oV.next();
        c19868512oV.remove();
        return k;
    }

    @Override // java.util.NavigableSet
    public final K pollLast() {
        Iterator<K> itDescendingIterator = descendingIterator();
        if (!itDescendingIterator.hasNext()) {
            return null;
        }
        K next = itDescendingIterator.next();
        itDescendingIterator.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final K ceiling(K k) {
        return LIZJ().ceilingKey(k);
    }

    @Override // java.util.NavigableSet
    public final K floor(K k) {
        return LIZJ().floorKey(k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC19872012p4.j, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final K higher(K k) {
        return LIZJ().higherKey(k);
    }

    @Override // java.util.NavigableSet
    public final K lower(K k) {
        return LIZJ().lowerKey(k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC19872012p4.j, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19871812p2(AbstractC19872012p4 abstractC19872012p4, NavigableMap<K, Collection<V>> navigableMap) {
        super(navigableMap);
        this.LLILZ = abstractC19872012p4;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet<K> headSet(K k, boolean z) {
        return new C19871812p2(this.LLILZ, LIZJ().headMap(k, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC19872012p4.j, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet<K> tailSet(K k, boolean z) {
        return new C19871812p2(this.LLILZ, LIZJ().tailMap(k, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
        return new C19871812p2(this.LLILZ, LIZJ().subMap(k, z, k2, z2));
    }
}
