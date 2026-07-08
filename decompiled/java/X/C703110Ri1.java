package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ri1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703110Ri1 {
    public final C702990Rhp LIZ;
    public final C702940Rhk LIZIZ;
    public final C703070Rhx LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C703110Ri1)) {
            return false;
        }
        C703110Ri1 c703110Ri1 = (C703110Ri1) obj;
        return Intrinsics.LJFF(this.LIZ, c703110Ri1.LIZ) && Intrinsics.LJFF(this.LIZIZ, c703110Ri1.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c703110Ri1.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        C703070Rhx c703070Rhx = this.LIZJ;
        return iHashCode + (c703070Rhx == null ? 0 : c703070Rhx.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OperationStateRead(storeState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", snapshot=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", slotState=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C703110Ri1(C702990Rhp c702990Rhp, C702940Rhk c702940Rhk, C703070Rhx c703070Rhx) {
        this.LIZ = c702990Rhp;
        this.LIZIZ = c702940Rhk;
        this.LIZJ = c703070Rhx;
    }
}
