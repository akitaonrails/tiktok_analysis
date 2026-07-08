package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fy4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1147540fy4 extends AbstractC1147530fy3 {
    public final Throwable LIZ;
    public final String LIZIZ;

    public C1147540fy4() {
        this(null, null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1147540fy4)) {
            return false;
        }
        C1147540fy4 c1147540fy4 = (C1147540fy4) obj;
        return Intrinsics.LJFF(this.LIZ, c1147540fy4.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1147540fy4.LIZIZ);
    }

    public final int hashCode() {
        Throwable th = this.LIZ;
        int iHashCode = (th == null ? 0 : th.hashCode()) * 31;
        String str = this.LIZIZ;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(throwable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1147540fy4(Throwable th, String str, int i) {
        th = (i & 1) != 0 ? null : th;
        if ((i & 2) != 0) {
            if (th != null) {
                str = th.getMessage();
            } else {
                str = null;
            }
        }
        this.LIZ = th;
        this.LIZIZ = str;
    }
}
