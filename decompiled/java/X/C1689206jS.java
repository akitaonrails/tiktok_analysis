package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06jS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1689206jS implements InterfaceC1688806jO {
    public final C912520Zr0 LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1689206jS) && Intrinsics.LJFF(this.LIZ, ((C1689206jS) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Instance(reportParams=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1688806jO
    public final C912520Zr0 LIZ() {
        return this.LIZ;
    }

    public C1689206jS(C912520Zr0 c912520Zr0) {
        this.LIZ = c912520Zr0;
    }
}
