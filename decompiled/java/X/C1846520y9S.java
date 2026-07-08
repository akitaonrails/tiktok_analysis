package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: X.0y9S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1846520y9S implements Iterable<Integer>, C03W4 {
    public static final C1846510y9R LLILZ;
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0y9R] */
    static {
        final DefaultConstructorMarker defaultConstructorMarker = null;
        LLILZ = new Object(defaultConstructorMarker) { // from class: X.0y9R
        };
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
    public final C531650Kt9 iterator() {
        return new C531650Kt9(this.LL, this.LLILLJJLI, this.LLILLL);
    }

    public boolean isEmpty() {
        return this.LLILLL > 0 ? this.LL > this.LLILLJJLI : this.LL < this.LLILLJJLI;
    }

    public String toString() {
        StringBuilder sbLIZ;
        int i;
        if (this.LLILLL > 0) {
            sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LL);
            sbLIZ.append("..");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append(" step ");
            i = this.LLILLL;
        } else {
            sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LL);
            sbLIZ.append(" downTo ");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append(" step ");
            i = -this.LLILLL;
        }
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.LL * 31) + this.LLILLJJLI) * 31) + this.LLILLL;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1846520y9S) {
            if (!isEmpty() || !((C1846520y9S) obj).isEmpty()) {
                C1846520y9S c1846520y9S = (C1846520y9S) obj;
                if (this.LL == c1846520y9S.LL && this.LLILLJJLI == c1846520y9S.LLILLJJLI && this.LLILLL == c1846520y9S.LLILLL) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public C1846520y9S(int i, int i2, int i3) {
        if (i3 != 0) {
            if (i3 != Integer.MIN_VALUE) {
                this.LL = i;
                this.LLILLJJLI = C0GYY.LIZ(i, i2, i3);
                this.LLILLL = i3;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }
}
