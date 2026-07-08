package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rkm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C704820Rkm {
    public final C705340Rlc LIZ;
    public final boolean LIZIZ = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C704820Rkm)) {
            return false;
        }
        C704820Rkm c704820Rkm = (C704820Rkm) obj;
        return Intrinsics.LJFF(this.LIZ, c704820Rkm.LIZ) && this.LIZIZ == c704820Rkm.LIZIZ;
    }

    public final int hashCode() {
        C705340Rlc c705340Rlc = this.LIZ;
        return ((c705340Rlc == null ? 0 : c705340Rlc.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FcpStandardActionResolutionResult(actionStore=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", overrideApplied=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C704820Rkm(C705340Rlc c705340Rlc) {
        this.LIZ = c705340Rlc;
    }
}
