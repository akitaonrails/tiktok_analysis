package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DZR, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DZR implements C0DZV {
    public final Throwable LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0DZR) && Intrinsics.LJFF(this.LIZ, ((C0DZR) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failure(error=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DZR(Throwable th) {
        this.LIZ = th;
    }
}
