package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gB9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155650gB9 implements InterfaceC111300bX {
    public final C1709110uZp LL;

    public C1155650gB9() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1155650gB9) && Intrinsics.LJFF(this.LL, ((C1155650gB9) obj).LL);
    }

    public final int hashCode() {
        C1709110uZp c1709110uZp = this.LL;
        if (c1709110uZp == null) {
            return 0;
        }
        return c1709110uZp.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RefundCashierHierarchyData(enterParams=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155650gB9(C1709110uZp c1709110uZp) {
        this.LL = c1709110uZp;
    }
}
