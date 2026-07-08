package X;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: X.12rb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19887712rb extends AbstractC19887112rV implements RandomAccess, InterfaceC19887912rd {
    public static final int[] LLILZ;
    public static final C19887712rb LLILZIL;
    public int[] LLILLJJLI;
    public int LLILLL;

    static {
        int[] iArr = new int[0];
        LLILZ = iArr;
        LLILZIL = new C19887712rb(iArr, 0, false);
    }

    @Override // X.AbstractC19887112rV, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.LLILLL; i2++) {
            i = (i * 31) + this.LLILLJJLI[i2];
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LLILLL;
    }

    public C19887712rb() {
        this(LLILZ, 0, true);
    }

    public final int LIZJ(int i) {
        LJFF(i);
        return this.LLILLJJLI[i];
    }

    public final void LJ(int i) {
        zza();
        int i2 = this.LLILLL;
        int length = this.LLILLJJLI.length;
        if (i2 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.LLILLJJLI, 0, iArr, 0, this.LLILLL);
            this.LLILLJJLI = iArr;
        }
        int[] iArr2 = this.LLILLJJLI;
        int i3 = this.LLILLL;
        this.LLILLL = i3 + 1;
        iArr2[i3] = i;
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
        int[] iArrCopyOf;
        if (i >= this.LLILLL) {
            if (i == 0) {
                iArrCopyOf = LLILZ;
            } else {
                iArrCopyOf = Arrays.copyOf(this.LLILLJJLI, i);
            }
            return new C19887712rb(iArrCopyOf, this.LLILLL, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        LJ(((Integer) obj).intValue());
        return true;
    }

    @Override // X.AbstractC19887112rV, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = C19856312mX.LIZ;
        collection.getClass();
        if (!(collection instanceof C19887712rb)) {
            return super.addAll(collection);
        }
        C19887712rb c19887712rb = (C19887712rb) collection;
        int i = c19887712rb.LLILLL;
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
            System.arraycopy(c19887712rb.LLILLJJLI, 0, this.LLILLJJLI, this.LLILLL, c19887712rb.LLILLL);
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
        if (!(obj instanceof C19887712rb)) {
            return super.equals(obj);
        }
        C19887712rb c19887712rb = (C19887712rb) obj;
        if (this.LLILLL != c19887712rb.LLILLL) {
            return false;
        }
        int[] iArr = c19887712rb.LLILLJJLI;
        for (int i = 0; i < this.LLILLL; i++) {
            if (this.LLILLJJLI[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        LJFF(i);
        return Integer.valueOf(this.LLILLJJLI[i]);
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

    @Override // X.AbstractC19887112rV, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
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
            int i3 = i + 1;
            int[] iArr = this.LLILLJJLI;
            int length = iArr.length;
            if (i2 < length) {
                System.arraycopy(iArr, i, iArr, i3, i2 - i);
            } else {
                int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
                System.arraycopy(this.LLILLJJLI, 0, iArr2, 0, i);
                System.arraycopy(this.LLILLJJLI, i, iArr2, i3, this.LLILLL - i);
                this.LLILLJJLI = iArr2;
            }
            this.LLILLJJLI[i] = iIntValue;
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
            int[] iArr = this.LLILLJJLI;
            System.arraycopy(iArr, i2, iArr, i, this.LLILLL - i2);
            this.LLILLL -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        zza();
        LJFF(i);
        int[] iArr = this.LLILLJJLI;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    public C19887712rb(int[] iArr, int i, boolean z) {
        super(z);
        this.LLILLJJLI = iArr;
        this.LLILLL = i;
    }
}
