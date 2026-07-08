package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c13, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C995630c13 implements InterfaceC0148002o {
    public final C291001Au<Boolean> LL;
    public final C291001Au<Boolean> LLILLJJLI;

    public C995630c13() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C995630c13)) {
            return false;
        }
        C995630c13 c995630c13 = (C995630c13) obj;
        return Intrinsics.LJFF(this.LL, c995630c13.LL) && Intrinsics.LJFF(this.LLILLJJLI, c995630c13.LLILLJJLI);
    }

    public final int hashCode() {
        C291001Au<Boolean> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<Boolean> c291001Au2 = this.LLILLJJLI;
        return iHashCode + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecUserAfterAuthPopupState(showPopup=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isAuthSyncSuccess=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C995630c13(C291001Au<Boolean> c291001Au, C291001Au<Boolean> c291001Au2) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
    }
}
