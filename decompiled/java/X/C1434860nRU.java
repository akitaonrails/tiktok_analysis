package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nRU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1434860nRU {
    public final C1D82 LIZ;
    public final C1D82 LIZIZ;
    public final C1D82 LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1434860nRU)) {
            return false;
        }
        C1434860nRU c1434860nRU = (C1434860nRU) obj;
        return Intrinsics.LJFF(this.LIZ, c1434860nRU.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1434860nRU.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1434860nRU.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        C1D82 c1d82 = this.LIZJ;
        return iHashCode + (c1d82 == null ? 0 : c1d82.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Downstream(updateAIGCInfoForSaveLocalNode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", saveLocalNode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", originalFrameUploadNode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1434860nRU(C1D82 c1d82, C1D82 c1d822, C1D82 c1d823) {
        this.LIZ = c1d82;
        this.LIZIZ = c1d822;
        this.LIZJ = c1d823;
    }
}
