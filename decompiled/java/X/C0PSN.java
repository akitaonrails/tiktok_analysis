package X;

import kotlin.jvm.internal.AFwS293S0000000_10;

/* JADX INFO: renamed from: X.0PSN, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PSN implements C0PWT {
    public final int LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0PSN) && this.LL == ((C0PSN) obj).LL;
    }

    public final int hashCode() {
        return this.LL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateLastShowingPageAction(pageIndex=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Wg1().LIZIZ(C13LE.LIZ(C0PSN.class), AFwS293S0000000_10.get$arr$(70));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C0PSN(int i) {
        this.LL = i;
    }
}
