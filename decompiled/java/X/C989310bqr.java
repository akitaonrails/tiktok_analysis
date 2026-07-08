package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bqr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C989310bqr extends AbstractC989320bqs {
    public final Throwable LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C989310bqr) && Intrinsics.LJFF(this.LIZ, ((C989310bqr) obj).LIZ);
    }

    public final int hashCode() {
        Throwable th = this.LIZ;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(error=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C989310bqr(Throwable th) {
        this.LIZ = th;
    }
}
