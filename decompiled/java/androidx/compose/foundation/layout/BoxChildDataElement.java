package androidx.compose.foundation.layout;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1676430tj7;
import X.C1684370tvv;
import X.C1688620u2m;
import X.C786410Ut5;
import X.InterfaceC1668050tVb;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class BoxChildDataElement extends AbstractC1685820tyG<C1676430tj7> {
    public final InterfaceC1668050tVb LIZIZ;
    public final boolean LIZJ;
    public final Function1<C1688620u2m, Unit> LIZLLL;

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1676430tj7(this.LIZIZ, this.LIZJ);
    }

    public final int hashCode() {
        return (this.LIZIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C1676430tj7 c1676430tj7 = (C1676430tj7) abstractC20055413dY;
        c1676430tj7.LLJJ = this.LIZIZ;
        c1676430tj7.LLJJI = this.LIZJ;
    }

    public final boolean equals(Object obj) {
        BoxChildDataElement boxChildDataElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof BoxChildDataElement) {
            boxChildDataElement = (BoxChildDataElement) obj;
        } else {
            boxChildDataElement = null;
        }
        if (boxChildDataElement != null && Intrinsics.LJFF(this.LIZIZ, boxChildDataElement.LIZIZ) && this.LIZJ == boxChildDataElement.LIZJ) {
            return true;
        }
        return false;
    }

    public BoxChildDataElement(InterfaceC1668050tVb interfaceC1668050tVb, boolean z, C1684370tvv c1684370tvv) {
        this.LIZIZ = interfaceC1668050tVb;
        this.LIZJ = z;
        this.LIZLLL = c1684370tvv;
    }
}
