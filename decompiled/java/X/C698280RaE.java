package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RaE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698280RaE {
    public final String LIZ;
    public final long LIZIZ;
    public final C740102ul LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C698280RaE)) {
            return false;
        }
        C698280RaE c698280RaE = (C698280RaE) obj;
        return Intrinsics.LJFF(this.LIZ, c698280RaE.LIZ) && this.LIZIZ == c698280RaE.LIZIZ && Intrinsics.LJFF(this.LIZJ, c698280RaE.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BindRequest(awemeId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", generation=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", slotStrategyPayload=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C698280RaE(String str, long j, C740102ul c740102ul) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = c740102ul;
    }
}
