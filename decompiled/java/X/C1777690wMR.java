package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wMR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777690wMR {
    public final C1283230jUv LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final long LIZLLL;
    public final boolean LJ = true;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777690wMR)) {
            return false;
        }
        C1777690wMR c1777690wMR = (C1777690wMR) obj;
        return Intrinsics.LJFF(this.LIZ, c1777690wMR.LIZ) && this.LIZIZ == c1777690wMR.LIZIZ && this.LIZJ == c1777690wMR.LIZJ && this.LIZLLL == c1777690wMR.LIZLLL && this.LJ == c1777690wMR.LJ && this.LJFF == c1777690wMR.LJFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = (iHashCode + r0) * 31;
        boolean z2 = this.LIZJ;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int iY2 = (((i + r02) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31;
        boolean z3 = this.LJ;
        ?? r03 = z3;
        if (z3) {
            r03 = 1;
        }
        return ((iY2 + r03) * 31) + (this.LJFF ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkMicUserStateSei(identity=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", audioMute=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", videoMute=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onlineUserState=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", winState=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", audioOccupied=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777690wMR(C1283230jUv c1283230jUv, boolean z, boolean z2, long j, boolean z3) {
        this.LIZ = c1283230jUv;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = j;
        this.LJFF = z3;
    }
}
