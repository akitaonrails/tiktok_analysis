package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gKo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1161640gKo {
    public final String LIZ = "store_raven_tab";
    public final InterfaceC1165460gQy LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1161640gKo)) {
            return false;
        }
        C1161640gKo c1161640gKo = (C1161640gKo) obj;
        return Intrinsics.LJFF(this.LIZ, c1161640gKo.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1161640gKo.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomProviderEntry(businessIdentifier=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", customProvider=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1161640gKo(C1165490gR1 c1165490gR1) {
        this.LIZIZ = c1165490gR1;
    }
}
