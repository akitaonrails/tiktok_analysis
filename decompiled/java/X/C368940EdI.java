package X;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EdI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368940EdI {
    public final C368400EcQ LIZ;
    public final Pair<Long, Long> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C368940EdI)) {
            return false;
        }
        C368940EdI c368940EdI = (C368940EdI) obj;
        return Intrinsics.LJFF(this.LIZ, c368940EdI.LIZ) && Intrinsics.LJFF(this.LIZIZ, c368940EdI.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TrackCheckBoxInfo(trackCheckBox=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", checkRange=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C368940EdI(C368400EcQ c368400EcQ, Pair<Long, Long> pair) {
        this.LIZ = c368400EcQ;
        this.LIZIZ = pair;
    }
}
