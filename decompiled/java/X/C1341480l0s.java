package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l0s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341480l0s {
    public final boolean LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1341480l0s)) {
            return false;
        }
        C1341480l0s c1341480l0s = (C1341480l0s) obj;
        return this.LIZ == c1341480l0s.LIZ && this.LIZIZ == c1341480l0s.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1341480l0s.LIZJ);
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

    public C1341480l0s(boolean z, int i, String str) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = str;
    }
}
