package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02tL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C731302tL implements InterfaceC729102sz {
    public final String LIZ;

    public C731302tL() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C731302tL) && Intrinsics.LJFF(this.LIZ, ((C731302tL) obj).LIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UsCombinedSkuAddressCompState(addressId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C731302tL(int i) {
        this.LIZ = null;
    }
}
