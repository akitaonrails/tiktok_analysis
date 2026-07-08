package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07WS, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07WS {
    public final int LIZ;
    public final List<String> LIZIZ;
    public final int LIZJ;
    public final List<String> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07WS)) {
            return false;
        }
        C07WS c07ws = (C07WS) obj;
        return this.LIZ == c07ws.LIZ && Intrinsics.LJFF(this.LIZIZ, c07ws.LIZIZ) && this.LIZJ == c07ws.LIZJ && Intrinsics.LJFF(this.LIZLLL, c07ws.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExtendedHalfShowReportInfo(tipShowCnt=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tipIdList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", tagShowCnt=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", tagIdList=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07WS(int i, int i2, List list, List list2) {
        this.LIZ = i;
        this.LIZIZ = list;
        this.LIZJ = i2;
        this.LIZLLL = list2;
    }
}
