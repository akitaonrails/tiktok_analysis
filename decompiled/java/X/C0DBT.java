package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DBT, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DBT {
    public final C0DA3 LIZ;
    public final Long LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0DBT)) {
            return false;
        }
        C0DBT c0dbt = (C0DBT) obj;
        return this.LIZ == c0dbt.LIZ && Intrinsics.LJFF(this.LIZIZ, c0dbt.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0dbt.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Long l = this.LIZIZ;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.LIZJ;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutLoadingHudState(key=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cancelableAfterMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", merchantName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DBT(C0DA3 c0da3, Long l, String str) {
        this.LIZ = c0da3;
        this.LIZIZ = l;
        this.LIZJ = str;
    }
}
