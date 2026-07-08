package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lcX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1364830lcX extends AbstractC1364920lcg {
    public final InterfaceC1369790lkX LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1364830lcX) && Intrinsics.LJFF(this.LIZ, ((C1364830lcX) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuickShareChannelData(channel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1364920lcg
    public final String LIZ() {
        return this.LIZ.label();
    }

    public C1364830lcX(InterfaceC1369790lkX interfaceC1369790lkX) {
        this.LIZ = interfaceC1369790lkX;
    }
}
