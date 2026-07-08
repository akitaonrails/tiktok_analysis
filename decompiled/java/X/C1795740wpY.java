package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wpY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1795740wpY {
    public final String LIZ;
    public String LIZIZ;
    public final int LIZJ;
    public C19885612rG LIZLLL;

    public C1795740wpY() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1795740wpY)) {
            return false;
        }
        C1795740wpY c1795740wpY = (C1795740wpY) obj;
        return Intrinsics.LJFF(this.LIZ, c1795740wpY.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1795740wpY.LIZIZ) && this.LIZJ == c1795740wpY.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1795740wpY.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31;
        C19885612rG c19885612rG = this.LIZLLL;
        return iHashCode + (c19885612rG == null ? 0 : c19885612rG.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GPConfigInfo(sdkVersion=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", billingCountry=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", connectionState=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", connectionResult=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1795740wpY(int i) {
        this.LIZ = C1527930prb.LIZ;
        this.LIZIZ = "";
        this.LIZJ = -1;
        this.LIZLLL = null;
    }
}
