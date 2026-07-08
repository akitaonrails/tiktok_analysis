package X;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: X.0DYW, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public class C0DYW implements Iterable<Long>, C03W4 {
    public static final C0DO2 LLILZ;
    public final long LL;
    public final long LLILLJJLI;
    public final long LLILLL;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0DO2] */
    static {
        final DefaultConstructorMarker defaultConstructorMarker = null;
        LLILZ = new Object(defaultConstructorMarker) { // from class: X.0DO2
        };
    }

    public boolean isEmpty() {
        long j = this.LLILLL;
        long j2 = this.LL;
        long j3 = this.LLILLJJLI;
        return j > 0 ? j2 > j3 : j2 < j3;
    }

    @Override // java.lang.Iterable
    public final Iterator<Long> iterator() {
        return new C1932707hd(this.LL, this.LLILLJJLI, this.LLILLL);
    }

    public String toString() {
        StringBuilder sbLIZ;
        long j;
        if (this.LLILLL > 0) {
            sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LL);
            sbLIZ.append("..");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append(" step ");
            j = this.LLILLL;
        } else {
            sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LL);
            sbLIZ.append(" downTo ");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append(" step ");
            j = -this.LLILLL;
        }
        sbLIZ.append(j);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = 31;
        long j2 = this.LL;
        long j3 = this.LLILLJJLI;
        long j4 = j * (((j2 ^ (j2 >>> 32)) * j) + (j3 ^ (j3 >>> 32)));
        long j5 = this.LLILLL;
        return (int) (j4 + (j5 ^ (j5 >>> 32)));
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0DYW) {
            if (!isEmpty() || !((C0DYW) obj).isEmpty()) {
                C0DYW c0dyw = (C0DYW) obj;
                if (this.LL == c0dyw.LL && this.LLILLJJLI == c0dyw.LLILLJJLI && this.LLILLL == c0dyw.LLILLL) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public C0DYW(long j, long j2, long j3) {
        if (j3 != 0) {
            if (j3 != Long.MIN_VALUE) {
                this.LL = j;
                this.LLILLJJLI = C0GYY.LIZIZ(j, j2, j3);
                this.LLILLL = j3;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }
}
