package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gOx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1164210gOx {
    public final String LIZ;
    public final C1180620gpQ LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1164210gOx)) {
            return false;
        }
        C1164210gOx c1164210gOx = (C1164210gOx) obj;
        return Intrinsics.LJFF(this.LIZ, c1164210gOx.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1164210gOx.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlashSnapshot(snapshotId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", componentsResponse=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1164210gOx(C1180620gpQ c1180620gpQ, String str) {
        this.LIZ = str;
        this.LIZIZ = c1180620gpQ;
    }
}
