package X;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0V0R, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V0R {
    public final boolean LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final boolean LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;

    public C0V0R() {
        this(false, 0, 0L, 0, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0V0R)) {
            return false;
        }
        C0V0R c0v0r = (C0V0R) obj;
        return this.LIZ == c0v0r.LIZ && this.LIZIZ == c0v0r.LIZIZ && this.LIZJ == c0v0r.LIZJ && this.LIZLLL == c0v0r.LIZLLL && this.LJ == c0v0r.LJ && this.LJFF == c0v0r.LJFF && this.LJI == c0v0r.LJI;
    }

    public final int hashCode() {
        return (((((((((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + this.LJ) * 31) + this.LJFF) * 31) + this.LJI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InitializationConfig(autoReport=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", maxCountPerDay=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", minInterval=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", h3Enabled=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", h3Distance=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", h3Resolution=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", accuracy=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0V0R(boolean z, int i, long j, int i2, int i3) {
        boolean z2;
        int i4;
        z = (i3 & 1) != 0 ? false : z;
        i = (i3 & 2) != 0 ? 0 : i;
        j = (i3 & 4) != 0 ? TimeUnit.HOURS.toMillis(24L) : j;
        if ((i3 & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i5 = (i3 & 16) == 0 ? 0 : 1;
        if ((i3 & 32) != 0) {
            i4 = 7;
        } else {
            i4 = 0;
        }
        i2 = (i3 & 64) != 0 ? 0 : i2;
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LIZLLL = z2;
        this.LJ = i5;
        this.LJFF = i4;
        this.LJI = i2;
    }
}
