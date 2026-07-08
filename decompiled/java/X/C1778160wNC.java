package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wNC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1778160wNC {
    public C1847770yBT LIZ;
    public C1847770yBT LIZIZ;

    public C1778160wNC() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1778160wNC)) {
            return false;
        }
        C1778160wNC c1778160wNC = (C1778160wNC) obj;
        return Intrinsics.LJFF(this.LIZ, c1778160wNC.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1778160wNC.LIZIZ);
    }

    public final int hashCode() {
        C1847770yBT c1847770yBT = this.LIZ;
        int iHashCode = (c1847770yBT == null ? 0 : c1847770yBT.hashCode()) * 31;
        C1847770yBT c1847770yBT2 = this.LIZIZ;
        return iHashCode + (c1847770yBT2 != null ? c1847770yBT2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VTreeDiff(newTreeNode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", oldTreeNode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1778160wNC(int i) {
        this.LIZ = null;
        this.LIZIZ = null;
    }
}
