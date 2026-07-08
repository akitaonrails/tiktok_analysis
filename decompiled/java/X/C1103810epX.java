package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0epX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1103810epX extends AbstractC1103820epY {
    public final int LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1103810epX)) {
            return false;
        }
        C1103810epX c1103810epX = (C1103810epX) obj;
        return this.LIZ == c1103810epX.LIZ && Intrinsics.LJFF(this.LIZIZ, c1103810epX.LIZIZ) && this.LIZJ == c1103810epX.LIZJ;
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        return ((i + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Active(toolbarSubComponentTypeAnchor=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", dmSchema=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isDMSingleSKU=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1103810epX(int i, String str, boolean z) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = z;
    }
}
