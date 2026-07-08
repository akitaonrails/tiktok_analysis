package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c0r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C995510c0r extends AbstractC995520c0s {
    public final int LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C995510c0r)) {
            return false;
        }
        C995510c0r c995510c0r = (C995510c0r) obj;
        return this.LIZ == c995510c0r.LIZ && Intrinsics.LJFF(this.LIZIZ, c995510c0r.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Invalid(errorCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", description=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C995510c0r(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
