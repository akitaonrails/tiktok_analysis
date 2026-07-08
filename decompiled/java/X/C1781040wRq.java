package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wRq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1781040wRq {
    public final C1785460wYy LIZ;
    public final C861890XrX LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1781040wRq)) {
            return false;
        }
        C1781040wRq c1781040wRq = (C1781040wRq) obj;
        return Intrinsics.LJFF(this.LIZ, c1781040wRq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1781040wRq.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C861890XrX c861890XrX = this.LIZIZ;
        return iHashCode + (c861890XrX == null ? 0 : c861890XrX.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MetaStageResult(state=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", pendingSwitchKey=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1781040wRq(C1785460wYy c1785460wYy, C861890XrX c861890XrX) {
        this.LIZ = c1785460wYy;
        this.LIZIZ = c861890XrX;
    }
}
