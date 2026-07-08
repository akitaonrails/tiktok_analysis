package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qdx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1557910qdx {
    public final int LIZ;
    public final InterfaceC1564810qp5 LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1557910qdx)) {
            return false;
        }
        C1557910qdx c1557910qdx = (C1557910qdx) obj;
        return this.LIZ == c1557910qdx.LIZ && Intrinsics.LJFF(this.LIZIZ, c1557910qdx.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IndexedHandle(index=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", handle=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1557910qdx(int i, InterfaceC1564810qp5 interfaceC1564810qp5) {
        this.LIZ = i;
        this.LIZIZ = interfaceC1564810qp5;
    }
}
