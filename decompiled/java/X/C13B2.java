package X;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.13B2, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C13B2<E> {
    public Object[] LIZ;
    public int LIZIZ;

    public final boolean LIZLLL() {
        return this.LIZIZ == 0;
    }

    public final int hashCode() {
        Object[] objArr = this.LIZ;
        int i = this.LIZIZ;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        AwS609S0100000_30 awS609S0100000_30 = new AwS609S0100000_30(this, 135);
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) e3.e);
        Object[] objArr = this.LIZ;
        int i = this.LIZIZ;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) e3.f);
                break;
            }
            Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) awS609S0100000_30.invoke(obj));
            i2++;
        }
        return sb.toString();
    }

    public final E LIZ() {
        if (LIZLLL()) {
            throw new NoSuchElementException("ObjectList is empty.");
        }
        return (E) this.LIZ[0];
    }

    public C13B2(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = C19968213Ay.LIZ;
        } else {
            objArr = new Object[i];
        }
        this.LIZ = objArr;
    }

    public final E LIZIZ(int i) {
        if (i >= 0 && i < this.LIZIZ) {
            return (E) this.LIZ[i];
        }
        LJFF(i);
        throw null;
    }

    public final int LIZJ(E e) {
        int i = 0;
        if (e == null) {
            Object[] objArr = this.LIZ;
            int i2 = this.LIZIZ;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        Object[] objArr2 = this.LIZ;
        int i3 = this.LIZIZ;
        while (i < i3) {
            if (e.equals(objArr2[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int LJ(E e) {
        if (e == null) {
            Object[] objArr = this.LIZ;
            for (int i = this.LIZIZ - 1; -1 < i; i--) {
                if (objArr[i] == null) {
                    return i;
                }
            }
        } else {
            Object[] objArr2 = this.LIZ;
            for (int i2 = this.LIZIZ - 1; -1 < i2; i2--) {
                if (e.equals(objArr2[i2])) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public final void LJFF(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Index ");
        sbLIZ.append(i);
        sbLIZ.append(" must be in 0..");
        sbLIZ.append(this.LIZIZ - 1);
        C19968313Az.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C13B2) {
            C13B2 c13b2 = (C13B2) obj;
            int i = c13b2.LIZIZ;
            int i2 = this.LIZIZ;
            if (i == i2) {
                Object[] objArr = this.LIZ;
                Object[] objArr2 = c13b2.LIZ;
                IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, i2);
                int i3 = intRangeLJIILJJIL.LL;
                int i4 = intRangeLJIILJJIL.LLILLJJLI;
                if (i3 <= i4) {
                    while (Intrinsics.LJFF(objArr[i3], objArr2[i3])) {
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
