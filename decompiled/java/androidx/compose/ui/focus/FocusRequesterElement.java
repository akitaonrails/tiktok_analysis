package androidx.compose.ui.focus;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1682290tsZ;
import X.C20060213eK;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class FocusRequesterElement extends AbstractC1685820tyG<C1682290tsZ> {
    public final C20060213eK LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && Intrinsics.LJFF(this.LIZIZ, ((FocusRequesterElement) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FocusRequesterElement(focusRequester=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1682290tsZ(this.LIZIZ);
    }

    public FocusRequesterElement(C20060213eK c20060213eK) {
        this.LIZIZ = c20060213eK;
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C1682290tsZ c1682290tsZ = (C1682290tsZ) abstractC20055413dY;
        c1682290tsZ.LLJJ.LIZ.LJIIL(c1682290tsZ);
        C20060213eK c20060213eK = this.LIZIZ;
        c1682290tsZ.LLJJ = c20060213eK;
        c20060213eK.LIZ.LIZLLL(c1682290tsZ);
    }
}
