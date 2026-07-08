package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rv7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1606990rv7 implements InterfaceC1609010ryN {
    public final AbstractC1606980rv6 LIZ;
    public final EnumC1608710rxt LIZIZ = EnumC1608710rxt.OVERLAY;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1606990rv7) && Intrinsics.LJFF(this.LIZ, ((C1606990rv7) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvatarOverlayConfig(nodeState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1609010ryN
    public final AbstractC1606980rv6 LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1609010ryN
    public final EnumC1608710rxt getNodeType() {
        return this.LIZIZ;
    }

    public C1606990rv7(AbstractC1606980rv6 abstractC1606980rv6) {
        this.LIZ = abstractC1606980rv6;
    }
}
