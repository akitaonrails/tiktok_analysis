package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D7s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C334060D7s {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C334060D7s)) {
            return false;
        }
        C334060D7s c334060D7s = (C334060D7s) obj;
        return Intrinsics.LJFF(this.LIZ, c334060D7s.LIZ) && Intrinsics.LJFF(this.LIZIZ, c334060D7s.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopifyAuthContext(accessToken=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", clientIp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C334060D7s(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
