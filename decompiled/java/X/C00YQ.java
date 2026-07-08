package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00YQ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00YQ {
    public final C00YP LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00YQ)) {
            return false;
        }
        C00YQ c00yq = (C00YQ) obj;
        return this.LIZ == c00yq.LIZ && Intrinsics.LJFF(this.LIZIZ, c00yq.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InnerFlowHotRefreshDecision(action=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00YQ(C00YP c00yp, String str) {
        this.LIZ = c00yp;
        this.LIZIZ = str;
    }
}
