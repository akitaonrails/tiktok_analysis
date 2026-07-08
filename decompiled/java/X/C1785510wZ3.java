package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wZ3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1785510wZ3 {
    public final C1785470wYz LIZ;
    public final InterfaceC1781190wS5 LIZIZ;
    public final C1777410wLz LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1785510wZ3)) {
            return false;
        }
        C1785510wZ3 c1785510wZ3 = (C1785510wZ3) obj;
        return Intrinsics.LJFF(this.LIZ, c1785510wZ3.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1785510wZ3.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1785510wZ3.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        C1777410wLz c1777410wLz = this.LIZJ;
        return iHashCode + (c1777410wLz == null ? 0 : c1777410wLz.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FirstTabRenderState(firstTabPage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bottomBar=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bottomBarTracking=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1785510wZ3(C1785470wYz c1785470wYz, InterfaceC1781190wS5 interfaceC1781190wS5, C1777410wLz c1777410wLz) {
        this.LIZ = c1785470wYz;
        this.LIZIZ = interfaceC1781190wS5;
        this.LIZJ = c1777410wLz;
    }
}
