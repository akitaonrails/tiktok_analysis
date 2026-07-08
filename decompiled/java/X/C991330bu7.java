package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bu7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991330bu7 extends AbstractC989680brS {
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public C991330bu7() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C991330bu7)) {
            return false;
        }
        C991330bu7 c991330bu7 = (C991330bu7) obj;
        return Intrinsics.LJFF(this.LIZIZ, c991330bu7.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c991330bu7.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c991330bu7.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZJ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ApiError(resultCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C991330bu7(String str, int i) {
        this((i & 1) != 0 ? null : str, null, null);
    }

    public C991330bu7(String str, String str2, String str3) {
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }
}
