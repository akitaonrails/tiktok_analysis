package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00YF, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00YF {
    public final Float LIZ;
    public final Float LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;

    public C00YF() {
        this(null, null, 0, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00YF)) {
            return false;
        }
        C00YF c00yf = (C00YF) obj;
        return Intrinsics.LJFF(this.LIZ, c00yf.LIZ) && Intrinsics.LJFF(this.LIZIZ, c00yf.LIZIZ) && this.LIZJ == c00yf.LIZJ && this.LIZLLL == c00yf.LIZLLL;
    }

    public final int hashCode() {
        Float f = this.LIZ;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.LIZIZ;
        return ((((iHashCode + (f2 != null ? f2.hashCode() : 0)) * 31) + this.LIZJ) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisRevisitFloatingBallState(x=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", y=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", dismissCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", exitUntilWallTimeMillis=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00YF(Float f, Float f2, int i, long j) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = i;
        this.LIZLLL = j;
    }
}
