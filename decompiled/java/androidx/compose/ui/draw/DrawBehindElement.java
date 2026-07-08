package androidx.compose.ui.draw;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1680920tqM;
import X.C2188811AlT;
import X.InterfaceC1675870tiD;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class DrawBehindElement extends AbstractC1685820tyG<C1680920tqM> {
    public final Function1<InterfaceC1675870tiD, Unit> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && Intrinsics.LJFF(this.LIZIZ, ((DrawBehindElement) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DrawBehindElement(onDraw=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1680920tqM(this.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DrawBehindElement(Function1<? super InterfaceC1675870tiD, Unit> function1) {
        this.LIZIZ = function1;
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        ((C1680920tqM) abstractC20055413dY).LLJJ = this.LIZIZ;
    }
}
