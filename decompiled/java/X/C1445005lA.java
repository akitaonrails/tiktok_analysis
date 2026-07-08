package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05lA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1445005lA {
    public final String LIZ;
    public final InterfaceC1444205l2 LIZIZ;
    public final Map<String, InterfaceC1444205l2> LIZJ;

    public C1445005lA() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1445005lA)) {
            return false;
        }
        C1445005lA c1445005lA = (C1445005lA) obj;
        return Intrinsics.LJFF(this.LIZ, c1445005lA.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1445005lA.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1445005lA.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        InterfaceC1444205l2 interfaceC1444205l2 = this.LIZIZ;
        return ((iHashCode + (interfaceC1444205l2 == null ? 0 : interfaceC1444205l2.hashCode())) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FcpPolicyState(rootKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", rootNode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", nodeMap=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1445005lA(String str, int i) {
        Map mapLJ;
        str = (i & 1) != 0 ? "" : str;
        if ((i & 4) != 0) {
            mapLJ = C2097608Jq.LJ();
        } else {
            mapLJ = null;
        }
        this(str, null, mapLJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1445005lA(String str, InterfaceC1444205l2 interfaceC1444205l2, Map<String, ? extends InterfaceC1444205l2> map) {
        this.LIZ = str;
        this.LIZIZ = interfaceC1444205l2;
        this.LIZJ = map;
    }
}
