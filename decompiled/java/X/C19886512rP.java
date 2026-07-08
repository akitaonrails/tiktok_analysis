package X;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: X.12rP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19886512rP extends AbstractC19886812rS<Long> implements InterfaceC19785612b8, InterfaceC19886612rQ, RandomAccess {
    public static final C19886512rP LLILZ = new C19886512rP(0, false, new long[0]);
    public long[] LLILLJJLI;
    public int LLILLL;

    @Override // X.AbstractC19886812rS, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iLIZ = 1;
        for (int i = 0; i < this.LLILLL; i++) {
            iLIZ = (iLIZ * 31) + C19856912md.LIZ(this.LLILLJJLI[i]);
        }
        return iLIZ;
    }

    public C19886512rP() {
        this(0, true, new long[10]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LLILLL;
    }

    public final void LIZJ(long j) {
        zza();
        int i = this.LLILLL;
        long[] jArr = this.LLILLJJLI;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.LLILLJJLI = jArr2;
        }
        long[] jArr3 = this.LLILLJJLI;
        int i2 = this.LLILLL;
        this.LLILLL = i2 + 1;
        jArr3[i2] = j;
    }

    public final long LJ(int i) {
        LJFF(i);
        return this.LLILLJJLI[i];
    }

    public final void LJFF(int i) {
        if (i >= 0 && i < this.LLILLL) {
            return;
        }
        throw new IndexOutOfBoundsException("Index:" + i + ", Size:" + this.LLILLL);
    }

    @Override // X.InterfaceC19875012pY
    public final InterfaceC19875012pY<Long> LJII(int i) {
        if (i >= this.LLILLL) {
            return new C19886512rP(this.LLILLL, true, Arrays.copyOf(this.LLILLJJLI, i));
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        LIZJ(((Long) obj).longValue());
        return true;
    }

    @Override // X.AbstractC19886812rS, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        zza();
        Charset charset = C19856912md.LIZ;
        collection.getClass();
        if (!(collection instanceof C19886512rP)) {
            return super.addAll(collection);
        }
        C19886512rP c19886512rP = (C19886512rP) collection;
        int i = c19886512rP.LLILLL;
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
            System.arraycopy(c19886512rP.LLILLJJLI, 0, this.LLILLJJLI, this.LLILLL, c19886512rP.LLILLL);
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

    @Override // X.AbstractC19886812rS, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19886512rP)) {
            return super.equals(obj);
        }
        C19886512rP c19886512rP = (C19886512rP) obj;
        if (this.LLILLL != c19886512rP.LLILLL) {
            return false;
        }
        long[] jArr = c19886512rP.LLILLJJLI;
        for (int i = 0; i < this.LLILLL; i++) {
            if (this.LLILLJJLI[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(LJ(i));
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

    @Override // X.AbstractC19886812rS, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
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
            long[] jArr = this.LLILLJJLI;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
            } else {
                long[] jArr2 = new long[((i2 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.LLILLJJLI, i, jArr2, i + 1, this.LLILLL - i);
                this.LLILLJJLI = jArr2;
            }
            this.LLILLJJLI[i] = jLongValue;
            this.LLILLL++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("Index:" + i + ", Size:" + this.LLILLL);
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
    public final /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        zza();
        LJFF(i);
        long[] jArr = this.LLILLJJLI;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    public C19886512rP(int i, boolean z, long[] jArr) {
        super(z);
        this.LLILLJJLI = jArr;
        this.LLILLL = i;
    }
}
