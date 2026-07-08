package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Rk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1608206Rk {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1608206Rk)) {
            return false;
        }
        C1608206Rk c1608206Rk = (C1608206Rk) obj;
        return Intrinsics.LJFF(this.LIZ, c1608206Rk.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1608206Rk.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakGeckoResource(channel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bundle=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1608206Rk(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
