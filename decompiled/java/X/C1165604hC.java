package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04hC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1165604hC {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1165604hC) && Intrinsics.LJFF(this.LIZ, ((C1165604hC) obj).LIZ);
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
        sbLIZ.append("SelectPaymentMethodItem(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1165604hC(String str) {
        this.LIZ = str;
    }
}
