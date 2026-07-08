package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tuB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683290tuB {
    public final C1693870uBF LIZ;
    public final C1693520uAg LIZIZ;

    public final int hashCode() {
        C1693870uBF c1693870uBF = this.LIZ;
        int iHashCode = (c1693870uBF != null ? c1693870uBF.hashCode() : 0) * 31;
        C1693520uAg c1693520uAg = this.LIZIZ;
        return iHashCode + (c1693520uAg != null ? c1693520uAg.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlatformTextStyle(spanStyle=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", paragraphSyle=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1683290tuB)) {
            return false;
        }
        C1683290tuB c1683290tuB = (C1683290tuB) obj;
        if (Intrinsics.LJFF(this.LIZIZ, c1683290tuB.LIZIZ) && Intrinsics.LJFF(this.LIZ, c1683290tuB.LIZ)) {
            return true;
        }
        return false;
    }

    public C1683290tuB(C1693870uBF c1693870uBF, C1693520uAg c1693520uAg) {
        this.LIZ = c1693870uBF;
        this.LIZIZ = c1693520uAg;
    }
}
