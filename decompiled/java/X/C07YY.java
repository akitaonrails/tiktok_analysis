package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07YY, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07YY extends C07YZ {
    public final Throwable LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07YY) && Intrinsics.LJFF(this.LIZ, ((C07YY) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FAIL(throwable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07YY(Throwable th) {
        this.LIZ = th;
    }
}
