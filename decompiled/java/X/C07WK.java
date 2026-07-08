package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07WK, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07WK {
    public final int LIZ;
    public final List<Long> LIZIZ;
    public final List<Long> LIZJ;

    public C07WK() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07WK)) {
            return false;
        }
        C07WK c07wk = (C07WK) obj;
        return this.LIZ == c07wk.LIZ && Intrinsics.LJFF(this.LIZIZ, c07wk.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c07wk.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CountInfo(totalCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", unreadLastUpdateTimeList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", validUnreadLastUpdateTimeList=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C07WK(int i) {
        C13BV c13bv = C13BV.INSTANCE;
        this(0, c13bv, c13bv);
    }

    public C07WK(int i, List<Long> list, List<Long> list2) {
        this.LIZ = i;
        this.LIZIZ = list;
        this.LIZJ = list2;
    }
}
