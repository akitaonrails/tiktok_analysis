package X;

import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LaR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C545530LaR {
    public final Lifecycle LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public C545530LaR() {
        this(null, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C545530LaR)) {
            return false;
        }
        C545530LaR c545530LaR = (C545530LaR) obj;
        return Intrinsics.LJFF(this.LIZ, c545530LaR.LIZ) && this.LIZIZ == c545530LaR.LIZIZ && this.LIZJ == c545530LaR.LIZJ;
    }

    public final int hashCode() {
        Lifecycle lifecycle = this.LIZ;
        return ((((lifecycle == null ? 0 : lifecycle.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WorkflowObserveConfig(lifecycle=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", runUntilPolling=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", cleanUpAtDestroy=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C545530LaR(Lifecycle lifecycle, boolean z, boolean z2) {
        this.LIZ = lifecycle;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
