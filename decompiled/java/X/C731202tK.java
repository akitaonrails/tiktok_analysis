package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02tK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C731202tK implements InterfaceC729102sz {
    public final String LIZ;

    public C731202tK() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C731202tK) && Intrinsics.LJFF(this.LIZ, ((C731202tK) obj).LIZ);
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
        sbLIZ.append("SeaAddressCompState(addressId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C731202tK(int i) {
        this.LIZ = null;
    }
}
