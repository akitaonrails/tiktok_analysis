package X;

import kotlin.jvm.internal.AFwS293S0000000_10;

/* JADX INFO: renamed from: X.0PDA, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PDA implements C0PWT {
    public final int LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0PDA) && this.LL == ((C0PDA) obj).LL;
    }

    public final int hashCode() {
        return this.LL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateIsQuoteVideoAction(isQuoteVideo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().wO2().LIZIZ(C13LE.LIZ(C0PDA.class), AFwS293S0000000_10.get$arr$(193));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C0PDA(int i) {
        this.LL = i;
    }
}
