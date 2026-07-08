package X;

import kotlin.jvm.internal.AFwS293S0000000_10;

/* JADX INFO: renamed from: X.0P8G, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P8G implements C0PWT {
    public final boolean LL;

    public C0P8G() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0P8G) && this.LL == ((C0P8G) obj).LL;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchExternalStateAction(disableAutoPlayAbility=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C0P8G(boolean z) {
        this.LL = z;
        C0Q3E.LJFF().Im0().LIZIZ(C13LE.LIZ(C0P8G.class), AFwS293S0000000_10.get$arr$(80));
    }
}
