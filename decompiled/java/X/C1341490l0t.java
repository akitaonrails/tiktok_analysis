package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l0t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341490l0t {
    public final boolean LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1341490l0t)) {
            return false;
        }
        C1341490l0t c1341490l0t = (C1341490l0t) obj;
        return this.LIZ == c1341490l0t.LIZ && this.LIZIZ == c1341490l0t.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1341490l0t.LIZJ);
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VolumeChangeState(isTurnUp=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", currentVolume=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", playId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1341490l0t(boolean z, int i, String str) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = str;
    }
}
