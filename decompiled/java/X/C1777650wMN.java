package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wMN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777650wMN extends AbstractC1777660wMO {
    public final boolean LIZ = false;
    public final String LIZIZ = "pageDataUpdateDisabled";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777650wMN)) {
            return false;
        }
        C1777650wMN c1777650wMN = (C1777650wMN) obj;
        return this.LIZ == c1777650wMN.LIZ && Intrinsics.LJFF(this.LIZIZ, c1777650wMN.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClearAndRestore(anim=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
