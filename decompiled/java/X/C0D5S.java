package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D5S, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D5S extends C0D5V {
    public final C00CP LIZ;
    public final String LIZIZ;
    public final C0D5R LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D5S)) {
            return false;
        }
        C0D5S c0d5s = (C0D5S) obj;
        return this.LIZ == c0d5s.LIZ && Intrinsics.LJFF(this.LIZIZ, c0d5s.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0d5s.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failure(reason=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", contextSnapshot=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0D5S(C00CP c00cp, String str, C0D5R c0d5r) {
        this.LIZ = c00cp;
        this.LIZIZ = str;
        this.LIZJ = c0d5r;
    }
}
