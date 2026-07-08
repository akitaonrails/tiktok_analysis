package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D5R, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D5R {
    public final String LIZ;
    public final Boolean LIZIZ;
    public final C0D5K LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D5R)) {
            return false;
        }
        C0D5R c0d5r = (C0D5R) obj;
        return Intrinsics.LJFF(this.LIZ, c0d5r.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0d5r.LIZIZ) && this.LIZJ == c0d5r.LIZJ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Boolean bool = this.LIZIZ;
        return ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutFlowContextSnapshot(source=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isLoggedIn=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", lastStep=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0D5R(String str, Boolean bool, C0D5K c0d5k) {
        this.LIZ = str;
        this.LIZIZ = bool;
        this.LIZJ = c0d5k;
    }
}
