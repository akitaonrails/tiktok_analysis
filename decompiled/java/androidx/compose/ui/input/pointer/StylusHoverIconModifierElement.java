package androidx.compose.ui.input.pointer;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.AbstractC20074713gf;
import X.C013C;
import X.C1557420qdA;
import X.C1696090uEp;
import X.C20050913cp;
import X.C20075413gm;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1693130uA3;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class StylusHoverIconModifierElement extends AbstractC1685820tyG<C20075413gm> {
    public final InterfaceC1693130uA3 LIZIZ;
    public final boolean LIZJ = false;
    public final C1696090uEp LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StylusHoverIconModifierElement)) {
            return false;
        }
        StylusHoverIconModifierElement stylusHoverIconModifierElement = (StylusHoverIconModifierElement) obj;
        return Intrinsics.LJFF(this.LIZIZ, stylusHoverIconModifierElement.LIZIZ) && this.LIZJ == stylusHoverIconModifierElement.LIZJ && Intrinsics.LJFF(this.LIZLLL, stylusHoverIconModifierElement.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        C1696090uEp c1696090uEp = this.LIZLLL;
        return iHashCode + (c1696090uEp == null ? 0 : c1696090uEp.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StylusHoverIconModifierElement(icon=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", overrideDescendants=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", touchBoundsExpansion=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        final InterfaceC1693130uA3 interfaceC1693130uA3 = this.LIZIZ;
        final boolean z = this.LIZJ;
        final C1696090uEp c1696090uEp = this.LIZLLL;
        return new AbstractC20074713gf(interfaceC1693130uA3, z, c1696090uEp) { // from class: X.13gm
            public final String LLJJIJIIJIL = "androidx.compose.ui.input.pointer.StylusHoverIcon";

            @Override // X.InterfaceC1697480uH4
            public final /* bridge */ /* synthetic */ Object LJJIJLIJ() {
                return this.LLJJIJIIJIL;
            }

            @Override // X.AbstractC20074713gf
            public final void LLJJI(InterfaceC1693130uA3 interfaceC1693130uA32) {
                InterfaceC20077713h9 interfaceC20077713h9 = (InterfaceC20077713h9) C20061513eX.LIZ(this, C20055113dV.LJIJJ);
                if (interfaceC20077713h9 != null) {
                    interfaceC20077713h9.LIZ(interfaceC1693130uA32);
                }
            }

            @Override // X.AbstractC20074713gf
            public final boolean LLJJIII(int i) {
                if (i == 3 || i == 4) {
                    return true;
                }
                return false;
            }
        };
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        AbstractC20074713gf abstractC20074713gf = (AbstractC20074713gf) abstractC20055413dY;
        InterfaceC1693130uA3 interfaceC1693130uA3 = this.LIZIZ;
        if (!Intrinsics.LJFF(abstractC20074713gf.LLJJI, interfaceC1693130uA3)) {
            abstractC20074713gf.LLJJI = interfaceC1693130uA3;
            if (abstractC20074713gf.LLJJIJI) {
                C013C c013c = new C013C();
                c013c.element = true;
                if (!abstractC20074713gf.LLJJIII) {
                    C20050913cp.LIZJ(abstractC20074713gf, new AwS609S0100000_30(c013c, 189));
                }
                if (c013c.element) {
                    abstractC20074713gf.LLJJ();
                }
            }
        }
        abstractC20074713gf.LLJJIJIIJIL(this.LIZJ);
        abstractC20074713gf.LLJJ = this.LIZLLL;
    }

    public StylusHoverIconModifierElement(C1557420qdA c1557420qdA, C1696090uEp c1696090uEp) {
        this.LIZIZ = c1557420qdA;
        this.LIZLLL = c1696090uEp;
    }
}
