package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gmC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1178620gmC implements InterfaceC0148002o {
    public final AbstractC1623806Xk<C1178590gm9> LL;
    public final AbstractC1623806Xk<C1177960gl8> LLILLJJLI;
    public final boolean LLILLL;

    public C1178620gmC() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1178620gmC)) {
            return false;
        }
        C1178620gmC c1178620gmC = (C1178620gmC) obj;
        return Intrinsics.LJFF(this.LL, c1178620gmC.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1178620gmC.LLILLJJLI) && this.LLILLL == c1178620gmC.LLILLL;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PositionSelectionState(response=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", latLonResponse=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isAutoRefresh=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1178620gmC(int i) {
        C491101vh c491101vh = C491101vh.LIZ;
        this(c491101vh, c491101vh, false);
    }

    public C1178620gmC(AbstractC1623806Xk<C1178590gm9> abstractC1623806Xk, AbstractC1623806Xk<C1177960gl8> abstractC1623806Xk2, boolean z) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = abstractC1623806Xk2;
        this.LLILLL = z;
    }

    public static C1178620gmC LIZ(C1178620gmC c1178620gmC, AbstractC1623806Xk abstractC1623806Xk, AbstractC1623806Xk abstractC1623806Xk2, boolean z, int i) {
        if ((i & 1) != 0) {
            abstractC1623806Xk = c1178620gmC.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk2 = c1178620gmC.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z = c1178620gmC.LLILLL;
        }
        c1178620gmC.getClass();
        return new C1178620gmC(abstractC1623806Xk, abstractC1623806Xk2, z);
    }
}
