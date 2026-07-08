package androidx.compose.foundation;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C596220Na0;
import X.InterfaceC595010NVj;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class HoverableElement extends AbstractC1685820tyG<C596220Na0> {
    public final InterfaceC595010NVj LIZIZ;

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C596220Na0(this.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() * 31;
    }

    public HoverableElement(InterfaceC595010NVj interfaceC595010NVj) {
        this.LIZIZ = interfaceC595010NVj;
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C596220Na0 c596220Na0 = (C596220Na0) abstractC20055413dY;
        InterfaceC595010NVj interfaceC595010NVj = this.LIZIZ;
        if (!Intrinsics.LJFF(c596220Na0.LLJJ, interfaceC595010NVj)) {
            c596220Na0.LLJJIII();
            c596220Na0.LLJJ = interfaceC595010NVj;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof HoverableElement) && Intrinsics.LJFF(((HoverableElement) obj).LIZIZ, this.LIZIZ)) {
            return true;
        }
        return false;
    }
}
