package X;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: X.12rm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19888812rm extends AbstractC19887212rW<Long> implements InterfaceC19888912rn, RandomAccess, InterfaceC19888312rh {
    public static final long[] LLILZ;
    public static final C19888812rm LLILZIL;
    public long[] LLILLJJLI;
    public int LLILLL;

    static {
        long[] jArr = new long[0];
        LLILZ = jArr;
        LLILZIL = new C19888812rm(0, false, jArr);
    }

    @Override // X.AbstractC19887212rW, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iLIZJ = 1;
        for (int i = 0; i < this.LLILLL; i++) {
            iLIZJ = (iLIZJ * 31) + C19922012x8.LIZJ(this.LLILLJJLI[i]);
        }
        return iLIZJ;
    }

    public C19888812rm() {
        this(0, true, LLILZ);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LLILLL;
    }

    public final void LJ(long j) {
        LIZJ();
        int i = this.LLILLL;
        long[] jArr = this.LLILLJJLI;
        if (i == jArr.length) {
            long[] jArr2 = new long[Math.max(((jArr.length * 3) / 2) + 1, 10)];
            System.arraycopy(this.LLILLJJLI, 0, jArr2, 0, this.LLILLL);
            this.LLILLJJLI = jArr2;
        }
        long[] jArr3 = this.LLILLJJLI;
        int i2 = this.LLILLL;
        this.LLILLL = i2 + 1;
        jArr3[i2] = j;
    }

    public final void LJFF(int i) {
        if (i >= 0 && i < this.LLILLL) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Index:");
        sbLIZ.append(i);
        sbLIZ.append(", Size:");
        sbLIZ.append(this.LLILLL);
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC19921012wy
    /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
    public final C19888812rm LJIILL2(int i) {
        long[] jArrCopyOf;
        if (i >= this.LLILLL) {
            if (i == 0) {
                jArrCopyOf = LLILZ;
            } else {
                jArrCopyOf = Arrays.copyOf(this.LLILLJJLI, i);
            }
            return new C19888812rm(this.LLILLL, true, jArrCopyOf);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        LJ(((Long) obj).longValue());
        return true;
    }

    @Override // X.AbstractC19887212rW, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        LIZJ();
        Charset charset = C19922012x8.LIZ;
        collection.getClass();
        if (!(collection instanceof C19888812rm)) {
            return super.addAll(collection);
        }
        C19888812rm c19888812rm = (C19888812rm) collection;
        int i = c19888812rm.LLILLL;
        if (i == 0) {
            return false;
        }
        int i2 = this.LLILLL;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.LLILLJJLI;
            if (i3 > jArr.length) {
                this.LLILLJJLI = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(c19888812rm.LLILLJJLI, 0, this.LLILLJJLI, this.LLILLL, c19888812rm.LLILLL);
            this.LLILLL = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC19887212rW, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19888812rm)) {
            return super.equals(obj);
        }
        C19888812rm c19888812rm = (C19888812rm) obj;
        if (this.LLILLL != c19888812rm.LLILLL) {
            return false;
        }
        long[] jArr = c19888812rm.LLILLJJLI;
        for (int i = 0; i < this.LLILLL; i++) {
            if (this.LLILLJJLI[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Long.valueOf(getLong(i));
    }

    public final long getLong(int i) {
        LJFF(i);
        return this.LLILLJJLI[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.LLILLL;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.LLILLJJLI[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // X.AbstractC19887212rW, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        LIZJ();
        LJFF(i);
        long[] jArr = this.LLILLJJLI;
        long j = jArr[i];
        if (i < this.LLILLL - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r2 - i) - 1);
        }
        this.LLILLL--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C19888812rm(C19888812rm c19888812rm, boolean z) {
        long[] jArrCopyOf;
        int i = c19888812rm.LLILLL;
        if (i == 0) {
            jArrCopyOf = LLILZ;
        } else {
            jArrCopyOf = Arrays.copyOf(c19888812rm.LLILLJJLI, i);
        }
        this(c19888812rm.LLILLL, z, jArrCopyOf);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        LIZJ();
        if (i >= 0 && i <= (i2 = this.LLILLL)) {
            long[] jArr = this.LLILLJJLI;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
            } else {
                long[] jArr2 = new long[Math.max(((jArr.length * 3) / 2) + 1, 10)];
                System.arraycopy(this.LLILLJJLI, 0, jArr2, 0, i);
                System.arraycopy(this.LLILLJJLI, i, jArr2, i + 1, this.LLILLL - i);
                this.LLILLJJLI = jArr2;
            }
            this.LLILLJJLI[i] = jLongValue;
            this.LLILLL++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Index:");
        sbLIZ.append(i);
        sbLIZ.append(", Size:");
        sbLIZ.append(this.LLILLL);
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        LIZJ();
        if (i2 >= i) {
            long[] jArr = this.LLILLJJLI;
            System.arraycopy(jArr, i2, jArr, i, this.LLILLL - i2);
            this.LLILLL -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        LIZJ();
        LJFF(i);
        long[] jArr = this.LLILLJJLI;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    public C19888812rm(int i, boolean z, long[] jArr) {
        super(z);
        this.LLILLJJLI = jArr;
        this.LLILLL = i;
    }
}
