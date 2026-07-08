package androidx.compose.foundation.layout;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1296860jqu;
import X.C1688010u1n;
import X.InterfaceC1666960tTq;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class HorizontalAlignElement extends AbstractC1685820tyG<C1688010u1n> {
    public final InterfaceC1666960tTq LIZIZ;

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1688010u1n(this.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public HorizontalAlignElement(C1296860jqu c1296860jqu) {
        this.LIZIZ = c1296860jqu;
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        ((C1688010u1n) abstractC20055413dY).LLJJ = this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        HorizontalAlignElement horizontalAlignElement;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof HorizontalAlignElement) && (horizontalAlignElement = (HorizontalAlignElement) obj) != null) {
            return Intrinsics.LJFF(this.LIZIZ, horizontalAlignElement.LIZIZ);
        }
        return false;
    }
}
