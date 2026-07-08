package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yxn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C891250Yxn {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C891250Yxn)) {
            return false;
        }
        C891250Yxn c891250Yxn = (C891250Yxn) obj;
        return Intrinsics.LJFF(this.LIZ, c891250Yxn.LIZ) && Intrinsics.LJFF(this.LIZIZ, c891250Yxn.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageAlertDownloadInfo(url=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", resourceType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C891250Yxn(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
