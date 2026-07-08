package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N6i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C588500N6i extends AbstractC588520N6k {
    public final List<InterfaceC1203630hQX> LIZ;
    public final List<InterfaceC1203630hQX> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C588500N6i)) {
            return false;
        }
        C588500N6i c588500N6i = (C588500N6i) obj;
        return Intrinsics.LJFF(this.LIZ, c588500N6i.LIZ) && Intrinsics.LJFF(this.LIZIZ, c588500N6i.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        List<InterfaceC1203630hQX> list = this.LIZIZ;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DataIntent(playableList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", exceptDataList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C588500N6i(List<? extends InterfaceC1203630hQX> list, List<? extends InterfaceC1203630hQX> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }
}
