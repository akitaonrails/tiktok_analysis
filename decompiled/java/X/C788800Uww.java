package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Uww, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C788800Uww {
    public final Integer LIZ;
    public final int LIZIZ;
    public final Integer LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C788800Uww)) {
            return false;
        }
        C788800Uww c788800Uww = (C788800Uww) obj;
        return Intrinsics.LJFF(this.LIZ, c788800Uww.LIZ) && this.LIZIZ == c788800Uww.LIZIZ && Intrinsics.LJFF(this.LIZJ, c788800Uww.LIZJ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (((num == null ? 0 : num.hashCode()) * 31) + this.LIZIZ) * 31;
        Integer num2 = this.LIZJ;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VisualState(bgAttr=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fgAttr=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", strokeAttr=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C788800Uww(int i, Integer num, Integer num2) {
        this.LIZ = num;
        this.LIZIZ = i;
        this.LIZJ = num2;
    }
}
