package androidx.compose.foundation.text.input.internal;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1684310tvp;
import X.C1686970u07;
import X.C1691930u87;
import X.C1692140u8S;
import X.C1692280u8g;
import X.C1694250uBr;
import X.C1695020uD6;
import X.C20052513d5;
import X.C20060213eK;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1692600u9C;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class CoreTextFieldSemanticsModifier extends AbstractC1685820tyG<C1694250uBr> {
    public final C1684310tvp LIZIZ;
    public final C1686970u07 LIZJ;
    public final C1691930u87 LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI = false;
    public final InterfaceC1692600u9C LJII;
    public final C1692140u8S LJIIIIZZ;
    public final C1695020uD6 LJIIIZ;
    public final C20060213eK LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreTextFieldSemanticsModifier)) {
            return false;
        }
        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = (CoreTextFieldSemanticsModifier) obj;
        return Intrinsics.LJFF(this.LIZIZ, coreTextFieldSemanticsModifier.LIZIZ) && Intrinsics.LJFF(this.LIZJ, coreTextFieldSemanticsModifier.LIZJ) && Intrinsics.LJFF(this.LIZLLL, coreTextFieldSemanticsModifier.LIZLLL) && this.LJ == coreTextFieldSemanticsModifier.LJ && this.LJFF == coreTextFieldSemanticsModifier.LJFF && this.LJI == coreTextFieldSemanticsModifier.LJI && Intrinsics.LJFF(this.LJII, coreTextFieldSemanticsModifier.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, coreTextFieldSemanticsModifier.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, coreTextFieldSemanticsModifier.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, coreTextFieldSemanticsModifier.LJIIJ);
    }

    public final int hashCode() {
        return (((((((((((((((((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CoreTextFieldSemanticsModifier(transformedText=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", value=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", state=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", readOnly=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", enabled=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isPassword=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", offsetMapping=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", manager=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", imeOptions=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", focusRequester=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1694250uBr(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ);
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        boolean z;
        boolean z2;
        C1694250uBr c1694250uBr = (C1694250uBr) abstractC20055413dY;
        C1684310tvp c1684310tvp = this.LIZIZ;
        C1686970u07 c1686970u07 = this.LIZJ;
        C1691930u87 c1691930u87 = this.LIZLLL;
        boolean z3 = this.LJ;
        boolean z4 = this.LJFF;
        boolean z5 = this.LJI;
        InterfaceC1692600u9C interfaceC1692600u9C = this.LJII;
        C1692140u8S c1692140u8S = this.LJIIIIZZ;
        C1695020uD6 c1695020uD6 = this.LJIIIZ;
        C20060213eK c20060213eK = this.LJIIJ;
        boolean z6 = c1694250uBr.LLJJJ;
        if (z6 && !c1694250uBr.LLJJIJIL) {
            z = true;
        } else {
            z = false;
        }
        boolean z7 = c1694250uBr.LLJJJIL;
        C1695020uD6 c1695020uD62 = c1694250uBr.LLJJJJLIIL;
        C1692140u8S c1692140u8S2 = c1694250uBr.LLJJJJJIL;
        if (z4 && !z3) {
            z2 = true;
        } else {
            z2 = false;
        }
        c1694250uBr.LLJJIII = c1684310tvp;
        c1694250uBr.LLJJIJI = c1686970u07;
        c1694250uBr.LLJJIJIIJIL = c1691930u87;
        c1694250uBr.LLJJIJIL = z3;
        c1694250uBr.LLJJJ = z4;
        c1694250uBr.LLJJJJ = interfaceC1692600u9C;
        c1694250uBr.LLJJJJJIL = c1692140u8S;
        c1694250uBr.LLJJJJLIIL = c1695020uD6;
        c1694250uBr.LLJJL = c20060213eK;
        if (z4 != z6 || z2 != z || !Intrinsics.LJFF(c1695020uD6, c1695020uD62) || z5 != z7 || !C1692280u8g.LIZJ(c1686970u07.LIZIZ)) {
            C20052513d5.LJFF(c1694250uBr).LJJJJIZL();
        }
        if (!Intrinsics.LJFF(c1692140u8S, c1692140u8S2)) {
            c1692140u8S.LJI = new AwS569S0100000_25(c1694250uBr, 1179);
        }
    }

    public CoreTextFieldSemanticsModifier(C1684310tvp c1684310tvp, C1686970u07 c1686970u07, C1691930u87 c1691930u87, boolean z, boolean z2, InterfaceC1692600u9C interfaceC1692600u9C, C1692140u8S c1692140u8S, C1695020uD6 c1695020uD6, C20060213eK c20060213eK) {
        this.LIZIZ = c1684310tvp;
        this.LIZJ = c1686970u07;
        this.LIZLLL = c1691930u87;
        this.LJ = z;
        this.LJFF = z2;
        this.LJII = interfaceC1692600u9C;
        this.LJIIIIZZ = c1692140u8S;
        this.LJIIIZ = c1695020uD6;
        this.LJIIJ = c20060213eK;
    }
}
