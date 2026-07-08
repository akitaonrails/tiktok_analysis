package androidx.compose.foundation.layout;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C115S;
import X.C115T;
import X.C1668650tWZ;
import X.C1678860tn2;
import X.C1679560toA;
import X.C1684370tvv;
import X.C1688620u2m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class AlignmentLineOffsetDpElement extends AbstractC1685820tyG<C1678860tn2> {
    public final C115T LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final Function1<C1688620u2m, Unit> LJ;

    public AlignmentLineOffsetDpElement() {
        throw null;
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1678860tn2(this.LIZIZ, this.LIZJ, this.LIZLLL);
    }

    public final int hashCode() {
        return (((this.LIZIZ.hashCode() * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL);
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C1678860tn2 c1678860tn2 = (C1678860tn2) abstractC20055413dY;
        c1678860tn2.LLJJ = this.LIZIZ;
        c1678860tn2.LLJJI = this.LIZJ;
        c1678860tn2.LLJJIII = this.LIZLLL;
    }

    public final boolean equals(Object obj) {
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AlignmentLineOffsetDpElement) {
            alignmentLineOffsetDpElement = (AlignmentLineOffsetDpElement) obj;
        } else {
            alignmentLineOffsetDpElement = null;
        }
        if (alignmentLineOffsetDpElement != null && Intrinsics.LJFF(this.LIZIZ, alignmentLineOffsetDpElement.LIZIZ) && C1668650tWZ.LIZJ(this.LIZJ, alignmentLineOffsetDpElement.LIZJ) && C1668650tWZ.LIZJ(this.LIZLLL, alignmentLineOffsetDpElement.LIZLLL)) {
            return true;
        }
        return false;
    }

    public AlignmentLineOffsetDpElement(C115S c115s, float f, float f2, C1684370tvv c1684370tvv) {
        boolean z;
        this.LIZIZ = c115s;
        this.LIZJ = f;
        this.LIZLLL = f2;
        this.LJ = c1684370tvv;
        if (f < 0.0f && !Float.isNaN(f)) {
            z = false;
        } else {
            z = true;
        }
        if (!(z & (f2 >= 0.0f || Float.isNaN(f2)))) {
            C1679560toA.LIZ("Padding from alignment line must be a non-negative number");
        }
    }
}
