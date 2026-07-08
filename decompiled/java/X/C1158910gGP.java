package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gGP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158910gGP implements InterfaceC0148002o {
    public AbstractC1623806Xk<? extends List<? extends InterfaceC1858000yRy>> LL;
    public final C291001Au<Unit> LLILLJJLI;
    public final C291001Au<Unit> LLILLL;

    public C1158910gGP() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1158910gGP)) {
            return false;
        }
        C1158910gGP c1158910gGP = (C1158910gGP) obj;
        return Intrinsics.LJFF(this.LL, c1158910gGP.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1158910gGP.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1158910gGP.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoShareState(loadShareMessage=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", notSupportedEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", cancelSupportedEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1158910gGP(int i) {
        this(C491101vh.LIZ, new C291001Au(null), new C291001Au(null));
    }

    public C1158910gGP(AbstractC1623806Xk<? extends List<? extends InterfaceC1858000yRy>> abstractC1623806Xk, C291001Au<Unit> c291001Au, C291001Au<Unit> c291001Au2) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c291001Au2;
    }

    public static C1158910gGP LIZ(C1158910gGP c1158910gGP, AbstractC1623806Xk abstractC1623806Xk, C291001Au c291001Au, C291001Au c291001Au2, int i) {
        if ((i & 1) != 0) {
            abstractC1623806Xk = c1158910gGP.LL;
        }
        if ((i & 2) != 0) {
            c291001Au = c1158910gGP.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au2 = c1158910gGP.LLILLL;
        }
        c1158910gGP.getClass();
        return new C1158910gGP(abstractC1623806Xk, c291001Au, c291001Au2);
    }
}
