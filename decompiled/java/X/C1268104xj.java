package X;

import java.util.Set;

/* JADX INFO: renamed from: X.04xj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1268104xj {
    public static final Set<Integer> LIZLLL = C13LQ.LJLIIL(new Integer[]{0, 1, 5, 10});
    public final boolean LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1268104xj)) {
            return false;
        }
        C1268104xj c1268104xj = (C1268104xj) obj;
        return this.LIZ == c1268104xj.LIZ && this.LIZIZ == c1268104xj.LIZIZ && this.LIZJ == c1268104xj.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QualificationRevokeCheckResult(inBlockIndustryCoolingDown=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", servicePlusOptInStatus=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", revokeReason=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1268104xj(boolean z, int i, int i2) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
