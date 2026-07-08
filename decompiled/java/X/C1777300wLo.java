package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wLo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777300wLo extends AbstractC1777330wLr {
    public final long LIZ;
    public final C1808830xAf LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777300wLo)) {
            return false;
        }
        C1777300wLo c1777300wLo = (C1777300wLo) obj;
        return this.LIZ == c1777300wLo.LIZ && Intrinsics.LJFF(this.LIZIZ, c1777300wLo.LIZIZ);
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.LIZ) * 31;
        C1808830xAf c1808830xAf = this.LIZIZ;
        return iY2 + (c1808830xAf == null ? 0 : c1808830xAf.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReportBufferDuration(duration=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", item=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777300wLo(long j, C1808830xAf c1808830xAf) {
        this.LIZ = j;
        this.LIZIZ = c1808830xAf;
    }
}
