package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OHo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C616900OHo<A, B, C, D> {
    public final A LIZ;
    public final B LIZIZ;
    public final C LIZJ;
    public final D LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C616900OHo)) {
            return false;
        }
        C616900OHo c616900OHo = (C616900OHo) obj;
        return Intrinsics.LJFF(this.LIZ, c616900OHo.LIZ) && Intrinsics.LJFF(this.LIZIZ, c616900OHo.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c616900OHo.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c616900OHo.LIZLLL);
    }

    public final int hashCode() {
        A a = this.LIZ;
        int iHashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.LIZIZ;
        int iHashCode2 = (iHashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (c == null ? 0 : c.hashCode())) * 31;
        D d = this.LIZLLL;
        return iHashCode3 + (d != null ? d.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Tuple4(first=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", second=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", third=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", fourth=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C616900OHo(A a, B b, C c, D d) {
        this.LIZ = a;
        this.LIZIZ = b;
        this.LIZJ = c;
        this.LIZLLL = d;
    }
}
