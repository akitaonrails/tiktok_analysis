package androidx.compose.ui.layout;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1679040tnK;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class LayoutIdElement extends AbstractC1685820tyG<C1679040tnK> {
    public final Object LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && Intrinsics.LJFF(this.LIZIZ, ((LayoutIdElement) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LayoutIdElement(layoutId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1679040tnK(this.LIZIZ);
    }

    public LayoutIdElement(Object obj) {
        this.LIZIZ = obj;
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        ((C1679040tnK) abstractC20055413dY).LLJJ = this.LIZIZ;
    }
}
