package X;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: X.12qN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19880112qN<E> extends AbstractSet<E> implements Serializable {
    public transient Object LL;
    public transient int[] LLILLJJLI;
    public transient Object[] LLILLL;
    public transient int LLILZ = C19881312qZ.LIZ(3, 1);
    public transient int LLILZIL;

    public final Set<E> LIZJ() {
        Object obj = this.LL;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    public final boolean LJ() {
        return this.LL == null;
    }

    public final Object[] LJFF() {
        Object[] objArr = this.LLILLL;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int[] LJIIIIZZ() {
        int[] iArr = this.LLILLJJLI;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (LJ()) {
            return;
        }
        this.LLILZ += 32;
        Set<E> setLIZJ = LIZJ();
        if (setLIZJ != null) {
            this.LLILZ = C19881312qZ.LIZ(size(), 3);
            setLIZJ.clear();
            this.LL = null;
            this.LLILZIL = 0;
            return;
        }
        Arrays.fill(LJFF(), 0, this.LLILZIL, (Object) null);
        Object obj = this.LL;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(LJIIIIZZ(), 0, this.LLILZIL, 0);
        this.LLILZIL = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        Set<E> setLIZJ = LIZJ();
        return setLIZJ != null ? setLIZJ.iterator() : new Iterator<E>() { // from class: X.12qP
            public int LL;
            public int LLILLJJLI;
            public int LLILLL;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.LLILLJJLI >= 0;
            }

            @Override // java.util.Iterator
            public final E next() {
                if (this.LLILZ.LLILZ != this.LL) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.LLILLJJLI;
                this.LLILLL = i;
                E e = (E) this.LLILZ.LJFF()[i];
                C19880112qN c19880112qN = this.LLILZ;
                int i2 = this.LLILLJJLI + 1;
                if (i2 >= c19880112qN.LLILZIL) {
                    i2 = -1;
                }
                this.LLILLJJLI = i2;
                return e;
            }

            @Override // java.util.Iterator
            public final void remove() {
                if (this.LLILZ.LLILZ != this.LL) {
                    throw new ConcurrentModificationException();
                }
                C19863912nl.LIZJ(this.LLILLL >= 0);
                this.LL += 32;
                C19880112qN c19880112qN = this.LLILZ;
                c19880112qN.remove(c19880112qN.LJFF()[this.LLILLL]);
                C19880112qN c19880112qN2 = this.LLILZ;
                int i = this.LLILLJJLI;
                c19880112qN2.getClass();
                this.LLILLJJLI = i - 1;
                this.LLILLL = -1;
            }

            {
                int i;
                this.LL = this.LLILZ.LLILZ;
                if (this.LLILZ.isEmpty()) {
                    i = -1;
                } else {
                    i = 0;
                }
                this.LLILLJJLI = i;
                this.LLILLL = -1;
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set<E> setLIZJ = LIZJ();
        return setLIZJ != null ? setLIZJ.size() : this.LLILZIL;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        if (LJ()) {
            return new Object[0];
        }
        Set<E> setLIZJ = LIZJ();
        return setLIZJ != null ? setLIZJ.toArray() : Arrays.copyOf(LJFF(), this.LLILZIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i >= 0) {
            C19864312np.LIZLLL("Expected size must be >= 0", true);
            this.LLILZ = C19881312qZ.LIZ(i, 1);
            for (int i2 = 0; i2 < i; i2++) {
                add(objectInputStream.readObject());
            }
            return;
        }
        StringBuilder sb = new StringBuilder(25);
        sb.append("Invalid size: ");
        sb.append(i);
        throw new InvalidObjectException(sb.toString());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it2 = iterator();
        while (it2.hasNext()) {
            objectOutputStream.writeObject(it2.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e) {
        int i;
        int iMin;
        int i2 = 4;
        if (LJ()) {
            C19864312np.LJIILIIL("Arrays already allocated", LJ());
            int i3 = this.LLILZ;
            int iMax = Math.max(i3 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > ((int) (((double) iHighestOneBit) * 1.0d)) && (iHighestOneBit = iHighestOneBit << 1) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.LL = C19880212qO.LIZ(iMax2);
            this.LLILZ = ((32 - Integer.numberOfLeadingZeros(iMax2 - 1)) & 31) | (this.LLILZ & (-32));
            this.LLILLJJLI = new int[i3];
            this.LLILLL = new Object[i3];
        }
        Set<E> setLIZJ = LIZJ();
        if (setLIZJ != null) {
            return setLIZJ.add(e);
        }
        int[] iArrLJIIIIZZ = LJIIIIZZ();
        Object[] objArrLJFF = LJFF();
        int i4 = this.LLILZIL;
        int i5 = i4 + 1;
        int iLIZIZ = C19876812pq.LIZIZ(e);
        int iLJIIIZ = (1 << (this.LLILZ & 31)) - 1;
        int i6 = iLIZIZ & iLJIIIZ;
        Object obj = this.LL;
        Objects.requireNonNull(obj);
        int iLIZJ = C19880212qO.LIZJ(i6, obj);
        boolean z = false;
        if (iLIZJ == 0) {
            if (i5 > iLJIIIZ) {
                if (iLJIIIZ >= 32) {
                    i2 = 2;
                }
                iLJIIIZ = LJIIIZ(iLJIIIZ, i2 * (iLJIIIZ + 1), iLIZIZ, i4);
            } else {
                Object obj2 = this.LL;
                Objects.requireNonNull(obj2);
                C19880212qO.LIZLLL(i6, i5, obj2);
            }
        } else {
            int i7 = ~iLJIIIZ;
            int i8 = iLIZIZ & i7;
            int i9 = 0;
            while (true) {
                int i10 = iLIZJ - 1;
                int i11 = iArrLJIIIIZZ[i10];
                int i12 = i11 & i7;
                if (i12 == i8 && C19837412jU.LIZ(e, objArrLJFF[i10])) {
                    return z;
                }
                int i13 = i11 & iLJIIIZ;
                i9++;
                if (i13 == 0) {
                    if (i9 >= 9) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet(((1 << (this.LLILZ & 31)) - 1) + 1, 1.0f);
                        if (!isEmpty()) {
                            int i14 = 0;
                            do {
                                linkedHashSet.add(LJFF()[i14]);
                                i14++;
                                if (i14 >= this.LLILZIL) {
                                    break;
                                }
                            } while (i14 >= 0);
                        }
                        this.LL = linkedHashSet;
                        this.LLILLJJLI = null;
                        this.LLILLL = null;
                        this.LLILZ += 32;
                        return linkedHashSet.add(e);
                    }
                    if (i5 > iLJIIIZ) {
                        if (iLJIIIZ < 32) {
                            i = 4;
                        } else {
                            i = 2;
                        }
                        iLJIIIZ = LJIIIZ(iLJIIIZ, i * (iLJIIIZ + 1), iLIZIZ, i4);
                    } else {
                        iArrLJIIIIZZ[i10] = (i5 & iLJIIIZ) | i12;
                    }
                } else {
                    iLIZJ = i13;
                    z = false;
                }
            }
        }
        int length = LJIIIIZZ().length;
        if (i5 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.LLILLJJLI = Arrays.copyOf(LJIIIIZZ(), iMin);
            this.LLILLL = Arrays.copyOf(LJFF(), iMin);
        }
        LJIIIIZZ()[i4] = ((~iLJIIIZ) & iLIZIZ) | 0;
        LJFF()[i4] = e;
        this.LLILZIL = i5;
        this.LLILZ += 32;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (LJ()) {
            return false;
        }
        Set<E> setLIZJ = LIZJ();
        if (setLIZJ != null) {
            return setLIZJ.contains(obj);
        }
        int iLIZIZ = C19876812pq.LIZIZ(obj);
        int i = (1 << (this.LLILZ & 31)) - 1;
        Object obj2 = this.LL;
        Objects.requireNonNull(obj2);
        int iLIZJ = C19880212qO.LIZJ(iLIZIZ & i, obj2);
        if (iLIZJ == 0) {
            return false;
        }
        int i2 = ~i;
        int i3 = iLIZIZ & i2;
        do {
            int i4 = iLIZJ - 1;
            int i5 = LJIIIIZZ()[i4];
            if ((i5 & i2) == i3 && C19837412jU.LIZ(obj, LJFF()[i4])) {
                return true;
            }
            iLIZJ = i5 & i;
        } while (iLIZJ != 0);
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        int i2;
        if (LJ()) {
            return false;
        }
        Set<E> setLIZJ = LIZJ();
        if (setLIZJ != null) {
            return setLIZJ.remove(obj);
        }
        int i3 = (1 << (this.LLILZ & 31)) - 1;
        Object obj2 = this.LL;
        Objects.requireNonNull(obj2);
        int iLIZIZ = C19880212qO.LIZIZ(obj, null, i3, obj2, LJIIIIZZ(), LJFF(), null);
        if (iLIZIZ == -1) {
            return false;
        }
        Object obj3 = this.LL;
        Objects.requireNonNull(obj3);
        int[] iArrLJIIIIZZ = LJIIIIZZ();
        Object[] objArrLJFF = LJFF();
        int size = size() - 1;
        if (iLIZIZ < size) {
            Object obj4 = objArrLJFF[size];
            objArrLJFF[iLIZIZ] = obj4;
            objArrLJFF[size] = null;
            iArrLJIIIIZZ[iLIZIZ] = iArrLJIIIIZZ[size];
            iArrLJIIIIZZ[size] = 0;
            int iLIZIZ2 = C19876812pq.LIZIZ(obj4) & i3;
            int iLIZJ = C19880212qO.LIZJ(iLIZIZ2, obj3);
            int i4 = size + 1;
            if (iLIZJ == i4) {
                C19880212qO.LIZLLL(iLIZIZ2, iLIZIZ + 1, obj3);
            } else {
                do {
                    i = iLIZJ - 1;
                    i2 = iArrLJIIIIZZ[i];
                    iLIZJ = i2 & i3;
                } while (iLIZJ != i4);
                iArrLJIIIIZZ[i] = ((iLIZIZ + 1) & i3) | (i2 & (~i3));
            }
        } else {
            objArrLJFF[iLIZIZ] = null;
            iArrLJIIIIZZ[iLIZIZ] = 0;
        }
        this.LLILZIL--;
        this.LLILZ += 32;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        if (LJ()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        Set<E> setLIZJ = LIZJ();
        if (setLIZJ != null) {
            return (T[]) setLIZJ.toArray(tArr);
        }
        Object[] objArrLJFF = LJFF();
        int i = this.LLILZIL;
        C19864312np.LJIIIZ(0, i, objArrLJFF.length);
        if (tArr.length < i) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
        } else if (tArr.length > i) {
            tArr[i] = null;
        }
        System.arraycopy(objArrLJFF, 0, tArr, 0, i);
        return tArr;
    }

    public final int LJIIIZ(int i, int i2, int i3, int i4) {
        Object objLIZ = C19880212qO.LIZ(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            C19880212qO.LIZLLL(i3 & i5, i4 + 1, objLIZ);
        }
        Object obj = this.LL;
        Objects.requireNonNull(obj);
        int[] iArrLJIIIIZZ = LJIIIIZZ();
        for (int i6 = 0; i6 <= i; i6++) {
            int iLIZJ = C19880212qO.LIZJ(i6, obj);
            while (iLIZJ != 0) {
                int i7 = iLIZJ - 1;
                int i8 = iArrLJIIIIZZ[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iLIZJ2 = C19880212qO.LIZJ(i10, objLIZ);
                C19880212qO.LIZLLL(i10, iLIZJ, objLIZ);
                iArrLJIIIIZZ[i7] = ((~i5) & i9) | (iLIZJ2 & i5);
                iLIZJ = i8 & i;
            }
        }
        this.LL = objLIZ;
        this.LLILZ = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.LLILZ & (-32));
        return i5;
    }
}
