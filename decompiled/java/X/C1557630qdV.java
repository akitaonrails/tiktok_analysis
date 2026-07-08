package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qdV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1557630qdV implements InterfaceC1557650qdX {
    public final InterfaceC1557660qdY LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1557630qdV) && Intrinsics.LJFF(this.LIZ, ((C1557630qdV) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Recompute(cause=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1557630qdV() {
        this(new InterfaceC1557660qdY() { // from class: X.0qdW
        });
    }

    public C1557630qdV(InterfaceC1557660qdY interfaceC1557660qdY) {
        this.LIZ = interfaceC1557660qdY;
    }
}
