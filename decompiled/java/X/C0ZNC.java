package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZNC, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZNC implements InterfaceC898720ZNm {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZNC)) {
            return false;
        }
        C0ZNC c0znc = (C0ZNC) obj;
        return Intrinsics.LJFF(this.LIZ, c0znc.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0znc.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BusinessCardUnavailable(reason=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZNC(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
