package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wLk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777260wLk extends AbstractC1777330wLr {
    public final C1808830xAf LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1777260wLk) && Intrinsics.LJFF(this.LIZ, ((C1777260wLk) obj).LIZ);
    }

    public final int hashCode() {
        C1808830xAf c1808830xAf = this.LIZ;
        if (c1808830xAf == null) {
            return 0;
        }
        return c1808830xAf.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReportHighlightPostClick(item=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777260wLk(C1808830xAf c1808830xAf) {
        this.LIZ = c1808830xAf;
    }
}
