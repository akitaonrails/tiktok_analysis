package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YUY, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YUY extends AbstractC875020YUi {
    public final AbstractC874970YUd LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0YUY) && Intrinsics.LJFF(this.LIZ, ((C0YUY) obj).LIZ);
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

    public C0YUY(AbstractC874970YUd abstractC874970YUd) {
        this.LIZ = abstractC874970YUd;
    }
}
