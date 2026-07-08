package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Z5, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07Z5 {
    public final long LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07Z5)) {
            return false;
        }
        C07Z5 c07z5 = (C07Z5) obj;
        return this.LIZ == c07z5.LIZ && Intrinsics.LJFF(this.LIZIZ, c07z5.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FansClubCapsuleModel(roomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07Z5(long j, String str) {
        this.LIZ = j;
        this.LIZIZ = str;
    }
}
