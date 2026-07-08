package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KDc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C513820KDc {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C513820KDc)) {
            return false;
        }
        C513820KDc c513820KDc = (C513820KDc) obj;
        return Intrinsics.LJFF(this.LIZ, c513820KDc.LIZ) && Intrinsics.LJFF(this.LIZIZ, c513820KDc.LIZIZ);
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

    public C513820KDc(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
