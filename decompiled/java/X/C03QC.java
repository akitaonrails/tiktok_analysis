package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03QC, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03QC extends C03QB {
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C03QC)) {
            return false;
        }
        C03QC c03qc = (C03QC) obj;
        return Intrinsics.LJFF(this.LIZIZ, c03qc.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c03qc.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZIZ.hashCode() * 31;
        String str = this.LIZJ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnchorState(anchorPmId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", tenure=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C03QC(String str, String str2) {
        super("anchor_state");
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
