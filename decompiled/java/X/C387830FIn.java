package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FIn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C387830FIn extends AbstractC387820FIm {
    public final String LIZ;
    public final Exception LIZIZ;

    public C387830FIn() {
        this(null, null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C387830FIn)) {
            return false;
        }
        C387830FIn c387830FIn = (C387830FIn) obj;
        return Intrinsics.LJFF(this.LIZ, c387830FIn.LIZ) && Intrinsics.LJFF(this.LIZIZ, c387830FIn.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Exception exc = this.LIZIZ;
        return iHashCode + (exc != null ? exc.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failure(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", exception=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C387830FIn(String str, Exception exc, int i) {
        str = (i & 1) != 0 ? null : str;
        exc = (i & 2) != 0 ? null : exc;
        this.LIZ = str;
        this.LIZIZ = exc;
    }
}
