package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qb4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556120qb4 extends AbstractC1556140qb6 {
    public final String LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1556120qb4)) {
            return false;
        }
        C1556120qb4 c1556120qb4 = (C1556120qb4) obj;
        return Intrinsics.LJFF(this.LIZ, c1556120qb4.LIZ) && this.LIZIZ == c1556120qb4.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpenNativeLink(link=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", webViewTitle=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1556120qb4(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
