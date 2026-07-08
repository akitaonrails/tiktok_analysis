package X;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e4c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1074720e4c implements InterfaceC0148002o {
    public final AbstractC1623806Xk<List<InterfaceC1891350zJl>> LL;
    public final AbstractC1623806Xk<List<InterfaceC1891350zJl>> LLILLJJLI;
    public final AbstractC1623806Xk<C1074840e4o> LLILLL;
    public final Pair<List<String>, List<Integer>> LLILZ;

    public C1074720e4c() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1074720e4c)) {
            return false;
        }
        C1074720e4c c1074720e4c = (C1074720e4c) obj;
        return Intrinsics.LJFF(this.LL, c1074720e4c.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1074720e4c.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1074720e4c.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1074720e4c.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        Pair<List<String>, List<Integer>> pair = this.LLILZ;
        return iHashCode + (pair == null ? 0 : pair.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContactMaFWidgetVMState(registerListData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", unregisterListData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", contactModel=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", indexViewData=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1074720e4c(int i) {
        C491101vh c491101vh = C491101vh.LIZ;
        this(c491101vh, c491101vh, c491101vh, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1074720e4c(AbstractC1623806Xk<? extends List<? extends InterfaceC1891350zJl>> abstractC1623806Xk, AbstractC1623806Xk<? extends List<? extends InterfaceC1891350zJl>> abstractC1623806Xk2, AbstractC1623806Xk<C1074840e4o> abstractC1623806Xk3, Pair<? extends List<String>, ? extends List<Integer>> pair) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = abstractC1623806Xk2;
        this.LLILLL = abstractC1623806Xk3;
        this.LLILZ = pair;
    }

    public static C1074720e4c LIZ(C1074720e4c c1074720e4c, AbstractC1623806Xk abstractC1623806Xk, AbstractC1623806Xk abstractC1623806Xk2, AbstractC1623806Xk abstractC1623806Xk3, int i) {
        Pair<List<String>, List<Integer>> pair;
        if ((i & 1) != 0) {
            abstractC1623806Xk = c1074720e4c.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk2 = c1074720e4c.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            abstractC1623806Xk3 = c1074720e4c.LLILLL;
        }
        if ((i & 8) != 0) {
            pair = c1074720e4c.LLILZ;
        } else {
            pair = null;
        }
        c1074720e4c.getClass();
        return new C1074720e4c(abstractC1623806Xk, abstractC1623806Xk2, abstractC1623806Xk3, pair);
    }
}
