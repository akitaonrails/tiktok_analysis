package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KDK, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KDK {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0KDK)) {
            return false;
        }
        C0KDK c0kdk = (C0KDK) obj;
        return Intrinsics.LJFF(this.LIZ, c0kdk.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0kdk.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductSelectionHelperData(iapId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", basePlanId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0KDK(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
