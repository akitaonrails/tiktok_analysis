package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07cD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1899107cD {
    public final String LIZ;
    public final int LIZIZ = 2;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1899107cD)) {
            return false;
        }
        C1899107cD c1899107cD = (C1899107cD) obj;
        return Intrinsics.LJFF(this.LIZ, c1899107cD.LIZ) && this.LIZIZ == c1899107cD.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CacheKey(uid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", uploadFileType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1899107cD(String str) {
        this.LIZ = str;
    }
}
