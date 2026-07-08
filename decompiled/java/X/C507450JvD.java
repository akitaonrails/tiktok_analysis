package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JvD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C507450JvD {
    public final int LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C507450JvD)) {
            return false;
        }
        C507450JvD c507450JvD = (C507450JvD) obj;
        return this.LIZ == c507450JvD.LIZ && Intrinsics.LJFF(this.LIZIZ, c507450JvD.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivilegeItemInfo(viewType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", eventName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C507450JvD(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
