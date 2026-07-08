package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qb9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556170qb9 {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1556170qb9)) {
            return false;
        }
        C1556170qb9 c1556170qb9 = (C1556170qb9) obj;
        return Intrinsics.LJFF(this.LIZ, c1556170qb9.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1556170qb9.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PriceDisplay(primaryPrice=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", secondaryPrice=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1556170qb9(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
