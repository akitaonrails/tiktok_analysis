package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g6X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152790g6X {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1152790g6X)) {
            return false;
        }
        C1152790g6X c1152790g6X = (C1152790g6X) obj;
        return Intrinsics.LJFF(this.LIZ, c1152790g6X.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1152790g6X.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShoppingTaskOpenRequest(shoppingTaskParams=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", lynxSchema=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1152790g6X(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
