package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wLm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777280wLm extends AbstractC1777330wLr {
    public final C1808830xAf LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1777280wLm) && Intrinsics.LJFF(this.LIZ, ((C1777280wLm) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubmitQuickAutoPostItem(item=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777280wLm(C1808830xAf c1808830xAf) {
        this.LIZ = c1808830xAf;
    }
}
