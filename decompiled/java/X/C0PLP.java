package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PLP, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PLP implements InterfaceC655070Pmj {
    public final int LIZ;
    public final int LIZIZ;
    public final Integer LIZJ;
    public final Integer LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0PLP)) {
            return false;
        }
        C0PLP c0plp = (C0PLP) obj;
        return this.LIZ == c0plp.LIZ && this.LIZIZ == c0plp.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0plp.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0plp.LIZLLL);
    }

    public final int hashCode() {
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        Integer num = this.LIZJ;
        int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LIZLLL;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Static(iconRes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", textRes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", iconTintRes=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", textColorRes=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0PLP(int i, int i2, Integer num, Integer num2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = num;
        this.LIZLLL = num2;
    }
}
