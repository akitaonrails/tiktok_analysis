package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ens, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1102780ens {
    public final C0KX7 LIZ;
    public final Integer LIZIZ;
    public final Integer LIZJ;

    public C1102780ens() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1102780ens)) {
            return false;
        }
        C1102780ens c1102780ens = (C1102780ens) obj;
        return this.LIZ == c1102780ens.LIZ && Intrinsics.LJFF(this.LIZIZ, c1102780ens.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1102780ens.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Integer num = this.LIZIZ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LIZJ;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ToolbarButtonWidthConfig(mode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", minWidth=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", maxWidth=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1102780ens(int i) {
        this(C0KX7.FIXED, null, null);
    }

    public C1102780ens(C0KX7 c0kx7, Integer num, Integer num2) {
        this.LIZ = c0kx7;
        this.LIZIZ = num;
        this.LIZJ = num2;
    }

    public static C1102780ens LIZ(C1102780ens c1102780ens, C0KX7 c0kx7, Integer num, Integer num2, int i) {
        if ((i & 1) != 0) {
            c0kx7 = c1102780ens.LIZ;
        }
        if ((i & 2) != 0) {
            num = c1102780ens.LIZIZ;
        }
        if ((i & 4) != 0) {
            num2 = c1102780ens.LIZJ;
        }
        return new C1102780ens(c0kx7, num, num2);
    }
}
