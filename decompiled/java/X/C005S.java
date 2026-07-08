package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.005S, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C005S implements InterfaceC0148002o {
    public final List<InterfaceC1891350zJl> LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C005S) && Intrinsics.LJFF(this.LL, ((C005S) obj).LL);
    }

    public final int hashCode() {
        List<InterfaceC1891350zJl> list = this.LL;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MutualRelationPopupVMState(mutualRelationList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C005S(List<? extends InterfaceC1891350zJl> list) {
        this.LL = list;
    }
}
