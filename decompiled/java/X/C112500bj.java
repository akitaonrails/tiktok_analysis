package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00bj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C112500bj {
    public final int LIZ;
    public final String LIZIZ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C112500bj)) {
            return false;
        }
        C112500bj c112500bj = (C112500bj) obj;
        return this.LIZ == c112500bj.LIZ && Intrinsics.LJFF(this.LIZIZ, c112500bj.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PNSUserNetworkResponse(code=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C112500bj(int i) {
        this.LIZ = i;
    }
}
