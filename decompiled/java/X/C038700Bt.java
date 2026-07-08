package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Bt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C038700Bt extends AbstractC039000Bw {
    public final C008V LIZ;
    public final Throwable LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C038700Bt)) {
            return false;
        }
        C038700Bt c038700Bt = (C038700Bt) obj;
        return this.LIZ == c038700Bt.LIZ && Intrinsics.LJFF(this.LIZIZ, c038700Bt.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Throwable th = this.LIZIZ;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(errorReason=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", exception=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C038700Bt(C008V c008v, Throwable th) {
        this.LIZ = c008v;
        this.LIZIZ = th;
    }
}
