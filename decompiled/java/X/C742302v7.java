package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02v7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C742302v7 implements InterfaceC729102sz {
    public final String LIZ;

    public C742302v7() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C742302v7) && Intrinsics.LJFF(this.LIZ, ((C742302v7) obj).LIZ);
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
        sbLIZ.append("UsAddressCompState(addressId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C742302v7(String str) {
        this.LIZ = str;
    }
}
