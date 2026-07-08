package X;

import kotlin.jvm.internal.AFwS293S0000000_10;

/* JADX INFO: renamed from: X.0P97, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P97 implements C0PWT {
    public final boolean LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0P97) && this.LL == ((C0P97) obj).LL;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateAwemeNoContinuePlayAction(isNoContinuePlay=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Y30().LIZIZ(C13LE.LIZ(C0P97.class), AFwS293S0000000_10.get$arr$(87));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C0P97(boolean z) {
        this.LL = z;
    }
}
