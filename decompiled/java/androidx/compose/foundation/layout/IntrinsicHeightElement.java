package androidx.compose.foundation.layout;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1676390tj3;
import X.C1684370tvv;
import X.C1688620u2m;
import X.C786410Ut5;
import X.EnumC995470c0n;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public final class IntrinsicHeightElement extends AbstractC1685820tyG<C1676390tj3> {
    public final EnumC995470c0n LIZIZ;
    public final boolean LIZJ = true;
    public final Function1<C1688620u2m, Unit> LIZLLL;

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1676390tj3(this.LIZIZ, this.LIZJ);
    }

    public final int hashCode() {
        return (this.LIZIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C1676390tj3 c1676390tj3 = (C1676390tj3) abstractC20055413dY;
        c1676390tj3.LLJJ = this.LIZIZ;
        c1676390tj3.LLJJI = this.LIZJ;
    }

    public final boolean equals(Object obj) {
        IntrinsicHeightElement intrinsicHeightElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntrinsicHeightElement) {
            intrinsicHeightElement = (IntrinsicHeightElement) obj;
        } else {
            intrinsicHeightElement = null;
        }
        if (intrinsicHeightElement != null && this.LIZIZ == intrinsicHeightElement.LIZIZ && this.LIZJ == intrinsicHeightElement.LIZJ) {
            return true;
        }
        return false;
    }

    public IntrinsicHeightElement(EnumC995470c0n enumC995470c0n, C1684370tvv c1684370tvv) {
        this.LIZIZ = enumC995470c0n;
        this.LIZLLL = c1684370tvv;
    }
}
