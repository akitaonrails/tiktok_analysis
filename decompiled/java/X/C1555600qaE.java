package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qaE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1555600qaE extends C723430SZh {
    public final AbstractC738140SxQ LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1555600qaE) && Intrinsics.LJFF(this.LIZJ, ((C1555600qaE) obj).LIZJ);
    }

    public final int hashCode() {
        AbstractC738140SxQ abstractC738140SxQ = this.LIZJ;
        if (abstractC738140SxQ == null) {
            return 0;
        }
        return abstractC738140SxQ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BindAbilityPerformanceTrackParams(host=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1555600qaE(AbstractC738140SxQ abstractC738140SxQ) {
        this.LIZJ = abstractC738140SxQ;
    }
}
