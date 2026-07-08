package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ROp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C695170ROp {
    public final int LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C695170ROp)) {
            return false;
        }
        C695170ROp c695170ROp = (C695170ROp) obj;
        return this.LIZ == c695170ROp.LIZ && Intrinsics.LJFF(this.LIZIZ, c695170ROp.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PendingVerifyItem(position=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", nickname=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C695170ROp(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
