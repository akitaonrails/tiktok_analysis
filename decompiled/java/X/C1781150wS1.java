package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wS1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1781150wS1 {
    public final C1804840x4E LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final Map<String, Long> LIZLLL;
    public final Throwable LJ;

    public C1781150wS1() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1781150wS1)) {
            return false;
        }
        C1781150wS1 c1781150wS1 = (C1781150wS1) obj;
        return Intrinsics.LJFF(this.LIZ, c1781150wS1.LIZ) && this.LIZIZ == c1781150wS1.LIZIZ && this.LIZJ == c1781150wS1.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1781150wS1.LIZLLL) && Intrinsics.LJFF(this.LJ, c1781150wS1.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31;
        Throwable th = this.LJ;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FullPackageData(diamondQueryData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isHitCache=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isUseCacheFromFail=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", trackingDurationMap=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", error=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1781150wS1(C1804840x4E c1804840x4E, boolean z, boolean z2, Map map) {
        this.LIZ = c1804840x4E;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = map;
        this.LJ = null;
    }
}
