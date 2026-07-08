package androidx.compose.foundation;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1697400uGw;
import X.InterfaceC595010NVj;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class FocusableElement extends AbstractC1685820tyG<C1697400uGw> {
    public final InterfaceC595010NVj LIZIZ;

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1697400uGw(this.LIZIZ, 1, null);
    }

    public final int hashCode() {
        InterfaceC595010NVj interfaceC595010NVj = this.LIZIZ;
        if (interfaceC595010NVj != null) {
            return interfaceC595010NVj.hashCode();
        }
        return 0;
    }

    public FocusableElement(InterfaceC595010NVj interfaceC595010NVj) {
        this.LIZIZ = interfaceC595010NVj;
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        ((C1697400uGw) abstractC20055413dY).LLJJIJIL(this.LIZIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FocusableElement) && Intrinsics.LJFF(this.LIZIZ, ((FocusableElement) obj).LIZIZ)) {
            return true;
        }
        return false;
    }
}
