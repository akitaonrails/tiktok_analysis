package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05lX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1447305lX {
    public final Function1<String, Boolean> LIZ;
    public final Function2<String, Boolean, Unit> LIZIZ;
    public final Function1<String, Boolean> LIZJ;
    public final Function2<String, Boolean, Unit> LIZLLL;
    public final Function1<String, Integer> LJ;
    public final Function2<String, Integer, Unit> LJFF;
    public final Function1<String, Boolean> LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1447305lX)) {
            return false;
        }
        C1447305lX c1447305lX = (C1447305lX) obj;
        return Intrinsics.LJFF(this.LIZ, c1447305lX.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1447305lX.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1447305lX.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1447305lX.LIZLLL) && Intrinsics.LJFF(this.LJ, c1447305lX.LJ) && Intrinsics.LJFF(this.LJFF, c1447305lX.LJFF) && Intrinsics.LJFF(this.LJI, c1447305lX.LJI);
    }

    public final int hashCode() {
        return (((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FcpClientModelAccessor(getCanApplySlot=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", setCanApplySlot=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", getCanApplyDisplay=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", setCanApplyDisplay=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", getConsumeTime=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", setConsumeTime=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", getReleasable=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1447305lX(AwS581S0100000_2 awS581S0100000_2, AwS616S0100000_2 awS616S0100000_2, AwS581S0100000_2 awS581S0100000_22, AwS616S0100000_2 awS616S0100000_22, AwS581S0100000_2 awS581S0100000_23, AwS616S0100000_2 awS616S0100000_23, AwS581S0100000_2 awS581S0100000_24) {
        this.LIZ = awS581S0100000_2;
        this.LIZIZ = awS616S0100000_2;
        this.LIZJ = awS581S0100000_22;
        this.LIZLLL = awS616S0100000_22;
        this.LJ = awS581S0100000_23;
        this.LJFF = awS616S0100000_23;
        this.LJI = awS581S0100000_24;
    }
}
