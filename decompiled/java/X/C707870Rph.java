package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rph, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C707870Rph {
    public C707920Rpm LIZ;
    public C707920Rpm LIZIZ;

    public C707870Rph() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C707870Rph)) {
            return false;
        }
        C707870Rph c707870Rph = (C707870Rph) obj;
        return Intrinsics.LJFF(this.LIZ, c707870Rph.LIZ) && Intrinsics.LJFF(this.LIZIZ, c707870Rph.LIZIZ);
    }

    public final int hashCode() {
        C707920Rpm c707920Rpm = this.LIZ;
        int iHashCode = (c707920Rpm == null ? 0 : c707920Rpm.hashCode()) * 31;
        C707920Rpm c707920Rpm2 = this.LIZIZ;
        return iHashCode + (c707920Rpm2 != null ? c707920Rpm2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FcpTraceDisplayStageState(occupied=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", show=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C707870Rph(int i) {
        this.LIZ = null;
        this.LIZIZ = null;
    }
}
