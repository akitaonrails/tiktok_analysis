package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00dg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C124600dg {
    public final long LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C124600dg)) {
            return false;
        }
        C124600dg c124600dg = (C124600dg) obj;
        return this.LIZ == c124600dg.LIZ && Intrinsics.LJFF(this.LIZIZ, c124600dg.LIZIZ);
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.LIZ) * 31;
        String str = this.LIZIZ;
        return iY2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WindowIdentity(curWindowUserId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", linkMicId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C124600dg(long j, String str) {
        this.LIZ = j;
        this.LIZIZ = str;
    }
}
