package androidx.compose.ui.layout;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1676420tj6;
import X.C1682900ttY;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public final class OnSizeChangedModifier extends AbstractC1685820tyG<C1676420tj6> {
    public final Function1<C1682900ttY, Unit> LIZIZ;

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1676420tj6(this.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnSizeChangedModifier(Function1<? super C1682900ttY, Unit> function1) {
        this.LIZIZ = function1;
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C1676420tj6 c1676420tj6 = (C1676420tj6) abstractC20055413dY;
        c1676420tj6.LLJJ = this.LIZIZ;
        long j = Integer.MIN_VALUE;
        c1676420tj6.LLJJIII = (j & 4294967295L) | (j << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof OnSizeChangedModifier) && this.LIZIZ == ((OnSizeChangedModifier) obj).LIZIZ) {
            return true;
        }
        return false;
    }
}
