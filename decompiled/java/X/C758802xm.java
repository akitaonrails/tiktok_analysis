package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02xm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C758802xm {
    public final Integer LIZ;
    public final Integer LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C758802xm)) {
            return false;
        }
        C758802xm c758802xm = (C758802xm) obj;
        return Intrinsics.LJFF(this.LIZ, c758802xm.LIZ) && Intrinsics.LJFF(this.LIZIZ, c758802xm.LIZIZ) && this.LIZJ == c758802xm.LIZJ;
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LIZIZ;
        return ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ParsedTuxIcon(iconAttr=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", colorAttr=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", rtl=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C758802xm(Integer num, Integer num2, boolean z) {
        this.LIZ = num;
        this.LIZIZ = num2;
        this.LIZJ = z;
    }
}
