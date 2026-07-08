package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UxW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C789160UxW implements InterfaceC789170UxX {
    public final Throwable LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C789160UxW) && Intrinsics.LJFF(this.LIZ, ((C789160UxW) obj).LIZ);
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

    public C789160UxW(Throwable th) {
        this.LIZ = th;
    }
}
