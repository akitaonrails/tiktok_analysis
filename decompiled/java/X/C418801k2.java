package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01k2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C418801k2 {
    public final long LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C418801k2)) {
            return false;
        }
        C418801k2 c418801k2 = (C418801k2) obj;
        return this.LIZ == c418801k2.LIZ && Intrinsics.LJFF(this.LIZIZ, c418801k2.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreInviteUser(uid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", name=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C418801k2(long j, String str) {
        this.LIZ = j;
        this.LIZIZ = str;
    }
}
