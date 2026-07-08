package androidx.compose.ui.layout;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1685340txU;
import X.InterfaceC1692950u9l;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public final class OnGloballyPositionedElement extends AbstractC1685820tyG<C1685340txU> {
    public final Function1<InterfaceC1692950u9l, Unit> LIZIZ;

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1685340txU(this.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnGloballyPositionedElement(Function1<? super InterfaceC1692950u9l, Unit> function1) {
        this.LIZIZ = function1;
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        ((C1685340txU) abstractC20055413dY).LLJJ = this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof OnGloballyPositionedElement) && this.LIZIZ == ((OnGloballyPositionedElement) obj).LIZIZ) {
            return true;
        }
        return false;
    }
}
