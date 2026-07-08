package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EdJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368950EdJ {
    public final C368280EcE LIZ;
    public final C368890EdD LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C368950EdJ)) {
            return false;
        }
        C368950EdJ c368950EdJ = (C368950EdJ) obj;
        return Intrinsics.LJFF(this.LIZ, c368950EdJ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c368950EdJ.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ItemHighlightTrack(trackLayout=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", rangeLayout=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C368950EdJ(C368280EcE c368280EcE, C368890EdD c368890EdD) {
        this.LIZ = c368280EcE;
        this.LIZIZ = c368890EdD;
    }
}
