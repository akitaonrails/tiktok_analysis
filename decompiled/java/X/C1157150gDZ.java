package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gDZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157150gDZ implements InterfaceC0148002o {
    public final List<C1157140gDY> LL;
    public final C1157140gDY LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157150gDZ)) {
            return false;
        }
        C1157150gDZ c1157150gDZ = (C1157150gDZ) obj;
        return Intrinsics.LJFF(this.LL, c1157150gDZ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1157150gDZ.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C1157140gDY c1157140gDY = this.LLILLJJLI;
        return iHashCode + (c1157140gDY == null ? 0 : c1157140gDY.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMWhoCanJoinVMState(list=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selectedItem=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1157150gDZ(C1157140gDY c1157140gDY, List list) {
        this.LL = list;
        this.LLILLJJLI = c1157140gDY;
    }
}
