package X;

import kotlin.jvm.internal.AFwS293S0000000_10;

/* JADX INFO: renamed from: X.0PCK, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PCK implements C0PWT {
    public final boolean LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0PCK) && this.LL == ((C0PCK) obj).LL;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateSearchItemIsBindFromDataUpdateAction(isBindFromDataUpdate=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().wO2().LIZIZ(C13LE.LIZ(C0PCK.class), AFwS293S0000000_10.get$arr$(89));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C0PCK(boolean z) {
        this.LL = z;
    }
}
