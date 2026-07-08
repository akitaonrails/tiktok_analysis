package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04wt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1262904wt {
    public final boolean LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1262904wt)) {
            return false;
        }
        C1262904wt c1262904wt = (C1262904wt) obj;
        return this.LIZ == c1262904wt.LIZ && Intrinsics.LJFF(this.LIZIZ, c1262904wt.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FansClubJoinCheckModel(joinButtonInActive=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", failToastContent=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1262904wt(boolean z, String str) {
        this.LIZ = z;
        this.LIZIZ = str;
    }
}
