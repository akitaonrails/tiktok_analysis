package androidx.compose.foundation.layout;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1676400tj4;
import X.C1684370tvv;
import X.C1688620u2m;
import X.C786410Ut5;
import X.EnumC995470c0n;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public final class IntrinsicWidthElement extends AbstractC1685820tyG<C1676400tj4> {
    public final EnumC995470c0n LIZIZ;
    public final boolean LIZJ = true;
    public final Function1<C1688620u2m, Unit> LIZLLL;

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1676400tj4(this.LIZIZ, this.LIZJ);
    }

    public final int hashCode() {
        return (this.LIZIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C1676400tj4 c1676400tj4 = (C1676400tj4) abstractC20055413dY;
        c1676400tj4.LLJJ = this.LIZIZ;
        c1676400tj4.LLJJI = this.LIZJ;
    }

    public final boolean equals(Object obj) {
        IntrinsicWidthElement intrinsicWidthElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntrinsicWidthElement) {
            intrinsicWidthElement = (IntrinsicWidthElement) obj;
        } else {
            intrinsicWidthElement = null;
        }
        if (intrinsicWidthElement != null && this.LIZIZ == intrinsicWidthElement.LIZIZ && this.LIZJ == intrinsicWidthElement.LIZJ) {
            return true;
        }
        return false;
    }

    public IntrinsicWidthElement(EnumC995470c0n enumC995470c0n, C1684370tvv c1684370tvv) {
        this.LIZIZ = enumC995470c0n;
        this.LIZLLL = c1684370tvv;
    }
}
