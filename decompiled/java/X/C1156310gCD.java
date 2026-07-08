package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gCD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156310gCD {
    public final int LIZ;
    public final C1362500lYm LIZIZ;

    public C1156310gCD() {
        this(-1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1156310gCD)) {
            return false;
        }
        C1156310gCD c1156310gCD = (C1156310gCD) obj;
        return this.LIZ == c1156310gCD.LIZ && Intrinsics.LJFF(this.LIZIZ, c1156310gCD.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        C1362500lYm c1362500lYm = this.LIZIZ;
        return i + (c1362500lYm == null ? 0 : c1362500lYm.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinParam(index=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bulletinBoardUIInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1156310gCD(int i, C1362500lYm c1362500lYm) {
        this.LIZ = i;
        this.LIZIZ = c1362500lYm;
    }
}
