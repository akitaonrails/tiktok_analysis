package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04im, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1175404im implements InterfaceC1175604io {
    public final Throwable LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1175404im) && Intrinsics.LJFF(this.LIZ, ((C1175404im) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(cause=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1175404im(Throwable th) {
        this.LIZ = th;
    }
}
