package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D7K, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D7K extends C0D7J {
    public final Throwable LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0D7K) && Intrinsics.LJFF(this.LIZ, ((C0D7K) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failure(cause=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0D7K(Throwable th) {
        this.LIZ = th;
    }
}
