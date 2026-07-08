package androidx.compose.ui.semantics;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C13WG;
import X.C20064613f2;
import X.C2188811AlT;
import X.InterfaceC1692460u8y;
import X.InterfaceC20057713dv;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class ClearAndSetSemanticsElement extends AbstractC1685820tyG<C20064613f2> implements InterfaceC20057713dv {
    public final Function1<InterfaceC1692460u8y, Unit> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClearAndSetSemanticsElement) && Intrinsics.LJFF(this.LIZIZ, ((ClearAndSetSemanticsElement) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClearAndSetSemanticsElement(properties=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC20057713dv
    public final C13WG LIZIZ() {
        C13WG c13wg = new C13WG();
        c13wg.LLILLL = false;
        c13wg.LLILZ = true;
        this.LIZIZ.invoke(c13wg);
        return c13wg;
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C20064613f2(this.LIZIZ, false, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClearAndSetSemanticsElement(Function1<? super InterfaceC1692460u8y, Unit> function1) {
        this.LIZIZ = function1;
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        ((C20064613f2) abstractC20055413dY).LLJJIII = this.LIZIZ;
    }
}
