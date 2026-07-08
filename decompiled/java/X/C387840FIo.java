package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FIo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C387840FIo extends AbstractC387850FIp {
    public final String LIZ;
    public final int LIZIZ;
    public final Exception LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C387840FIo() {
        this((String) null, (Exception) (0 == true ? 1 : 0), 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C387840FIo)) {
            return false;
        }
        C387840FIo c387840FIo = (C387840FIo) obj;
        return Intrinsics.LJFF(this.LIZ, c387840FIo.LIZ) && this.LIZIZ == c387840FIo.LIZIZ && Intrinsics.LJFF(this.LIZJ, c387840FIo.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31;
        Exception exc = this.LIZJ;
        return iHashCode + (exc == null ? 0 : exc.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failure(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", exception=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C387840FIo(String str, Exception exc, int i) {
        int i2;
        str = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        this(str, i2, (i & 4) != 0 ? null : exc);
    }

    public C387840FIo(String str, int i, Exception exc) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = exc;
    }
}
