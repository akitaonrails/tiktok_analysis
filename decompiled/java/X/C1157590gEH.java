package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gEH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157590gEH implements InterfaceC1787320wby {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157590gEH)) {
            return false;
        }
        C1157590gEH c1157590gEH = (C1157590gEH) obj;
        return Intrinsics.LJFF(this.LIZ, c1157590gEH.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1157590gEH.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(orderId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", productId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1157590gEH(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
