package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0aB8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925000aB8 implements Cloneable {
    public long[] LL;
    public long[] LLILLJJLI;
    public int LLILLL;

    public final String toString() {
        int i = this.LLILLL;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.LLILLL; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            long[] jArr = this.LL;
            long j = -1;
            sb.append(jArr != null ? jArr[i2] : -1L);
            sb.append('=');
            long[] jArr2 = this.LLILLJJLI;
            if (jArr2 != null) {
                j = jArr2[i2];
            }
            sb.append(j);
        }
        sb.append('}');
        return sb.toString();
    }

    public C925000aB8() {
        int i;
        int i2 = 4;
        while (true) {
            i = 80;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (80 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 8;
        this.LL = new long[i4];
        this.LLILLJJLI = new long[i4];
        this.LLILLL = 0;
    }

    public final Object clone() {
        C925000aB8 c925000aB8;
        try {
            c925000aB8 = (C925000aB8) super.clone();
            try {
                long[] jArr = this.LL;
                c925000aB8.LL = jArr != null ? (long[]) jArr.clone() : new long[0];
                long[] jArr2 = this.LLILLJJLI;
                c925000aB8.LLILLJJLI = jArr2 != null ? (long[]) jArr2.clone() : new long[0];
                return c925000aB8;
            } catch (CloneNotSupportedException e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
                return c925000aB8;
            }
        } catch (CloneNotSupportedException e2) {
            e = e2;
            c925000aB8 = null;
        }
    }

    public final void LIZ(int i) {
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            } else {
                i3++;
                if (i3 >= 32) {
                    break;
                }
            }
        }
        int i5 = i2 / 8;
        long[] jArr = new long[i5];
        long[] jArr2 = new long[i5];
        long[] jArr3 = this.LL;
        System.arraycopy(jArr3, 0, jArr, 0, jArr3.length);
        long[] jArr4 = this.LLILLJJLI;
        System.arraycopy(jArr4, 0, jArr2, 0, jArr4.length);
        this.LL = jArr;
        this.LLILLJJLI = jArr2;
    }

    public final void LIZIZ(long j, long j2) {
        if (this.LLILLJJLI == null) {
            return;
        }
        int iBinarySearch = Arrays.binarySearch(this.LL, 0, this.LLILLL, j);
        if (iBinarySearch >= 0) {
            this.LLILLJJLI[iBinarySearch] = j2;
            return;
        }
        int i = ~iBinarySearch;
        int i2 = this.LLILLL;
        if (i2 >= this.LL.length) {
            LIZ(i2 + 1);
        }
        int i3 = this.LLILLL;
        if (i3 - i != 0) {
            long[] jArr = this.LL;
            int i4 = i + 1;
            System.arraycopy(jArr, i, jArr, i4, i3 - i);
            long[] jArr2 = this.LLILLJJLI;
            System.arraycopy(jArr2, i, jArr2, i4, this.LLILLL - i);
        }
        this.LL[i] = j;
        this.LLILLJJLI[i] = j2;
        this.LLILLL++;
    }
}
