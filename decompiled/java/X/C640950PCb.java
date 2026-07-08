package X;

import kotlin.jvm.internal.AFwS293S0000000_10;

/* JADX INFO: renamed from: X.0PCb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C640950PCb implements C0PWT {
    public final int LL;

    public C640950PCb() {
        this(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C640950PCb) && this.LL == ((C640950PCb) obj).LL;
    }

    public final int hashCode() {
        return this.LL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateCurrentNativeHubPositionAction(selectedPosition=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Ph1().LIZIZ(C13LE.LIZ(C640950PCb.class), AFwS293S0000000_10.get$arr$(159));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C640950PCb(int i) {
        this.LL = i;
    }
}
