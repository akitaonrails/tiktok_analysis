package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KuO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C532420KuO implements InterfaceC532390KuL {
    public final Throwable LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C532420KuO) && Intrinsics.LJFF(this.LIZ, ((C532420KuO) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed(error=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C532420KuO(Throwable th) {
        this.LIZ = th;
    }
}
