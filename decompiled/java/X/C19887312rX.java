package X;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: X.12rX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19887312rX extends AbstractC19887112rV implements RandomAccess {
    public static final boolean[] LLILZ;
    public boolean[] LLILLJJLI;
    public int LLILLL;

    static {
        boolean[] zArr = new boolean[0];
        LLILZ = zArr;
        new C19887312rX(zArr, 0, false);
    }

    @Override // X.AbstractC19887112rV, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.LLILLL; i2++) {
            int i3 = i * 31;
            boolean z = this.LLILLJJLI[i2];
            Charset charset = C19856312mX.LIZ;
            i = i3 + (z ? 1231 : 1237);
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LLILLL;
    }

    public C19887312rX() {
        this(LLILZ, 0, true);
    }

    public final void LIZJ(boolean z) {
        zza();
        int i = this.LLILLL;
        int length = this.LLILLJJLI.length;
        if (i == length) {
            boolean[] zArr = new boolean[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.LLILLJJLI, 0, zArr, 0, this.LLILLL);
            this.LLILLJJLI = zArr;
        }
        boolean[] zArr2 = this.LLILLJJLI;
        int i2 = this.LLILLL;
        this.LLILLL = i2 + 1;
        zArr2[i2] = z;
    }

    public final void LJ(int i) {
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
        boolean[] zArrCopyOf;
        if (i >= this.LLILLL) {
            if (i == 0) {
                zArrCopyOf = LLILZ;
            } else {
                zArrCopyOf = Arrays.copyOf(this.LLILLJJLI, i);
            }
            return new C19887312rX(zArrCopyOf, this.LLILLL, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        LIZJ(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // X.AbstractC19887112rV, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = C19856312mX.LIZ;
        collection.getClass();
        if (!(collection instanceof C19887312rX)) {
            return super.addAll(collection);
        }
        C19887312rX c19887312rX = (C19887312rX) collection;
        int i = c19887312rX.LLILLL;
        if (i == 0) {
            return false;
        }
        int i2 = this.LLILLL;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.LLILLJJLI;
            if (i3 > zArr.length) {
                this.LLILLJJLI = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(c19887312rX.LLILLJJLI, 0, this.LLILLJJLI, this.LLILLL, c19887312rX.LLILLL);
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
        if (!(obj instanceof C19887312rX)) {
            return super.equals(obj);
        }
        C19887312rX c19887312rX = (C19887312rX) obj;
        if (this.LLILLL != c19887312rX.LLILLL) {
            return false;
        }
        boolean[] zArr = c19887312rX.LLILLJJLI;
        for (int i = 0; i < this.LLILLL; i++) {
            if (this.LLILLJJLI[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        LJ(i);
        return Boolean.valueOf(this.LLILLJJLI[i]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.LLILLL;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.LLILLJJLI[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // X.AbstractC19887112rV, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        LJ(i);
        boolean[] zArr = this.LLILLJJLI;
        boolean z = zArr[i];
        if (i < this.LLILLL - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.LLILLL--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i >= 0 && i <= (i2 = this.LLILLL)) {
            int i3 = i + 1;
            boolean[] zArr = this.LLILLJJLI;
            int length = zArr.length;
            if (i2 < length) {
                System.arraycopy(zArr, i, zArr, i3, i2 - i);
            } else {
                boolean[] zArr2 = new boolean[Math.max(((length * 3) / 2) + 1, 10)];
                System.arraycopy(this.LLILLJJLI, 0, zArr2, 0, i);
                System.arraycopy(this.LLILLJJLI, i, zArr2, i3, this.LLILLL - i);
                this.LLILLJJLI = zArr2;
            }
            this.LLILLJJLI[i] = zBooleanValue;
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
            boolean[] zArr = this.LLILLJJLI;
            System.arraycopy(zArr, i2, zArr, i, this.LLILLL - i2);
            this.LLILLL -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        LJ(i);
        boolean[] zArr = this.LLILLJJLI;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    public C19887312rX(boolean[] zArr, int i, boolean z) {
        super(z);
        this.LLILLJJLI = zArr;
        this.LLILLL = i;
    }
}
