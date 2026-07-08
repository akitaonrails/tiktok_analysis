package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uQz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1703630uQz {
    public final C1703590uQv LIZ;
    public final EnumC1704050uRf LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1703630uQz)) {
            return false;
        }
        C1703630uQz c1703630uQz = (C1703630uQz) obj;
        return Intrinsics.LJFF(this.LIZ, c1703630uQz.LIZ) && this.LIZIZ == c1703630uQz.LIZIZ && this.LIZJ == c1703630uQz.LIZJ && this.LIZLLL == c1703630uQz.LIZLLL && this.LJ == c1703630uQz.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HeartbeatTick(context=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", version=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", stayDurationMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", timeWindowSec=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isFinal=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1703630uQz(C1703590uQv c1703590uQv, EnumC1704050uRf enumC1704050uRf, long j, int i, boolean z) {
        this.LIZ = c1703590uQv;
        this.LIZIZ = enumC1704050uRf;
        this.LIZJ = j;
        this.LIZLLL = i;
        this.LJ = z;
    }
}
