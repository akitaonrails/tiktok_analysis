package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Wu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1877007Wu {
    public final String LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1877007Wu)) {
            return false;
        }
        C1877007Wu c1877007Wu = (C1877007Wu) obj;
        return Intrinsics.LJFF(this.LIZ, c1877007Wu.LIZ) && this.LIZIZ == c1877007Wu.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Entry(tosKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", ts=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1877007Wu(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LIZ = str;
        this.LIZIZ = jCurrentTimeMillis;
    }
}
