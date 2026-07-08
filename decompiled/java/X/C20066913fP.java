package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13fP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20066913fP {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final boolean LJ;
    public final float LJFF;
    public final int LJI;
    public final boolean LJII;
    public final List<C1395905dF> LJIIIIZZ;
    public final long LJIIIZ;
    public final long LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20066913fP)) {
            return false;
        }
        C20066913fP c20066913fP = (C20066913fP) obj;
        return C05U1.LIZ(this.LIZ, c20066913fP.LIZ) && this.LIZIZ == c20066913fP.LIZIZ && C1378605aS.LIZJ(this.LIZJ, c20066913fP.LIZJ) && C1378605aS.LIZJ(this.LIZLLL, c20066913fP.LIZLLL) && this.LJ == c20066913fP.LJ && Float.compare(this.LJFF, c20066913fP.LJFF) == 0 && this.LJI == c20066913fP.LJI && this.LJII == c20066913fP.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c20066913fP.LJIIIIZZ) && C1378605aS.LIZJ(this.LJIIIZ, c20066913fP.LJIIIZ) && C1378605aS.LIZJ(this.LJIIJ, c20066913fP.LJIIJ);
    }

    public final int hashCode() {
        return (((((((((((((((((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + Float.floatToIntBits(this.LJFF)) * 31) + this.LJI) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + this.LJIIIIZZ.hashCode()) * 31) + C786410Ut5.Y2(this.LJIIIZ)) * 31) + C786410Ut5.Y2(this.LJIIJ);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        long j = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PointerId(value=");
        sbLIZ.append(j);
        sbLIZ.append(')');
        sb.append((Object) C2188811AlT.LIZIZ(sbLIZ));
        sb.append(", uptime=");
        sb.append(this.LIZIZ);
        sb.append(", positionOnScreen=");
        sb.append((Object) C1378605aS.LJIIIIZZ(this.LIZJ));
        sb.append(", position=");
        sb.append((Object) C1378605aS.LJIIIIZZ(this.LIZLLL));
        sb.append(", down=");
        sb.append(this.LJ);
        sb.append(", pressure=");
        sb.append(this.LJFF);
        sb.append(", type=");
        int i = this.LJI;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", activeHover=");
        sb.append(this.LJII);
        sb.append(", historical=");
        sb.append(this.LJIIIIZZ);
        sb.append(", scrollDelta=");
        sb.append((Object) C1378605aS.LJIIIIZZ(this.LJIIIZ));
        sb.append(", originalEventPosition=");
        sb.append((Object) C1378605aS.LJIIIIZZ(this.LJIIJ));
        sb.append(')');
        return sb.toString();
    }

    public C20066913fP(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List list, long j5, long j6) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
        this.LJ = z;
        this.LJFF = f;
        this.LJI = i;
        this.LJII = z2;
        this.LJIIIIZZ = list;
        this.LJIIIZ = j5;
        this.LJIIJ = j6;
    }
}
