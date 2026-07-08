package androidx.compose.ui.layout;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1696240uF4;
import X.C20059513eD;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class OnLayoutRectChangedElement extends AbstractC1685820tyG<C1696240uF4> {
    public final long LIZIZ;
    public final long LIZJ;
    public final Function1<C20059513eD, Unit> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnLayoutRectChangedElement)) {
            return false;
        }
        OnLayoutRectChangedElement onLayoutRectChangedElement = (OnLayoutRectChangedElement) obj;
        return this.LIZIZ == onLayoutRectChangedElement.LIZIZ && this.LIZJ == onLayoutRectChangedElement.LIZJ && Intrinsics.LJFF(this.LIZLLL, onLayoutRectChangedElement.LIZLLL);
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LIZIZ) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnLayoutRectChangedElement(throttleMillis=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", debounceMillis=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", callback=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1696240uF4(this.LIZIZ, this.LIZJ, this.LIZLLL);
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C1696240uF4 c1696240uF4 = (C1696240uF4) abstractC20055413dY;
        c1696240uF4.LLJJ = this.LIZIZ;
        c1696240uF4.LLJJI = this.LIZJ;
        c1696240uF4.LLJJIII = this.LIZLLL;
        c1696240uF4.LLJJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnLayoutRectChangedElement(long j, long j2, Function1<? super C20059513eD, Unit> function1) {
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = function1;
    }
}
