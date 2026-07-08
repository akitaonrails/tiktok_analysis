package X;

import android.content.res.Configuration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r08, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1571660r08 {
    public final C0CAK LIZ;
    public final Configuration LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1571660r08)) {
            return false;
        }
        C1571660r08 c1571660r08 = (C1571660r08) obj;
        return this.LIZ == c1571660r08.LIZ && Intrinsics.LJFF(this.LIZIZ, c1571660r08.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1571660r08.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TabSnapshotContext(scene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", uiConfig=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1571660r08(C0CAK c0cak, Configuration configuration, String str) {
        this.LIZ = c0cak;
        this.LIZIZ = configuration;
        this.LIZJ = str;
    }
}
