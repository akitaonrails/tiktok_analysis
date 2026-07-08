package androidx.compose.ui.graphics;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1680490tpf;
import X.C20052513d5;
import X.C2188811AlT;
import X.InterfaceC1679550to9;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p2.j1;

/* JADX INFO: loaded from: classes26.dex */
public final class BlockGraphicsLayerElement extends AbstractC1685820tyG<C1680490tpf> {
    public final Function1<InterfaceC1679550to9, Unit> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && Intrinsics.LJFF(this.LIZIZ, ((BlockGraphicsLayerElement) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BlockGraphicsLayerElement(block=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1680490tpf(this.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BlockGraphicsLayerElement(Function1<? super InterfaceC1679550to9, Unit> function1) {
        this.LIZIZ = function1;
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C1680490tpf c1680490tpf = (C1680490tpf) abstractC20055413dY;
        c1680490tpf.LLJJ = this.LIZIZ;
        j1 j1Var = C20052513d5.LIZLLL(c1680490tpf, 2).LLJJI;
        if (j1Var != null) {
            j1Var.LLJJ(c1680490tpf.LLJJ, true);
        }
    }
}
