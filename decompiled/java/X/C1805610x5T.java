package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0x5T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1805610x5T implements InterfaceC1806810x7P {
    public final InterfaceC1806470x6r LIZ;
    public final String LIZIZ;

    @Override // X.InterfaceC1806790x7N
    public final int LIZ() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1805610x5T)) {
            return false;
        }
        C1805610x5T c1805610x5T = (C1805610x5T) obj;
        return Intrinsics.LJFF(this.LIZ, c1805610x5T.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1805610x5T.LIZIZ);
    }

    @Override // X.InterfaceC1806790x7N
    public final int getStyle() {
        return 14;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RechargeLocalErrorItemData(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", buttonText=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1805610x5T(C1803940x2m c1803940x2m, String str) {
        this.LIZ = c1803940x2m;
        this.LIZIZ = str;
    }
}
