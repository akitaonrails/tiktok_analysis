package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wQb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1780270wQb implements InterfaceC1780280wQc {
    public final InterfaceC1783650wW3 LIZ;
    public final Boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1780270wQb)) {
            return false;
        }
        C1780270wQb c1780270wQb = (C1780270wQb) obj;
        return Intrinsics.LJFF(this.LIZ, c1780270wQb.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1780270wQb.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Boolean bool = this.LIZIZ;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Play(target=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", defaultMute=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1780270wQb(InterfaceC1783650wW3 interfaceC1783650wW3, Boolean bool) {
        this.LIZ = interfaceC1783650wW3;
        this.LIZIZ = bool;
    }
}
