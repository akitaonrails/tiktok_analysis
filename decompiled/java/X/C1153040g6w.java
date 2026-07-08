package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g6w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1153040g6w {
    public final String LIZ;
    public final C1153030g6v LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1153040g6w)) {
            return false;
        }
        C1153040g6w c1153040g6w = (C1153040g6w) obj;
        return Intrinsics.LJFF(this.LIZ, c1153040g6w.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1153040g6w.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C1153030g6v c1153030g6v = this.LIZIZ;
        return iHashCode + (c1153030g6v == null ? 0 : c1153030g6v.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PostPaymentGuideBodyRow(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", prefixIcon=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1153040g6w(String str, C1153030g6v c1153030g6v) {
        this.LIZ = str;
        this.LIZIZ = c1153030g6v;
    }
}
