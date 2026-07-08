package androidx.compose.foundation.layout;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1296880jqw;
import X.C1688030u1p;
import X.InterfaceC1682270tsX;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class VerticalAlignElement extends AbstractC1685820tyG<C1688030u1p> {
    public final InterfaceC1682270tsX LIZIZ;

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1688030u1p(this.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public VerticalAlignElement(C1296880jqw c1296880jqw) {
        this.LIZIZ = c1296880jqw;
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        ((C1688030u1p) abstractC20055413dY).LLJJ = this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        VerticalAlignElement verticalAlignElement;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof VerticalAlignElement) && (verticalAlignElement = (VerticalAlignElement) obj) != null) {
            return Intrinsics.LJFF(this.LIZIZ, verticalAlignElement.LIZIZ);
        }
        return false;
    }
}
