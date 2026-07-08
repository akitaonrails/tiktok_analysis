package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wRr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1781050wRr {
    public final C1785460wYy LIZ;
    public final C861890XrX LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1781050wRr)) {
            return false;
        }
        C1781050wRr c1781050wRr = (C1781050wRr) obj;
        return Intrinsics.LJFF(this.LIZ, c1781050wRr.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1781050wRr.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C861890XrX c861890XrX = this.LIZIZ;
        return iHashCode + (c861890XrX == null ? 0 : c861890XrX.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TabSelectionResult(state=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", switchKey=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1781050wRr(C1785460wYy c1785460wYy, C861890XrX c861890XrX) {
        this.LIZ = c1785460wYy;
        this.LIZIZ = c861890XrX;
    }
}
