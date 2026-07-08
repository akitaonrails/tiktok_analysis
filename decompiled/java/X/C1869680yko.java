package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yko, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1869680yko {
    public String LIZ;
    public String LIZIZ;
    public final long LIZJ;
    public long LIZLLL;
    public int LJ;
    public boolean LJFF;
    public String LJI;
    public String LJII;
    public Map<String, ? extends Object> LJIIIIZZ;
    public Map<String, ? extends Object> LJIIIZ;

    public C1869680yko() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1869680yko)) {
            return false;
        }
        C1869680yko c1869680yko = (C1869680yko) obj;
        return Intrinsics.LJFF(this.LIZ, c1869680yko.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1869680yko.LIZIZ) && this.LIZJ == c1869680yko.LIZJ && this.LIZLLL == c1869680yko.LIZLLL && this.LJ == c1869680yko.LJ && this.LJFF == c1869680yko.LJFF && Intrinsics.LJFF(this.LJI, c1869680yko.LJI) && Intrinsics.LJFF(this.LJII, c1869680yko.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1869680yko.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1869680yko.LJIIIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + this.LJ) * 31;
        boolean z = this.LJFF;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return ((((((((iHashCode + r0) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RunnableInfo(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", workThreadName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", startCpuTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", startWallTime=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", cpuTimeCost=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isWallDuration=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", sceneStart=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", sceneEnd=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", sceneInfoStart=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", sceneInfoEnd=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1869680yko(String str, String str2, long j, long j2, int i) {
        String str3;
        Map<String, ? extends Object> mapLJ;
        j = (i & 4) != 0 ? 0L : j;
        j2 = (i & 8) != 0 ? 0L : j2;
        if ((i & 64) != 0) {
            str3 = "";
        } else {
            str3 = null;
        }
        String str4 = (i & 128) == 0 ? null : "";
        if ((i & 256) != 0) {
            mapLJ = C2097608Jq.LJ();
        } else {
            mapLJ = null;
        }
        Map<String, ? extends Object> mapLJ2 = (i & 512) != 0 ? C2097608Jq.LJ() : null;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = 0;
        this.LJFF = false;
        this.LJI = str3;
        this.LJII = str4;
        this.LJIIIIZZ = mapLJ;
        this.LJIIIZ = mapLJ2;
    }
}
