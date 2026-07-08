package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wMp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777930wMp {
    public final InterfaceC1781190wS5 LIZ;
    public final C1777910wMn LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777930wMp)) {
            return false;
        }
        C1777930wMp c1777930wMp = (C1777930wMp) obj;
        return Intrinsics.LJFF(this.LIZ, c1777930wMp.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1777930wMp.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C1777910wMn c1777910wMn = this.LIZIZ;
        return iHashCode + (c1777910wMn == null ? 0 : c1777910wMn.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BottomBarReduceResult(state=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bottomBarRuntime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777930wMp(InterfaceC1781190wS5 interfaceC1781190wS5, C1777910wMn c1777910wMn) {
        this.LIZ = interfaceC1781190wS5;
        this.LIZIZ = c1777910wMn;
    }
}
