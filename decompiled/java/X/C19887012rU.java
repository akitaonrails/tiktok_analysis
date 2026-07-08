package X;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: X.12rU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19887012rU extends AbstractC19886812rS<Float> implements InterfaceC19886612rQ, RandomAccess {
    public float[] LLILLJJLI;
    public int LLILLL;

    @Override // X.AbstractC19886812rS, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.LLILLL; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.LLILLJJLI[i]);
        }
        return iFloatToIntBits;
    }

    static {
        new C19887012rU(0, new float[0], false);
    }

    public C19887012rU() {
        this(0, new float[10], true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LLILLL;
    }

    public final void LIZJ(float f) {
        zza();
        int i = this.LLILLL;
        float[] fArr = this.LLILLJJLI;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.LLILLJJLI = fArr2;
        }
        float[] fArr3 = this.LLILLJJLI;
        int i2 = this.LLILLL;
        this.LLILLL = i2 + 1;
        fArr3[i2] = f;
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
            return new C19887012rU(this.LLILLL, Arrays.copyOf(this.LLILLJJLI, i), true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        LIZJ(((Float) obj).floatValue());
        return true;
    }

    @Override // X.AbstractC19886812rS, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        zza();
        Charset charset = C19856912md.LIZ;
        collection.getClass();
        if (!(collection instanceof C19887012rU)) {
            return super.addAll(collection);
        }
        C19887012rU c19887012rU = (C19887012rU) collection;
        int i = c19887012rU.LLILLL;
        if (i == 0) {
            return false;
        }
        int i2 = this.LLILLL;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.LLILLJJLI;
            if (i3 > fArr.length) {
                this.LLILLJJLI = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(c19887012rU.LLILLJJLI, 0, this.LLILLJJLI, this.LLILLL, c19887012rU.LLILLL);
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
        if (!(obj instanceof C19887012rU)) {
            return super.equals(obj);
        }
        C19887012rU c19887012rU = (C19887012rU) obj;
        if (this.LLILLL != c19887012rU.LLILLL) {
            return false;
        }
        float[] fArr = c19887012rU.LLILLJJLI;
        for (int i = 0; i < this.LLILLL; i++) {
            if (Float.floatToIntBits(this.LLILLJJLI[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        LJ(i);
        return Float.valueOf(this.LLILLJJLI[i]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.LLILLL;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.LLILLJJLI[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // X.AbstractC19886812rS, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zza();
        LJ(i);
        float[] fArr = this.LLILLJJLI;
        float f = fArr[i];
        if (i < this.LLILLL - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.LLILLL--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        zza();
        if (i >= 0 && i <= (i2 = this.LLILLL)) {
            float[] fArr = this.LLILLJJLI;
            if (i2 < fArr.length) {
                System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
            } else {
                float[] fArr2 = new float[((i2 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i);
                System.arraycopy(this.LLILLJJLI, i, fArr2, i + 1, this.LLILLL - i);
                this.LLILLJJLI = fArr2;
            }
            this.LLILLJJLI[i] = fFloatValue;
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
            float[] fArr = this.LLILLJJLI;
            System.arraycopy(fArr, i2, fArr, i, this.LLILLL - i2);
            this.LLILLL -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        zza();
        LJ(i);
        float[] fArr = this.LLILLJJLI;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    public C19887012rU(int i, float[] fArr, boolean z) {
        super(z);
        this.LLILLJJLI = fArr;
        this.LLILLL = i;
    }
}
