package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04xE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1265004xE {
    public final boolean LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1265004xE)) {
            return false;
        }
        C1265004xE c1265004xE = (C1265004xE) obj;
        return this.LIZ == c1265004xE.LIZ && Intrinsics.LJFF(this.LIZIZ, c1265004xE.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PostPaymentBindRetainResult(success=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1265004xE(boolean z, String str) {
        this.LIZ = z;
        this.LIZIZ = str;
    }
}
