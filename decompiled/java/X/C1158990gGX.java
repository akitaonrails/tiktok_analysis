package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gGX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158990gGX implements InterfaceC0148002o {
    public final boolean LL;
    public final AbstractC1623806Xk<List<C759430Tqf>> LLILLJJLI;
    public final C291001Au<String> LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1158990gGX)) {
            return false;
        }
        C1158990gGX c1158990gGX = (C1158990gGX) obj;
        return this.LL == c1158990gGX.LL && Intrinsics.LJFF(this.LLILLJJLI, c1158990gGX.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1158990gGX.LLILLL);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31;
        C291001Au<String> c291001Au = this.LLILLL;
        return iZ2 + (c291001Au == null ? 0 : c291001Au.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WalletHomeViewState(isLoading=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", cards=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", errorEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1158990gGX(C291001Au c291001Au, AbstractC1623806Xk abstractC1623806Xk, boolean z) {
        this.LL = z;
        this.LLILLJJLI = abstractC1623806Xk;
        this.LLILLL = c291001Au;
    }

    public static C1158990gGX LIZ(C1158990gGX c1158990gGX, boolean z, C1623606Xi c1623606Xi, C291001Au c291001Au, int i) {
        if ((i & 1) != 0) {
            z = c1158990gGX.LL;
        }
        AbstractC1623806Xk<List<C759430Tqf>> abstractC1623806Xk = c1623606Xi;
        if ((i & 2) != 0) {
            abstractC1623806Xk = c1158990gGX.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au = c1158990gGX.LLILLL;
        }
        c1158990gGX.getClass();
        return new C1158990gGX(c291001Au, abstractC1623806Xk, z);
    }
}
