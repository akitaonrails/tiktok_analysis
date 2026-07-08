package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gFV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158350gFV implements InterfaceC0148002o {
    public final List<InterfaceC1891350zJl> LL;
    public final InterfaceC1164480gPO LLILLJJLI;

    public C1158350gFV() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1158350gFV)) {
            return false;
        }
        C1158350gFV c1158350gFV = (C1158350gFV) obj;
        return Intrinsics.LJFF(this.LL, c1158350gFV.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1158350gFV.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        InterfaceC1164480gPO interfaceC1164480gPO = this.LLILLJJLI;
        return iHashCode + (interfaceC1164480gPO == null ? 0 : interfaceC1164480gPO.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectItemState(powerItemList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selected=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1158350gFV(int i) {
        this(new ArrayList(), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1158350gFV(List<? extends InterfaceC1891350zJl> list, InterfaceC1164480gPO interfaceC1164480gPO) {
        this.LL = list;
        this.LLILLJJLI = interfaceC1164480gPO;
    }
}
