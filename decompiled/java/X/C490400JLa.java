package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JLa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C490400JLa extends AbstractC509020Jxk {
    public final Throwable LIZ;
    public final String LIZIZ = "Failed to fetch service plus preview";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C490400JLa)) {
            return false;
        }
        C490400JLa c490400JLa = (C490400JLa) obj;
        return Intrinsics.LJFF(this.LIZ, c490400JLa.LIZ) && Intrinsics.LJFF(this.LIZIZ, c490400JLa.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(exception=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C490400JLa(Throwable th) {
        this.LIZ = th;
    }
}
