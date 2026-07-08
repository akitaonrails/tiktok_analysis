package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gDN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157030gDN extends AbstractC1157040gDO {
    public final int LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1157030gDN) && this.LL == ((C1157030gDN) obj).LL;
    }

    public final int hashCode() {
        return this.LL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryArchiveV2ListEmptyItem(spanCount=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1157030gDN(int i) {
        this.LL = i;
    }

    @Override // X.AbstractC1157040gDO, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!C0BWX.LIZ()) {
            return Intrinsics.LJFF(interfaceC1891350zJl, this);
        }
        if ((interfaceC1891350zJl instanceof C1157030gDN) && this == interfaceC1891350zJl) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1157040gDO, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!C0BWX.LIZ()) {
            return Intrinsics.LJFF(interfaceC1891350zJl, this);
        }
        if ((interfaceC1891350zJl instanceof C1157030gDN) && this == interfaceC1891350zJl) {
            return true;
        }
        return false;
    }
}
