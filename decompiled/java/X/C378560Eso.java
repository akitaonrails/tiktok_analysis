package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Eso, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C378560Eso {
    public final Function0<Unit> LIZ;
    public final Function0<Unit> LIZIZ;
    public final Function1<C378480Esg, Unit> LIZJ;
    public final Function0<Unit> LIZLLL;
    public final InterfaceC378690Et1 LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C378560Eso)) {
            return false;
        }
        C378560Eso c378560Eso = (C378560Eso) obj;
        return Intrinsics.LJFF(this.LIZ, c378560Eso.LIZ) && Intrinsics.LJFF(this.LIZIZ, c378560Eso.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c378560Eso.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c378560Eso.LIZLLL) && Intrinsics.LJFF(this.LJ, c378560Eso.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        InterfaceC378690Et1 interfaceC378690Et1 = this.LJ;
        return iHashCode + (interfaceC378690Et1 == null ? 0 : interfaceC378690Et1.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PromptEditSceneAction(onBackClick=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onNextClick=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onPromptChange=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onDiceClick=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", mobAction=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C378560Eso(C378570Esp c378570Esp, C378580Esq c378580Esq, C378550Esn c378550Esn, C378590Esr c378590Esr, InterfaceC378690Et1 interfaceC378690Et1) {
        this.LIZ = c378570Esp;
        this.LIZIZ = c378580Esq;
        this.LIZJ = c378550Esn;
        this.LIZLLL = c378590Esr;
        this.LJ = interfaceC378690Et1;
    }
}
