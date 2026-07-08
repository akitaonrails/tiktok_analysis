package X;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: X.12rZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19887512rZ extends AbstractC19887112rV implements RandomAccess {
    public static final double[] LLILZ;
    public double[] LLILLJJLI;
    public int LLILLL;

    static {
        double[] dArr = new double[0];
        LLILZ = dArr;
        new C19887512rZ(dArr, 0, false);
    }

    @Override // X.AbstractC19887112rV, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.LLILLL; i2++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.LLILLJJLI[i2]);
            Charset charset = C19856312mX.LIZ;
            i = (i * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LLILLL;
    }

    public C19887512rZ() {
        this(LLILZ, 0, true);
    }

    public final void LIZJ(double d) {
        zza();
        int i = this.LLILLL;
        int length = this.LLILLJJLI.length;
        if (i == length) {
            double[] dArr = new double[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.LLILLJJLI, 0, dArr, 0, this.LLILLL);
            this.LLILLJJLI = dArr;
        }
        double[] dArr2 = this.LLILLJJLI;
        int i2 = this.LLILLL;
        this.LLILLL = i2 + 1;
        dArr2[i2] = d;
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
        double[] dArrCopyOf;
        if (i >= this.LLILLL) {
            if (i == 0) {
                dArrCopyOf = LLILZ;
            } else {
                dArrCopyOf = Arrays.copyOf(this.LLILLJJLI, i);
            }
            return new C19887512rZ(dArrCopyOf, this.LLILLL, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        LIZJ(((Double) obj).doubleValue());
        return true;
    }

    @Override // X.AbstractC19887112rV, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = C19856312mX.LIZ;
        collection.getClass();
        if (!(collection instanceof C19887512rZ)) {
            return super.addAll(collection);
        }
        C19887512rZ c19887512rZ = (C19887512rZ) collection;
        int i = c19887512rZ.LLILLL;
        if (i == 0) {
            return false;
        }
        int i2 = this.LLILLL;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.LLILLJJLI;
            if (i3 > dArr.length) {
                this.LLILLJJLI = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(c19887512rZ.LLILLJJLI, 0, this.LLILLJJLI, this.LLILLL, c19887512rZ.LLILLL);
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
        if (!(obj instanceof C19887512rZ)) {
            return super.equals(obj);
        }
        C19887512rZ c19887512rZ = (C19887512rZ) obj;
        if (this.LLILLL != c19887512rZ.LLILLL) {
            return false;
        }
        double[] dArr = c19887512rZ.LLILLJJLI;
        for (int i = 0; i < this.LLILLL; i++) {
            if (Double.doubleToLongBits(this.LLILLJJLI[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        LJ(i);
        return Double.valueOf(this.LLILLJJLI[i]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i = this.LLILLL;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.LLILLJJLI[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // X.AbstractC19887112rV, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        LJ(i);
        double[] dArr = this.LLILLJJLI;
        double d = dArr[i];
        if (i < this.LLILLL - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r2 - i) - 1);
        }
        this.LLILLL--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        if (i >= 0 && i <= (i2 = this.LLILLL)) {
            int i3 = i + 1;
            double[] dArr = this.LLILLJJLI;
            int length = dArr.length;
            if (i2 < length) {
                System.arraycopy(dArr, i, dArr, i3, i2 - i);
            } else {
                double[] dArr2 = new double[Math.max(((length * 3) / 2) + 1, 10)];
                System.arraycopy(this.LLILLJJLI, 0, dArr2, 0, i);
                System.arraycopy(this.LLILLJJLI, i, dArr2, i3, this.LLILLL - i);
                this.LLILLJJLI = dArr2;
            }
            this.LLILLJJLI[i] = dDoubleValue;
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
            double[] dArr = this.LLILLJJLI;
            System.arraycopy(dArr, i2, dArr, i, this.LLILLL - i2);
            this.LLILLL -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        LJ(i);
        double[] dArr = this.LLILLJJLI;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    public C19887512rZ(double[] dArr, int i, boolean z) {
        super(z);
        this.LLILLJJLI = dArr;
        this.LLILLL = i;
    }
}
