package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02uM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C737602uM {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C737602uM)) {
            return false;
        }
        C737602uM c737602uM = (C737602uM) obj;
        return this.LIZ == c737602uM.LIZ && Intrinsics.LJFF(this.LIZIZ, c737602uM.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c737602uM.LIZJ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UsAddonOrderTransformParams(source=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", entranceInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", kolId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C737602uM(int i, String str, String str2) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
