package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bv2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991900bv2 {
    public final int LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C991900bv2)) {
            return false;
        }
        C991900bv2 c991900bv2 = (C991900bv2) obj;
        return this.LIZ == c991900bv2.LIZ && Intrinsics.LJFF(this.LIZIZ, c991900bv2.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpenIncentivePopupResult(success=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C991900bv2(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
