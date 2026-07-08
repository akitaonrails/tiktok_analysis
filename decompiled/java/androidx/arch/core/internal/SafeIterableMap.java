package androidx.arch.core.internal;

import X.AbstractC19506111Tf;
import X.C19506011Te;
import X.InterfaceC19506411Ti;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes30.dex */
public class SafeIterableMap<K, V> implements Iterable<Map.Entry<K, V>> {
    public C19506011Te<K, V> mEnd;
    public WeakHashMap<InterfaceC19506411Ti<K, V>, Boolean> mIterators = new WeakHashMap<>();
    public int mSize = 0;
    public C19506011Te<K, V> mStart;

    public class d implements Iterator<Map.Entry<K, V>>, InterfaceC19506411Ti<K, V> {
        public C19506011Te<K, V> LL;
        public boolean LLILLJJLI = true;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.LLILLJJLI) {
                return SafeIterableMap.this.mStart != null;
            }
            C19506011Te<K, V> c19506011Te = this.LL;
            return (c19506011Te == null || c19506011Te.LLILLL == null) ? false : true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.LLILLJJLI) {
                this.LLILLJJLI = false;
                this.LL = SafeIterableMap.this.mStart;
            } else {
                C19506011Te<K, V> c19506011Te = this.LL;
                this.LL = c19506011Te != null ? c19506011Te.LLILLL : null;
            }
            return this.LL;
        }

        public d() {
        }

        @Override // X.InterfaceC19506411Ti
        public final void LIZ(C19506011Te<K, V> c19506011Te) {
            boolean z;
            C19506011Te<K, V> c19506011Te2 = this.LL;
            if (c19506011Te == c19506011Te2) {
                C19506011Te<K, V> c19506011Te3 = c19506011Te2.LLILZ;
                this.LL = c19506011Te3;
                if (c19506011Te3 == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.LLILLJJLI = z;
            }
        }
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        final C19506011Te<K, V> c19506011Te = this.mEnd;
        final C19506011Te<K, V> c19506011Te2 = this.mStart;
        AbstractC19506111Tf<K, V> abstractC19506111Tf = new AbstractC19506111Tf<K, V>(c19506011Te, c19506011Te2) { // from class: X.11Th
            @Override // X.AbstractC19506111Tf
            public final C19506011Te<K, V> LIZIZ(C19506011Te<K, V> c19506011Te3) {
                return c19506011Te3.LLILLL;
            }

            @Override // X.AbstractC19506111Tf
            public final C19506011Te<K, V> LIZLLL(C19506011Te<K, V> c19506011Te3) {
                return c19506011Te3.LLILZ;
            }
        };
        this.mIterators.put(abstractC19506111Tf, Boolean.FALSE);
        return abstractC19506111Tf;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        final C19506011Te<K, V> c19506011Te = this.mStart;
        final C19506011Te<K, V> c19506011Te2 = this.mEnd;
        AbstractC19506111Tf<K, V> abstractC19506111Tf = new AbstractC19506111Tf<K, V>(c19506011Te, c19506011Te2) { // from class: X.11Tg
            @Override // X.AbstractC19506111Tf
            public final C19506011Te<K, V> LIZIZ(C19506011Te<K, V> c19506011Te3) {
                return c19506011Te3.LLILZ;
            }

            @Override // X.AbstractC19506111Tf
            public final C19506011Te<K, V> LIZLLL(C19506011Te<K, V> c19506011Te3) {
                return c19506011Te3.LLILLL;
            }
        };
        this.mIterators.put(abstractC19506111Tf, Boolean.FALSE);
        return abstractC19506111Tf;
    }

    public SafeIterableMap<K, V>.d iteratorWithAdditions() {
        SafeIterableMap<K, V>.d dVar = new d();
        this.mIterators.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(e3.e);
        Iterator<Map.Entry<K, V>> it2 = iterator();
        while (it2.hasNext()) {
            sb.append(it2.next().toString());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(e3.f);
        return sb.toString();
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it2 = iterator();
        int iHashCode = 0;
        while (it2.hasNext()) {
            iHashCode += it2.next().hashCode();
        }
        return iHashCode;
    }

    public Map.Entry<K, V> eldest() {
        return this.mStart;
    }

    public Map.Entry<K, V> newest() {
        return this.mEnd;
    }

    public int size() {
        return this.mSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SafeIterableMap)) {
            return false;
        }
        SafeIterableMap safeIterableMap = (SafeIterableMap) obj;
        if (size() != safeIterableMap.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it2 = iterator();
        Iterator<Map.Entry<K, V>> it3 = safeIterableMap.iterator();
        while (it2.hasNext() && it3.hasNext()) {
            Map.Entry<K, V> next = it2.next();
            Map.Entry<K, V> next2 = it3.next();
            if (next == null) {
                if (next2 != null) {
                    return false;
                }
            } else if (!next.equals(next2)) {
                return false;
            }
        }
        if (!it2.hasNext() && !it3.hasNext()) {
            return true;
        }
        return false;
    }

    public C19506011Te<K, V> get(K k) {
        C19506011Te<K, V> c19506011Te = this.mStart;
        while (c19506011Te != null && !c19506011Te.LL.equals(k)) {
            c19506011Te = c19506011Te.LLILLL;
        }
        return c19506011Te;
    }

    public V remove(K k) {
        C19506011Te<K, V> c19506011Te = get(k);
        if (c19506011Te == null) {
            return null;
        }
        this.mSize--;
        if (!this.mIterators.isEmpty()) {
            Iterator<InterfaceC19506411Ti<K, V>> it2 = this.mIterators.keySet().iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(c19506011Te);
            }
        }
        C19506011Te<K, V> c19506011Te2 = c19506011Te.LLILZ;
        if (c19506011Te2 != null) {
            c19506011Te2.LLILLL = c19506011Te.LLILLL;
        } else {
            this.mStart = c19506011Te.LLILLL;
        }
        C19506011Te<K, V> c19506011Te3 = c19506011Te.LLILLL;
        if (c19506011Te3 != null) {
            c19506011Te3.LLILZ = c19506011Te2;
        } else {
            this.mEnd = c19506011Te2;
        }
        c19506011Te.LLILLL = null;
        c19506011Te.LLILZ = null;
        return c19506011Te.LLILLJJLI;
    }

    public C19506011Te<K, V> put(K k, V v) {
        C19506011Te<K, V> c19506011Te = new C19506011Te<>(k, v);
        this.mSize++;
        C19506011Te<K, V> c19506011Te2 = this.mEnd;
        if (c19506011Te2 == null) {
            this.mStart = c19506011Te;
            this.mEnd = c19506011Te;
            return c19506011Te;
        }
        c19506011Te2.LLILLL = c19506011Te;
        c19506011Te.LLILZ = c19506011Te2;
        this.mEnd = c19506011Te;
        return c19506011Te;
    }

    public V putIfAbsent(K k, V v) {
        C19506011Te<K, V> c19506011Te = get(k);
        if (c19506011Te != null) {
            return c19506011Te.LLILLJJLI;
        }
        put(k, v);
        return null;
    }
}
