package X;

import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PYh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C646730PYh implements C0PWT {
    public final int LL;
    public final C0PSG LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C646730PYh)) {
            return false;
        }
        C646730PYh c646730PYh = (C646730PYh) obj;
        return this.LL == c646730PYh.LL && Intrinsics.LJFF(this.LLILLJJLI, c646730PYh.LLILLJJLI);
    }

    public final int hashCode() {
        int i = this.LL * 31;
        C0PSG c0psg = this.LLILLJJLI;
        return i + (c0psg == null ? 0 : c0psg.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateRefreshConditionsAction(lastRefreshType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", lastFromFilterOption=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Jh0().LIZIZ(C13LE.LIZ(C646730PYh.class), AFwS293S0000000_10.get$arr$(117));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C646730PYh(int i, C0PSG c0psg) {
        this.LL = i;
        this.LLILLJJLI = c0psg;
    }
}
