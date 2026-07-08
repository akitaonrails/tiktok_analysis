package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qar, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1555990qar {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1555990qar)) {
            return false;
        }
        C1555990qar c1555990qar = (C1555990qar) obj;
        return Intrinsics.LJFF(this.LIZ, c1555990qar.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1555990qar.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendBtmInfo(productCardBtm=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", atcBtm=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1555990qar(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
