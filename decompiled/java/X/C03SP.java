package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03SP, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03SP {
    public final Boolean LIZ;
    public final C876803bi LIZIZ;

    public C03SP() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C03SP)) {
            return false;
        }
        C03SP c03sp = (C03SP) obj;
        return Intrinsics.LJFF(this.LIZ, c03sp.LIZ) && Intrinsics.LJFF(this.LIZIZ, c03sp.LIZIZ);
    }

    public final int hashCode() {
        Boolean bool = this.LIZ;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        C876803bi c876803bi = this.LIZIZ;
        return iHashCode + (c876803bi != null ? c876803bi.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BackupPaymentState(checkedState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", agreementData=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C03SP(Boolean bool, C876803bi c876803bi) {
        this.LIZ = bool;
        this.LIZIZ = c876803bi;
    }
}
