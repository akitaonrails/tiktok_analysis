package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uQv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1703590uQv {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final Map<String, Object> LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1703590uQv)) {
            return false;
        }
        C1703590uQv c1703590uQv = (C1703590uQv) obj;
        return Intrinsics.LJFF(this.LIZ, c1703590uQv.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1703590uQv.LIZIZ) && this.LIZJ == c1703590uQv.LIZJ && this.LIZLLL == c1703590uQv.LIZLLL && this.LJ == c1703590uQv.LJ && this.LJFF == c1703590uQv.LJFF && Intrinsics.LJFF(this.LJI, c1703590uQv.LJI);
    }

    public final int hashCode() {
        return (((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HeartbeatContext(clientKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", gameName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", intervalSec=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", earlyIntervalSec=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", v1Enabled=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", v2Enabled=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", categoryParams=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final long LIZ() {
        return ((long) this.LIZLLL) * 1000;
    }

    public final long LIZIZ() {
        return ((long) this.LIZJ) * 1000;
    }

    public C1703590uQv(String str, String str2, int i, int i2, boolean z, boolean z2, Map<String, ? extends Object> map) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = map;
    }
}
