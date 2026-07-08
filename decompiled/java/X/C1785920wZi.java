package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wZi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1785920wZi implements InterfaceC1785620wZE {
    public final C1785870wZd LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1785920wZi) && Intrinsics.LJFF(this.LIZ, ((C1785920wZi) obj).LIZ);
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

    public C1785920wZi(C1785870wZd c1785870wZd) {
        this.LIZ = c1785870wZd;
    }
}
