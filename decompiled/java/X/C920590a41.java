package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a41, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C920590a41 extends C920640a46 {
    public final String LIZIZ;
    public final long LIZJ;
    public final boolean LIZLLL;
    public final List<String> LJ;

    public C920590a41() {
        this(null, 0L, false, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C920590a41)) {
            return false;
        }
        C920590a41 c920590a41 = (C920590a41) obj;
        return Intrinsics.LJFF(this.LIZIZ, c920590a41.LIZIZ) && this.LIZJ == c920590a41.LIZJ && this.LIZLLL == c920590a41.LIZLLL && Intrinsics.LJFF(this.LJ, c920590a41.LJ);
    }

    public final int hashCode() {
        return (((((this.LIZIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MHRefreshUserResult(logId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", channelId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isCrossArch=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", sourceTrace=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C920590a41(String str, long j, boolean z, int i) {
        C13BV c13bv;
        str = (i & 1) != 0 ? "" : str;
        j = (i & 2) != 0 ? 0L : j;
        z = (i & 4) != 0 ? true : z;
        if ((i & 8) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        super(c13bv);
        this.LIZIZ = str;
        this.LIZJ = j;
        this.LIZLLL = z;
        this.LJ = c13bv;
    }
}
