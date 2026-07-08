package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07cF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1899307cF {
    public final long LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1899307cF)) {
            return false;
        }
        C1899307cF c1899307cF = (C1899307cF) obj;
        return this.LIZ == c1899307cF.LIZ && Intrinsics.LJFF(this.LIZIZ, c1899307cF.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CachedTypingRecommendation(expiryMs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", response=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1899307cF(long j, String str) {
        this.LIZ = j;
        this.LIZIZ = str;
    }
}
