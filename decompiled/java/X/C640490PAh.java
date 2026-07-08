package X;

import kotlin.jvm.internal.AFwS293S0000000_10;

/* JADX INFO: renamed from: X.0PAh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C640490PAh implements C0PWT {
    public final boolean LL;
    public final long LLILLJJLI;
    public final long LLILLL;
    public final long LLILZ;

    public C640490PAh() {
        this(false, 0L, 0L, 0L, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C640490PAh)) {
            return false;
        }
        C640490PAh c640490PAh = (C640490PAh) obj;
        return this.LL == c640490PAh.LL && this.LLILLJJLI == c640490PAh.LLILLJJLI && this.LLILLL == c640490PAh.LLILLL && this.LLILZ == c640490PAh.LLILZ;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Y2(this.LLILLJJLI)) * 31) + C786410Ut5.Y2(this.LLILLL)) * 31) + C786410Ut5.Y2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VisualSearchSessionConsumptionDataAction(hasResultClick=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", videoPlayTime=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", resultPageStayDuration=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", aiCardStayDuration=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C640490PAh(boolean z, long j, long j2, long j3, int i) {
        z = (i & 1) != 0 ? false : z;
        j = (i & 2) != 0 ? 0L : j;
        j2 = (i & 4) != 0 ? 0L : j2;
        j3 = (i & 8) != 0 ? 0L : j3;
        this.LL = z;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = j3;
        C0Q3E.LJFF().Pw0().LIZIZ(C13LE.LIZ(C640490PAh.class), AFwS293S0000000_10.get$arr$(2));
    }
}
