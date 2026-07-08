package X;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: X.12yE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19928812yE<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int LLIZ = 0;
    public Object[] LL;
    public int LLILLJJLI;
    public boolean LLILZ;
    public volatile C19928812yE<K, V>.e LLILZIL;
    public Map<K, V> LLILLL = Collections.emptyMap();
    public Map<K, V> LLILZLL = Collections.emptyMap();

    /* JADX INFO: renamed from: X.12yE$c */
    public class c implements Map.Entry<K, V>, Comparable<C19928812yE<K, V>.c> {
        public final K LL;
        public V LLILLJJLI;

        public c() {
            throw null;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.LL;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.LLILLJJLI;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LL);
            sbLIZ.append("=");
            sbLIZ.append(this.LLILLJJLI);
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // java.util.Map.Entry
        public final /* bridge */ /* synthetic */ Object getKey() {
            return this.LL;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.LLILLJJLI;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.LL.compareTo(((c) obj).LL);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.LL;
            Object key = entry.getKey();
            if (k == null) {
                if (key != null) {
                    return false;
                }
            } else if (!k.equals(key)) {
                return false;
            }
            V v = this.LLILLJJLI;
            Object value = entry.getValue();
            if (v == null) {
                if (value == null) {
                    return true;
                }
                return false;
            }
            if (v.equals(value)) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            C19928812yE.this.LIZIZ();
            V v2 = this.LLILLJJLI;
            this.LLILLJJLI = v;
            return v2;
        }

        public c(K k, V v) {
            this.LL = k;
            this.LLILLJJLI = v;
        }
    }

    /* JADX INFO: renamed from: X.12yE$e */
    public class e extends AbstractSet<Map.Entry<K, V>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            C19928812yE.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            final C19928812yE c19928812yE = C19928812yE.this;
            return (Iterator<Map.Entry<K, V>>) new Iterator<Map.Entry<K, V>>() { // from class: X.12yP
                public int LL = -1;
                public boolean LLILLJJLI;
                public Iterator<Map.Entry<K, V>> LLILLL;

                @Override // java.util.Iterator
                public final Object next() {
                    this.LLILLJJLI = true;
                    int i = this.LL + 1;
                    this.LL = i;
                    C19928812yE c19928812yE2 = c19928812yE;
                    return i < c19928812yE2.LLILLJJLI ? c19928812yE2.LL[i] : LIZ().next();
                }

                public final Iterator<Map.Entry<K, V>> LIZ() {
                    if (this.LLILLL == null) {
                        this.LLILLL = c19928812yE.LLILLL.entrySet().iterator();
                    }
                    return this.LLILLL;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    int i = this.LL + 1;
                    C19928812yE c19928812yE2 = c19928812yE;
                    return i < c19928812yE2.LLILLJJLI || (!c19928812yE2.LLILLL.isEmpty() && LIZ().hasNext());
                }

                @Override // java.util.Iterator
                public final void remove() {
                    if (!this.LLILLJJLI) {
                        throw new IllegalStateException("remove() was called before next()");
                    }
                    this.LLILLJJLI = false;
                    c19928812yE.LIZIZ();
                    int i = this.LL;
                    C19928812yE c19928812yE2 = c19928812yE;
                    if (i >= c19928812yE2.LLILLJJLI) {
                        LIZ().remove();
                    } else {
                        this.LL = i - 1;
                        c19928812yE2.LJII(i);
                    }
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return C19928812yE.this.size();
        }

        public e() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                C19928812yE.this.put((Comparable) entry.getKey(), entry.getValue());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C19928812yE.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                if (obj2 != null && obj2.equals(value)) {
                    return true;
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                C19928812yE.this.remove(entry.getKey());
                return true;
            }
            return false;
        }
    }

    public final void LIZIZ() {
        if (this.LLILZ) {
            throw new UnsupportedOperationException();
        }
    }

    public final Iterable<Map.Entry<K, V>> LIZLLL() {
        return this.LLILLL.isEmpty() ? Collections.emptySet() : this.LLILLL.entrySet();
    }

    public void LJFF() {
        if (this.LLILZ) {
            return;
        }
        this.LLILLL = this.LLILLL.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.LLILLL);
        this.LLILZLL = this.LLILZLL.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.LLILZLL);
        this.LLILZ = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.LLILZIL == null) {
            this.LLILZIL = new e();
        }
        return this.LLILZIL;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.LLILLJJLI;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.LL[i2].hashCode();
        }
        return this.LLILLL.size() > 0 ? iHashCode + this.LLILLL.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.LLILLJJLI + this.LLILLL.size();
    }

    public final SortedMap<K, V> LJ() {
        LIZIZ();
        if (this.LLILLL.isEmpty() && !(this.LLILLL instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.LLILLL = treeMap;
            this.LLILZLL = treeMap.descendingMap();
        }
        return (SortedMap) this.LLILLL;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        LIZIZ();
        if (this.LLILLJJLI != 0) {
            this.LL = null;
            this.LLILLJJLI = 0;
        }
        if (this.LLILLL.isEmpty()) {
            return;
        }
        this.LLILLL.clear();
    }

    public final int LIZ(K k) {
        int i = this.LLILLJJLI - 1;
        if (i >= 0) {
            int iCompareTo = k.compareTo(((c) this.LL[i]).LL);
            if (iCompareTo > 0) {
                return -(i + 2);
            }
            if (iCompareTo == 0) {
                return i;
            }
        }
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) / 2;
            int iCompareTo2 = k.compareTo(((c) this.LL[i3]).LL);
            if (iCompareTo2 < 0) {
                i = i3 - 1;
            } else if (iCompareTo2 > 0) {
                i2 = i3 + 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    public final c LIZJ(int i) {
        if (i < this.LLILLJJLI) {
            return (c) this.LL[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final V LJII(int i) {
        LIZIZ();
        Object[] objArr = this.LL;
        V v = ((c) objArr[i]).LLILLJJLI;
        System.arraycopy(objArr, i + 1, objArr, i, (this.LLILLJJLI - i) - 1);
        this.LLILLJJLI--;
        if (!this.LLILLL.isEmpty()) {
            Iterator<Map.Entry<K, V>> it2 = LJ().entrySet().iterator();
            Object[] objArr2 = this.LL;
            int i2 = this.LLILLJJLI;
            Map.Entry<K, V> next = it2.next();
            objArr2[i2] = new c(next.getKey(), next.getValue());
            this.LLILLJJLI++;
            it2.remove();
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (LIZ(comparable) < 0 && !this.LLILLL.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19928812yE)) {
            return super.equals(obj);
        }
        C19928812yE c19928812yE = (C19928812yE) obj;
        int size = size();
        if (size != c19928812yE.size()) {
            return false;
        }
        int i = this.LLILLJJLI;
        if (i != c19928812yE.LLILLJJLI) {
            return ((AbstractSet) entrySet()).equals(c19928812yE.entrySet());
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (!LIZJ(i2).equals(c19928812yE.LIZJ(i2))) {
                return false;
            }
        }
        if (i == size) {
            return true;
        }
        return this.LLILLL.equals(c19928812yE.LLILLL);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iLIZ = LIZ(comparable);
        if (iLIZ >= 0) {
            return ((c) this.LL[iLIZ]).LLILLJJLI;
        }
        return this.LLILLL.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        LIZIZ();
        Comparable comparable = (Comparable) obj;
        int iLIZ = LIZ(comparable);
        if (iLIZ >= 0) {
            return LJII(iLIZ);
        }
        if (this.LLILLL.isEmpty()) {
            return null;
        }
        return this.LLILLL.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: LJI, reason: merged with bridge method [inline-methods] */
    public final V put(K k, V v) {
        LIZIZ();
        int iLIZ = LIZ(k);
        if (iLIZ >= 0) {
            return (V) ((c) this.LL[iLIZ]).setValue(v);
        }
        LIZIZ();
        if (this.LL == null) {
            this.LL = new Object[16];
        }
        int i = -(iLIZ + 1);
        if (i >= 16) {
            return LJ().put(k, v);
        }
        if (this.LLILLJJLI == 16) {
            c cVar = (c) this.LL[15];
            this.LLILLJJLI = 15;
            LJ().put(cVar.LL, cVar.LLILLJJLI);
        }
        Object[] objArr = this.LL;
        System.arraycopy(objArr, i, objArr, i + 1, (objArr.length - i) - 1);
        this.LL[i] = new c(k, v);
        this.LLILLJJLI++;
        return null;
    }
}
