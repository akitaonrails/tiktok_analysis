package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qaJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1555650qaJ extends C723430SZh {
    public final String LIZJ;
    public final Object LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1555650qaJ)) {
            return false;
        }
        C1555650qaJ c1555650qaJ = (C1555650qaJ) obj;
        return Intrinsics.LJFF(this.LIZJ, c1555650qaJ.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1555650qaJ.LIZLLL) && this.LJ == c1555650qaJ.LJ;
    }

    public final int hashCode() {
        return (((this.LIZJ.hashCode() * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VScopePerformanceParams(type=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", host=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", aimCache=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1555650qaJ(Object obj, String str, boolean z) {
        this.LIZJ = str;
        this.LIZLLL = obj;
        this.LJ = z;
    }
}
