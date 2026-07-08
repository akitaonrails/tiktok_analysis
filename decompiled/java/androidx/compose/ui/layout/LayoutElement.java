package androidx.compose.ui.layout;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1676380tj2;
import X.C1682380tsi;
import X.C2188811AlT;
import X.InterfaceC1631620sYq;
import X.InterfaceC1673370teB;
import X.InterfaceC1689940u4u;
import X.InterfaceC1690350u5Z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class LayoutElement extends AbstractC1685820tyG<C1676380tj2> {
    public final InterfaceC1631620sYq<InterfaceC1689940u4u, InterfaceC1673370teB, C1682380tsi, InterfaceC1690350u5Z> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && Intrinsics.LJFF(this.LIZIZ, ((LayoutElement) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LayoutElement(measure=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1676380tj2(this.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutElement(InterfaceC1631620sYq<? super InterfaceC1689940u4u, ? super InterfaceC1673370teB, ? super C1682380tsi, ? extends InterfaceC1690350u5Z> interfaceC1631620sYq) {
        this.LIZIZ = interfaceC1631620sYq;
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        ((C1676380tj2) abstractC20055413dY).LLJJ = this.LIZIZ;
    }
}
