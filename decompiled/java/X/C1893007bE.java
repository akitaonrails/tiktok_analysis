package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07bE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1893007bE {
    public final boolean LIZ;
    public final Throwable LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1893007bE)) {
            return false;
        }
        C1893007bE c1893007bE = (C1893007bE) obj;
        return this.LIZ == c1893007bE.LIZ && Intrinsics.LJFF(this.LIZIZ, c1893007bE.LIZIZ);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        Throwable th = this.LIZIZ;
        return iZ2 + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LoadMoreResult(success=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", throwable=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1893007bE(Throwable th, boolean z) {
        this.LIZ = z;
        this.LIZIZ = th;
    }
}
