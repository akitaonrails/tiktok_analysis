package androidx.compose.ui.platform;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1678890tn5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class TestTagElement extends AbstractC1685820tyG<C1678890tn5> {
    public final String LIZIZ = "FisheyeCarousel";

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1678890tn5(this.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        ((C1678890tn5) abstractC20055413dY).LLJJ = this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestTagElement)) {
            return false;
        }
        return Intrinsics.LJFF(this.LIZIZ, ((TestTagElement) obj).LIZIZ);
    }
}
