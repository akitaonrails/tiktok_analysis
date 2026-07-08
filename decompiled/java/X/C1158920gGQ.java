package X;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gGQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158920gGQ implements InterfaceC0148002o {
    public final Set<C1224840hyk> LL;
    public final C291001Au<Boolean> LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1158920gGQ)) {
            return false;
        }
        C1158920gGQ c1158920gGQ = (C1158920gGQ) obj;
        return Intrinsics.LJFF(this.LL, c1158920gGQ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1158920gGQ.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectorSelectedListVMState(selectedContactList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", visibilityUpdateEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1158920gGQ(C291001Au c291001Au, Set set) {
        this.LL = set;
        this.LLILLJJLI = c291001Au;
    }
}
