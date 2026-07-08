package X;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0K6E, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K6E {
    public final Integer LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;

    public C0K6E() {
        this(null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0K6E)) {
            return false;
        }
        C0K6E c0k6e = (C0K6E) obj;
        return Intrinsics.LJFF(this.LIZ, c0k6e.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0k6e.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0k6e.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0k6e.LIZLLL) && this.LJ == c0k6e.LJ;
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PgcApiError(errorCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", prompt=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isApiServerError=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZ() {
        String str = this.LIZJ;
        if (str != null && (!a0.LJJJIL(str))) {
            return str;
        }
        String str2 = this.LIZIZ;
        if (str2 == null || !(!a0.LJJJIL(str2))) {
            return null;
        }
        return str2;
    }

    public /* synthetic */ C0K6E(Integer num, int i) {
        this(null, (i & 1) != 0 ? null : num, null, false, null);
    }

    public C0K6E(String str, Integer num, String str2, boolean z, String str3) {
        this.LIZ = num;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = z;
    }
}
