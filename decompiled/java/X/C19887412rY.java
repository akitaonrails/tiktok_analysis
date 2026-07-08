package X;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: X.12rY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19887412rY extends AbstractC19887112rV implements RandomAccess {
    public static final long[] LLILZ;
    public long[] LLILLJJLI;
    public int LLILLL;

    static {
        long[] jArr = new long[0];
        LLILZ = jArr;
        new C19887412rY(0, false, jArr);
    }

    @Override // X.AbstractC19887112rV, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.LLILLL; i2++) {
            long j = this.LLILLJJLI[i2];
            Charset charset = C19856312mX.LIZ;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LLILLL;
    }

    public C19887412rY() {
        this(0, true, LLILZ);
    }

    public final long LIZJ(int i) {
        LJFF(i);
        return this.LLILLJJLI[i];
    }

    public final void LJ(long j) {
        zza();
        int i = this.LLILLL;
        int length = this.LLILLJJLI.length;
        if (i == length) {
            long[] jArr = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.LLILLJJLI, 0, jArr, 0, this.LLILLL);
            this.LLILLJJLI = jArr;
        }
        long[] jArr2 = this.LLILLJJLI;
        int i2 = this.LLILLL;
        this.LLILLL = i2 + 1;
        jArr2[i2] = j;
    }

    public final void LJFF(int i) {
        if (i >= 0 && i < this.LLILLL) {
            return;
        }
        int i2 = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Index:");
        sbLIZ.append(i);
        sbLIZ.append(", Size:");
        sbLIZ.append(i2);
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC19911812vU
    public final /* bridge */ /* synthetic */ InterfaceC19911812vU LJIJJ(int i) {
        long[] jArrCopyOf;
        if (i >= this.LLILLL) {
            if (i == 0) {
                jArrCopyOf = LLILZ;
            } else {
                jArrCopyOf = Arrays.copyOf(this.LLILLJJLI, i);
            }
            return new C19887412rY(this.LLILLL, true, jArrCopyOf);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        LJ(((Long) obj).longValue());
        return true;
    }

    @Override // X.AbstractC19887112rV, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = C19856312mX.LIZ;
        collection.getClass();
        if (!(collection instanceof C19887412rY)) {
            return super.addAll(collection);
        }
        C19887412rY c19887412rY = (C19887412rY) collection;
        int i = c19887412rY.LLILLL;
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
            System.arraycopy(c19887412rY.LLILLJJLI, 0, this.LLILLJJLI, this.LLILLL, c19887412rY.LLILLL);
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

    @Override // X.AbstractC19887112rV, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19887412rY)) {
            return super.equals(obj);
        }
        C19887412rY c19887412rY = (C19887412rY) obj;
        if (this.LLILLL != c19887412rY.LLILLL) {
            return false;
        }
        long[] jArr = c19887412rY.LLILLJJLI;
        for (int i = 0; i < this.LLILLL; i++) {
            if (this.LLILLJJLI[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        LJFF(i);
        return Long.valueOf(this.LLILLJJLI[i]);
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

    @Override // X.AbstractC19887112rV, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
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

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        zza();
        if (i >= 0 && i <= (i2 = this.LLILLL)) {
            int i3 = i + 1;
            long[] jArr = this.LLILLJJLI;
            int length = jArr.length;
            if (i2 < length) {
                System.arraycopy(jArr, i, jArr, i3, i2 - i);
            } else {
                long[] jArr2 = new long[Math.max(((length * 3) / 2) + 1, 10)];
                System.arraycopy(this.LLILLJJLI, 0, jArr2, 0, i);
                System.arraycopy(this.LLILLJJLI, i, jArr2, i3, this.LLILLL - i);
                this.LLILLJJLI = jArr2;
            }
            this.LLILLJJLI[i] = jLongValue;
            this.LLILLL++;
            ((AbstractList) this).modCount++;
            return;
        }
        int i4 = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Index:");
        sbLIZ.append(i);
        sbLIZ.append(", Size:");
        sbLIZ.append(i4);
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zza();
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
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        zza();
        LJFF(i);
        long[] jArr = this.LLILLJJLI;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    public C19887412rY(int i, boolean z, long[] jArr) {
        super(z);
        this.LLILLJJLI = jArr;
        this.LLILLL = i;
    }
}
