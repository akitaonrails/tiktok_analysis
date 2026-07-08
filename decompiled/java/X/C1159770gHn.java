package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gHn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1159770gHn implements C07UD {
    public final boolean LIZ;
    public final long LIZIZ;
    public final Long LIZJ;
    public final float LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1159770gHn)) {
            return false;
        }
        C1159770gHn c1159770gHn = (C1159770gHn) obj;
        return this.LIZ == c1159770gHn.LIZ && this.LIZIZ == c1159770gHn.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1159770gHn.LIZJ) && Float.compare(this.LIZLLL, c1159770gHn.LIZLLL) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Exposuring(waiting=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", visibleBeginTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", beginTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", maxRatio=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31;
        Long l = this.LIZJ;
        return ((iZ2 + (l == null ? 0 : l.hashCode())) * 31) + Float.floatToIntBits(this.LIZLLL);
    }

    public C1159770gHn(boolean z, long j, Long l, float f) {
        this.LIZ = z;
        this.LIZIZ = j;
        this.LIZJ = l;
        this.LIZLLL = f;
    }
}
