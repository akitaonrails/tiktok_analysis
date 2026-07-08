package X;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZXZ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZXZ implements C0ZXL {
    public final int LIZ;
    public final C422360GhG LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZXZ)) {
            return false;
        }
        C0ZXZ c0zxz = (C0ZXZ) obj;
        return this.LIZ == c0zxz.LIZ && Intrinsics.LJFF(this.LIZIZ, c0zxz.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SolidRes(attr=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", style=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0ZXL
    public final int LIZ(Context context) {
        Integer numLIZJ = C1308910kAL.LIZJ(this.LIZ, context);
        if (numLIZJ != null) {
            return numLIZJ.intValue();
        }
        return 0;
    }

    public C0ZXZ(int i, C422360GhG c422360GhG) {
        this.LIZ = i;
        this.LIZIZ = c422360GhG;
    }
}
