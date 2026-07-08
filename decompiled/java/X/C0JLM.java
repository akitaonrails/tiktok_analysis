package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JLM, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JLM extends C0JLF {
    public final Throwable LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0JLM) && Intrinsics.LJFF(this.LIZ, ((C0JLM) obj).LIZ);
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

    public C0JLM(Throwable th) {
        this.LIZ = th;
    }
}
