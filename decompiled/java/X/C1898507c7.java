package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07c7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1898507c7 {
    public final String LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1898507c7)) {
            return false;
        }
        C1898507c7 c1898507c7 = (C1898507c7) obj;
        return Intrinsics.LJFF(this.LIZ, c1898507c7.LIZ) && this.LIZIZ == c1898507c7.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DMUploadError(errorMsg=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1898507c7(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
