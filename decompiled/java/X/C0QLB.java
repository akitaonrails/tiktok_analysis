package X;

import kotlin.jvm.internal.AFwS293S0000000_10;

/* JADX INFO: renamed from: X.0QLB, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QLB implements C0PWT {
    public final boolean LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0QLB) && this.LL == ((C0QLB) obj).LL;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpenKeyboardWhenResumeInSugAction(openKeyboardWhenResumeInSug=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Xf0().LIZIZ(C13LE.LIZ(C0QLB.class), AFwS293S0000000_10.get$arr$(132));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C0QLB(boolean z) {
        this.LL = z;
    }
}
