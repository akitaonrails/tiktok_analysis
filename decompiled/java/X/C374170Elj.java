package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Elj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C374170Elj {
    public final Function1<Boolean, Unit> LIZ;
    public final Function1<EnumC373860ElE, Unit> LIZIZ;
    public final Function1<Integer, Unit> LIZJ;
    public final Function1<Integer, Unit> LIZLLL;
    public final Function0<Unit> LJ;
    public final Function0<Unit> LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C374170Elj)) {
            return false;
        }
        C374170Elj c374170Elj = (C374170Elj) obj;
        return Intrinsics.LJFF(this.LIZ, c374170Elj.LIZ) && Intrinsics.LJFF(this.LIZIZ, c374170Elj.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c374170Elj.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c374170Elj.LIZLLL) && Intrinsics.LJFF(this.LJ, c374170Elj.LJ) && Intrinsics.LJFF(this.LJFF, c374170Elj.LJFF);
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CutoutPanelActions(onAutoCutoutClicked=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onPenStyleChanged=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onBrushSizeChanged=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onBrushSizeConfirmed=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", onBottomConfirmClick=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", onBottomResetClick=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C374170Elj(AwS549S0100000_5 awS549S0100000_5, AwS549S0100000_5 awS549S0100000_52, AwS584S0100000_5 awS584S0100000_5, AwS584S0100000_5 awS584S0100000_52, AwS584S0100000_5 awS584S0100000_53, AwS584S0100000_5 awS584S0100000_54) {
        this.LIZ = awS584S0100000_5;
        this.LIZIZ = awS584S0100000_52;
        this.LIZJ = awS584S0100000_53;
        this.LIZLLL = awS584S0100000_54;
        this.LJ = awS549S0100000_5;
        this.LJFF = awS549S0100000_52;
    }
}
