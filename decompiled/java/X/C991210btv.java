package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0btv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991210btv extends AbstractC1003980cEW {
    public final int LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C991210btv)) {
            return false;
        }
        C991210btv c991210btv = (C991210btv) obj;
        return this.LIZ == c991210btv.LIZ && Intrinsics.LJFF(this.LIZIZ, c991210btv.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIAgentSummary(statusCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", summary=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C991210btv(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
