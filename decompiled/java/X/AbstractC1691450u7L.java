package X;

import java.util.NoSuchElementException;
import kotlin.ranges.IntRange;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0u7L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1691450u7L {
    public int[] LIZ;
    public int LIZIZ;

    public final int LIZIZ() {
        int i = this.LIZIZ;
        if (i == 0) {
            throw new NoSuchElementException("IntList is empty.");
        }
        return this.LIZ[i - 1];
    }

    public final int hashCode() {
        int[] iArr = this.LIZ;
        int i = this.LIZIZ;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3] * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) e3.e);
        int[] iArr = this.LIZ;
        int i = this.LIZIZ;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) e3.f);
                break;
            }
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i3);
            i2++;
        }
        return sb.toString();
    }

    public AbstractC1691450u7L(int i) {
        int[] iArr;
        if (i == 0) {
            iArr = C649500Pdk.LIZ;
        } else {
            iArr = new int[i];
        }
        this.LIZ = iArr;
    }

    public final int LIZ(int i) {
        if (i >= 0 && i < this.LIZIZ) {
            return this.LIZ[i];
        }
        C19968313Az.LIZIZ("Index must be between 0 and size");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC1691450u7L) {
            AbstractC1691450u7L abstractC1691450u7L = (AbstractC1691450u7L) obj;
            int i = abstractC1691450u7L.LIZIZ;
            int i2 = this.LIZIZ;
            if (i == i2) {
                int[] iArr = this.LIZ;
                int[] iArr2 = abstractC1691450u7L.LIZ;
                IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, i2);
                int i3 = intRangeLJIILJJIL.LL;
                int i4 = intRangeLJIILJJIL.LLILLJJLI;
                if (i3 <= i4) {
                    while (iArr[i3] == iArr2[i3]) {
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
