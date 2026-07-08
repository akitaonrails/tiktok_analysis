package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1D2r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2249471D2r {
    public final C19508411Uc LIZ;
    public final C1868920yja LIZIZ;
    public final C1868920yja LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2249471D2r)) {
            return false;
        }
        C2249471D2r c2249471D2r = (C2249471D2r) obj;
        return Intrinsics.LJFF(this.LIZ, c2249471D2r.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2249471D2r.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2249471D2r.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AreaBackgroundTransition(view=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", from=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", to=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2249471D2r(C19508411Uc c19508411Uc, C1868920yja c1868920yja, C1868920yja c1868920yja2) {
        this.LIZ = c19508411Uc;
        this.LIZIZ = c1868920yja;
        this.LIZJ = c1868920yja2;
    }
}
