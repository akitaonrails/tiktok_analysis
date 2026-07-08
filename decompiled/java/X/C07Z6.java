package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Z6, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07Z6 {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07Z6)) {
            return false;
        }
        C07Z6 c07z6 = (C07Z6) obj;
        return Intrinsics.LJFF(this.LIZ, c07z6.LIZ) && Intrinsics.LJFF(this.LIZIZ, c07z6.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisCandidate(clientKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07Z6(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
