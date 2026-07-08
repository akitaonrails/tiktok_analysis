package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EOQ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EOQ {
    public final Function1<Float, Unit> LIZ;
    public final Function1<Float, Unit> LIZIZ;
    public final Function1<Float, Unit> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0EOQ)) {
            return false;
        }
        C0EOQ c0eoq = (C0EOQ) obj;
        return Intrinsics.LJFF(this.LIZ, c0eoq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0eoq.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0eoq.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdjustOpacityPanelSceneActions(updateAlpha=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", updateAlphaStop=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", applyToAll=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0EOQ(C0EOS c0eos, C0EOT c0eot, C0EOR c0eor) {
        this.LIZ = c0eos;
        this.LIZIZ = c0eot;
        this.LIZJ = c0eor;
    }
}
