package X;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: X.12rT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19886912rT extends AbstractC19886812rS<Double> implements InterfaceC19886612rQ, RandomAccess {
    public double[] LLILLJJLI;
    public int LLILLL;

    @Override // X.AbstractC19886812rS, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iLIZ = 1;
        for (int i = 0; i < this.LLILLL; i++) {
            iLIZ = (iLIZ * 31) + C19856912md.LIZ(Double.doubleToLongBits(this.LLILLJJLI[i]));
        }
        return iLIZ;
    }

    static {
        new C19886912rT(new double[0], 0, false);
    }

    public C19886912rT() {
        this(new double[10], 0, true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LLILLL;
    }

    public final void LIZJ(double d) {
        zza();
        int i = this.LLILLL;
        double[] dArr = this.LLILLJJLI;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.LLILLJJLI = dArr2;
        }
        double[] dArr3 = this.LLILLJJLI;
        int i2 = this.LLILLL;
        this.LLILLL = i2 + 1;
        dArr3[i2] = d;
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
            return new C19886912rT(Arrays.copyOf(this.LLILLJJLI, i), this.LLILLL, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        LIZJ(((Double) obj).doubleValue());
        return true;
    }

    @Override // X.AbstractC19886812rS, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        zza();
        Charset charset = C19856912md.LIZ;
        collection.getClass();
        if (!(collection instanceof C19886912rT)) {
            return super.addAll(collection);
        }
        C19886912rT c19886912rT = (C19886912rT) collection;
        int i = c19886912rT.LLILLL;
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
            System.arraycopy(c19886912rT.LLILLJJLI, 0, this.LLILLJJLI, this.LLILLL, c19886912rT.LLILLL);
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
        if (!(obj instanceof C19886912rT)) {
            return super.equals(obj);
        }
        C19886912rT c19886912rT = (C19886912rT) obj;
        if (this.LLILLL != c19886912rT.LLILLL) {
            return false;
        }
        double[] dArr = c19886912rT.LLILLJJLI;
        for (int i = 0; i < this.LLILLL; i++) {
            if (Double.doubleToLongBits(this.LLILLJJLI[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
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

    @Override // X.AbstractC19886812rS, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
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
            double[] dArr = this.LLILLJJLI;
            if (i2 < dArr.length) {
                System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
            } else {
                double[] dArr2 = new double[((i2 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i);
                System.arraycopy(this.LLILLJJLI, i, dArr2, i + 1, this.LLILLL - i);
                this.LLILLJJLI = dArr2;
            }
            this.LLILLJJLI[i] = dDoubleValue;
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
            double[] dArr = this.LLILLJJLI;
            System.arraycopy(dArr, i2, dArr, i, this.LLILLL - i2);
            this.LLILLL -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        LJ(i);
        double[] dArr = this.LLILLJJLI;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    public C19886912rT(double[] dArr, int i, boolean z) {
        super(z);
        this.LLILLJJLI = dArr;
        this.LLILLL = i;
    }
}
