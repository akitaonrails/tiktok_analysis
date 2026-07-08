package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1557250qct {
    public final int LIZ = 70;
    public final C121400dA LIZIZ;
    public final C121400dA LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1557250qct)) {
            return false;
        }
        C1557250qct c1557250qct = (C1557250qct) obj;
        return this.LIZ == c1557250qct.LIZ && Intrinsics.LJFF(this.LIZIZ, c1557250qct.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1557250qct.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpenLiveMatchPayload(inviteType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", selfTeamUser=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", rivalTeamUser=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1557250qct(C121400dA c121400dA, C121400dA c121400dA2) {
        this.LIZIZ = c121400dA;
        this.LIZJ = c121400dA2;
    }
}
