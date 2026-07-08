package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CY1, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CY1 implements InterfaceC315390CXx {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public C0CY1() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0CY1)) {
            return false;
        }
        C0CY1 c0cy1 = (C0CY1) obj;
        return Intrinsics.LJFF(this.LIZ, c0cy1.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0cy1.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0cy1.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdAmazonLoginResultEvent(authorizeCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", authorizeState=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", authorizeError=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0CY1(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
