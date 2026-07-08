package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0buR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991530buR extends AbstractC991520buQ {
    public final Throwable LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C991530buR)) {
            return false;
        }
        C991530buR c991530buR = (C991530buR) obj;
        return Intrinsics.LJFF(this.LIZ, c991530buR.LIZ) && Intrinsics.LJFF(this.LIZIZ, c991530buR.LIZIZ);
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

    public C991530buR(Throwable th, String str) {
        this.LIZ = th;
        this.LIZIZ = str;
    }
}
