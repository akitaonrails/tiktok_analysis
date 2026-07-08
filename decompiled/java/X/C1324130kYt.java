package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0kYt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1324130kYt<C, T, A> implements Cloneable {
    public List<C> LL = new ArrayList();
    public long LLILLJJLI = 0;
    public long[] LLILLL;
    public int LLILZ;
    public final AbstractC1324140kYu<C, T, A> LLILZIL;

    public final Object clone() {
        C1324130kYt c1324130kYt;
        synchronized (this) {
            try {
                c1324130kYt = (C1324130kYt) super.clone();
            } catch (CloneNotSupportedException e) {
                e = e;
                c1324130kYt = null;
            }
            try {
                c1324130kYt.LLILLJJLI = 0L;
                c1324130kYt.LLILLL = null;
                c1324130kYt.LLILZ = 0;
                c1324130kYt.LL = new ArrayList();
                int size = ((ArrayList) this.LL).size();
                for (int i = 0; i < size; i++) {
                    if (!LIZIZ(i)) {
                        ((ArrayList) c1324130kYt.LL).add(ListProtector.get(this.LL, i));
                    }
                }
            } catch (CloneNotSupportedException e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return c1324130kYt;
    }

    public C1324130kYt(AbstractC1324140kYu<C, T, A> abstractC1324140kYu) {
        this.LLILZIL = abstractC1324140kYu;
    }

    public final synchronized void LIZ(C c) {
        if (c != null) {
            int iLastIndexOf = ((ArrayList) this.LL).lastIndexOf(c);
            if (iLastIndexOf < 0 || LIZIZ(iLastIndexOf)) {
                ((ArrayList) this.LL).add(c);
            }
        } else {
            throw new IllegalArgumentException("callback cannot be null");
        }
    }

    public final boolean LIZIZ(int i) {
        int i2;
        if (i < 64) {
            if (((1 << i) & this.LLILLJJLI) != 0) {
                return true;
            }
            return false;
        }
        long[] jArr = this.LLILLL;
        if (jArr == null || (i2 = (i / 64) - 1) >= jArr.length) {
            return false;
        }
        if (((1 << (i % 64)) & jArr[i2]) != 0) {
            return true;
        }
        return false;
    }

    public final synchronized void LJFF(C c) {
        if (this.LLILZ == 0) {
            ((ArrayList) this.LL).remove(c);
        } else {
            int iLastIndexOf = ((ArrayList) this.LL).lastIndexOf(c);
            if (iLastIndexOf >= 0) {
                LJI(iLastIndexOf);
            }
        }
    }

    public final void LJI(int i) {
        if (i < 64) {
            this.LLILLJJLI = (1 << i) | this.LLILLJJLI;
            return;
        }
        int i2 = (i / 64) - 1;
        long[] jArr = this.LLILLL;
        if (jArr == null) {
            this.LLILLL = new long[this.LL.size() / 64];
        } else if (jArr.length <= i2) {
            long[] jArr2 = new long[this.LL.size() / 64];
            long[] jArr3 = this.LLILLL;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.LLILLL = jArr2;
        }
        long[] jArr4 = this.LLILLL;
        jArr4[i2] = (1 << (i % 64)) | jArr4[i2];
    }

    public final synchronized void LIZLLL(int i, Object obj) {
        this.LLILZ++;
        int size = ((ArrayList) this.LL).size();
        long[] jArr = this.LLILLL;
        int length = jArr == null ? -1 : jArr.length - 1;
        LJ(i, length, obj);
        LIZJ(i, (length + 2) * 64, size, 0L, obj);
        int i2 = this.LLILZ - 1;
        this.LLILZ = i2;
        if (i2 == 0) {
            long[] jArr2 = this.LLILLL;
            long j = Long.MIN_VALUE;
            if (jArr2 != null) {
                for (int length2 = jArr2.length - 1; length2 >= 0; length2--) {
                    long j2 = this.LLILLL[length2];
                    if (j2 != 0) {
                        int i3 = (length2 + 1) * 64;
                        long j3 = Long.MIN_VALUE;
                        for (int i4 = (i3 + 64) - 1; i4 >= i3; i4--) {
                            if ((j2 & j3) != 0) {
                                ListProtector.remove(this.LL, i4);
                            }
                            j3 >>>= 1;
                        }
                        this.LLILLL[length2] = 0;
                    }
                }
            }
            long j4 = this.LLILLJJLI;
            if (j4 != 0) {
                int i5 = 63;
                do {
                    if ((j4 & j) != 0) {
                        ListProtector.remove(this.LL, i5);
                    }
                    j >>>= 1;
                    i5--;
                } while (i5 >= 0);
                this.LLILLJJLI = 0L;
            }
        }
    }

    public final void LJ(int i, int i2, Object obj) {
        if (i2 < 0) {
            LIZJ(i, 0, Math.min(64, ((ArrayList) this.LL).size()), this.LLILLJJLI, obj);
            return;
        }
        long j = this.LLILLL[i2];
        int i3 = (i2 + 1) * 64;
        int iMin = Math.min(((ArrayList) this.LL).size(), i3 + 64);
        LJ(i, i2 - 1, obj);
        LIZJ(i, i3, iMin, j, obj);
    }

    public final void LIZJ(int i, int i2, int i3, long j, Object obj) {
        long j2 = 1;
        while (i2 < i3) {
            if ((j & j2) == 0) {
                this.LLILZIL.LIZ(i, ListProtector.get(this.LL, i2), obj);
            }
            j2 <<= 1;
            i2++;
        }
    }
}
