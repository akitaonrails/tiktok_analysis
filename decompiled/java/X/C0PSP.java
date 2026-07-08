package X;

import kotlin.jvm.internal.AFwS293S0000000_10;

/* JADX INFO: renamed from: X.0PSP, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PSP implements C0PWT {
    public final int LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0PSP) && this.LL == ((C0PSP) obj).LL;
    }

    public final int hashCode() {
        return this.LL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateLastShowPageAction(pageIndex=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Wg1().LIZIZ(C13LE.LIZ(C0PSP.class), AFwS293S0000000_10.get$arr$(202));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C0PSP(int i) {
        this.LL = i;
    }
}
