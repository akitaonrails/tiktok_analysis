package androidx.compose.ui.input.nestedscroll;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C20085913iT;
import X.C20086013iU;
import X.InterfaceC20086513iZ;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class NestedScrollElement extends AbstractC1685820tyG<C20086013iU> {
    public final InterfaceC20086513iZ LIZIZ;
    public final C20085913iT LIZJ;

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C20086013iU(this.LIZIZ, this.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZIZ.hashCode() * 31;
        C20085913iT c20085913iT = this.LIZJ;
        return iHashCode + (c20085913iT != null ? c20085913iT.hashCode() : 0);
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C20086013iU c20086013iU = (C20086013iU) abstractC20055413dY;
        InterfaceC20086513iZ interfaceC20086513iZ = this.LIZIZ;
        C20085913iT c20085913iT = this.LIZJ;
        c20086013iU.LLJJ = interfaceC20086513iZ;
        C20085913iT c20085913iT2 = c20086013iU.LLJJI;
        if (c20085913iT2.LIZ == c20086013iU) {
            c20085913iT2.LIZ = null;
        }
        if (c20085913iT == null) {
            c20086013iU.LLJJI = new C20085913iT();
        } else if (!Intrinsics.LJFF(c20085913iT, c20085913iT2)) {
            c20086013iU.LLJJI = c20085913iT;
        }
        if (c20086013iU.LLJILLL) {
            C20085913iT c20085913iT3 = c20086013iU.LLJJI;
            c20085913iT3.LIZ = c20086013iU;
            c20085913iT3.LIZIZ = null;
            c20086013iU.LLJJIII = null;
            c20085913iT3.LIZJ = new AwS574S0100000_30(c20086013iU, 329);
            c20086013iU.LLJJI.LIZLLL = c20086013iU.LLILLIZIL();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        if (!Intrinsics.LJFF(nestedScrollElement.LIZIZ, this.LIZIZ) || !Intrinsics.LJFF(nestedScrollElement.LIZJ, this.LIZJ)) {
            return false;
        }
        return true;
    }

    public NestedScrollElement(InterfaceC20086513iZ interfaceC20086513iZ, C20085913iT c20085913iT) {
        this.LIZIZ = interfaceC20086513iZ;
        this.LIZJ = c20085913iT;
    }
}
