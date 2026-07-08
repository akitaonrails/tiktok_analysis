package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wZh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1785910wZh implements InterfaceC1785410wYt {
    public final C1785870wZd LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1785910wZh) && Intrinsics.LJFF(this.LIZ, ((C1785910wZh) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fallback(node=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1785910wZh(C1785870wZd c1785870wZd) {
        this.LIZ = c1785870wZd;
    }
}
