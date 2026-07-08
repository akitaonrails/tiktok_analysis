package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13DA, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13DA<K, V> implements Map<K, V>, Serializable, InterfaceC2095908Iz {
    public static final C13DG Companion;
    public static final C13DA Empty;
    public int[] LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public C13D9<K> LLILZIL;
    public C13D7<V> LLILZLL;
    public C13D8<K, V> LLIZ;
    public boolean LLIZLLLIL;
    public K[] keysArray;
    public int length;
    public int modCount;
    public int[] presenceArray;
    public V[] valuesArray;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.13DG] */
    static {
        final DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Object(defaultConstructorMarker) { // from class: X.13DG
        };
        C13DA c13da = new C13DA(0);
        c13da.LLIZLLLIL = true;
        Empty = c13da;
    }

    public C13DA() {
        this(8);
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.LLIZLLLIL) {
            return new C13DH(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final V[] allocateValuesArray() {
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) C08EC.LIZ(getCapacity$kotlin_stdlib());
        this.valuesArray = vArr2;
        return vArr2;
    }

    public final void checkIsMutable$kotlin_stdlib() {
        if (this.LLIZLLLIL) {
            throw new UnsupportedOperationException();
        }
    }

    public final C13DC<K, V> entriesIterator$kotlin_stdlib() {
        return new C13DC<>(this);
    }

    public final int getCapacity$kotlin_stdlib() {
        return this.keysArray.length;
    }

    public Set<Map.Entry<K, V>> getEntries() {
        C13D8<K, V> c13d8 = this.LLIZ;
        if (c13d8 != null) {
            return c13d8;
        }
        C13CQ<Map.Entry<K, V>, K, V> c13cq = new C13CQ<Map.Entry<K, V>, K, V>(this) { // from class: X.13D8
            public final C13DA<K, V> LL;

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final void clear() {
                this.LL.clear();
            }

            @Override // X.C13CT
            public final int getSize() {
                return this.LL.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean isEmpty() {
                return this.LL.isEmpty();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, V>> iterator() {
                return this.LL.entriesIterator$kotlin_stdlib();
            }

            {
                this.LL = this;
            }

            @Override // X.C13CQ
            public final boolean LIZJ(Map.Entry<? extends K, ? extends V> entry) {
                return this.LL.containsEntry$kotlin_stdlib(entry);
            }

            @Override // X.C13CQ
            public final boolean LJ(Map.Entry<K, V> entry) {
                return this.LL.removeEntry$kotlin_stdlib(entry);
            }

            @Override // X.C13CT, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean add(Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean containsAll(Collection<?> collection) {
                return this.LL.containsAllEntries$kotlin_stdlib(collection);
            }

            @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean removeAll(Collection<?> collection) {
                this.LL.checkIsMutable$kotlin_stdlib();
                return super.removeAll(collection);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean retainAll(Collection<?> collection) {
                this.LL.checkIsMutable$kotlin_stdlib();
                return super.retainAll(collection);
            }
        };
        this.LLIZ = c13cq;
        return c13cq;
    }

    public Set<K> getKeys() {
        C13D9<K> c13d9 = this.LLILZIL;
        if (c13d9 != null) {
            return c13d9;
        }
        C13D9<K> c13d92 = (C13D9<K>) new C13CT<E>(this) { // from class: X.13D9
            public final C13DA<E, ?> LL;

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final void clear() {
                this.LL.clear();
            }

            @Override // X.C13CT
            public final int getSize() {
                return this.LL.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean isEmpty() {
                return this.LL.isEmpty();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<E> iterator() {
                return this.LL.keysIterator$kotlin_stdlib();
            }

            {
                this.LL = this;
            }

            @Override // X.C13CT, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean add(E e) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean addAll(Collection<? extends E> collection) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                return this.LL.containsKey(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                return this.LL.removeKey$kotlin_stdlib(obj);
            }

            @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean removeAll(Collection<?> collection) {
                this.LL.checkIsMutable$kotlin_stdlib();
                return super.removeAll(collection);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean retainAll(Collection<?> collection) {
                this.LL.checkIsMutable$kotlin_stdlib();
                return super.retainAll(collection);
            }
        };
        this.LLILZIL = c13d92;
        return c13d92;
    }

    public Collection<V> getValues() {
        C13D7<V> c13d7 = this.LLILZLL;
        if (c13d7 != null) {
            return c13d7;
        }
        C139S<V> c139s = new C139S<V>(this) { // from class: X.13D7
            public final C13DA<?, V> LL;

            @Override // X.C139S
            public final int LIZJ() {
                return this.LL.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final void clear() {
                this.LL.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final boolean isEmpty() {
                return this.LL.isEmpty();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            public final Iterator<V> iterator() {
                return this.LL.valuesIterator$kotlin_stdlib();
            }

            {
                this.LL = this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final boolean add(V v) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final boolean addAll(Collection<? extends V> collection) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final boolean contains(Object obj) {
                return this.LL.containsValue(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final boolean remove(Object obj) {
                return this.LL.removeValue$kotlin_stdlib(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final boolean removeAll(Collection<?> collection) {
                this.LL.checkIsMutable$kotlin_stdlib();
                return super.removeAll(collection);
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final boolean retainAll(Collection<?> collection) {
                this.LL.checkIsMutable$kotlin_stdlib();
                return super.retainAll(collection);
            }
        };
        this.LLILZLL = c139s;
        return c139s;
    }

    public final C13DD<K, V> keysIterator$kotlin_stdlib() {
        return new C13DD<>(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        C13DC<K, V> c13dcEntriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i = 0;
        while (c13dcEntriesIterator$kotlin_stdlib.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = c13dcEntriesIterator$kotlin_stdlib.LLILLJJLI;
            C13DA<K, V> c13da = c13dcEntriesIterator$kotlin_stdlib.LL;
            if (i2 >= c13da.length) {
                throw new NoSuchElementException();
            }
            c13dcEntriesIterator$kotlin_stdlib.LLILLJJLI = i2 + 1;
            c13dcEntriesIterator$kotlin_stdlib.LLILLL = i2;
            K k = c13da.keysArray[i2];
            if (k == c13da) {
                sb.append("(this Map)");
            } else {
                sb.append(k);
            }
            sb.append('=');
            C13DA<K, V> c13da2 = c13dcEntriesIterator$kotlin_stdlib.LL;
            V v = c13da2.valuesArray[c13dcEntriesIterator$kotlin_stdlib.LLILLL];
            if (v == c13da2) {
                sb.append("(this Map)");
            } else {
                sb.append(v);
            }
            c13dcEntriesIterator$kotlin_stdlib.LIZIZ();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    public final C13DE<K, V> valuesIterator$kotlin_stdlib() {
        return new C13DE<>(this);
    }

    public final Map<K, V> build() {
        checkIsMutable$kotlin_stdlib();
        this.LLIZLLLIL = true;
        return size() > 0 ? this : Empty;
    }

    @Override // java.util.Map
    public void clear() {
        checkIsMutable$kotlin_stdlib();
        int i = this.length - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.presenceArray;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.LL[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        C08EC.LIZIZ(0, this.length, this.keysArray);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            C08EC.LIZIZ(0, this.length, vArr);
        }
        this.LLILZ = 0;
        this.length = 0;
        this.modCount++;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public int hashCode() {
        C13DC<K, V> c13dcEntriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i = 0;
        while (c13dcEntriesIterator$kotlin_stdlib.hasNext()) {
            int i2 = c13dcEntriesIterator$kotlin_stdlib.LLILLJJLI;
            C13DA<K, V> c13da = c13dcEntriesIterator$kotlin_stdlib.LL;
            if (i2 >= c13da.length) {
                throw new NoSuchElementException();
            }
            c13dcEntriesIterator$kotlin_stdlib.LLILLJJLI = i2 + 1;
            c13dcEntriesIterator$kotlin_stdlib.LLILLL = i2;
            K k = c13da.keysArray[i2];
            int iHashCode = k != null ? k.hashCode() : 0;
            V v = c13dcEntriesIterator$kotlin_stdlib.LL.valuesArray[c13dcEntriesIterator$kotlin_stdlib.LLILLL];
            int iHashCode2 = v != null ? v.hashCode() : 0;
            c13dcEntriesIterator$kotlin_stdlib.LIZIZ();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    public int getSize() {
        return this.LLILZ;
    }

    public final boolean isReadOnly$kotlin_stdlib() {
        return this.LLIZLLLIL;
    }

    public C13DA(int i) {
        K[] kArr = (K[]) C08EC.LIZ(i);
        int[] iArr = new int[i];
        Companion.getClass();
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.keysArray = kArr;
        this.valuesArray = null;
        this.presenceArray = iArr;
        this.LL = new int[iHighestOneBit];
        this.LLILLJJLI = 2;
        this.length = 0;
        this.LLILLL = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    public final void LIZ(boolean z) {
        int i;
        V[] vArr = this.valuesArray;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.length;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.presenceArray;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                K[] kArr = this.keysArray;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.LL[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        C08EC.LIZIZ(i3, i, this.keysArray);
        if (vArr != null) {
            C08EC.LIZIZ(i3, this.length, vArr);
        }
        this.length = i3;
    }

    public final void LIZIZ(int i) {
        V[] vArr;
        int capacity$kotlin_stdlib = getCapacity$kotlin_stdlib();
        int i2 = this.length;
        int i3 = capacity$kotlin_stdlib - i2;
        int size = i2 - size();
        int i4 = 1;
        if (i3 < i && i3 + size >= i && size >= getCapacity$kotlin_stdlib() / 4) {
            LIZ(true);
            return;
        }
        int i5 = this.length + i;
        if (i5 >= 0) {
            if (i5 <= getCapacity$kotlin_stdlib()) {
                return;
            }
            C19973713Db c19973713Db = AbstractC19974313Dh.LL;
            int capacity$kotlin_stdlib2 = getCapacity$kotlin_stdlib();
            c19973713Db.getClass();
            int iLJ = C19973713Db.LJ(capacity$kotlin_stdlib2, i5);
            this.keysArray = (K[]) Arrays.copyOf(this.keysArray, iLJ);
            V[] vArr2 = this.valuesArray;
            if (vArr2 != null) {
                vArr = (V[]) Arrays.copyOf(vArr2, iLJ);
            } else {
                vArr = null;
            }
            this.valuesArray = vArr;
            this.presenceArray = Arrays.copyOf(this.presenceArray, iLJ);
            Companion.getClass();
            if (iLJ >= 1) {
                i4 = iLJ;
            }
            int iHighestOneBit = Integer.highestOneBit(i4 * 3);
            if (iHighestOneBit <= this.LL.length) {
                return;
            }
            LJ(iHighestOneBit);
            return;
        }
        throw new OutOfMemoryError();
    }

    public final int LIZJ(K k) {
        int iLIZLLL = LIZLLL(k);
        int i = this.LLILLJJLI;
        while (true) {
            int i2 = this.LL[iLIZLLL];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (Intrinsics.LJFF(this.keysArray[i3], k)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            int i4 = iLIZLLL - 1;
            if (iLIZLLL == 0) {
                iLIZLLL = this.LL.length - 1;
            } else {
                iLIZLLL = i4;
            }
        }
    }

    public final int LIZLLL(K k) {
        int iHashCode;
        if (k != null) {
            iHashCode = k.hashCode();
        } else {
            iHashCode = 0;
        }
        return (iHashCode * (-1640531527)) >>> this.LLILLL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        r2[r0] = r4;
        r7.presenceArray[r5] = r0;
        r5 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(int r8) {
        /*
            r7 = this;
            int r0 = r7.modCount
            r6 = 1
            int r0 = r0 + 1
            r7.modCount = r0
            int r2 = r7.length
            int r1 = r7.size()
            r0 = 0
            if (r2 <= r1) goto L13
            r7.LIZ(r0)
        L13:
            int[] r0 = new int[r8]
            r7.LL = r0
            X.13DG r0 = X.C13DA.Companion
            r0.getClass()
            int r0 = java.lang.Integer.numberOfLeadingZeros(r8)
            int r0 = r0 + 1
            r7.LLILLL = r0
            r5 = 0
        L25:
            int r0 = r7.length
            if (r5 >= r0) goto L58
            int r4 = r5 + 1
            K[] r0 = r7.keysArray
            r0 = r0[r5]
            int r0 = r7.LIZLLL(r0)
            int r3 = r7.LLILLJJLI
        L35:
            int[] r2 = r7.LL
            r1 = r2[r0]
            if (r1 != 0) goto L43
            r2[r0] = r4
            int[] r1 = r7.presenceArray
            r1[r5] = r0
            r5 = r4
            goto L25
        L43:
            int r3 = r3 + (-1)
            if (r3 >= 0) goto L4f
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r1.<init>(r0)
            throw r1
        L4f:
            int r1 = r0 + (-1)
            if (r0 != 0) goto L56
            int r0 = r2.length
            int r0 = r0 - r6
            goto L35
        L56:
            r0 = r1
            goto L35
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13DA.LJ(int):void");
    }

    public final int addKey$kotlin_stdlib(K k) {
        checkIsMutable$kotlin_stdlib();
        while (true) {
            int iLIZLLL = LIZLLL(k);
            int i = this.LLILLJJLI * 2;
            int length = this.LL.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int i3 = this.LL[iLIZLLL];
                if (i3 <= 0) {
                    if (this.length >= getCapacity$kotlin_stdlib()) {
                        LIZIZ(1);
                    } else {
                        int i4 = this.length;
                        int i5 = i4 + 1;
                        this.length = i5;
                        this.keysArray[i4] = k;
                        this.presenceArray[i4] = iLIZLLL;
                        this.LL[iLIZLLL] = i5;
                        this.LLILZ = size() + 1;
                        this.modCount++;
                        if (i2 > this.LLILLJJLI) {
                            this.LLILLJJLI = i2;
                        }
                        return i4;
                    }
                } else {
                    if (Intrinsics.LJFF(this.keysArray[i3 - 1], k)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        LJ(this.LL.length * 2);
                        break;
                    }
                    int i6 = iLIZLLL - 1;
                    if (iLIZLLL == 0) {
                        iLIZLLL = this.LL.length - 1;
                    } else {
                        iLIZLLL = i6;
                    }
                }
            }
        }
    }

    public final boolean containsAllEntries$kotlin_stdlib(Collection<?> collection) {
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!containsEntry$kotlin_stdlib((Map.Entry) obj)) {
                        return false;
                    }
                } catch (ClassCastException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            return false;
        }
        return true;
    }

    public final boolean containsEntry$kotlin_stdlib(Map.Entry<? extends K, ? extends V> entry) {
        int iLIZJ = LIZJ(entry.getKey());
        if (iLIZJ < 0) {
            return false;
        }
        return Intrinsics.LJFF(this.valuesArray[iLIZJ], entry.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (LIZJ(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        int i = this.length;
        while (true) {
            i--;
            if (i >= 0) {
                if (this.presenceArray[i] >= 0 && Intrinsics.LJFF(this.valuesArray[i], obj)) {
                    return true;
                }
            } else {
                return false;
            }
        }
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (size() != map.size() || !containsAllEntries$kotlin_stdlib(map.entrySet())) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object obj) {
        int iLIZJ = LIZJ(obj);
        if (iLIZJ < 0) {
            return null;
        }
        return this.valuesArray[iLIZJ];
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        checkIsMutable$kotlin_stdlib();
        Set<Map.Entry<? extends K, ? extends V>> setEntrySet = map.entrySet();
        if (!setEntrySet.isEmpty()) {
            LIZIZ(setEntrySet.size());
            for (Map.Entry<? extends K, ? extends V> entry : setEntrySet) {
                int iAddKey$kotlin_stdlib = addKey$kotlin_stdlib(entry.getKey());
                V[] vArrAllocateValuesArray = allocateValuesArray();
                if (iAddKey$kotlin_stdlib >= 0) {
                    vArrAllocateValuesArray[iAddKey$kotlin_stdlib] = entry.getValue();
                } else {
                    int i = (-iAddKey$kotlin_stdlib) - 1;
                    if (!Intrinsics.LJFF(entry.getValue(), vArrAllocateValuesArray[i])) {
                        vArrAllocateValuesArray[i] = entry.getValue();
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V remove(Object obj) {
        checkIsMutable$kotlin_stdlib();
        int iLIZJ = LIZJ(obj);
        if (iLIZJ < 0) {
            return null;
        }
        V v = this.valuesArray[iLIZJ];
        removeEntryAt(iLIZJ);
        return v;
    }

    public final boolean removeEntry$kotlin_stdlib(Map.Entry<? extends K, ? extends V> entry) {
        checkIsMutable$kotlin_stdlib();
        int iLIZJ = LIZJ(entry.getKey());
        if (iLIZJ < 0 || !Intrinsics.LJFF(this.valuesArray[iLIZJ], entry.getValue())) {
            return false;
        }
        removeEntryAt(iLIZJ);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:0: B:9:0x001e->B:33:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void removeEntryAt(int r12) {
        /*
            r11 = this;
            K[] r0 = r11.keysArray
            r1 = 0
            r0[r12] = r1
            V[] r0 = r11.valuesArray
            if (r0 == 0) goto Lb
            r0[r12] = r1
        Lb:
            int[] r0 = r11.presenceArray
            r10 = r0[r12]
            int r0 = r11.LLILLJJLI
            int r5 = r0 * 2
            int[] r0 = r11.LL
            int r0 = r0.length
            int r0 = r0 / 2
            if (r5 <= r0) goto L1b
            r5 = r0
        L1b:
            r9 = 0
            r6 = 0
            r8 = r10
        L1e:
            int r0 = r10 + (-1)
            r7 = -1
            if (r10 != 0) goto L77
            int[] r0 = r11.LL
            int r0 = r0.length
            int r10 = r0 + (-1)
        L28:
            int r6 = r6 + 1
            int r0 = r11.LLILLJJLI
            if (r6 <= r0) goto L45
            int[] r0 = r11.LL
            r0[r8] = r9
        L32:
            int[] r0 = r11.presenceArray
            r0[r12] = r7
            int r0 = r11.size()
            int r0 = r0 + (-1)
            r11.LLILZ = r0
            int r0 = r11.modCount
            int r0 = r0 + 1
            r11.modCount = r0
            return
        L45:
            int[] r0 = r11.LL
            r4 = r0[r10]
            if (r4 != 0) goto L4e
            r0[r8] = r9
            goto L32
        L4e:
            if (r4 >= 0) goto L5d
            r0[r8] = r7
        L52:
            r8 = r10
            r6 = 0
        L54:
            int r5 = r5 + (-1)
            if (r5 >= 0) goto L1e
            int[] r0 = r11.LL
            r0[r8] = r7
            goto L32
        L5d:
            K[] r0 = r11.keysArray
            int r3 = r4 + (-1)
            r0 = r0[r3]
            int r2 = r11.LIZLLL(r0)
            int r2 = r2 - r10
            int[] r1 = r11.LL
            int r0 = r1.length
            int r0 = r0 + (-1)
            r2 = r2 & r0
            if (r2 < r6) goto L54
            r1[r8] = r4
            int[] r0 = r11.presenceArray
            r0[r3] = r8
            goto L52
        L77:
            r10 = r0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13DA.removeEntryAt(int):void");
    }

    public final boolean removeKey$kotlin_stdlib(K k) {
        checkIsMutable$kotlin_stdlib();
        int iLIZJ = LIZJ(k);
        if (iLIZJ < 0) {
            return false;
        }
        removeEntryAt(iLIZJ);
        return true;
    }

    public final boolean removeValue$kotlin_stdlib(V v) {
        checkIsMutable$kotlin_stdlib();
        int i = this.length;
        while (true) {
            i--;
            if (i >= 0) {
                if (this.presenceArray[i] >= 0 && Intrinsics.LJFF(this.valuesArray[i], v)) {
                    removeEntryAt(i);
                    return true;
                }
            } else {
                return false;
            }
        }
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        checkIsMutable$kotlin_stdlib();
        int iAddKey$kotlin_stdlib = addKey$kotlin_stdlib(k);
        V[] vArrAllocateValuesArray = allocateValuesArray();
        if (iAddKey$kotlin_stdlib < 0) {
            int i = (-iAddKey$kotlin_stdlib) - 1;
            V v2 = vArrAllocateValuesArray[i];
            vArrAllocateValuesArray[i] = v;
            return v2;
        }
        vArrAllocateValuesArray[iAddKey$kotlin_stdlib] = v;
        return null;
    }
}
