package X;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: X.12rO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19886412rO extends AbstractC19886812rS<Integer> implements InterfaceC19785512b7, InterfaceC19886612rQ, RandomAccess {
    public static final C19886412rO LLILZ = new C19886412rO(new int[0], 0, false);
    public int[] LLILLJJLI;
    public int LLILLL;

    @Override // X.AbstractC19886812rS, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.LLILLL; i2++) {
            i = (i * 31) + this.LLILLJJLI[i2];
        }
        return i;
    }

    public C19886412rO() {
        this(new int[10], 0, true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LLILLL;
    }

    public final int LIZJ(int i) {
        LJFF(i);
        return this.LLILLJJLI[i];
    }

    public final void LJ(int i) {
        zza();
        int i2 = this.LLILLL;
        int[] iArr = this.LLILLJJLI;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.LLILLJJLI = iArr2;
        }
        int[] iArr3 = this.LLILLJJLI;
        int i3 = this.LLILLL;
        this.LLILLL = i3 + 1;
        iArr3[i3] = i;
    }

    public final void LJFF(int i) {
        if (i >= 0 && i < this.LLILLL) {
            return;
        }
        throw new IndexOutOfBoundsException("Index:" + i + ", Size:" + this.LLILLL);
    }

    @Override // X.InterfaceC19875012pY
    public final InterfaceC19875012pY<Integer> LJII(int i) {
        if (i >= this.LLILLL) {
            return new C19886412rO(Arrays.copyOf(this.LLILLJJLI, i), this.LLILLL, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        LJ(((Integer) obj).intValue());
        return true;
    }

    @Override // X.AbstractC19886812rS, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        zza();
        Charset charset = C19856912md.LIZ;
        collection.getClass();
        if (!(collection instanceof C19886412rO)) {
            return super.addAll(collection);
        }
        C19886412rO c19886412rO = (C19886412rO) collection;
        int i = c19886412rO.LLILLL;
        if (i == 0) {
            return false;
        }
        int i2 = this.LLILLL;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.LLILLJJLI;
            if (i3 > iArr.length) {
                this.LLILLJJLI = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(c19886412rO.LLILLJJLI, 0, this.LLILLJJLI, this.LLILLL, c19886412rO.LLILLL);
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
        if (!(obj instanceof C19886412rO)) {
            return super.equals(obj);
        }
        C19886412rO c19886412rO = (C19886412rO) obj;
        if (this.LLILLL != c19886412rO.LLILLL) {
            return false;
        }
        int[] iArr = c19886412rO.LLILLJJLI;
        for (int i = 0; i < this.LLILLL; i++) {
            if (this.LLILLJJLI[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(LIZJ(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.LLILLL;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.LLILLJJLI[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // X.AbstractC19886812rS, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zza();
        LJFF(i);
        int[] iArr = this.LLILLJJLI;
        int i2 = iArr[i];
        if (i < this.LLILLL - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.LLILLL--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        zza();
        if (i >= 0 && i <= (i2 = this.LLILLL)) {
            int[] iArr = this.LLILLJJLI;
            if (i2 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
            } else {
                int[] iArr2 = new int[((i2 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.LLILLJJLI, i, iArr2, i + 1, this.LLILLL - i);
                this.LLILLJJLI = iArr2;
            }
            this.LLILLJJLI[i] = iIntValue;
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
            int[] iArr = this.LLILLJJLI;
            System.arraycopy(iArr, i2, iArr, i, this.LLILLL - i2);
            this.LLILLL -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        zza();
        LJFF(i);
        int[] iArr = this.LLILLJJLI;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    public C19886412rO(int[] iArr, int i, boolean z) {
        super(z);
        this.LLILLJJLI = iArr;
        this.LLILLL = i;
    }
}
