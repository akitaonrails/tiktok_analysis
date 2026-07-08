package androidx.compose.foundation.text.input.internal;

import X.AbstractC1685820tyG;
import X.AbstractC1693180uA8;
import X.AbstractC20055413dY;
import X.C1691080u6k;
import X.C1691930u87;
import X.C1692140u8S;
import X.C1693190uA9;
import X.C1694790uCj;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class LegacyAdaptingPlatformTextInputModifier extends AbstractC1685820tyG<C1693190uA9> {
    public final AbstractC1693180uA8 LIZIZ;
    public final C1691930u87 LIZJ;
    public final C1692140u8S LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return Intrinsics.LJFF(this.LIZIZ, legacyAdaptingPlatformTextInputModifier.LIZIZ) && Intrinsics.LJFF(this.LIZJ, legacyAdaptingPlatformTextInputModifier.LIZJ) && Intrinsics.LJFF(this.LIZLLL, legacyAdaptingPlatformTextInputModifier.LIZLLL);
    }

    public final int hashCode() {
        return (((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LegacyAdaptingPlatformTextInputModifier(serviceAdapter=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", legacyTextFieldState=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", textFieldSelectionManager=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1693190uA9(this.LIZIZ, this.LIZJ, this.LIZLLL);
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C1693190uA9 c1693190uA9 = (C1693190uA9) abstractC20055413dY;
        AbstractC1693180uA8 abstractC1693180uA8 = this.LIZIZ;
        if (c1693190uA9.LLJILLL) {
            ((C1694790uCj) c1693190uA9.LLJJ).LIZ();
            c1693190uA9.LLJJ.LJIIIZ(c1693190uA9);
        }
        c1693190uA9.LLJJ = abstractC1693180uA8;
        if (c1693190uA9.LLJILLL) {
            if (abstractC1693180uA8.LIZ != null) {
                C1691080u6k.LIZJ("Expected textInputModifierNode to be null");
            }
            abstractC1693180uA8.LIZ = c1693190uA9;
        }
        c1693190uA9.LLJJI = this.LIZJ;
        c1693190uA9.LLJJIII = this.LIZLLL;
    }

    public LegacyAdaptingPlatformTextInputModifier(AbstractC1693180uA8 abstractC1693180uA8, C1691930u87 c1691930u87, C1692140u8S c1692140u8S) {
        this.LIZIZ = abstractC1693180uA8;
        this.LIZJ = c1691930u87;
        this.LIZLLL = c1692140u8S;
    }
}
