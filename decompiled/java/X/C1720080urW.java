package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0urW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1720080urW extends AbstractC2201008jo {
    public final String LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1720080urW)) {
            return false;
        }
        C1720080urW c1720080urW = (C1720080urW) obj;
        return Intrinsics.LJFF(this.LIZ, c1720080urW.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1720080urW.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1720080urW.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1720080urW.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.LIZLLL;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RedirectAction(schema=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", business=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", closePage=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", btm=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1720080urW(String str, String str2, Integer num, String str3) {
        super(0);
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = num;
        this.LIZLLL = str3;
    }
}
