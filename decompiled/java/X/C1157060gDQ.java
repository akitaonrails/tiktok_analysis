package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gDQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157060gDQ implements InterfaceC1891350zJl {
    public final C1157330gDr LL;
    public final Exception LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157060gDQ)) {
            return false;
        }
        C1157060gDQ c1157060gDQ = (C1157060gDQ) obj;
        return Intrinsics.LJFF(this.LL, c1157060gDQ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1157060gDQ.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Exception exc = this.LLILLJJLI;
        return iHashCode + (exc == null ? 0 : exc.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Lemon8StatusFooterItem(status=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", e=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1157060gDQ(C1157330gDr c1157330gDr, Exception exc) {
        this.LL = c1157330gDr;
        this.LLILLJJLI = exc;
    }
}
