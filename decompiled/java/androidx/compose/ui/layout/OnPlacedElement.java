package androidx.compose.ui.layout;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1676410tj5;
import X.C2188811AlT;
import X.InterfaceC1692950u9l;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class OnPlacedElement extends AbstractC1685820tyG<C1676410tj5> {
    public final Function1<InterfaceC1692950u9l, Unit> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnPlacedElement) && Intrinsics.LJFF(this.LIZIZ, ((OnPlacedElement) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnPlacedElement(onPlaced=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1676410tj5(this.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnPlacedElement(Function1<? super InterfaceC1692950u9l, Unit> function1) {
        this.LIZIZ = function1;
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        ((C1676410tj5) abstractC20055413dY).LLJJ = this.LIZIZ;
    }
}
