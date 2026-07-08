package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ETF, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ETF {
    public final Function0<Unit> LIZ;
    public final Function1<View, Unit> LIZIZ;
    public final Function1<Integer, Unit> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ETF)) {
            return false;
        }
        C0ETF c0etf = (C0ETF) obj;
        return Intrinsics.LJFF(this.LIZ, c0etf.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0etf.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0etf.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptionFillerWordHeaderActions(onCloseBtnClicked=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onMenuBtnClicked=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", changeConsoleBarBtnState=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ETF(AwS549S0100000_5 awS549S0100000_5, AwS584S0100000_5 awS584S0100000_5, C0ET0 c0et0) {
        this.LIZ = awS549S0100000_5;
        this.LIZIZ = awS584S0100000_5;
        this.LIZJ = c0et0;
    }
}
