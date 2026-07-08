package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07bu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1897207bu {
    public final String LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1897207bu)) {
            return false;
        }
        C1897207bu c1897207bu = (C1897207bu) obj;
        return Intrinsics.LJFF(this.LIZ, c1897207bu.LIZ) && this.LIZIZ == c1897207bu.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCCreationErrorCode(errorMessage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1897207bu(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
