package X;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: X.12rR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19886712rR extends AbstractC19886812rS<Boolean> implements InterfaceC19886612rQ, RandomAccess {
    public boolean[] LLILLJJLI;
    public int LLILLL;

    @Override // X.AbstractC19886812rS, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.LLILLL; i2++) {
            int i3 = i * 31;
            boolean z = this.LLILLJJLI[i2];
            Charset charset = C19856912md.LIZ;
            i = i3 + (z ? 1231 : 1237);
        }
        return i;
    }

    static {
        new C19886712rR(new boolean[0], 0, false);
    }

    public C19886712rR() {
        this(new boolean[10], 0, true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LLILLL;
    }

    public final void LIZJ(boolean z) {
        zza();
        int i = this.LLILLL;
        boolean[] zArr = this.LLILLJJLI;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.LLILLJJLI = zArr2;
        }
        boolean[] zArr3 = this.LLILLJJLI;
        int i2 = this.LLILLL;
        this.LLILLL = i2 + 1;
        zArr3[i2] = z;
    }

    public final void LJ(int i) {
        if (i >= 0 && i < this.LLILLL) {
            return;
        }
        throw new IndexOutOfBoundsException("Index:" + i + ", Size:" + this.LLILLL);
    }

    @Override // X.InterfaceC19875012pY
    public final /* synthetic */ InterfaceC19875012pY LJII(int i) {
        if (i >= this.LLILLL) {
            return new C19886712rR(Arrays.copyOf(this.LLILLJJLI, i), this.LLILLL, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        LIZJ(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // X.AbstractC19886812rS, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        zza();
        Charset charset = C19856912md.LIZ;
        collection.getClass();
        if (!(collection instanceof C19886712rR)) {
            return super.addAll(collection);
        }
        C19886712rR c19886712rR = (C19886712rR) collection;
        int i = c19886712rR.LLILLL;
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
            System.arraycopy(c19886712rR.LLILLJJLI, 0, this.LLILLJJLI, this.LLILLL, c19886712rR.LLILLL);
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
        if (!(obj instanceof C19886712rR)) {
            return super.equals(obj);
        }
        C19886712rR c19886712rR = (C19886712rR) obj;
        if (this.LLILLL != c19886712rR.LLILLL) {
            return false;
        }
        boolean[] zArr = c19886712rR.LLILLJJLI;
        for (int i = 0; i < this.LLILLL; i++) {
            if (this.LLILLJJLI[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
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

    @Override // X.AbstractC19886812rS, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
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
            boolean[] zArr = this.LLILLJJLI;
            if (i2 < zArr.length) {
                System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
            } else {
                boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i);
                System.arraycopy(this.LLILLJJLI, i, zArr2, i + 1, this.LLILLL - i);
                this.LLILLJJLI = zArr2;
            }
            this.LLILLJJLI[i] = zBooleanValue;
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
            boolean[] zArr = this.LLILLJJLI;
            System.arraycopy(zArr, i2, zArr, i, this.LLILLL - i2);
            this.LLILLL -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        LJ(i);
        boolean[] zArr = this.LLILLJJLI;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    public C19886712rR(boolean[] zArr, int i, boolean z) {
        super(z);
        this.LLILLJJLI = zArr;
        this.LLILLL = i;
    }
}
