package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fK6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122760fK6 {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1122760fK6)) {
            return false;
        }
        C1122760fK6 c1122760fK6 = (C1122760fK6) obj;
        return Intrinsics.LJFF(this.LIZ, c1122760fK6.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1122760fK6.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResolvedForm(baseSchema=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", skuId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1122760fK6(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
