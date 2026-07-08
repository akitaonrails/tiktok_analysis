package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tuP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683430tuP implements InterfaceC1683460tuS {
    public final InterfaceC1683480tuU LIZ;
    public final List<C1683410tuN> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1683430tuP)) {
            return false;
        }
        C1683430tuP c1683430tuP = (C1683430tuP) obj;
        return Intrinsics.LJFF(this.LIZ, c1683430tuP.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1683430tuP.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Visible(customItem=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", contacts=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1683430tuP(InterfaceC1683480tuU interfaceC1683480tuU, List<C1683410tuN> list) {
        this.LIZ = interfaceC1683480tuU;
        this.LIZIZ = list;
    }
}
