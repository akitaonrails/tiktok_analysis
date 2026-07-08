package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D40, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D40 {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D40)) {
            return false;
        }
        C0D40 c0d40 = (C0D40) obj;
        return Intrinsics.LJFF(this.LIZ, c0d40.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0d40.LIZIZ) && this.LIZJ == c0d40.LIZJ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpVariantAppliedData(variantId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", variantPrice=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isAvailable=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0D40(String str, String str2, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
    }
}
