package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uXH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1707530uXH {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1707530uXH)) {
            return false;
        }
        C1707530uXH c1707530uXH = (C1707530uXH) obj;
        return this.LIZ == c1707530uXH.LIZ && this.LIZIZ == c1707530uXH.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1707530uXH.LIZJ);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        String str = this.LIZJ;
        return iZ2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PostPaymentResult(handled=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", success=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1707530uXH(boolean z, boolean z2, String str) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = str;
    }
}
