package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mhd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1406430mhd {
    public final boolean LIZ = true;
    public final Integer LIZIZ;
    public final Integer LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1406430mhd)) {
            return false;
        }
        C1406430mhd c1406430mhd = (C1406430mhd) obj;
        return this.LIZ == c1406430mhd.LIZ && Intrinsics.LJFF(this.LIZIZ, c1406430mhd.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1406430mhd.LIZJ);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        Integer num = this.LIZIZ;
        int iHashCode = (iZ2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LIZJ;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PendingPayloadSetup(notifySuccess=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bottomMargin=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", selectIndex=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1406430mhd(Integer num, Integer num2) {
        this.LIZIZ = num;
        this.LIZJ = num2;
    }
}
