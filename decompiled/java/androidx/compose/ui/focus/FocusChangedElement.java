package androidx.compose.ui.focus;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1679410tnv;
import X.C2188811AlT;
import X.InterfaceC1679420tnw;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class FocusChangedElement extends AbstractC1685820tyG<C1679410tnv> {
    public final Function1<InterfaceC1679420tnw, Unit> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && Intrinsics.LJFF(this.LIZIZ, ((FocusChangedElement) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FocusChangedElement(onFocusChanged=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1679410tnv(this.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FocusChangedElement(Function1<? super InterfaceC1679420tnw, Unit> function1) {
        this.LIZIZ = function1;
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        ((C1679410tnv) abstractC20055413dY).LLJJ = this.LIZIZ;
    }
}
