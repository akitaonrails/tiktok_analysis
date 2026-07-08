package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dwp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1069890dwp implements InterfaceC0148002o {
    public final AbstractC1623806Xk<List<InterfaceC1891350zJl>> LL;
    public final List<C1261050iv9> LLILLJJLI;

    public C1069890dwp() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1069890dwp)) {
            return false;
        }
        C1069890dwp c1069890dwp = (C1069890dwp) obj;
        return Intrinsics.LJFF(this.LL, c1069890dwp.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1069890dwp.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        List<C1261050iv9> list = this.LLILLJJLI;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchFriendListState(allItems=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", userItems=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1069890dwp(int i) {
        this(C491101vh.LIZ, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1069890dwp(AbstractC1623806Xk<? extends List<? extends InterfaceC1891350zJl>> abstractC1623806Xk, List<C1261050iv9> list) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = list;
    }

    public static C1069890dwp LIZ(C1069890dwp c1069890dwp, AbstractC1623806Xk abstractC1623806Xk) {
        List<C1261050iv9> list = c1069890dwp.LLILLJJLI;
        c1069890dwp.getClass();
        return new C1069890dwp(abstractC1623806Xk, list);
    }
}
