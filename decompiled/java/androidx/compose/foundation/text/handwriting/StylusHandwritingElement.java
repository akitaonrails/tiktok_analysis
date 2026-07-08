package androidx.compose.foundation.text.handwriting;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C20065513fB;
import X.C2188811AlT;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class StylusHandwritingElement extends AbstractC1685820tyG<C20065513fB> {
    public final Function0<Unit> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElement) && Intrinsics.LJFF(this.LIZIZ, ((StylusHandwritingElement) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StylusHandwritingElement(onHandwritingSlopExceeded=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C20065513fB(this.LIZIZ);
    }

    public StylusHandwritingElement(Function0<Unit> function0) {
        this.LIZIZ = function0;
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        ((C20065513fB) abstractC20055413dY).LLJJIII = this.LIZIZ;
    }
}
