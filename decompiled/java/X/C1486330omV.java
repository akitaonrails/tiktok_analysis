package X;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: X.0omV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1486330omV<K, V> extends AbstractMap<K, V> implements Map<K, V> {
    public final ConcurrentMap<C1486330omV<K, V>.a<K>, V> LL = new ConcurrentHashMap();
    public final ReferenceQueue<K> LLILLJJLI = new ReferenceQueue<>();

    /* JADX INFO: renamed from: X.0omV$a */
    public class a<K> extends WeakReference<K> {
        public final int LIZ;

        @Override // java.lang.ref.Reference
        public final boolean enqueue() {
            Reference<? extends K> referencePoll;
            boolean zEnqueue = super.enqueue();
            if (zEnqueue && (referencePoll = C1486330omV.this.LLILLJJLI.poll()) != null) {
                ((ConcurrentHashMap) C1486330omV.this.LL).remove(referencePoll);
            }
            return zEnqueue;
        }

        public final int hashCode() {
            return this.LIZ;
        }

        public final boolean equals(Object obj) {
            K k;
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && (k = get()) != null && k.equals(((Reference) obj).get())) {
                return true;
            }
            return false;
        }

        public a(K k, ReferenceQueue<K> referenceQueue) {
            super(k, referenceQueue);
            this.LIZ = k.hashCode();
        }
    }

    public final void LIZ() {
        while (true) {
            Reference<? extends K> referencePoll = this.LLILLJJLI.poll();
            if (referencePoll == null) {
                return;
            } else {
                ((ConcurrentHashMap) this.LL).remove(referencePoll);
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        ((ConcurrentHashMap) this.LL).clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return ((ConcurrentHashMap) this.LL).isEmpty();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        HashSet hashSet = new HashSet();
        Iterator<K> it2 = ((ConcurrentHashMap) this.LL).keySet().iterator();
        while (it2.hasNext()) {
            Object obj = ((Reference) it2.next()).get();
            if (obj != null) {
                hashSet.add(obj);
            }
        }
        return hashSet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return ((ConcurrentHashMap) this.LL).size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        HashSet hashSet = new HashSet();
        Iterator<Map.Entry<K, V>> it2 = ((ConcurrentHashMap) this.LL).entrySet().iterator();
        while (it2.hasNext()) {
            hashSet.add(it2.next().getValue());
        }
        return hashSet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        LIZ();
        HashSet hashSet = new HashSet();
        for (Map.Entry<K, V> entry : ((ConcurrentHashMap) this.LL).entrySet()) {
            Object obj = ((Reference) entry.getKey()).get();
            if (obj != null) {
                hashSet.add(new AbstractMap.SimpleEntry(obj, entry.getValue()));
            }
        }
        return hashSet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return ((ConcurrentHashMap) this.LL).containsKey(new a(obj, this.LLILLJJLI));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return ((ConcurrentHashMap) this.LL).containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        if (obj == null) {
            return null;
        }
        LIZ();
        return (V) ((ConcurrentHashMap) this.LL).get(new a(obj, this.LLILLJJLI));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        return (V) ((ConcurrentHashMap) this.LL).remove(new a(obj, this.LLILLJJLI));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        if (k != null && v != null) {
            LIZ();
            return (V) ((ConcurrentHashMap) this.LL).put(new a(k, this.LLILLJJLI), v);
        }
        return null;
    }

    @Override // java.util.Map
    public final V putIfAbsent(K k, V v) {
        if (k != null && v != null) {
            LIZ();
            return (V) ((ConcurrentHashMap) this.LL).putIfAbsent(new a(k, this.LLILLJJLI), v);
        }
        return null;
    }
}
