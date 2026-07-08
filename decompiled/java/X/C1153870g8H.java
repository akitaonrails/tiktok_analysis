package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g8H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1153870g8H implements InterfaceC111300bX {
    public final List<InterfaceC1164480gPO> LL;

    public C1153870g8H() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1153870g8H) && Intrinsics.LJFF(this.LL, ((C1153870g8H) obj).LL);
    }

    public final int hashCode() {
        List<InterfaceC1164480gPO> list = this.LL;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectItemHierarchyData(list=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1153870g8H(List<? extends InterfaceC1164480gPO> list) {
        this.LL = list;
    }
}
