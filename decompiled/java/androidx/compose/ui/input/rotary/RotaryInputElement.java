package androidx.compose.ui.input.rotary;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C00BA;
import X.C19369810qG;
import X.C2188811AlT;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class RotaryInputElement extends AbstractC1685820tyG<C19369810qG> {
    public final Function1<C00BA, Boolean> LIZIZ;
    public final Function1<C00BA, Boolean> LIZJ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        RotaryInputElement rotaryInputElement = (RotaryInputElement) obj;
        return Intrinsics.LJFF(this.LIZIZ, rotaryInputElement.LIZIZ) && Intrinsics.LJFF(this.LIZJ, rotaryInputElement.LIZJ);
    }

    public final int hashCode() {
        Function1<C00BA, Boolean> function1 = this.LIZIZ;
        int iHashCode = (function1 == null ? 0 : function1.hashCode()) * 31;
        Function1<C00BA, Boolean> function12 = this.LIZJ;
        return iHashCode + (function12 != null ? function12.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RotaryInputElement(onRotaryScrollEvent=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onPreRotaryScrollEvent=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C19369810qG(this.LIZIZ, this.LIZJ);
    }

    public RotaryInputElement(AFwS273S0000000_29 aFwS273S0000000_29) {
        this.LIZIZ = aFwS273S0000000_29;
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C19369810qG c19369810qG = (C19369810qG) abstractC20055413dY;
        c19369810qG.LLJJ = this.LIZIZ;
        c19369810qG.LLJJI = this.LIZJ;
    }
}
