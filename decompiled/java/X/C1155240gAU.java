package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gAU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155240gAU implements InterfaceC111300bX {
    public final C1164550gPV LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1155240gAU) && Intrinsics.LJFF(this.LL, ((C1155240gAU) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BasicHierarchyData(qualityData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155240gAU(C1164550gPV c1164550gPV) {
        this.LL = c1164550gPV;
    }
}
