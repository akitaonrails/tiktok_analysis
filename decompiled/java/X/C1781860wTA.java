package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wTA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1781860wTA {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1781860wTA)) {
            return false;
        }
        C1781860wTA c1781860wTA = (C1781860wTA) obj;
        return Intrinsics.LJFF(this.LIZ, c1781860wTA.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1781860wTA.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1781860wTA.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1781860wTA.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShippingOrder(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", subtitle=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", imageUrl=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1781860wTA() {
        this("", "", "", "");
    }

    public C1781860wTA(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }
}
