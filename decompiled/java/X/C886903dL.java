package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03dL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C886903dL {
    public final EnumC887103dN LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C886903dL)) {
            return false;
        }
        C886903dL c886903dL = (C886903dL) obj;
        return this.LIZ == c886903dL.LIZ && Intrinsics.LJFF(this.LIZIZ, c886903dL.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c886903dL.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CCDCFillCVVResult(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorAction=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C886903dL(EnumC887103dN enumC887103dN, String str, String str2) {
        this.LIZ = enumC887103dN;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
