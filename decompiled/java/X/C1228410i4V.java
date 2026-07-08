package X;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i4V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1228410i4V {
    public final Context LIZ;
    public final long LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1228410i4V)) {
            return false;
        }
        C1228410i4V c1228410i4V = (C1228410i4V) obj;
        return Intrinsics.LJFF(this.LIZ, c1228410i4V.LIZ) && this.LIZIZ == c1228410i4V.LIZIZ && this.LIZJ == c1228410i4V.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FanGroupChooseGroupVmParam(context=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", creatorUid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", targetUserId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1228410i4V(Context context, long j, long j2) {
        this.LIZ = context;
        this.LIZIZ = j;
        this.LIZJ = j2;
    }
}
