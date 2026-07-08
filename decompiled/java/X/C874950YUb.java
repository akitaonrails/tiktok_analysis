package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YUb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C874950YUb extends AbstractC875010YUh {
    public final AbstractC874970YUd LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C874950YUb) && Intrinsics.LJFF(this.LIZ, ((C874950YUb) obj).LIZ);
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

    public C874950YUb(AbstractC874970YUd abstractC874970YUd) {
        this.LIZ = abstractC874970YUd;
    }
}
