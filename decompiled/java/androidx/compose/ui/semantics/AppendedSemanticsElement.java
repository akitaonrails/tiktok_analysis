package androidx.compose.ui.semantics;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C13WG;
import X.C20064613f2;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1692460u8y;
import X.InterfaceC20057713dv;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class AppendedSemanticsElement extends AbstractC1685820tyG<C20064613f2> implements InterfaceC20057713dv {
    public final boolean LIZIZ;
    public final Function1<InterfaceC1692460u8y, Unit> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.LIZIZ == appendedSemanticsElement.LIZIZ && Intrinsics.LJFF(this.LIZJ, appendedSemanticsElement.LIZJ);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZIZ) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AppendedSemanticsElement(mergeDescendants=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", properties=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC20057713dv
    public final C13WG LIZIZ() {
        C13WG c13wg = new C13WG();
        c13wg.LLILLL = this.LIZIZ;
        this.LIZJ.invoke(c13wg);
        return c13wg;
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C20064613f2(this.LIZJ, this.LIZIZ, false);
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C20064613f2 c20064613f2 = (C20064613f2) abstractC20055413dY;
        c20064613f2.LLJJ = this.LIZIZ;
        c20064613f2.LLJJIII = this.LIZJ;
    }

    public AppendedSemanticsElement(Function1 function1, boolean z) {
        this.LIZIZ = z;
        this.LIZJ = function1;
    }
}
