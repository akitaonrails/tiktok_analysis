package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N10, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N10 extends AbstractC587110N0z {
    public final List<InterfaceC1203630hQX> LIZ;
    public final List<InterfaceC1203630hQX> LIZIZ;

    public C0N10() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0N10)) {
            return false;
        }
        C0N10 c0n10 = (C0N10) obj;
        return Intrinsics.LJFF(this.LIZ, c0n10.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0n10.LIZIZ);
    }

    public final int hashCode() {
        List<InterfaceC1203630hQX> list = this.LIZ;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<InterfaceC1203630hQX> list2 = this.LIZIZ;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DataState(playableList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", exceptDataList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0N10(List<? extends InterfaceC1203630hQX> list, List<? extends InterfaceC1203630hQX> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }
}
