package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tZX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1670490tZX implements InterfaceC1667140tU8 {
    public final C1668880tWw LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1670490tZX)) {
            return false;
        }
        C1670490tZX c1670490tZX = (C1670490tZX) obj;
        return Intrinsics.LJFF(this.LIZ, c1670490tZX.LIZ) && C1685910tyP.LJ(this.LIZIZ, c1670490tZX.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C1685910tyP.LJIIJ(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalImageVector(resource=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tint=");
        sbLIZ.append((Object) C1685910tyP.LJIIJJI(this.LIZIZ));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1670490tZX(C1668880tWw c1668880tWw, long j) {
        this.LIZ = c1668880tWw;
        this.LIZIZ = j;
    }
}
