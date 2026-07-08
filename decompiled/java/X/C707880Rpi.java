package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rpi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C707880Rpi {
    public C707920Rpm LIZ;

    public C707880Rpi() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C707880Rpi) && Intrinsics.LJFF(this.LIZ, ((C707880Rpi) obj).LIZ);
    }

    public final int hashCode() {
        C707920Rpm c707920Rpm = this.LIZ;
        if (c707920Rpm == null) {
            return 0;
        }
        return c707920Rpm.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FcpTraceDecisionStageState(decision=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C707880Rpi(int i) {
        this.LIZ = null;
    }
}
