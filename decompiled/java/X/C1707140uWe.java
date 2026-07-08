package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uWe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1707140uWe {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Map<String, String> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1707140uWe)) {
            return false;
        }
        C1707140uWe c1707140uWe = (C1707140uWe) obj;
        return Intrinsics.LJFF(this.LIZ, c1707140uWe.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1707140uWe.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1707140uWe.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1707140uWe.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PostPaymentAction(action=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", actionUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", materialContent=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1707140uWe(String str, String str2, String str3, Map<String, String> map) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = map;
    }
}
