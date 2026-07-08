package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: X.12ud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19906512ud<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int LLIZ = 0;
    public final int LL;
    public boolean LLILZ;
    public volatile C19906812ug LLILZIL;
    public List<C19906612ue> LLILLJJLI = Collections.emptyList();
    public Map<K, V> LLILLL = Collections.emptyMap();
    public Map<K, V> LLILZLL = Collections.emptyMap();

    public void LIZJ() {
        if (this.LLILZ) {
            return;
        }
        this.LLILLL = this.LLILLL.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.LLILLL);
        this.LLILZLL = this.LLILZLL.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.LLILZLL);
        this.LLILZ = true;
    }

    public final int LIZLLL() {
        return this.LLILLJJLI.size();
    }

    public final Iterable<Map.Entry<K, V>> LJFF() {
        return this.LLILLL.isEmpty() ? Collections.emptySet() : this.LLILLL.entrySet();
    }

    public final void LJIIIIZZ() {
        if (this.LLILZ) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.12ug] */
    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.LLILZIL == null) {
            this.LLILZIL = new AbstractSet() { // from class: X.12ug
                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final void clear() {
                    this.LL.clear();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator iterator() {
                    final C19906512ud c19906512ud = this.LL;
                    return new Iterator() { // from class: X.12uf
                        public int LL = -1;
                        public boolean LLILLJJLI;
                        public Iterator LLILLL;

                        @Override // java.util.Iterator
                        public final /* synthetic */ Object next() {
                            this.LLILLJJLI = true;
                            int i = this.LL + 1;
                            this.LL = i;
                            return i < c19906512ud.LLILLJJLI.size() ? ListProtector.get(c19906512ud.LLILLJJLI, this.LL) : LIZ().next();
                        }

                        public final Iterator LIZ() {
                            if (this.LLILLL == null) {
                                this.LLILLL = c19906512ud.LLILLL.entrySet().iterator();
                            }
                            return this.LLILLL;
                        }

                        @Override // java.util.Iterator
                        public final boolean hasNext() {
                            return this.LL + 1 < c19906512ud.LLILLJJLI.size() || (!c19906512ud.LLILLL.isEmpty() && LIZ().hasNext());
                        }

                        @Override // java.util.Iterator
                        public final void remove() {
                            if (!this.LLILLJJLI) {
                                throw new IllegalStateException("remove() was called before next()");
                            }
                            this.LLILLJJLI = false;
                            c19906512ud.LJIIIIZZ();
                            if (this.LL >= c19906512ud.LLILLJJLI.size()) {
                                LIZ().remove();
                                return;
                            }
                            C19906512ud c19906512ud2 = c19906512ud;
                            int i = this.LL;
                            this.LL = i - 1;
                            c19906512ud2.LJI(i);
                        }
                    };
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
                    return this.LL.size();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final /* synthetic */ boolean add(Object obj) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!contains(entry)) {
                        this.LL.put((Comparable) entry.getKey(), entry.getValue());
                        return true;
                    }
                    return false;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean contains(Object obj) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object obj2 = this.LL.get(entry.getKey());
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
                        this.LL.remove(entry.getKey());
                        return true;
                    }
                    return false;
                }
            };
        }
        return this.LLILZIL;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.LLILLJJLI.size() + this.LLILLL.size();
    }

    public final SortedMap<K, V> LJII() {
        LJIIIIZZ();
        if (this.LLILLL.isEmpty() && !(this.LLILLL instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.LLILLL = treeMap;
            this.LLILZLL = treeMap.descendingMap();
        }
        return (SortedMap) this.LLILLL;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        LJIIIIZZ();
        if (!this.LLILLJJLI.isEmpty()) {
            this.LLILLJJLI.clear();
        }
        if (this.LLILLL.isEmpty()) {
            return;
        }
        this.LLILLL.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iLIZLLL = LIZLLL();
        int iHashCode = 0;
        for (int i = 0; i < iLIZLLL; i++) {
            iHashCode += ((C19906612ue) ListProtector.get(this.LLILLJJLI, i)).hashCode();
        }
        return this.LLILLL.size() > 0 ? iHashCode + this.LLILLL.hashCode() : iHashCode;
    }

    public C19906512ud(int i) {
        this.LL = i;
    }

    public final int LIZ(K k) {
        int size = this.LLILLJJLI.size() - 1;
        if (size >= 0) {
            int iCompareTo = k.compareTo(((C19906612ue) ListProtector.get(this.LLILLJJLI, size)).LL);
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int iCompareTo2 = k.compareTo(((C19906612ue) ListProtector.get(this.LLILLJJLI, i2)).LL);
            if (iCompareTo2 < 0) {
                size = i2 - 1;
            } else if (iCompareTo2 > 0) {
                i = i2 + 1;
            } else {
                return i2;
            }
        }
        return -(i + 1);
    }

    public final Map.Entry<K, V> LJ(int i) {
        return (Map.Entry) ListProtector.get(this.LLILLJJLI, i);
    }

    public final V LJI(int i) {
        LJIIIIZZ();
        V v = (V) ((C19906612ue) ListProtector.remove(this.LLILLJJLI, i)).LLILLJJLI;
        if (!this.LLILLL.isEmpty()) {
            Iterator<Map.Entry<K, V>> it2 = LJII().entrySet().iterator();
            List<C19906612ue> list = this.LLILLJJLI;
            Map.Entry<K, V> next = it2.next();
            list.add(new C19906612ue(this, next.getKey(), next.getValue()));
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
        if (!(obj instanceof C19906512ud)) {
            return super.equals(obj);
        }
        C19906512ud c19906512ud = (C19906512ud) obj;
        int size = size();
        if (size != c19906512ud.size()) {
            return false;
        }
        int iLIZLLL = LIZLLL();
        if (iLIZLLL != c19906512ud.LIZLLL()) {
            return entrySet().equals(c19906512ud.entrySet());
        }
        for (int i = 0; i < iLIZLLL; i++) {
            if (!LJ(i).equals(c19906512ud.LJ(i))) {
                return false;
            }
        }
        if (iLIZLLL == size) {
            return true;
        }
        return this.LLILLL.equals(c19906512ud.LLILLL);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iLIZ = LIZ(comparable);
        if (iLIZ >= 0) {
            return (V) ((C19906612ue) ListProtector.get(this.LLILLJJLI, iLIZ)).LLILLJJLI;
        }
        return this.LLILLL.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        LJIIIIZZ();
        Comparable comparable = (Comparable) obj;
        int iLIZ = LIZ(comparable);
        if (iLIZ >= 0) {
            return LJI(iLIZ);
        }
        if (this.LLILLL.isEmpty()) {
            return null;
        }
        return this.LLILLL.remove(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final V put(K k, V v) {
        LJIIIIZZ();
        int iLIZ = LIZ(k);
        if (iLIZ >= 0) {
            return (V) ((C19906612ue) ListProtector.get(this.LLILLJJLI, iLIZ)).setValue(v);
        }
        LJIIIIZZ();
        if (this.LLILLJJLI.isEmpty() && !(this.LLILLJJLI instanceof ArrayList)) {
            this.LLILLJJLI = new ArrayList(this.LL);
        }
        int i = -(iLIZ + 1);
        if (i >= this.LL) {
            return LJII().put(k, v);
        }
        int size = this.LLILLJJLI.size();
        int i2 = this.LL;
        if (size == i2) {
            C19906612ue c19906612ue = (C19906612ue) ListProtector.remove(this.LLILLJJLI, i2 - 1);
            LJII().put(c19906612ue.LL, c19906612ue.LLILLJJLI);
        }
        ListProtector.add(this.LLILLJJLI, i, new C19906612ue(this, k, v));
        return null;
    }
}
