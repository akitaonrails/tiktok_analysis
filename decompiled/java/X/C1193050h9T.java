package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h9T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1193050h9T {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public C1193050h9T() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1193050h9T)) {
            return false;
        }
        C1193050h9T c1193050h9T = (C1193050h9T) obj;
        return Intrinsics.LJFF(this.LIZ, c1193050h9T.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1193050h9T.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1193050h9T.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1193050h9T.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZLLL;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaceOrderButtonInfo(iconUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", darkIconUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bgColor=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", darkBgColor=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1193050h9T(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }
}
