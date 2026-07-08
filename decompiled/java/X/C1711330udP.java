package X;

import com.ss.android.ugc.aweme.pipo.cashier.refund.api.model.RefundCashierBasicInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0udP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1711330udP {
    public final RefundCashierBasicInfo LIZ;
    public final EnumC1711310udN LIZIZ;
    public final EnumC1709240ua2 LIZJ;
    public final String LIZLLL;
    public final Function1<C1711280udK, Unit> LJ;
    public final Function1<AbstractC1711120ud4, Unit> LJFF;
    public final Function1<String, Unit> LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1711330udP)) {
            return false;
        }
        C1711330udP c1711330udP = (C1711330udP) obj;
        return Intrinsics.LJFF(this.LIZ, c1711330udP.LIZ) && this.LIZIZ == c1711330udP.LIZIZ && this.LIZJ == c1711330udP.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1711330udP.LIZLLL) && Intrinsics.LJFF(this.LJ, c1711330udP.LJ) && Intrinsics.LJFF(this.LJFF, c1711330udP.LJFF) && Intrinsics.LJFF(this.LJI, c1711330udP.LJI);
    }

    public final int hashCode() {
        return (((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RefundCashierRenderContext(basicInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", uiMode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", theme=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", refundRequestId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", onSelectionChanged=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", onActionStateChanged=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", onLinkActionWillOpen=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1711330udP(RefundCashierBasicInfo refundCashierBasicInfo, EnumC1711310udN enumC1711310udN, EnumC1709240ua2 enumC1709240ua2, String str, AwS605S0100000_26 awS605S0100000_26, AwS605S0100000_26 awS605S0100000_262, AwS605S0100000_26 awS605S0100000_263) {
        this.LIZ = refundCashierBasicInfo;
        this.LIZIZ = enumC1711310udN;
        this.LIZJ = enumC1709240ua2;
        this.LIZLLL = str;
        this.LJ = awS605S0100000_26;
        this.LJFF = awS605S0100000_262;
        this.LJI = awS605S0100000_263;
    }
}
