package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JIB, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JIB extends C0JIC {
    public final Throwable LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0JIB) && Intrinsics.LJFF(this.LIZ, ((C0JIB) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fail(error=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0JIB(Throwable th) {
        this.LIZ = th;
    }
}
