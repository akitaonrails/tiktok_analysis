package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04xP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1266104xP {
    public final boolean LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1266104xP)) {
            return false;
        }
        C1266104xP c1266104xP = (C1266104xP) obj;
        return this.LIZ == c1266104xP.LIZ && Intrinsics.LJFF(this.LIZIZ, c1266104xP.LIZIZ);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        String str = this.LIZIZ;
        return iZ2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CCTCheckResult(available=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorMessage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1266104xP(boolean z, String str) {
        this.LIZ = z;
        this.LIZIZ = str;
    }
}
