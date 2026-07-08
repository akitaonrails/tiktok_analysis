package X;

import kotlin.ranges.IntRange;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.13BC, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C13BC {
    public long[] LIZ;
    public int LIZIZ;

    public final int hashCode() {
        long[] jArr = this.LIZ;
        int i = this.LIZIZ;
        int iY2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iY2 += C786410Ut5.Y2(jArr[i2]) * 31;
        }
        return iY2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) e3.e);
        long[] jArr = this.LIZ;
        int i = this.LIZIZ;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) e3.f);
                break;
            }
            long j = jArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(j);
            i2++;
        }
        return sb.toString();
    }

    public C13BC(int i) {
        long[] jArr;
        if (i == 0) {
            jArr = C13L8.LIZ;
        } else {
            jArr = new long[i];
        }
        this.LIZ = jArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C13BC) {
            C13BC c13bc = (C13BC) obj;
            int i = c13bc.LIZIZ;
            int i2 = this.LIZIZ;
            if (i == i2) {
                long[] jArr = this.LIZ;
                long[] jArr2 = c13bc.LIZ;
                IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, i2);
                int i3 = intRangeLJIILJJIL.LL;
                int i4 = intRangeLJIILJJIL.LLILLJJLI;
                if (i3 <= i4) {
                    while (jArr[i3] == jArr2[i3]) {
                        if (i3 != i4) {
                            i3++;
                        } else {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
