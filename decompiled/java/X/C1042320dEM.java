package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dEM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1042320dEM {
    public final C1042120dE2 LIZ;
    public long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1042320dEM)) {
            return false;
        }
        C1042320dEM c1042320dEM = (C1042320dEM) obj;
        return Intrinsics.LJFF(this.LIZ, c1042320dEM.LIZ) && this.LIZIZ == c1042320dEM.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CacheItem(rule=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", accessTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1042320dEM(C1042120dE2 c1042120dE2, long j) {
        this.LIZ = c1042120dE2;
        this.LIZIZ = j;
    }
}
