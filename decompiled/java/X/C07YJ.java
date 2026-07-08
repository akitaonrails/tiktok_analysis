package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07YJ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07YJ {
    public final boolean LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07YJ)) {
            return false;
        }
        C07YJ c07yj = (C07YJ) obj;
        return this.LIZ == c07yj.LIZ && Intrinsics.LJFF(this.LIZIZ, c07yj.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SmbPreviewDataValidity(isDataValid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07YJ(boolean z, String str) {
        this.LIZ = z;
        this.LIZIZ = str;
    }
}
