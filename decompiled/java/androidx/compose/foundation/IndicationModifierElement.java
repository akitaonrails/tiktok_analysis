package androidx.compose.foundation;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C0NV4;
import X.C1693220uAC;
import X.InterfaceC1691470u7N;
import X.InterfaceC1693230uAD;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class IndicationModifierElement extends AbstractC1685820tyG<C1693220uAC> {
    public final C0NV4 LIZIZ;
    public final InterfaceC1693230uAD LIZJ;

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1693220uAC(this.LIZJ.LIZIZ(this.LIZIZ));
    }

    public final int hashCode() {
        return (this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode();
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C1693220uAC c1693220uAC = (C1693220uAC) abstractC20055413dY;
        InterfaceC1691470u7N interfaceC1691470u7NLIZIZ = this.LIZJ.LIZIZ(this.LIZIZ);
        c1693220uAC.LLJJI(c1693220uAC.LLJJIII);
        c1693220uAC.LLJJIII = interfaceC1691470u7NLIZIZ;
        c1693220uAC.LLJJ(interfaceC1691470u7NLIZIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        if (Intrinsics.LJFF(this.LIZIZ, indicationModifierElement.LIZIZ) && Intrinsics.LJFF(this.LIZJ, indicationModifierElement.LIZJ)) {
            return true;
        }
        return false;
    }

    public IndicationModifierElement(C0NV4 c0nv4, InterfaceC1693230uAD interfaceC1693230uAD) {
        this.LIZIZ = c0nv4;
        this.LIZJ = interfaceC1693230uAD;
    }
}
