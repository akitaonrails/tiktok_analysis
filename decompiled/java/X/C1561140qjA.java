package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qjA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1561140qjA extends AbstractC1559280qgA {
    public final String LIZLLL;
    public final long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1561140qjA)) {
            return false;
        }
        C1561140qjA c1561140qjA = (C1561140qjA) obj;
        return Intrinsics.LJFF(this.LIZLLL, c1561140qjA.LIZLLL) && this.LJ == c1561140qjA.LJ;
    }

    public final int hashCode() {
        String str = this.LIZLLL;
        return ((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Y2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ListLayoutPerformanceParams(layoutManager=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", originCost=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1561140qjA(String str, long j) {
        this.LIZLLL = str;
        this.LJ = j;
    }
}
