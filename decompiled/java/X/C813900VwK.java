package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VwK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C813900VwK {
    public final boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C813900VwK)) {
            return false;
        }
        C813900VwK c813900VwK = (C813900VwK) obj;
        return this.LIZ == c813900VwK.LIZ && Intrinsics.LJFF(this.LIZIZ, c813900VwK.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c813900VwK.LIZJ);
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PushClearDecision(shouldClear=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", strategyName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C813900VwK(boolean z, String str, String str2) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
