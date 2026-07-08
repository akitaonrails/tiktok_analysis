package androidx.compose.foundation.layout;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1682510tsv;
import X.C1688620u2m;
import X.InterfaceC1679150tnV;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class PaddingValuesElement extends AbstractC1685820tyG<C1682510tsv> {
    public final InterfaceC1679150tnV LIZIZ;
    public final Function1<C1688620u2m, Unit> LIZJ;

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1682510tsv(this.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        ((C1682510tsv) abstractC20055413dY).LLJJ = this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement;
        if ((obj instanceof PaddingValuesElement) && (paddingValuesElement = (PaddingValuesElement) obj) != null) {
            return Intrinsics.LJFF(this.LIZIZ, paddingValuesElement.LIZIZ);
        }
        return false;
    }

    public PaddingValuesElement(InterfaceC1679150tnV interfaceC1679150tnV, AwS604S0100000_25 awS604S0100000_25) {
        this.LIZIZ = interfaceC1679150tnV;
        this.LIZJ = awS604S0100000_25;
    }
}
