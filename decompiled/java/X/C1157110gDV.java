package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gDV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157110gDV implements InterfaceC1891350zJl {
    public final C1157350gDt LL;
    public final Exception LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157110gDV)) {
            return false;
        }
        C1157110gDV c1157110gDV = (C1157110gDV) obj;
        return Intrinsics.LJFF(this.LL, c1157110gDV.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1157110gDV.LLILLJJLI);
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
        sbLIZ.append("StatusFooterItem(status=");
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

    public C1157110gDV(C1157350gDt c1157350gDt, Exception exc) {
        this.LL = c1157350gDt;
        this.LLILLJJLI = exc;
    }
}
