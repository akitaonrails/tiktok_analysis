package androidx.compose.foundation.lazy.layout;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C19369710qF;
import X.C20044113bj;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class TraversablePrefetchStateModifierElement extends AbstractC1685820tyG<C19369710qF> {
    public final C20044113bj LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && Intrinsics.LJFF(this.LIZIZ, ((TraversablePrefetchStateModifierElement) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TraversablePrefetchStateModifierElement(prefetchState=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C19369710qF(this.LIZIZ);
    }

    public TraversablePrefetchStateModifierElement(C20044113bj c20044113bj) {
        this.LIZIZ = c20044113bj;
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        ((C19369710qF) abstractC20055413dY).LLJJ = this.LIZIZ;
    }
}
