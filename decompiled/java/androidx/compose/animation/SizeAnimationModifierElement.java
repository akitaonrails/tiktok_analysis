package androidx.compose.animation;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1296870jqv;
import X.C1668040tVa;
import X.C1677630tl3;
import X.C1682900ttY;
import X.C2188811AlT;
import X.InterfaceC1668050tVb;
import X.InterfaceC1675680thu;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class SizeAnimationModifierElement extends AbstractC1685820tyG<C1677630tl3> {
    public final InterfaceC1675680thu<C1682900ttY> LIZIZ;
    public final InterfaceC1668050tVb LIZJ;
    public final Function2<C1682900ttY, C1682900ttY, Unit> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeAnimationModifierElement)) {
            return false;
        }
        SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) obj;
        return Intrinsics.LJFF(this.LIZIZ, sizeAnimationModifierElement.LIZIZ) && Intrinsics.LJFF(this.LIZJ, sizeAnimationModifierElement.LIZJ) && Intrinsics.LJFF(this.LIZLLL, sizeAnimationModifierElement.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31;
        Function2<C1682900ttY, C1682900ttY, Unit> function2 = this.LIZLLL;
        return iHashCode + (function2 == null ? 0 : function2.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SizeAnimationModifierElement(animationSpec=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", alignment=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", finishedListener=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1677630tl3(this.LIZIZ, this.LIZJ, this.LIZLLL);
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C1677630tl3 c1677630tl3 = (C1677630tl3) abstractC20055413dY;
        c1677630tl3.LLJJ = this.LIZIZ;
        c1677630tl3.LLJJIII = this.LIZLLL;
        c1677630tl3.LLJJI = this.LIZJ;
    }

    public SizeAnimationModifierElement(InterfaceC1675680thu interfaceC1675680thu, Function2 function2) {
        C1296870jqv c1296870jqv = C1668040tVa.LIZIZ;
        this.LIZIZ = interfaceC1675680thu;
        this.LIZJ = c1296870jqv;
        this.LIZLLL = function2;
    }
}
