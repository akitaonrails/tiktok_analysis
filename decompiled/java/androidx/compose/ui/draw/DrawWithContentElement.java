package androidx.compose.ui.draw;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1680930tqN;
import X.C2188811AlT;
import X.InterfaceC1669010tX9;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class DrawWithContentElement extends AbstractC1685820tyG<C1680930tqN> {
    public final Function1<InterfaceC1669010tX9, Unit> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && Intrinsics.LJFF(this.LIZIZ, ((DrawWithContentElement) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DrawWithContentElement(onDraw=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1680930tqN(this.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DrawWithContentElement(Function1<? super InterfaceC1669010tX9, Unit> function1) {
        this.LIZIZ = function1;
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        ((C1680930tqN) abstractC20055413dY).LLJJ = this.LIZIZ;
    }
}
