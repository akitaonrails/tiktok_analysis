package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gBD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155690gBD implements InterfaceC0148002o {
    public final AbstractC1200800hLy LL;

    public C1155690gBD() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1155690gBD) && Intrinsics.LJFF(this.LL, ((C1155690gBD) obj).LL);
    }

    public final int hashCode() {
        AbstractC1200800hLy abstractC1200800hLy = this.LL;
        if (abstractC1200800hLy == null) {
            return 0;
        }
        return abstractC1200800hLy.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiClaimVMState(pageState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155690gBD(AbstractC1200800hLy abstractC1200800hLy) {
        this.LL = abstractC1200800hLy;
    }
}
