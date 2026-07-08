package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g6v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1153030g6v {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1153030g6v)) {
            return false;
        }
        C1153030g6v c1153030g6v = (C1153030g6v) obj;
        return Intrinsics.LJFF(this.LIZ, c1153030g6v.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1153030g6v.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PostPaymentGuideImage(lightUri=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", darkUri=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1153030g6v(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
