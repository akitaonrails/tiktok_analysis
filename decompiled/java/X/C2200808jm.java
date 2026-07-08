package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08jm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2200808jm extends AbstractC2201008jo {
    public final EnumC1720110urZ LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2200808jm)) {
            return false;
        }
        C2200808jm c2200808jm = (C2200808jm) obj;
        return this.LIZ == c2200808jm.LIZ && Intrinsics.LJFF(this.LIZIZ, c2200808jm.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CloseContentAction(closeType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", targetId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2200808jm(EnumC1720110urZ enumC1720110urZ, String str) {
        this.LIZ = enumC1720110urZ;
        this.LIZIZ = str;
    }
}
