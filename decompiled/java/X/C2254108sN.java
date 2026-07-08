package X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: X.08sN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2254108sN<T> extends AbstractC19974313Dh<T> implements RandomAccess {
    public final Object[] LLILLJJLI;
    public final int LLILLL;
    public int LLILZ;
    public int LLILZIL;

    @Override // X.AbstractC19974313Dh, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new C08QL<T>(this) { // from class: X.08sL
            public int LLILLL;
            public int LLILZ;
            public final /* synthetic */ C2254108sN<T> LLILZIL;

            @Override // X.C08QL
            public final void LIZ() {
                int i = this.LLILLL;
                if (i == 0) {
                    this.LL = 2;
                    return;
                }
                C2254108sN<T> c2254108sN = this.LLILZIL;
                Object[] objArr = c2254108sN.LLILLJJLI;
                int i2 = this.LLILZ;
                this.LLILLJJLI = (T) objArr[i2];
                this.LL = 1;
                this.LLILZ = (i2 + 1) % c2254108sN.LLILLL;
                this.LLILLL = i - 1;
            }

            {
                this.LLILZIL = this;
                this.LLILLL = this.LIZJ();
                this.LLILZ = this.LLILZ;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC2253808sK, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[LIZJ()]);
    }

    @Override // X.AbstractC2253808sK
    public final int LIZJ() {
        return this.LLILZIL;
    }

    public final void LJ(int i) {
        if (i >= 0) {
            if (i <= this.LLILZIL) {
                if (i > 0) {
                    int i2 = this.LLILZ;
                    int i3 = this.LLILLL;
                    int i4 = (i2 + i) % i3;
                    if (i2 > i4) {
                        Arrays.fill(this.LLILLJJLI, i2, i3, (Object) null);
                        Arrays.fill(this.LLILLJJLI, 0, i4, (Object) null);
                    } else {
                        Arrays.fill(this.LLILLJJLI, i2, i4, (Object) null);
                    }
                    this.LLILZ = i4;
                    this.LLILZIL -= i;
                    return;
                }
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("n shouldn't be greater than the buffer size: n = ");
            sbLIZ.append(i);
            sbLIZ.append(", size = ");
            sbLIZ.append(this.LLILZIL);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalArgumentException(strLIZIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("n shouldn't be negative but it is ");
        sbLIZ2.append(i);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        strLIZIZ2.toString();
        throw new IllegalArgumentException(strLIZIZ2);
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final T get(int i) {
        C19973713Db c19973713Db = AbstractC19974313Dh.LL;
        int i2 = this.LLILZIL;
        c19973713Db.getClass();
        C19973713Db.LIZIZ(i, i2);
        return (T) this.LLILLJJLI[(this.LLILZ + i) % this.LLILLL];
    }

    @Override // X.AbstractC2253808sK, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        int length = tArr.length;
        int i = this.LLILZIL;
        if (length < i) {
            tArr = (T[]) Arrays.copyOf(tArr, i);
        }
        int i2 = this.LLILZIL;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = this.LLILZ; i4 < i2 && i5 < this.LLILLL; i5++) {
            tArr[i4] = this.LLILLJJLI[i5];
            i4++;
        }
        while (i4 < i2) {
            tArr[i4] = this.LLILLJJLI[i3];
            i4++;
            i3++;
        }
        if (i2 < tArr.length) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public C2254108sN(int i, Object[] objArr) {
        this.LLILLJJLI = objArr;
        if (i >= 0) {
            if (i <= objArr.length) {
                this.LLILLL = objArr.length;
                this.LLILZIL = i;
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ring buffer filled size: ");
            sbLIZ.append(i);
            sbLIZ.append(" cannot be larger than the buffer size: ");
            sbLIZ.append(objArr.length);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalArgumentException(strLIZIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ring buffer filled size should not be negative but it is ");
        sbLIZ2.append(i);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        strLIZIZ2.toString();
        throw new IllegalArgumentException(strLIZIZ2);
    }
}
