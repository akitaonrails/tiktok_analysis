package X;

import kotlin.jvm.internal.AFwS293S0000000_10;

/* JADX INFO: renamed from: X.0PZu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C647120PZu implements C0PWT {
    public final boolean LL;
    public final long LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C647120PZu)) {
            return false;
        }
        C647120PZu c647120PZu = (C647120PZu) obj;
        return this.LL == c647120PZu.LL && this.LLILLJJLI == c647120PZu.LLILLJJLI;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Y2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdatePageListDataAction(hasMore=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Jh0().LIZIZ(C13LE.LIZ(C647120PZu.class), AFwS293S0000000_10.get$arr$(100));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C647120PZu(boolean z, long j) {
        this.LL = z;
        this.LLILLJJLI = j;
    }
}
