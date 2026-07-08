package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lVJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1360350lVJ extends AbstractC1360390lVN {
    public final InterfaceC451150Hmb LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1360350lVJ)) {
            return false;
        }
        C1360350lVJ c1360350lVJ = (C1360350lVJ) obj;
        return Intrinsics.LJFF(this.LIZ, c1360350lVJ.LIZ) && this.LIZIZ == c1360350lVJ.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Selected(sticker=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1360350lVJ(C453740Hqm c453740Hqm, int i) {
        this.LIZ = c453740Hqm;
        this.LIZIZ = i;
    }
}
