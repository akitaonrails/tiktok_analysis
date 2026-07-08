package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rpn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C707930Rpn {
    public C707920Rpm LIZ;
    public C707920Rpm LIZIZ;
    public C707920Rpm LIZJ;
    public C707920Rpm LIZLLL;

    public C707930Rpn() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C707930Rpn)) {
            return false;
        }
        C707930Rpn c707930Rpn = (C707930Rpn) obj;
        return Intrinsics.LJFF(this.LIZ, c707930Rpn.LIZ) && Intrinsics.LJFF(this.LIZIZ, c707930Rpn.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c707930Rpn.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c707930Rpn.LIZLLL);
    }

    public final int hashCode() {
        C707920Rpm c707920Rpm = this.LIZ;
        int iHashCode = (c707920Rpm == null ? 0 : c707920Rpm.hashCode()) * 31;
        C707920Rpm c707920Rpm2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (c707920Rpm2 == null ? 0 : c707920Rpm2.hashCode())) * 31;
        C707920Rpm c707920Rpm3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (c707920Rpm3 == null ? 0 : c707920Rpm3.hashCode())) * 31;
        C707920Rpm c707920Rpm4 = this.LIZLLL;
        return iHashCode3 + (c707920Rpm4 != null ? c707920Rpm4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FcpTracePrepStageState(active=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", signal=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", density=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", enable=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C707930Rpn(int i) {
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
    }
}
