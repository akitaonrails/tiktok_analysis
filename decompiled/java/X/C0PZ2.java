package X;

import kotlin.jvm.internal.AFwS293S0000000_10;

/* JADX INFO: renamed from: X.0PZ2, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PZ2 implements C0PWT {
    public final boolean LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0PZ2) && this.LL == ((C0PZ2) obj).LL;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateShouldShowCenterLoadingViewAction(showCenterLoadingView=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Jh0().LIZIZ(C13LE.LIZ(C0PZ2.class), AFwS293S0000000_10.get$arr$(175));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C0PZ2(boolean z) {
        this.LL = z;
    }
}
