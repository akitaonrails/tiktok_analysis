package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hgs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C447600Hgs {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final Function0<Unit> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C447600Hgs)) {
            return false;
        }
        C447600Hgs c447600Hgs = (C447600Hgs) obj;
        return this.LIZ == c447600Hgs.LIZ && this.LIZIZ == c447600Hgs.LIZIZ && this.LIZJ == c447600Hgs.LIZJ && this.LIZLLL == c447600Hgs.LIZLLL && Intrinsics.LJFF(this.LJ, c447600Hgs.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChipHit(leftPx=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", topPx=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", rightPx=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", bottomPx=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C447600Hgs(int i, int i2, int i3, int i4, AwS550S0100000_6 awS550S0100000_6) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = awS550S0100000_6;
    }
}
