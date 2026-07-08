package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YUe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C874980YUe extends AbstractC874970YUd {
    public final String LIZ;
    public final Throwable LIZIZ;

    public C874980YUe() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C874980YUe)) {
            return false;
        }
        C874980YUe c874980YUe = (C874980YUe) obj;
        return Intrinsics.LJFF(this.LIZ, c874980YUe.LIZ) && Intrinsics.LJFF(this.LIZIZ, c874980YUe.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Throwable th = this.LIZIZ;
        return iHashCode + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unknown(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cause=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C874980YUe(String str, Throwable th) {
        this.LIZ = str;
        this.LIZIZ = th;
    }
}
