package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03Yj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C861903Yj {
    public final C867003a8 LIZ;
    public final Object LIZIZ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C861903Yj)) {
            return false;
        }
        C861903Yj c861903Yj = (C861903Yj) obj;
        return Intrinsics.LJFF(this.LIZ, c861903Yj.LIZ) && Intrinsics.LJFF(this.LIZIZ, c861903Yj.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Object obj = this.LIZIZ;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BackupPaymentEntryVO(entryModel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", refreshToken=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C861903Yj(C867003a8 c867003a8) {
        this.LIZ = c867003a8;
    }
}
