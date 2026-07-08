package X;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: X.12qQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19880412qQ<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Object LLJI = new Object();
    public transient Object LL;
    public transient int[] LLILLJJLI;
    public transient Object[] LLILLL;
    public transient Object[] LLILZ;
    public transient int LLILZIL;
    public transient int LLILZLL;
    public transient C19880812qU LLIZ;
    public transient C19880512qR LLIZLLLIL;
    public transient C19880912qV LLJ;

    /* JADX INFO: renamed from: X.12qQ$b */
    public abstract class b<T> implements Iterator<T> {
        public int LL;
        public int LLILLJJLI;
        public int LLILLL = -1;

        public abstract T LIZ(int i);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.LLILLJJLI >= 0;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (C19880412qQ.this.LLILZIL != this.LL) {
                throw new ConcurrentModificationException();
            }
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.LLILLJJLI;
            this.LLILLL = i;
            T tLIZ = LIZ(i);
            this.LLILLJJLI = C19880412qQ.this.LJII(this.LLILLJJLI);
            return tLIZ;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (C19880412qQ.this.LLILZIL != this.LL) {
                throw new ConcurrentModificationException();
            }
            C19863912nl.LIZJ(this.LLILLL >= 0);
            this.LL += 32;
            C19880412qQ c19880412qQ = C19880412qQ.this;
            c19880412qQ.remove(c19880412qQ.LJIILIIL(this.LLILLL));
            this.LLILLJJLI = C19880412qQ.this.LIZIZ(this.LLILLJJLI, this.LLILLL);
            this.LLILLL = -1;
        }

        public b() {
            this.LL = C19880412qQ.this.LLILZIL;
            this.LLILLJJLI = C19880412qQ.this.LJI();
        }
    }

    public void LIZ(int i) {
    }

    public int LIZIZ(int i, int i2) {
        return i - 1;
    }

    public Map<K, V> LIZLLL() {
        Map<K, V> mapLJ = LJ(((1 << (this.LLILZIL & 31)) - 1) + 1);
        int iLJI = LJI();
        while (iLJI >= 0) {
            mapLJ.put(LJIILIIL(iLJI), LJJIFFI(iLJI));
            iLJI = LJII(iLJI);
        }
        this.LL = mapLJ;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        LJIIIIZZ();
        return mapLJ;
    }

    public final Map<K, V> LJFF() {
        Object obj = this.LL;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void LJIIIIZZ() {
        this.LLILZIL += 32;
    }

    public final boolean LJIILLIIL() {
        return this.LL == null;
    }

    public final int[] LJIJJ() {
        int[] iArr = this.LLILLJJLI;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] LJIJJLI() {
        Object[] objArr = this.LLILLL;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] LJIL() {
        Object[] objArr = this.LLILZ;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        C19880512qR c19880512qR = this.LLIZLLLIL;
        if (c19880512qR != null) {
            return c19880512qR;
        }
        AbstractSet<Map.Entry<K, V>> abstractSet = new AbstractSet<Map.Entry<K, V>>() { // from class: X.12qR
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final void clear() {
                this.LL.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, V>> iterator() {
                C19880412qQ c19880412qQ = this.LL;
                Map<K, V> mapLJFF = c19880412qQ.LJFF();
                return mapLJFF != null ? mapLJFF.entrySet().iterator() : new C19881012qW(c19880412qQ);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return this.LL.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                Map<K, V> mapLJFF = this.LL.LJFF();
                if (mapLJFF != null) {
                    return mapLJFF.entrySet().contains(obj);
                }
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                int iLJIIIZ = this.LL.LJIIIZ(entry.getKey());
                if (iLJIIIZ == -1 || !C19837412jU.LIZ(this.LL.LJJIFFI(iLJIIIZ), entry.getValue())) {
                    return false;
                }
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                Map<K, V> mapLJFF = this.LL.LJFF();
                if (mapLJFF != null) {
                    return mapLJFF.entrySet().remove(obj);
                }
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (this.LL.LJIILLIIL()) {
                    return false;
                }
                int i = (1 << (this.LL.LLILZIL & 31)) - 1;
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = this.LL.LL;
                Objects.requireNonNull(obj2);
                int iLIZIZ = C19880212qO.LIZIZ(key, value, i, obj2, this.LL.LJIJJ(), this.LL.LJIJJLI(), this.LL.LJIL());
                if (iLIZIZ == -1) {
                    return false;
                }
                this.LL.LJIILL(iLIZIZ, i);
                C19880412qQ c19880412qQ = this.LL;
                c19880412qQ.LLILZLL--;
                c19880412qQ.LJIIIIZZ();
                return true;
            }
        };
        this.LLIZLLLIL = abstractSet;
        return abstractSet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        C19880812qU c19880812qU = this.LLIZ;
        if (c19880812qU != null) {
            return c19880812qU;
        }
        AbstractSet<K> abstractSet = new AbstractSet<K>() { // from class: X.12qU
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final void clear() {
                this.LL.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<K> iterator() {
                final C19880412qQ c19880412qQ = this.LL;
                Map mapLJFF = c19880412qQ.LJFF();
                return mapLJFF != null ? mapLJFF.keySet().iterator() : new C19880412qQ<Object, Object>.b<Object>() { // from class: X.12qX
                    {
                        super();
                    }

                    @Override // X.C19880412qQ.b
                    public final Object LIZ(int i) {
                        return this.LLILZIL.LJIILIIL(i);
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return this.LL.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                return this.LL.containsKey(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                Map mapLJFF = this.LL.LJFF();
                if (mapLJFF != null) {
                    return mapLJFF.keySet().remove(obj);
                }
                if (this.LL.LJIIZILJ(obj) != C19880412qQ.LLJI) {
                    return true;
                }
                return false;
            }
        };
        this.LLIZ = abstractSet;
        return abstractSet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        C19880912qV c19880912qV = this.LLJ;
        if (c19880912qV != null) {
            return c19880912qV;
        }
        AbstractCollection<V> abstractCollection = new AbstractCollection<V>() { // from class: X.12qV
            @Override // java.util.AbstractCollection, java.util.Collection
            public final void clear() {
                this.LL.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            public final Iterator<V> iterator() {
                final C19880412qQ c19880412qQ = this.LL;
                Map mapLJFF = c19880412qQ.LJFF();
                return mapLJFF != null ? mapLJFF.values().iterator() : new C19880412qQ<Object, Object>.b<Object>() { // from class: X.12qY
                    {
                        super();
                    }

                    @Override // X.C19880412qQ.b
                    public final Object LIZ(int i) {
                        return this.LLILZIL.LJJIFFI(i);
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final int size() {
                return this.LL.size();
            }
        };
        this.LLJ = abstractCollection;
        return abstractCollection;
    }

    public C19880412qQ() {
        LJIIJJI(3);
    }

    public int LIZJ() {
        C19864312np.LJIILIIL("Arrays already allocated", LJIILLIIL());
        int i = this.LLILZIL;
        int iMax = Math.max(i + 1, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax > ((int) (((double) iHighestOneBit) * 1.0d)) && (iHighestOneBit = iHighestOneBit << 1) <= 0) {
            iHighestOneBit = 1073741824;
        }
        int iMax2 = Math.max(4, iHighestOneBit);
        this.LL = C19880212qO.LIZ(iMax2);
        this.LLILZIL = ((32 - Integer.numberOfLeadingZeros(iMax2 - 1)) & 31) | (this.LLILZIL & (-32));
        this.LLILLJJLI = new int[i];
        this.LLILLL = new Object[i];
        this.LLILZ = new Object[i];
        return i;
    }

    public int LJI() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (LJIILLIIL()) {
            return;
        }
        LJIIIIZZ();
        Map<K, V> mapLJFF = LJFF();
        if (mapLJFF != null) {
            this.LLILZIL = C19881312qZ.LIZ(size(), 3);
            mapLJFF.clear();
            this.LL = null;
            this.LLILZLL = 0;
            return;
        }
        Arrays.fill(LJIJJLI(), 0, this.LLILZLL, (Object) null);
        Arrays.fill(LJIL(), 0, this.LLILZLL, (Object) null);
        Object obj = this.LL;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(LJIJJ(), 0, this.LLILZLL, 0);
        this.LLILZLL = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map<K, V> mapLJFF = LJFF();
        return mapLJFF != null ? mapLJFF.size() : this.LLILZLL;
    }

    public C19880412qQ(int i) {
        LJIIJJI(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i >= 0) {
            LJIIJJI(i);
            for (int i2 = 0; i2 < i; i2++) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            }
            return;
        }
        StringBuilder sb = new StringBuilder(25);
        sb.append("Invalid size: ");
        sb.append(i);
        throw new InvalidObjectException(sb.toString());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Iterator<Map.Entry<K, V>> c19881012qW;
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map<K, V> mapLJFF = LJFF();
        if (mapLJFF != null) {
            c19881012qW = mapLJFF.entrySet().iterator();
        } else {
            c19881012qW = new C19881012qW(this);
        }
        while (c19881012qW.hasNext()) {
            Map.Entry<K, V> next = c19881012qW.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    public Map<K, V> LJ(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    public int LJII(int i) {
        int i2 = i + 1;
        if (i2 >= this.LLILZLL) {
            return -1;
        }
        return i2;
    }

    public final int LJIIIZ(Object obj) {
        if (LJIILLIIL()) {
            return -1;
        }
        int iLIZIZ = C19876812pq.LIZIZ(obj);
        int i = (1 << (this.LLILZIL & 31)) - 1;
        Object obj2 = this.LL;
        Objects.requireNonNull(obj2);
        int iLIZJ = C19880212qO.LIZJ(iLIZIZ & i, obj2);
        if (iLIZJ == 0) {
            return -1;
        }
        int i2 = ~i;
        int i3 = iLIZIZ & i2;
        do {
            int i4 = iLIZJ - 1;
            int i5 = LJIJJ()[i4];
            if ((i5 & i2) == i3 && C19837412jU.LIZ(obj, LJIILIIL(i4))) {
                return i4;
            }
            iLIZJ = i5 & i;
        } while (iLIZJ != 0);
        return -1;
    }

    public void LJIIJJI(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C19864312np.LIZLLL("Expected size must be >= 0", z);
        this.LLILZIL = C19881312qZ.LIZ(i, 1);
    }

    public final K LJIILIIL(int i) {
        return (K) LJIJJLI()[i];
    }

    public final Object LJIIZILJ(Object obj) {
        boolean zLJIILLIIL = LJIILLIIL();
        Object obj2 = LLJI;
        if (zLJIILLIIL) {
            return obj2;
        }
        int i = (1 << (this.LLILZIL & 31)) - 1;
        Object obj3 = this.LL;
        Objects.requireNonNull(obj3);
        int iLIZIZ = C19880212qO.LIZIZ(obj, null, i, obj3, LJIJJ(), LJIJJLI(), null);
        if (iLIZIZ == -1) {
            return obj2;
        }
        V vLJJIFFI = LJJIFFI(iLIZIZ);
        LJIILL(iLIZIZ, i);
        this.LLILZLL--;
        LJIIIIZZ();
        return vLJJIFFI;
    }

    public void LJJ(int i) {
        this.LLILLJJLI = Arrays.copyOf(LJIJJ(), i);
        this.LLILLL = Arrays.copyOf(LJIJJLI(), i);
        this.LLILZ = Arrays.copyOf(LJIL(), i);
    }

    public final V LJJIFFI(int i) {
        return (V) LJIL()[i];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map<K, V> mapLJFF = LJFF();
        if (mapLJFF != null) {
            return mapLJFF.containsKey(obj);
        }
        if (LJIIIZ(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map<K, V> mapLJFF = LJFF();
        if (mapLJFF != null) {
            return mapLJFF.containsValue(obj);
        }
        for (int i = 0; i < this.LLILZLL; i++) {
            if (C19837412jU.LIZ(obj, LJJIFFI(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Map<K, V> mapLJFF = LJFF();
        if (mapLJFF != null) {
            return mapLJFF.get(obj);
        }
        int iLJIIIZ = LJIIIZ(obj);
        if (iLJIIIZ == -1) {
            return null;
        }
        LIZ(iLJIIIZ);
        return LJJIFFI(iLJIIIZ);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        Map<K, V> mapLJFF = LJFF();
        if (mapLJFF != null) {
            return mapLJFF.remove(obj);
        }
        V v = (V) LJIIZILJ(obj);
        if (v == LLJI) {
            return null;
        }
        return v;
    }

    public void LJIILL(int i, int i2) {
        int i3;
        int i4;
        Object obj = this.LL;
        Objects.requireNonNull(obj);
        int[] iArrLJIJJ = LJIJJ();
        Object[] objArrLJIJJLI = LJIJJLI();
        Object[] objArrLJIL = LJIL();
        int size = size() - 1;
        if (i < size) {
            Object obj2 = objArrLJIJJLI[size];
            objArrLJIJJLI[i] = obj2;
            objArrLJIL[i] = objArrLJIL[size];
            objArrLJIJJLI[size] = null;
            objArrLJIL[size] = null;
            iArrLJIJJ[i] = iArrLJIJJ[size];
            iArrLJIJJ[size] = 0;
            int iLIZIZ = C19876812pq.LIZIZ(obj2) & i2;
            int iLIZJ = C19880212qO.LIZJ(iLIZIZ, obj);
            int i5 = size + 1;
            if (iLIZJ == i5) {
                C19880212qO.LIZLLL(iLIZIZ, i + 1, obj);
                return;
            }
            do {
                i3 = iLIZJ - 1;
                i4 = iArrLJIJJ[i3];
                iLIZJ = i4 & i2;
            } while (iLIZJ != i5);
            iArrLJIJJ[i3] = ((i + 1) & i2) | (i4 & (~i2));
            return;
        }
        objArrLJIJJLI[i] = null;
        objArrLJIL[i] = null;
        iArrLJIJJ[i] = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        int i;
        int iMin;
        int i2;
        if (LJIILLIIL()) {
            LIZJ();
        }
        Map<K, V> mapLJFF = LJFF();
        if (mapLJFF != null) {
            return mapLJFF.put(k, v);
        }
        int[] iArrLJIJJ = LJIJJ();
        Object[] objArrLJIJJLI = LJIJJLI();
        Object[] objArrLJIL = LJIL();
        int i3 = this.LLILZLL;
        int i4 = i3 + 1;
        int iLIZIZ = C19876812pq.LIZIZ(k);
        int iLJJI = (1 << (this.LLILZIL & 31)) - 1;
        int i5 = iLIZIZ & iLJJI;
        Object obj = this.LL;
        Objects.requireNonNull(obj);
        int iLIZJ = C19880212qO.LIZJ(i5, obj);
        if (iLIZJ == 0) {
            if (i4 > iLJJI) {
                if (iLJJI < 32) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                iLJJI = LJJI(iLJJI, i2 * (iLJJI + 1), iLIZIZ, i3);
            } else {
                Object obj2 = this.LL;
                Objects.requireNonNull(obj2);
                C19880212qO.LIZLLL(i5, i4, obj2);
            }
        } else {
            int i6 = ~iLJJI;
            int i7 = iLIZIZ & i6;
            int i8 = 0;
            while (true) {
                int i9 = iLIZJ - 1;
                int i10 = iArrLJIJJ[i9];
                int i11 = i10 & i6;
                if (i11 == i7 && C19837412jU.LIZ(k, objArrLJIJJLI[i9])) {
                    V v2 = (V) objArrLJIL[i9];
                    objArrLJIL[i9] = v;
                    LIZ(i9);
                    return v2;
                }
                int i12 = i10 & iLJJI;
                i8++;
                if (i12 == 0) {
                    if (i8 >= 9) {
                        return LIZLLL().put(k, v);
                    }
                    if (i4 > iLJJI) {
                        if (iLJJI < 32) {
                            i = 4;
                        } else {
                            i = 2;
                        }
                        iLJJI = LJJI(iLJJI, i * (iLJJI + 1), iLIZIZ, i3);
                    } else {
                        iArrLJIJJ[i9] = (i4 & iLJJI) | i11;
                    }
                } else {
                    iLIZJ = i12;
                }
            }
        }
        int length = LJIJJ().length;
        if (i4 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            LJJ(iMin);
        }
        LJIIL(i3, iLIZIZ, iLJJI, k, v);
        this.LLILZLL = i4;
        LJIIIIZZ();
        return null;
    }

    public final int LJJI(int i, int i2, int i3, int i4) {
        Object objLIZ = C19880212qO.LIZ(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            C19880212qO.LIZLLL(i3 & i5, i4 + 1, objLIZ);
        }
        Object obj = this.LL;
        Objects.requireNonNull(obj);
        int[] iArrLJIJJ = LJIJJ();
        for (int i6 = 0; i6 <= i; i6++) {
            int iLIZJ = C19880212qO.LIZJ(i6, obj);
            while (iLIZJ != 0) {
                int i7 = iLIZJ - 1;
                int i8 = iArrLJIJJ[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iLIZJ2 = C19880212qO.LIZJ(i10, objLIZ);
                C19880212qO.LIZLLL(i10, iLIZJ, objLIZ);
                iArrLJIJJ[i7] = ((~i5) & i9) | (iLIZJ2 & i5);
                iLIZJ = i8 & i;
            }
        }
        this.LL = objLIZ;
        this.LLILZIL = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.LLILZIL & (-32));
        return i5;
    }

    public void LJIIL(int i, int i2, int i3, Object obj, Object obj2) {
        LJIJJ()[i] = (i2 & (~i3)) | 0;
        LJIJJLI()[i] = obj;
        LJIL()[i] = obj2;
    }
}
